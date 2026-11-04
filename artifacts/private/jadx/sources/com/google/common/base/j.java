package com.google.common.base;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Double f116554a = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Float f116555b = Float.valueOf(0.0f);

    private j() {
    }

    @fj.a
    public static <T> T a(Class<T> cls) {
        j0.E(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f116555b;
        }
        if (cls == Double.TYPE) {
            return (T) f116554a;
        }
        return null;
    }
}
