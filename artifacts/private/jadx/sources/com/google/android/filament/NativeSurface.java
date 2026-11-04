package com.google.android.filament;

/* JADX INFO: loaded from: classes4.dex */
public class NativeSurface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f104117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f104119c;

    public NativeSurface(int i10, int i11) {
        this.f104117a = i10;
        this.f104118b = i11;
        this.f104119c = nCreateSurface(i10, i11);
    }

    private static native long nCreateSurface(int i10, int i11);

    private static native void nDestroySurface(long j10);

    public void a() {
        nDestroySurface(this.f104119c);
    }

    public int b() {
        return this.f104118b;
    }

    public long c() {
        return this.f104119c;
    }

    public int d() {
        return this.f104117a;
    }
}
