package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43697g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43698h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43699i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43700j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43701k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f43702l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f43703m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f43704n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f43705o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f43706p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f43707q = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double[] f43708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C0357a[] f43709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43710f = true;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.a$a, reason: collision with other inner class name */
    private static class C0357a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f43711s = "Arc";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static double[] f43712t = new double[91];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final double f43713u = 0.001d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double[] f43714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f43715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f43716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f43717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f43718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f43719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f43720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        double f43721h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        double f43722i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        double f43723j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        double f43724k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        double f43725l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        double f43726m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f43727n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double f43728o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f43729p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f43730q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f43731r;

        C0357a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f43731r = false;
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (i10 == 1) {
                this.f43730q = true;
            } else if (i10 == 4) {
                this.f43730q = d17 > 0.0d;
            } else if (i10 != 5) {
                this.f43730q = false;
            } else {
                this.f43730q = d17 < 0.0d;
            }
            this.f43716c = d10;
            this.f43717d = d11;
            this.f43722i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f43731r = true;
            }
            if (!this.f43731r && Math.abs(d16) >= 0.001d && Math.abs(d17) >= 0.001d) {
                this.f43714a = new double[101];
                boolean z10 = this.f43730q;
                this.f43723j = d16 * ((double) (z10 ? -1 : 1));
                this.f43724k = d17 * ((double) (z10 ? 1 : -1));
                this.f43725l = z10 ? d14 : d12;
                this.f43726m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f43727n = this.f43715b * this.f43722i;
                return;
            }
            this.f43731r = true;
            this.f43718e = d12;
            this.f43719f = d14;
            this.f43720g = d13;
            this.f43721h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f43715b = dHypot;
            this.f43727n = dHypot * this.f43722i;
            double d18 = this.f43717d;
            double d19 = this.f43716c;
            this.f43725l = d16 / (d18 - d19);
            this.f43726m = d17 / (d18 - d19);
        }

        private void a(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double dHypot = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                double[] dArr = f43712t;
                if (i10 >= dArr.length) {
                    break;
                }
                int i11 = i10;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i11 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    f43712t[i11] = dHypot;
                }
                i10 = i11 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.f43715b = dHypot;
            int i12 = 0;
            while (true) {
                double[] dArr2 = f43712t;
                if (i12 >= dArr2.length) {
                    break;
                }
                dArr2[i12] = dArr2[i12] / dHypot;
                i12++;
            }
            int i13 = 0;
            while (true) {
                double[] dArr3 = this.f43714a;
                if (i13 >= dArr3.length) {
                    return;
                }
                double length = ((double) i13) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f43712t, length);
                if (iBinarySearch >= 0) {
                    this.f43714a[i13] = ((double) iBinarySearch) / ((double) (f43712t.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f43714a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double[] dArr4 = f43712t;
                    double d18 = dArr4[i15];
                    this.f43714a[i13] = (((double) i15) + ((length - d18) / (dArr4[i14 - 1] - d18))) / ((double) (dArr4.length - 1));
                }
                i13++;
            }
        }

        double b() {
            double d10 = this.f43723j * this.f43729p;
            double dHypot = this.f43727n / Math.hypot(d10, (-this.f43724k) * this.f43728o);
            return this.f43730q ? (-d10) * dHypot : d10 * dHypot;
        }

        double c() {
            double d10 = this.f43723j * this.f43729p;
            double d11 = (-this.f43724k) * this.f43728o;
            double dHypot = this.f43727n / Math.hypot(d10, d11);
            return this.f43730q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f43725l;
        }

        public double e(double d10) {
            return this.f43726m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f43716c) * this.f43722i;
            double d12 = this.f43718e;
            return d12 + (d11 * (this.f43719f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f43716c) * this.f43722i;
            double d12 = this.f43720g;
            return d12 + (d11 * (this.f43721h - d12));
        }

        double h() {
            return this.f43725l + (this.f43723j * this.f43728o);
        }

        double i() {
            return this.f43726m + (this.f43724k * this.f43729p);
        }

        double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f43714a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        void k(double d10) {
            double dJ = j((this.f43730q ? this.f43717d - d10 : d10 - this.f43716c) * this.f43722i) * 1.5707963267948966d;
            this.f43728o = Math.sin(dJ);
            this.f43729p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f43708d = dArr;
        this.f43709e = new C0357a[dArr.length - 1];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            C0357a[] c0357aArr = this.f43709e;
            if (i12 >= c0357aArr.length) {
                return;
            }
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 != 0) {
                if (i13 == 1) {
                    i10 = 1;
                    i14 = i10;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i14 = 4;
                            if (i13 != 4) {
                                i14 = 5;
                                if (i13 != 5) {
                                    i14 = i11;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                i10 = 1;
                            }
                            i14 = i10;
                        }
                    }
                    i10 = 2;
                    i14 = i10;
                }
            }
            double d10 = dArr[i12];
            int i15 = i12 + 1;
            double d11 = dArr[i15];
            double[] dArr3 = dArr2[i12];
            double d12 = dArr3[0];
            double d13 = dArr3[1];
            double[] dArr4 = dArr2[i15];
            c0357aArr[i12] = new C0357a(i14, d10, d11, d12, d13, dArr4[0], dArr4[1]);
            i12 = i15;
            i11 = i14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double d10, int i10) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i11 = 0;
        if (this.f43710f) {
            C0357a[] c0357aArr = this.f43709e;
            C0357a c0357a = c0357aArr[0];
            double d11 = c0357a.f43716c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0357a.f43731r) {
                    if (i10 == 0) {
                        dG2 = c0357a.f(d11);
                        dE2 = this.f43709e[0].d(d11);
                    } else {
                        dG2 = c0357a.g(d11);
                        dE2 = this.f43709e[0].e(d11);
                    }
                    return dG2 + (d12 * dE2);
                }
                c0357a.k(d11);
                if (i10 == 0) {
                    dI = this.f43709e[0].h();
                    dC = this.f43709e[0].b();
                } else {
                    dI = this.f43709e[0].i();
                    dC = this.f43709e[0].c();
                }
                return dI + (d12 * dC);
            }
            if (d10 > c0357aArr[c0357aArr.length - 1].f43717d) {
                double d13 = c0357aArr[c0357aArr.length - 1].f43717d;
                double d14 = d10 - d13;
                int length = c0357aArr.length - 1;
                if (i10 == 0) {
                    dG = c0357aArr[length].f(d13);
                    dE = this.f43709e[length].d(d13);
                } else {
                    dG = c0357aArr[length].g(d13);
                    dE = this.f43709e[length].e(d13);
                }
                return dG + (d14 * dE);
            }
        } else {
            C0357a[] c0357aArr2 = this.f43709e;
            double d15 = c0357aArr2[0].f43716c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0357aArr2[c0357aArr2.length - 1].f43717d) {
                d10 = c0357aArr2[c0357aArr2.length - 1].f43717d;
            }
        }
        while (true) {
            C0357a[] c0357aArr3 = this.f43709e;
            if (i11 >= c0357aArr3.length) {
                return Double.NaN;
            }
            C0357a c0357a2 = c0357aArr3[i11];
            if (d10 <= c0357a2.f43717d) {
                if (c0357a2.f43731r) {
                    return i10 == 0 ? c0357a2.f(d10) : c0357a2.g(d10);
                }
                c0357a2.k(d10);
                return i10 == 0 ? this.f43709e[i11].h() : this.f43709e[i11].i();
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double d10, double[] dArr) {
        if (this.f43710f) {
            C0357a[] c0357aArr = this.f43709e;
            C0357a c0357a = c0357aArr[0];
            double d11 = c0357a.f43716c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0357a.f43731r) {
                    dArr[0] = c0357a.f(d11) + (this.f43709e[0].d(d11) * d12);
                    dArr[1] = this.f43709e[0].g(d11) + (d12 * this.f43709e[0].e(d11));
                    return;
                } else {
                    c0357a.k(d11);
                    dArr[0] = this.f43709e[0].h() + (this.f43709e[0].b() * d12);
                    dArr[1] = this.f43709e[0].i() + (d12 * this.f43709e[0].c());
                    return;
                }
            }
            if (d10 > c0357aArr[c0357aArr.length - 1].f43717d) {
                double d13 = c0357aArr[c0357aArr.length - 1].f43717d;
                double d14 = d10 - d13;
                int length = c0357aArr.length - 1;
                C0357a c0357a2 = c0357aArr[length];
                if (c0357a2.f43731r) {
                    dArr[0] = c0357a2.f(d13) + (this.f43709e[length].d(d13) * d14);
                    dArr[1] = this.f43709e[length].g(d13) + (d14 * this.f43709e[length].e(d13));
                    return;
                } else {
                    c0357a2.k(d10);
                    dArr[0] = this.f43709e[length].h() + (this.f43709e[length].b() * d14);
                    dArr[1] = this.f43709e[length].i() + (d14 * this.f43709e[length].c());
                    return;
                }
            }
        } else {
            C0357a[] c0357aArr2 = this.f43709e;
            double d15 = c0357aArr2[0].f43716c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > c0357aArr2[c0357aArr2.length - 1].f43717d) {
                d10 = c0357aArr2[c0357aArr2.length - 1].f43717d;
            }
        }
        int i10 = 0;
        while (true) {
            C0357a[] c0357aArr3 = this.f43709e;
            if (i10 >= c0357aArr3.length) {
                return;
            }
            C0357a c0357a3 = c0357aArr3[i10];
            if (d10 <= c0357a3.f43717d) {
                if (c0357a3.f43731r) {
                    dArr[0] = c0357a3.f(d10);
                    dArr[1] = this.f43709e[i10].g(d10);
                    return;
                } else {
                    c0357a3.k(d10);
                    dArr[0] = this.f43709e[i10].h();
                    dArr[1] = this.f43709e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double d10, float[] fArr) {
        if (this.f43710f) {
            C0357a[] c0357aArr = this.f43709e;
            C0357a c0357a = c0357aArr[0];
            double d11 = c0357a.f43716c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0357a.f43731r) {
                    fArr[0] = (float) (c0357a.f(d11) + (this.f43709e[0].d(d11) * d12));
                    fArr[1] = (float) (this.f43709e[0].g(d11) + (d12 * this.f43709e[0].e(d11)));
                    return;
                } else {
                    c0357a.k(d11);
                    fArr[0] = (float) (this.f43709e[0].h() + (this.f43709e[0].b() * d12));
                    fArr[1] = (float) (this.f43709e[0].i() + (d12 * this.f43709e[0].c()));
                    return;
                }
            }
            if (d10 > c0357aArr[c0357aArr.length - 1].f43717d) {
                double d13 = c0357aArr[c0357aArr.length - 1].f43717d;
                double d14 = d10 - d13;
                int length = c0357aArr.length - 1;
                C0357a c0357a2 = c0357aArr[length];
                if (c0357a2.f43731r) {
                    fArr[0] = (float) (c0357a2.f(d13) + (this.f43709e[length].d(d13) * d14));
                    fArr[1] = (float) (this.f43709e[length].g(d13) + (d14 * this.f43709e[length].e(d13)));
                    return;
                } else {
                    c0357a2.k(d10);
                    fArr[0] = (float) this.f43709e[length].h();
                    fArr[1] = (float) this.f43709e[length].i();
                    return;
                }
            }
        } else {
            C0357a[] c0357aArr2 = this.f43709e;
            double d15 = c0357aArr2[0].f43716c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0357aArr2[c0357aArr2.length - 1].f43717d) {
                d10 = c0357aArr2[c0357aArr2.length - 1].f43717d;
            }
        }
        int i10 = 0;
        while (true) {
            C0357a[] c0357aArr3 = this.f43709e;
            if (i10 >= c0357aArr3.length) {
                return;
            }
            C0357a c0357a3 = c0357aArr3[i10];
            if (d10 <= c0357a3.f43717d) {
                if (c0357a3.f43731r) {
                    fArr[0] = (float) c0357a3.f(d10);
                    fArr[1] = (float) this.f43709e[i10].g(d10);
                    return;
                } else {
                    c0357a3.k(d10);
                    fArr[0] = (float) this.f43709e[i10].h();
                    fArr[1] = (float) this.f43709e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double d10, int i10) {
        C0357a[] c0357aArr = this.f43709e;
        int i11 = 0;
        double d11 = c0357aArr[0].f43716c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c0357aArr[c0357aArr.length - 1].f43717d) {
            d10 = c0357aArr[c0357aArr.length - 1].f43717d;
        }
        while (true) {
            C0357a[] c0357aArr2 = this.f43709e;
            if (i11 >= c0357aArr2.length) {
                return Double.NaN;
            }
            C0357a c0357a = c0357aArr2[i11];
            if (d10 <= c0357a.f43717d) {
                if (c0357a.f43731r) {
                    return i10 == 0 ? c0357a.d(d10) : c0357a.e(d10);
                }
                c0357a.k(d10);
                return i10 == 0 ? this.f43709e[i11].b() : this.f43709e[i11].c();
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double d10, double[] dArr) {
        C0357a[] c0357aArr = this.f43709e;
        double d11 = c0357aArr[0].f43716c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0357aArr[c0357aArr.length - 1].f43717d) {
            d10 = c0357aArr[c0357aArr.length - 1].f43717d;
        }
        int i10 = 0;
        while (true) {
            C0357a[] c0357aArr2 = this.f43709e;
            if (i10 >= c0357aArr2.length) {
                return;
            }
            C0357a c0357a = c0357aArr2[i10];
            if (d10 <= c0357a.f43717d) {
                if (c0357a.f43731r) {
                    dArr[0] = c0357a.d(d10);
                    dArr[1] = this.f43709e[i10].e(d10);
                    return;
                } else {
                    c0357a.k(d10);
                    dArr[0] = this.f43709e[i10].b();
                    dArr[1] = this.f43709e[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f43708d;
    }
}
