package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class Camera {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @h
    private final int f103832b;

    public enum a {
        VERTICAL,
        HORIZONTAL
    }

    public enum b {
        PERSPECTIVE,
        ORTHO
    }

    Camera(long j10, @h int i10) {
        this.f103831a = j10;
        this.f103832b = i10;
    }

    static double b(double d10, double d11) {
        return nComputeEffectiveFocalLength(d10, d11);
    }

    static double c(double d10, double d11) {
        return nComputeEffectiveFov(d10, d11);
    }

    private static native double nComputeEffectiveFocalLength(double d10, double d11);

    private static native double nComputeEffectiveFov(double d10, double d11);

    private static native float nGetAperture(long j10);

    private static native double nGetCullingFar(long j10);

    private static native void nGetCullingProjectionMatrix(long j10, double[] dArr);

    private static native double nGetFocalLength(long j10);

    private static native float nGetFocusDistance(long j10);

    private static native void nGetForwardVector(long j10, float[] fArr);

    private static native void nGetLeftVector(long j10, float[] fArr);

    private static native void nGetModelMatrix(long j10, float[] fArr);

    private static native void nGetModelMatrixFp64(long j10, double[] dArr);

    private static native double nGetNear(long j10);

    private static native void nGetPosition(long j10, float[] fArr);

    private static native void nGetProjectionMatrix(long j10, double[] dArr);

    private static native void nGetScaling(long j10, double[] dArr);

    private static native float nGetSensitivity(long j10);

    private static native float nGetShutterSpeed(long j10);

    private static native void nGetUpVector(long j10, float[] fArr);

    private static native void nGetViewMatrix(long j10, float[] fArr);

    private static native void nGetViewMatrixFp64(long j10, double[] dArr);

    private static native void nLookAt(long j10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18);

    private static native void nSetCustomProjection(long j10, double[] dArr, double[] dArr2, double d10, double d11);

    private static native void nSetExposure(long j10, float f10, float f11, float f12);

    private static native void nSetFocusDistance(long j10, float f10);

    private static native void nSetLensProjection(long j10, double d10, double d11, double d12, double d13);

    private static native void nSetModelMatrix(long j10, float[] fArr);

    private static native void nSetModelMatrixFp64(long j10, double[] dArr);

    private static native void nSetProjection(long j10, int i10, double d10, double d11, double d12, double d13, double d14, double d15);

    private static native void nSetProjectionFov(long j10, double d10, double d11, double d12, double d13, int i10);

    private static native void nSetScaling(long j10, double d10, double d11);

    private static native void nSetShift(long j10, double d10, double d11);

    public void A(float f10) {
        B(1.0f, 1.2f, (1.0f / f10) * 100.0f);
    }

    public void B(float f10, float f11, float f12) {
        nSetExposure(n(), f10, f11, f12);
    }

    public void C(float f10) {
        nSetFocusDistance(n(), f10);
    }

    public void D(double d10, double d11, double d12, double d13) {
        nSetLensProjection(n(), d10, d11, d12, d13);
    }

    public void E(@NonNull @d1(min = 16) double[] dArr) {
        c.j(dArr);
        nSetModelMatrixFp64(n(), dArr);
    }

    public void F(@NonNull @d1(min = 16) float[] fArr) {
        c.n(fArr);
        nSetModelMatrix(n(), fArr);
    }

    public void G(double d10, double d11, double d12, double d13, @NonNull a aVar) {
        nSetProjectionFov(n(), d10, d11, d12, d13, aVar.ordinal());
    }

    public void H(@NonNull b bVar, double d10, double d11, double d12, double d13, double d14, double d15) {
        nSetProjection(n(), bVar.ordinal(), d10, d11, d12, d13, d14, d15);
    }

    public void I(double d10, double d11) {
        nSetScaling(n(), d10, d11);
    }

    @Deprecated
    public void J(@NonNull @d1(min = 4) double[] dArr) {
        c.b(dArr);
        I(dArr[0], dArr[1]);
    }

    public void K(double d10, double d11) {
        nSetShift(n(), d10, d11);
    }

    void a() {
        this.f103831a = 0L;
    }

    public float d() {
        return nGetAperture(n());
    }

    public float e() {
        return (float) nGetCullingFar(n());
    }

    @NonNull
    @d1(min = 16)
    public double[] f(@d1(min = 16) @p0 double[] dArr) {
        double[] dArrK = c.k(dArr);
        nGetCullingProjectionMatrix(n(), dArrK);
        return dArrK;
    }

    @h
    public int g() {
        return this.f103832b;
    }

    public double h() {
        return nGetFocalLength(n());
    }

    public float i() {
        return nGetFocusDistance(n());
    }

    @NonNull
    @d1(min = 3)
    public float[] j(@d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = c.c(fArr);
        nGetForwardVector(n(), fArrC);
        return fArrC;
    }

    @NonNull
    @d1(min = 3)
    public float[] k(@d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = c.c(fArr);
        nGetLeftVector(n(), fArrC);
        return fArrC;
    }

    @NonNull
    @d1(min = 16)
    public double[] l(@d1(min = 16) @p0 double[] dArr) {
        double[] dArrI = c.i(dArr);
        nGetModelMatrixFp64(n(), dArrI);
        return dArrI;
    }

    @NonNull
    @d1(min = 16)
    public float[] m(@d1(min = 16) @p0 float[] fArr) {
        float[] fArrM = c.m(fArr);
        nGetModelMatrix(n(), fArrM);
        return fArrM;
    }

    public long n() {
        long j10 = this.f103831a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Camera");
    }

    public float o() {
        return (float) nGetNear(n());
    }

    @NonNull
    @d1(min = 3)
    public float[] p(@d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = c.c(fArr);
        nGetPosition(n(), fArrC);
        return fArrC;
    }

    @NonNull
    @d1(min = 16)
    public double[] q(@d1(min = 16) @p0 double[] dArr) {
        double[] dArrK = c.k(dArr);
        nGetProjectionMatrix(n(), dArrK);
        return dArrK;
    }

    @NonNull
    @d1(min = 4)
    public double[] r(@d1(min = 4) @p0 double[] dArr) {
        double[] dArrA = c.a(dArr);
        nGetScaling(n(), dArrA);
        return dArrA;
    }

    public float s() {
        return nGetSensitivity(n());
    }

    public float t() {
        return nGetShutterSpeed(n());
    }

    @NonNull
    @d1(min = 3)
    public float[] u(@d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = c.c(fArr);
        nGetUpVector(n(), fArrC);
        return fArrC;
    }

    @NonNull
    @d1(min = 16)
    public double[] v(@d1(min = 16) @p0 double[] dArr) {
        double[] dArrI = c.i(dArr);
        nGetViewMatrixFp64(n(), dArrI);
        return dArrI;
    }

    @NonNull
    @d1(min = 16)
    public float[] w(@d1(min = 16) @p0 float[] fArr) {
        float[] fArrM = c.m(fArr);
        nGetViewMatrix(n(), fArrM);
        return fArrM;
    }

    public void x(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        nLookAt(n(), d10, d11, d12, d13, d14, d15, d16, d17, d18);
    }

    public void y(@NonNull @d1(min = 16) double[] dArr, double d10, double d11) {
        c.l(dArr);
        nSetCustomProjection(n(), dArr, dArr, d10, d11);
    }

    public void z(@NonNull @d1(min = 16) double[] dArr, @NonNull @d1(min = 16) double[] dArr2, double d10, double d11) {
        c.l(dArr);
        c.l(dArr2);
        nSetCustomProjection(n(), dArr, dArr2, d10, d11);
    }
}
