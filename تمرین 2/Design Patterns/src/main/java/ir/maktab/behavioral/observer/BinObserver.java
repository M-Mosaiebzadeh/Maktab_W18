package ir.maktab.behavioral.observer;

public class BinObserver extends Observer{

    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getState() + " => to Bin: " + Integer.toBinaryString(subject.getState()));
    }
}
