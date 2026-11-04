package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class i<E> extends AbstractCollection<E> implements q8<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<E> f117459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<q8.a<E>> f117460b;

    class a extends r8.h<E> {
        a() {
        }

        @Override // com.google.common.collect.r8.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return i.this.l();
        }

        @Override // com.google.common.collect.r8.h
        q8<E> l() {
            return i.this;
        }
    }

    class b extends r8.i<E> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<q8.a<E>> iterator() {
            return i.this.m();
        }

        @Override // com.google.common.collect.r8.i
        q8<E> l() {
            return i.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.k();
        }
    }

    i() {
    }

    @z7.a
    public int H(@b9 E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @z7.a
    public boolean Q2(@b9 E element, int oldCount, int newCount) {
        return r8.w(this, element, oldCount, newCount);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    @z7.a
    public final boolean add(@b9 E element) {
        H(element, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    public final boolean addAll(Collection<? extends E> elementsToAdd) {
        return r8.c(this, elementsToAdd);
    }

    Set<E> c() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public boolean contains(@fj.a Object element) {
        return P3(element) > 0;
    }

    public Set<q8.a<E>> entrySet() {
        Set<q8.a<E>> set = this.f117460b;
        if (set != null) {
            return set;
        }
        Set<q8.a<E>> setI = i();
        this.f117460b = setI;
        return setI;
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public final boolean equals(@fj.a Object object) {
        return r8.i(this, object);
    }

    @z7.a
    public int f0(@fj.a Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @z7.a
    public int g1(@b9 E element, int count) {
        return r8.v(this, element, count);
    }

    @Override // java.util.Collection, com.google.common.collect.q8
    public final int hashCode() {
        return entrySet().hashCode();
    }

    Set<q8.a<E>> i() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    abstract int k();

    abstract Iterator<E> l();

    abstract Iterator<q8.a<E>> m();

    public Set<E> o() {
        Set<E> set = this.f117459a;
        if (set != null) {
            return set;
        }
        Set<E> setC = c();
        this.f117459a = setC;
        return setC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    @z7.a
    public final boolean remove(@fj.a Object element) {
        return f0(element, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    @z7.a
    public final boolean removeAll(Collection<?> elementsToRemove) {
        return r8.p(this, elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    @z7.a
    public final boolean retainAll(Collection<?> elementsToRetain) {
        return r8.s(this, elementsToRetain);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.q8
    public final String toString() {
        return entrySet().toString();
    }
}
