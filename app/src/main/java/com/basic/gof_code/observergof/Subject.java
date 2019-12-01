package com.basic.gof_code.observergof;

import java.util.ArrayList;
import java.util.List;

/**
 * 他把所有对观察者对象的引用保存在一个聚集里，每个护体都可以有任何数量的观察者。抽象主题提供一个借口，可以增加和删除观察者对象。
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void subscrible(Observer observer) {
        this.observers.add(observer);
    }

    public void describle(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer :
                observers) {
            observer.update();
        }
    }
}
