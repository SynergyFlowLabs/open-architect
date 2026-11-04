package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class ia {

    static class a<E> extends r8.h<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        private final ga<E> f117482a;

        a(ga<E> multiset) {
            this.f117482a = multiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return l().comparator();
        }

        @Override // java.util.SortedSet
        @b9
        public E first() {
            return (E) ia.d(l().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@b9 E toElement) {
            return l().T2(toElement, x.OPEN).o();
        }

        @Override // com.google.common.collect.r8.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return r8.h(l().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @b9
        public E last() {
            return (E) ia.d(l().lastEntry());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r8.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final ga<E> l() {
            return this.f117482a;
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
            return l().x3(fromElement, x.CLOSED, toElement, x.OPEN).o();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@b9 E fromElement) {
            return l().b4(fromElement, x.CLOSED).o();
        }
    }

    @com.google.common.annotations.c
    static class b<E> extends a<E> implements NavigableSet<E> {
        b(ga<E> multiset) {
            super(multiset);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E ceiling(@b9 E e10) {
            return (E) ia.c(l().b4(e10, x.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(l().J2());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E floor(@b9 E e10) {
            return (E) ia.c(l().T2(e10, x.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
            return new b(l().T2(toElement, x.l(inclusive)));
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E higher(@b9 E e10) {
            return (E) ia.c(l().b4(e10, x.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E lower(@b9 E e10) {
            return (E) ia.c(l().T2(e10, x.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollFirst() {
            return (E) ia.c(l().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollLast() {
            return (E) ia.c(l().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
            return new b(l().x3(fromElement, x.l(fromInclusive), toElement, x.l(toInclusive)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
            return new b(l().b4(fromElement, x.l(inclusive)));
        }
    }

    private ia() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public static <E> E c(@fj.a q8.a<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E d(@fj.a q8.a<E> entry) {
        if (entry != null) {
            return entry.X0();
        }
        throw new NoSuchElementException();
    }
}
