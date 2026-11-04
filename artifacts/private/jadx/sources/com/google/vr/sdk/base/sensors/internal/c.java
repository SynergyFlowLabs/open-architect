package com.google.vr.sdk.base.sensors.internal;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f127627a;

    public c() {
        this.f127627a = new double[9];
    }

    public static void a(c cVar, c cVar2, c cVar3) {
        double[] dArr = cVar3.f127627a;
        double[] dArr2 = cVar.f127627a;
        double d10 = dArr2[0];
        double[] dArr3 = cVar2.f127627a;
        dArr[0] = d10 + dArr3[0];
        dArr[1] = dArr2[1] + dArr3[1];
        dArr[2] = dArr2[2] + dArr3[2];
        dArr[3] = dArr2[3] + dArr3[3];
        dArr[4] = dArr2[4] + dArr3[4];
        dArr[5] = dArr2[5] + dArr3[5];
        dArr[6] = dArr2[6] + dArr3[6];
        dArr[7] = dArr2[7] + dArr3[7];
        dArr[8] = dArr2[8] + dArr3[8];
    }

    public static void h(c cVar, c cVar2, c cVar3) {
        double[] dArr = cVar.f127627a;
        double d10 = dArr[0];
        double[] dArr2 = cVar2.f127627a;
        double d11 = dArr2[0];
        double d12 = dArr[1];
        double d13 = dArr2[3];
        double d14 = dArr[2];
        double d15 = dArr2[6];
        double d16 = (d10 * d11) + (d12 * d13) + (d14 * d15);
        double d17 = dArr2[1];
        double d18 = dArr2[4];
        double d19 = dArr2[7];
        double d20 = (d10 * d17) + (d12 * d18) + (d14 * d19);
        double d21 = dArr2[2];
        double d22 = dArr2[5];
        double d23 = dArr2[8];
        double d24 = (d10 * d21) + (d12 * d22) + (d14 * d23);
        double d25 = dArr[3];
        double d26 = dArr[4];
        double d27 = dArr[5];
        double d28 = (d25 * d11) + (d26 * d13) + (d27 * d15);
        double d29 = (d25 * d17) + (d26 * d18) + (d27 * d19);
        double d30 = (d25 * d21) + (d26 * d22) + (d27 * d23);
        double d31 = dArr[6];
        double d32 = dArr[7];
        double d33 = dArr[8];
        cVar3.l(d16, d20, d24, d28, d29, d30, (d11 * d31) + (d13 * d32) + (d15 * d33), (d17 * d31) + (d18 * d32) + (d19 * d33), (d31 * d21) + (d32 * d22) + (d33 * d23));
    }

    public static void i(c cVar, d dVar, d dVar2) {
        double[] dArr = cVar.f127627a;
        double d10 = dArr[0];
        double d11 = dVar.f127628a;
        double d12 = dArr[1];
        double d13 = dVar.f127629b;
        double d14 = (d10 * d11) + (d12 * d13);
        double d15 = dArr[2];
        double d16 = dVar.f127630c;
        double d17 = d14 + (d15 * d16);
        double d18 = (dArr[3] * d11) + (dArr[4] * d13) + (dArr[5] * d16);
        double d19 = (dArr[6] * d11) + (dArr[7] * d13) + (dArr[8] * d16);
        dVar2.f127628a = d17;
        dVar2.f127629b = d18;
        dVar2.f127630c = d19;
    }

    public double b() {
        return ((c(0, 0) * ((c(1, 1) * c(2, 2)) - (c(2, 1) * c(1, 2)))) - (c(0, 1) * ((c(1, 0) * c(2, 2)) - (c(1, 2) * c(2, 0))))) + (c(0, 2) * ((c(1, 0) * c(2, 1)) - (c(1, 1) * c(2, 0))));
    }

    public double c(int i10, int i11) {
        return this.f127627a[(i10 * 3) + i11];
    }

    public void d(int i10, d dVar) {
        double[] dArr = this.f127627a;
        dVar.f127628a = dArr[i10];
        dVar.f127629b = dArr[i10 + 3];
        dVar.f127630c = dArr[i10 + 6];
    }

    public boolean e(c cVar) {
        double dB = b();
        if (dB == 0.0d) {
            return false;
        }
        double d10 = 1.0d / dB;
        double[] dArr = this.f127627a;
        double d11 = dArr[4];
        double d12 = dArr[8];
        double d13 = dArr[7];
        double d14 = dArr[5];
        double d15 = dArr[1];
        double d16 = dArr[2];
        double d17 = dArr[3];
        double d18 = dArr[6];
        double d19 = dArr[0];
        cVar.l(((d11 * d12) - (d13 * d14)) * d10, (-((d15 * d12) - (d16 * d13))) * d10, ((d15 * d14) - (d16 * d11)) * d10, (-((d17 * d12) - (d14 * d18))) * d10, ((d12 * d19) - (d16 * d18)) * d10, (-((d14 * d19) - (d16 * d17))) * d10, ((d17 * d13) - (d18 * d11)) * d10, (-((d13 * d19) - (d18 * d15))) * d10, ((d19 * d11) - (d17 * d15)) * d10);
        return true;
    }

    public double f() {
        double dAbs = Math.abs(this.f127627a[0]);
        int i10 = 1;
        while (true) {
            double[] dArr = this.f127627a;
            if (i10 >= dArr.length) {
                return dAbs;
            }
            dAbs = Math.max(dAbs, Math.abs(dArr[i10]));
            i10++;
        }
    }

    public void g(c cVar) {
        double[] dArr = this.f127627a;
        int i10 = 2 << 0;
        double d10 = dArr[0];
        double[] dArr2 = cVar.f127627a;
        dArr[0] = d10 - dArr2[0];
        dArr[1] = dArr[1] - dArr2[1];
        dArr[2] = dArr[2] - dArr2[2];
        int i11 = 7 ^ 3;
        dArr[3] = dArr[3] - dArr2[3];
        dArr[4] = dArr[4] - dArr2[4];
        dArr[5] = dArr[5] - dArr2[5];
        dArr[6] = dArr[6] - dArr2[6];
        dArr[7] = dArr[7] - dArr2[7];
        dArr[8] = dArr[8] - dArr2[8];
    }

    public void j(c cVar) {
        double[] dArr = this.f127627a;
        double d10 = dArr[0];
        double[] dArr2 = cVar.f127627a;
        dArr[0] = d10 + dArr2[0];
        dArr[1] = dArr[1] + dArr2[1];
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
        dArr[4] = dArr[4] + dArr2[4];
        dArr[5] = dArr[5] + dArr2[5];
        dArr[6] = dArr[6] + dArr2[6];
        dArr[7] = dArr[7] + dArr2[7];
        dArr[8] = dArr[8] + dArr2[8];
    }

    public void k(double d10) {
        double[] dArr = this.f127627a;
        dArr[0] = dArr[0] * d10;
        dArr[1] = dArr[1] * d10;
        dArr[2] = dArr[2] * d10;
        dArr[3] = dArr[3] * d10;
        int i10 = 4 << 4;
        dArr[4] = dArr[4] * d10;
        dArr[5] = dArr[5] * d10;
        dArr[6] = dArr[6] * d10;
        dArr[7] = dArr[7] * d10;
        dArr[8] = dArr[8] * d10;
    }

    public void l(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double[] dArr = this.f127627a;
        dArr[0] = d10;
        dArr[1] = d11;
        dArr[2] = d12;
        dArr[3] = d13;
        dArr[4] = d14;
        dArr[5] = d15;
        dArr[6] = d16;
        dArr[7] = d17;
        dArr[8] = d18;
    }

    public void m(int i10, int i11, double d10) {
        this.f127627a[(i10 * 3) + i11] = d10;
    }

    public void n(c cVar) {
        double[] dArr = this.f127627a;
        double[] dArr2 = cVar.f127627a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }

    public void o(int i10, d dVar) {
        double[] dArr = this.f127627a;
        dArr[i10] = dVar.f127628a;
        dArr[i10 + 3] = dVar.f127629b;
        dArr[i10 + 6] = dVar.f127630c;
    }

    public void p() {
        double[] dArr = this.f127627a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public void q(double d10) {
        double[] dArr = this.f127627a;
        dArr[8] = d10;
        dArr[4] = d10;
        dArr[0] = d10;
    }

    public void r() {
        double[] dArr = this.f127627a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public void s() {
        double[] dArr = this.f127627a;
        double d10 = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d10;
        double d11 = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d11;
        double d12 = dArr[5];
        int i10 = 3 ^ 7;
        dArr[5] = dArr[7];
        dArr[7] = d12;
    }

    public void t(c cVar) {
        double[] dArr = this.f127627a;
        double d10 = dArr[1];
        double d11 = dArr[2];
        double d12 = dArr[5];
        double[] dArr2 = cVar.f127627a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        int i10 = 5 & 6;
        dArr2[2] = dArr[6];
        dArr2[3] = d10;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d11;
        dArr2[7] = d12;
        dArr2[8] = dArr[8];
    }

    public c(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f127627a = new double[]{d10, d11, d12, d13, d14, d15, d16, d17, d18};
    }

    public c(c cVar) {
        this.f127627a = new double[]{dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6], dArr[7], dArr[8]};
        double[] dArr = cVar.f127627a;
    }
}
