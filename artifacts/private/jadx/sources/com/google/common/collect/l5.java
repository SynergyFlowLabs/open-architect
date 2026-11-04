package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public abstract class l5<E> extends s5<E> implements NavigableSet<E> {

    protected class a extends z9.g<E> {
        public a() {
            super(l5.this);
        }
    }

    protected l5() {
    }

    @b9
    protected E A1() {
        return descendingIterator().next();
    }

    @fj.a
    protected E C1(@b9 E e10) {
        return (E) p7.I(headSet(e10, false).descendingIterator(), null);
    }

    @fj.a
    protected E D1() {
        return (E) p7.T(iterator());
    }

    @fj.a
    protected E F1() {
        return (E) p7.T(descendingIterator());
    }

    protected NavigableSet<E> G1(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
        return tailSet(fromElement, fromInclusive).headSet(toElement, toInclusive);
    }

    protected SortedSet<E> H1(@b9 E fromElement) {
        return tailSet(fromElement, true);
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E ceiling(@b9 E e10) {
        return i1().ceiling(e10);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return i1().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return i1().descendingSet();
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E floor(@b9 E e10) {
        return i1().floor(e10);
    }

    public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
        return i1().headSet(toElement, inclusive);
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E higher(@b9 E e10) {
        return i1().higher(e10);
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E lower(@b9 E e10) {
        return i1().lower(e10);
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E pollFirst() {
        return i1().pollFirst();
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E pollLast() {
        return i1().pollLast();
    }

    @Override // com.google.common.collect.s5
    protected SortedSet<E> q1(@b9 E fromElement, @b9 E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s5
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> L0();

    public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
        return i1().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    @fj.a
    protected E t1(@b9 E e10) {
        return (E) p7.I(tailSet(e10, true).iterator(), null);
    }

    public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
        return i1().tailSet(fromElement, inclusive);
    }

    @b9
    protected E v1() {
        return iterator().next();
    }

    @fj.a
    protected E x1(@b9 E e10) {
        return (E) p7.I(headSet(e10, true).descendingIterator(), null);
    }

    protected SortedSet<E> y1(@b9 E toElement) {
        return headSet(toElement, false);
    }

    @fj.a
    protected E z1(@b9 E e10) {
        return (E) p7.I(tailSet(e10, false).iterator(), null);
    }
}
