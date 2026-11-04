package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f304205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f304206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f304207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f304208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f304209e;

    public i2() {
    }

    public void a(long j10, long j11, boolean z10, boolean z11) {
        this.f304209e += j10;
        if (z11) {
            this.f304208d += j11;
            this.f304206b++;
        } else {
            if (z10) {
                this.f304207c += j11;
                this.f304205a++;
            }
        }
    }

    public void b() {
        this.f304205a = 0;
        this.f304207c = 0L;
        this.f304206b = 0;
        this.f304208d = 0L;
        this.f304209e = 0L;
    }

    public boolean c() {
        return this.f304205a >= 0 && this.f304207c >= 0 && this.f304206b >= 0 && this.f304208d >= 0 && this.f304209e >= 0;
    }

    @NotNull
    public i2 d(@NotNull i2 i2Var) {
        return new i2(this.f304205a - i2Var.f304205a, this.f304207c - i2Var.f304207c, this.f304206b - i2Var.f304206b, this.f304208d - i2Var.f304208d, this.f304209e - i2Var.f304209e);
    }

    @NotNull
    public i2 e() {
        return new i2(this.f304205a, this.f304207c, this.f304206b, this.f304208d, this.f304209e);
    }

    public int f() {
        return this.f304206b;
    }

    public long g() {
        return this.f304208d;
    }

    public int h() {
        return this.f304205a;
    }

    public long i() {
        return this.f304207c;
    }

    public int j() {
        return this.f304205a + this.f304206b;
    }

    public long k() {
        return this.f304209e;
    }

    public i2(int i10, long j10, int i11, long j11, long j12) {
        this.f304205a = i10;
        this.f304207c = j10;
        this.f304206b = i11;
        this.f304208d = j11;
        this.f304209e = j12;
    }
}
