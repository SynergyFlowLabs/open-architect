package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class Scene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private Skybox f104182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private IndirectLight f104183c;

    public interface a {
        void a(@h int i10);
    }

    Scene(long j10) {
        this.f104181a = j10;
    }

    private static native void nAddEntities(long j10, int[] iArr);

    private static native void nAddEntity(long j10, int i10);

    private static native boolean nGetEntities(long j10, int[] iArr, int i10);

    private static native int nGetEntityCount(long j10);

    private static native int nGetLightCount(long j10);

    private static native int nGetRenderableCount(long j10);

    private static native boolean nHasEntity(long j10, int i10);

    private static native void nRemove(long j10, int i10);

    private static native void nRemoveEntities(long j10, int[] iArr);

    private static native void nSetIndirectLight(long j10, long j11);

    private static native void nSetSkybox(long j10, long j11);

    public void a(@h int[] iArr) {
        nAddEntities(j(), iArr);
    }

    public void b(@h int i10) {
        nAddEntity(j(), i10);
    }

    void c() {
        this.f104181a = 0L;
    }

    public void d(@NonNull a aVar) {
        for (int i10 : f(null)) {
            aVar.a(i10);
        }
    }

    public int[] e() {
        return f(null);
    }

    public int[] f(@p0 int[] iArr) {
        int iG = g();
        if (iArr == null || iArr.length < iG) {
            iArr = new int[iG];
        }
        if (nGetEntities(j(), iArr, iArr.length)) {
            return iArr;
        }
        throw new IllegalStateException("Error retriving Scene's entities");
    }

    public int g() {
        return nGetEntityCount(j());
    }

    @p0
    public IndirectLight h() {
        return this.f104183c;
    }

    public int i() {
        return nGetLightCount(j());
    }

    public long j() {
        long j10 = this.f104181a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }

    public int k() {
        return nGetRenderableCount(j());
    }

    @p0
    public Skybox l() {
        return this.f104182b;
    }

    public boolean m(@h int i10) {
        return nHasEntity(j(), i10);
    }

    @Deprecated
    public void n(@h int i10) {
        p(i10);
    }

    public void o(@h int[] iArr) {
        nRemoveEntities(j(), iArr);
    }

    public void p(@h int i10) {
        nRemove(j(), i10);
    }

    public void q(@p0 IndirectLight indirectLight) {
        this.f104183c = indirectLight;
        long j10 = j();
        IndirectLight indirectLight2 = this.f104183c;
        nSetIndirectLight(j10, indirectLight2 != null ? indirectLight2.q() : 0L);
    }

    public void r(@p0 Skybox skybox) {
        this.f104182b = skybox;
        long j10 = j();
        Skybox skybox2 = this.f104182b;
        nSetSkybox(j10, skybox2 != null ? skybox2.k() : 0L);
    }
}
