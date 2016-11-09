package com.android.cxk.liwushuo.view;



import com.android.cxk.liwushuo.bean.SelectionBean;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/6.
 */
public interface IMainView {
    void refreshAdapter(List<String> groupList, Map<String, List<SelectionBean.DataBean.ItemsBean>> map);
}
