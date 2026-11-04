package org.apache.commons.collections4.set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<E> extends c<E> implements SortedSet<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336286d = -3462240946294214398L;

    protected d() {
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return c().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e10) {
        return c().headSet(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.set.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public SortedSet<E> c() {
        return (SortedSet) super.c();
    }

    @Override // java.util.SortedSet
    public E last() {
        return c().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return c().subSet(e10, e11);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return c().tailSet(e10);
    }

    protected d(Set<E> set) {
        super(set);
    }
}
