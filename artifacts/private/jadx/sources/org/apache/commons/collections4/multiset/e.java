package org.apache.commons.collections4.multiset;

import java.util.Set;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> extends org.apache.commons.collections4.collection.d<E> implements e0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336229e = 20150629;

    protected e(e0<E> e0Var, l0<? super E> l0Var) {
        super(e0Var, l0Var);
    }

    public static <E> e<E> p(e0<E> e0Var, l0<? super E> l0Var) {
        return new e<>(e0Var, l0Var);
    }

    @Override // org.apache.commons.collections4.e0
    public int H(E e10, int i10) {
        m(e10);
        return c().H(e10, i10);
    }

    @Override // org.apache.commons.collections4.e0
    public int U0(Object obj) {
        return c().U0(obj);
    }

    @Override // org.apache.commons.collections4.e0
    public Set<e0.a<E>> entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Collection, org.apache.commons.collections4.e0
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // org.apache.commons.collections4.e0
    public int f0(Object obj, int i10) {
        return c().f0(obj, i10);
    }

    @Override // org.apache.commons.collections4.e0
    public int g1(E e10, int i10) {
        m(e10);
        return c().g1(e10, i10);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.e0
    public int hashCode() {
        return c().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e0<E> c() {
        return (e0) super.c();
    }

    @Override // org.apache.commons.collections4.e0
    public Set<E> r0() {
        return c().r0();
    }
}
