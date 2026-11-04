package org.apache.commons.collections4.iterators;

/* JADX INFO: loaded from: classes14.dex */
public class f<K, V> implements org.apache.commons.collections4.k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.k0<K, V> f335793a;

    public f(org.apache.commons.collections4.k0<K, V> k0Var) {
        if (k0Var == null) {
            throw new NullPointerException("OrderedMapIterator must not be null");
        }
        this.f335793a = k0Var;
    }

    protected org.apache.commons.collections4.k0<K, V> b() {
        return this.f335793a;
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        return this.f335793a.getKey();
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        return this.f335793a.getValue();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f335793a.hasNext();
    }

    @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return this.f335793a.hasPrevious();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        return this.f335793a.next();
    }

    @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
    public K previous() {
        return this.f335793a.previous();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public void remove() {
        this.f335793a.remove();
    }

    @Override // org.apache.commons.collections4.a0
    public V setValue(V v10) {
        return this.f335793a.setValue(v10);
    }
}
