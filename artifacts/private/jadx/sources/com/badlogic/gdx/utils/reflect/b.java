package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Object a(Object obj, int i10) {
        return Array.get(obj, i10);
    }

    public static int b(Object obj) {
        return Array.getLength(obj);
    }

    public static Object c(Class cls, int i10) {
        return Array.newInstance((Class<?>) cls, i10);
    }

    public static void d(Object obj, int i10, Object obj2) {
        Array.set(obj, i10, obj2);
    }
}
