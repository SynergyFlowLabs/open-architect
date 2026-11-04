package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@o0
public final class a0 {
    private a0() {
    }

    public static <V> AtomicReference<V> a() {
        return new AtomicReference<>();
    }

    public static <V> AtomicReference<V> b(@d2 V initialValue) {
        return new AtomicReference<>(initialValue);
    }

    public static <E> AtomicReferenceArray<E> c(int length) {
        return new AtomicReferenceArray<>(length);
    }

    public static <E> AtomicReferenceArray<E> d(E[] array) {
        return new AtomicReferenceArray<>(array);
    }
}
