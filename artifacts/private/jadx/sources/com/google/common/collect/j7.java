package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class j7<E> extends z6<E> implements NavigableSet<E>, ca<E> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f117504k = 912559;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final transient Comparator<? super E> f117505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    @com.google.common.annotations.c
    @fj.a
    transient j7<E> f117506j;

    @com.google.common.annotations.d
    private static class b<E> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f117508c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator<? super E> f117509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f117510b;

        public b(Comparator<? super E> comparator, Object[] elements) {
            this.f117509a = comparator;
            this.f117510b = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new a(this.f117509a).b(this.f117510b).e();
        }
    }

    j7(Comparator<? super E> comparator) {
        this.f117505i = comparator;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 A0(Comparable e10, Comparable e11, Comparable e12, Comparable e13) {
        return T(a9.z(), 4, e10, e11, e12, e13);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 C0(Comparable e10, Comparable e11, Comparable e12, Comparable e13, Comparable e14) {
        return T(a9.z(), 5, e10, e11, e12, e13, e14);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 D0(Comparable e10, Comparable e11, Comparable e12, Comparable e13, Comparable e14, Comparable e15, Comparable... remaining) {
        int length = remaining.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        int i10 = 2 << 0;
        comparableArr[0] = e10;
        comparableArr[1] = e11;
        int i11 = 0 ^ 2;
        comparableArr[2] = e12;
        comparableArr[3] = e13;
        comparableArr[4] = e14;
        comparableArr[5] = e15;
        System.arraycopy(remaining, 0, comparableArr, 6, remaining.length);
        return T(a9.z(), length, comparableArr);
    }

    @z7.e("Pass a parameter of type Comparable")
    @Deprecated
    public static <E> j7<E> E0(E e10) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> j7<E> F0(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> j7<E> G0(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> j7<E> H0(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> j7<E> I0(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <E> j7<E> J0(E e10, E e11, E e12, E e13, E e14, E e15, E... remaining) {
        throw new UnsupportedOperationException();
    }

    public static <E> a<E> K0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> L0() {
        return new a<>(Collections.reverseOrder());
    }

    @d6
    @z7.e("Use toImmutableSortedSet")
    @Deprecated
    public static <E> Collector<E, ?, z6<E>> Q() {
        throw new UnsupportedOperationException();
    }

    @z7.e("Use naturalOrder")
    @Deprecated
    public static <E> a<E> R() {
        throw new UnsupportedOperationException();
    }

    @z7.e("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> a<E> S(int expectedSize) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> j7<E> T(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return m0(comparator);
        }
        x8.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            a0.c cVar = (Object) eArr[i12];
            if (comparator.compare(cVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = cVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new r9(l6.r(eArr, i11), comparator);
    }

    public static <E> j7<E> U(Iterable<? extends E> elements) {
        return W(a9.z(), elements);
    }

    public static <E> j7<E> V(Collection<? extends E> elements) {
        return Y(a9.z(), elements);
    }

    public static <E> j7<E> W(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        com.google.common.base.j0.E(comparator);
        if (da.b(comparator, elements) && (elements instanceof j7)) {
            j7<E> j7Var = (j7) elements;
            if (!j7Var.m()) {
                return j7Var;
            }
        }
        Object[] objArrP = o7.P(elements);
        return T(comparator, objArrP.length, objArrP);
    }

    @d6
    public static <E> Collector<E, ?, j7<E>> X0(Comparator<? super E> comparator) {
        return y2.W(comparator);
    }

    public static <E> j7<E> Y(Comparator<? super E> comparator, Collection<? extends E> elements) {
        return W(comparator, elements);
    }

    public static <E> j7<E> Z(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        return new a(comparator).d(elements).e();
    }

    static int Z0(Comparator<?> comparator, Object a10, @fj.a Object b10) {
        return comparator.compare(a10, b10);
    }

    public static <E> j7<E> a0(Iterator<? extends E> elements) {
        return Z(a9.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 b0(Comparable[] elements) {
        return T(a9.z(), elements.length, (Comparable[]) elements.clone());
    }

    @z7.e("Pass parameters of type Comparable")
    @Deprecated
    public static <Z> j7<Z> c0(Z[] elements) {
        throw new UnsupportedOperationException();
    }

    public static <E> j7<E> e0(SortedSet<E> sortedSet) {
        Comparator comparatorA = da.a(sortedSet);
        l6 l6VarW = l6.w(sortedSet);
        return l6VarW.isEmpty() ? m0(comparatorA) : new r9(l6VarW, comparatorA);
    }

    static <E> r9<E> m0(Comparator<? super E> comparator) {
        return a9.z().equals(comparator) ? (r9<E>) r9.f118071m : new r9<>(l6.F(), comparator);
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream unused) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> s0() {
        return new a<>(a9.z());
    }

    public static <E> j7<E> t0() {
        return r9.f118071m;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 u0(Comparable e10) {
        return new r9(l6.G(e10), a9.z());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 v0(Comparable e10, Comparable e11) {
        return T(a9.z(), 2, e10, e11);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/j7<TE;>; */
    public static j7 z0(Comparable e10, Comparable e11, Comparable e12) {
        return T(a9.z(), 3, e10, e11, e12);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public j7<E> subSet(E fromElement, E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public j7<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        com.google.common.base.j0.E(fromElement);
        com.google.common.base.j0.E(toElement);
        com.google.common.base.j0.d(this.f117505i.compare(fromElement, toElement) <= 0);
        return P0(fromElement, fromInclusive, toElement, toInclusive);
    }

    abstract j7<E> P0(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public j7<E> tailSet(E fromElement) {
        return tailSet(fromElement, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public j7<E> tailSet(E fromElement, boolean inclusive) {
        return W0(com.google.common.base.j0.E(fromElement), inclusive);
    }

    abstract j7<E> W0(E fromElement, boolean inclusive);

    int Y0(Object a10, @fj.a Object b10) {
        return Z0(this.f117505i, a10, b10);
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E ceiling(E e10) {
        return (E) o7.v(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.ca
    public Comparator<? super E> comparator() {
        return this.f117505i;
    }

    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @fj.a
    public E floor(E e10) {
        return (E) p7.I(headSet(e10, true).descendingIterator(), null);
    }

    @com.google.common.annotations.c
    abstract j7<E> h0();

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    @fj.a
    public E higher(E e10) {
        return (E) o7.v(tailSet(e10, false), null);
    }

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: i0 */
    public abstract nb<E> descendingIterator();

    abstract int indexOf(@fj.a Object target);

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public j7<E> descendingSet() {
        j7<E> j7Var = this.f117506j;
        if (j7Var != null) {
            return j7Var;
        }
        j7<E> j7VarH0 = h0();
        this.f117506j = j7VarH0;
        j7VarH0.f117506j = this;
        return j7VarH0;
    }

    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    @fj.a
    public E lower(E e10) {
        return (E) p7.I(headSet(e10, false).descendingIterator(), null);
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public abstract nb<E> iterator();

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public j7<E> headSet(E toElement) {
        return headSet(toElement, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public j7<E> headSet(E toElement, boolean inclusive) {
        return q0(com.google.common.base.j0.E(toElement), inclusive);
    }

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @com.google.common.annotations.c
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract j7<E> q0(E toElement, boolean inclusive);

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this.f117505i, toArray());
    }

    public static final class a<E> extends z6.a<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Comparator<? super E> f117507g;

        public a(Comparator<? super E> comparator) {
            this.f117507g = (Comparator) com.google.common.base.j0.E(comparator);
        }

        @Override // com.google.common.collect.z6.a
        @z7.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            super.a(element);
            return this;
        }

        @Override // com.google.common.collect.z6.a
        @z7.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        @Override // com.google.common.collect.z6.a
        @z7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.z6.a
        @z7.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @Override // com.google.common.collect.z6.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public j7<E> e() {
            j7<E> j7VarT = j7.T(this.f117507g, this.f117444c, this.f117443b);
            this.f117444c = j7VarT.size();
            int i10 = 3 & 1;
            this.f117445d = true;
            return j7VarT;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.z6.a
        @z7.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<E> p(z6.a<E> builder) {
            super.p(builder);
            return this;
        }

        a(Comparator<? super E> comparator, int expectedKeys) {
            super(expectedKeys, false);
            this.f117507g = (Comparator) com.google.common.base.j0.E(comparator);
        }
    }
}
