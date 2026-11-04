package org.apache.commons.collections4.set;

import java.util.Comparator;
import java.util.SortedSet;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class m<E> extends l<E> implements SortedSet<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336302f = -1675486811351124386L;

    protected m(SortedSet<E> sortedSet, w0<? super E, ? extends E> w0Var) {
        super(sortedSet, w0Var);
    }

    public static <E> m<E> s(SortedSet<E> sortedSet, w0<? super E, ? extends E> w0Var) {
        m<E> mVar = new m<>(sortedSet, w0Var);
        if (sortedSet.size() > 0) {
            Object[] array = sortedSet.toArray();
            sortedSet.clear();
            for (Object obj : array) {
                mVar.c().add(w0Var.a(obj));
            }
        }
        return mVar;
    }

    public static <E> m<E> t(SortedSet<E> sortedSet, w0<? super E, ? extends E> w0Var) {
        return new m<>(sortedSet, w0Var);
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return r().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return r().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e10) {
        return new m(r().headSet(e10), this.f335615c);
    }

    @Override // java.util.SortedSet
    public E last() {
        return r().last();
    }

    protected SortedSet<E> r() {
        return (SortedSet) c();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return new m(r().subSet(e10, e11), this.f335615c);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return new m(r().tailSet(e10), this.f335615c);
    }
}
