package com.github.hcsp.inheritance;

public class Ainmal {
    protected String name;

    public Ainmal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
