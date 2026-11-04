package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class s implements Comparable<s> {
    static final int H1 = 2;
    public static final String X = "MotionPaths";
    public static final boolean Y = false;
    public static final boolean Z = false;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final int f45353g3 = 4;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final int f45354h3 = 5;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final int f45355i3 = 1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static final int f45356j3 = 0;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    static final int f45357k3 = 2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static String[] f45358l3 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f45359p0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final int f45360p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final int f45361p2 = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f45362a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f45364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f45365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f45366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f45367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f45368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f45369h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f45372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f45373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f45374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o f45375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f45376o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f45377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f45378t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    double[] f45379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    double[] f45380w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f45363b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f45370i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f45371j = Float.NaN;

    s() {
        int i10 = f.f45121f;
        this.f45372k = i10;
        this.f45373l = i10;
        this.f45374m = Float.NaN;
        this.f45375n = null;
        this.f45376o = new LinkedHashMap<>();
        this.f45377s = 0;
        this.f45379v = new double[18];
        this.f45380w = new double[18];
    }

    private static float M(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    private static float N(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
    }

    private boolean e(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            return Math.abs(f10 - f11) > 1.0E-6f;
        }
        return Float.isNaN(f10) != Float.isNaN(f11);
    }

    void D(int i10, int i11, j jVar, s sVar, s sVar2) {
        float f10 = jVar.f45142a / 100.0f;
        this.f45364c = f10;
        this.f45363b = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = sVar2.f45368g;
        float f14 = sVar.f45368g;
        float f15 = sVar2.f45369h;
        float f16 = sVar.f45369h;
        this.f45365d = this.f45364c;
        float f17 = sVar.f45366e;
        float f18 = sVar.f45367f;
        float f19 = sVar2.f45366e + (f13 / 2.0f);
        float f20 = sVar2.f45367f + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f45366e = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f45367f = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.f45368g = (int) (f14 + f21);
        this.f45369h = (int) (f16 + f22);
        this.f45377s = 2;
        if (!Float.isNaN(jVar.K)) {
            this.f45366e = (int) (jVar.K * (i10 - ((int) this.f45368g)));
        }
        if (!Float.isNaN(jVar.L)) {
            this.f45367f = (int) (jVar.L * (i11 - ((int) this.f45369h)));
        }
        this.f45373l = this.f45373l;
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f45372k = jVar.G;
    }

    void E(float f10, float f11, float f12, float f13) {
        this.f45366e = f10;
        this.f45367f = f11;
        this.f45368g = f12;
        this.f45369h = f13;
    }

    void H(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void I(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float f12 = this.f45366e;
        float f13 = this.f45367f;
        float f14 = this.f45368g;
        float f15 = this.f45369h;
        if (iArr.length != 0 && this.f45379v.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f45379v = new double[i10];
            this.f45380w = new double[i10];
        }
        Arrays.fill(this.f45379v, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f45379v;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f45380w[i12] = dArr2[i11];
        }
        float f16 = Float.NaN;
        int i13 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (true) {
            double[] dArr5 = this.f45379v;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f16;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f45379v[i13])) {
                    d10 = this.f45379v[i13] + d10;
                }
                f11 = f16;
                float f21 = (float) d10;
                float f22 = (float) this.f45380w[i13];
                if (i13 == 1) {
                    f16 = f11;
                    f12 = f21;
                    f17 = f22;
                } else if (i13 == 2) {
                    f16 = f11;
                    f13 = f21;
                    f18 = f22;
                } else if (i13 == 3) {
                    f16 = f11;
                    f14 = f21;
                    f19 = f22;
                } else if (i13 == 4) {
                    f16 = f11;
                    f15 = f21;
                    f20 = f22;
                } else if (i13 == 5) {
                    f16 = f21;
                }
                i13++;
            }
            f16 = f11;
            i13++;
        }
        float f23 = f16;
        o oVar = this.f45375n;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(f10, fArr, fArr2);
            float f24 = fArr[0];
            float f25 = fArr[1];
            float f26 = fArr2[0];
            float f27 = fArr2[1];
            double d11 = f12;
            double d12 = f13;
            float fSin = (float) ((((double) f24) + (Math.sin(d12) * d11)) - ((double) (f14 / 2.0f)));
            float fCos = (float) ((((double) f25) - (Math.cos(d12) * d11)) - ((double) (f15 / 2.0f)));
            double d13 = f26;
            double d14 = f17;
            double dSin = d13 + (Math.sin(d12) * d14);
            double dCos = Math.cos(d12) * d11;
            double d15 = f18;
            float f28 = (float) (dSin + (dCos * d15));
            float fCos2 = (float) ((((double) f27) - (d14 * Math.cos(d12))) + (Math.sin(d12) * d11 * d15));
            if (dArr2.length >= 2) {
                dArr2[0] = f28;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f23)) {
                view.setRotation((float) (((double) f23) + Math.toDegrees(Math.atan2(fCos2, f28))));
            }
            f12 = fSin;
            f13 = fCos;
        } else if (!Float.isNaN(f23)) {
            view.setRotation(f23 + ((float) Math.toDegrees(Math.atan2(f18 + (f20 / 2.0f), f17 + (f19 / 2.0f)))) + 0.0f);
        }
        if (view instanceof e) {
            ((e) view).a(f12, f13, f14 + f12, f15 + f13);
            return;
        }
        float f29 = f12 + 0.5f;
        int i14 = (int) f29;
        float f30 = f13 + 0.5f;
        int i15 = (int) f30;
        int i16 = (int) (f29 + f14);
        int i17 = (int) (f30 + f15);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void L(o oVar, s sVar) {
        double d10 = ((this.f45366e + (this.f45368g / 2.0f)) - sVar.f45366e) - (sVar.f45368g / 2.0f);
        double d11 = ((this.f45367f + (this.f45369h / 2.0f)) - sVar.f45367f) - (sVar.f45369h / 2.0f);
        this.f45375n = oVar;
        this.f45366e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f45374m)) {
            this.f45367f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f45367f = (float) Math.toRadians(this.f45374m);
        }
    }

    public void b(androidx.constraintlayout.widget.f.a aVar) {
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(aVar.f45925d.f46039d);
        androidx.constraintlayout.widget.f.c cVar = aVar.f45925d;
        this.f45372k = cVar.f46040e;
        this.f45373l = cVar.f46037b;
        this.f45370i = cVar.f46044i;
        this.f45363b = cVar.f46041f;
        this.f45378t = cVar.f46038c;
        this.f45371j = aVar.f45924c.f46054e;
        this.f45374m = aVar.f45926e.D;
        for (String str : aVar.f45928g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f45928g.get(str);
            if (aVar2 != null && aVar2.n()) {
                this.f45376o.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull s sVar) {
        return Float.compare(this.f45365d, sVar.f45365d);
    }

    public void d(o oVar) {
        oVar.A(this.f45371j);
    }

    void f(s sVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zE = e(this.f45366e, sVar.f45366e);
        boolean zE2 = e(this.f45367f, sVar.f45367f);
        zArr[0] = zArr[0] | e(this.f45365d, sVar.f45365d);
        boolean z11 = zE | zE2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | e(this.f45368g, sVar.f45368g);
        zArr[4] = e(this.f45369h, sVar.f45369h) | zArr[4];
    }

    void k(double[] dArr, int[] iArr) {
        float[] fArr = {this.f45365d, this.f45366e, this.f45367f, this.f45368g, this.f45369h, this.f45370i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    void l(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f45368g;
        float f11 = this.f45369h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
    }

    void n(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f45366e;
        float fCos = this.f45367f;
        float f11 = this.f45368g;
        float f12 = this.f45369h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        o oVar = this.f45375n;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d10, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d11 = f10;
            double d12 = fCos;
            float fSin = (float) ((((double) f14) + (Math.sin(d12) * d11)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (d11 * Math.cos(d12))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        fArr[i10] = f10 + (f11 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f12 / 2.0f) + 0.0f;
    }

    void o(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f45366e;
        float fCos = this.f45367f;
        float f11 = this.f45368g;
        float f12 = this.f45369h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i11 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i11 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fCos2 = (f16 / 2.0f) + f15;
        o oVar = this.f45375n;
        if (oVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            oVar.m(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            double d11 = f20;
            f10 = 2.0f;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f21) - (Math.cos(d13) * d12)) - ((double) (f12 / 2.0f)));
            double d14 = f22;
            double d15 = f13;
            double d16 = f15;
            float fSin2 = (float) (d14 + (Math.sin(d13) * d15) + (Math.cos(d13) * d16));
            fCos2 = (float) ((((double) f23) - (d15 * Math.cos(d13))) + (Math.sin(d13) * d16));
            f19 = fSin2;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f11 / f10) + 0.0f;
        fArr[1] = fCos + (f12 / f10) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fCos2;
    }

    void p(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f45366e;
        float fCos = this.f45367f;
        float f11 = this.f45368g;
        float f12 = this.f45369h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        o oVar = this.f45375n;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d10, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d11 = f10;
            double d12 = fCos;
            float fSin = (float) ((((double) f14) + (Math.sin(d12) * d11)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (d11 * Math.cos(d12))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        fArr[i10] = f10 + (f11 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f12 / 2.0f) + 0.0f;
    }

    int q(String str, double[] dArr, int i10) {
        androidx.constraintlayout.widget.a aVar = this.f45376o.get(str);
        int i11 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.p() == 1) {
            dArr[i10] = aVar.k();
            return 1;
        }
        int iP = aVar.p();
        float[] fArr = new float[iP];
        aVar.l(fArr);
        while (i11 < iP) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iP;
    }

    int r(String str) {
        androidx.constraintlayout.widget.a aVar = this.f45376o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    void s(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f45366e;
        float fCos = this.f45367f;
        float f11 = this.f45368g;
        float f12 = this.f45369h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        o oVar = this.f45375n;
        if (oVar != null) {
            float fN = oVar.n();
            float fO = this.f45375n.o();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((((double) fN) + (Math.sin(d11) * d10)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fO) - (d10 * Math.cos(d11))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f10 + 0.0f;
        fArr[i10 + 1] = fCos + 0.0f;
        fArr[i10 + 2] = f14 + 0.0f;
        fArr[i10 + 3] = fCos + 0.0f;
        fArr[i10 + 4] = f14 + 0.0f;
        fArr[i10 + 5] = f15 + 0.0f;
        fArr[i10 + 6] = f10 + 0.0f;
        fArr[i10 + 7] = f15 + 0.0f;
    }

    boolean t(String str) {
        return this.f45376o.containsKey(str);
    }

    void v(j jVar, s sVar, s sVar2) {
        float f10 = jVar.f45142a / 100.0f;
        this.f45364c = f10;
        this.f45363b = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = sVar2.f45368g;
        float f14 = sVar.f45368g;
        float f15 = f13 - f14;
        float f16 = sVar2.f45369h;
        float f17 = sVar.f45369h;
        float f18 = f16 - f17;
        this.f45365d = this.f45364c;
        float f19 = sVar.f45366e;
        float f20 = (f14 / 2.0f) + f19;
        float f21 = sVar.f45367f;
        float f22 = f21 + (f17 / 2.0f);
        float f23 = f10;
        float f24 = sVar2.f45366e + (f13 / 2.0f);
        float f25 = sVar2.f45367f + (f16 / 2.0f);
        if (f20 > f24) {
            f20 = f24;
            f24 = f20;
        }
        if (f22 <= f25) {
            f22 = f25;
            f25 = f22;
        }
        float f26 = f24 - f20;
        float f27 = f22 - f25;
        float f28 = f15 * f11;
        float f29 = f28 / 2.0f;
        this.f45366e = (int) ((f19 + (f26 * f23)) - f29);
        float f30 = f18 * f12;
        float f31 = f30 / 2.0f;
        this.f45367f = (int) ((f21 + (f27 * f23)) - f31);
        this.f45368g = (int) (f14 + f28);
        this.f45369h = (int) (f17 + f30);
        float f32 = Float.isNaN(jVar.K) ? f23 : jVar.K;
        float f33 = Float.isNaN(jVar.N) ? 0.0f : jVar.N;
        if (!Float.isNaN(jVar.L)) {
            f23 = jVar.L;
        }
        float f34 = Float.isNaN(jVar.M) ? 0.0f : jVar.M;
        this.f45377s = 0;
        this.f45366e = (int) (((sVar.f45366e + (f32 * f26)) + (f34 * f27)) - f29);
        this.f45367f = (int) (((sVar.f45367f + (f26 * f33)) + (f27 * f23)) - f31);
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f45372k = jVar.G;
    }

    void w(j jVar, s sVar, s sVar2) {
        float f10 = jVar.f45142a / 100.0f;
        this.f45364c = f10;
        this.f45363b = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = sVar2.f45368g;
        float f14 = sVar.f45368g;
        float f15 = sVar2.f45369h;
        float f16 = sVar.f45369h;
        this.f45365d = this.f45364c;
        float f17 = sVar.f45366e;
        float f18 = sVar.f45367f;
        float f19 = f10;
        float f20 = (sVar2.f45366e + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f21 = (sVar2.f45367f + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f22 = (f13 - f14) * f11;
        float f23 = f22 / 2.0f;
        this.f45366e = (int) ((f17 + (f20 * f19)) - f23);
        float f24 = (f15 - f16) * f12;
        float f25 = f24 / 2.0f;
        this.f45367f = (int) ((f18 + (f21 * f19)) - f25);
        this.f45368g = (int) (f14 + f22);
        this.f45369h = (int) (f16 + f24);
        float f26 = Float.isNaN(jVar.K) ? f19 : jVar.K;
        float f27 = Float.isNaN(jVar.N) ? 0.0f : jVar.N;
        if (!Float.isNaN(jVar.L)) {
            f19 = jVar.L;
        }
        float f28 = Float.isNaN(jVar.M) ? 0.0f : jVar.M;
        this.f45377s = 0;
        this.f45366e = (int) (((sVar.f45366e + (f26 * f20)) + (f28 * f21)) - f23);
        this.f45367f = (int) (((sVar.f45367f + (f20 * f27)) + (f21 * f19)) - f25);
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f45372k = jVar.G;
    }

    void x(j jVar, s sVar, s sVar2) {
        float f10 = jVar.f45142a / 100.0f;
        this.f45364c = f10;
        this.f45363b = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = sVar2.f45368g - sVar.f45368g;
        float f14 = sVar2.f45369h - sVar.f45369h;
        this.f45365d = this.f45364c;
        if (!Float.isNaN(jVar.K)) {
            f10 = jVar.K;
        }
        float f15 = sVar.f45366e;
        float f16 = sVar.f45368g;
        float f17 = sVar.f45367f;
        float f18 = sVar.f45369h;
        float f19 = f10;
        float f20 = (sVar2.f45366e + (sVar2.f45368g / 2.0f)) - ((f16 / 2.0f) + f15);
        float f21 = (sVar2.f45367f + (sVar2.f45369h / 2.0f)) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = f13 * f11;
        float f24 = f23 / 2.0f;
        this.f45366e = (int) ((f15 + f22) - f24);
        float f25 = f21 * f19;
        float f26 = f14 * f12;
        float f27 = f26 / 2.0f;
        this.f45367f = (int) ((f17 + f25) - f27);
        this.f45368g = (int) (f16 + f23);
        this.f45369h = (int) (f18 + f26);
        float f28 = Float.isNaN(jVar.L) ? 0.0f : jVar.L;
        this.f45377s = 1;
        float f29 = (int) ((sVar.f45366e + f22) - f24);
        float f30 = (int) ((sVar.f45367f + f25) - f27);
        this.f45366e = f29 + ((-f21) * f28);
        this.f45367f = f30 + (f20 * f28);
        this.f45373l = this.f45373l;
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f45372k = jVar.G;
    }

    void z(int i10, int i11, j jVar, s sVar, s sVar2) {
        float fMin;
        float f10;
        float f11 = jVar.f45142a / 100.0f;
        this.f45364c = f11;
        this.f45363b = jVar.H;
        this.f45377s = jVar.O;
        float f12 = Float.isNaN(jVar.I) ? f11 : jVar.I;
        float f13 = Float.isNaN(jVar.J) ? f11 : jVar.J;
        float f14 = sVar2.f45368g;
        float f15 = sVar.f45368g;
        float f16 = sVar2.f45369h;
        float f17 = sVar.f45369h;
        this.f45365d = this.f45364c;
        this.f45368g = (int) (f15 + ((f14 - f15) * f12));
        this.f45369h = (int) (f17 + ((f16 - f17) * f13));
        if (jVar.O != 2) {
            float f18 = Float.isNaN(jVar.K) ? f11 : jVar.K;
            float f19 = sVar2.f45366e;
            float f20 = sVar.f45366e;
            this.f45366e = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(jVar.L)) {
                f11 = jVar.L;
            }
            float f21 = sVar2.f45367f;
            float f22 = sVar.f45367f;
            this.f45367f = (f11 * (f21 - f22)) + f22;
        } else {
            if (Float.isNaN(jVar.K)) {
                float f23 = sVar2.f45366e;
                float f24 = sVar.f45366e;
                fMin = ((f23 - f24) * f11) + f24;
            } else {
                fMin = Math.min(f13, f12) * jVar.K;
            }
            this.f45366e = fMin;
            if (Float.isNaN(jVar.L)) {
                float f25 = sVar2.f45367f;
                float f26 = sVar.f45367f;
                f10 = (f11 * (f25 - f26)) + f26;
            } else {
                f10 = jVar.L;
            }
            this.f45367f = f10;
        }
        this.f45373l = sVar.f45373l;
        this.f45362a = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f45372k = jVar.G;
    }

    s(int i10, int i11, j jVar, s sVar, s sVar2) {
        int i12 = f.f45121f;
        this.f45372k = i12;
        this.f45373l = i12;
        this.f45374m = Float.NaN;
        this.f45375n = null;
        this.f45376o = new LinkedHashMap<>();
        this.f45377s = 0;
        this.f45379v = new double[18];
        this.f45380w = new double[18];
        if (sVar.f45373l != f.f45121f) {
            z(i10, i11, jVar, sVar, sVar2);
            return;
        }
        int i13 = jVar.O;
        if (i13 == 1) {
            x(jVar, sVar, sVar2);
            return;
        }
        if (i13 == 2) {
            D(i10, i11, jVar, sVar, sVar2);
        } else if (i13 != 3) {
            w(jVar, sVar, sVar2);
        } else {
            v(jVar, sVar, sVar2);
        }
    }
}
