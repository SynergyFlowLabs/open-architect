package org.locationtech.jts.util;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f339154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f339155b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f339156c = false;

    public l() {
        f();
    }

    public static String c(long j10) {
        if (j10 < 10000) {
            return j10 + " ms";
        }
        return (j10 / 1000.0d) + " s";
    }

    private void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f339154a;
        this.f339154a = jCurrentTimeMillis;
        this.f339155b += j10;
    }

    public long a() {
        h();
        return this.f339155b;
    }

    public String b() {
        return c(a());
    }

    public void d() {
        this.f339155b = 0L;
        this.f339154a = System.currentTimeMillis();
    }

    public long e() {
        if (this.f339156c) {
            h();
        }
        return this.f339155b;
    }

    public void f() {
        if (this.f339156c) {
            return;
        }
        this.f339154a = System.currentTimeMillis();
        this.f339156c = true;
    }

    public long g() {
        if (this.f339156c) {
            h();
            this.f339156c = false;
        }
        return this.f339155b;
    }
}
