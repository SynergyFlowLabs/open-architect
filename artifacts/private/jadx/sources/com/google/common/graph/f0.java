package com.google.common.graph;

import com.google.common.collect.a9;
import com.google.common.collect.b8;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@g0
@com.google.common.annotations.a
@z7.j
public final class f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f118615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private final Comparator<T> f118616b;

    public enum a {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED;

        static {
            int i10 = 3 | 3;
        }
    }

    private f0(a type, @fj.a Comparator<T> comparator) {
        this.f118615a = (a) com.google.common.base.j0.E(type);
        this.f118616b = comparator;
        com.google.common.base.j0.g0((type == a.SORTED) == (comparator != null));
    }

    public static <S> f0<S> d() {
        return new f0<>(a.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> f0<S> e() {
        return new f0<>(a.SORTED, a9.z());
    }

    public static <S> f0<S> f(Comparator<S> comparator) {
        return new f0<>(a.SORTED, (Comparator) com.google.common.base.j0.E(comparator));
    }

    public static <S> f0<S> g() {
        return new f0<>(a.STABLE, null);
    }

    public static <S> f0<S> i() {
        return new f0<>(a.UNORDERED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T1 extends T> f0<T1> a() {
        return this;
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.f118616b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    <K extends T, V> Map<K, V> c(int expectedSize) {
        int iOrdinal = this.f118615a.ordinal();
        if (iOrdinal == 0) {
            return b8.a0(expectedSize);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return b8.e0(expectedSize);
        }
        if (iOrdinal == 3) {
            return b8.g0(b());
        }
        throw new AssertionError();
    }

    public boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f118615a == f0Var.f118615a && com.google.common.base.d0.a(this.f118616b, f0Var.f118616b);
    }

    public a h() {
        return this.f118615a;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f118615a, this.f118616b);
    }

    public String toString() {
        com.google.common.base.b0.b bVarF = com.google.common.base.b0.c(this).f("type", this.f118615a);
        Comparator<T> comparator = this.f118616b;
        if (comparator != null) {
            bVarF.f("comparator", comparator);
        }
        return bVarF.toString();
    }
}
