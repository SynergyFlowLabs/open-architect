package org.apache.commons.collections4.multiset;

import java.util.Set;
import org.apache.commons.collections4.e0;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> extends org.apache.commons.collections4.collection.e<E> implements e0<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336230d = 20150629;

    static class a<T> extends org.apache.commons.collections4.collection.e<T> implements Set<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f336231d = 20150629;

        a(Set<T> set, Object obj) {
            super(set, obj);
        }
    }

    protected f(e0<E> e0Var) {
        super(e0Var);
    }

    public static <E> f<E> k(e0<E> e0Var) {
        return new f<>(e0Var);
    }

    @Override // org.apache.commons.collections4.e0
    public int H(E e10, int i10) {
        int iH;
        synchronized (this.f335613b) {
            try {
                iH = c().H(e10, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iH;
    }

    @Override // org.apache.commons.collections4.e0
    public int U0(Object obj) {
        int iU0;
        synchronized (this.f335613b) {
            try {
                iU0 = c().U0(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iU0;
    }

    @Override // org.apache.commons.collections4.e0
    public Set<e0.a<E>> entrySet() {
        a aVar;
        synchronized (this.f335613b) {
            aVar = new a(c().entrySet(), this.f335613b);
        }
        return aVar;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f335613b) {
            try {
                zEquals = c().equals(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zEquals;
    }

    @Override // org.apache.commons.collections4.e0
    public int f0(Object obj, int i10) {
        int iF0;
        synchronized (this.f335613b) {
            try {
                iF0 = c().f0(obj, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iF0;
    }

    @Override // org.apache.commons.collections4.e0
    public int g1(E e10, int i10) {
        int iG1;
        synchronized (this.f335613b) {
            iG1 = c().g1(e10, i10);
        }
        return iG1;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f335613b) {
            try {
                iHashCode = c().hashCode();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e0<E> c() {
        return (e0) super.c();
    }

    @Override // org.apache.commons.collections4.e0
    public Set<E> r0() {
        a aVar;
        synchronized (this.f335613b) {
            try {
                aVar = new a(c().r0(), this.f335613b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    protected f(e0<E> e0Var, Object obj) {
        super(e0Var, obj);
    }
}
