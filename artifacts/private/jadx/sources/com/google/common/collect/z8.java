package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
class z8<K> extends y8<K> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f118446r = -2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.google.common.annotations.e
    transient long[] f118447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient int f118448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient int f118449q;

    z8() {
        this(3);
    }

    static <K> z8<K> F() {
        return new z8<>();
    }

    static <K> z8<K> G(int expectedSize) {
        return new z8<>(expectedSize);
    }

    private int H(int entry) {
        return (int) (this.f118447o[entry] >>> 32);
    }

    private int I(int entry) {
        return (int) this.f118447o[entry];
    }

    private void J(int entry, int pred) {
        long[] jArr = this.f118447o;
        jArr[entry] = (jArr[entry] & com.rabbitmq.client.k0.f265952a) | (((long) pred) << 32);
    }

    private void K(int pred, int succ) {
        if (pred == -2) {
            this.f118448p = succ;
        } else {
            L(pred, succ);
        }
        if (succ == -2) {
            this.f118449q = pred;
        } else {
            J(succ, pred);
        }
    }

    private void L(int entry, int succ) {
        long[] jArr = this.f118447o;
        jArr[entry] = (jArr[entry] & (-4294967296L)) | (((long) succ) & com.rabbitmq.client.k0.f265952a);
    }

    @Override // com.google.common.collect.y8
    public void a() {
        super.a();
        this.f118448p = -2;
        this.f118449q = -2;
    }

    @Override // com.google.common.collect.y8
    int f() {
        int i10 = this.f118448p;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.common.collect.y8
    void o(int expectedSize, float loadFactor) {
        super.o(expectedSize, loadFactor);
        this.f118448p = -2;
        this.f118449q = -2;
        long[] jArr = new long[expectedSize];
        this.f118447o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.y8
    void p(int entryIndex, @b9 K key, int value, int hash) {
        super.p(entryIndex, key, value, hash);
        K(this.f118449q, entryIndex);
        K(entryIndex, -2);
    }

    @Override // com.google.common.collect.y8
    void q(int dstIndex) {
        int iD = D() - 1;
        K(H(dstIndex), I(dstIndex));
        if (dstIndex < iD) {
            K(H(iD), dstIndex);
            K(dstIndex, I(iD));
        }
        super.q(dstIndex);
    }

    @Override // com.google.common.collect.y8
    int t(int index) {
        int I = I(index);
        if (I == -2) {
            I = -1;
        }
        return I;
    }

    @Override // com.google.common.collect.y8
    int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex == D() ? removedIndex : oldNextIndex;
    }

    @Override // com.google.common.collect.y8
    void z(int newCapacity) {
        super.z(newCapacity);
        long[] jArr = this.f118447o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        this.f118447o = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    z8(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    z8(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    z8(y8<K> map) {
        o(map.D(), 1.0f);
        int iF = map.f();
        while (iF != -1) {
            v(map.j(iF), map.l(iF));
            iF = map.t(iF);
        }
    }
}
