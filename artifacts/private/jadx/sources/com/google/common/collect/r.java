package com.google.common.collect;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class r extends a9<Object> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final r f118004c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118005d = 0;

    r() {
    }

    private Object readResolve() {
        return f118004c;
    }

    @Override // com.google.common.collect.a9
    public <S> a9<S> E() {
        return this;
    }

    @Override // com.google.common.collect.a9
    public <E> List<E> F(Iterable<E> iterable) {
        return x7.r(iterable);
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    public int compare(@fj.a Object left, @fj.a Object right) {
        return 0;
    }

    @Override // com.google.common.collect.a9
    public <E> l6<E> l(Iterable<E> iterable) {
        return l6.v(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
