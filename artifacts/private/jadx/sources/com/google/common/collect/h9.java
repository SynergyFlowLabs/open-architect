package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
@z7.f("Use ImmutableRangeMap or TreeRangeMap")
public interface h9<K extends Comparable, V> {
    void a(f9<K> range);

    f9<K> b();

    h9<K, V> c(f9<K> range);

    void clear();

    Map<f9<K>, V> d();

    @fj.a
    Map.Entry<f9<K>, V> e(K key);

    boolean equals(@fj.a Object o10);

    Map<f9<K>, V> f();

    void g(h9<K, ? extends V> rangeMap);

    void h(f9<K> range, V value);

    int hashCode();

    @fj.a
    V i(K key);

    void j(f9<K> range, V value);

    String toString();
}
