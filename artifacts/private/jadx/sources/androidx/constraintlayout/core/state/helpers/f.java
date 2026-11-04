package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class f extends androidx.constraintlayout.core.state.f {
    protected int A0;
    protected int B0;
    protected int C0;
    protected int D0;
    protected int E0;
    protected int F0;
    protected int G0;
    protected int H0;
    protected int I0;
    protected int J0;
    protected int K0;
    protected float L0;
    protected float M0;
    protected float N0;
    protected float O0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.g f44295q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected HashMap<String, Float> f44296r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected HashMap<String, Float> f44297s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    protected HashMap<String, Float> f44298t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    protected int f44299u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected int f44300v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected int f44301w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f44302x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f44303y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected int f44304z0;

    public f(k kVar, k.d dVar) {
        super(kVar, dVar);
        this.f44299u0 = 0;
        int i10 = 1 ^ (-1);
        this.f44300v0 = -1;
        this.f44301w0 = -1;
        this.f44302x0 = -1;
        this.f44303y0 = -1;
        this.f44304z0 = -1;
        this.A0 = -1;
        this.B0 = 2;
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        if (dVar == k.d.VERTICAL_FLOW) {
            this.K0 = 1;
        }
    }

    public void A1(int i10) {
        this.E0 = i10;
    }

    public void B1(int i10) {
        this.f44303y0 = i10;
    }

    public void C1(float f10) {
        this.O0 = f10;
    }

    public void D1(int i10) {
        this.A0 = i10;
    }

    public void E1(float f10) {
        this.M0 = f10;
    }

    public void F1(int i10) {
        this.f44302x0 = i10;
    }

    public void G1(int i10) {
        this.J0 = i10;
    }

    public void H1(int i10) {
        this.K0 = i10;
    }

    public void I1(int i10) {
        this.I0 = i10;
    }

    public void J1(int i10) {
        this.F0 = i10;
    }

    public void K1(int i10) {
        this.G0 = i10;
    }

    public void L1(int i10) {
        this.H0 = i10;
    }

    public void M1(int i10) {
        this.B0 = i10;
    }

    public void N1(int i10) {
        this.D0 = i10;
    }

    public void O1(int i10) {
        this.f44300v0 = i10;
    }

    public void P1(int i10) {
        this.f44299u0 = i10;
    }

    @Override // androidx.constraintlayout.core.state.f
    public androidx.constraintlayout.core.widgets.j R0() {
        if (this.f44295q0 == null) {
            this.f44295q0 = new androidx.constraintlayout.core.widgets.g();
        }
        return this.f44295q0;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void T0(androidx.constraintlayout.core.widgets.j jVar) {
        if (jVar instanceof androidx.constraintlayout.core.widgets.g) {
            this.f44295q0 = (androidx.constraintlayout.core.widgets.g) jVar;
        } else {
            this.f44295q0 = null;
        }
    }

    public void U0(String str, float f10, float f11, float f12) {
        super.P0(str);
        if (!Float.isNaN(f10)) {
            if (this.f44296r0 == null) {
                this.f44296r0 = new HashMap<>();
            }
            this.f44296r0.put(str, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            if (this.f44297s0 == null) {
                this.f44297s0 = new HashMap<>();
            }
            this.f44297s0.put(str, Float.valueOf(f11));
        }
        if (Float.isNaN(f12)) {
            return;
        }
        if (this.f44298t0 == null) {
            this.f44298t0 = new HashMap<>();
        }
        this.f44298t0.put(str, Float.valueOf(f12));
    }

    public float V0() {
        return this.N0;
    }

    public int W0() {
        return this.f44304z0;
    }

    public float X0() {
        return this.L0;
    }

    public int Y0() {
        return this.f44301w0;
    }

    public int Z0() {
        return this.C0;
    }

    public float a1() {
        return this.f44210i;
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        R0();
        b(this.f44295q0);
        this.f44295q0.y3(this.K0);
        this.f44295q0.D3(this.f44299u0);
        int i10 = this.J0;
        if (i10 != -1) {
            this.f44295q0.x3(i10);
        }
        int i11 = this.F0;
        if (i11 != 0) {
            this.f44295q0.F2(i11);
        }
        int i12 = this.H0;
        if (i12 != 0) {
            this.f44295q0.I2(i12);
        }
        int i13 = this.G0;
        if (i13 != 0) {
            this.f44295q0.G2(i13);
        }
        int i14 = this.I0;
        if (i14 != 0) {
            this.f44295q0.D2(i14);
        }
        int i15 = this.E0;
        if (i15 != 0) {
            this.f44295q0.r3(i15);
        }
        int i16 = this.D0;
        if (i16 != 0) {
            this.f44295q0.B3(i16);
        }
        float f10 = this.f44210i;
        if (f10 != 0.5f) {
            this.f44295q0.q3(f10);
        }
        float f11 = this.N0;
        if (f11 != 0.5f) {
            this.f44295q0.l3(f11);
        }
        float f12 = this.O0;
        if (f12 != 0.5f) {
            this.f44295q0.t3(f12);
        }
        float f13 = this.f44212j;
        if (f13 != 0.5f) {
            this.f44295q0.A3(f13);
        }
        float f14 = this.L0;
        if (f14 != 0.5f) {
            this.f44295q0.n3(f14);
        }
        float f15 = this.M0;
        if (f15 != 0.5f) {
            this.f44295q0.v3(f15);
        }
        int i17 = this.C0;
        if (i17 != 2) {
            this.f44295q0.p3(i17);
        }
        int i18 = this.B0;
        if (i18 != 2) {
            this.f44295q0.z3(i18);
        }
        int i19 = this.f44300v0;
        if (i19 != -1) {
            this.f44295q0.C3(i19);
        }
        int i20 = this.f44301w0;
        if (i20 != -1) {
            this.f44295q0.o3(i20);
        }
        int i21 = this.f44302x0;
        if (i21 != -1) {
            this.f44295q0.w3(i21);
        }
        int i22 = this.f44303y0;
        if (i22 != -1) {
            this.f44295q0.s3(i22);
        }
        int i23 = this.f44304z0;
        if (i23 != -1) {
            this.f44295q0.m3(i23);
        }
        int i24 = this.A0;
        if (i24 != -1) {
            this.f44295q0.u3(i24);
        }
        Q0();
    }

    public int b1() {
        return this.E0;
    }

    public int c1() {
        return this.f44303y0;
    }

    public float d1() {
        return this.O0;
    }

    public int e1() {
        return this.A0;
    }

    public float f1() {
        return this.M0;
    }

    public int g1() {
        return this.f44302x0;
    }

    public int h1() {
        return this.J0;
    }

    public int i1() {
        return this.K0;
    }

    public int j1() {
        return this.I0;
    }

    public int k1() {
        return this.F0;
    }

    public int l1() {
        return this.G0;
    }

    public int m1() {
        return this.H0;
    }

    protected float n1(String str) {
        HashMap<String, Float> map = this.f44297s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f44297s0.get(str).floatValue();
    }

    protected float o1(String str) {
        HashMap<String, Float> map = this.f44298t0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f44298t0.get(str).floatValue();
    }

    public int p1() {
        return this.B0;
    }

    public float q1() {
        return this.f44212j;
    }

    public int r1() {
        return this.D0;
    }

    public int s1() {
        return this.f44300v0;
    }

    protected float t1(String str) {
        HashMap<String, Float> map = this.f44296r0;
        if (map != null && map.containsKey(str)) {
            return this.f44296r0.get(str).floatValue();
        }
        return -1.0f;
    }

    public int u1() {
        return this.f44299u0;
    }

    public void v1(float f10) {
        this.N0 = f10;
    }

    public void w1(int i10) {
        this.f44304z0 = i10;
    }

    public void x1(float f10) {
        this.L0 = f10;
    }

    public void y1(int i10) {
        this.f44301w0 = i10;
    }

    public void z1(int i10) {
        this.C0 = i10;
    }
}
