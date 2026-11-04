package org.apache.commons.collections4.bag;

import java.util.Set;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class g<E> extends org.apache.commons.collections4.collection.d<E> implements org.apache.commons.collections4.c<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335509e = -2575833140344736876L;

    protected g(org.apache.commons.collections4.c<E> cVar, l0<? super E> l0Var) {
        super(cVar, l0Var);
    }

    public static <E> g<E> p(org.apache.commons.collections4.c<E> cVar, l0<? super E> l0Var) {
        return new g<>(cVar, l0Var);
    }

    @Override // org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
        m(e10);
        return c().H(e10, i10);
    }

    @Override // org.apache.commons.collections4.c
    public int U0(Object obj) {
        return c().U0(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj != this && !c().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.collections4.c
    public boolean f0(Object obj, int i10) {
        return c().f0(obj, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return c().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public org.apache.commons.collections4.c<E> c() {
        return (org.apache.commons.collections4.c) super.c();
    }

    @Override // org.apache.commons.collections4.c
    public Set<E> r0() {
        return c().r0();
    }
}
