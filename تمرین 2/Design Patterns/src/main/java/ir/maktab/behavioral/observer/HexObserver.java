package ir.maktab.behavioral.observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getState() + " => to Hex: " + Integer.toHexString(subject.getState()));
    }
}
