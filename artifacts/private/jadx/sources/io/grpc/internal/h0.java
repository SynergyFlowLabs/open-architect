package io.grpc.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f289228a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f289229b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f289230c = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f289231d = 1.6d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f289232e = 0.2d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f289233f = this.f289229b;

    public static final class a implements k.a {
        @Override // io.grpc.internal.k.a
        public k get() {
            return new h0();
        }
    }

    private long g(double d10, double d11) {
        com.google.common.base.j0.d(d11 >= d10);
        return (long) ((this.f289228a.nextDouble() * (d11 - d10)) + d10);
    }

    @Override // io.grpc.internal.k
    public long a() {
        long j10 = this.f289233f;
        double d10 = j10;
        this.f289233f = Math.min((long) (this.f289231d * d10), this.f289230c);
        double d11 = this.f289232e;
        return j10 + g((-d11) * d10, d11 * d10);
    }

    @com.google.common.annotations.e
    h0 b(long j10) {
        this.f289229b = j10;
        return this;
    }

    @com.google.common.annotations.e
    h0 c(double d10) {
        this.f289232e = d10;
        return this;
    }

    @com.google.common.annotations.e
    h0 d(long j10) {
        this.f289230c = j10;
        return this;
    }

    @com.google.common.annotations.e
    h0 e(double d10) {
        this.f289231d = d10;
        return this;
    }

    @com.google.common.annotations.e
    h0 f(Random random) {
        this.f289228a = random;
        return this;
    }
}
