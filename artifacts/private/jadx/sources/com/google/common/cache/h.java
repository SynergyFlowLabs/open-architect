package com.google.common.cache;

import com.google.common.base.j0;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f116813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f116814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f116815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f116816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f116817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f116818f;

    public h(long hitCount, long missCount, long loadSuccessCount, long loadExceptionCount, long totalLoadTime, long evictionCount) {
        j0.d(hitCount >= 0);
        j0.d(missCount >= 0);
        j0.d(loadSuccessCount >= 0);
        j0.d(loadExceptionCount >= 0);
        j0.d(totalLoadTime >= 0);
        j0.d(evictionCount >= 0);
        this.f116813a = hitCount;
        this.f116814b = missCount;
        this.f116815c = loadSuccessCount;
        this.f116816d = loadExceptionCount;
        this.f116817e = totalLoadTime;
        this.f116818f = evictionCount;
    }

    public double a() {
        long jX = com.google.common.math.h.x(this.f116815c, this.f116816d);
        if (jX == 0) {
            return 0.0d;
        }
        return this.f116817e / jX;
    }

    public long b() {
        return this.f116818f;
    }

    public long c() {
        return this.f116813a;
    }

    public double d() {
        long jM = m();
        if (jM == 0) {
            return 1.0d;
        }
        return this.f116813a / jM;
    }

    public long e() {
        return com.google.common.math.h.x(this.f116815c, this.f116816d);
    }

    public boolean equals(@fj.a Object object) {
        if (object instanceof h) {
            h hVar = (h) object;
            if (this.f116813a == hVar.f116813a && this.f116814b == hVar.f116814b && this.f116815c == hVar.f116815c && this.f116816d == hVar.f116816d && this.f116817e == hVar.f116817e && this.f116818f == hVar.f116818f) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f116816d;
    }

    public double g() {
        long jX = com.google.common.math.h.x(this.f116815c, this.f116816d);
        if (jX == 0) {
            return 0.0d;
        }
        return this.f116816d / jX;
    }

    public long h() {
        return this.f116815c;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(Long.valueOf(this.f116813a), Long.valueOf(this.f116814b), Long.valueOf(this.f116815c), Long.valueOf(this.f116816d), Long.valueOf(this.f116817e), Long.valueOf(this.f116818f));
    }

    public h i(h other) {
        return new h(Math.max(0L, com.google.common.math.h.A(this.f116813a, other.f116813a)), Math.max(0L, com.google.common.math.h.A(this.f116814b, other.f116814b)), Math.max(0L, com.google.common.math.h.A(this.f116815c, other.f116815c)), Math.max(0L, com.google.common.math.h.A(this.f116816d, other.f116816d)), Math.max(0L, com.google.common.math.h.A(this.f116817e, other.f116817e)), Math.max(0L, com.google.common.math.h.A(this.f116818f, other.f116818f)));
    }

    public long j() {
        return this.f116814b;
    }

    public double k() {
        long jM = m();
        if (jM == 0) {
            return 0.0d;
        }
        return this.f116814b / jM;
    }

    public h l(h other) {
        return new h(com.google.common.math.h.x(this.f116813a, other.f116813a), com.google.common.math.h.x(this.f116814b, other.f116814b), com.google.common.math.h.x(this.f116815c, other.f116815c), com.google.common.math.h.x(this.f116816d, other.f116816d), com.google.common.math.h.x(this.f116817e, other.f116817e), com.google.common.math.h.x(this.f116818f, other.f116818f));
    }

    public long m() {
        return com.google.common.math.h.x(this.f116813a, this.f116814b);
    }

    public long n() {
        return this.f116817e;
    }

    public String toString() {
        return com.google.common.base.b0.c(this).e("hitCount", this.f116813a).e("missCount", this.f116814b).e("loadSuccessCount", this.f116815c).e("loadExceptionCount", this.f116816d).e("totalLoadTime", this.f116817e).e("evictionCount", this.f116818f).toString();
    }
}
