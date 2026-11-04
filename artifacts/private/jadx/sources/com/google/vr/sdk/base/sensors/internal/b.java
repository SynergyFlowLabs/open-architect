package com.google.vr.sdk.base.sensors.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f127621f = 1.0d / TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f127622a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f127624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127625d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f127623b = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f127626e = new d();

    public b(double d10) {
        this.f127622a = 1.0d / (d10 * 6.283185307179586d);
    }

    public void a(d dVar, long j10) {
        b(dVar, j10, 1.0d);
    }

    public void b(d dVar, long j10, double d10) {
        int i10 = this.f127625d + 1;
        this.f127625d = i10;
        if (i10 == 1) {
            this.f127623b.l(dVar);
            this.f127624c = j10;
            return;
        }
        double d11 = d10 * (j10 - this.f127624c) * f127621f;
        double d12 = d11 / (this.f127622a + d11);
        this.f127623b.j(1.0d - d12);
        this.f127626e.l(dVar);
        this.f127626e.j(d12);
        d dVar2 = this.f127626e;
        d dVar3 = this.f127623b;
        d.a(dVar2, dVar3, dVar3);
        this.f127624c = j10;
    }

    public d c() {
        return this.f127623b;
    }

    public int d() {
        return this.f127625d;
    }
}
