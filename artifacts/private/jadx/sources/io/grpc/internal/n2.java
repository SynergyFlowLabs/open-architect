package io.grpc.internal;

import com.google.common.collect.z6;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@gj.b
final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f289627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f289628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f289629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f289630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    final Long f289631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set<io.grpc.y2.b> f289632f;

    n2(int i10, long j10, long j11, double d10, @fj.h Long l10, @fj.g Set<io.grpc.y2.b> set) {
        this.f289627a = i10;
        this.f289628b = j10;
        this.f289629c = j11;
        this.f289630d = d10;
        this.f289631e = l10;
        this.f289632f = z6.A(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f289627a == n2Var.f289627a && this.f289628b == n2Var.f289628b && this.f289629c == n2Var.f289629c && Double.compare(this.f289630d, n2Var.f289630d) == 0 && com.google.common.base.d0.a(this.f289631e, n2Var.f289631e) && com.google.common.base.d0.a(this.f289632f, n2Var.f289632f);
    }

    public int hashCode() {
        return com.google.common.base.d0.b(Integer.valueOf(this.f289627a), Long.valueOf(this.f289628b), Long.valueOf(this.f289629c), Double.valueOf(this.f289630d), this.f289631e, this.f289632f);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).d("maxAttempts", this.f289627a).e("initialBackoffNanos", this.f289628b).e("maxBackoffNanos", this.f289629c).b("backoffMultiplier", this.f289630d).f("perAttemptRecvTimeoutNanos", this.f289631e).f("retryableStatusCodes", this.f289632f).toString();
    }
}
