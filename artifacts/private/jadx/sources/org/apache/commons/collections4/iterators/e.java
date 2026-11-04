package org.apache.commons.collections4.iterators;

/* JADX INFO: loaded from: classes14.dex */
public class e<K, V> implements org.apache.commons.collections4.a0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.collections4.a0<K, V> f335785a;

    public e(org.apache.commons.collections4.a0<K, V> a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("MapIterator must not be null");
        }
        this.f335785a = a0Var;
    }

    protected org.apache.commons.collections4.a0<K, V> b() {
        return this.f335785a;
    }

    @Override // org.apache.commons.collections4.a0
    public K getKey() {
        return this.f335785a.getKey();
    }

    @Override // org.apache.commons.collections4.a0
    public V getValue() {
        return this.f335785a.getValue();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public boolean hasNext() {
        return this.f335785a.hasNext();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public K next() {
        return this.f335785a.next();
    }

    @Override // org.apache.commons.collections4.a0, java.util.Iterator
    public void remove() {
        this.f335785a.remove();
    }

    @Override // org.apache.commons.collections4.a0
    public V setValue(V v10) {
        return this.f335785a.setValue(v10);
    }
}
