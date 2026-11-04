package com.google.common.collect;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class q5<K, V> extends g5<K, V> implements SortedMap<K, V> {

    protected class a extends b8.g0<K, V> {
        public a() {
            super(q5.this);
        }
    }

    protected q5() {
    }

    static int i1(@fj.a Comparator<?> comparator, @fj.a Object o10, @fj.a Object o11) {
        return comparator == null ? ((Comparable) o10).compareTo(o11) : comparator.compare(o10, o11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g5
    protected boolean P0(@fj.a Object key) {
        try {
            if (i1(comparator(), tailMap(key).firstKey(), key) == 0) {
                return true;
            }
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap<K, V> L0();

    @Override // java.util.SortedMap
    @fj.a
    public Comparator<? super K> comparator() {
        return i1().comparator();
    }

    protected SortedMap<K, V> f1(K fromKey, K toKey) {
        com.google.common.base.j0.e(i1(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
        return tailMap(fromKey).headMap(toKey);
    }

    @Override // java.util.SortedMap
    @b9
    public K firstKey() {
        return i1().firstKey();
    }

    public SortedMap<K, V> headMap(@b9 K toKey) {
        return i1().headMap(toKey);
    }

    @Override // java.util.SortedMap
    @b9
    public K lastKey() {
        return i1().lastKey();
    }

    public SortedMap<K, V> subMap(@b9 K fromKey, @b9 K toKey) {
        return i1().subMap(fromKey, toKey);
    }

    public SortedMap<K, V> tailMap(@b9 K fromKey) {
        return i1().tailMap(fromKey);
    }
}
