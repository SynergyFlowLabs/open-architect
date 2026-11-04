package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class TransformManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104441a;

    TransformManager(long j10) {
        this.f104441a = j10;
    }

    private static native void nCommitLocalTransformTransaction(long j10);

    private static native int nCreate(long j10, int i10);

    private static native int nCreateArray(long j10, int i10, int i11, float[] fArr);

    private static native int nCreateArrayFp64(long j10, int i10, int i11, double[] dArr);

    private static native void nDestroy(long j10, int i10);

    private static native int nGetChildCount(long j10, int i10);

    private static native void nGetChildren(long j10, int i10, int[] iArr, int i11);

    private static native int nGetInstance(long j10, int i10);

    private static native int nGetParent(long j10, int i10);

    private static native void nGetTransform(long j10, int i10, float[] fArr);

    private static native void nGetTransformFp64(long j10, int i10, double[] dArr);

    private static native void nGetWorldTransform(long j10, int i10, float[] fArr);

    private static native void nGetWorldTransformFp64(long j10, int i10, double[] dArr);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsAccurateTranslationsEnabled(long j10);

    private static native void nOpenLocalTransformTransaction(long j10);

    private static native void nSetAccurateTranslationsEnabled(long j10, boolean z10);

    private static native void nSetParent(long j10, int i10, int i11);

    private static native void nSetTransform(long j10, int i10, float[] fArr);

    private static native void nSetTransformFp64(long j10, int i10, double[] dArr);

    public void a() {
        nCommitLocalTransformTransaction(this.f104441a);
    }

    @i
    public int b(@h int i10) {
        return nCreate(this.f104441a, i10);
    }

    @i
    public int c(@h int i10, @i int i11, @d1(min = 16) @p0 double[] dArr) {
        return nCreateArrayFp64(this.f104441a, i10, i11, dArr);
    }

    @i
    public int d(@h int i10, @i int i11, @d1(min = 16) @p0 float[] fArr) {
        return nCreateArray(this.f104441a, i10, i11, fArr);
    }

    public void e(@h int i10) {
        nDestroy(this.f104441a, i10);
    }

    public int f(@i int i10) {
        return nGetChildCount(this.f104441a, i10);
    }

    @NonNull
    @h
    public int[] g(@i int i10, @p0 int[] iArr) {
        if (iArr == null) {
            iArr = new int[f(i10)];
        }
        if (iArr.length > 0) {
            nGetChildren(this.f104441a, i10, iArr, iArr.length);
        }
        return iArr;
    }

    @i
    public int h(@h int i10) {
        return nGetInstance(this.f104441a, i10);
    }

    public long i() {
        return this.f104441a;
    }

    @h
    public int j(@i int i10) {
        return nGetParent(this.f104441a, i10);
    }

    @NonNull
    @d1(min = 16)
    public double[] k(@i int i10, @d1(min = 16) @p0 double[] dArr) {
        double[] dArrI = c.i(dArr);
        nGetTransformFp64(this.f104441a, i10, dArrI);
        return dArrI;
    }

    @NonNull
    @d1(min = 16)
    public float[] l(@i int i10, @d1(min = 16) @p0 float[] fArr) {
        float[] fArrM = c.m(fArr);
        nGetTransform(this.f104441a, i10, fArrM);
        return fArrM;
    }

    @NonNull
    @d1(min = 16)
    public double[] m(@i int i10, @d1(min = 16) @p0 double[] dArr) {
        double[] dArrI = c.i(dArr);
        nGetWorldTransformFp64(this.f104441a, i10, dArrI);
        return dArrI;
    }

    @NonNull
    @d1(min = 16)
    public float[] n(@i int i10, @d1(min = 16) @p0 float[] fArr) {
        float[] fArrM = c.m(fArr);
        nGetWorldTransform(this.f104441a, i10, fArrM);
        return fArrM;
    }

    public boolean o(@h int i10) {
        return nHasComponent(this.f104441a, i10);
    }

    public boolean p() {
        return nIsAccurateTranslationsEnabled(this.f104441a);
    }

    public void q() {
        nOpenLocalTransformTransaction(this.f104441a);
    }

    public void r(boolean z10) {
        nSetAccurateTranslationsEnabled(this.f104441a, z10);
    }

    public void s(@i int i10, @i int i11) {
        nSetParent(this.f104441a, i10, i11);
    }

    public void t(@i int i10, @NonNull @d1(min = 16) double[] dArr) {
        c.j(dArr);
        nSetTransformFp64(this.f104441a, i10, dArr);
    }

    public void u(@i int i10, @NonNull @d1(min = 16) float[] fArr) {
        c.n(fArr);
        nSetTransform(this.f104441a, i10, fArr);
    }
}
