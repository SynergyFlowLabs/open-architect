package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.SortedMap;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class z<K, V> extends y<K, V> implements SortedMap<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336148e = 3359846175935304332L;

    protected z(SortedMap<K, V> sortedMap, l0<? super K> l0Var, l0<? super V> l0Var2) {
        super(sortedMap, l0Var, l0Var2);
    }

    public static <K, V> z<K, V> g(SortedMap<K, V> sortedMap, l0<? super K> l0Var, l0<? super V> l0Var2) {
        return new z<>(sortedMap, l0Var, l0Var2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return f().comparator();
    }

    protected SortedMap<K, V> f() {
        return (SortedMap) this.f336038a;
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return f().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new z(f().headMap(k10), this.f336146b, this.f336147c);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return f().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new z(f().subMap(k10, k11), this.f336146b, this.f336147c);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new z(f().tailMap(k10), this.f336146b, this.f336147c);
    }
}
