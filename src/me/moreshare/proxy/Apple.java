package me.moreshare.proxy;


public class Apple implements IFruit {
    private final static String TAG = Apple.class.getSimpleName();
    private static String mName = Apple.class.getSimpleName();

    @Override
    public void printName() {
        System.out.println("I am " + mName);
    }
}