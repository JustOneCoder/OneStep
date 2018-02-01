package com.flf.onestep.news;

import android.os.Handler;
import android.os.Message;

import com.flf.onestep.R;
import com.flf.onestep.base.BaseBindingFragment;
import com.flf.onestep.databinding.FragmentNewsBinding;


/**
 * 作者：flf
 * 时间：2018/01/31/
 * 说明：新闻,轮播图，条目新闻
 */
public class NewsFragment extends BaseBindingFragment<FragmentNewsBinding> {

    @Override
    protected void bindData(FragmentNewsBinding binding) {
        initView();
    }

    private void initView() {
        NewsBannerPagerAdapter newsBannerPagerAdapter = new NewsBannerPagerAdapter(getContext(),binding.viewpagerNews);
        binding.viewpagerNews.setAdapter(newsBannerPagerAdapter);
        newsBannerPagerAdapter.controlViewPagerSpeed();
        binding.indicatorNews.setViewPager(binding.viewpagerNews);
        new NewsBannerHandler().sendEmptyMessageDelayed(0,1000);

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_news;
    }

    public class NewsBannerHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            int currentItemPosition = binding.viewpagerNews.getCurrentItem();
            switch (msg.what) {
                case 0:
                    if (currentItemPosition != 4) {
                        currentItemPosition = currentItemPosition+1;
                    }
                    if (currentItemPosition == 4) {
                        currentItemPosition = 0;
                    }
                    binding.viewpagerNews.setCurrentItem(currentItemPosition);
                    sendEmptyMessageDelayed(0,3000);
                break;
                default:
                    break;
            }
        }
    }
}
