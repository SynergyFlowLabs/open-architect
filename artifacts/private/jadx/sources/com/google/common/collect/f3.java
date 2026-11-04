package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
class f3<K, V> extends c3<K, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f117385t = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    transient long[] f117386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient int f117387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient int f117388o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f117389s;

    f3() {
        this(3);
    }

    public static <K, V> f3<K, V> e0() {
        return new f3<>();
    }

    public static <K, V> f3<K, V> f0(int expectedSize) {
        return new f3<>(expectedSize);
    }

    private int g0(int entry) {
        return ((int) (h0(entry) >>> 32)) - 1;
    }

    private long h0(int i10) {
        return i0()[i10];
    }

    private long[] i0() {
        long[] jArr = this.f117386m;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void j0(int i10, long value) {
        i0()[i10] = value;
    }

    private void k0(int entry, int pred) {
        j0(entry, (h0(entry) & com.rabbitmq.client.k0.f265952a) | (((long) (pred + 1)) << 32));
    }

    private void l0(int pred, int succ) {
        if (pred == -2) {
            this.f117387n = succ;
        } else {
            m0(pred, succ);
        }
        if (succ == -2) {
            this.f117388o = pred;
        } else {
            k0(succ, pred);
        }
    }

    private void m0(int entry, int succ) {
        j0(entry, (h0(entry) & (-4294967296L)) | (((long) (succ + 1)) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // com.google.common.collect.c3
    int B() {
        return this.f117387n;
    }

    @Override // com.google.common.collect.c3
    int C(int entry) {
        return ((int) h0(entry)) - 1;
    }

    @Override // com.google.common.collect.c3
    void G(int expectedSize) {
        super.G(expectedSize);
        this.f117387n = -2;
        this.f117388o = -2;
    }

    @Override // com.google.common.collect.c3
    void H(int entryIndex, @b9 K key, @b9 V value, int hash, int mask) {
        super.H(entryIndex, key, value, hash, mask);
        l0(this.f117388o, entryIndex);
        l0(entryIndex, -2);
    }

    @Override // com.google.common.collect.c3
    void K(int dstIndex, int mask) {
        int size = size() - 1;
        super.K(dstIndex, mask);
        l0(g0(dstIndex), C(dstIndex));
        if (dstIndex < size) {
            l0(g0(size), dstIndex);
            l0(dstIndex, C(size));
        }
        j0(size, 0L);
    }

    @Override // com.google.common.collect.c3
    void S(int newCapacity) {
        super.S(newCapacity);
        this.f117386m = Arrays.copyOf(i0(), newCapacity);
    }

    @Override // com.google.common.collect.c3, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        this.f117387n = -2;
        this.f117388o = -2;
        long[] jArr = this.f117386m;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.c3
    void n(int index) {
        if (this.f117389s) {
            l0(g0(index), C(index));
            l0(this.f117388o, index);
            l0(index, -2);
            E();
        }
    }

    @Override // com.google.common.collect.c3
    int o(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // com.google.common.collect.c3
    int p() {
        int iP = super.p();
        this.f117386m = new long[iP];
        return iP;
    }

    @Override // com.google.common.collect.c3
    @z7.a
    Map<K, V> q() {
        Map<K, V> mapQ = super.q();
        this.f117386m = null;
        return mapQ;
    }

    @Override // com.google.common.collect.c3
    Map<K, V> u(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f, this.f117389s);
    }

    f3(int expectedSize) {
        this(expectedSize, false);
    }

    f3(int expectedSize, boolean accessOrder) {
        super(expectedSize);
        this.f117389s = accessOrder;
    }
}
