package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
final class a3 {
    a3() {
    }

    static void a(Object key, Object value) {
        if (key == null) {
            throw new NullPointerException("null key in entry: null=" + value);
        }
        if (value != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + key + "=null");
    }

    @z7.a
    static int b(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    @z7.a
    static long c(long value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }

    static void d(int value, String name) {
        if (value > 0) {
            return;
        }
        throw new IllegalArgumentException(name + " must be positive but was: " + value);
    }

    static void e(boolean canRemove) {
        com.google.common.base.j0.h0(canRemove, "no calls to next() since the last call to remove()");
    }
}
