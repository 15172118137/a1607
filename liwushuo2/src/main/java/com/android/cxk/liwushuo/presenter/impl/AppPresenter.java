package com.android.cxk.liwushuo.presenter.impl;

import android.support.v4.util.ArrayMap;
import android.util.Log;

import com.android.cxk.liwushuo.bean.SelectionBean;
import com.android.cxk.liwushuo.model.ApiService;
import com.android.cxk.liwushuo.presenter.IAppPresenter;
import com.android.cxk.liwushuo.tool.Utils;
import com.android.cxk.liwushuo.view.IMainView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/6.
 */
public class AppPresenter implements IAppPresenter {
    private ApiService apiService;
    private IMainView mainView;

    public AppPresenter(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void setView(IMainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void querySelectBean(int offset) {
        final Map<String,List<SelectionBean.DataBean.ItemsBean>> map = new ArrayMap<>();
        final List<String> dateList = new ArrayList<>();
        apiService.querySelectBean(0)
                .flatMap(new Func1<SelectionBean, Observable<SelectionBean.DataBean.ItemsBean>>() {
                    @Override
                    public Observable<SelectionBean.DataBean.ItemsBean> call(SelectionBean selectBean) {
                        List<SelectionBean.DataBean.ItemsBean> items = selectBean.getData().getItems();
                        return Observable.from(items);
                    }
                })
                .map(new Func1<SelectionBean.DataBean.ItemsBean, Map<String,List<SelectionBean.DataBean.ItemsBean>>>() {
                    @Override
                    public Map<String, List<SelectionBean.DataBean.ItemsBean>> call(SelectionBean.DataBean.ItemsBean itemsBean) {
                        int publishedAt = itemsBean.getPublished_at();
                        String formatDate = Utils.formatDate(publishedAt * 1000);
                        List<SelectionBean.DataBean.ItemsBean> itemsBeen = map.get(formatDate);
                        if (itemsBeen == null) {
                            itemsBeen = new ArrayList<SelectionBean.DataBean.ItemsBean>();
                            dateList.add(formatDate);
                            map.put(formatDate,itemsBeen);
                        }
                        itemsBeen.add(itemsBean);

                        return map;
                    }
                })
                .subscribeOn(Schedulers.newThread()) //表示上方都执行在子线程中
                .observeOn(AndroidSchedulers.mainThread())//下方都执行在主线程中
                .subscribe(new Observer<Map<String, List<SelectionBean.DataBean.ItemsBean>>>() {
                    @Override
                    public void onCompleted() {
                        mainView.refreshAdapter(dateList,map);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Map<String, List<SelectionBean.DataBean.ItemsBean>> map) {

                    }
                });

    }

}
