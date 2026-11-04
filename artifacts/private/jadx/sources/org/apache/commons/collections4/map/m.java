package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class m<K, V> extends e<K, V> implements org.apache.commons.collections4.g<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336075b = 7450927208116179316L;

    protected m(Map<K, V> map) {
        super(map);
    }

    public static <K, V> m<K, V> b(Map<K, V> map) {
        return new m<>(map);
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
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return org.apache.commons.collections4.set.o.k(this.f336038a.entrySet());
    }

    @Override // org.apache.commons.collections4.g
    public boolean isFull() {
        return true;
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return org.apache.commons.collections4.set.o.k(this.f336038a.keySet());
    }

    @Override // org.apache.commons.collections4.g
    public int o0() {
        return size();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (this.f336038a.containsKey(k10)) {
            return this.f336038a.put(k10, v10);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        Iterator<? extends K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
            }
        }
        this.f336038a.putAll(map);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return org.apache.commons.collections4.collection.h.i(this.f336038a.values());
    }
}
