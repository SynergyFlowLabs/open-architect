package org.apache.commons.collections4.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public class l<K, V> implements org.apache.commons.collections4.a0<K, V>, p0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Set<Map.Entry<K, V>> f336072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient Iterator<Map.Entry<K, V>> f336073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Map.Entry<K, V> f336074c;

    public l(Set<Map.Entry<K, V>> set) {
        this.f336072a = set;
        reset();
    }

    protected synchronized Map.Entry<K, V> b() {
        Map.Entry<K, V> entry;
        try {
            entry = this.f336074c;
            if (entry == null) {
                throw new IllegalStateException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return entry;
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        return b().getKey();
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        return b().getValue();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f336073b.hasNext();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        this.f336074c = this.f336073b.next();
        return getKey();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public void remove() {
        this.f336073b.remove();
        this.f336074c = null;
    }

    public synchronized void reset() {
        try {
            this.f336073b = this.f336072a.iterator();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.commons.collections4.a0
    public V setValue(V v10) {
        return b().setValue(v10);
    }
}
