package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class j0<K, V> extends h<K, V> implements a1, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336069b = 5805344239827376360L;

    private j0(SortedMap<K, ? extends V> sortedMap) {
        super(sortedMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> SortedMap<K, V> c(SortedMap<K, ? extends V> sortedMap) {
        return sortedMap instanceof a1 ? sortedMap : new j0(sortedMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
    public Comparator<? super K> comparator() {
        return a().comparator();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return g0.l(super.entrySet());
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap, org.apache.commons.collections4.j0
    public K firstKey() {
        return a().firstKey();
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new j0(a().headMap(k10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return org.apache.commons.collections4.set.o.k(super.keySet());
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap, org.apache.commons.collections4.j0
    public K lastKey() {
        return a().lastKey();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new j0(a().subMap(k10, k11));
    }

    @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new j0(a().tailMap(k10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return org.apache.commons.collections4.collection.h.i(super.values());
    }
}
