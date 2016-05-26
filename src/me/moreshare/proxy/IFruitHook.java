package me.moreshare.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IFruitHook implements InvocationHandler {
    private final static String TAG = IFruitHook.class.getSimpleName();
    private Object mHookedObj;

    public IFruitHook(Object mHookedObj) {
        this.mHookedObj = mHookedObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object result = method.invoke(mHookedObj, args);
        System.out.println("after invoke");
        return result;
    }
}
