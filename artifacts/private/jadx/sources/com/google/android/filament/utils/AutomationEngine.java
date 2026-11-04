package com.google.android.filament.utils;

import androidx.annotation.NonNull;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.View;

/* JADX INFO: loaded from: classes4.dex */
public class AutomationEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f104754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorGrading f104755b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104756a = 0.2f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104757b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f104758c = true;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f104759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Renderer f104760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MaterialInstance[] f104761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LightManager f104762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Scene f104763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IndirectLight f104764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @com.google.android.filament.h
        public int f104765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @com.google.android.filament.h
        public int[] f104766h;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104767a = 16.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104768b = 125.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104769c = 100.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f104770d = 0.1f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f104771e = 100.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f104772f = 0.75f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f104773g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f104774h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f104775i = 28.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f104776j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f104777k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f104778l = false;
    }

    public AutomationEngine(@NonNull String str) {
        long jNCreateAutomationEngine = nCreateAutomationEngine(str);
        this.f104754a = jNCreateAutomationEngine;
        if (jNCreateAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }

    private static native void nApplySettings(long j10, long j11, String str, long j12, long[] jArr, long j13, int i10, int[] iArr, long j14, long j15, long j16);

    private static native long nCreateAutomationEngine(String str);

    private static native long nCreateDefaultAutomationEngine();

    private static native void nDestroy(long j10);

    private static native long nGetColorGrading(long j10, long j11);

    private static native void nGetViewerOptions(long j10, Object obj);

    private static native void nSetOptions(long j10, float f10, int i10, boolean z10);

    private static native boolean nShouldClose(long j10);

    private static native void nSignalBatchMode(long j10);

    private static native void nStartBatchMode(long j10);

    private static native void nStartRunning(long j10);

    private static native void nStopRunning(long j10);

    private static native void nTick(long j10, long j11, long j12, long[] jArr, long j13, float f10);

    public void a(@NonNull Engine engine, @NonNull String str, @NonNull b bVar) {
        long[] jArr;
        if (bVar.f104759a == null || bVar.f104760b == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        if (bVar.f104762d == null || bVar.f104763e == null) {
            throw new IllegalStateException("Must provide a LightManager and Scene");
        }
        MaterialInstance[] materialInstanceArr = bVar.f104761c;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = bVar.f104761c[i10].h();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        long jS = bVar.f104759a.s();
        IndirectLight indirectLight = bVar.f104764f;
        nApplySettings(this.f104754a, engine.getNativeObject(), str, jS, jArr2, indirectLight == null ? 0L : indirectLight.q(), bVar.f104765g, bVar.f104766h, bVar.f104762d.E(), bVar.f104763e.j(), bVar.f104760b.i());
    }

    @NonNull
    public ColorGrading b(@NonNull Engine engine) {
        long jNGetColorGrading = nGetColorGrading(this.f104754a, engine.getNativeObject());
        ColorGrading colorGrading = this.f104755b;
        if (colorGrading == null || colorGrading.v() != jNGetColorGrading) {
            this.f104755b = jNGetColorGrading == 0 ? null : new ColorGrading(jNGetColorGrading);
        }
        return this.f104755b;
    }

    @NonNull
    public c c() {
        c cVar = new c();
        nGetViewerOptions(this.f104754a, cVar);
        return cVar;
    }

    public void d(@NonNull a aVar) {
        nSetOptions(this.f104754a, aVar.f104756a, aVar.f104757b, aVar.f104758c);
    }

    public boolean e() {
        return nShouldClose(this.f104754a);
    }

    public void f() {
        nSignalBatchMode(this.f104754a);
    }

    protected void finalize() throws Throwable {
        nDestroy(this.f104754a);
        super.finalize();
    }

    public void g() {
        nStartBatchMode(this.f104754a);
    }

    public void h() {
        nStartRunning(this.f104754a);
    }

    public void i() {
        nStopRunning(this.f104754a);
    }

    public void j(@NonNull Engine engine, @NonNull b bVar, float f10) {
        long[] jArr;
        if (bVar.f104759a == null || bVar.f104760b == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        MaterialInstance[] materialInstanceArr = bVar.f104761c;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = bVar.f104761c[i10].h();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        nTick(this.f104754a, engine.getNativeObject(), bVar.f104759a.s(), jArr2, bVar.f104760b.i(), f10);
    }

    public AutomationEngine() {
        long jNCreateDefaultAutomationEngine = nCreateDefaultAutomationEngine();
        this.f104754a = jNCreateDefaultAutomationEngine;
        if (jNCreateDefaultAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }
}
