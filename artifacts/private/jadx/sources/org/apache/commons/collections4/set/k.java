package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.NavigableSet;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class k<E> extends m<E> implements NavigableSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f336300g = 20150528;

    protected k(NavigableSet<E> navigableSet, w0<? super E, ? extends E> w0Var) {
        super(navigableSet, w0Var);
    }

    public static <E> k<E> v(NavigableSet<E> navigableSet, w0<? super E, ? extends E> w0Var) {
        k<E> kVar = new k<>(navigableSet, w0Var);
        if (navigableSet.size() > 0) {
            Object[] array = navigableSet.toArray();
            navigableSet.clear();
            for (Object obj : array) {
                kVar.c().add(w0Var.a(obj));
            }
        }
        return kVar;
    }

    public static <E> k<E> w(NavigableSet<E> navigableSet, w0<? super E, ? extends E> w0Var) {
        return new k<>(navigableSet, w0Var);
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
        return w(c().descendingSet(), this.f335615c);
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return c().floor(e10);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e10, boolean z10) {
        return w(c().headSet(e10, z10), this.f335615c);
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
        return w(c().subSet(e10, z10, e11, z11), this.f335615c);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e10, boolean z10) {
        return w(c().tailSet(e10, z10), this.f335615c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }
}
