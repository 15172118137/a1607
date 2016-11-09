package com.android.cxk.liwushuo.presenter.impl;

import android.support.v4.util.ArrayMap;


import com.android.cxk.liwushuo.bean.SelectionViewPagerBean;
import com.android.cxk.liwushuo.model.ApiService;
import com.android.cxk.liwushuo.presenter.IAppPresenterTwo;
import com.android.cxk.liwushuo.view.IMainViewTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/6.
 */
public class AppPresenterTwo implements IAppPresenterTwo {
    private ApiService apiService;
    private IMainViewTwo mainView;

    public AppPresenterTwo(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void setView(IMainViewTwo mainView) {
        this.mainView = mainView;
    }

    @Override
    public void querySelectionViewPagerBean() {

        final List<String> pathList = new ArrayList<>();
        apiService.querySelectionViewPagerBean()
                .flatMap(new Func1<SelectionViewPagerBean, Observable<SelectionViewPagerBean.DataBean.BannersBean>>() {
                    @Override
                    public Observable<SelectionViewPagerBean.DataBean.BannersBean> call(SelectionViewPagerBean selectionViewPagerBean) {
                        List<SelectionViewPagerBean.DataBean.BannersBean> items = selectionViewPagerBean.getData().getBanners();
                        return Observable.from(items);
                    }
                })
                .map(new Func1<SelectionViewPagerBean.DataBean.BannersBean, List<String>>() {
            @Override
            public List<String> call(SelectionViewPagerBean.DataBean.BannersBean bannersBean) {
                String image_url = bannersBean.getImage_url();
                pathList.add(image_url);
                return pathList;
            }
        }).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<String>>() {
                    @Override
                    public void onCompleted() {
                        mainView.refreshAdapter(pathList);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<String> strings) {

                    }
                });
    }
}
