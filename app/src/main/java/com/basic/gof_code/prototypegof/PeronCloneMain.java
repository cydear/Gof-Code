package com.basic.gof_code.prototypegof;

import java.util.ArrayList;
import java.util.List;

public class PeronCloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.setName("李磊");
        p1.setSex("男");
        List<String> lists = new ArrayList<>();
        lists.add("100");
        p1.setLists(lists);
        p1.display();

        Person p2 = p1.clone();
        p2.getLists().set(0, "150");
        p2.display();

        Person p3 = p1.clone();
        p3.display();
    }
}
