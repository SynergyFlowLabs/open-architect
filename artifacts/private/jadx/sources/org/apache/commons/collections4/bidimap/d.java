package org.apache.commons.collections4.bidimap;

import java.util.Comparator;
import java.util.SortedMap;
import org.apache.commons.collections4.u0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<K, V> extends c<K, V> implements u0<K, V> {
    public d(u0<K, V> u0Var) {
        super(u0Var);
    }

    @Override // org.apache.commons.collections4.u0
    public Comparator<? super V> Y() {
        return a().Y();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return a().comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bidimap.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u0<K, V> a() {
        return (u0) super.a();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return a().headMap(k10);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return a().subMap(k10, k11);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return a().tailMap(k10);
    }

    @Override // org.apache.commons.collections4.bidimap.c, org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public u0<V, K> N() {
        return a().N();
    }
}
