package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface g0<K, V> {
    boolean O0(Object obj, Object obj2);

    a0<K, V> T();

    boolean a(Object obj, Object obj2);

    boolean b(g0<? extends K, ? extends V> g0Var);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection<V> get(K k10);

    boolean isEmpty();

    Collection<Map.Entry<K, V>> k();

    Set<K> keySet();

    e0<K> keys();

    Map<K, Collection<V>> l();

    boolean put(K k10, V v10);

    boolean putAll(Map<? extends K, ? extends V> map);

    Collection<V> remove(Object obj);

    int size();

    boolean v(K k10, Iterable<? extends V> iterable);

    Collection<V> values();
}
