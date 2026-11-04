package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public abstract class s3<C extends Comparable> extends j7<C> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final z3<C> f118082l;

    s3(z3<C> domain) {
        super(a9.z());
        this.f118082l = domain;
    }

    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> j7.a<E> R() {
        throw new UnsupportedOperationException();
    }

    public static s3<Integer> a1(int lower, int upper) {
        return i1(f9.f(Integer.valueOf(lower), Integer.valueOf(upper)), z3.c());
    }

    public static s3<Long> c1(long lower, long upper) {
        return i1(f9.f(Long.valueOf(lower), Long.valueOf(upper)), z3.d());
    }

    public static s3<Integer> d1(int lower, int upper) {
        return i1(f9.g(Integer.valueOf(lower), Integer.valueOf(upper)), z3.c());
    }

    public static s3<Long> f1(long lower, long upper) {
        return i1(f9.g(Long.valueOf(lower), Long.valueOf(upper)), z3.d());
    }

    public static <C extends Comparable> s3<C> i1(f9<C> range, z3<C> domain) {
        com.google.common.base.j0.E(range);
        com.google.common.base.j0.E(domain);
        try {
            f9<C> f9VarS = !range.q() ? range.s(f9.c(domain.f())) : range;
            if (!range.r()) {
                f9VarS = f9VarS.s(f9.d(domain.e()));
            }
            if (!f9VarS.u()) {
                Comparable comparableX = range.f117396a.x(domain);
                Objects.requireNonNull(comparableX);
                Comparable comparableV = range.f117397b.v(domain);
                Objects.requireNonNull(comparableV);
                if (f9.h(comparableX, comparableV) <= 0) {
                    return new j9(f9VarS, domain);
                }
            }
            return new b4(domain);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.common.collect.j7
    @com.google.common.annotations.c
    j7<C> h0() {
        return new x3(this);
    }

    @Override // com.google.common.collect.j7
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public s3<C> headSet(C toElement) {
        return q0((Comparable) com.google.common.base.j0.E(toElement), false);
    }

    @Override // com.google.common.collect.j7
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public s3<C> headSet(C toElement, boolean inclusive) {
        return q0((Comparable) com.google.common.base.j0.E(toElement), inclusive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.j7
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public abstract s3<C> q0(C toElement, boolean inclusive);

    public abstract s3<C> o1(s3<C> other);

    public abstract f9<C> q1();

    public abstract f9<C> r1(x lowerBoundType, x upperBoundType);

    @Override // com.google.common.collect.j7, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public s3<C> subSet(C fromElement, C toElement) {
        com.google.common.base.j0.E(fromElement);
        com.google.common.base.j0.E(toElement);
        com.google.common.base.j0.d(comparator().compare(fromElement, toElement) <= 0);
        return P0(fromElement, true, toElement, false);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return q1().toString();
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public s3<C> subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        com.google.common.base.j0.E(fromElement);
        com.google.common.base.j0.E(toElement);
        com.google.common.base.j0.d(comparator().compare(fromElement, toElement) <= 0);
        return P0(fromElement, fromInclusive, toElement, toInclusive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.j7
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public abstract s3<C> P0(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive);

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public s3<C> tailSet(C fromElement) {
        return W0((Comparable) com.google.common.base.j0.E(fromElement), true);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public s3<C> tailSet(C fromElement, boolean inclusive) {
        return W0((Comparable) com.google.common.base.j0.E(fromElement), inclusive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.j7
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public abstract s3<C> W0(C fromElement, boolean inclusive);
}
