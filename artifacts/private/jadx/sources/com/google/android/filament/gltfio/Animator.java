package com.google.android.filament.gltfio;

import androidx.annotation.g0;

/* JADX INFO: loaded from: classes4.dex */
public class Animator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104725a;

    Animator(long j10) {
        this.f104725a = j10;
    }

    private static native void nApplyAnimation(long j10, int i10, float f10);

    private static native void nApplyCrossFade(long j10, int i10, float f10, float f11);

    private static native int nGetAnimationCount(long j10);

    private static native float nGetAnimationDuration(long j10, int i10);

    private static native String nGetAnimationName(long j10, int i10);

    private static native void nResetBoneMatrices(long j10);

    private static native void nUpdateBoneMatrices(long j10);

    public void a(@g0(from = 0) int i10, float f10) {
        nApplyAnimation(g(), i10, f10);
    }

    public void b(int i10, float f10, float f11) {
        nApplyCrossFade(g(), i10, f10, f11);
    }

    void c() {
        this.f104725a = 0L;
    }

    public int d() {
        return nGetAnimationCount(g());
    }

    public float e(@g0(from = 0) int i10) {
        return nGetAnimationDuration(g(), i10);
    }

    public String f(@g0(from = 0) int i10) {
        return nGetAnimationName(g(), i10);
    }

    long g() {
        long j10 = this.f104725a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Using Animator on destroyed asset");
    }

    public void h() {
        nResetBoneMatrices(g());
    }

    public void i() {
        nUpdateBoneMatrices(g());
    }
}
