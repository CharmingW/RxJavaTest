package com.charmingwong.rxjava;

import io.reactivex.Observable;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Map {

    public static void main(String[] args) {

        Observable
                .just(1, 2)
                .map(i -> i+10)
                .subscribe(i -> System.out.println(i));
    }
}
