package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.q0;

/* JADX INFO: loaded from: classes14.dex */
public final class h0<K, V> extends e<K, V> implements a1, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336064b = 2737023427269031941L;

    private h0(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> b(Map<? extends K, ? extends V> map) {
        return map instanceof a1 ? map : new h0(map);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public org.apache.commons.collections4.a0<K, V> T() {
        Map<K, V> map = this.f336038a;
        return map instanceof org.apache.commons.collections4.t ? q0.b(((org.apache.commons.collections4.t) map).T()) : q0.b(new org.apache.commons.collections4.iterators.q(map));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return g0.l(super.entrySet());
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return org.apache.commons.collections4.set.o.k(super.keySet());
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

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return org.apache.commons.collections4.collection.h.i(super.values());
    }
}
