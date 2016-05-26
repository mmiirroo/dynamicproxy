package me.moreshare.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    private static IFruit getProxy(IFruit fruit) {
        return (IFruit) Proxy.newProxyInstance(fruit.getClass().getClassLoader(), fruit.getClass()
                .getInterfaces(),
                new IFruitHook(fruit));
    }

    private static void changeFruitName() {
        try {
            Class<?> cls = Class.forName("me.moreshare.proxy.Apple");
            Field field = cls.getDeclaredField("mName");
            field.setAccessible(true);
            field.set(null, "durian");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IFruit apple = new Apple();
        changeFruitName();
        getProxy(apple).printName();

        IFruit banana = new Banana();

        getProxy(banana).printName();
    }
}
