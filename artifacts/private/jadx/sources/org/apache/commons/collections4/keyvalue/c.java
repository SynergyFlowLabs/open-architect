package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<K, V> implements Map.Entry<K, V>, x<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry<K, V> f335900a;

    public c(Map.Entry<K, V> entry) {
        if (entry == null) {
            throw new NullPointerException("Map Entry must not be null.");
        }
        this.f335900a = entry;
    }

    protected Map.Entry<K, V> a() {
        return this.f335900a;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.f335900a.equals(obj);
    }

    @Override // java.util.Map.Entry, org.apache.commons.collections4.x
    public K getKey() {
        return this.f335900a.getKey();
    }

    @Override // java.util.Map.Entry, org.apache.commons.collections4.x
    public V getValue() {
        return this.f335900a.getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f335900a.hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        return this.f335900a.setValue(v10);
    }

    public String toString() {
        return this.f335900a.toString();
    }
}
