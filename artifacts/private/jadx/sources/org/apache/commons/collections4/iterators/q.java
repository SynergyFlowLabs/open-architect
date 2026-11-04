package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class q<K, V> implements org.apache.commons.collections4.a0<K, V>, org.apache.commons.collections4.p0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f335843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f335844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map.Entry<K, V> f335845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335846d = false;

    public q(Map<K, V> map) {
        this.f335843a = map;
        this.f335844b = map.entrySet().iterator();
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        Map.Entry<K, V> entry = this.f335845c;
        if (entry != null) {
            return entry.getKey();
        }
        throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        Map.Entry<K, V> entry = this.f335845c;
        if (entry != null) {
            return entry.getValue();
        }
        throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f335844b.hasNext();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        Map.Entry<K, V> next = this.f335844b.next();
        this.f335845c = next;
        this.f335846d = true;
        return next.getKey();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public void remove() {
        if (!this.f335846d) {
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
        this.f335844b.remove();
        this.f335845c = null;
        this.f335846d = false;
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335844b = this.f335843a.entrySet().iterator();
        this.f335845c = null;
        this.f335846d = false;
    }

    @Override // org.apache.commons.collections4.a0
    public V setValue(V v10) {
        Map.Entry<K, V> entry = this.f335845c;
        if (entry != null) {
            return entry.setValue(v10);
        }
        throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
    }

    public String toString() {
        if (this.f335845c == null) {
            return "MapIterator[]";
        }
        return "MapIterator[" + getKey() + "=" + getValue() + "]";
    }
}
