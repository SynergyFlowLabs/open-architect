package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.SortedMap;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class s<K, V> extends r<K, V> implements SortedMap<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336105d = 2715322183617658933L;

    protected s(SortedMap<K, V> sortedMap, org.apache.commons.collections4.n<? extends V> nVar) {
        super(sortedMap, nVar);
    }

    public static <K, V> s<K, V> e(SortedMap<K, V> sortedMap, org.apache.commons.collections4.n<? extends V> nVar) {
        return new s<>(sortedMap, nVar);
    }

    public static <K, V> s<K, V> f(SortedMap<K, V> sortedMap, w0<? super K, ? extends V> w0Var) {
        return new s<>(sortedMap, w0Var);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return d().comparator();
    }

    protected SortedMap<K, V> d() {
        return (SortedMap) this.f336038a;
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return d().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new s(d().headMap(k10), this.f336104b);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return d().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new s(d().subMap(k10, k11), this.f336104b);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new s(d().tailMap(k10), this.f336104b);
    }

    protected s(SortedMap<K, V> sortedMap, w0<? super K, ? extends V> w0Var) {
        super(sortedMap, w0Var);
    }
}
