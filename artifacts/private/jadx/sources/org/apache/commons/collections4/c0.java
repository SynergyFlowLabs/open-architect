package org.apache.commons.collections4;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public interface c0<K, V> extends t<K, Object> {
    boolean O0(K k10, V v10);

    @Override // java.util.Map, org.apache.commons.collections4.r
    boolean containsValue(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.r
    Object get(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.n0
    Object put(K k10, Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.r
    Object remove(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.r
    int size();

    @Override // java.util.Map, org.apache.commons.collections4.r
    Collection<Object> values();
}
