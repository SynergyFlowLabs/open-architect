package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@z7.f("Use ImmutableMultimap, HashMultimap, or another implementation")
@com.google.common.annotations.b
public interface k8<K, V> {
    boolean I0(@fj.a @z7.c("K") Object key, @fj.a @z7.c(androidx.exifinterface.media.a.Y4) Object value);

    @z7.a
    boolean R(k8<? extends K, ? extends V> multimap);

    @z7.a
    Collection<V> c(@fj.a @z7.c("K") Object key);

    void clear();

    boolean containsKey(@fj.a @z7.c("K") Object key);

    boolean containsValue(@fj.a @z7.c(androidx.exifinterface.media.a.Y4) Object value);

    @z7.a
    Collection<V> d(@b9 K key, Iterable<? extends V> values);

    boolean equals(@fj.a Object obj);

    Collection<V> get(@b9 K key);

    int hashCode();

    boolean isEmpty();

    Collection<Map.Entry<K, V>> k();

    Set<K> keySet();

    q8<K> keys();

    Map<K, Collection<V>> l();

    @z7.a
    boolean put(@b9 K key, @b9 V value);

    @z7.a
    boolean remove(@fj.a @z7.c("K") Object key, @fj.a @z7.c(androidx.exifinterface.media.a.Y4) Object value);

    int size();

    @z7.a
    boolean v(@b9 K key, Iterable<? extends V> values);

    Collection<V> values();
}
