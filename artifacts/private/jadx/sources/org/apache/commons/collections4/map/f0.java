package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class f0<K, V> extends e0<K, V> implements SortedMap<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336042e = -8751771676410385778L;

    protected f0(SortedMap<K, V> sortedMap, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        super(sortedMap, w0Var, w0Var2);
    }

    public static <K, V> f0<K, V> j(SortedMap<K, V> sortedMap, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        f0<K, V> f0Var = new f0<>(sortedMap, w0Var, w0Var2);
        if (sortedMap.size() > 0) {
            Map<K, V> mapE = f0Var.e(sortedMap);
            f0Var.clear();
            f0Var.a().putAll(mapE);
        }
        return f0Var;
    }

    public static <K, V> f0<K, V> k(SortedMap<K, V> sortedMap, w0<? super K, ? extends K> w0Var, w0<? super V, ? extends V> w0Var2) {
        return new f0<>(sortedMap, w0Var, w0Var2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return i().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return i().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new f0(i().headMap(k10), this.f336040b, this.f336041c);
    }

    protected SortedMap<K, V> i() {
        return (SortedMap) this.f336038a;
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return i().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new f0(i().subMap(k10, k11), this.f336040b, this.f336041c);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new f0(i().tailMap(k10), this.f336040b, this.f336041c);
    }
}
