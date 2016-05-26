package me.moreshare.proxy;


public class Banana implements IFruit {
    private final static String TAG = Banana.class.getSimpleName();
    private static String mName = Banana.class.getSimpleName();

    @Override
    public void printName() {
        System.out.println("I am " + mName);
    }
}
