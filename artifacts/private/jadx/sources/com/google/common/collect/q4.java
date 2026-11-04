package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class q4<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r9.m
    private final p4<K, V> f117986a;

    q4(p4<K, V> multimap) {
        this.f117986a = (p4) com.google.common.base.j0.E(multimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f117986a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@fj.a Object o10) {
        return this.f117986a.containsValue(o10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return b8.R0(this.f117986a.u().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@fj.a Object o10) {
        com.google.common.base.k0<? super Map.Entry<K, V>> k0VarL0 = this.f117986a.l0();
        Iterator<Map.Entry<K, V>> it = this.f117986a.n().u().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (k0VarL0.apply(next) && com.google.common.base.d0.a(next.getValue(), o10)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c10) {
        return o7.J(this.f117986a.n().u(), com.google.common.base.l0.d(this.f117986a.l0(), b8.T0(com.google.common.base.l0.n(c10))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> c10) {
        return o7.J(this.f117986a.n().u(), com.google.common.base.l0.d(this.f117986a.l0(), b8.T0(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f117986a.size();
    }
}
