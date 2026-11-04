package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class v9<T> extends a9<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118254d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a9<? super T> f118255c;

    v9(a9<? super T> forwardOrder) {
        this.f118255c = (a9) com.google.common.base.j0.E(forwardOrder);
    }

    @Override // com.google.common.collect.a9
    public <S extends T> a9<S> E() {
        return this.f118255c;
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@b9 T a10, @b9 T b10) {
        return this.f118255c.compare(b10, a10);
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v9) {
            return this.f118255c.equals(((v9) object).f118255c);
        }
        return false;
    }

    public int hashCode() {
        return -this.f118255c.hashCode();
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) this.f118255c.v(iterable);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E s(@b9 E e10, @b9 E e11) {
        return (E) this.f118255c.w(e10, e11);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E t(@b9 E e10, @b9 E e11, @b9 E e12, E... eArr) {
        return (E) this.f118255c.x(e10, e11, e12, eArr);
    }

    public String toString() {
        return this.f118255c + ".reverse()";
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E u(Iterator<E> it) {
        return (E) this.f118255c.y(it);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) this.f118255c.r(iterable);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E w(@b9 E e10, @b9 E e11) {
        return (E) this.f118255c.s(e10, e11);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E x(@b9 E e10, @b9 E e11, @b9 E e12, E... eArr) {
        return (E) this.f118255c.t(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.a9
    public <E extends T> E y(Iterator<E> it) {
        return (E) this.f118255c.u(it);
    }
}
