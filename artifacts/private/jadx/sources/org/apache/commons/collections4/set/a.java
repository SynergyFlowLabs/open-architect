package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> extends d<E> implements NavigableSet<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336283e = 20150528;

    protected a() {
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return c().ceiling(e10);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return c().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return c().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return c().floor(e10);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e10, boolean z10) {
        return c().headSet(e10, z10);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return c().higher(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.set.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return c().lower(e10);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return c().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return c().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        return c().subSet(e10, z10, e11, z11);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e10, boolean z10) {
        return c().tailSet(e10, z10);
    }

    protected a(NavigableSet<E> navigableSet) {
        super(navigableSet);
    }
}
