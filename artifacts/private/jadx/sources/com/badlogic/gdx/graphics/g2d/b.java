package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.glutils.j;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Matrix4;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends gc.e {
    public static final int A1 = 13;
    public static final int B1 = 14;
    public static final int C1 = 15;
    public static final int D1 = 16;
    public static final int E1 = 17;
    public static final int F1 = 18;
    public static final int G1 = 19;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f94246m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f94247n1 = 1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f94248o1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f94249q1 = 3;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f94250r1 = 4;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f94251s1 = 5;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f94252t1 = 6;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f94253u1 = 7;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f94254v1 = 8;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f94255w1 = 9;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f94256x1 = 10;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f94257y1 = 11;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f94258z1 = 12;

    int A1();

    void C1(e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z10);

    void D0(k kVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17);

    boolean E0();

    float G1();

    void H0(k kVar, float f10, float f11);

    void I0(int i10, int i11);

    void K1(Matrix4 matrix4);

    void M();

    void O(e eVar, float f10, float f11, com.badlogic.gdx.math.a aVar);

    void O1(k kVar, float f10, float f11, float f12, float f13);

    void Q1(Matrix4 matrix4);

    void R(e eVar, float f10, float f11, float f12, float f13);

    void S();

    void V(k kVar, float f10, float f11, int i10, int i11, int i12, int i13);

    void W0(float f10);

    void Z(e eVar, float f10, float f11);

    void d1(k kVar, float f10, float f11, float f12, float f13, int i10, int i11, int i12, int i13, boolean z10, boolean z11);

    void end();

    void flush();

    void i1(k kVar, float[] fArr, int i10, int i11);

    void k1(k kVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, int i11, int i12, int i13, boolean z10, boolean z11);

    com.badlogic.gdx.graphics.b m1();

    Matrix4 o1();

    void q1(j jVar);

    Matrix4 r1();

    void s();

    void t(com.badlogic.gdx.graphics.b bVar);

    int u0();

    void u1(e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    j v();

    void w(float f10, float f11, float f12, float f13);

    boolean x1();
}
