package org.apache.commons.collections4.bag;

import java.util.Set;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class k<E> extends org.apache.commons.collections4.collection.f<E> implements org.apache.commons.collections4.c<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335515e = 5421170911299074185L;

    protected k(org.apache.commons.collections4.c<E> cVar, w0<? super E, ? extends E> w0Var) {
        super(cVar, w0Var);
    }

    public static <E> org.apache.commons.collections4.c<E> p(org.apache.commons.collections4.c<E> cVar, w0<? super E, ? extends E> w0Var) {
        k kVar = new k(cVar, w0Var);
        if (cVar.size() > 0) {
            Object[] array = cVar.toArray();
            cVar.clear();
            for (Object obj : array) {
                kVar.c().add(w0Var.a(obj));
            }
        }
        return kVar;
    }

    public static <E> org.apache.commons.collections4.c<E> r(org.apache.commons.collections4.c<E> cVar, w0<? super E, ? extends E> w0Var) {
        return new k(cVar, w0Var);
    }

    @Override // org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
        return n().H(i(e10), i10);
    }

    @Override // org.apache.commons.collections4.c
    public int U0(Object obj) {
        return n().U0(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // org.apache.commons.collections4.c
    public boolean f0(Object obj, int i10) {
        return n().f0(obj, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return c().hashCode();
    }

    protected org.apache.commons.collections4.c<E> n() {
        return (org.apache.commons.collections4.c) c();
    }

    @Override // org.apache.commons.collections4.c
    public Set<E> r0() {
        return org.apache.commons.collections4.set.l.p(n().r0(), this.f335615c);
    }
}
