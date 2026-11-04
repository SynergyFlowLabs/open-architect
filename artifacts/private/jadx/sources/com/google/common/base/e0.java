package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@z7.f("Use Optional.of(value) or Optional.absent()")
@com.google.common.annotations.b(serializable = true)
@k
public abstract class e0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f116526a = 0;

    class a implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f116527a;

        /* JADX INFO: renamed from: com.google.common.base.e0$a$a, reason: collision with other inner class name */
        class C1045a extends b<T> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Iterator<? extends e0<? extends T>> f116528c;

            C1045a() {
                this.f116528c = (Iterator) j0.E(a.this.f116527a.iterator());
            }

            @Override // com.google.common.base.b
            @fj.a
            protected T b() {
                while (this.f116528c.hasNext()) {
                    e0<? extends T> next = this.f116528c.next();
                    if (next.e()) {
                        return next.d();
                    }
                }
                return c();
            }
        }

        a(final Iterable val$optionals) {
            this.f116527a = val$optionals;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C1045a();
        }
    }

    e0() {
    }

    public static <T> e0<T> a() {
        return com.google.common.base.a.m();
    }

    public static <T> e0<T> c(@fj.a T nullableReference) {
        return nullableReference == null ? a() : new m0(nullableReference);
    }

    public static <T> e0<T> f(T reference) {
        return new m0(j0.E(reference));
    }

    public static <T> Iterable<T> k(final Iterable<? extends e0<? extends T>> optionals) {
        j0.E(optionals);
        return new a(optionals);
    }

    public abstract Set<T> b();

    public abstract T d();

    public abstract boolean e();

    public abstract boolean equals(@fj.a Object object);

    public abstract e0<T> g(e0<? extends T> secondChoice);

    public abstract T h(s0<? extends T> supplier);

    public abstract int hashCode();

    public abstract T i(T defaultValue);

    @fj.a
    public abstract T j();

    public abstract <V> e0<V> l(t<? super T, V> function);

    public abstract String toString();
}
