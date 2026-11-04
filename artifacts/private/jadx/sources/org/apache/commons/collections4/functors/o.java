package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class o<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335720a = 7179106032121985545L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final org.apache.commons.collections4.h f335721b = new o();

    private o() {
    }

    public static <E> org.apache.commons.collections4.h<E> b() {
        return f335721b;
    }

    private Object readResolve() {
        return f335721b;
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        throw new org.apache.commons.collections4.q("ExceptionClosure invoked");
    }
}
