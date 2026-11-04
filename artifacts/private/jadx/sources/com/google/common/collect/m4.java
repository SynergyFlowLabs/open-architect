package com.google.common.collect;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class m4<K, V> extends n4<K, V> implements w7<K, V> {
    m4(w7<K, V> unfiltered, com.google.common.base.k0<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // com.google.common.collect.n4, com.google.common.collect.p4
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public w7<K, V> n() {
        return (w7) super.n();
    }

    @Override // com.google.common.collect.n4, com.google.common.collect.k8, com.google.common.collect.y9
    public List<V> c(@fj.a Object key) {
        return (List) super.c(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    public List<V> d(@b9 K key, Iterable<? extends V> values) {
        return (List) super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.n4, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public List<V> x(@b9 K key) {
        return (List) super.x((Object) key);
    }
}
