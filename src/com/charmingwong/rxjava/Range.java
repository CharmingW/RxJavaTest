package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Predicate;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Range {

    public static void main(String[] args) {

        Observable
                .range(0, 10)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(@NonNull Integer integer) throws Exception {
                        return integer % 2 == 0;
                    }
                })
                .subscribe(i -> System.out.println(i));
    }
}
