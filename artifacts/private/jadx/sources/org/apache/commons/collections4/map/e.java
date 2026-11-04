package org.apache.commons.collections4.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e<K, V> extends c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Map<K, V> f336038a;

    protected e() {
    }

    protected Map<K, V> a() {
        return this.f336038a;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        a().clear();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return a().equals(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        return a().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return a().keySet();
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        return a().put(k10, v10);
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        a().putAll(map);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return a().size();
    }

    public String toString() {
        return a().toString();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return a().values();
    }

    protected e(Map<K, V> map) {
        if (map == null) {
            throw new NullPointerException("Map must not be null.");
        }
        this.f336038a = map;
    }
}
