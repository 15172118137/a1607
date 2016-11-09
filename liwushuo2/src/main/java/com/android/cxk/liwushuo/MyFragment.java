package com.android.cxk.liwushuo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chenfan.gift_speak.adapter.HeadViewPagerAdapter;
import com.example.chenfan.gift_speak.adapter.MainSelectionAdapter;
import com.example.chenfan.gift_speak.bean.SelectionBean;
import com.example.chenfan.gift_speak.dagger.DaggerAppComponent;
import com.example.chenfan.gift_speak.model.ApiService;
import com.example.chenfan.gift_speak.presenter.IAppPresenter;
import com.example.chenfan.gift_speak.presenter.IAppPresenterThree;
import com.example.chenfan.gift_speak.presenter.IAppPresenterTwo;
import com.example.chenfan.gift_speak.presenter.impl.AppPresenterTwo;
import com.example.chenfan.gift_speak.view.IMainView;
import com.example.chenfan.gift_speak.view.IMainViewThree;
import com.example.chenfan.gift_speak.view.IMainViewTwo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/4.
 */
public class MyFragment extends Fragment implements IMainView,IMainViewTwo,IMainViewThree {
    private static final String TAG = "=========";
    private Context context;
    private Map<String,List<SelectionBean.DataBean.ItemsBean>> map = new ArrayMap<>();
    private List<String> dateList = new ArrayList<>();
    private List<String> pathList = new ArrayList<>();
    private List<String> listPath = new ArrayList<>();
    private MainSelectionAdapter mainSelectAdapter;
    private HeadViewPagerAdapter headViewPagerAdapter;
    private ViewPager mViewPager;
    private LinearLayout mLinear;
    @Inject
    IAppPresenter appPresenter;
    @BindView(R.id.selection_expandable_listview)
    ExpandableListView mListView;
    @Inject
    IAppPresenterTwo appPresenterTwo;
    @Inject
    IAppPresenterThree appPresenterThree;

    public static MyFragment newInstance() {
        MyFragment myFragment = new MyFragment();
        return myFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection_view,null);
        ButterKnife.bind(this,view);
        DaggerAppComponent.create().inject(this);
        View viewHead = LayoutInflater.from(getContext()).inflate(R.layout.head_view, mListView, false);
        mViewPager = (ViewPager) viewHead.findViewById(R.id.head_view_pager);
        headViewPagerAdapter = new HeadViewPagerAdapter(getContext(),pathList);
        mViewPager.setAdapter(headViewPagerAdapter);
        mLinear = (LinearLayout) viewHead.findViewById(R.id.head_linear);
        mListView.addHeaderView(viewHead);
        initAdapter();
        appPresenter.querySelectBean(0);
        appPresenter.setView(this);
        appPresenterTwo.querySelectionViewPagerBean();
        appPresenterTwo.setView(this);
        appPresenterThree.querySelectionHonListViewBean();
        appPresenterThree.setView(this);
        mListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        return view;
    }
    private void initAdapter() {
        mainSelectAdapter = new MainSelectionAdapter(getContext(),dateList,map);
        mListView.setAdapter(mainSelectAdapter);
    }

    @Override
    public void refreshAdapter(List<String> groupList, Map<String, List<SelectionBean.DataBean.ItemsBean>> map) {
        dateList.addAll(groupList);
        this.map.putAll(map);
        mainSelectAdapter.notifyDataSetChanged();
        for (int i = 0; i < mainSelectAdapter.getGroupCount(); i++) {
            mListView.expandGroup(i);
        }
    }

    @Override
    public void refreshAdapter(List<String> pathList) {
        this.pathList.addAll(pathList);
        headViewPagerAdapter.notifyDataSetChanged();
    }

    @Override
    public void refreshAdapter1(List<String> listPath) {
        Log.i(TAG, "refreshAdapter1: "+listPath.size());
        this.listPath.addAll(listPath);
        for (int i = 0; i < listPath.size(); i++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(0,0,10,0);
            Picasso.with(getContext()).load(listPath.get(i)).into(imageView);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(280, ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mLinear.addView(imageView);
        }
    }
}
