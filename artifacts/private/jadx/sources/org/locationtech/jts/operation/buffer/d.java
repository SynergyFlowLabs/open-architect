package org.locationtech.jts.operation.buffer;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f338695g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f338696h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f338697i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f338698j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f338699k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f338700l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f338701m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double f338702n = 5.0d;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final double f338703o = 0.01d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338704a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338705b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338706c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338707d = 5.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338708e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f338709f = 0.01d;

    public d() {
        boolean z10 = true;
    }

    public static double a(int i10) {
        return 1.0d - Math.cos((1.5707963267948966d / ((double) i10)) / 2.0d);
    }

    public int b() {
        return this.f338705b;
    }

    public int c() {
        return this.f338706c;
    }

    public double d() {
        return this.f338707d;
    }

    public int e() {
        return this.f338704a;
    }

    public double f() {
        return this.f338709f;
    }

    public boolean g() {
        return this.f338708e;
    }

    public void h(int i10) {
        this.f338705b = i10;
    }

    public void i(int i10) {
        this.f338706c = i10;
    }

    public void j(double d10) {
        this.f338707d = d10;
    }

    public void k(int i10) {
        this.f338704a = i10;
        if (i10 == 0) {
            this.f338706c = 3;
        }
        if (i10 < 0) {
            this.f338706c = 2;
            this.f338707d = Math.abs(i10);
        }
        if (i10 <= 0) {
            this.f338704a = 1;
        }
        if (this.f338706c != 1) {
            this.f338704a = 8;
        }
    }

    public void l(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        }
        this.f338709f = d10;
    }

    public void m(boolean z10) {
        this.f338708e = z10;
    }

    public d(int i10) {
        k(i10);
    }

    public d(int i10, int i11) {
        k(i10);
        h(i11);
    }

    public d(int i10, int i11, int i12, double d10) {
        k(i10);
        h(i11);
        i(i12);
        j(d10);
    }
}
