package org.apache.commons.collections4.set;

import java.util.Comparator;
import java.util.SortedSet;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class j<E> extends i<E> implements SortedSet<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336299f = -9110948148132275052L;

    protected j(SortedSet<E> sortedSet, l0<? super E> l0Var) {
        super(sortedSet, l0Var);
    }

    public static <E> j<E> s(SortedSet<E> sortedSet, l0<? super E> l0Var) {
        return new j<>(sortedSet, l0Var);
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
        return new j(c().headSet(e10), this.f335607c);
    }

    @Override // java.util.SortedSet
    public E last() {
        return c().last();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.set.i
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public SortedSet<E> c() {
        return (SortedSet) super.c();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return new j(c().subSet(e10, e11), this.f335607c);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return new j(c().tailSet(e10), this.f335607c);
    }
}
