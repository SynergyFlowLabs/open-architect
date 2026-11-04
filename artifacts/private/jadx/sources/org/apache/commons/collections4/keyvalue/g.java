package org.apache.commons.collections4.keyvalue;

import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public class g<K, V> implements Map.Entry<K, V>, x<K, V>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335904c = -8453869361373831205L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f335905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f335906b;

    public g(Map<K, V> map, K k10) {
        this.f335905a = map;
        this.f335906b = k10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V value = getValue();
        K k10 = this.f335906b;
        if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
            if (value != null ? value.equals(entry.getValue()) : entry.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry, org.apache.commons.collections4.x
    public K getKey() {
        return this.f335906b;
    }

    @Override // java.util.Map.Entry, org.apache.commons.collections4.x
    public V getValue() {
        return this.f335905a.get(this.f335906b);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        V value = getValue();
        int iHashCode = 0;
        int iHashCode2 = getKey() == null ? 0 : getKey().hashCode();
        if (value != null) {
            iHashCode = value.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        if (v10 != this) {
            return this.f335905a.put(this.f335906b, v10);
        }
        throw new IllegalArgumentException("Cannot set value to this map entry");
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
