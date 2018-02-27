package com.flf.http;

/**
 * Created by fenglingfeng on 2018/2/27.
 * 说明：进行新闻数据的获取，分为远程仓库和本地仓库，远程仓库网络请求获取数据，获取数据之后存储在本地仓库
 *      其他地方调用获取数据的api的时候，可判断先从本地仓库获取，没有再使用远程仓库网络请求.
 */

public class NewsRepository {

    private static volatile NewsRepository INSTANCE;
    private RemoteNews remoteNews;
    private LocalNews localNews;

    public static NewsRepository getInstance() {
        if (INSTANCE == null) {
            synchronized (NewsRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NewsRepository();
                }
            }
        }
        return INSTANCE;
    }
}
