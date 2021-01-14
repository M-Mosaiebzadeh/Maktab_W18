package ir.maktab.creational.singleton;

public final class Captain {
    private static Captain captain;

    private Captain() {
    }

    public static Captain getInstance() {
        if (captain ==null)
            captain = new Captain();
        else
            System.out.println("captain is ready");
        return captain;
    }
}

