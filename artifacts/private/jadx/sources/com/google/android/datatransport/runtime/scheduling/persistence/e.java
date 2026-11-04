package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f103722a = 10485760;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f103723b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f103724c = 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f103725d = 604800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f103726e = 81920;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final e f103727f = a().f(10485760).d(200).b(10000).c(604800000).e(f103726e).a();

    @u7.d.a
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    e() {
    }

    static a a() {
        return new com.google.android.datatransport.runtime.scheduling.persistence.a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}
