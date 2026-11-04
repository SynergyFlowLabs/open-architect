package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
class m9<E> extends l6<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final l6<Object> f117681h = new m9(new Object[0], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient Object[] f117682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f117683g;

    m9(Object[] array, int size) {
        this.f117682f = array;
        this.f117683g = size;
    }

    @Override // com.google.common.collect.l6, com.google.common.collect.h6
    int d(Object[] dst, int dstOff) {
        System.arraycopy(this.f117682f, 0, dst, dstOff, this.f117683g);
        return dstOff + this.f117683g;
    }

    @Override // java.util.List
    public E get(int i10) {
        com.google.common.base.j0.C(i10, this.f117683g);
        E e10 = (E) this.f117682f[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.h6
    Object[] i() {
        return this.f117682f;
    }

    @Override // com.google.common.collect.h6
    int k() {
        return this.f117683g;
    }

    @Override // com.google.common.collect.h6
    int l() {
        return 0;
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f117683g;
    }

    @Override // com.google.common.collect.l6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
