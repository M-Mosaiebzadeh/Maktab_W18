package ir.maktab.creational.singleton;

public class CaptainDemo {
    public static void main(String[] args) {
        //  it is not possible to new, because constructor private
//        Captain captain1 = new Captain();

        Captain captain1 = Captain.getInstance();
        System.out.println(captain1);

        Captain captain2 = Captain.getInstance();
        System.out.println(captain2);
    }
}
