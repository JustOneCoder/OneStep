package com.flf.onestep.news;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.flf.onestep.R;
import com.flf.onestep.base.BaseBindingAdapter;
import com.flf.onestep.base.BaseBindingViewHolder;
import com.flf.onestep.databinding.ItemNewsBinding;

/**
 * Created by fenglingfeng on 2018/2/1.
 * 新闻条目显示adapter
 */

public class NewsAdapter extends BaseBindingAdapter<String> {

    public NewsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseBindingViewHolder<String> createVH(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
                viewType, parent, false);
        return new ViewHolder(binding);
    }


    public class ViewHolder extends BaseBindingViewHolder<String> {

        public ViewHolder(ViewDataBinding dataBinding) {
            super(dataBinding);
        }

        @Override
        public void bindTo(BaseBindingViewHolder<String> holder, String item) {
            ItemNewsBinding dataBinding = (ItemNewsBinding) binding;
            dataBinding.tvNews.setText(item);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_news;
    }
}
