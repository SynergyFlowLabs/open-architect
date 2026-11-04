package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class j5<E> extends v4<E> implements q8<E> {

    protected class a extends r8.h<E> {
        public a() {
        }

        @Override // com.google.common.collect.r8.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return r8.h(l().entrySet().iterator());
        }

        @Override // com.google.common.collect.r8.h
        q8<E> l() {
            return j5.this;
        }
    }

    protected j5() {
    }

    @Override // com.google.common.collect.q8
    @z7.a
    public int H(@b9 E element, int occurrences) {
        return i1().H(element, occurrences);
    }

    @Override // com.google.common.collect.v4
    protected boolean N0(Collection<? extends E> elementsToAdd) {
        return r8.c(this, elementsToAdd);
    }

    @Override // com.google.common.collect.v4
    protected void P0() {
        p7.g(entrySet().iterator());
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        return i1().P3(element);
    }

    @Override // com.google.common.collect.q8
    @z7.a
    public boolean Q2(@b9 E element, int oldCount, int newCount) {
        return i1().Q2(element, oldCount, newCount);
    }

    @Override // com.google.common.collect.v4
    protected boolean S0(@fj.a Object object) {
        return P3(object) > 0;
    }

    @Override // com.google.common.collect.v4
    protected boolean X0(@fj.a Object element) {
        return f0(element, 1) > 0;
    }

    @Override // com.google.common.collect.v4
    protected boolean Y0(Collection<?> elementsToRemove) {
        return r8.p(this, elementsToRemove);
    }

    @Override // com.google.common.collect.v4
    protected boolean Z0(Collection<?> elementsToRetain) {
        return r8.s(this, elementsToRetain);
    }

    @Override // com.google.common.collect.q8
    public Set<q8.a<E>> entrySet() {
        return i1().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public boolean equals(@fj.a Object object) {
        return object == this || i1().equals(object);
    }

    @Override // com.google.common.collect.q8
    @z7.a
    public int f0(@fj.a Object element, int occurrences) {
        return i1().f0(element, occurrences);
    }

    @Override // com.google.common.collect.v4
    protected String f1() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.q8
    @z7.a
    public int g1(@b9 E element, int count) {
        return i1().g1(element, count);
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public int hashCode() {
        return i1().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v4
    public abstract q8<E> i1();

    protected boolean k1(@b9 E element) {
        H(element, 1);
        return true;
    }

    protected int m1(@fj.a Object object) {
        for (q8.a<E> aVar : entrySet()) {
            if (com.google.common.base.d0.a(aVar.X0(), object)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    protected boolean n1(@fj.a Object object) {
        return r8.i(this, object);
    }

    @Override // com.google.common.collect.q8
    public Set<E> o() {
        return i1().o();
    }

    protected int q1() {
        return entrySet().hashCode();
    }

    protected Iterator<E> r1() {
        return r8.n(this);
    }

    protected int t1(@b9 E element, int count) {
        return r8.v(this, element, count);
    }

    protected boolean v1(@b9 E element, int oldCount, int newCount) {
        return r8.w(this, element, oldCount, newCount);
    }

    protected int x1() {
        return r8.o(this);
    }
}
