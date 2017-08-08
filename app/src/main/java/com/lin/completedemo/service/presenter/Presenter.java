package com.lin.completedemo.service.presenter;

import android.content.Intent;

import com.lin.completedemo.service.view.View;

/**
 * Created by 18374 on 2017/8/8.
 * 定义了一些方法，前面几个onCreate、onStart等方法对应着Activity中生命周期的方法，
 * 当然没必要写上Activity生命周期中所有回调方法，通常也就用到了onCreate和onStop，除非需求很复杂，
 * 在Activity不同生命周期请求的情况不同。接着我们定义了一个attachView方法，用于绑定我们定义的View。
 * 也就是，你想把请求下来的数据实体类给哪个View就传入哪个View。
 */

public interface Presenter {
    void onCreate();
    void onStart();//暂时没用到
    void onStop();
    void pause();//暂时没用到
    void attachView(View view);
    void attachIncomingIntent(Intent intent);//暂时没用到
}
