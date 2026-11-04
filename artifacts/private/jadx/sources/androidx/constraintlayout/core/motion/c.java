package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.g;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.x;
import androidx.constraintlayout.core.motion.utils.y;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class c implements v {
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int Z = 5;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f43495a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f43496b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f43497c0 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f43498d0 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f43499e0 = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f43500f0 = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f43501g0 = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f43502h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f43503i0 = 2;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f43504j0 = "MotionController";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final boolean f43505k0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final boolean f43506l0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    static final int f43507m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final int f43508n0 = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final int f43509o0 = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f43510p0 = 3;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final int f43511q0 = 4;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final int f43512r0 = 5;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f43513s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f43514t0 = -2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f43515u0 = -3;
    private String[] A;
    private int[] B;
    private HashMap<String, t> H;
    private HashMap<String, o> I;
    private HashMap<String, h> J;
    private g[] K;
    c S;
    String[] T;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f43517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f43518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f43519k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f43525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f43526r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f43530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f43531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f43532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private double[] f43533y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private double[] f43534z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    m f43516h = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43520l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f43521m = new e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f43522n = new e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f43523o = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f43524p = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f43527s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f43528t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f43529u = 1.0f;
    private int C = 4;
    private float[] D = new float[4];
    private ArrayList<e> E = new ArrayList<>();
    private float[] F = new float[1];
    private ArrayList<androidx.constraintlayout.core.motion.key.b> G = new ArrayList<>();
    private int L = -1;
    private int M = -1;
    private f N = null;
    private int O = -1;
    private float P = Float.NaN;
    private androidx.constraintlayout.core.motion.utils.c Q = null;
    private boolean R = false;

    class a implements androidx.constraintlayout.core.motion.utils.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f43535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f43536b;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f43536b = dVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float a() {
            return (float) this.f43536b.b(this.f43535a);
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float getInterpolation(float f10) {
            this.f43535a = f10;
            return (float) this.f43536b.a(f10);
        }
    }

    public c(f fVar) {
        g0(fVar);
    }

    private static androidx.constraintlayout.core.motion.utils.c A(int i10, String str, int i11) {
        if (i10 != -1) {
            return null;
        }
        return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
    }

    private float J() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f43521m.f43578b;
            float f12 = Float.NaN;
            float f13 = 0.0f;
            for (e eVar : this.E) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = eVar.f43578b;
                if (dVar2 != null) {
                    float f14 = eVar.f43580d;
                    if (f14 < f11) {
                        dVar = dVar2;
                        f13 = f14;
                    } else if (Float.isNaN(f12)) {
                        f12 = eVar.f43580d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                float f15 = f12 - f13;
                dA = (((float) dVar.a((f11 - f13) / f15)) * f15) + f13;
            }
            double d12 = dA;
            this.f43525q[0].d(d12, this.f43533y);
            int i11 = i10;
            this.f43521m.n(d12, this.f43532x, this.f43533y, fArr, 0);
            if (i11 > 0) {
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            }
            d10 = fArr[0];
            d11 = fArr[1];
            i10 = i11 + 1;
        }
        return fHypot;
    }

    private void Q(e eVar) {
        e eVar2 = null;
        for (e eVar3 : this.E) {
            if (eVar.f43581e == eVar3.f43581e) {
                eVar2 = eVar3;
            }
        }
        if (eVar2 != null) {
            this.E.remove(eVar2);
        }
        int iBinarySearch = Collections.binarySearch(this.E, eVar);
        if (iBinarySearch == 0) {
            w.f(f43504j0, " KeyPath position \"" + eVar.f43581e + "\" outside of range");
        }
        this.E.add((-iBinarySearch) - 1, eVar);
    }

    private void U(e eVar) {
        eVar.D(this.f43517i.E(), this.f43517i.F(), this.f43517i.D(), this.f43517i.k());
    }

    private void i0() {
        c cVar = this.S;
        if (cVar == null) {
            return;
        }
        this.f43521m.I(cVar, cVar.f43521m);
        e eVar = this.f43522n;
        c cVar2 = this.S;
        eVar.I(cVar2, cVar2.f43522n);
    }

    private float o(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f43529u;
            if (f12 != 1.0d) {
                float f13 = this.f43528t;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f43521m.f43578b;
        float f14 = Float.NaN;
        for (e eVar : this.E) {
            androidx.constraintlayout.core.motion.utils.d dVar2 = eVar.f43578b;
            if (dVar2 != null) {
                float f15 = eVar.f43580d;
                if (f15 < f10) {
                    dVar = dVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = eVar.f43580d;
                }
            }
        }
        if (dVar == null) {
            return f10;
        }
        float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
        double d10 = (f10 - f11) / f16;
        float fA = (((float) dVar.a(d10)) * f16) + f11;
        if (fArr != null) {
            fArr[0] = (float) dVar.b(d10);
        }
        return fA;
    }

    public e B(int i10) {
        return this.E.get(i10);
    }

    public int C(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.G) {
            int i13 = bVar.f43663k;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = bVar.f43660h;
                iArr[i12 + 2] = i14;
                double d10 = i14 / 100.0f;
                this.f43525q[0].d(d10, this.f43533y);
                this.f43521m.n(d10, this.f43532x, this.f43533y, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (bVar instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar = (androidx.constraintlayout.core.motion.key.e) bVar;
                    iArr[i12 + 5] = eVar.I;
                    iArr[i12 + 6] = Float.floatToIntBits(eVar.E);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(eVar.F);
                }
                int i16 = i15 + 1;
                iArr[i12] = i16 - i12;
                i11++;
                i12 = i16;
            }
        }
        return i11;
    }

    float D(int i10, float f10, float f11) {
        e eVar = this.f43522n;
        float f12 = eVar.f43582f;
        e eVar2 = this.f43521m;
        float f13 = eVar2.f43582f;
        float f14 = f12 - f13;
        float f15 = eVar.f43583g;
        float f16 = eVar2.f43583g;
        float f17 = f15 - f16;
        float f18 = f13 + (eVar2.f43584h / 2.0f);
        float f19 = f16 + (eVar2.f43585i / 2.0f);
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i10 == 0) {
            return f22 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public int E(int[] iArr, float[] fArr) {
        int i10 = 0;
        int i11 = 0;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.G) {
            int i12 = bVar.f43660h;
            iArr[i10] = (bVar.f43663k * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f43525q[0].d(d10, this.f43533y);
            this.f43521m.n(d10, this.f43532x, this.f43533y, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public float F() {
        return this.f43527s;
    }

    double[] G(double d10) {
        this.f43525q[0].d(d10, this.f43533y);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
        if (bVar != null) {
            double[] dArr = this.f43533y;
            if (dArr.length > 0) {
                bVar.d(d10, dArr);
            }
        }
        return this.f43533y;
    }

    androidx.constraintlayout.core.motion.key.e H(int i10, int i11, float f10, float f11) {
        int i12;
        int i13;
        float f12;
        float f13;
        androidx.constraintlayout.core.motion.utils.e eVar = new androidx.constraintlayout.core.motion.utils.e();
        e eVar2 = this.f43521m;
        float f14 = eVar2.f43582f;
        eVar.f43759b = f14;
        float f15 = eVar2.f43583g;
        eVar.f43761d = f15;
        eVar.f43760c = f14 + eVar2.f43584h;
        eVar.f43758a = f15 + eVar2.f43585i;
        androidx.constraintlayout.core.motion.utils.e eVar3 = new androidx.constraintlayout.core.motion.utils.e();
        e eVar4 = this.f43522n;
        float f16 = eVar4.f43582f;
        eVar3.f43759b = f16;
        float f17 = eVar4.f43583g;
        eVar3.f43761d = f17;
        eVar3.f43760c = f16 + eVar4.f43584h;
        eVar3.f43758a = f17 + eVar4.f43585i;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.G) {
            if (bVar instanceof androidx.constraintlayout.core.motion.key.e) {
                androidx.constraintlayout.core.motion.key.e eVar5 = (androidx.constraintlayout.core.motion.key.e) bVar;
                i12 = i10;
                i13 = i11;
                f12 = f10;
                f13 = f11;
                if (eVar5.B(i12, i13, eVar, eVar3, f12, f13)) {
                    return eVar5;
                }
            } else {
                i12 = i10;
                i13 = i11;
                f12 = f10;
                f13 = f11;
            }
            i10 = i12;
            i11 = i13;
            f10 = f12;
            f11 = f13;
        }
        return null;
    }

    void I(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float fO = o(f10, this.F);
        HashMap<String, o> map = this.I;
        o oVar = map == null ? null : map.get("translationX");
        HashMap<String, o> map2 = this.I;
        o oVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, o> map3 = this.I;
        o oVar3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, o> map4 = this.I;
        o oVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, o> map5 = this.I;
        o oVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, h> map6 = this.J;
        h hVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, h> map7 = this.J;
        h hVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, h> map8 = this.J;
        h hVar3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, h> map9 = this.J;
        h hVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, h> map10 = this.J;
        h hVar5 = map10 != null ? map10.get("scaleY") : null;
        x xVar = new x();
        xVar.b();
        xVar.d(oVar3, fO);
        xVar.h(oVar, oVar2, fO);
        xVar.f(oVar4, oVar5, fO);
        xVar.c(hVar3, fO);
        xVar.g(hVar, hVar2, fO);
        xVar.e(hVar4, hVar5, fO);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
        if (bVar != null) {
            double[] dArr = this.f43533y;
            if (dArr.length > 0) {
                double d10 = fO;
                bVar.d(d10, dArr);
                this.f43526r.g(d10, this.f43534z);
                this.f43521m.E(f11, f12, fArr, this.f43532x, this.f43534z, this.f43533y);
            }
            xVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.f43525q == null) {
            e eVar = this.f43522n;
            float f13 = eVar.f43582f;
            e eVar2 = this.f43521m;
            float f14 = f13 - eVar2.f43582f;
            float f15 = eVar.f43583g - eVar2.f43583g;
            float f16 = (eVar.f43584h - eVar2.f43584h) + f14;
            float f17 = f15 + (eVar.f43585i - eVar2.f43585i);
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            xVar.b();
            xVar.d(oVar3, fO);
            xVar.h(oVar, oVar2, fO);
            xVar.f(oVar4, oVar5, fO);
            xVar.c(hVar3, fO);
            xVar.g(hVar, hVar2, fO);
            xVar.e(hVar4, hVar5, fO);
            xVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        double dO = o(fO, this.F);
        this.f43525q[0].g(dO, this.f43534z);
        this.f43525q[0].d(dO, this.f43533y);
        float f18 = this.F[0];
        while (true) {
            double[] dArr2 = this.f43534z;
            if (i12 >= dArr2.length) {
                this.f43521m.E(f11, f12, fArr, this.f43532x, dArr2, this.f43533y);
                xVar.a(f11, f12, i10, i11, fArr);
                return;
            } else {
                dArr2[i12] = dArr2[i12] * ((double) f18);
                i12++;
            }
        }
    }

    public float K() {
        return this.f43521m.f43585i;
    }

    public float L() {
        return this.f43521m.f43584h;
    }

    public float M() {
        return this.f43521m.f43582f;
    }

    public float N() {
        return this.f43521m.f43583g;
    }

    public int O() {
        return this.M;
    }

    public f P() {
        return this.f43517i;
    }

    public boolean R(f fVar, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
        f fVar2 = fVar;
        float fO = o(f10, null);
        int i10 = this.O;
        if (i10 != -1) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fO / f11)) * f11;
            float f12 = (fO % f11) / f11;
            if (!Float.isNaN(this.P)) {
                f12 = (f12 + this.P) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.c cVar = this.Q;
            fO = ((cVar != null ? cVar.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fO;
        HashMap<String, o> map = this.I;
        if (map != null) {
            Iterator<o> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().h(fVar2, f13);
            }
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f43525q;
        if (bVarArr != null) {
            double d10 = f13;
            bVarArr[0].d(d10, this.f43533y);
            this.f43525q[0].g(d10, this.f43534z);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
            if (bVar != null) {
                double[] dArr = this.f43533y;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                    this.f43526r.g(d10, this.f43534z);
                }
            }
            if (!this.R) {
                this.f43521m.H(f13, fVar2, this.f43532x, this.f43533y, this.f43534z, null);
                f13 = f13;
                fVar2 = fVar2;
            }
            if (this.M != -1) {
                if (this.N == null) {
                    this.N = fVar2.n().f(this.M);
                }
                f fVar3 = this.N;
                if (fVar3 != null) {
                    float fW = (fVar3.w() + this.N.h()) / 2.0f;
                    float fL = (this.N.l() + this.N.q()) / 2.0f;
                    if (fVar2.q() - fVar2.l() > 0 && fVar2.h() - fVar2.w() > 0) {
                        float fL2 = fL - fVar2.l();
                        float fW2 = fW - fVar2.w();
                        fVar2.N(fL2);
                        fVar2.O(fW2);
                    }
                }
            }
            int i11 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f43525q;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i11].e(d10, this.D);
                this.f43521m.f43592s.get(this.A[i11 - 1]).w(fVar2, this.D);
                i11++;
            }
            d dVar = this.f43523o;
            if (dVar.f43543b == 0) {
                if (f13 <= 0.0f) {
                    fVar2.b0(dVar.f43544c);
                } else if (f13 >= 1.0f) {
                    fVar2.b0(this.f43524p.f43544c);
                } else if (this.f43524p.f43544c != dVar.f43544c) {
                    fVar2.b0(4);
                }
            }
            if (this.K != null) {
                int i12 = 0;
                while (true) {
                    g[] gVarArr = this.K;
                    if (i12 >= gVarArr.length) {
                        break;
                    }
                    gVarArr[i12].v(f13, fVar2);
                    i12++;
                }
            }
        } else {
            e eVar = this.f43521m;
            float f14 = eVar.f43582f;
            e eVar2 = this.f43522n;
            float f15 = f14 + ((eVar2.f43582f - f14) * f13);
            float f16 = eVar.f43583g;
            float f17 = f16 + ((eVar2.f43583g - f16) * f13);
            float f18 = eVar.f43584h;
            float f19 = f18 + ((eVar2.f43584h - f18) * f13);
            float f20 = eVar.f43585i;
            float f21 = f15 + 0.5f;
            float f22 = f17 + 0.5f;
            fVar2.G((int) f21, (int) f22, (int) (f21 + f19), (int) (f22 + f20 + ((eVar2.f43585i - f20) * f13)));
        }
        HashMap<String, h> map2 = this.J;
        if (map2 != null) {
            for (h hVar : map2.values()) {
                if (hVar instanceof h.d) {
                    double[] dArr2 = this.f43534z;
                    ((h.d) hVar).l(fVar2, f13, dArr2[0], dArr2[1]);
                } else {
                    hVar.h(fVar2, f13);
                }
            }
        }
        return false;
    }

    String S() {
        return this.f43517i.m();
    }

    void T(f fVar, androidx.constraintlayout.core.motion.key.e eVar, float f10, float f11, String[] strArr, float[] fArr) {
        androidx.constraintlayout.core.motion.utils.e eVar2 = new androidx.constraintlayout.core.motion.utils.e();
        e eVar3 = this.f43521m;
        float f12 = eVar3.f43582f;
        eVar2.f43759b = f12;
        float f13 = eVar3.f43583g;
        eVar2.f43761d = f13;
        eVar2.f43760c = f12 + eVar3.f43584h;
        eVar2.f43758a = f13 + eVar3.f43585i;
        androidx.constraintlayout.core.motion.utils.e eVar4 = new androidx.constraintlayout.core.motion.utils.e();
        e eVar5 = this.f43522n;
        float f14 = eVar5.f43582f;
        eVar4.f43759b = f14;
        float f15 = eVar5.f43583g;
        eVar4.f43761d = f15;
        eVar4.f43760c = f14 + eVar5.f43584h;
        eVar4.f43758a = f15 + eVar5.f43585i;
        eVar.C(fVar, eVar2, eVar4, f10, f11, strArr, fArr);
    }

    void V(m mVar, m mVar2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = mVar.f43851b + mVar.f43852c;
            mVar2.f43851b = ((mVar.f43853d + mVar.f43850a) - mVar.b()) / 2;
            mVar2.f43853d = i12 - ((i13 + mVar.a()) / 2);
            mVar2.f43852c = mVar2.f43851b + mVar.b();
            mVar2.f43850a = mVar2.f43853d + mVar.a();
            return;
        }
        if (i10 == 2) {
            int i14 = mVar.f43851b + mVar.f43852c;
            mVar2.f43851b = i11 - (((mVar.f43853d + mVar.f43850a) + mVar.b()) / 2);
            mVar2.f43853d = (i14 - mVar.a()) / 2;
            mVar2.f43852c = mVar2.f43851b + mVar.b();
            mVar2.f43850a = mVar2.f43853d + mVar.a();
            return;
        }
        if (i10 == 3) {
            int i15 = mVar.f43851b + mVar.f43852c;
            mVar2.f43851b = ((mVar.a() / 2) + mVar.f43853d) - (i15 / 2);
            mVar2.f43853d = i12 - ((i15 + mVar.a()) / 2);
            mVar2.f43852c = mVar2.f43851b + mVar.b();
            mVar2.f43850a = mVar2.f43853d + mVar.a();
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = mVar.f43851b + mVar.f43852c;
        mVar2.f43851b = i11 - (((mVar.f43850a + mVar.f43853d) + mVar.b()) / 2);
        mVar2.f43853d = (i16 - mVar.a()) / 2;
        mVar2.f43852c = mVar2.f43851b + mVar.b();
        mVar2.f43850a = mVar2.f43853d + mVar.a();
    }

    void W(f fVar) {
        e eVar = this.f43521m;
        eVar.f43580d = 0.0f;
        eVar.f43581e = 0.0f;
        int i10 = 5 & 1;
        this.R = true;
        eVar.D(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f43522n.D(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f43523o.r(fVar);
        this.f43524p.r(fVar);
    }

    public void X(int i10) {
        this.f43521m.f43579c = i10;
    }

    public void Y(f fVar) {
        e eVar = this.f43522n;
        eVar.f43580d = 1.0f;
        eVar.f43581e = 1.0f;
        U(eVar);
        this.f43522n.D(fVar.l(), fVar.w(), fVar.D(), fVar.k());
        this.f43522n.b(fVar);
        this.f43524p.r(fVar);
    }

    public void Z(String str) {
        this.f43518j = str;
        this.f43521m.f43577a = str;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return 0;
    }

    public void a0(int i10) {
        this.L = i10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 509) {
            a0(i11);
            return true;
        }
        if (i10 != 610) {
            return i10 == 704;
        }
        this.O = i11;
        return true;
    }

    public void b0(float f10) {
        this.f43528t = f10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (602 == i10) {
            this.P = f10;
            return true;
        }
        if (600 != i10) {
            return false;
        }
        this.f43527s = f10;
        return true;
    }

    public void c0(float f10) {
        this.f43529u = f10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        return false;
    }

    public void d0(f fVar) {
        e eVar = this.f43521m;
        eVar.f43580d = 0.0f;
        eVar.f43581e = 0.0f;
        eVar.D(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f43521m.b(fVar);
        this.f43523o.r(fVar);
        u uVarM = fVar.C().m();
        if (uVarM != null) {
            uVarM.g(this);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (705 != i10 && 611 != i10) {
            if (605 != i10) {
                return false;
            }
            this.f43521m.f43589m = str;
            return true;
        }
        this.Q = A(-1, str, 0);
        return true;
    }

    public void e0(y yVar, f fVar, int i10, int i11, int i12) {
        e eVar = this.f43521m;
        eVar.f43580d = 0.0f;
        eVar.f43581e = 0.0f;
        m mVar = new m();
        if (i10 == 1) {
            int i13 = yVar.f44153b + yVar.f44155d;
            mVar.f43851b = ((yVar.f44154c + yVar.f44156e) - yVar.c()) / 2;
            mVar.f43853d = i11 - ((i13 + yVar.b()) / 2);
            mVar.f43852c = mVar.f43851b + yVar.c();
            mVar.f43850a = mVar.f43853d + yVar.b();
        } else if (i10 == 2) {
            int i14 = yVar.f44153b + yVar.f44155d;
            mVar.f43851b = i12 - (((yVar.f44154c + yVar.f44156e) + yVar.c()) / 2);
            mVar.f43853d = (i14 - yVar.b()) / 2;
            mVar.f43852c = mVar.f43851b + yVar.c();
            mVar.f43850a = mVar.f43853d + yVar.b();
        }
        this.f43521m.D(mVar.f43851b, mVar.f43853d, mVar.b(), mVar.a());
        this.f43523o.s(mVar, fVar, i10, yVar.f44152a);
    }

    public void f(androidx.constraintlayout.core.motion.key.b bVar) {
        this.G.add(bVar);
    }

    public void f0(int i10) {
        this.M = i10;
        this.N = null;
    }

    void g(ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList) {
        this.G.addAll(arrayList);
    }

    public void g0(f fVar) {
        this.f43517i = fVar;
    }

    void h(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, o> map = this.I;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, o> map2 = this.I;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, h> map3 = this.J;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, h> map4 = this.J;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            float fMin = i11 * f10;
            float f11 = this.f43529u;
            float f12 = 0.0f;
            if (f11 != 1.0f) {
                float f13 = this.f43528t;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, 1.0f);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f43521m.f43578b;
            float f14 = Float.NaN;
            for (e eVar : this.E) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = eVar.f43578b;
                if (dVar2 != null) {
                    float f15 = eVar.f43580d;
                    if (f15 < fMin) {
                        dVar = dVar2;
                        f12 = f15;
                    } else if (Float.isNaN(f14)) {
                        f14 = eVar.f43580d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                float f16 = f14 - f12;
                dA = (((float) dVar.a((fMin - f12) / f16)) * f16) + f12;
            }
            this.f43525q[0].d(dA, this.f43533y);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
            if (bVar != null) {
                double[] dArr = this.f43533y;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            this.f43521m.l(this.f43532x, this.f43533y, fArr, i11 * 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h0(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        int i12;
        String[] strArr;
        int i13;
        b bVar;
        o oVarF;
        b bVar2;
        Integer num;
        o oVarF2;
        b bVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        i0();
        int i14 = this.L;
        if (i14 != -1) {
            e eVar = this.f43521m;
            if (eVar.f43588l == -1) {
                eVar.f43588l = i14;
            }
        }
        this.f43523o.f(this.f43524p, hashSet2);
        ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList2 = this.G;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.core.motion.key.b bVar4 : arrayList2) {
                if (bVar4 instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar2 = (androidx.constraintlayout.core.motion.key.e) bVar4;
                    Q(new e(i10, i11, eVar2, this.f43521m, this.f43522n));
                    int i15 = eVar2.f43674y;
                    if (i15 != -1) {
                        this.f43520l = i15;
                    }
                } else if (bVar4 instanceof androidx.constraintlayout.core.motion.key.d) {
                    bVar4.i(hashSet3);
                } else if (bVar4 instanceof androidx.constraintlayout.core.motion.key.f) {
                    bVar4.i(hashSet);
                } else if (bVar4 instanceof g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((g) bVar4);
                } else {
                    bVar4.q(map);
                    bVar4.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.K = (g[]) arrayList.toArray(new g[0]);
        }
        int i16 = 1;
        if (hashSet2.isEmpty()) {
            i12 = 1;
        } else {
            this.I = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    i.b bVar5 = new i.b();
                    String str2 = str.split(",")[i16];
                    for (androidx.constraintlayout.core.motion.key.b bVar6 : this.G) {
                        HashMap<String, b> map2 = bVar6.f43664l;
                        if (map2 != null && (bVar3 = map2.get(str2)) != null) {
                            bVar5.a(bVar6.f43660h, bVar3);
                        }
                    }
                    oVarF2 = o.e(str, bVar5);
                } else {
                    oVarF2 = o.f(str, j10);
                }
                if (oVarF2 != null) {
                    oVarF2.i(str);
                    this.I.put(str, oVarF2);
                }
                i16 = i16;
            }
            i12 = i16;
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList3 = this.G;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.core.motion.key.b bVar7 : arrayList3) {
                    if (bVar7 instanceof androidx.constraintlayout.core.motion.key.c) {
                        bVar7.f(this.I);
                    }
                }
            }
            this.f43523o.b(this.I, 0);
            this.f43524p.b(this.I, 100);
            for (String str3 : this.I.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                o oVar = this.I.get(str3);
                if (oVar != null) {
                    oVar.j(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.H == null) {
                this.H = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.H.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        i.b bVar8 = new i.b();
                        String str5 = str4.split(",")[i12];
                        for (androidx.constraintlayout.core.motion.key.b bVar9 : this.G) {
                            HashMap<String, b> map3 = bVar9.f43664l;
                            if (map3 != null && (bVar2 = map3.get(str5)) != null) {
                                bVar8.a(bVar9.f43660h, bVar2);
                            }
                        }
                        oVarF = o.e(str4, bVar8);
                    } else {
                        oVarF = o.f(str4, j10);
                    }
                    if (oVarF != null) {
                        oVarF.i(str4);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList4 = this.G;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.core.motion.key.b bVar10 : arrayList4) {
                    if (bVar10 instanceof androidx.constraintlayout.core.motion.key.f) {
                        ((androidx.constraintlayout.core.motion.key.f) bVar10).v(this.H);
                    }
                }
            }
            for (String str6 : this.H.keySet()) {
                this.H.get(str6).f(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.E.size();
        int i17 = size + 2;
        e[] eVarArr = new e[i17];
        eVarArr[0] = this.f43521m;
        eVarArr[size + 1] = this.f43522n;
        if (this.E.size() > 0 && this.f43520l == androidx.constraintlayout.core.motion.key.b.f43648m) {
            this.f43520l = 0;
        }
        Iterator<e> it = this.E.iterator();
        int i18 = i12;
        while (it.hasNext()) {
            eVarArr[i18] = it.next();
            i18++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f43522n.f43592s.keySet()) {
            if (this.f43521m.f43592s.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.A = strArr2;
        this.B = new int[strArr2.length];
        int i19 = 0;
        while (true) {
            strArr = this.A;
            if (i19 >= strArr.length) {
                break;
            }
            String str8 = strArr[i19];
            this.B[i19] = 0;
            for (int i20 = 0; i20 < i17; i20++) {
                if (eVarArr[i20].f43592s.containsKey(str8) && (bVar = eVarArr[i20].f43592s.get(str8)) != null) {
                    int[] iArr = this.B;
                    iArr[i19] = iArr[i19] + bVar.r();
                    break;
                }
            }
            i19++;
        }
        boolean z10 = eVarArr[0].f43588l != -1 ? i12 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i21 = i12; i21 < i17; i21++) {
            eVarArr[i21].f(eVarArr[i21 - 1], zArr, this.A, z10);
        }
        int i22 = 0;
        for (int i23 = i12; i23 < length; i23++) {
            if (zArr[i23]) {
                i22++;
            }
        }
        this.f43532x = new int[i22];
        int i24 = 2;
        int iMax = Math.max(2, i22);
        this.f43533y = new double[iMax];
        this.f43534z = new double[iMax];
        int i25 = 0;
        for (int i26 = i12; i26 < length; i26++) {
            if (zArr[i26]) {
                this.f43532x[i25] = i26;
                i25++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i12] = this.f43532x.length;
        iArr2[0] = i17;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i17];
        for (int i27 = 0; i27 < i17; i27++) {
            eVarArr[i27].k(dArr[i27], this.f43532x);
            dArr2[i27] = eVarArr[i27].f43580d;
        }
        int i28 = 0;
        while (true) {
            int[] iArr3 = this.f43532x;
            if (i28 >= iArr3.length) {
                break;
            }
            if (iArr3[i28] < e.f43573m3.length) {
                String str9 = e.f43573m3[this.f43532x[i28]] + " [";
                for (int i29 = 0; i29 < i17; i29++) {
                    str9 = str9 + dArr[i29][i28];
                }
            }
            i28++;
        }
        this.f43525q = new androidx.constraintlayout.core.motion.utils.b[this.A.length + 1];
        int i30 = 0;
        while (true) {
            String[] strArr3 = this.A;
            if (i30 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i30];
            int i31 = 0;
            int i32 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i31 < i17) {
                if (eVarArr[i31].t(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i17];
                        int[] iArr4 = new int[i24];
                        iArr4[i12] = eVarArr[i31].r(str10);
                        i13 = 0;
                        iArr4[0] = i17;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i13 = 0;
                    }
                    e eVar3 = eVarArr[i31];
                    dArr3[i32] = eVar3.f43580d;
                    eVar3.q(str10, dArr4[i32], i13);
                    i32++;
                }
                i31++;
                i30 = i30;
                i24 = 2;
            }
            int i33 = i30 + 1;
            this.f43525q[i33] = androidx.constraintlayout.core.motion.utils.b.a(this.f43520l, Arrays.copyOf(dArr3, i32), (double[][]) Arrays.copyOf(dArr4, i32));
            i30 = i33;
            i24 = 2;
        }
        this.f43525q[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f43520l, dArr2, dArr);
        if (eVarArr[0].f43588l != -1) {
            int[] iArr5 = new int[i17];
            double[] dArr5 = new double[i17];
            int[] iArr6 = new int[2];
            iArr6[i12] = 2;
            iArr6[0] = i17;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i34 = 0; i34 < i17; i34++) {
                e eVar4 = eVarArr[i34];
                iArr5[i34] = eVar4.f43588l;
                dArr5[i34] = eVar4.f43580d;
                double[] dArr7 = dArr6[i34];
                dArr7[0] = eVar4.f43582f;
                dArr7[i12] = eVar4.f43583g;
            }
            this.f43526r = androidx.constraintlayout.core.motion.utils.b.b(iArr5, dArr5, dArr6);
        }
        this.J = new HashMap<>();
        if (this.G != null) {
            float fJ = Float.NaN;
            for (String str11 : hashSet3) {
                h hVarD = h.d(str11);
                if (hVarD != null) {
                    if (hVarD.k() && Float.isNaN(fJ)) {
                        fJ = J();
                    }
                    hVarD.i(str11);
                    this.J.put(str11, hVarD);
                }
            }
            for (androidx.constraintlayout.core.motion.key.b bVar11 : this.G) {
                if (bVar11 instanceof androidx.constraintlayout.core.motion.key.d) {
                    ((androidx.constraintlayout.core.motion.key.d) bVar11).v(this.J);
                }
            }
            Iterator<h> it2 = this.J.values().iterator();
            while (it2.hasNext()) {
                it2.next().j(fJ);
            }
        }
    }

    int i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f43525q[0].h();
        if (iArr != null) {
            Iterator<e> it = this.E.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f43593t;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : dArrH) {
            this.f43525q[0].d(d10, this.f43533y);
            this.f43521m.l(this.f43532x, this.f43533y, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f43525q[0].h();
        if (iArr != null) {
            Iterator<e> it = this.E.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f43593t;
                i10++;
            }
        }
        if (iArr2 != null) {
            Iterator<e> it2 = this.E.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr2[i11] = (int) (it2.next().f43581e * 100.0f);
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrH.length; i13++) {
            this.f43525q[0].d(dArrH[i13], this.f43533y);
            this.f43521m.n(dArrH[i13], this.f43532x, this.f43533y, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void j0(c cVar) {
        this.S = cVar;
    }

    public void k(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap<String, o> map = this.I;
        o oVar = map == null ? null : map.get("translationX");
        HashMap<String, o> map2 = this.I;
        o oVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, h> map3 = this.J;
        h hVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, h> map4 = this.J;
        h hVar2 = map4 != null ? map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f43529u;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f43528t;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f43521m.f43578b;
            float f15 = Float.NaN;
            for (e eVar : this.E) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = eVar.f43578b;
                if (dVar2 != null) {
                    float f16 = eVar.f43580d;
                    if (f16 < fMin) {
                        f13 = f16;
                        dVar = dVar2;
                    } else if (Float.isNaN(f15)) {
                        f15 = eVar.f43580d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f13;
                dA = (((float) dVar.a((fMin - f13) / f17)) * f17) + f13;
            }
            this.f43525q[0].d(dA, this.f43533y);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
            if (bVar != null) {
                double[] dArr = this.f43533y;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            int i13 = i12 * 2;
            this.f43521m.n(dA, this.f43532x, this.f43533y, fArr, i13);
            if (hVar != null) {
                fArr[i13] = fArr[i13] + hVar.a(fMin);
            } else if (oVar != null) {
                fArr[i13] = fArr[i13] + oVar.a(fMin);
            }
            if (hVar2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = fArr[i14] + hVar2.a(fMin);
            } else if (oVar2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + oVar2.a(fMin);
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    public void l(float f10, float[] fArr, int i10) {
        this.f43525q[0].d(o(f10, null), this.f43533y);
        this.f43521m.s(this.f43532x, this.f43533y, fArr, i10);
    }

    void m(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f43525q[0].d(o(i11 * f10, null), this.f43533y);
            this.f43521m.s(this.f43532x, this.f43533y, fArr, i11 * 8);
        }
    }

    void n(boolean z10) {
    }

    public String p() {
        return this.f43521m.f43589m;
    }

    int q(String str, float[] fArr, int i10) {
        o oVar = this.I.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = oVar.a(i11 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f43525q[0].d(d10, dArr);
        this.f43525q[0].g(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f43521m.o(d10, this.f43532x, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.f43530v;
    }

    public float t() {
        return this.f43531w;
    }

    public String toString() {
        return " start: x: " + this.f43521m.f43582f + " y: " + this.f43521m.f43583g + " end: x: " + this.f43522n.f43582f + " y: " + this.f43522n.f43583g;
    }

    public void u(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float fO = o(f10, this.F);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f43525q;
        int i10 = 0;
        if (bVarArr == null) {
            e eVar = this.f43522n;
            float f13 = eVar.f43582f;
            e eVar2 = this.f43521m;
            float f14 = f13 - eVar2.f43582f;
            float f15 = eVar.f43583g - eVar2.f43583g;
            float f16 = (eVar.f43584h - eVar2.f43584h) + f14;
            float f17 = (eVar.f43585i - eVar2.f43585i) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = fO;
        bVarArr[0].g(d10, this.f43534z);
        this.f43525q[0].d(d10, this.f43533y);
        float f18 = this.F[0];
        while (true) {
            dArr = this.f43534z;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f18);
            i10++;
        }
        androidx.constraintlayout.core.motion.utils.b bVar = this.f43526r;
        if (bVar == null) {
            this.f43521m.E(f11, f12, fArr, this.f43532x, dArr, this.f43533y);
            return;
        }
        double[] dArr2 = this.f43533y;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f43526r.g(d10, this.f43534z);
            this.f43521m.E(f11, f12, fArr, this.f43532x, this.f43534z, this.f43533y);
        }
    }

    public int v() {
        int iMax = this.f43521m.f43579c;
        Iterator<e> it = this.E.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f43579c);
        }
        return Math.max(iMax, this.f43522n.f43579c);
    }

    public float w() {
        return this.f43522n.f43585i;
    }

    public float x() {
        return this.f43522n.f43584h;
    }

    public float y() {
        return this.f43522n.f43582f;
    }

    public float z() {
        return this.f43522n.f43583g;
    }
}
