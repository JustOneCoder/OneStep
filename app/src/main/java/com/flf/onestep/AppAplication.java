package com.flf.onestep;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 作者：Administrator
 * 时间：2017/12/14:23:53
 * 说明：
 */

public class AppAplication extends Application {

    private static AppAplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.init(instance); // 尽可能早，推荐在Application中初始化

    }

    public static synchronized AppAplication getInstance() {
        return instance;
    }
}
