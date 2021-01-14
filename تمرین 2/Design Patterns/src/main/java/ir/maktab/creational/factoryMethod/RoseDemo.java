package ir.maktab.creational.factoryMethod;

public class RoseDemo {
    public static void main(String[] args) {
        RoseFactory factory = new RoseFactory();
        Rose redRose = factory.getRose("red");
        Rose blackRose = factory.getRose("black");

        redRose.addColor();
        blackRose.addColor();
    }
}
