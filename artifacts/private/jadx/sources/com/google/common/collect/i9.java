package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
@z7.f("Use ImmutableRangeSet or TreeRangeSet")
public interface i9<C extends Comparable> {
    void a(f9<C> range);

    f9<C> b();

    boolean c(C value);

    void clear();

    i9<C> d();

    boolean e(f9<C> otherRange);

    boolean equals(@fj.a Object obj);

    void f(Iterable<f9<C>> ranges);

    boolean g(i9<C> other);

    @fj.a
    f9<C> h(C value);

    int hashCode();

    boolean i(f9<C> otherRange);

    boolean isEmpty();

    boolean j(Iterable<f9<C>> other);

    i9<C> k(f9<C> view);

    Set<f9<C>> l();

    Set<f9<C>> m();

    void n(i9<C> other);

    void o(f9<C> range);

    void p(Iterable<f9<C>> ranges);

    void q(i9<C> other);

    String toString();
}
