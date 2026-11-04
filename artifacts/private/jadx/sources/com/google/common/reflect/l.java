package com.google.common.reflect;

import com.google.common.base.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes5.dex */
@d
public final class l {
    private l() {
    }

    public static String a(Class<?> clazz) {
        return b(clazz.getName());
    }

    public static String b(String classFullName) {
        int iLastIndexOf = classFullName.lastIndexOf(46);
        return iLastIndexOf < 0 ? "" : classFullName.substring(0, iLastIndexOf);
    }

    public static void c(Class<?>... classes) {
        for (Class<?> cls : classes) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static <T> T d(Class<T> interfaceType, InvocationHandler handler) {
        j0.E(handler);
        j0.u(interfaceType.isInterface(), "%s is not an interface", interfaceType);
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }
}
