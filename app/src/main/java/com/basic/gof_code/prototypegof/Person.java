package com.basic.gof_code.prototypegof;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象支持Clone需要实现Cloneable接口
 */
public class Person implements Cloneable {
    private String name;
    private String sex;
    private List<String> lists;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", lists=" + lists +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person personClone = (Person) super.clone();
        List<String> newList = new ArrayList<>();
        if (lists != null && lists.size() > 0) {
            for (int i = 0; i < lists.size(); i++) {
                newList.add(lists.get(i));
            }
        }
        personClone.setLists(newList);
        return personClone;
    }
}
