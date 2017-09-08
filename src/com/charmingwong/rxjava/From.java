package com.charmingwong.rxjava;

import io.reactivex.Observable;
import io.reactivex.functions.Action;

import java.util.Arrays;
import java.util.List;

/**
 * Created by CharmingWong on 2017/5/5.
 */
public class From {
    public static void main(String[] args) {

        List<Tasks> tasks = Arrays.asList
                (
                        new Tasks(1, "description"),
                        new Tasks(2, "description"),
                        new Tasks(4, "description"),
                        new Tasks(3, "description"),
                        new Tasks(5, "description")
                );
        Observable.fromIterable(tasks).forEach(task -> System.out.println(task.toString()));

        System.out.println("=================================================");

        Tasks[] taskss = new Tasks[]{
                new Tasks(1, "description"),
                new Tasks(2, "description"),
                new Tasks(4, "description"),
                new Tasks(3, "description"),
                new Tasks(5, "description")
        };
        Observable.fromArray(taskss).subscribe(t -> System.out.println(t));

        System.out.println("=================================================");

        Integer[] ints = {1, 2, 3, 4, 5};
        Observable.fromArray(ints).subscribe(i -> System.out.println(i));

    }

    private static class Tasks {
        int id;
        String description;

        public Tasks(int id, String description) {
            this.id = id;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Tasks{" + "id=" + id + ", description='" + description + '\'' + '}';
        }
    }
}

