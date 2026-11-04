package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
final class w3<E> extends i7<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient i7<E> f118259i;

    w3(i7<E> forward) {
        this.f118259i = forward;
    }

    @Override // com.google.common.collect.t6
    q8.a<E> D(int index) {
        return this.f118259i.entrySet().c().U().get(index);
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.ga
    /* JADX INFO: renamed from: N0 */
    public i7<E> b4(E lowerBound, x boundType) {
        return this.f118259i.T2(lowerBound, boundType).J2();
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        return this.f118259i.P3(element);
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> firstEntry() {
        return this.f118259i.lastEntry();
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.ga
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public i7<E> J2() {
        return this.f118259i;
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.t6, com.google.common.collect.q8
    /* JADX INFO: renamed from: l0 */
    public j7<E> o() {
        return this.f118259i.o().descendingSet();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> lastEntry() {
        return this.f118259i.firstEntry();
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return this.f118259i.m();
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.ga
    /* JADX INFO: renamed from: n0 */
    public i7<E> T2(E upperBound, x boundType) {
        return this.f118259i.b4(upperBound, boundType).J2();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        return this.f118259i.size();
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.t6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
