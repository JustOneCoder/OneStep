package com.flf.onestep.news;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;

import com.flf.onestep.R;
import com.flf.onestep.base.BaseBindingAdapter;
import com.flf.onestep.base.BaseBindingFragment;
import com.flf.onestep.databinding.FragmentNewsBinding;

import java.util.ArrayList;


/**
 * 作者：flf
 * 时间：2018/01/31/
 * 说明：新闻,轮播图，条目新闻,
 *      持有ViewModel
 */
public class NewsFragment extends BaseBindingFragment<FragmentNewsBinding> {
    ArrayList<String> list;
    @Override
    protected void bindData(FragmentNewsBinding binding) {
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i+"");
        }
        initView();
    }

    private void initView() {
        NewsBannerPagerAdapter newsBannerPagerAdapter = new NewsBannerPagerAdapter(getContext(),binding.viewpagerNews);
        binding.viewpagerNews.setAdapter(newsBannerPagerAdapter);
        newsBannerPagerAdapter.controlViewPagerSpeed();
        binding.indicatorNews.setViewPager(binding.viewpagerNews);
        new NewsBannerHandler().sendEmptyMessageDelayed(0,1000);
        binding.rlvNews.setLayoutManager(new LinearLayoutManager(getContext()));
        BaseBindingAdapter adapter = new NewsAdapter(getContext());
        adapter.addAll(list);
        binding.rlvNews.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rlvNews.setAdapter(adapter);

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
