package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
@z7.j(containerOf = {"B"})
public final class g6<B> extends g5<Class<? extends B>, B> implements a0<B>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g6<Object> f117422b = new g6<>(n6.q());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n6<Class<? extends B>, B> f117423a;

    public static final class b<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6.b<Class<? extends B>, B> f117424a = n6.b();

        private static <T> T b(Class<T> cls, Object obj) {
            return (T) com.google.common.primitives.q.f(cls).cast(obj);
        }

        public g6<B> a() {
            n6<Class<? extends B>, B> n6VarD = this.f117424a.d();
            return n6VarD.isEmpty() ? g6.i1() : new g6<>(n6VarD);
        }

        @z7.a
        public <T extends B> b<B> c(Class<T> key, T value) {
            this.f117424a.i(key, value);
            return this;
        }

        @z7.a
        public <T extends B> b<B> d(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f117424a.i((Class<? extends B>) key, (B) b(key, value));
            }
            return this;
        }
    }

    public static <B> b<B> c1() {
        return new b<>();
    }

    public static <B, S extends B> g6<B> f1(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof g6 ? (g6) map : new b().d(map).a();
    }

    public static <B> g6<B> i1() {
        return (g6<B>) f117422b;
    }

    public static <B, T extends B> g6<B> k1(Class<T> type, T value) {
        return new g6<>(n6.s(type, value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5, com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public Map<Class<? extends B>, B> i1() {
        return this.f117423a;
    }

    @Override // com.google.common.collect.a0
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public <T extends B> T d1(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        return isEmpty() ? i1() : this;
    }

    @Override // com.google.common.collect.a0
    @fj.a
    public <T extends B> T u1(Class<T> cls) {
        return this.f117423a.get(com.google.common.base.j0.E(cls));
    }

    private g6(n6<Class<? extends B>, B> delegate) {
        this.f117423a = delegate;
    }
}
