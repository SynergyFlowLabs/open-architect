package org.apache.commons.collections4;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes14.dex */
public interface u0<K, V> extends h0<K, V>, SortedMap<K, V> {
    @Override // org.apache.commons.collections4.h0, org.apache.commons.collections4.e
    u0<V, K> N();

    Comparator<? super V> Y();
}
