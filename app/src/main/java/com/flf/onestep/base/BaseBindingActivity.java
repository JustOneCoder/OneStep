package com.flf.onestep.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.flf.onestep.R;

public abstract class BaseBindingActivity<T extends ViewDataBinding> extends AppCompatActivity {

    protected T binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ARouter.getInstance().inject(this);
        binding = DataBindingUtil.setContentView(this, getLayoutId());
        bindData(binding,savedInstanceState);
    }

    protected abstract void bindData(T binding, Bundle savedInstanceState);


    protected abstract int getLayoutId();
}
