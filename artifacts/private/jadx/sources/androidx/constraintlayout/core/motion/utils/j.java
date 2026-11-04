package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class j extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43821i = "LinearCurveFit";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double[] f43822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double[][] f43823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f43824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43825g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    double[] f43826h;

    public j(double[] dArr, double[][] dArr2) {
        this.f43824f = Double.NaN;
        int length = dArr2[0].length;
        this.f43826h = new double[length];
        this.f43822d = dArr;
        this.f43823e = dArr2;
        if (length > 2) {
            int i10 = 0;
            double d10 = 0.0d;
            while (true) {
                double d11 = d10;
                if (i10 >= dArr.length) {
                    break;
                }
                double d12 = dArr2[i10][0];
                if (i10 > 0) {
                    Math.hypot(d12 - d10, d12 - d11);
                }
                i10++;
                d10 = d12;
            }
            this.f43824f = 0.0d;
        }
    }

    private double i(double d10) {
        if (Double.isNaN(this.f43824f)) {
            return 0.0d;
        }
        double[] dArr = this.f43822d;
        int length = dArr.length;
        if (d10 <= dArr[0]) {
            return 0.0d;
        }
        int i10 = length - 1;
        if (d10 >= dArr[i10]) {
            return this.f43824f;
        }
        double dHypot = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        while (i11 < i10) {
            double[] dArr2 = this.f43823e[i11];
            double d13 = dArr2[0];
            double d14 = dArr2[1];
            if (i11 > 0) {
                dHypot += Math.hypot(d13 - d11, d14 - d12);
            }
            double[] dArr3 = this.f43822d;
            double d15 = dArr3[i11];
            if (d10 == d15) {
                return dHypot;
            }
            int i12 = i11 + 1;
            double d16 = dArr3[i12];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                double[][] dArr4 = this.f43823e;
                double[] dArr5 = dArr4[i11];
                double d18 = dArr5[0];
                double[] dArr6 = dArr4[i12];
                double d19 = 1.0d - d17;
                return dHypot + Math.hypot(d14 - ((dArr5[1] * d19) + (dArr6[1] * d17)), d13 - ((d18 * d19) + (dArr6[0] * d17)));
            }
            i11 = i12;
            d11 = d13;
            d12 = d14;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double d10, int i10) {
        double[] dArr = this.f43822d;
        int length = dArr.length;
        int i11 = 0;
        if (this.f43825g) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                return this.f43823e[0][i10] + ((d10 - d11) * f(d11, i10));
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                return this.f43823e[i12][i10] + ((d10 - d12) * f(d12, i10));
            }
        } else {
            if (d10 <= dArr[0]) {
                return this.f43823e[0][i10];
            }
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                return this.f43823e[i13][i10];
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f43822d;
            double d13 = dArr2[i11];
            if (d10 == d13) {
                return this.f43823e[i11][i10];
            }
            int i14 = i11 + 1;
            double d14 = dArr2[i14];
            if (d10 < d14) {
                double d15 = (d10 - d13) / (d14 - d13);
                double[][] dArr3 = this.f43823e;
                return (dArr3[i11][i10] * (1.0d - d15)) + (dArr3[i14][i10] * d15);
            }
            i11 = i14;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double d10, double[] dArr) {
        double[] dArr2 = this.f43822d;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f43823e[0].length;
        if (this.f43825g) {
            double d11 = dArr2[0];
            if (d10 <= d11) {
                g(d11, this.f43826h);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.f43823e[0][i11] + ((d10 - this.f43822d[0]) * this.f43826h[i11]);
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr2[i12];
            if (d10 >= d12) {
                g(d12, this.f43826h);
                while (i10 < length2) {
                    dArr[i10] = this.f43823e[i12][i10] + ((d10 - this.f43822d[i12]) * this.f43826h[i10]);
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f43823e[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = this.f43823e[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f43822d[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f43823e[i15][i16];
                }
            }
            double[] dArr3 = this.f43822d;
            int i17 = i15 + 1;
            double d13 = dArr3[i17];
            if (d10 < d13) {
                double d14 = dArr3[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr4 = this.f43823e;
                    dArr[i10] = (dArr4[i15][i10] * (1.0d - d15)) + (dArr4[i17][i10] * d15);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double d10, float[] fArr) {
        double[] dArr = this.f43822d;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f43823e[0].length;
        if (this.f43825g) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                g(d11, this.f43826h);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (this.f43823e[0][i11] + ((d10 - this.f43822d[0]) * this.f43826h[i11]));
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                g(d12, this.f43826h);
                while (i10 < length2) {
                    fArr[i10] = (float) (this.f43823e[i12][i10] + ((d10 - this.f43822d[i12]) * this.f43826h[i10]));
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f43823e[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) this.f43823e[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f43822d[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f43823e[i15][i16];
                }
            }
            double[] dArr2 = this.f43822d;
            int i17 = i15 + 1;
            double d13 = dArr2[i17];
            if (d10 < d13) {
                double d14 = dArr2[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr3 = this.f43823e;
                    fArr[i10] = (float) ((dArr3[i15][i10] * (1.0d - d15)) + (dArr3[i17][i10] * d15));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b A[PHI: r3
      0x000b: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0009, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double d10, int i10) {
        double[] dArr = this.f43822d;
        int length = dArr.length;
        int i11 = 0;
        double d11 = dArr[0];
        if (d10 < d11) {
            d10 = d11;
        } else {
            d11 = dArr[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f43822d;
            int i12 = i11 + 1;
            double d12 = dArr2[i12];
            if (d10 <= d12) {
                double d13 = d12 - dArr2[i11];
                double[][] dArr3 = this.f43823e;
                return (dArr3[i12][i10] - dArr3[i11][i10]) / d13;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0012 A[PHI: r4
      0x0012: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x0010, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double d10, double[] dArr) {
        double[] dArr2 = this.f43822d;
        int length = dArr2.length;
        int length2 = this.f43823e[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            d10 = d11;
        } else {
            d11 = dArr2[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            double[] dArr3 = this.f43822d;
            int i11 = i10 + 1;
            double d12 = dArr3[i11];
            if (d10 <= d12) {
                double d13 = d12 - dArr3[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    double[][] dArr4 = this.f43823e;
                    dArr[i12] = (dArr4[i11][i12] - dArr4[i10][i12]) / d13;
                }
                break;
            }
            i10 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f43822d;
    }
}
