package com.android.cxk.liwushuo.model;



import com.android.cxk.liwushuo.bean.SelectionBean;
import com.android.cxk.liwushuo.bean.SelectionHonListViewBean;
import com.android.cxk.liwushuo.bean.SelectionViewPagerBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/6.
 */
public interface ApiService {
    @GET("v2/channels/101/items?ad=2&gender=1&generation=2&limit=20")
    Observable<SelectionBean> querySelectBean(@Query("offset") int offset);
    @GET("v2/banners")
    Observable<SelectionViewPagerBean> querySelectionViewPagerBean();
    @GET("v2/secondary_banners?gender=1&generation=1")
    Observable<SelectionHonListViewBean> querySelectionHonListViewBean();
}
