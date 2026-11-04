package com.google.common.cache;

import com.google.common.base.j0;
import com.google.common.base.s0;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t1;
import com.google.common.util.concurrent.u1;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b(emulated = true)
public abstract class g<K, V> {

    class a extends g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f116808b;

        a(final Executor val$executor) {
            this.f116808b = val$executor;
        }

        @Override // com.google.common.cache.g
        public V d(K k10) throws Exception {
            return (V) g.this.d(k10);
        }

        @Override // com.google.common.cache.g
        public Map<K, V> e(Iterable<? extends K> keys) throws Exception {
            return g.this.e(keys);
        }

        @Override // com.google.common.cache.g
        public t1<V> f(final K key, final V oldValue) {
            final g gVar = g.this;
            u1 u1VarB = u1.b(new Callable() { // from class: com.google.common.cache.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return gVar.f(key, oldValue).get();
                }
            });
            this.f116808b.execute(u1VarB);
            return u1VarB;
        }
    }

    private static final class b<K, V> extends g<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116809b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.common.base.t<K, V> f116810a;

        public b(com.google.common.base.t<K, V> computingFunction) {
            this.f116810a = (com.google.common.base.t) j0.E(computingFunction);
        }

        @Override // com.google.common.cache.g
        public V d(K k10) {
            return this.f116810a.apply((K) j0.E(k10));
        }
    }

    public static final class c extends RuntimeException {
        public c(String message) {
            super(message);
        }
    }

    private static final class d<V> extends g<Object, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116811b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0<V> f116812a;

        public d(s0<V> computingSupplier) {
            this.f116812a = (s0) j0.E(computingSupplier);
        }

        @Override // com.google.common.cache.g
        public V d(Object key) {
            j0.E(key);
            return this.f116812a.get();
        }
    }

    public static final class e extends UnsupportedOperationException {
        e() {
        }
    }

    protected g() {
    }

    @com.google.common.annotations.c
    public static <K, V> g<K, V> a(final g<K, V> loader, final Executor executor) {
        j0.E(loader);
        j0.E(executor);
        return loader.new a(executor);
    }

    public static <K, V> g<K, V> b(com.google.common.base.t<K, V> function) {
        return new b(function);
    }

    public static <V> g<Object, V> c(s0<V> supplier) {
        return new d(supplier);
    }

    public abstract V d(K key) throws Exception;

    public Map<K, V> e(Iterable<? extends K> keys) throws Exception {
        throw new e();
    }

    @com.google.common.annotations.c
    public t1<V> f(K key, V oldValue) throws Exception {
        j0.E(key);
        j0.E(oldValue);
        return h1.o(d(key));
    }
}
