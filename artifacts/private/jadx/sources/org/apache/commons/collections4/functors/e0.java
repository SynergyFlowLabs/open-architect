package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class e0<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335672a = 3518477308466486130L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.h f335673b = new e0();

    private e0() {
    }

    public static <E> org.apache.commons.collections4.h<E> b() {
        return f335673b;
    }

    private Object readResolve() {
        return f335673b;
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
    }
}
