package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class l4<K, V> extends j4<K, V> implements r4<K, V> {
    l4(y9<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.j4, com.google.common.collect.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> b() {
        return z9.i(n().u(), l0());
    }

    @Override // com.google.common.collect.j4, com.google.common.collect.k8, com.google.common.collect.y9
    public Set<V> c(@fj.a Object key) {
        return (Set) super.c(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    public Set<V> d(@b9 K key, Iterable<? extends V> values) {
        return (Set) super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.j4, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public Set<V> x(@b9 K key) {
        return (Set) super.x((Object) key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public Set<Map.Entry<K, V>> u() {
        return (Set) super.u();
    }

    @Override // com.google.common.collect.j4, com.google.common.collect.p4
    public y9<K, V> n() {
        return (y9) this.f117488f;
    }
}
