package ir.maktab.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer binObserver = new BinObserver(subject);
        Observer octObserver = new OctObserver(subject);
        Observer hexObserver = new HexObserver(subject);

        subject.setState(12);
        System.out.println("==========");
        subject.setState(193);
    }
}
