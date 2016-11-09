package com.android.cxk.liwushuo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/11/6.
 */
public class HeadViewPagerAdapter extends PagerAdapter {
    private Context context;
    private List<String> pathList;

    public HeadViewPagerAdapter(Context context, List<String> pathList) {
        this.context = context;
        this.pathList = pathList;
    }
    @Override
    public int getCount() {
        return pathList == null ? 0 : pathList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        container.addView(imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.with(context).load(pathList.get(position)).into(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
