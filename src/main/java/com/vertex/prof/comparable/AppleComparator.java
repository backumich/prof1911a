package com.vertex.prof.comparable;

import com.vertex.prof.data.Apple;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple left, Apple right) {
        return left.getWeight() != right.getWeight() ?
                Integer.compare(left.getWeight(), right.getWeight()) :
                Integer.compare(left.getSweetness(), right.getSweetness());

//                left.getWeight() > right.getWeight() ? 1 :
//                left.getWeight() < right.getWeight() ? -1 :
//                left.getSweetness() > right.getSweetness() ? 1 :
//                left.getSweetness() < right.getSweetness() ? -1 : 0;
    }
}
