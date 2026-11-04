package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
final class q9<E> extends i7<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long[] f117996m = {0};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final i7<?> f117997n = new q9(a9.z());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient r9<E> f117998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient long[] f117999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f118000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f118001l;

    q9(Comparator<? super E> comparator) {
        this.f117998i = j7.m0(comparator);
        this.f117999j = f117996m;
        boolean z10 = false & false;
        this.f118000k = 0;
        this.f118001l = 0;
    }

    private int S0(int index) {
        long[] jArr = this.f117999j;
        int i10 = this.f118000k;
        return (int) (jArr[(i10 + index) + 1] - jArr[i10 + index]);
    }

    @Override // com.google.common.collect.t6
    q8.a<E> D(int index) {
        return r8.k(this.f117998i.c().get(index), S0(index));
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.ga
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public i7<E> b4(E lowerBound, x boundType) {
        return V0(this.f117998i.d1(lowerBound, com.google.common.base.j0.E(boundType) == x.CLOSED), this.f118001l);
    }

    @Override // com.google.common.collect.q8
    public int P3(@fj.a Object element) {
        int iIndexOf = this.f117998i.indexOf(element);
        if (iIndexOf >= 0) {
            return S0(iIndexOf);
        }
        return 0;
    }

    i7<E> V0(int from, int to) {
        com.google.common.base.j0.f0(from, to, this.f118001l);
        if (from == to) {
            return i7.m0(comparator());
        }
        return (from == 0 && to == this.f118001l) ? this : new q9(this.f117998i.a1(from, to), this.f117999j, this.f118000k + from, to - from);
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return D(0);
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.t6, com.google.common.collect.q8
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public j7<E> o() {
        return this.f117998i;
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return D(this.f118001l - 1);
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return this.f118000k > 0 || this.f118001l < this.f117999j.length - 1;
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.ga
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i7<E> T2(E upperBound, x boundType) {
        return V0(0, this.f117998i.c1(upperBound, com.google.common.base.j0.E(boundType) == x.CLOSED));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public int size() {
        long[] jArr = this.f117999j;
        int i10 = this.f118000k;
        return com.google.common.primitives.l.A(jArr[this.f118001l + i10] - jArr[i10]);
    }

    @Override // com.google.common.collect.i7, com.google.common.collect.t6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }

    q9(r9<E> elementSet, long[] cumulativeCounts, int offset, int length) {
        this.f117998i = elementSet;
        this.f117999j = cumulativeCounts;
        this.f118000k = offset;
        this.f118001l = length;
    }
}
