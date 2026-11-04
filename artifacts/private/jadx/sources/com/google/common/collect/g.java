package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class g<K, V> implements Map.Entry<K, V> {
    g() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(@fj.a Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (com.google.common.base.d0.a(getKey(), entry.getKey()) && com.google.common.base.d0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @b9
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @b9
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        int iHashCode = 0;
        int iHashCode2 = key == null ? 0 : key.hashCode();
        if (value != null) {
            iHashCode = value.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    @b9
    public V setValue(@b9 V value) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
