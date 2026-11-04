package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class w0<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335757b = -5194992589193388969L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.w0<? super E, ?> f335758a;

    public w0(org.apache.commons.collections4.w0<? super E, ?> w0Var) {
        this.f335758a = w0Var;
    }

    public static <E> org.apache.commons.collections4.h<E> c(org.apache.commons.collections4.w0<? super E, ?> w0Var) {
        return w0Var == null ? e0.b() : new w0(w0Var);
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        this.f335758a.a(e10);
    }

    public org.apache.commons.collections4.w0<? super E, ?> b() {
        return this.f335758a;
    }
}
