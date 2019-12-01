package com.basic.gof_code.buildergof;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    //添加部件
    public void Add(String part) {
        this.parts.add(part);
    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "parts=" + parts +
                '}';
    }
}
