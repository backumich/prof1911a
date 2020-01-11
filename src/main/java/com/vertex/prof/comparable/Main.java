package com.vertex.prof.comparable;

import com.vertex.prof.data.Apple;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Apple jonathan = Apple.builder()
                .sortName("Jonathan")
                .weight(200)
                .sweetness(10)
                .build();

        Apple gorets = Apple.builder()
                .sortName("Gorets")
                .weight(200)
                .sweetness(10)
                .build();

        Apple golden = Apple.builder()
                .sortName("Golden")
                .weight(200)
                .sweetness(1)
                .build();

        Apple[] apples = {jonathan, gorets, golden};
        System.out.println(Arrays.toString(apples));
        System.out.println(apples);

        Arrays.sort(apples, new AppleComparator());
        System.out.println(Arrays.toString(apples));


        Arrays.sort(apples, Comparator.comparingInt(Apple::getWeight)
                .thenComparingInt(Apple::getSweetness)
                .reversed());
        System.out.println(Arrays.toString(apples));
    }
}
