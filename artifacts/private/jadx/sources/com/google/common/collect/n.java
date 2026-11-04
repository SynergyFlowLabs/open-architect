package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class n<K, V> extends p<K, V> {
    n(SortedMap<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> l() {
        return (SortedMap) super.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> t() {
        return (SortedMap) super.t();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Set<K> e() {
        return y();
    }
}
