package com.charmingwong.rxjava;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Interval {

    public static void main(String[] args) throws InterruptedException {

        //interval开启一个后台线程，安排重复定时任务，每隔1秒执行一次
        Observable
                .interval(0, 1000, TimeUnit.MILLISECONDS)
                .subscribe(aLong -> System.out.println("interval completed"));

        //主线程退出，interval的后台也相应退出
        Thread.sleep(10000);
    }
}
