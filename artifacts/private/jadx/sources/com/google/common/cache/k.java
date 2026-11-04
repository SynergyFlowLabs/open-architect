package com.google.common.cache;

import com.google.common.base.j0;
import com.google.common.collect.n6;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
public abstract class k<K, V> extends j<K, V> implements m<K, V> {

    public static abstract class a<K, V> extends k<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<K, V> f116820a;

        protected a(m<K, V> delegate) {
            this.f116820a = (m) j0.E(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.k, com.google.common.cache.j
        /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
        public final m<K, V> i1() {
            return this.f116820a;
        }
    }

    protected k() {
    }

    @Override // com.google.common.cache.m
    public void G0(K key) {
        i1().G0(key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.j
    /* JADX INFO: renamed from: N0 */
    public abstract m<K, V> i1();

    @Override // com.google.common.cache.m, com.google.common.base.t
    public V apply(K key) {
        return i1().apply(key);
    }

    @Override // com.google.common.cache.m
    @z7.a
    public V get(K key) throws ExecutionException {
        return i1().get(key);
    }

    @Override // com.google.common.cache.m
    @z7.a
    public V v0(K key) {
        return i1().v0(key);
    }

    @Override // com.google.common.cache.m
    @z7.a
    public n6<K, V> z0(Iterable<? extends K> keys) throws ExecutionException {
        return i1().z0(keys);
    }
}
