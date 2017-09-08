package com.charmingwong.rxjava;

import io.reactivex.Observable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Timer {

    public static void main(String[] args) throws InterruptedException {

        //timer开启一个后台线程，安排一个定时任务，1秒后执行
        Observable
                .timer(1000, TimeUnit.MILLISECONDS)
                .subscribe(aLong -> System.out.println("timer completed"));

        //主线程退出，timer的后台线程也相应退出
        Thread.sleep(5000);

    }
}
