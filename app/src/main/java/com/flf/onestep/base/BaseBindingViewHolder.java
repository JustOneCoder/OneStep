package com.flf.onestep.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by fenglingfeng on 2018/1/31.
 */

public abstract class BaseBindingViewHolder<T> extends RecyclerView.ViewHolder {

    protected ViewDataBinding binding;

    public BaseBindingViewHolder(View view) {
        super(view);
    }

    public BaseBindingViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public abstract void bindTo(BaseBindingViewHolder<T> holder, T item);

}
