package ir.maktab.behavioral.observer;

public class OctObserver extends Observer{

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.println(subject.getState() + " => to Oct: " + Integer.toOctalString(subject.getState()));
    }
}
