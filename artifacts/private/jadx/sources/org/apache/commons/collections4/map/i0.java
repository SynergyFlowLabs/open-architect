package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.r0;
import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
public final class i0<K, V> extends f<K, V> implements a1, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336065b = 8136428161720526266L;

    private i0(org.apache.commons.collections4.j0<? extends K, ? extends V> j0Var) {
        super(j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> org.apache.commons.collections4.j0<K, V> c(org.apache.commons.collections4.j0<? extends K, ? extends V> j0Var) {
        return j0Var instanceof a1 ? j0Var : new i0(j0Var);
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

    @Override // org.apache.commons.collections4.map.f, org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return r0.b(a().T());
    }
}
