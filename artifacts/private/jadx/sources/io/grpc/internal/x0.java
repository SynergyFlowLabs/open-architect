package io.grpc.internal;

import com.google.common.collect.z6;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@gj.b
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f290105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f290106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set<io.grpc.y2.b> f290107c;

    x0(int i10, long j10, Set<io.grpc.y2.b> set) {
        this.f290105a = i10;
        this.f290106b = j10;
        this.f290107c = z6.A(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f290105a == x0Var.f290105a && this.f290106b == x0Var.f290106b && com.google.common.base.d0.a(this.f290107c, x0Var.f290107c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(Integer.valueOf(this.f290105a), Long.valueOf(this.f290106b), this.f290107c);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).d("maxAttempts", this.f290105a).e("hedgingDelayNanos", this.f290106b).f("nonFatalStatusCodes", this.f290107c).toString();
    }
}
