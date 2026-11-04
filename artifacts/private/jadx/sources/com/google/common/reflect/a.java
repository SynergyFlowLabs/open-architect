package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@d
public abstract class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f119815a = new Object[0];

    private static boolean b(Object arg, Class<?> proxyClass) {
        if (!proxyClass.isInstance(arg) && (!Proxy.isProxyClass(arg.getClass()) || !Arrays.equals(arg.getClass().getInterfaces(), proxyClass.getInterfaces()))) {
            return false;
        }
        return true;
    }

    @fj.a
    protected abstract Object a(Object proxy, Method method, Object[] args) throws Throwable;

    public boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @fj.a
    public final Object invoke(Object proxy, Method method, @fj.a Object[] args) throws Throwable {
        if (args == null) {
            args = f119815a;
        }
        if (args.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (args.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (args.length == 0 && method.getName().equals("toString")) ? toString() : a(proxy, method, args);
        }
        Object obj = args[0];
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (proxy == obj) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(b(obj, proxy.getClass()) && equals(Proxy.getInvocationHandler(obj)));
    }

    public String toString() {
        return super.toString();
    }
}
