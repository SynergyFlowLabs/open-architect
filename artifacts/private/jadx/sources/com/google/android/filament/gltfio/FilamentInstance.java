package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.h;

/* JADX INFO: loaded from: classes4.dex */
public class FilamentInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FilamentAsset f104732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f104733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animator f104734c = null;

    FilamentInstance(FilamentAsset filamentAsset, long j10) {
        this.f104732a = filamentAsset;
        this.f104733b = j10;
    }

    private static native void nApplyMaterialVariant(long j10, int i10);

    private static native void nAttachSkin(long j10, int i10, int i11);

    private static native void nDetachSkin(long j10, int i10, int i11);

    private static native long nGetAnimator(long j10);

    private static native void nGetEntities(long j10, int[] iArr);

    private static native int nGetEntityCount(long j10);

    private static native int nGetJointCountAt(long j10, int i10);

    private static native void nGetJointsAt(long j10, int i10, int[] iArr);

    private static native int nGetMaterialInstanceCount(long j10);

    private static native void nGetMaterialInstances(long j10, long[] jArr);

    private static native int nGetMaterialVariantCount(long j10);

    private static native void nGetMaterialVariantNames(long j10, String[] strArr);

    private static native int nGetRoot(long j10);

    private static native int nGetSkinCount(long j10);

    private static native void nGetSkinNames(long j10, String[] strArr);

    public void a(@g0(from = 0) int i10) {
        nApplyMaterialVariant(this.f104733b, i10);
    }

    public void b(@g0(from = 0) int i10, @h int i11) {
        nAttachSkin(l(), i10, i11);
    }

    void c() {
        this.f104733b = 0L;
    }

    public void d(@g0(from = 0) int i10, @h int i11) {
        nDetachSkin(l(), i10, i11);
    }

    @NonNull
    public Animator e() {
        Animator animator = this.f104734c;
        if (animator != null) {
            return animator;
        }
        Animator animator2 = new Animator(nGetAnimator(this.f104733b));
        this.f104734c = animator2;
        return animator2;
    }

    @NonNull
    public FilamentAsset f() {
        return this.f104732a;
    }

    @NonNull
    @h
    public int[] g() {
        int[] iArr = new int[nGetEntityCount(this.f104733b)];
        nGetEntities(this.f104733b, iArr);
        return iArr;
    }

    public int h(@g0(from = 0) int i10) {
        return nGetJointCountAt(l(), i10);
    }

    @NonNull
    @h
    public int[] i(@g0(from = 0) int i10) {
        int[] iArr = new int[h(i10)];
        nGetJointsAt(l(), i10, iArr);
        return iArr;
    }

    @NonNull
    public MaterialInstance[] j() {
        int iNGetMaterialInstanceCount = nGetMaterialInstanceCount(this.f104733b);
        MaterialInstance[] materialInstanceArr = new MaterialInstance[iNGetMaterialInstanceCount];
        long[] jArr = new long[iNGetMaterialInstanceCount];
        nGetMaterialInstances(this.f104733b, jArr);
        Engine engineD = this.f104732a.d();
        for (int i10 = 0; i10 < iNGetMaterialInstanceCount; i10++) {
            materialInstanceArr[i10] = new MaterialInstance(engineD, jArr[i10]);
        }
        return materialInstanceArr;
    }

    @NonNull
    public String[] k() {
        String[] strArr = new String[nGetMaterialVariantCount(this.f104733b)];
        nGetMaterialVariantNames(this.f104733b, strArr);
        return strArr;
    }

    long l() {
        return this.f104733b;
    }

    @h
    public int m() {
        return nGetRoot(this.f104733b);
    }

    public int n() {
        return nGetSkinCount(l());
    }

    @NonNull
    public String[] o() {
        String[] strArr = new String[n()];
        nGetSkinNames(l(), strArr);
        return strArr;
    }
}
