package com.android.cxk.liwushuo.presenter.impl;



import com.android.cxk.liwushuo.bean.SelectionHonListViewBean;
import com.android.cxk.liwushuo.model.ApiService;
import com.android.cxk.liwushuo.presenter.IAppPresenterThree;
import com.android.cxk.liwushuo.view.IMainViewThree;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/6.
 */
public class AppPresenterThree implements IAppPresenterThree {
    private ApiService apiService;
    private IMainViewThree mainView;

    public AppPresenterThree(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void setView(IMainViewThree mainView) {
        this.mainView = mainView;
    }

    @Override
    public void querySelectionHonListViewBean() {
        final List<String> listPath = new ArrayList<>();
        apiService.querySelectionHonListViewBean()
                .flatMap(new Func1<SelectionHonListViewBean, Observable<SelectionHonListViewBean.DataBean.SecondaryBannersBean>>() {
                    @Override
                    public Observable<SelectionHonListViewBean.DataBean.SecondaryBannersBean> call(SelectionHonListViewBean selectionHonListViewBean) {
                        List<SelectionHonListViewBean.DataBean.SecondaryBannersBean> items = selectionHonListViewBean.getData().getSecondary_banners();
                        return Observable.from(items);
                    }
                })
                .map(new Func1<SelectionHonListViewBean.DataBean.SecondaryBannersBean, List<String>>() {
                    @Override
                    public List<String> call(SelectionHonListViewBean.DataBean.SecondaryBannersBean secondaryBannersBean) {
                        String image_url = secondaryBannersBean.getImage_url();
                        listPath.add(image_url);
                        return listPath;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<String>>() {
                    @Override
                    public void onCompleted() {
                        mainView.refreshAdapter1(listPath);
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
