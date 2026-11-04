package io.grpc.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;

/* JADX INFO: loaded from: classes13.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f290146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f290147b;

    static {
        Method method;
        Method method2 = null;
        try {
            Class<?> cls = Class.forName("org.conscrypt.Conscrypt");
            Method method3 = cls.getMethod("newProvider", null);
            method = cls.getMethod("isConscrypt", Provider.class);
            method2 = method3;
        } catch (ClassNotFoundException unused) {
            method = null;
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
        f290146a = method2;
        f290147b = method;
    }

    public static boolean a(Provider provider) {
        if (!b()) {
            return false;
        }
        try {
            return ((Boolean) f290147b.invoke(null, provider)).booleanValue();
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(e11);
        }
    }

    public static boolean b() {
        return f290146a != null;
    }

    public static Provider c() throws Throwable {
        if (b()) {
            int i10 = 2 ^ 0;
            return (Provider) f290146a.invoke(null, null);
        }
        Class.forName("org.conscrypt.Conscrypt");
        throw new AssertionError("Unexpected failure referencing Conscrypt class");
    }
}
