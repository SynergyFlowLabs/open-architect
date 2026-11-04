package com.sun.jna;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
abstract class Klass {
    private Klass() {
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException e10) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e10, e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e11, e11);
        }
    }
}
