package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

import java.io.Serializable;
import java.util.concurrent.Callable;

/**
 * Created by CharmingWong on 2017/5/`.
 */
public class Defer {

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 1;
        person.name = "charming";
        Observable observable = Observable.just(person.age, person.name);
        person.age = 2;
        observable.subscribe(s -> System.out.println(s));

        System.out.println("=========================================");

        Observable observable1 = Observable.defer(new Callable<ObservableSource<? extends Serializable>>() {
            @Override
            public ObservableSource<? extends Serializable> call() throws Exception {
                return Observable.just(person.age, person.name);
            }
        });
        person.age = 3;
        observable1.subscribe(new Consumer() {
            @Override
            public void accept(@NonNull Object s) throws Exception {
                System.out.println(s);
            }
        });
    }

    static class Person {
        int age;
        String name;
    }
}
