package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
final class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f110560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f110561b;

    public td(com.google.android.gms.common.util.g gVar) {
        com.google.android.gms.common.internal.w.r(gVar);
        this.f110560a = gVar;
    }

    public final void a() {
        this.f110561b = this.f110560a.b();
    }

    public final void b() {
        this.f110561b = 0L;
    }

    public final boolean c(long j10) {
        return this.f110561b == 0 || this.f110560a.b() - this.f110561b >= 3600000;
    }
}
