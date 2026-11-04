package com.google.common.collect;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@a4
@com.google.common.annotations.b(emulated = true)
public final class z7 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f118435g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f118436h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f118437i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f118438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f118439b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f118440c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.a
    a8.p f118441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.a
    a8.p f118442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.a
    com.google.common.base.m<Object> f118443f;

    enum a {
        VALUE
    }

    @z7.a
    public z7 a(int concurrencyLevel) {
        int i10 = this.f118440c;
        com.google.common.base.j0.n0(i10 == -1, "concurrency level was already set to %s", i10);
        com.google.common.base.j0.d(concurrencyLevel > 0);
        this.f118440c = concurrencyLevel;
        return this;
    }

    int b() {
        int i10 = this.f118440c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int c() {
        int i10 = this.f118439b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    com.google.common.base.m<Object> d() {
        return (com.google.common.base.m) com.google.common.base.b0.a(this.f118443f, e().l());
    }

    a8.p e() {
        return (a8.p) com.google.common.base.b0.a(this.f118441d, a8.p.f117071a);
    }

    a8.p f() {
        return (a8.p) com.google.common.base.b0.a(this.f118442e, a8.p.f117071a);
    }

    @z7.a
    public z7 g(int initialCapacity) {
        int i10 = this.f118439b;
        com.google.common.base.j0.n0(i10 == -1, "initial capacity was already set to %s", i10);
        com.google.common.base.j0.d(initialCapacity >= 0);
        this.f118439b = initialCapacity;
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    z7 h(com.google.common.base.m<Object> equivalence) {
        com.google.common.base.m<Object> mVar = this.f118443f;
        int i10 = 4 | 1;
        com.google.common.base.j0.x0(mVar == null, "key equivalence was already set to %s", mVar);
        this.f118443f = (com.google.common.base.m) com.google.common.base.j0.E(equivalence);
        this.f118438a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f118438a ? new ConcurrentHashMap(c(), 0.75f, b()) : a8.b(this);
    }

    z7 j(a8.p strength) {
        a8.p pVar = this.f118441d;
        com.google.common.base.j0.x0(pVar == null, "Key strength was already set to %s", pVar);
        this.f118441d = (a8.p) com.google.common.base.j0.E(strength);
        if (strength != a8.p.f117071a) {
            this.f118438a = true;
        }
        return this;
    }

    z7 k(a8.p strength) {
        a8.p pVar = this.f118442e;
        com.google.common.base.j0.x0(pVar == null, "Value strength was already set to %s", pVar);
        this.f118442e = (a8.p) com.google.common.base.j0.E(strength);
        if (strength != a8.p.f117071a) {
            this.f118438a = true;
        }
        return this;
    }

    @com.google.common.annotations.c
    @z7.a
    public z7 l() {
        return j(a8.p.f117072b);
    }

    @com.google.common.annotations.c
    @z7.a
    public z7 m() {
        return k(a8.p.f117072b);
    }

    public String toString() {
        com.google.common.base.b0.b bVarC = com.google.common.base.b0.c(this);
        int i10 = this.f118439b;
        if (i10 != -1) {
            bVarC.d("initialCapacity", i10);
        }
        int i11 = this.f118440c;
        if (i11 != -1) {
            bVarC.d("concurrencyLevel", i11);
        }
        a8.p pVar = this.f118441d;
        if (pVar != null) {
            bVarC.f("keyStrength", com.google.common.base.c.g(pVar.toString()));
        }
        a8.p pVar2 = this.f118442e;
        if (pVar2 != null) {
            bVarC.f("valueStrength", com.google.common.base.c.g(pVar2.toString()));
        }
        if (this.f118443f != null) {
            bVarC.s("keyEquivalence");
        }
        return bVarC.toString();
    }
}
