package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.NavigableSet;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class h<E> extends j<E> implements NavigableSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f336297g = 20150528;

    protected h(NavigableSet<E> navigableSet, l0<? super E> l0Var) {
        super(navigableSet, l0Var);
    }

    public static <E> h<E> u(NavigableSet<E> navigableSet, l0<? super E> l0Var) {
        return new h<>(navigableSet, l0Var);
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
        return u(c().descendingSet(), this.f335607c);
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return c().floor(e10);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e10, boolean z10) {
        return u(c().headSet(e10, z10), this.f335607c);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return c().higher(e10);
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
        return u(c().subSet(e10, z10, e11, z11), this.f335607c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.set.j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e10, boolean z10) {
        return u(c().tailSet(e10, z10), this.f335607c);
    }
}
