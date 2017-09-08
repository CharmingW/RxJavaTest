package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Create {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        Observable
                .create(new ObservableOnSubscribe<Integer>() {
                    @Override
                    public void subscribe(ObservableEmitter e) throws Exception {
                        e.onNext(a);
                        e.onNext(b);
                        e.onNext(c);
                        e.onComplete();
                    }
                })
                .subscribe(i -> System.out.println(i));

        ArrayList<Object> objects = new ArrayList<>();
        ArrayList arrayList = new ArrayList<>();
        ArrayList<String> f = new ArrayList<>();
    }
}
