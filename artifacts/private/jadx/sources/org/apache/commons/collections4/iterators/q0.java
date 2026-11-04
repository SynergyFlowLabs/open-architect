package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class q0<K, V> implements org.apache.commons.collections4.a0<K, V>, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.a0<? extends K, ? extends V> f335847a;

    private q0(org.apache.commons.collections4.a0<? extends K, ? extends V> a0Var) {
        this.f335847a = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> org.apache.commons.collections4.a0<K, V> b(org.apache.commons.collections4.a0<? extends K, ? extends V> a0Var) {
        if (a0Var != 0) {
            return a0Var instanceof a1 ? a0Var : new q0(a0Var);
        }
        throw new NullPointerException("MapIterator must not be null");
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        return this.f335847a.getKey();
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        return this.f335847a.getValue();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f335847a.hasNext();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        return this.f335847a.next();
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
