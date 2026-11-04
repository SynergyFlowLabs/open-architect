package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class r9<E> extends j7<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final r9<Comparable> f118071m = new r9<>(l6.F(), a9.z());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient l6<E> f118072l;

    r9(l6<E> elements, Comparator<? super E> comparator) {
        super(comparator);
        this.f118072l = elements;
    }

    private int f1(Object key) throws ClassCastException {
        return Collections.binarySearch(this.f118072l, key, i1());
    }

    @Override // com.google.common.collect.j7
    j7<E> P0(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return W0(fromElement, fromInclusive).q0(toElement, toInclusive);
    }

    @Override // com.google.common.collect.j7
    j7<E> W0(E fromElement, boolean inclusive) {
        return a1(d1(fromElement, inclusive), size());
    }

    r9<E> a1(int newFromIndex, int newToIndex) {
        if (newFromIndex == 0 && newToIndex == size()) {
            return this;
        }
        return newFromIndex < newToIndex ? new r9<>(this.f118072l.subList(newFromIndex, newToIndex), this.f117505i) : j7.m0(this.f117505i);
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    public l6<E> c() {
        return this.f118072l;
    }

    int c1(E toElement, boolean inclusive) {
        int iBinarySearch = Collections.binarySearch(this.f118072l, com.google.common.base.j0.E(toElement), comparator());
        if (iBinarySearch >= 0) {
            return inclusive ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E ceiling(E element) {
        int iD1 = d1(element, true);
        if (iD1 == size()) {
            return null;
        }
        return this.f118072l.get(iD1);
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object o10) {
        if (o10 != null) {
            try {
                if (f1(o10) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        if (targets instanceof q8) {
            targets = ((q8) targets).o();
        }
        if (!da.b(comparator(), targets) || targets.size() <= 1) {
            return super.containsAll(targets);
        }
        nb<E> it = iterator();
        Iterator<?> it2 = targets.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iY0 = Y0(next2, next);
                if (iY0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iY0 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iY0 > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.h6
    int d(Object[] dst, int offset) {
        return this.f118072l.d(dst, offset);
    }

    int d1(E fromElement, boolean inclusive) {
        int iBinarySearch = Collections.binarySearch(this.f118072l, com.google.common.base.j0.E(fromElement), comparator());
        if (iBinarySearch >= 0) {
            return inclusive ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!da.b(this.f117505i, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            nb<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || Y0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f118072l.get(0);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E floor(E element) {
        int iC1 = c1(element, true) - 1;
        if (iC1 == -1) {
            return null;
        }
        return this.f118072l.get(iC1);
    }

    @Override // com.google.common.collect.j7
    j7<E> h0() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f117505i);
        return isEmpty() ? j7.m0(comparatorReverseOrder) : new r9(this.f118072l.U(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E higher(E element) {
        int iD1 = d1(element, false);
        if (iD1 == size()) {
            return null;
        }
        return this.f118072l.get(iD1);
    }

    @Override // com.google.common.collect.h6
    @fj.a
    Object[] i() {
        return this.f118072l.i();
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public nb<E> descendingIterator() {
        return this.f118072l.U().iterator();
    }

    Comparator<Object> i1() {
        return this.f117505i;
    }

    @Override // com.google.common.collect.j7
    int indexOf(@fj.a Object target) {
        if (target == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f118072l, target, i1());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
        }
    }

    @Override // com.google.common.collect.h6
    int k() {
        return this.f118072l.k();
    }

    @Override // com.google.common.collect.h6
    int l() {
        return this.f118072l.l();
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f118072l.get(size() - 1);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E lower(E element) {
        int iC1 = c1(element, false) - 1;
        if (iC1 == -1) {
            return null;
        }
        return this.f118072l.get(iC1);
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return this.f118072l.m();
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return this.f118072l.iterator();
    }

    @Override // com.google.common.collect.j7
    j7<E> q0(E toElement, boolean inclusive) {
        return a1(0, c1(toElement, inclusive));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f118072l.size();
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
