package com.chan.vivian;

public class NestedObject {
    private int value1;
    private String value2;
    private transient int value3;

    NestedObject(int value1, String value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
}
