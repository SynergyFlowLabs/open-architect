package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class b4<C extends Comparable> extends s3<C> {

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final class b<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117117b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z3<C> f117118a;

        private Object readResolve() {
            return new b4(this.f117118a);
        }

        private b(z3<C> domain) {
            this.f117118a = domain;
        }
    }

    b4(z3<C> domain) {
        super(domain);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.z6
    @com.google.common.annotations.c
    boolean F() {
        return true;
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    public l6<C> c() {
        return l6.F();
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return false;
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        if (object instanceof Set) {
            return ((Set) object).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    @com.google.common.annotations.c
    j7<C> h0() {
        return j7.m0(a9.z().E());
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: i0 */
    public nb<C> descendingIterator() {
        return p7.t();
    }

    @Override // com.google.common.collect.j7
    @com.google.common.annotations.c
    int indexOf(@fj.a Object target) {
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<C> iterator() {
        return p7.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: n1 */
    public s3<C> q0(C toElement, boolean inclusive) {
        return this;
    }

    @Override // com.google.common.collect.s3
    public s3<C> o1(s3<C> other) {
        return this;
    }

    @Override // com.google.common.collect.s3
    public f9<C> q1() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.s3
    public f9<C> r1(x lowerBoundType, x upperBoundType) {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.s3, java.util.AbstractCollection
    public String toString() {
        return okhttp3.v.f334777p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: v1 */
    public s3<C> P0(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return this;
    }

    @Override // com.google.common.collect.s3, com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this.f118082l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: z1 */
    public s3<C> W0(C fromElement, boolean fromInclusive) {
        return this;
    }
}
