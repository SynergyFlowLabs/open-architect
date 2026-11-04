package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
class g3<E> extends d3<E> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f117401l = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.a
    private transient int[] f117402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.a
    private transient int[] f117403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f117404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f117405k;

    g3() {
    }

    public static <E> g3<E> V() {
        return new g3<>();
    }

    public static <E> g3<E> W(Collection<? extends E> collection) {
        g3<E> g3VarZ = Z(collection.size());
        g3VarZ.addAll(collection);
        return g3VarZ;
    }

    @SafeVarargs
    public static <E> g3<E> Y(E... elements) {
        g3<E> g3VarZ = Z(elements.length);
        Collections.addAll(g3VarZ, elements);
        return g3VarZ;
    }

    public static <E> g3<E> Z(int expectedSize) {
        return new g3<>(expectedSize);
    }

    private int a0(int entry) {
        return b0()[entry] - 1;
    }

    private int[] b0() {
        int[] iArr = this.f117402h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] c0() {
        int[] iArr = this.f117403i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void e0(int entry, int pred) {
        b0()[entry] = pred + 1;
    }

    private void h0(int pred, int succ) {
        if (pred == -2) {
            this.f117404j = succ;
        } else {
            i0(pred, succ);
        }
        if (succ == -2) {
            this.f117405k = pred;
        } else {
            e0(succ, pred);
        }
    }

    private void i0(int entry, int succ) {
        c0()[entry] = succ + 1;
    }

    @Override // com.google.common.collect.d3
    int A(int entry) {
        return c0()[entry] - 1;
    }

    @Override // com.google.common.collect.d3
    void D(int expectedSize) {
        super.D(expectedSize);
        this.f117404j = -2;
        this.f117405k = -2;
    }

    @Override // com.google.common.collect.d3
    void F(int entryIndex, @b9 E object, int hash, int mask) {
        super.F(entryIndex, object, hash, mask);
        h0(this.f117405k, entryIndex);
        h0(entryIndex, -2);
    }

    @Override // com.google.common.collect.d3
    void J(int dstIndex, int mask) {
        int size = size() - 1;
        super.J(dstIndex, mask);
        h0(a0(dstIndex), A(dstIndex));
        if (dstIndex < size) {
            h0(a0(size), dstIndex);
            h0(dstIndex, A(size));
        }
        b0()[size] = 0;
        c0()[size] = 0;
    }

    @Override // com.google.common.collect.d3
    void O(int newCapacity) {
        super.O(newCapacity);
        this.f117402h = Arrays.copyOf(b0(), newCapacity);
        this.f117403i = Arrays.copyOf(c0(), newCapacity);
    }

    @Override // com.google.common.collect.d3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (K()) {
            return;
        }
        this.f117404j = -2;
        this.f117405k = -2;
        int[] iArr = this.f117402h;
        if (iArr != null && this.f117403i != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f117403i, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.d3
    int i(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // com.google.common.collect.d3
    int k() {
        int iK = super.k();
        this.f117402h = new int[iK];
        this.f117403i = new int[iK];
        return iK;
    }

    @Override // com.google.common.collect.d3
    @z7.a
    Set<E> l() {
        Set<E> setL = super.l();
        this.f117402h = null;
        this.f117403i = null;
        return setL;
    }

    @Override // com.google.common.collect.d3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return x8.l(this);
    }

    @Override // com.google.common.collect.d3
    int w() {
        return this.f117404j;
    }

    g3(int expectedSize) {
        super(expectedSize);
    }

    @Override // com.google.common.collect.d3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) x8.m(this, tArr);
    }
}
