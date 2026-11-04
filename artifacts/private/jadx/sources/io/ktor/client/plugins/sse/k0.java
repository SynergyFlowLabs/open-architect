package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f295081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f295082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f295083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f295084d;

    public k0() {
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        this.f295083c = kotlin.time.e.m0(3000, kotlin.time.f.MILLISECONDS);
    }

    public final int a() {
        return this.f295084d;
    }

    public final long b() {
        return this.f295083c;
    }

    public final boolean c() {
        return this.f295081a;
    }

    public final boolean d() {
        return this.f295082b;
    }

    public final void e(int i10) {
        this.f295084d = i10;
    }

    public final void f(long j10) {
        this.f295083c = j10;
    }

    public final void g(boolean z10) {
        this.f295081a = z10;
    }

    public final void h(boolean z10) {
        this.f295082b = z10;
    }

    public final void i() {
        this.f295081a = true;
    }

    public final void j() {
        this.f295082b = true;
    }
}
