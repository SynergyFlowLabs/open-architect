package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class v8<T> extends a9<T> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118252d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a9<? super T> f118253c;

    v8(a9<? super T> ordering) {
        this.f118253c = ordering;
    }

    @Override // com.google.common.collect.a9
    public <S extends T> a9<S> A() {
        return this;
    }

    @Override // com.google.common.collect.a9
    public <S extends T> a9<S> B() {
        return this.f118253c.B();
    }

    @Override // com.google.common.collect.a9
    public <S extends T> a9<S> E() {
        return this.f118253c.E().B();
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@fj.a T left, @fj.a T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }
        return this.f118253c.compare(left, right);
    }

    @Override // java.util.Comparator
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v8) {
            return this.f118253c.equals(((v8) object).f118253c);
        }
        return false;
    }

    public int hashCode() {
        return this.f118253c.hashCode() ^ 957692532;
    }

    public String toString() {
        return this.f118253c + ".nullsFirst()";
    }
}
