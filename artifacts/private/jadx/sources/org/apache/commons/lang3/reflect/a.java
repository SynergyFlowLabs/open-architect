package org.apache.commons.lang3.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.m;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static <T> Constructor<T> a(Class<T> cls, Class<?>... clsArr) {
        c0.P(cls, "class cannot be null", new Object[0]);
        try {
            return b(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> Constructor<T> b(Constructor<T> constructor) {
        c0.P(constructor, "constructor cannot be null", new Object[0]);
        if (d.g(constructor) && h(constructor.getDeclaringClass())) {
            return constructor;
        }
        return null;
    }

    public static <T> Constructor<T> c(Class<T> cls, Class<?>... clsArr) {
        Constructor<T> constructorB;
        c0.P(cls, "class cannot be null", new Object[0]);
        try {
            Constructor<T> constructor = cls.getConstructor(clsArr);
            d.l(constructor);
            return constructor;
        } catch (NoSuchMethodException unused) {
            Constructor<T> constructor2 = null;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                if (d.h(constructor3, clsArr) && (constructorB = b(constructor3)) != null) {
                    d.l(constructorB);
                    if (constructor2 == null || d.a(constructorB, constructor2, clsArr) < 0) {
                        constructor2 = constructorB;
                    }
                }
            }
            return constructor2;
        }
    }

    public static <T> T d(Class<T> cls, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return (T) e(cls, objArrW1, m.X(objArrW1));
    }

    public static <T> T e(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        Constructor constructorC = c(cls, org.apache.commons.lang3.c.R1(clsArr));
        if (constructorC != null) {
            if (constructorC.isVarArgs()) {
                objArrW1 = e.o(objArrW1, constructorC.getParameterTypes());
            }
            return (T) constructorC.newInstance(objArrW1);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    public static <T> T f(Class<T> cls, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        return (T) g(cls, objArrW1, m.X(objArrW1));
    }

    public static <T> T g(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object[] objArrW1 = org.apache.commons.lang3.c.W1(objArr);
        Constructor constructorA = a(cls, org.apache.commons.lang3.c.R1(clsArr));
        if (constructorA != null) {
            return (T) constructorA.newInstance(objArrW1);
        }
        throw new NoSuchMethodException("No such accessible constructor on object: " + cls.getName());
    }

    private static boolean h(Class<?> cls) {
        while (cls != null) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                return false;
            }
            cls = cls.getEnclosingClass();
        }
        return true;
    }
}
