package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
class k9<E> extends e6<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h6<E> f117573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l6<? extends E> f117574g;

    k9(h6<E> delegate, l6<? extends E> delegateList) {
        this.f117573f = delegate;
        this.f117574g = delegateList;
    }

    @Override // com.google.common.collect.l6, java.util.List
    /* JADX INFO: renamed from: D */
    public ob<E> listIterator(int i10) {
        return this.f117574g.listIterator(i10);
    }

    @Override // com.google.common.collect.e6
    h6<E> b0() {
        return this.f117573f;
    }

    l6<? extends E> c0() {
        return this.f117574g;
    }

    @Override // com.google.common.collect.l6, com.google.common.collect.h6
    @com.google.common.annotations.c
    int d(Object[] dst, int offset) {
        return this.f117574g.d(dst, offset);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.f117574g.get(index);
    }

    @Override // com.google.common.collect.h6
    @fj.a
    Object[] i() {
        return this.f117574g.i();
    }

    @Override // com.google.common.collect.h6
    int k() {
        return this.f117574g.k();
    }

    @Override // com.google.common.collect.h6
    int l() {
        return this.f117574g.l();
    }

    @Override // com.google.common.collect.e6, com.google.common.collect.l6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }

    k9(h6<E> delegate, Object[] array) {
        this(delegate, l6.p(array));
    }

    k9(h6<E> delegate, Object[] array, int size) {
        this(delegate, l6.r(array, size));
    }
}
