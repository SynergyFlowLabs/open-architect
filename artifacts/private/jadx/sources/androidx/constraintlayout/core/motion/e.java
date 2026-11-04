package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.state.v;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Comparable<e> {
    static final int H1 = 1;
    public static final String Y = "MotionPaths";
    public static final boolean Z = false;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final int f43567g3 = 3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final int f43568h3 = 4;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final int f43569i3 = 5;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f43570j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f43571k3 = 0;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f43572l3 = 2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static String[] f43573m3 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f43574p0 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final int f43575p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final int f43576p2 = 2;
    double[] X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f43578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f43580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f43581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f43582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f43583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f43584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f43585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f43586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f43587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f43588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f43589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f43590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    c f43591o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    HashMap<String, b> f43592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f43593t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f43594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    double[] f43595w;

    public e() {
        this.f43579c = 0;
        this.f43586j = Float.NaN;
        this.f43587k = Float.NaN;
        this.f43588l = -1;
        this.f43589m = null;
        this.f43590n = Float.NaN;
        this.f43591o = null;
        this.f43592s = new HashMap<>();
        this.f43593t = 0;
        this.f43595w = new double[18];
        this.X = new double[18];
    }

    private static float L(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    private static float M(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
    }

    private boolean e(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    void D(float f10, float f11, float f12, float f13) {
        this.f43582f = f10;
        this.f43583g = f11;
        this.f43584h = f12;
        this.f43585i = f13;
    }

    void E(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
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

    void H(float f10, f fVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float f12 = this.f43582f;
        float f13 = this.f43583g;
        float f14 = this.f43584h;
        float f15 = this.f43585i;
        if (iArr.length != 0 && this.f43595w.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f43595w = new double[i10];
            this.X = new double[i10];
        }
        Arrays.fill(this.f43595w, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f43595w;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.X[i12] = dArr2[i11];
        }
        float f16 = Float.NaN;
        int i13 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (true) {
            double[] dArr5 = this.f43595w;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f16;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f43595w[i13])) {
                    d10 = this.f43595w[i13] + d10;
                }
                f11 = f16;
                float f21 = (float) d10;
                float f22 = (float) this.X[i13];
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
        c cVar = this.f43591o;
        if (cVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            cVar.r(f10, fArr, fArr2);
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
                fVar.R((float) (((double) f23) + Math.toDegrees(Math.atan2(fCos2, f28))));
            }
            f12 = fSin;
            f13 = fCos;
        } else if (!Float.isNaN(f23)) {
            fVar.R(((float) (((double) f23) + Math.toDegrees(Math.atan2(f18 + (f20 / 2.0f), f17 + (f19 / 2.0f))))) + 0.0f);
        }
        float f29 = f12 + 0.5f;
        float f30 = f13 + 0.5f;
        fVar.G((int) f29, (int) f30, (int) (f29 + f14), (int) (f30 + f15));
    }

    public void I(c cVar, e eVar) {
        double d10 = ((this.f43582f + (this.f43584h / 2.0f)) - eVar.f43582f) - (eVar.f43584h / 2.0f);
        double d11 = ((this.f43583g + (this.f43585i / 2.0f)) - eVar.f43583g) - (eVar.f43585i / 2.0f);
        this.f43591o = cVar;
        this.f43582f = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f43590n)) {
            this.f43583g = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f43583g = (float) Math.toRadians(this.f43590n);
        }
    }

    public void b(f fVar) {
        androidx.constraintlayout.core.widgets.e eVar;
        this.f43578b = androidx.constraintlayout.core.motion.utils.d.c(fVar.f43611i.f43620c);
        f.a aVar = fVar.f43611i;
        this.f43588l = aVar.f43621d;
        this.f43589m = aVar.f43618a;
        this.f43586j = aVar.f43625h;
        this.f43579c = aVar.f43622e;
        this.f43594v = aVar.f43619b;
        this.f43587k = fVar.f43612j.f43634d;
        v vVar = fVar.f43610h;
        if (vVar != null && (eVar = vVar.f44459a) != null) {
            this.f43590n = eVar.K;
        }
        for (String str : fVar.j()) {
            b bVarI = fVar.i(str);
            if (bVarI != null && bVarI.q()) {
                this.f43592s.put(str, bVarI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Float.compare(this.f43581e, eVar.f43581e);
    }

    public void d(c cVar) {
        cVar.G(this.f43587k);
    }

    void f(e eVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zE = e(this.f43582f, eVar.f43582f);
        boolean zE2 = e(this.f43583g, eVar.f43583g);
        zArr[0] = zArr[0] | e(this.f43581e, eVar.f43581e);
        zArr[1] = zArr[1] | (zE || zE2 || z10);
        zArr[2] = zArr[2] | (zE || zE2 || z10);
        zArr[3] = zArr[3] | e(this.f43584h, eVar.f43584h);
        zArr[4] = e(this.f43585i, eVar.f43585i) | zArr[4];
    }

    void k(double[] dArr, int[] iArr) {
        float[] fArr = {this.f43581e, this.f43582f, this.f43583g, this.f43584h, this.f43585i, this.f43586j};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    void l(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f43584h;
        float f11 = this.f43585i;
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
        float f10 = this.f43582f;
        float fCos = this.f43583g;
        float f11 = this.f43584h;
        float f12 = this.f43585i;
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
        c cVar = this.f43591o;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d10, fArr2, new float[2]);
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
        float fSin = this.f43582f;
        float fCos = this.f43583g;
        float f11 = this.f43584h;
        float f12 = this.f43585i;
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
        c cVar = this.f43591o;
        if (cVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            cVar.r(d10, fArr3, fArr4);
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
        float f10 = this.f43582f;
        float fCos = this.f43583g;
        float f11 = this.f43584h;
        float f12 = this.f43585i;
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
        c cVar = this.f43591o;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d10, fArr2, new float[2]);
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
        b bVar = this.f43592s.get(str);
        int i11 = 0;
        if (bVar == null) {
            return 0;
        }
        if (bVar.r() == 1) {
            dArr[i10] = bVar.n();
            return 1;
        }
        int iR = bVar.r();
        float[] fArr = new float[iR];
        bVar.o(fArr);
        while (i11 < iR) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    int r(String str) {
        b bVar = this.f43592s.get(str);
        if (bVar == null) {
            return 0;
        }
        return bVar.r();
    }

    void s(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f43582f;
        float fCos = this.f43583g;
        float f11 = this.f43584h;
        float f12 = this.f43585i;
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
        c cVar = this.f43591o;
        if (cVar != null) {
            float fS = cVar.s();
            float fT = this.f43591o.t();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((((double) fS) + (Math.sin(d11) * d10)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fT) - (d10 * Math.cos(d11))) - ((double) (f12 / 2.0f)));
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
        return this.f43592s.containsKey(str);
    }

    void v(androidx.constraintlayout.core.motion.key.e eVar, e eVar2, e eVar3) {
        float f10 = eVar.f43660h / 100.0f;
        this.f43580d = f10;
        this.f43579c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = eVar3.f43584h;
        float f14 = eVar2.f43584h;
        float f15 = eVar3.f43585i;
        float f16 = eVar2.f43585i;
        this.f43581e = this.f43580d;
        float f17 = eVar2.f43582f;
        float f18 = eVar2.f43583g;
        float f19 = f10;
        float f20 = (eVar3.f43582f + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f21 = (eVar3.f43583g + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f22 = (f13 - f14) * f11;
        float f23 = f22 / 2.0f;
        this.f43582f = (int) ((f17 + (f20 * f19)) - f23);
        float f24 = (f15 - f16) * f12;
        float f25 = f24 / 2.0f;
        this.f43583g = (int) ((f18 + (f21 * f19)) - f25);
        this.f43584h = (int) (f14 + f22);
        this.f43585i = (int) (f16 + f24);
        float f26 = Float.isNaN(eVar.E) ? f19 : eVar.E;
        float f27 = Float.isNaN(eVar.H) ? 0.0f : eVar.H;
        if (!Float.isNaN(eVar.F)) {
            f19 = eVar.F;
        }
        float f28 = Float.isNaN(eVar.G) ? 0.0f : eVar.G;
        this.f43593t = 0;
        this.f43582f = (int) (((eVar2.f43582f + (f26 * f20)) + (f28 * f21)) - f23);
        this.f43583g = (int) (((eVar2.f43583g + (f20 * f27)) + (f21 * f19)) - f25);
        this.f43578b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f43675z);
        this.f43588l = eVar.A;
    }

    void w(androidx.constraintlayout.core.motion.key.e eVar, e eVar2, e eVar3) {
        float f10 = eVar.f43660h / 100.0f;
        this.f43580d = f10;
        this.f43579c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = eVar3.f43584h - eVar2.f43584h;
        float f14 = eVar3.f43585i - eVar2.f43585i;
        this.f43581e = this.f43580d;
        if (!Float.isNaN(eVar.E)) {
            f10 = eVar.E;
        }
        float f15 = eVar2.f43582f;
        float f16 = eVar2.f43584h;
        float f17 = eVar2.f43583g;
        float f18 = eVar2.f43585i;
        float f19 = f10;
        float f20 = (eVar3.f43582f + (eVar3.f43584h / 2.0f)) - ((f16 / 2.0f) + f15);
        float f21 = (eVar3.f43583g + (eVar3.f43585i / 2.0f)) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = f13 * f11;
        float f24 = f23 / 2.0f;
        this.f43582f = (int) ((f15 + f22) - f24);
        float f25 = f21 * f19;
        float f26 = f14 * f12;
        float f27 = f26 / 2.0f;
        this.f43583g = (int) ((f17 + f25) - f27);
        this.f43584h = (int) (f16 + f23);
        this.f43585i = (int) (f18 + f26);
        float f28 = Float.isNaN(eVar.F) ? 0.0f : eVar.F;
        this.f43593t = 1;
        float f29 = (int) ((eVar2.f43582f + f22) - f24);
        float f30 = (int) ((eVar2.f43583g + f25) - f27);
        this.f43582f = f29 + ((-f21) * f28);
        this.f43583g = f30 + (f20 * f28);
        this.f43589m = this.f43589m;
        this.f43578b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f43675z);
        this.f43588l = eVar.A;
    }

    void x(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, e eVar2, e eVar3) {
        float fMin;
        float f10;
        float f11 = eVar.f43660h / 100.0f;
        this.f43580d = f11;
        this.f43579c = eVar.B;
        this.f43593t = eVar.I;
        float f12 = Float.isNaN(eVar.C) ? f11 : eVar.C;
        float f13 = Float.isNaN(eVar.D) ? f11 : eVar.D;
        float f14 = eVar3.f43584h;
        float f15 = eVar2.f43584h;
        float f16 = eVar3.f43585i;
        float f17 = eVar2.f43585i;
        this.f43581e = this.f43580d;
        this.f43584h = (int) (f15 + ((f14 - f15) * f12));
        this.f43585i = (int) (f17 + ((f16 - f17) * f13));
        int i12 = eVar.I;
        if (i12 == 1) {
            float f18 = Float.isNaN(eVar.E) ? f11 : eVar.E;
            float f19 = eVar3.f43582f;
            float f20 = eVar2.f43582f;
            this.f43582f = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(eVar.F)) {
                f11 = eVar.F;
            }
            float f21 = eVar3.f43583g;
            float f22 = eVar2.f43583g;
            this.f43583g = (f11 * (f21 - f22)) + f22;
        } else if (i12 != 2) {
            float f23 = Float.isNaN(eVar.E) ? f11 : eVar.E;
            float f24 = eVar3.f43582f;
            float f25 = eVar2.f43582f;
            this.f43582f = (f23 * (f24 - f25)) + f25;
            if (!Float.isNaN(eVar.F)) {
                f11 = eVar.F;
            }
            float f26 = eVar3.f43583g;
            float f27 = eVar2.f43583g;
            this.f43583g = (f11 * (f26 - f27)) + f27;
        } else {
            if (Float.isNaN(eVar.E)) {
                float f28 = eVar3.f43582f;
                float f29 = eVar2.f43582f;
                fMin = ((f28 - f29) * f11) + f29;
            } else {
                fMin = Math.min(f13, f12) * eVar.E;
            }
            this.f43582f = fMin;
            if (Float.isNaN(eVar.F)) {
                float f30 = eVar3.f43583g;
                float f31 = eVar2.f43583g;
                f10 = (f11 * (f30 - f31)) + f31;
            } else {
                f10 = eVar.F;
            }
            this.f43583g = f10;
        }
        this.f43589m = eVar2.f43589m;
        this.f43578b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f43675z);
        this.f43588l = eVar.A;
    }

    void z(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, e eVar2, e eVar3) {
        float f10 = eVar.f43660h / 100.0f;
        this.f43580d = f10;
        this.f43579c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = eVar3.f43584h;
        float f14 = eVar2.f43584h;
        float f15 = eVar3.f43585i;
        float f16 = eVar2.f43585i;
        this.f43581e = this.f43580d;
        float f17 = eVar2.f43582f;
        float f18 = eVar2.f43583g;
        float f19 = eVar3.f43582f + (f13 / 2.0f);
        float f20 = eVar3.f43583g + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f43582f = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f43583g = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.f43584h = (int) (f14 + f21);
        this.f43585i = (int) (f16 + f22);
        this.f43593t = 2;
        if (!Float.isNaN(eVar.E)) {
            this.f43582f = (int) (eVar.E * (i10 - ((int) this.f43584h)));
        }
        if (!Float.isNaN(eVar.F)) {
            this.f43583g = (int) (eVar.F * (i11 - ((int) this.f43585i)));
        }
        this.f43589m = this.f43589m;
        this.f43578b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f43675z);
        this.f43588l = eVar.A;
    }

    public e(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, e eVar2, e eVar3) {
        this.f43579c = 0;
        this.f43586j = Float.NaN;
        this.f43587k = Float.NaN;
        this.f43588l = -1;
        this.f43589m = null;
        this.f43590n = Float.NaN;
        this.f43591o = null;
        this.f43592s = new HashMap<>();
        this.f43593t = 0;
        this.f43595w = new double[18];
        this.X = new double[18];
        if (eVar2.f43589m != null) {
            x(i10, i11, eVar, eVar2, eVar3);
            return;
        }
        int i12 = eVar.I;
        if (i12 == 1) {
            w(eVar, eVar2, eVar3);
        } else if (i12 != 2) {
            v(eVar, eVar2, eVar3);
        } else {
            z(i10, i11, eVar, eVar2, eVar3);
        }
    }
}
