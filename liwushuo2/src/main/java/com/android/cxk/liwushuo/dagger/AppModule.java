package com.android.cxk.liwushuo.dagger;



import com.android.cxk.liwushuo.model.ApiService;
import com.android.cxk.liwushuo.presenter.IAppPresenter;
import com.android.cxk.liwushuo.presenter.IAppPresenterThree;
import com.android.cxk.liwushuo.presenter.IAppPresenterTwo;
import com.android.cxk.liwushuo.presenter.impl.AppPresenter;
import com.android.cxk.liwushuo.presenter.impl.AppPresenterThree;
import com.android.cxk.liwushuo.presenter.impl.AppPresenterTwo;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/6.
 */
@Module
public class AppModule {

    @Provides
    public OkHttpClient provideOkHttp() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();
        return okHttpClient;

    }

    @Provides
    public ApiService provideRetrofit(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.liwushuo.com/")
                .client(client) //使用自定义OkHttp客户端
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }

    @Provides
    public IAppPresenter provideAppPresenter(ApiService apiService) {
        return new AppPresenter(apiService);
    }
    @Provides
    public IAppPresenterTwo provideAppPresenterTwo(ApiService apiService) {
        return new AppPresenterTwo(apiService);
    }
    @Provides
    public IAppPresenterThree provideAppPresenterThree(ApiService apiService) {
        return new AppPresenterThree(apiService);
    }
}
