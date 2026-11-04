package org.apache.commons.collections4.splitmap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.map.l;
import org.apache.commons.collections4.s;

/* JADX INFO: loaded from: classes14.dex */
public class a<K, V> implements s<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Map<K, V> f336306a;

    public a(Map<K, V> map) {
        if (map == null) {
            throw new NullPointerException("Map must not be null.");
        }
        this.f336306a = map;
    }

    @Override // org.apache.commons.collections4.s
    public a0<K, V> T() {
        return new l(entrySet());
    }

    protected Map<K, V> a() {
        return this.f336306a;
    }

    @Override // org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return a().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return a().equals(obj);
    }

    @Override // org.apache.commons.collections4.r
    public V get(Object obj) {
        return a().get(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // org.apache.commons.collections4.r
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // org.apache.commons.collections4.r
    public Set<K> keySet() {
        return a().keySet();
    }

    @Override // org.apache.commons.collections4.r
    public V remove(Object obj) {
        return a().remove(obj);
    }

    @Override // org.apache.commons.collections4.r
    public int size() {
        return a().size();
    }

    public String toString() {
        return a().toString();
    }

    @Override // org.apache.commons.collections4.r
    public Collection<V> values() {
        return a().values();
    }

    protected a() {
    }
}
