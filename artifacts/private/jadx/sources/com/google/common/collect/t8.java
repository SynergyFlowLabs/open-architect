package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class t8 extends a9<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final t8 f118139e = new t8();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f118140f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient a9<Comparable<?>> f118141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient a9<Comparable<?>> f118142d;

    private t8() {
    }

    private Object readResolve() {
        return f118139e;
    }

    @Override // com.google.common.collect.a9
    public <S extends Comparable<?>> a9<S> A() {
        a9<S> a9Var = (a9<S>) this.f118141c;
        if (a9Var != null) {
            return a9Var;
        }
        a9<S> a9VarA = super.A();
        this.f118141c = a9VarA;
        return a9VarA;
    }

    @Override // com.google.common.collect.a9
    public <S extends Comparable<?>> a9<S> B() {
        a9<S> a9Var = (a9<S>) this.f118142d;
        if (a9Var != null) {
            return a9Var;
        }
        a9<S> a9VarB = super.B();
        this.f118142d = a9VarB;
        return a9VarB;
    }

    @Override // com.google.common.collect.a9
    public <S extends Comparable<?>> a9<S> E() {
        return u9.f118178c;
    }

    @Override // com.google.common.collect.a9, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> left, Comparable<?> right) {
        com.google.common.base.j0.E(left);
        com.google.common.base.j0.E(right);
        return left.compareTo(right);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
