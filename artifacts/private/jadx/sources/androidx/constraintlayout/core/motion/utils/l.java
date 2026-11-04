package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f43833i = "Oscillator";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43834j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43835k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f43836l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43837m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f43838n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f43839o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f43840p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f43841q = 7;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f43844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f43845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    k f43846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43847f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f43842a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double[] f43843b = new double[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f43848g = 6.283185307179586d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43849h = false;

    public void a(double d10, float f10) {
        int length = this.f43842a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f43843b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f43843b = Arrays.copyOf(this.f43843b, length);
        this.f43842a = Arrays.copyOf(this.f43842a, length);
        this.f43844c = new double[length];
        double[] dArr = this.f43843b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f43843b[iBinarySearch] = d10;
        this.f43842a[iBinarySearch] = f10;
        this.f43849h = false;
    }

    double b(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f43843b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f43842a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f43843b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return (d10 * d14) + (((double) f11) - (d14 * d13));
    }

    double c(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f43843b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f43842a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f43843b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return this.f43844c[i10] + ((((double) f11) - (d14 * d13)) * (d10 - d13)) + ((d14 * ((d10 * d10) - (d13 * d13))) / 2.0d);
    }

    public double d(double d10, double d11, double d12) {
        double d13;
        double dSignum;
        double dC = d11 + c(d10);
        double dB = b(d10) + d12;
        switch (this.f43847f) {
            case 1:
                return 0.0d;
            case 2:
                d13 = dB * 4.0d;
                dSignum = Math.signum((((dC * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dB * 2.0d;
            case 4:
                return (-dB) * 2.0d;
            case 5:
                double d14 = this.f43848g;
                return (-d14) * dB * Math.sin(d14 * dC);
            case 6:
                d13 = dB * 4.0d;
                dSignum = (((dC * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                break;
            case 7:
                return this.f43846e.f(dC % 1.0d, 0);
            default:
                double d15 = this.f43848g;
                d13 = dB * d15;
                dSignum = Math.cos(d15 * dC);
                break;
        }
        return d13 * dSignum;
    }

    public double e(double d10, double d11) {
        double dC = c(d10) + d11;
        switch (this.f43847f) {
            case 1:
                return Math.signum(0.5d - (dC % 1.0d));
            case 2:
                return 1.0d - Math.abs((((dC * 4.0d) + 1.0d) % 4.0d) - 2.0d);
            case 3:
                return (((dC * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                return 1.0d - (((dC * 2.0d) + 1.0d) % 2.0d);
            case 5:
                return Math.cos(this.f43848g * (d11 + dC));
            case 6:
                double dAbs = 1.0d - Math.abs(((dC * 4.0d) % 4.0d) - 2.0d);
                return 1.0d - (dAbs * dAbs);
            case 7:
                return this.f43846e.c(dC % 1.0d, 0);
            default:
                return Math.sin(this.f43848g * dC);
        }
    }

    public void f() {
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f43842a;
            if (i10 >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr2 = this.f43842a;
            if (i11 >= fArr2.length) {
                break;
            }
            int i12 = i11 - 1;
            float f10 = (fArr2[i12] + fArr2[i11]) / 2.0f;
            double[] dArr = this.f43843b;
            d11 += (dArr[i11] - dArr[i12]) * ((double) f10);
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr3 = this.f43842a;
            if (i13 >= fArr3.length) {
                break;
            }
            fArr3[i13] = fArr3[i13] * ((float) (d10 / d11));
            i13++;
        }
        this.f43844c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = this.f43842a;
            if (i14 >= fArr4.length) {
                this.f43849h = true;
                return;
            }
            int i15 = i14 - 1;
            float f11 = (fArr4[i15] + fArr4[i14]) / 2.0f;
            double[] dArr2 = this.f43843b;
            double d12 = dArr2[i14] - dArr2[i15];
            double[] dArr3 = this.f43844c;
            dArr3[i14] = dArr3[i15] + (d12 * ((double) f11));
            i14++;
        }
    }

    public void g(int i10, String str) {
        this.f43847f = i10;
        this.f43845d = str;
        if (str != null) {
            this.f43846e = k.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f43843b) + " period=" + Arrays.toString(this.f43842a);
    }
}
