package com.google.api.client.repackaged.com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(serializable = true)
public abstract class n<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f115904a = 0;

    static class a implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f115905a;

        /* JADX INFO: renamed from: com.google.api.client.repackaged.com.google.common.base.n$a$a, reason: collision with other inner class name */
        class C1030a extends b<T> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Iterator<? extends n<? extends T>> f115906c;

            C1030a() {
                this.f115906c = (Iterator) q.E(a.this.f115905a.iterator());
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.b
            protected T b() {
                while (this.f115906c.hasNext()) {
                    n<? extends T> next = this.f115906c.next();
                    if (next.e()) {
                        return next.d();
                    }
                }
                return c();
            }
        }

        a(Iterable iterable) {
            this.f115905a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C1030a();
        }
    }

    n() {
    }

    public static <T> n<T> a() {
        return com.google.api.client.repackaged.com.google.common.base.a.m();
    }

    public static <T> n<T> c(@fj.h T t10) {
        return t10 == null ? a() : new s(t10);
    }

    public static <T> n<T> f(T t10) {
        return new s(q.E(t10));
    }

    @r7.a
    public static <T> Iterable<T> k(Iterable<? extends n<? extends T>> iterable) {
        q.E(iterable);
        return new a(iterable);
    }

    public abstract Set<T> b();

    public abstract T d();

    public abstract boolean e();

    public abstract boolean equals(@fj.h Object obj);

    public abstract n<T> g(n<? extends T> nVar);

    @r7.a
    public abstract T h(w<? extends T> wVar);

    public abstract int hashCode();

    public abstract T i(T t10);

    @fj.h
    public abstract T j();

    public abstract <V> n<V> l(i<? super T, V> iVar);

    public abstract String toString();
}
