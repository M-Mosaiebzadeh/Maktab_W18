package ir.maktab.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    private void execute() {
        observers.forEach(observer -> observer.update());
    }

    public void setState(int state) {
        this.state = state;
        execute();
    }
}
