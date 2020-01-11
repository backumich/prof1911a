package com.vertex.prof.data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.Color;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Apple extends Fruit {
    private String sortName;
    private int sweetness;
    private Color color;
    private int weight;
}
