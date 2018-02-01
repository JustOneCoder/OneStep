package com.flf.onestep.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by fenglingfeng on 2018/2/1.
 * 控制轮播图切换速度
 */

public class FixedSpeedScroller extends Scroller {
    private int mDuration = 1500;

    public FixedSpeedScroller(Context context) {
        super(context);
    }

    public FixedSpeedScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.mDuration = mDuration;
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        startScroll(startX,startY,dx,dy,mDuration);
    }

    public void setDuration(int time){
        mDuration = time;
    }

    public int getDuration(int time){
        return mDuration;
    }
}
