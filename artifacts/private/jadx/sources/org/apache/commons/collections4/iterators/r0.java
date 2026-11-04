package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class r0<K, V> implements org.apache.commons.collections4.k0<K, V>, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.k0<? extends K, ? extends V> f335851a;

    /* JADX WARN: Multi-variable type inference failed */
    private r0(org.apache.commons.collections4.k0<K, ? extends V> k0Var) {
        this.f335851a = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> org.apache.commons.collections4.k0<K, V> b(org.apache.commons.collections4.k0<K, ? extends V> k0Var) {
        if (k0Var != 0) {
            return k0Var instanceof a1 ? k0Var : new r0(k0Var);
        }
        throw new NullPointerException("OrderedMapIterator must not be null");
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        return this.f335851a.getKey();
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        return this.f335851a.getValue();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f335851a.hasNext();
    }

    @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return this.f335851a.hasPrevious();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        return this.f335851a.next();
    }

    @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
    public K previous() {
        return this.f335851a.previous();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // org.apache.commons.collections4.a0
    public V setValue(V v10) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }
}
