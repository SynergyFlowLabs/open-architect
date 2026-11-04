package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public final class v {

    private static class b<E> implements t<Object, E>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116692b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g0
        private final E f116693a;

        public b(@g0 E value) {
            this.f116693a = value;
        }

        @Override // com.google.common.base.t
        @g0
        public E apply(@fj.a Object from) {
            return this.f116693a;
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof b) {
                return d0.a(this.f116693a, ((b) obj).f116693a);
            }
            return false;
        }

        public int hashCode() {
            E e10 = this.f116693a;
            if (e10 == null) {
                return 0;
            }
            return e10.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f116693a + ")";
        }
    }

    private static class c<K, V> implements t<K, V>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116694c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, ? extends V> f116695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g0
        final V f116696b;

        c(Map<K, ? extends V> map, @g0 V defaultValue) {
            this.f116695a = (Map) j0.E(map);
            this.f116696b = defaultValue;
        }

        @Override // com.google.common.base.t
        @g0
        public V apply(@g0 K k10) {
            V v10 = this.f116695a.get(k10);
            return (v10 != null || this.f116695a.containsKey(k10)) ? (V) c0.a(v10) : this.f116696b;
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof c) {
                c cVar = (c) o10;
                if (this.f116695a.equals(cVar.f116695a) && d0.a(this.f116696b, cVar.f116696b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f116695a, this.f116696b);
        }

        public String toString() {
            return "Functions.forMap(" + this.f116695a + ", defaultValue=" + this.f116696b + ")";
        }
    }

    private static class d<A, B, C> implements t<A, C>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116697c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t<B, C> f116698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t<A, ? extends B> f116699b;

        public d(t<B, C> g10, t<A, ? extends B> f10) {
            this.f116698a = (t) j0.E(g10);
            this.f116699b = (t) j0.E(f10);
        }

        @Override // com.google.common.base.t
        @g0
        public C apply(@g0 A a10) {
            return (C) this.f116698a.apply(this.f116699b.apply(a10));
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f116699b.equals(dVar.f116699b) && this.f116698a.equals(dVar.f116698a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f116698a.hashCode() ^ this.f116699b.hashCode();
        }

        public String toString() {
            return this.f116698a + "(" + this.f116699b + ")";
        }
    }

    private static class e<K, V> implements t<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116700b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f116701a;

        e(Map<K, V> map) {
            this.f116701a = (Map) j0.E(map);
        }

        @Override // com.google.common.base.t
        @g0
        public V apply(@g0 K k10) {
            V v10 = this.f116701a.get(k10);
            j0.u(v10 != null || this.f116701a.containsKey(k10), "Key '%s' not present in map", k10);
            return (V) c0.a(v10);
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof e) {
                return this.f116701a.equals(((e) o10).f116701a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116701a.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.f116701a + ")";
        }
    }

    private enum f implements t<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.t
        @fj.a
        public Object apply(@fj.a Object o10) {
            return o10;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    private static class g<T> implements t<T, Boolean>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116704b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k0<T> f116705a;

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(@g0 T t10) {
            return Boolean.valueOf(this.f116705a.apply(t10));
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof g) {
                return this.f116705a.equals(((g) obj).f116705a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116705a.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.f116705a + ")";
        }

        private g(k0<T> predicate) {
            this.f116705a = (k0) j0.E(predicate);
        }
    }

    private static class h<F, T> implements t<F, T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116706b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0<T> f116707a;

        @Override // com.google.common.base.t
        @g0
        public T apply(@g0 F input) {
            return this.f116707a.get();
        }

        @Override // com.google.common.base.t
        public boolean equals(@fj.a Object obj) {
            if (obj instanceof h) {
                return this.f116707a.equals(((h) obj).f116707a);
            }
            return false;
        }

        public int hashCode() {
            return this.f116707a.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.f116707a + ")";
        }

        private h(s0<T> supplier) {
            this.f116707a = (s0) j0.E(supplier);
        }
    }

    private enum i implements t<Object, String> {
        INSTANCE;

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String apply(Object o10) {
            j0.E(o10);
            return o10.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    private v() {
    }

    public static <A, B, C> t<A, C> a(t<B, C> g10, t<A, ? extends B> f10) {
        return new d(g10, f10);
    }

    public static <E> t<Object, E> b(@g0 E value) {
        return new b(value);
    }

    public static <K, V> t<K, V> c(Map<K, V> map) {
        return new e(map);
    }

    public static <K, V> t<K, V> d(Map<K, ? extends V> map, @g0 V defaultValue) {
        return new c(map, defaultValue);
    }

    public static <T> t<T, Boolean> e(k0<T> predicate) {
        return new g(predicate);
    }

    public static <F, T> t<F, T> f(s0<T> supplier) {
        return new h(supplier);
    }

    public static <E> t<E, E> g() {
        return f.INSTANCE;
    }

    public static t<Object, String> h() {
        return i.INSTANCE;
    }
}
