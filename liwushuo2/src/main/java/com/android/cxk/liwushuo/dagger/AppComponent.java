package com.android.cxk.liwushuo.dagger;

import com.android.cxk.liwushuo.MyFragment;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/6.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MyFragment fragment);
}
