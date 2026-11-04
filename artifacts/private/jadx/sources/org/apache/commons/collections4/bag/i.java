package org.apache.commons.collections4.bag;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class i<E> extends org.apache.commons.collections4.collection.e<E> implements org.apache.commons.collections4.c<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335511d = 8084674570753837109L;

    class a extends org.apache.commons.collections4.collection.e<E> implements Set<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f335512e = 2990565892366827855L;

        a(Set<E> set, Object obj) {
            super(set, obj);
        }
    }

    protected i(org.apache.commons.collections4.c<E> cVar) {
        super(cVar);
    }

    public static <E> i<E> k(org.apache.commons.collections4.c<E> cVar) {
        return new i<>(cVar);
    }

    @Override // org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
        boolean zH;
        synchronized (this.f335613b) {
            zH = i().H(e10, i10);
        }
        return zH;
    }

    @Override // org.apache.commons.collections4.c
    public int U0(Object obj) {
        int iU0;
        synchronized (this.f335613b) {
            try {
                iU0 = i().U0(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iU0;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f335613b) {
            zEquals = i().equals(obj);
        }
        return zEquals;
    }

    @Override // org.apache.commons.collections4.c
    public boolean f0(Object obj, int i10) {
        boolean zF0;
        synchronized (this.f335613b) {
            zF0 = i().f0(obj, i10);
        }
        return zF0;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f335613b) {
            try {
                iHashCode = i().hashCode();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iHashCode;
    }

    protected org.apache.commons.collections4.c<E> i() {
        return (org.apache.commons.collections4.c) c();
    }

    @Override // org.apache.commons.collections4.c
    public Set<E> r0() {
        a aVar;
        synchronized (this.f335613b) {
            aVar = new a(i().r0(), this.f335613b);
        }
        return aVar;
    }

    protected i(org.apache.commons.collections4.c<E> cVar, Object obj) {
        super(cVar, obj);
    }
}
