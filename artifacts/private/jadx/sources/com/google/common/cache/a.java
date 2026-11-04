package com.google.common.cache;

import com.google.common.collect.b8;
import com.google.common.collect.n6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b
public abstract class a<K, V> implements c<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    public static final class C1048a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f116720a = r.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f116721b = r.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q f116722c = r.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q f116723d = r.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final q f116724e = r.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final q f116725f = r.a();

        private static long h(long value) {
            if (value >= 0) {
                return value;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.a.b
        public void a(int count) {
            this.f116720a.add(count);
        }

        @Override // com.google.common.cache.a.b
        public void b() {
            this.f116725f.a();
        }

        @Override // com.google.common.cache.a.b
        public void c(long loadTime) {
            this.f116722c.a();
            this.f116724e.add(loadTime);
        }

        @Override // com.google.common.cache.a.b
        public void d(int count) {
            this.f116721b.add(count);
        }

        @Override // com.google.common.cache.a.b
        public void e(long loadTime) {
            this.f116723d.a();
            this.f116724e.add(loadTime);
        }

        @Override // com.google.common.cache.a.b
        public h f() {
            return new h(h(this.f116720a.sum()), h(this.f116721b.sum()), h(this.f116722c.sum()), h(this.f116723d.sum()), h(this.f116724e.sum()), h(this.f116725f.sum()));
        }

        public void g(b other) {
            h hVarF = other.f();
            this.f116720a.add(hVarF.c());
            this.f116721b.add(hVarF.j());
            this.f116722c.add(hVarF.h());
            this.f116723d.add(hVarF.f());
            this.f116724e.add(hVarF.n());
            this.f116725f.add(hVarF.b());
        }
    }

    public interface b {
        void a(int count);

        void b();

        void c(long loadTime);

        void d(int count);

        void e(long loadTime);

        h f();
    }

    protected a() {
    }

    @Override // com.google.common.cache.c
    public void D(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void L() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public V O(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void i0(Iterable<? extends Object> keys) {
        Iterator<? extends Object> it = keys.iterator();
        while (it.hasNext()) {
            D(it.next());
        }
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> l() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void p0() {
    }

    @Override // com.google.common.cache.c
    public void put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> m10) {
        for (Map.Entry<? extends K, ? extends V> entry : m10.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.c
    public n6<K, V> s0(Iterable<? extends Object> keys) {
        V vH0;
        LinkedHashMap linkedHashMapC0 = b8.c0();
        for (Object obj : keys) {
            if (!linkedHashMapC0.containsKey(obj) && (vH0 = h0(obj)) != null) {
                linkedHashMapC0.put(obj, vH0);
            }
        }
        return n6.g(linkedHashMapC0);
    }

    @Override // com.google.common.cache.c
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public h t0() {
        throw new UnsupportedOperationException();
    }
}
