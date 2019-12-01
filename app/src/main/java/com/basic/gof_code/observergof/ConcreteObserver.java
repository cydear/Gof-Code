package com.basic.gof_code.observergof;

public class ConcreteObserver implements Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者{" + name + "}的新状态是{" + observerState + "}");
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
