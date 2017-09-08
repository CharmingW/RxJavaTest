package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Empty {

    public static void main(String[] args) {

        Observable
                .empty()
                .subscribe(new Consumer<Object>() {
                    @Override
                    public void accept(@NonNull Object i) throws Exception {
                        System.out.println(i);
                    }
                });
    }
}
