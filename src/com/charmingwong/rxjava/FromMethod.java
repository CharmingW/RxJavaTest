package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class FromMethod {

    public static void main(String[] args) {

        Observable
                .just(subString("charming", 0, 4))
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(@NonNull String result) throws Exception {
                        System.out.println(result);
                    }
                });
    }

    static String subString(String s, int start, int end) {
        return s.substring(start, end);
    }
}
