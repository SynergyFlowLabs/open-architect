package com.google.android.filament.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.filament.Engine;
import com.google.android.filament.d;
import com.google.android.filament.h;

/* JADX INFO: loaded from: classes4.dex */
public class FilamentAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FilamentInstance f104730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Engine f104731c;

    FilamentAsset(Engine engine, long j10) {
        this.f104731c = engine;
        this.f104729a = j10;
    }

    private static native void nGetBoundingBox(long j10, float[] fArr);

    private static native void nGetCameraEntities(long j10, int[] iArr);

    private static native int nGetCameraEntityCount(long j10);

    private static native void nGetEntities(long j10, int[] iArr);

    private static native int nGetEntitiesByName(long j10, String str, int[] iArr);

    private static native int nGetEntitiesByPrefix(long j10, String str, int[] iArr);

    private static native int nGetEntityCount(long j10);

    private static native String nGetExtras(long j10, int i10);

    private static native int nGetFirstEntityByName(long j10, String str);

    private static native long nGetInstance(long j10);

    private static native void nGetLightEntities(long j10, int[] iArr);

    private static native int nGetLightEntityCount(long j10);

    private static native int nGetMorphTargetCount(long j10, int i10);

    private static native void nGetMorphTargetNames(long j10, int i10, String[] strArr);

    private static native String nGetName(long j10, int i10);

    private static native void nGetRenderableEntities(long j10, int[] iArr);

    private static native int nGetRenderableEntityCount(long j10);

    private static native int nGetResourceUriCount(long j10);

    private static native void nGetResourceUris(long j10, String[] strArr);

    private static native int nGetRoot(long j10);

    private static native int nPopRenderable(long j10);

    private static native int nPopRenderables(long j10, int[] iArr);

    private static native void nReleaseSourceData(long j10);

    void a() {
        this.f104730b = null;
        this.f104729a = 0L;
    }

    @NonNull
    public d b() {
        float[] fArr = new float[6];
        nGetBoundingBox(this.f104729a, fArr);
        int i10 = 6 & 3;
        return new d(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
    }

    @NonNull
    @h
    public int[] c() {
        int[] iArr = new int[nGetCameraEntityCount(this.f104729a)];
        nGetCameraEntities(this.f104729a, iArr);
        return iArr;
    }

    public Engine d() {
        return this.f104731c;
    }

    @NonNull
    @h
    public int[] e() {
        int[] iArr = new int[nGetEntityCount(this.f104729a)];
        nGetEntities(this.f104729a, iArr);
        return iArr;
    }

    @NonNull
    @h
    public int[] f(String str) {
        int[] iArr = new int[nGetEntitiesByName(this.f104729a, str, null)];
        nGetEntitiesByName(this.f104729a, str, iArr);
        return iArr;
    }

    @NonNull
    @h
    public int[] g(String str) {
        int[] iArr = new int[nGetEntitiesByPrefix(this.f104729a, str, null)];
        nGetEntitiesByPrefix(this.f104729a, str, iArr);
        return iArr;
    }

    @p0
    public String h(@h int i10) {
        return nGetExtras(this.f104729a, i10);
    }

    @h
    public int i(String str) {
        return nGetFirstEntityByName(this.f104729a, str);
    }

    public FilamentInstance j() {
        FilamentInstance filamentInstance = this.f104730b;
        if (filamentInstance != null) {
            return filamentInstance;
        }
        FilamentInstance filamentInstance2 = new FilamentInstance(this, nGetInstance(n()));
        this.f104730b = filamentInstance2;
        return filamentInstance2;
    }

    @NonNull
    @h
    public int[] k() {
        int[] iArr = new int[nGetLightEntityCount(this.f104729a)];
        nGetLightEntities(this.f104729a, iArr);
        return iArr;
    }

    @NonNull
    public String[] l(@h int i10) {
        String[] strArr = new String[nGetMorphTargetCount(this.f104729a, i10)];
        nGetMorphTargetNames(this.f104729a, i10, strArr);
        return strArr;
    }

    public String m(@h int i10) {
        return nGetName(n(), i10);
    }

    long n() {
        return this.f104729a;
    }

    @NonNull
    @h
    public int[] o() {
        int[] iArr = new int[nGetRenderableEntityCount(this.f104729a)];
        nGetRenderableEntities(this.f104729a, iArr);
        return iArr;
    }

    @NonNull
    public String[] p() {
        String[] strArr = new String[nGetResourceUriCount(this.f104729a)];
        nGetResourceUris(this.f104729a, strArr);
        return strArr;
    }

    @h
    public int q() {
        return nGetRoot(this.f104729a);
    }

    @h
    public int r() {
        return nPopRenderable(this.f104729a);
    }

    public int s(@h @p0 int[] iArr) {
        return nPopRenderables(this.f104729a, iArr);
    }

    public void t() {
        nReleaseSourceData(this.f104729a);
    }
}
