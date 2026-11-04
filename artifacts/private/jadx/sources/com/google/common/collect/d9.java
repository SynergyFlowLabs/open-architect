package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class d9 {
    private d9() {
    }

    static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <E extends Enum<E>> Class<E> b(E e10) {
        return e10.getDeclaringClass();
    }

    static <T> T[] c(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    static <K, V> Map<K, V> d(int expectedSize) {
        return c3.x(expectedSize);
    }

    static <E> Set<E> e(int expectedSize) {
        return d3.s(expectedSize);
    }

    static <K, V> Map<K, V> f(int expectedSize) {
        return f3.f0(expectedSize);
    }

    static <E> Set<E> g(int expectedSize) {
        return g3.Z(expectedSize);
    }

    static <E> Set<E> h() {
        return d3.m();
    }

    static <K, V> Map<K, V> i() {
        return c3.s();
    }

    static <K, V> Map<K, V> j(int expectedSize) {
        return b8.e0(expectedSize);
    }

    static int k(int exponent) {
        return exponent;
    }

    static int l(int iterations) {
        return iterations;
    }

    @com.google.common.annotations.d
    static z7 m(z7 mapMaker) {
        return mapMaker.l();
    }
}
