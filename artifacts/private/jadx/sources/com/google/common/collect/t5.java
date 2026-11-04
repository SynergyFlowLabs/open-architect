package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class t5<K, V> extends p5<K, V> implements ja<K, V> {
    protected t5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.p5
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract ja<K, V> i1();

    @Override // com.google.common.collect.ja
    @fj.a
    public Comparator<? super V> Y() {
        return i1().Y();
    }

    @Override // com.google.common.collect.p5, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    public SortedSet<V> c(@fj.a Object key) {
        return i1().c(key);
    }

    @Override // com.google.common.collect.p5, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    public SortedSet<V> d(@b9 K key, Iterable<? extends V> values) {
        return i1().d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.p5, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public SortedSet<V> x(@b9 K key) {
        return i1().x((Object) key);
    }
}
