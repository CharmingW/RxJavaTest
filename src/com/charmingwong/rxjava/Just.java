package com.charmingwong.rxjava;

import io.reactivex.Observable;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class Just {

    public static void main(String[] args) {
//        Observable.just("data").subscribe(s -> System.out.println(s));
        Observable.just(1, 2, 3, "data").subscribe(s -> System.out.println(s));
        System.out.println("==================================================");
        System.out.println(validate("abcd", "abcd"));
    }

    private static boolean isValid = true;

    private static boolean validate(String username, String password) {
        Observable.just(username, password).subscribe(s -> {
            if (!(s != null && !s.isEmpty() && s.length() > 3))
                throw new RuntimeException();
        }, throwable -> isValid = false);
        return isValid;
    }
}
