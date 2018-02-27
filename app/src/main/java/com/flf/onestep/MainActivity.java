package com.flf.onestep;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.flf.comm.RouterConstants;
import com.flf.onestep.base.BaseBindingActivity;
import com.flf.onestep.base.BaseBindingFragment;
import com.flf.onestep.databinding.ActivityMainBinding;
import com.flf.onestep.live.LiveFragment;
import com.flf.onestep.mine.MineFragment;
import com.flf.onestep.movie.MovieFragment;
import com.flf.onestep.news.NewsFragment;

/**
 * 作者：flf
 * 时间：2017/12/14:23:32
 * 说明：应用主Activity
 */

@Route(path = RouterConstants.MAIN)
public class MainActivity extends BaseBindingActivity<ActivityMainBinding> implements BottomNavigationBar.OnTabSelectedListener {

    private static final String tab_title[] = {"新闻", "直播", "影院", "我的"};
    private BaseBindingFragment mCurrentFragment;
    private BaseBindingFragment mNewsFragment;
    private BaseBindingFragment mLiveFragment;
    private BaseBindingFragment mMovieFragment;
    private BaseBindingFragment mMineFragment;


    @Override
    public void bindData(ActivityMainBinding binding, Bundle savedInstanceState) {
        initView();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    //初始化视图
    private void initView() {
        binding.bottomNavigation.setAutoHideEnabled(false);
        binding.bottomNavigation.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                .setMode(BottomNavigationBar.MODE_FIXED)
                .addItem(new BottomNavigationItem(R.drawable.news, tab_title[0]).setActiveColorResource(R.color.colorPrimaryDark))
                .addItem(new BottomNavigationItem(R.drawable.live, tab_title[1]).setActiveColorResource(R.color.colorPrimaryDark))
                .addItem(new BottomNavigationItem(R.drawable.movie, tab_title[2]).setActiveColorResource(R.color.colorPrimaryDark))
                .addItem(new BottomNavigationItem(R.drawable.mine, tab_title[3]).setActiveColorResource(R.color.colorPrimaryDark))
                .setFirstSelectedPosition(0)
                .setTabSelectedListener(this)
                .initialise();
        initFragment();
    }

    private void initFragment() {
        mNewsFragment = new NewsFragment();
        mLiveFragment = new LiveFragment();
        mMovieFragment = new MovieFragment();
        mMineFragment = new MineFragment();
        switchFragment(mNewsFragment);         //第一次启动,自动加载第一个Fragment
    }

    @Override
    public void onTabSelected(int position) {
        switch (position) {
            case 0:
                switchFragment(mNewsFragment);
                break;
            case 1:
                switchFragment(mLiveFragment);
                break;
            case 2:
                switchFragment(mMovieFragment);
                break;
            case 3:
                switchFragment(mMineFragment);
                break;
        }
    }

    /**
     * return 切换Fragment
     * description 动态创建Fragment  不会重复创建Fragment
     * params 将要加载的fragment
     */

    private void switchFragment(BaseBindingFragment toFragment) {
        FragmentManager fmManager = getSupportFragmentManager();
        if (mCurrentFragment != toFragment) {
            if (!toFragment.isAdded()) {      //判断是否曾经添加过,没有的话则添加一个Fragment
                if (mCurrentFragment != null) {
                    fmManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .commit();
                }
                fmManager.beginTransaction()
                        .add(R.id.main_container, toFragment)
                        .commit();

            } else {
                fmManager.beginTransaction().hide(mCurrentFragment).show(toFragment).commit();
            }
        }
        mCurrentFragment = toFragment;

    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }


}
