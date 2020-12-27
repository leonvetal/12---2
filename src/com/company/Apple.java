package com.company;

public enum Apple {
    A(10),B(20),C(30),D(40);
    int a;

    Apple(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "a=" + a +
                "} " + super.toString();
    }
}
