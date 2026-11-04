package org.apache.commons.collections4.bag;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> extends org.apache.commons.collections4.collection.a<E> implements org.apache.commons.collections4.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335493c = -3768146017343785417L;

    protected a() {
    }

    @Override // org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
        return c().H(e10, i10);
    }

    @Override // org.apache.commons.collections4.c
    public int U0(Object obj) {
        return c().U0(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
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
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public org.apache.commons.collections4.c<E> c() {
        return (org.apache.commons.collections4.c) super.c();
    }

    @Override // org.apache.commons.collections4.c
    public Set<E> r0() {
        return c().r0();
    }

    protected a(org.apache.commons.collections4.c<E> cVar) {
        super(cVar);
    }
}
