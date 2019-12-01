package com.basic.gof_code.observergof;

public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observerA = new ConcreteObserver(subject, "观察者A");
        ConcreteObserver observerB = new ConcreteObserver(subject, "观察者B");

        subject.subscrible(observerA);
        subject.subscrible(observerB);

        subject.setSubjectState("被观察者状态改变啦----咻咻咻");
        subject.notifyObserver();
    }
}
