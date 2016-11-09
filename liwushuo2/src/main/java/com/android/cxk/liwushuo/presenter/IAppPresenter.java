package com.android.cxk.liwushuo.presenter;


import com.android.cxk.liwushuo.view.IMainView;

/**
 * Created by Administrator on 2016/11/6.
 */
public interface IAppPresenter {
    void setView(IMainView mainView);

    void querySelectBean(int offset);
}
