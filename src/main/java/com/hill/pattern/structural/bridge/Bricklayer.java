//specific implementation 2

package com.hill.pattern.structural.bridge;

public class Bricklayer implements Builder {
    @Override
    public void build(int square, int floorCount) {
        System.out.println("Brick building with square=" + square + " and " + floorCount + " floors");
    }
}
