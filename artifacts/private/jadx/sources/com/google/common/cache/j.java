package com.google.common.cache;

import com.google.common.base.j0;
import com.google.common.collect.m5;
import com.google.common.collect.n6;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
public abstract class j<K, V> extends m5 implements c<K, V> {

    public static abstract class a<K, V> extends j<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<K, V> f116819a;

        protected a(c<K, V> delegate) {
            this.f116819a = (c) j0.E(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.j, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public final c<K, V> i1() {
            return this.f116819a;
        }
    }

    protected j() {
    }

    @Override // com.google.common.cache.c
    public void D(Object key) {
        i1().D(key);
    }

    @Override // com.google.common.cache.c
    public void L() {
        i1().L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public abstract c<K, V> i1();

    @Override // com.google.common.cache.c
    public V O(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        return i1().O(key, valueLoader);
    }

    @Override // com.google.common.cache.c
    @fj.a
    public V h0(Object key) {
        return i1().h0(key);
    }

    @Override // com.google.common.cache.c
    public void i0(Iterable<? extends Object> keys) {
        i1().i0(keys);
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> l() {
        return i1().l();
    }

    @Override // com.google.common.cache.c
    public void p0() {
        i1().p0();
    }

    @Override // com.google.common.cache.c
    public void put(K key, V value) {
        i1().put(key, value);
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> m10) {
        i1().putAll(m10);
    }

    @Override // com.google.common.cache.c
    public n6<K, V> s0(Iterable<? extends Object> keys) {
        return i1().s0(keys);
    }

    @Override // com.google.common.cache.c
    public long size() {
        return i1().size();
    }

    @Override // com.google.common.cache.c
    public h t0() {
        return i1().t0();
    }
}
