package org.apache.commons.collections4.multimap;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.g0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<K, V> implements g0<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336184b = 20150612;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0<K, V> f336185a;

    protected c(g0<K, V> g0Var) {
        if (g0Var == null) {
            throw new NullPointerException("MultiValuedMap must not be null.");
        }
        this.f336185a = g0Var;
    }

    @Override // org.apache.commons.collections4.g0
    public boolean O0(Object obj, Object obj2) {
        return c().O0(obj, obj2);
    }

    @Override // org.apache.commons.collections4.g0
    public a0<K, V> T() {
        return c().T();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean a(Object obj, Object obj2) {
        return c().a(obj, obj2);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean b(g0<? extends K, ? extends V> g0Var) {
        return c().b(g0Var);
    }

    protected g0<K, V> c() {
        return this.f336185a;
    }

    @Override // org.apache.commons.collections4.g0
    public void clear() {
        c().clear();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return c().equals(obj);
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> get(K k10) {
        return c().get(k10);
    }

    public int hashCode() {
        return c().hashCode();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<Map.Entry<K, V>> k() {
        return c().k();
    }

    @Override // org.apache.commons.collections4.g0
    public Set<K> keySet() {
        return c().keySet();
    }

    @Override // org.apache.commons.collections4.g0
    public e0<K> keys() {
        return c().keys();
    }

    @Override // org.apache.commons.collections4.g0
    public Map<K, Collection<V>> l() {
        return c().l();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean put(K k10, V v10) {
        return c().put(k10, v10);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean putAll(Map<? extends K, ? extends V> map) {
        return c().putAll(map);
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> remove(Object obj) {
        return c().remove(obj);
    }

    @Override // org.apache.commons.collections4.g0
    public int size() {
        return c().size();
    }

    public String toString() {
        return c().toString();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean v(K k10, Iterable<? extends V> iterable) {
        return c().v(k10, iterable);
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> values() {
        return c().values();
    }
}
