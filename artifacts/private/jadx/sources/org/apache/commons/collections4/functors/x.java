package org.apache.commons.collections4.functors;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class x<E> implements org.apache.commons.collections4.h<E>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335759d = 3518477308466486130L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.l0<? super E> f335760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E> f335761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.apache.commons.collections4.h<? super E> f335762c;

    public x(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar) {
        this(l0Var, hVar, e0.b());
    }

    public static <E> org.apache.commons.collections4.h<E> e(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar) {
        return f(l0Var, hVar, e0.b());
    }

    public static <E> org.apache.commons.collections4.h<E> f(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar, org.apache.commons.collections4.h<? super E> hVar2) {
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        if (hVar == null || hVar2 == null) {
            throw new NullPointerException("Closures must not be null");
        }
        return new x(l0Var, hVar, hVar2);
    }

    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        if (this.f335760a.a(e10)) {
            this.f335761b.a(e10);
        } else {
            this.f335762c.a(e10);
        }
    }

    public org.apache.commons.collections4.h<? super E> b() {
        return this.f335762c;
    }

    public org.apache.commons.collections4.l0<? super E> c() {
        return this.f335760a;
    }

    public org.apache.commons.collections4.h<? super E> d() {
        return this.f335761b;
    }

    public x(org.apache.commons.collections4.l0<? super E> l0Var, org.apache.commons.collections4.h<? super E> hVar, org.apache.commons.collections4.h<? super E> hVar2) {
        this.f335760a = l0Var;
        this.f335761b = hVar;
        this.f335762c = hVar2;
    }
}
