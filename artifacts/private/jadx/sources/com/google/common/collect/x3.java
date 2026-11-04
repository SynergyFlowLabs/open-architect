package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
final class x3<E> extends j7<E> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j7<E> f118268l;

    x3(j7<E> forward) {
        super(a9.i(forward.comparator()).E());
        this.f118268l = forward;
    }

    @Override // com.google.common.collect.j7
    j7<E> P0(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return this.f118268l.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
    }

    @Override // com.google.common.collect.j7
    j7<E> W0(E fromElement, boolean inclusive) {
        return this.f118268l.headSet(fromElement, inclusive).descendingSet();
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E ceiling(E element) {
        return this.f118268l.floor(element);
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return this.f118268l.contains(object);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E floor(E element) {
        return this.f118268l.ceiling(element);
    }

    @Override // com.google.common.collect.j7
    @com.google.common.annotations.c("NavigableSet")
    j7<E> h0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E higher(E element) {
        return this.f118268l.lower(element);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c("NavigableSet")
    /* JADX INFO: renamed from: i0 */
    public nb<E> descendingIterator() {
        return this.f118268l.iterator();
    }

    @Override // com.google.common.collect.j7
    int indexOf(@fj.a Object target) {
        int iIndexOf = this.f118268l.indexOf(target);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c("NavigableSet")
    /* JADX INFO: renamed from: l0 */
    public j7<E> descendingSet() {
        return this.f118268l;
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @fj.a
    public E lower(E element) {
        return this.f118268l.higher(element);
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return this.f118268l.m();
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return this.f118268l.descendingIterator();
    }

    @Override // com.google.common.collect.j7
    j7<E> q0(E toElement, boolean inclusive) {
        return this.f118268l.tailSet(toElement, inclusive).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f118268l.size();
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
