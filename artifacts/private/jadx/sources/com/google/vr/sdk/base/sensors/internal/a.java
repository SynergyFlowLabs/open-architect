package com.google.vr.sdk.base.sensors.internal;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f127603h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f127604i = 10.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f127605j = 0.15f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f127606k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f127607l = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f127608m = 0.5f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f127609n = 0.008f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f127610o = 0.35f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f127611p = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f127612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f127613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f127614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f127615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f127616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1235a f127617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1235a f127618g;

    /* JADX INFO: renamed from: com.google.vr.sdk.base.sensors.internal.a$a, reason: collision with other inner class name */
    static class C1235a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f127619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f127620b;

        C1235a(int i10) {
            this.f127619a = i10;
        }

        void a(boolean z10) {
            if (z10) {
                this.f127620b++;
            } else {
                this.f127620b = 0;
            }
        }

        boolean b() {
            return this.f127620b >= this.f127619a;
        }
    }

    public a() {
        d();
    }

    private void e(d dVar, long j10) {
        if (dVar.e() >= 0.3499999940395355d) {
            return;
        }
        double dMax = Math.max(0.0d, 1.0d - (dVar.e() / 0.3499999940395355d));
        this.f127614c.b(this.f127613b.c(), j10, dMax * dMax);
    }

    public void a(d dVar) {
        if (this.f127614c.d() < 30) {
            dVar.n();
        } else {
            dVar.l(this.f127614c.c());
            dVar.j(Math.min(1.0d, ((double) (this.f127614c.d() - 30)) / 100.0d));
        }
    }

    public void b(d dVar, long j10) {
        this.f127612a.a(dVar, j10);
        d.o(dVar, this.f127612a.c(), this.f127616e);
        this.f127617f.a(this.f127616e.e() < 0.5d);
    }

    public void c(d dVar, long j10) {
        this.f127613b.a(dVar, j10);
        d.o(dVar, this.f127613b.c(), this.f127615d);
        this.f127618g.a(this.f127615d.e() < 0.00800000037997961d);
        if (this.f127618g.b() && this.f127617f.b()) {
            e(dVar, j10);
        }
    }

    public void d() {
        this.f127615d = new d();
        this.f127616e = new d();
        this.f127612a = new b(1.0d);
        this.f127613b = new b(10.0d);
        this.f127614c = new b(0.15000000596046448d);
        this.f127617f = new C1235a(10);
        this.f127618g = new C1235a(10);
    }
}
