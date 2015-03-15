package com.edgargarriga.resistorcalculator;

/**
 * Created by edgano on 15/03/2015.
 */
// ColorSpinnerAdapterItem.java
public class ColorSpinnerAdapterItem {
    int color;
    String name;

    public ColorSpinnerAdapterItem(int color, String name) {
        this.color = color;
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public String getDisplayName() {
        return name;
    }
}
