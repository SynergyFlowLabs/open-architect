package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class Matrix4 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f165388b = -2717655254359579617L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165389c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f165390d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f165391e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165392f = 12;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f165393g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f165395h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f165397i = 9;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f165399j = 13;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f165400k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f165401l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f165402m = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f165403n = 14;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f165404o = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f165408s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f165409t = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f165410v = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f165412a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float[] f165411w = new float[16];
    static i X = new i();
    static i Y = new i();
    static final com.planner5d.library.math.m Z = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final com.planner5d.library.math.m f165405p0 = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final com.planner5d.library.math.m f165406p1 = new com.planner5d.library.math.m();
    static final com.planner5d.library.math.m H1 = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final Matrix4 f165407p2 = new Matrix4();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final com.planner5d.library.math.m f165394g3 = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final com.planner5d.library.math.m f165396h3 = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final com.planner5d.library.math.m f165398i3 = new com.planner5d.library.math.m();

    public Matrix4() {
        float[] fArr = new float[16];
        this.f165412a = fArr;
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
    }

    public static native float det(float[] fArr);

    public static native boolean inv(float[] fArr);

    public static native void mul(float[] fArr, float[] fArr2);

    public static native void mulVec(float[] fArr, float[] fArr2);

    public static native void mulVec(float[] fArr, float[] fArr2, int i10, int i11, int i12);

    public static native void prj(float[] fArr, float[] fArr2);

    public static native void prj(float[] fArr, float[] fArr2, int i10, int i11, int i12);

    public static native void rot(float[] fArr, float[] fArr2);

    public static native void rot(float[] fArr, float[] fArr2, int i10, int i11, int i12);

    public Matrix4 A(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        return y(X.Y(mVar, mVar2));
    }

    public Matrix4 B(float f10, float f11, float f12, float f13) {
        if (f13 == 0.0f) {
            return this;
        }
        X.V(f10, f11, f12, f13);
        return y(X);
    }

    public Matrix4 C(com.planner5d.library.math.m mVar, float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        X.W(mVar, f10);
        return y(X);
    }

    public Matrix4 D(float f10, float f11, float f12) {
        float[] fArr = f165411w;
        fArr[0] = f10;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = f11;
        fArr[9] = 0.0f;
        fArr[13] = 0.0f;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = f12;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        mul(this.f165412a, fArr);
        return this;
    }

    public Matrix4 E(float f10) {
        float[] fArr = this.f165412a;
        fArr[0] = fArr[0] * f10;
        fArr[5] = fArr[5] * f10;
        fArr[10] = fArr[10] * f10;
        return this;
    }

    public Matrix4 F(float f10, float f11, float f12) {
        float[] fArr = this.f165412a;
        fArr[0] = fArr[0] * f10;
        fArr[5] = fArr[5] * f11;
        fArr[10] = fArr[10] * f12;
        return this;
    }

    public Matrix4 G(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165412a;
        fArr[0] = fArr[0] * mVar.f180482a;
        fArr[5] = fArr[5] * mVar.f180483b;
        fArr[10] = fArr[10] * mVar.f180484c;
        return this;
    }

    public Matrix4 H(float f10, float f11, float f12, float f13) {
        return I(0.0f, 0.0f, 0.0f, f10, f11, f12, f13);
    }

    public Matrix4 I(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 * 2.0f;
        float f18 = f14 * 2.0f;
        float f19 = 2.0f * f15;
        float f20 = f16 * f17;
        float f21 = f16 * f18;
        float f22 = f16 * f19;
        float f23 = f17 * f13;
        float f24 = f13 * f18;
        float f25 = f13 * f19;
        float f26 = f18 * f14;
        float f27 = f14 * f19;
        float f28 = f19 * f15;
        float[] fArr = this.f165412a;
        fArr[0] = 1.0f - (f26 + f28);
        fArr[4] = f24 - f22;
        fArr[8] = f25 + f21;
        fArr[12] = f10;
        fArr[1] = f24 + f22;
        fArr[5] = 1.0f - (f28 + f23);
        fArr[9] = f27 - f20;
        fArr[13] = f11;
        fArr[2] = f25 - f21;
        fArr[6] = f27 + f20;
        fArr[10] = 1.0f - (f23 + f26);
        fArr[14] = f12;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 J(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f20 = f13 * 2.0f;
        float f21 = f14 * 2.0f;
        float f22 = 2.0f * f15;
        float f23 = f16 * f20;
        float f24 = f16 * f21;
        float f25 = f16 * f22;
        float f26 = f20 * f13;
        float f27 = f13 * f21;
        float f28 = f13 * f22;
        float f29 = f21 * f14;
        float f30 = f14 * f22;
        float f31 = f22 * f15;
        float[] fArr = this.f165412a;
        fArr[0] = (1.0f - (f29 + f31)) * f17;
        fArr[4] = (f27 - f25) * f18;
        fArr[8] = (f28 + f24) * f19;
        fArr[12] = f10;
        fArr[1] = (f27 + f25) * f17;
        fArr[5] = (1.0f - (f31 + f26)) * f18;
        fArr[9] = (f30 - f23) * f19;
        fArr[13] = f11;
        fArr[2] = f17 * (f28 - f24);
        fArr[6] = f18 * (f30 + f23);
        fArr[10] = (1.0f - (f26 + f29)) * f19;
        fArr[14] = f12;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 K(a aVar) {
        float[] fArr = this.f165412a;
        fArr[0] = aVar.f165414a;
        fArr[1] = aVar.f165417d;
        fArr[2] = 0.0f;
        int i10 = 6 >> 3;
        fArr[3] = 0.0f;
        fArr[4] = aVar.f165415b;
        fArr[5] = aVar.f165418e;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = aVar.f165416c;
        fArr[13] = aVar.f165419f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 L(f fVar) {
        float[] fArr = this.f165412a;
        float[] fArr2 = fVar.f165482a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = 0.0f;
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[4];
        int i10 = 2 >> 6;
        fArr[6] = fArr2[5];
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = fArr2[6];
        fArr[13] = fArr2[7];
        fArr[14] = 0.0f;
        fArr[15] = fArr2[8];
        return this;
    }

    public Matrix4 M(Matrix4 matrix4) {
        return R(matrix4.f165412a);
    }

    public Matrix4 N(i iVar) {
        return H(iVar.f165505a, iVar.f165506b, iVar.f165507c, iVar.f165508d);
    }

    public Matrix4 O(com.planner5d.library.math.m mVar, i iVar) {
        return I(mVar.f180482a, mVar.f180483b, mVar.f180484c, iVar.f165505a, iVar.f165506b, iVar.f165507c, iVar.f165508d);
    }

    public Matrix4 P(com.planner5d.library.math.m mVar, i iVar, com.planner5d.library.math.m mVar2) {
        return J(mVar.f180482a, mVar.f180483b, mVar.f180484c, iVar.f165505a, iVar.f165506b, iVar.f165507c, iVar.f165508d, mVar2.f180482a, mVar2.f180483b, mVar2.f180484c);
    }

    public Matrix4 Q(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3, com.planner5d.library.math.m mVar4) {
        float[] fArr = this.f165412a;
        fArr[0] = mVar.f180482a;
        fArr[4] = mVar.f180483b;
        fArr[8] = mVar.f180484c;
        fArr[1] = mVar2.f180482a;
        fArr[5] = mVar2.f180483b;
        fArr[9] = mVar2.f180484c;
        fArr[2] = mVar3.f180482a;
        fArr[6] = mVar3.f180483b;
        fArr[10] = mVar3.f180484c;
        fArr[12] = mVar4.f180482a;
        fArr[13] = mVar4.f180483b;
        fArr[14] = mVar4.f180484c;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 R(float[] fArr) {
        float[] fArr2 = this.f165412a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public Matrix4 S(a aVar) {
        float[] fArr = this.f165412a;
        fArr[0] = aVar.f165414a;
        fArr[1] = aVar.f165417d;
        fArr[4] = aVar.f165415b;
        fArr[5] = aVar.f165418e;
        fArr[12] = aVar.f165416c;
        fArr[13] = aVar.f165419f;
        return this;
    }

    public Matrix4 T(Matrix4 matrix4) {
        float[] fArr = this.f165412a;
        float[] fArr2 = matrix4.f165412a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        return this;
    }

    public Matrix4 U(float f10, float f11, float f12) {
        X.P(f10, f11, f12);
        return N(X);
    }

    public Matrix4 V(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        com.planner5d.library.math.m mVar3 = Z;
        mVar3.A0(mVar).u0();
        com.planner5d.library.math.m mVar4 = f165405p0;
        mVar4.A0(mVar).u0();
        mVar4.V(mVar2).u0();
        com.planner5d.library.math.m mVar5 = f165406p1;
        mVar5.A0(mVar4).V(mVar3).u0();
        s();
        float[] fArr = this.f165412a;
        fArr[0] = mVar4.f180482a;
        fArr[4] = mVar4.f180483b;
        fArr[8] = mVar4.f180484c;
        fArr[1] = mVar5.f180482a;
        fArr[5] = mVar5.f180483b;
        fArr[9] = mVar5.f180484c;
        fArr[2] = -mVar3.f180482a;
        fArr[6] = -mVar3.f180483b;
        fArr[10] = -mVar3.f180484c;
        return this;
    }

    public Matrix4 W(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3) {
        com.planner5d.library.math.m mVar4 = H1;
        mVar4.A0(mVar2).H0(mVar);
        V(mVar4, mVar3);
        v(f165407p2.k0(-mVar.f180482a, -mVar.f180483b, -mVar.f180484c));
        return this;
    }

    public Matrix4 X(float f10, float f11, float f12, float f13, float f14, float f15) {
        s();
        float f16 = f11 - f10;
        float f17 = f13 - f12;
        float f18 = f15 - f14;
        float f19 = (-(f11 + f10)) / f16;
        float f20 = (-(f13 + f12)) / f17;
        float[] fArr = this.f165412a;
        fArr[0] = 2.0f / f16;
        int i10 = 1 >> 1;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / f17;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-2.0f) / f18;
        fArr[11] = 0.0f;
        fArr[12] = f19;
        fArr[13] = f20;
        fArr[14] = (-(f15 + f14)) / f18;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 Y(float f10, float f11, float f12, float f13) {
        X(f10, f10 + f12, f11, f11 + f13, 0.0f, 1.0f);
        return this;
    }

    public Matrix4 Z(float f10, float f11, float f12, float f13, float f14, float f15) {
        X(f10, f12 + f10, f11, f13 + f11, f14, f15);
        return this;
    }

    public Matrix4 a(Matrix4 matrix4, float f10) {
        com.planner5d.library.math.m mVar = H1;
        j(mVar);
        com.planner5d.library.math.m mVar2 = f165396h3;
        matrix4.j(mVar2);
        h(X);
        matrix4.h(Y);
        com.planner5d.library.math.m mVar3 = f165398i3;
        q(mVar3);
        com.planner5d.library.math.m mVar4 = f165394g3;
        matrix4.q(mVar4);
        com.planner5d.library.math.m mVarV0 = mVar.v0(f10);
        float f11 = 1.0f - f10;
        j0(mVarV0.R(mVar2.v0(f11)));
        y(X.d0(Y, f11));
        q0(mVar3.v0(f10).R(mVar4.v0(f11)));
        return this;
    }

    public Matrix4 a0(float f10, float f11, float f12, float f13) {
        s();
        float fTan = (float) (1.0d / Math.tan((((double) f12) * 0.017453292519943295d) / 2.0d));
        float f14 = f10 - f11;
        float f15 = (f11 + f10) / f14;
        float f16 = ((f11 * 2.0f) * f10) / f14;
        float[] fArr = this.f165412a;
        fArr[0] = fTan / f13;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = fTan;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = f15;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f16;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 b(Matrix4[] matrix4Arr) {
        float length = 1.0f / matrix4Arr.length;
        com.planner5d.library.math.m mVar = H1;
        Matrix4 matrix4 = matrix4Arr[0];
        com.planner5d.library.math.m mVar2 = f165398i3;
        mVar.A0(matrix4.j(mVar2).v0(length));
        X.N(matrix4Arr[0].h(Y).h(length));
        f165396h3.A0(matrix4Arr[0].q(mVar2).v0(length));
        for (int i10 = 1; i10 < matrix4Arr.length; i10++) {
            com.planner5d.library.math.m mVar3 = H1;
            Matrix4 matrix5 = matrix4Arr[i10];
            com.planner5d.library.math.m mVar4 = f165398i3;
            mVar3.R(matrix5.j(mVar4).v0(length));
            X.I(matrix4Arr[i10].h(Y).h(length));
            f165396h3.R(matrix4Arr[i10].q(mVar4).v0(length));
        }
        X.L();
        j0(H1);
        y(X);
        q0(f165396h3);
        return this;
    }

    public Matrix4 b0(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 * 2.0f;
        float f17 = f11 - f10;
        float f18 = f13 - f12;
        float f19 = (f11 + f10) / f17;
        float f20 = (f13 + f12) / f18;
        float f21 = f14 - f15;
        float f22 = (f15 + f14) / f21;
        float f23 = ((f15 * 2.0f) * f14) / f21;
        float[] fArr = this.f165412a;
        fArr[0] = f16 / f17;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = f16 / f18;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = f19;
        fArr[9] = f20;
        fArr[10] = f22;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f23;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 c(Matrix4[] matrix4Arr, float[] fArr) {
        com.planner5d.library.math.m mVar = H1;
        Matrix4 matrix4 = matrix4Arr[0];
        com.planner5d.library.math.m mVar2 = f165398i3;
        mVar.A0(matrix4.j(mVar2).v0(fArr[0]));
        X.N(matrix4Arr[0].h(Y).h(fArr[0]));
        f165396h3.A0(matrix4Arr[0].q(mVar2).v0(fArr[0]));
        for (int i10 = 1; i10 < matrix4Arr.length; i10++) {
            com.planner5d.library.math.m mVar3 = H1;
            Matrix4 matrix5 = matrix4Arr[i10];
            com.planner5d.library.math.m mVar4 = f165398i3;
            mVar3.R(matrix5.j(mVar4).v0(fArr[i10]));
            X.I(matrix4Arr[i10].h(Y).h(fArr[i10]));
            f165396h3.R(matrix4Arr[i10].q(mVar4).v0(fArr[i10]));
        }
        X.L();
        j0(H1);
        y(X);
        q0(f165396h3);
        return this;
    }

    public Matrix4 c0(float f10, float f11, float f12, float f13) {
        if (f13 != 0.0f) {
            return N(X.T(f10, f11, f12, f13));
        }
        s();
        return this;
    }

    public Matrix4 d() {
        return new Matrix4(this);
    }

    public Matrix4 d0(float f10, float f11, float f12, float f13, float f14, float f15) {
        return N(X.X(f10, f11, f12, f13, f14, f15));
    }

    public float e() {
        float[] fArr = this.f165412a;
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[9];
        float f13 = fArr[12];
        float f14 = fArr[2];
        float f15 = fArr[7];
        float f16 = fArr[5];
        float f17 = fArr[10];
        float f18 = fArr[1];
        float f19 = fArr[11];
        float f20 = fArr[8];
        float f21 = fArr[13];
        float f22 = (((((((((f10 * f11) * f12) * f13) - (((f14 * f15) * f12) * f13)) - (((f10 * f16) * f17) * f13)) + (((f18 * f15) * f17) * f13)) + (((f14 * f16) * f19) * f13)) - (((f18 * f11) * f19) * f13)) - (((f10 * f11) * f20) * f21)) + (f14 * f15 * f20 * f21);
        float f23 = fArr[4];
        float f24 = fArr[0];
        float f25 = (((f22 + (((f10 * f23) * f17) * f21)) - (((f24 * f15) * f17) * f21)) - (((f14 * f23) * f19) * f21)) + (f24 * f11 * f19 * f21);
        float f26 = fArr[14];
        float f27 = fArr[15];
        return (((((((((((f25 + (((f10 * f16) * f20) * f26)) - (((f18 * f15) * f20) * f26)) - (((f10 * f23) * f12) * f26)) + (((f15 * f24) * f12) * f26)) + (((f18 * f23) * f19) * f26)) - (((f24 * f16) * f19) * f26)) - (((f14 * f16) * f20) * f27)) + (((f18 * f11) * f20) * f27)) + (((f14 * f23) * f12) * f27)) - (((f11 * f24) * f12) * f27)) - (((f18 * f23) * f17) * f27)) + (f24 * f16 * f17 * f27);
    }

    public Matrix4 e0(com.planner5d.library.math.m mVar, float f10) {
        if (f10 != 0.0f) {
            return N(X.O(mVar, f10));
        }
        s();
        return this;
    }

    public float f() {
        float[] fArr = this.f165412a;
        float f10 = fArr[0];
        int i10 = 7 ^ 5;
        float f11 = fArr[5];
        float f12 = fArr[10];
        float f13 = fArr[4];
        float f14 = fArr[9];
        float f15 = fArr[2];
        float f16 = (f10 * f11 * f12) + (f13 * f14 * f15);
        float f17 = fArr[8];
        float f18 = fArr[1];
        float f19 = fArr[6];
        return (((f16 + ((f17 * f18) * f19)) - ((f10 * f14) * f19)) - ((f13 * f18) * f12)) - ((f17 * f11) * f15);
    }

    public Matrix4 f0(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        return N(X.Y(mVar, mVar2));
    }

    public void g(float[] fArr) {
        float[] fArr2 = this.f165412a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        fArr[9] = fArr2[12];
        fArr[10] = fArr2[13];
        fArr[11] = fArr2[14];
    }

    public Matrix4 g0(float f10, float f11, float f12, float f13) {
        if (f13 != 0.0f) {
            return N(X.V(f10, f11, f12, f13));
        }
        s();
        return this;
    }

    public i h(i iVar) {
        return iVar.a0(this);
    }

    public Matrix4 h0(com.planner5d.library.math.m mVar, float f10) {
        if (f10 != 0.0f) {
            return N(X.W(mVar, f10));
        }
        s();
        return this;
    }

    public i i(i iVar, boolean z10) {
        return iVar.c0(z10, this);
    }

    public Matrix4 i0(float f10, float f11, float f12) {
        s();
        float[] fArr = this.f165412a;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[10] = f12;
        return this;
    }

    public com.planner5d.library.math.m j(com.planner5d.library.math.m mVar) {
        return mVar.y0(k(), m(), o());
    }

    public Matrix4 j0(com.planner5d.library.math.m mVar) {
        s();
        float[] fArr = this.f165412a;
        fArr[0] = mVar.f180482a;
        fArr[5] = mVar.f180483b;
        fArr[10] = mVar.f180484c;
        return this;
    }

    public float k() {
        return (e.p(this.f165412a[4]) && e.p(this.f165412a[8])) ? Math.abs(this.f165412a[0]) : (float) Math.sqrt(l());
    }

    public Matrix4 k0(float f10, float f11, float f12) {
        s();
        float[] fArr = this.f165412a;
        fArr[12] = f10;
        fArr[13] = f11;
        fArr[14] = f12;
        return this;
    }

    public float l() {
        float[] fArr = this.f165412a;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[8];
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public Matrix4 l0(com.planner5d.library.math.m mVar) {
        s();
        float[] fArr = this.f165412a;
        fArr[12] = mVar.f180482a;
        fArr[13] = mVar.f180483b;
        fArr[14] = mVar.f180484c;
        return this;
    }

    public float m() {
        return (e.p(this.f165412a[1]) && e.p(this.f165412a[9])) ? Math.abs(this.f165412a[5]) : (float) Math.sqrt(n());
    }

    public Matrix4 m0(float f10, float f11, float f12, float f13, float f14, float f15) {
        s();
        float[] fArr = this.f165412a;
        fArr[12] = f10;
        fArr[13] = f11;
        fArr[14] = f12;
        fArr[0] = f13;
        fArr[5] = f14;
        fArr[10] = f15;
        return this;
    }

    public float n() {
        float[] fArr = this.f165412a;
        float f10 = fArr[1];
        float f11 = fArr[5];
        float f12 = fArr[9];
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public Matrix4 n0(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        s();
        float[] fArr = this.f165412a;
        fArr[12] = mVar.f180482a;
        fArr[13] = mVar.f180483b;
        fArr[14] = mVar.f180484c;
        fArr[0] = mVar2.f180482a;
        fArr[5] = mVar2.f180483b;
        fArr[10] = mVar2.f180484c;
        return this;
    }

    public float o() {
        return (e.p(this.f165412a[2]) && e.p(this.f165412a[6])) ? Math.abs(this.f165412a[10]) : (float) Math.sqrt(p());
    }

    public Matrix4 o0(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3) {
        com.planner5d.library.math.m mVar4 = f165396h3;
        mVar4.A0(mVar2).u0();
        com.planner5d.library.math.m mVar5 = f165394g3;
        mVar5.A0(mVar4).V(mVar3).u0();
        com.planner5d.library.math.m mVar6 = f165398i3;
        mVar6.A0(mVar5).V(mVar4).u0();
        Q(mVar5, mVar6, mVar4.v0(-1.0f), mVar);
        return this;
    }

    public float p() {
        float[] fArr = this.f165412a;
        float f10 = fArr[2];
        float f11 = fArr[6];
        float f12 = fArr[10];
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public Matrix4 p0(float f10, float f11, float f12) {
        float[] fArr = this.f165412a;
        fArr[12] = f10;
        fArr[13] = f11;
        fArr[14] = f12;
        return this;
    }

    public com.planner5d.library.math.m q(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165412a;
        mVar.f180482a = fArr[12];
        mVar.f180483b = fArr[13];
        mVar.f180484c = fArr[14];
        return mVar;
    }

    public Matrix4 q0(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165412a;
        fArr[12] = mVar.f180482a;
        fArr[13] = mVar.f180483b;
        fArr[14] = mVar.f180484c;
        return this;
    }

    public float[] r() {
        return this.f165412a;
    }

    public Matrix4 r0() {
        float[] fArr = this.f165412a;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        return t().s0();
    }

    public Matrix4 s() {
        float[] fArr = this.f165412a;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = 0.0f;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 s0() {
        float[] fArr = f165411w;
        float[] fArr2 = this.f165412a;
        fArr[0] = fArr2[0];
        fArr[4] = fArr2[1];
        fArr[8] = fArr2[2];
        fArr[12] = fArr2[3];
        fArr[1] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[9] = fArr2[6];
        fArr[13] = fArr2[7];
        fArr[2] = fArr2[8];
        fArr[6] = fArr2[9];
        fArr[10] = fArr2[10];
        fArr[14] = fArr2[11];
        fArr[3] = fArr2[12];
        fArr[7] = fArr2[13];
        fArr[11] = fArr2[14];
        fArr[15] = fArr2[15];
        return R(fArr);
    }

    public Matrix4 t() {
        float[] fArr = this.f165412a;
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[9];
        float f13 = fArr[12];
        float f14 = fArr[2];
        float f15 = fArr[7];
        float f16 = fArr[5];
        float f17 = fArr[10];
        float f18 = fArr[1];
        float f19 = fArr[11];
        float f20 = fArr[8];
        float f21 = fArr[13];
        float f22 = fArr[4];
        float f23 = fArr[0];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (((((((((((((((((((((((((f10 * f11) * f12) * f13) - (((f14 * f15) * f12) * f13)) - (((f10 * f16) * f17) * f13)) + (((f18 * f15) * f17) * f13)) + (((f14 * f16) * f19) * f13)) - (((f18 * f11) * f19) * f13)) - (((f10 * f11) * f20) * f21)) + (((f14 * f15) * f20) * f21)) + (((f10 * f22) * f17) * f21)) - (((f23 * f15) * f17) * f21)) - (((f14 * f22) * f19) * f21)) + (((f23 * f11) * f19) * f21)) + (((f10 * f16) * f20) * f24)) - (((f18 * f15) * f20) * f24)) - (((f10 * f22) * f12) * f24)) + (((f23 * f15) * f12) * f24)) + (((f18 * f22) * f19) * f24)) - (((f23 * f16) * f19) * f24)) - (((f14 * f16) * f20) * f25)) + (((f18 * f11) * f20) * f25)) + (((f14 * f22) * f12) * f25)) - (((f23 * f11) * f12) * f25)) - (((f18 * f22) * f17) * f25)) + (f23 * f16 * f17 * f25);
        if (f26 == 0.0f) {
            throw new RuntimeException("non-invertible matrix");
        }
        float f27 = 1.0f / f26;
        float[] fArr2 = f165411w;
        float f28 = ((((((f12 * f24) * f15) - ((f21 * f17) * f15)) + ((f21 * f11) * f19)) - ((f16 * f24) * f19)) - ((f12 * f11) * f25)) + (f16 * f17 * f25);
        fArr2[0] = f28;
        float f29 = ((((((f13 * f17) * f15) - ((f20 * f24) * f15)) - ((f13 * f11) * f19)) + ((f22 * f24) * f19)) + ((f20 * f11) * f25)) - ((f22 * f17) * f25);
        fArr2[4] = f29;
        float f30 = fArr[4];
        float f31 = ((((((f20 * f21) * f15) - ((f13 * f12) * f15)) + ((f13 * f16) * f19)) - ((f30 * f21) * f19)) - ((f20 * f16) * f25)) + (f30 * f12 * f25);
        fArr2[8] = f31;
        float f32 = fArr[8];
        float f33 = ((((((f13 * f12) * f11) - ((f32 * f21) * f11)) - ((f13 * f16) * f17)) + ((f30 * f21) * f17)) + ((f16 * f32) * f24)) - ((f30 * f12) * f24);
        fArr2[12] = f33;
        float f34 = ((((((f21 * f17) * f10) - ((f12 * f24) * f10)) - ((f21 * f14) * f19)) + ((f18 * f24) * f19)) + ((f12 * f14) * f25)) - ((f18 * f17) * f25);
        fArr2[1] = f34;
        float f35 = fArr[12];
        float f36 = fArr[0];
        float f37 = ((((((f32 * f24) * f10) - ((f35 * f17) * f10)) + ((f35 * f14) * f19)) - ((f36 * f24) * f19)) - ((f32 * f14) * f25)) + (f36 * f17 * f25);
        fArr2[5] = f37;
        float f38 = fArr[1];
        float f39 = ((((((f35 * f12) * f10) - ((f32 * f21) * f10)) - ((f35 * f38) * f19)) + ((f36 * f21) * f19)) + ((f32 * f38) * f25)) - ((f12 * f36) * f25);
        fArr2[9] = f39;
        float f40 = fArr[9];
        float f41 = ((((((f32 * f21) * f14) - ((f35 * f40) * f14)) + ((f35 * f38) * f17)) - ((f21 * f36) * f17)) - ((f32 * f38) * f24)) + (f36 * f40 * f24);
        fArr2[13] = f41;
        float f42 = fArr[5];
        float f43 = fArr[13];
        float f44 = ((((((f42 * f24) * f10) - ((f43 * f11) * f10)) + ((f43 * f14) * f15)) - ((f38 * f24) * f15)) - ((f14 * f42) * f25)) + (f38 * f11 * f25);
        fArr2[2] = f44;
        float f45 = fArr[2];
        float f46 = ((((((f35 * f11) * f10) - ((f30 * f24) * f10)) - ((f35 * f45) * f15)) + ((f36 * f24) * f15)) + ((f30 * f45) * f25)) - ((f11 * f36) * f25);
        fArr2[6] = f46;
        float f47 = ((((((f30 * f43) * f10) - ((f35 * f42) * f10)) + ((f35 * f38) * f15)) - ((f36 * f43) * f15)) - ((f30 * f38) * f25)) + (f36 * f42 * f25);
        fArr2[10] = f47;
        float f48 = fArr[6];
        float f49 = ((((((f35 * f42) * f45) - ((f30 * f43) * f45)) - ((f35 * f38) * f48)) + ((f43 * f36) * f48)) + ((f30 * f38) * f24)) - ((f36 * f42) * f24);
        fArr2[14] = f49;
        float f50 = fArr[10];
        float f51 = ((((((f40 * f48) * f10) - ((f42 * f50) * f10)) - ((f40 * f45) * f15)) + ((f38 * f50) * f15)) + ((f42 * f45) * f19)) - ((f38 * f48) * f19);
        fArr2[3] = f51;
        float f52 = fArr[3];
        float f53 = ((((((f30 * f50) * f52) - ((f32 * f48) * f52)) + ((f32 * f45) * f15)) - ((f36 * f50) * f15)) - ((f30 * f45) * f19)) + (f36 * f48 * f19);
        fArr2[7] = f53;
        float f54 = fArr[7];
        float f55 = ((((((f32 * f42) * f52) - ((f30 * f40) * f52)) - ((f32 * f38) * f54)) + ((f36 * f40) * f54)) + ((f30 * f38) * f19)) - ((f36 * f42) * f19);
        fArr2[11] = f55;
        float f56 = ((((((f30 * f40) * f45) - ((f32 * f42) * f45)) + ((f32 * f38) * f48)) - ((f40 * f36) * f48)) - ((f30 * f38) * f50)) + (f36 * f42 * f50);
        fArr2[15] = f56;
        fArr[0] = f28 * f27;
        fArr[4] = f29 * f27;
        fArr[8] = f31 * f27;
        fArr[12] = f33 * f27;
        fArr[1] = f34 * f27;
        fArr[5] = f37 * f27;
        fArr[9] = f39 * f27;
        fArr[13] = f41 * f27;
        fArr[2] = f44 * f27;
        fArr[6] = f46 * f27;
        fArr[10] = f47 * f27;
        fArr[14] = f49 * f27;
        fArr[3] = f51 * f27;
        fArr[7] = f53 * f27;
        fArr[11] = f55 * f27;
        fArr[15] = f56 * f27;
        return this;
    }

    public Matrix4 t0(float f10, float f11, float f12) {
        float[] fArr = f165411w;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = f10;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = f11;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = f12;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        mul(this.f165412a, fArr);
        return this;
    }

    public String toString() {
        return "[" + this.f165412a[0] + "|" + this.f165412a[4] + "|" + this.f165412a[8] + "|" + this.f165412a[12] + "]\n[" + this.f165412a[1] + "|" + this.f165412a[5] + "|" + this.f165412a[9] + "|" + this.f165412a[13] + "]\n[" + this.f165412a[2] + "|" + this.f165412a[6] + "|" + this.f165412a[10] + "|" + this.f165412a[14] + "]\n[" + this.f165412a[3] + "|" + this.f165412a[7] + "|" + this.f165412a[11] + "|" + this.f165412a[15] + "]\n";
    }

    public Matrix4 u(Matrix4 matrix4, float f10) {
        for (int i10 = 0; i10 < 16; i10++) {
            float[] fArr = this.f165412a;
            fArr[i10] = (fArr[i10] * (1.0f - f10)) + (matrix4.f165412a[i10] * f10);
        }
        return this;
    }

    public Matrix4 u0(com.planner5d.library.math.m mVar) {
        return t0(mVar.f180482a, mVar.f180483b, mVar.f180484c);
    }

    public Matrix4 v(Matrix4 matrix4) {
        mul(this.f165412a, matrix4.f165412a);
        return this;
    }

    public Matrix4 v0(float f10, float f11, float f12) {
        float[] fArr = this.f165412a;
        fArr[12] = fArr[12] + f10;
        fArr[13] = fArr[13] + f11;
        fArr[14] = fArr[14] + f12;
        return this;
    }

    public Matrix4 w(Matrix4 matrix4) {
        Matrix4 matrix5 = f165407p2;
        matrix5.M(matrix4);
        mul(matrix5.f165412a, this.f165412a);
        return M(matrix5);
    }

    public Matrix4 w0(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165412a;
        fArr[12] = fArr[12] + mVar.f180482a;
        fArr[13] = fArr[13] + mVar.f180483b;
        fArr[14] = fArr[14] + mVar.f180484c;
        return this;
    }

    public Matrix4 x(float f10, float f11, float f12, float f13) {
        if (f13 == 0.0f) {
            return this;
        }
        X.T(f10, f11, f12, f13);
        return y(X);
    }

    public Matrix4 y(i iVar) {
        float[] fArr = f165411w;
        iVar.g0(fArr);
        mul(this.f165412a, fArr);
        return this;
    }

    public Matrix4 z(com.planner5d.library.math.m mVar, float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        X.O(mVar, f10);
        return y(X);
    }

    public Matrix4(Matrix4 matrix4) {
        this.f165412a = new float[16];
        M(matrix4);
    }

    public Matrix4(float[] fArr) {
        this.f165412a = new float[16];
        R(fArr);
    }

    public Matrix4(i iVar) {
        this.f165412a = new float[16];
        N(iVar);
    }

    public Matrix4(com.planner5d.library.math.m mVar, i iVar, com.planner5d.library.math.m mVar2) {
        this.f165412a = new float[16];
        P(mVar, iVar, mVar2);
    }
}
