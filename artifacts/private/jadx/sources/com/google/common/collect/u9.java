package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class u9 extends a9<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final u9 f118178c = new u9();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118179d = 0;

    private u9() {
    }

    private Object readResolve() {
        return f118178c;
    }

    @Override // com.google.common.collect.a9
    public <S extends Comparable<?>> a9<S> E() {
        return a9.z();
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> left, Comparable<?> right) {
        com.google.common.base.j0.E(left);
        if (left == right) {
            return 0;
        }
        return right.compareTo(left);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E s(E a10, E b10) {
        return (E) t8.f118139e.w(a10, b10);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E t(E a10, E b10, E c10, E... rest) {
        return (E) t8.f118139e.x(a10, b10, c10, rest);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E r(Iterable<E> iterable) {
        return (E) t8.f118139e.v(iterable);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E u(Iterator<E> iterator) {
        return (E) t8.f118139e.y(iterator);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E w(E a10, E b10) {
        return (E) t8.f118139e.s(a10, b10);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E x(E a10, E b10, E c10, E... rest) {
        return (E) t8.f118139e.t(a10, b10, c10, rest);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E v(Iterable<E> iterable) {
        return (E) t8.f118139e.r(iterable);
    }

    @Override // com.google.common.collect.a9
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E y(Iterator<E> iterator) {
        return (E) t8.f118139e.u(iterator);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
