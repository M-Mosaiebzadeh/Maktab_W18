package ir.maktab.creational.factoryMethod;

public class RoseFactory {
    public Rose getRose(String roseColor) {
        if (roseColor == null)
            return null;
        else if (roseColor.equalsIgnoreCase("BLACK"))
            return new BlackRose();
        else if (roseColor.equalsIgnoreCase("YELLOW"))
            return new YellowRose();
        else if (roseColor.equalsIgnoreCase("RED"))
            return new RedRose();
        return null;
    }
}
