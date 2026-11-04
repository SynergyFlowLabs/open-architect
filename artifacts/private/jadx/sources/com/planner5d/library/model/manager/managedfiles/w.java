package com.planner5d.library.model.manager.managedfiles;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f192090f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f192091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f192092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f192093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f192094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f192095e;

    public w(long j10, long j11, long j12, long j13) {
        this.f192091a = j10;
        this.f192092b = j11;
        this.f192093c = j12;
        this.f192094d = j13;
        this.f192095e = f() ? 1.0f : j13 / j11;
    }

    public final long a() {
        return this.f192091a;
    }

    public final long b() {
        return this.f192093c;
    }

    public final long c() {
        return this.f192094d;
    }

    public final long d() {
        return this.f192092b;
    }

    public final float e() {
        return this.f192095e;
    }

    public final boolean f() {
        return this.f192091a == this.f192093c;
    }

    @NotNull
    public final w g(long j10) {
        long j11 = this.f192091a;
        return new w(j11, this.f192092b, Math.min(this.f192093c + 1, j11), Math.min(this.f192094d + j10, this.f192092b));
    }
}
