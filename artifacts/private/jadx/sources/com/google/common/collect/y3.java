package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class y3<E> extends j5<E> implements ga<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Comparator<? super E> f118324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient NavigableSet<E> f118325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<q8.a<E>> f118326c;

    class a extends r8.i<E> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<q8.a<E>> iterator() {
            return y3.this.z1();
        }

        @Override // com.google.common.collect.r8.i
        q8<E> l() {
            return y3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return y3.this.A1().entrySet().size();
        }
    }

    y3() {
    }

    abstract ga<E> A1();

    @Override // com.google.common.collect.ga
    public ga<E> J2() {
        return A1();
    }

    @Override // com.google.common.collect.ga
    public ga<E> T2(@b9 E toElement, x boundType) {
        return A1().b4(toElement, boundType).J2();
    }

    @Override // com.google.common.collect.ga
    public ga<E> b4(@b9 E fromElement, x boundType) {
        return A1().T2(fromElement, boundType).J2();
    }

    @Override // com.google.common.collect.ga, com.google.common.collect.ca
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f118324a;
        if (comparator != null) {
            return comparator;
        }
        a9 a9VarE = a9.i(A1().comparator()).E();
        this.f118324a = a9VarE;
        return a9VarE;
    }

    @Override // com.google.common.collect.j5, com.google.common.collect.q8
    public Set<q8.a<E>> entrySet() {
        Set<q8.a<E>> set = this.f118326c;
        if (set != null) {
            return set;
        }
        Set<q8.a<E>> setY1 = y1();
        this.f118326c = setY1;
        return setY1;
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> firstEntry() {
        return A1().lastEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.j5, com.google.common.collect.v4
    public q8<E> i1() {
        return A1();
    }

    @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return r8.n(this);
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> lastEntry() {
        return A1().firstEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollFirstEntry() {
        return A1().pollLastEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollLastEntry() {
        return A1().pollFirstEntry();
    }

    @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return a1();
    }

    @Override // com.google.common.collect.m5
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ga
    public ga<E> x3(@b9 E fromElement, x fromBoundType, @b9 E toElement, x toBoundType) {
        return A1().x3(toElement, toBoundType, fromElement, fromBoundType).J2();
    }

    Set<q8.a<E>> y1() {
        return new a();
    }

    abstract Iterator<q8.a<E>> z1();

    @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) c1(tArr);
    }

    @Override // com.google.common.collect.j5, com.google.common.collect.q8
    public NavigableSet<E> o() {
        NavigableSet<E> bVar = this.f118325b;
        if (bVar == null) {
            bVar = new ia.b<>(this);
            this.f118325b = bVar;
        }
        return bVar;
    }
}
