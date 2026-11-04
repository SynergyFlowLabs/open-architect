package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public abstract class m<T> {

    static final class b extends m<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f116584a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116585b = 1;

        b() {
        }

        private Object readResolve() {
            return f116584a;
        }

        @Override // com.google.common.base.m
        protected boolean a(Object a10, Object b10) {
            return a10.equals(b10);
        }

        @Override // com.google.common.base.m
        protected int b(Object o10) {
            return o10.hashCode();
        }
    }

    private static final class c<T> implements k0<T>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116586c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<T> f116587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        private final T f116588b;

        c(m<T> equivalence, @fj.a T target) {
            this.f116587a = (m) j0.E(equivalence);
            this.f116588b = target;
        }

        @Override // com.google.common.base.k0
        public boolean apply(@fj.a T input) {
            return this.f116587a.d(input, this.f116588b);
        }

        @Override // com.google.common.base.k0
        public boolean equals(@fj.a Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f116587a.equals(cVar.f116587a) && d0.a(this.f116588b, cVar.f116588b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f116587a, this.f116588b);
        }

        public String toString() {
            return this.f116587a + ".equivalentTo(" + this.f116588b + ")";
        }
    }

    static final class d extends m<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f116589a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116590b = 1;

        d() {
        }

        private Object readResolve() {
            return f116589a;
        }

        @Override // com.google.common.base.m
        protected boolean a(Object a10, Object b10) {
            return false;
        }

        @Override // com.google.common.base.m
        protected int b(Object o10) {
            return System.identityHashCode(o10);
        }
    }

    public static final class e<T> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116591c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<? super T> f116592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g0
        private final T f116593b;

        @g0
        public T a() {
            return this.f116593b;
        }

        public boolean equals(@fj.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f116592a.equals(eVar.f116592a)) {
                    return this.f116592a.d(this.f116593b, eVar.f116593b);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f116592a.f(this.f116593b);
        }

        public String toString() {
            return this.f116592a + ".wrap(" + this.f116593b + ")";
        }

        private e(m<? super T> equivalence, @g0 T reference) {
            this.f116592a = (m) j0.E(equivalence);
            this.f116593b = reference;
        }
    }

    protected m() {
    }

    public static m<Object> c() {
        return b.f116584a;
    }

    public static m<Object> g() {
        return d.f116589a;
    }

    @z7.g
    protected abstract boolean a(T a10, T b10);

    @z7.g
    protected abstract int b(T t10);

    public final boolean d(@fj.a T a10, @fj.a T b10) {
        if (a10 == b10) {
            return true;
        }
        if (a10 == null || b10 == null) {
            return false;
        }
        return a(a10, b10);
    }

    public final k0<T> e(@fj.a T target) {
        return new c(this, target);
    }

    public final int f(@fj.a T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }

    public final <F> m<F> h(t<? super F, ? extends T> function) {
        return new u(function, this);
    }

    @com.google.common.annotations.b(serializable = true)
    public final <S extends T> m<Iterable<S>> i() {
        return new f0(this);
    }

    public final <S extends T> e<S> j(@g0 S reference) {
        return new e<>(reference);
    }
}
