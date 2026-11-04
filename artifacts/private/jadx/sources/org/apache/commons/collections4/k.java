package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f335897a = org.apache.commons.collections4.comparators.b.a();

    private k() {
    }

    public static Comparator<Boolean> a(boolean z10) {
        return org.apache.commons.collections4.comparators.a.a(z10);
    }

    public static <E> Comparator<E> b(Collection<Comparator<E>> collection) {
        return c((Comparator[]) collection.toArray(new Comparator[collection.size()]));
    }

    public static <E> Comparator<E> c(Comparator<E>... comparatorArr) {
        org.apache.commons.collections4.comparators.c cVar = new org.apache.commons.collections4.comparators.c();
        for (Comparator<E> comparator : comparatorArr) {
            if (comparator == null) {
                throw new NullPointerException("Comparator cannot be null");
            }
            cVar.a(comparator);
        }
        return cVar;
    }

    public static <E> E d(E e10, E e11, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = f335897a;
        }
        return comparator.compare(e10, e11) > 0 ? e10 : e11;
    }

    public static <E> E e(E e10, E e11, Comparator<E> comparator) {
        if (comparator == null) {
            comparator = f335897a;
        }
        return comparator.compare(e10, e11) < 0 ? e10 : e11;
    }

    public static <E extends Comparable<? super E>> Comparator<E> f() {
        return f335897a;
    }

    public static <E> Comparator<E> g(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = f335897a;
        }
        return new org.apache.commons.collections4.comparators.e(comparator, true);
    }

    public static <E> Comparator<E> h(Comparator<E> comparator) {
        if (comparator == null) {
            comparator = f335897a;
        }
        return new org.apache.commons.collections4.comparators.e(comparator, false);
    }

    public static <E> Comparator<E> i(Comparator<E> comparator) {
        return new org.apache.commons.collections4.comparators.f(comparator);
    }

    public static <I, O> Comparator<I> j(Comparator<O> comparator, w0<? super I, ? extends O> w0Var) {
        if (comparator == null) {
            comparator = f335897a;
        }
        return new org.apache.commons.collections4.comparators.g(w0Var, comparator);
    }
}
