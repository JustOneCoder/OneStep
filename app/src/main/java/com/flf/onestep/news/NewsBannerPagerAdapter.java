package com.flf.onestep.news;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

import com.flf.onestep.R;
import com.flf.onestep.widget.FixedSpeedScroller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fenglingfeng on 2018/2/1.
 */

public class NewsBannerPagerAdapter extends PagerAdapter {

    private List<View> mList;
    private Context mContext;
    private ViewPager mViewPager;

    public NewsBannerPagerAdapter(Context context, ViewPager viewPager) {
        this.mContext = context;
        this.mViewPager = viewPager;
        mList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.news);
            mList.add(imageView);
        }
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mList.get(position));
        return mList.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mList.get(position));
    }

    //控制轮播图切换速度
    public void controlViewPagerSpeed() {
        try {
            Field field = ViewPager.class.getDeclaredField("mScroller");
            field.setAccessible(true);
            FixedSpeedScroller mScroller = new FixedSpeedScroller(mContext, new AccelerateInterpolator());
            field.set(mViewPager, mScroller);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
