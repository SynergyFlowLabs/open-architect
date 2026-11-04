package com.google.vr.ndk.base;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.cardboard.UsedByNative;
import com.google.vr.sdk.deps.c7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@s9.b
public class GvrApi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f126977i = "GvrApi";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f126978j = "robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static PoseTracker f126979k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f126980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f126982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.vr.cardboard.a0 f126983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DisplaySynchronizer f126984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<WeakReference<j0>> f126985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m0 f126986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f126987h;

    @UsedByNative
    interface IdleListener {
        @UsedByNative
        void onIdleChanged(boolean z10);
    }

    @UsedByNative
    public interface PoseTracker {
        @UsedByNative
        void getHeadPoseInStartSpace(float[] fArr, long j10);
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f126988a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f126989b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f126990c = 3;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f126991a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f126992b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f126993c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f126994d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f126995e = 4;
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f126996a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f126997b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f126998c = 0;
    }

    static {
        o.b();
    }

    public GvrApi(Context context, DisplaySynchronizer displaySynchronizer) {
        this.f126982c = context;
        this.f126984e = displaySynchronizer;
        long jD = displaySynchronizer == null ? 0L : displaySynchronizer.d();
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
        this.f126983d = a0VarA;
        a0VarA.c();
        this.f126985f = new ArrayList<>();
        this.f126981b = true;
        if (f126978j) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            this.f126980a = nativeCreate(getClass().getClassLoader(), context.getApplicationContext(), jD, f126979k);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (this.f126980a == 0) {
                throw new IllegalStateException("Native GVR context creation failed, implementation unavailable.");
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static void Y(Context context) {
        if (!f126978j) {
            nativeSetApplicationState(GvrApi.class.getClassLoader(), context.getApplicationContext());
        }
    }

    public static void c0(boolean z10) {
        nativeSetDynamicLibraryLoadingEnabled(z10);
    }

    static DisplaySynchronizer g(Context context) {
        return new DisplaySynchronizer(context, com.google.vr.cardboard.g.c(context));
    }

    public static void g0(PoseTracker poseTracker) {
        f126979k = poseTracker;
    }

    private boolean i0(byte[] bArr) {
        return nativeSetViewerParams(this.f126980a, bArr);
    }

    public static boolean k0(Context context) {
        Y(context);
        return nativeUsingDynamicLibrary();
    }

    public static boolean l0() {
        return nativeUsingShimLibrary();
    }

    static native byte[] nativeAnalyticsCreateSample(long j10, byte[] bArr);

    static native long nativeBufferSpecCreate(long j10);

    static native void nativeBufferSpecDestroy(long j10);

    static native int nativeBufferSpecGetSamples(long j10);

    static native void nativeBufferSpecGetSize(long j10, Point point);

    static native void nativeBufferSpecSetColorFormat(long j10, int i10);

    static native void nativeBufferSpecSetDepthStencilFormat(long j10, int i10);

    static native void nativeBufferSpecSetMultiviewLayers(long j10, int i10);

    static native void nativeBufferSpecSetSamples(long j10, int i10);

    static native void nativeBufferSpecSetSize(long j10, int i10, int i11);

    static native long nativeBufferViewportCreate(long j10);

    static native void nativeBufferViewportDestroy(long j10);

    static native boolean nativeBufferViewportEqual(long j10, long j11);

    static native int nativeBufferViewportGetExternalSurfaceId(long j10);

    static native float nativeBufferViewportGetOpacity(long j10);

    static native int nativeBufferViewportGetReprojection(long j10);

    static native int nativeBufferViewportGetSourceBufferIndex(long j10);

    static native void nativeBufferViewportGetSourceFov(long j10, RectF rectF);

    static native void nativeBufferViewportGetSourceUv(long j10, RectF rectF);

    static native int nativeBufferViewportGetTargetEye(long j10);

    static native void nativeBufferViewportGetTransform(long j10, float[] fArr);

    static native void nativeBufferViewportGetVignetteFraction(long j10, PointF pointF);

    private native long nativeBufferViewportListCreate(long j10);

    static native void nativeBufferViewportListDestroy(long j10);

    static native void nativeBufferViewportListGetItem(long j10, int i10, long j11);

    static native int nativeBufferViewportListGetSize(long j10);

    static native void nativeBufferViewportListSetItem(long j10, int i10, long j11);

    static native void nativeBufferViewportSetExternalSurface(long j10, long j11);

    static native void nativeBufferViewportSetExternalSurfaceId(long j10, int i10);

    static native void nativeBufferViewportSetEyeFromWorldMatrix(long j10, float[] fArr);

    static native void nativeBufferViewportSetOpacity(long j10, float f10);

    static native void nativeBufferViewportSetReprojection(long j10, int i10);

    static native void nativeBufferViewportSetSourceBufferIndex(long j10, int i10);

    static native void nativeBufferViewportSetSourceFov(long j10, float f10, float f11, float f12, float f13);

    static native void nativeBufferViewportSetSourceLayer(long j10, int i10);

    static native void nativeBufferViewportSetSourceUv(long j10, float f10, float f11, float f12, float f13);

    static native void nativeBufferViewportSetTargetEye(long j10, int i10);

    static native void nativeBufferViewportSetTransform(long j10, float[] fArr);

    static native void nativeBufferViewportSetVignetteFraction(long j10, float f10, float f11);

    static native void nativeBufferViewportUnsetEyeFromWorldMatrix(long j10);

    private native int nativeClearError(long j10);

    private native float[] nativeComputeDistortedPoint(long j10, int i10, float[] fArr);

    private native long nativeCreate(ClassLoader classLoader, Context context, long j10, PoseTracker poseTracker);

    static native long nativeCreateEvent();

    static native long nativeCreateValue();

    static native void nativeDestroyEvent(long j10);

    static native void nativeDestroyValue(long j10);

    private native void nativeDistortToScreen(long j10, int i10, long j11, float[] fArr, long j12);

    private native void nativeDumpDebugData(long j10);

    static native long nativeExternalSurfaceCreate(long j10);

    static native long nativeExternalSurfaceCreateWithListeners(long j10, Runnable runnable, Runnable runnable2, Handler handler);

    static native void nativeExternalSurfaceDestroy(long j10);

    static native int nativeExternalSurfaceGetId(long j10);

    static native Surface nativeExternalSurfaceGetSurface(long j10);

    static native void nativeFrameBindBuffer(long j10, int i10);

    static native void nativeFrameGetBufferSize(long j10, int i10, Point point);

    static native int nativeFrameGetFramebufferObject(long j10, int i10);

    static native void nativeFrameSubmit(long j10, long j11, float[] fArr);

    static native void nativeFrameUnbind(long j10);

    private native boolean nativeGetAsyncReprojectionEnabled(long j10);

    private native float nativeGetBorderSizeMeters(long j10);

    private native long nativeGetCurrentProperties(long j10);

    private native int nativeGetError(long j10);

    private static native String nativeGetErrorString(int i10);

    static native long nativeGetEventFlags(long j10);

    static native long nativeGetEventTimestamp(long j10);

    static native int nativeGetEventType(long j10);

    private native void nativeGetEyeFromHeadMatrix(long j10, int i10, float[] fArr);

    private native void nativeGetHeadSpaceFromStartSpaceRotation(long j10, float[] fArr, long j11);

    private native void nativeGetHeadSpaceFromStartSpaceTransform(long j10, float[] fArr, long j11);

    private native void nativeGetMaximumEffectiveRenderTargetSize(long j10, Point point);

    static native boolean nativeGetProperty(long j10, int i10, long j11);

    static native long nativeGetRecenterEventFlags(long j10);

    static native void nativeGetRecenterEventStartSpaceFromTrackingSpaceTransform(long j10, float[] fArr);

    static native int nativeGetRecenterEventType(long j10);

    private native void nativeGetRecommendedBufferViewports(long j10, long j11);

    private native void nativeGetScreenBufferViewports(long j10, long j11);

    private native void nativeGetScreenTargetSize(long j10, Point point);

    private native long nativeGetUserPrefs(long j10);

    private native String nativeGetViewerModel(long j10);

    private native int nativeGetViewerType(long j10);

    private native String nativeGetViewerVendor(long j10);

    private native int[] nativeGetWindowBounds(long j10);

    private native void nativeInitializeGl(long j10);

    private native boolean nativeIsFeatureSupported(long j10, int i10);

    private native void nativeOnPauseReprojectionThread(long j10);

    private native void nativeOnSurfaceChangedReprojectionThread(long j10);

    private native void nativeOnSurfaceCreatedReprojectionThread(long j10);

    private native void nativePause(long j10);

    private native void nativePauseTracking(long j10);

    private native byte[] nativePauseTrackingGetState(long j10);

    private native boolean nativePollEvent(long j10, long j11);

    private native void nativeRecenterTracking(long j10);

    private native void nativeReconnectSensors(long j10);

    private native void nativeReleaseGvrContext(long j10);

    private native Point nativeRenderReprojectionThread(long j10);

    private native void nativeRequestContextSharing(long j10, EglReadyListener eglReadyListener);

    private native void nativeResetTracking(long j10);

    private native void nativeResume(long j10);

    private native void nativeResumeTracking(long j10);

    private native void nativeResumeTrackingSetState(long j10, byte[] bArr);

    private static native void nativeSetApplicationState(ClassLoader classLoader, Context context);

    private native boolean nativeSetAsyncReprojectionEnabled(long j10, boolean z10);

    private native void nativeSetDefaultFramebufferActive(long j10);

    private native boolean nativeSetDefaultViewerProfile(long j10, String str);

    private static native void nativeSetDynamicLibraryLoadingEnabled(boolean z10);

    private native void nativeSetIdleListener(long j10, IdleListener idleListener);

    private native void nativeSetIgnoreManualPauseResumeTracker(long j10, boolean z10);

    private native void nativeSetLensOffset(long j10, float f10, float f11, float f12);

    private native void nativeSetSurfaceSize(long j10, int i10, int i11);

    private native boolean nativeSetViewerParams(long j10, byte[] bArr);

    static native long nativeSwapChainAcquireFrame(long j10);

    static native long nativeSwapChainCreate(long j10, long[] jArr);

    static native void nativeSwapChainDestroy(long j10);

    static native int nativeSwapChainGetBufferCount(long j10);

    static native void nativeSwapChainGetBufferSize(long j10, int i10, Point point);

    static native void nativeSwapChainResizeBuffer(long j10, int i10, int i11, int i12);

    static native int nativeUserPrefsGetControllerHandedness(long j10);

    static native boolean nativeUserPrefsGetPerformanceHudEnabled(long j10);

    static native boolean nativeUserPrefsGetPerformanceMonitoringEnabled(long j10);

    private static native boolean nativeUsingDynamicLibrary();

    private static native boolean nativeUsingShimLibrary();

    private native boolean nativeUsingVrDisplayService(long j10);

    static native long nativeValueAsFlags(long j10);

    static native float nativeValueAsFloat(long j10);

    static native int nativeValueAsInt(long j10);

    static native void nativeValueAsMat4f(long j10, float[] fArr);

    static native long nativeValueGetFlags(long j10);

    public static String p(int i10) {
        return nativeGetErrorString(i10);
    }

    public m0 A() {
        if (this.f126986g == null) {
            this.f126986g = new m0(nativeGetUserPrefs(this.f126980a));
        }
        return this.f126986g;
    }

    public String B() {
        return nativeGetViewerModel(this.f126980a);
    }

    public int C() {
        return nativeGetViewerType(this.f126980a);
    }

    public String D() {
        return nativeGetViewerVendor(this.f126980a);
    }

    public int[] E() {
        int[] iArrNativeGetWindowBounds = nativeGetWindowBounds(this.f126980a);
        int i10 = 6 << 4;
        if (iArrNativeGetWindowBounds.length == 4) {
            return iArrNativeGetWindowBounds;
        }
        throw new AssertionError("Implementation error: invalid window bounds.");
    }

    public void F() {
        nativeInitializeGl(this.f126980a);
    }

    public boolean G(int i10) {
        return nativeIsFeatureSupported(this.f126980a, i10);
    }

    boolean H() {
        com.google.vr.sdk.proto.nano.c.a aVar;
        com.google.vr.sdk.proto.nano.c.d dVarF = this.f126983d.f();
        return (dVarF == null || (aVar = dVarF.f129939e) == null || !aVar.r()) ? false : true;
    }

    public void I() {
        nativeOnPauseReprojectionThread(this.f126980a);
    }

    public void J() {
        nativeOnSurfaceChangedReprojectionThread(this.f126980a);
    }

    public void K() {
        nativeOnSurfaceCreatedReprojectionThread(this.f126980a);
    }

    void L() {
        nativePause(this.f126980a);
    }

    public void M() {
        nativePauseTracking(this.f126980a);
    }

    public byte[] N() {
        return nativePauseTrackingGetState(this.f126980a);
    }

    public boolean O(p pVar) {
        return nativePollEvent(this.f126980a, pVar.f127200a);
    }

    public void P() {
        nativeRecenterTracking(this.f126980a);
    }

    public void Q() {
        nativeReconnectSensors(this.f126980a);
    }

    public void R() {
        com.google.vr.sdk.proto.nano.a.c cVarD = this.f126983d.d();
        if (cVarD != null) {
            i0(c7.j(cVarD));
        }
    }

    public Point S() {
        return nativeRenderReprojectionThread(this.f126980a);
    }

    void T(EglReadyListener eglReadyListener) {
        nativeRequestContextSharing(this.f126980a, eglReadyListener);
    }

    public void U() {
        nativeResetTracking(this.f126980a);
    }

    void V() {
        nativeResume(this.f126980a);
    }

    public void W() {
        nativeResumeTracking(this.f126980a);
    }

    public void X(byte[] bArr) {
        nativeResumeTrackingSetState(this.f126980a, bArr);
    }

    boolean Z(boolean z10) {
        return nativeSetAsyncReprojectionEnabled(this.f126980a, z10);
    }

    public int a() {
        return nativeClearError(this.f126980a);
    }

    public void a0() {
        nativeSetDefaultFramebufferActive(this.f126980a);
    }

    DisplayMetrics b(com.google.vr.sdk.proto.nano.b.a aVar) {
        DisplaySynchronizer displaySynchronizer = this.f126984e;
        return com.google.vr.cardboard.g.e(displaySynchronizer == null ? com.google.vr.cardboard.g.c(this.f126982c) : displaySynchronizer.c(), aVar);
    }

    public boolean b0(String str) {
        return nativeSetDefaultViewerProfile(this.f126980a, str);
    }

    public float[] c(int i10, float[] fArr) {
        float[] fArrNativeComputeDistortedPoint = nativeComputeDistortedPoint(this.f126980a, i10, fArr);
        if (fArrNativeComputeDistortedPoint.length == 6) {
            return fArrNativeComputeDistortedPoint;
        }
        throw new AssertionError("Implementation error: invalid UV coordinates output.");
    }

    public d d() {
        return new d(nativeBufferSpecCreate(this.f126980a));
    }

    void d0(IdleListener idleListener) {
        nativeSetIdleListener(this.f126980a, idleListener);
    }

    public e e() {
        return new e(nativeBufferViewportCreate(this.f126980a));
    }

    void e0(boolean z10) {
        nativeSetIgnoreManualPauseResumeTracker(this.f126980a, z10);
    }

    public f f() {
        return new f(nativeBufferViewportListCreate(this.f126980a));
    }

    public void f0(float f10, float f11, float f12) {
        nativeSetLensOffset(this.f126980a, f10, f11, f12);
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f126980a != 0) {
                j0();
            }
        } finally {
            super.finalize();
        }
    }

    public r h(u.a aVar, Handler handler) {
        return new r(this, aVar, handler);
    }

    public void h0(int i10, int i11) {
        if ((i10 == 0) != (i11 == 0)) {
            throw new IllegalArgumentException("Custom surface dimensions should both either be zero or non-zero");
        }
        nativeSetSurfaceSize(this.f126980a, i10, i11);
    }

    public j0 i(d[] dVarArr) {
        long[] jArr = new long[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            jArr[i10] = dVarArr[i10].f127024a;
        }
        j0 j0Var = new j0(nativeSwapChainCreate(this.f126980a, jArr));
        this.f126985f.add(new WeakReference<>(j0Var));
        return j0Var;
    }

    @Deprecated
    public void j(int i10, f fVar, float[] fArr, long j10) {
        if (fArr == null) {
            throw new IllegalArgumentException("Head transform must not be null.");
        }
        nativeDistortToScreen(this.f126980a, i10, fVar.f127064a, fArr, j10);
    }

    public void j0() {
        ArrayList<WeakReference<j0>> arrayList = this.f126985f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference<j0> weakReference = arrayList.get(i10);
            i10++;
            j0 j0Var = weakReference.get();
            if (j0Var != null) {
                j0Var.e();
            }
        }
        if (this.f126980a != 0) {
            this.f126983d.close();
            if (this.f126981b) {
                nativeReleaseGvrContext(this.f126980a);
            }
            this.f126980a = 0L;
        }
    }

    void k() {
        nativeDumpDebugData(this.f126980a);
    }

    public boolean l() {
        return nativeGetAsyncReprojectionEnabled(this.f126980a);
    }

    public float m() {
        return nativeGetBorderSizeMeters(this.f126980a);
    }

    public boolean m0() {
        return nativeUsingVrDisplayService(this.f126980a);
    }

    public f0 n() {
        if (this.f126987h == null) {
            this.f126987h = new f0(nativeGetCurrentProperties(this.f126980a));
        }
        return this.f126987h;
    }

    public int o() {
        return nativeGetError(this.f126980a);
    }

    public void q(int i10, float[] fArr) {
        nativeGetEyeFromHeadMatrix(this.f126980a, i10, fArr);
    }

    @Deprecated
    public float[] r(int i10) {
        float[] fArr = new float[16];
        q(i10, fArr);
        return fArr;
    }

    @Deprecated
    public void s(float[] fArr, long j10) {
        if (fArr == null || fArr.length != 16) {
            throw new IllegalArgumentException("Invalid head rotation argument, must be a float[16].");
        }
        nativeGetHeadSpaceFromStartSpaceRotation(this.f126980a, fArr, j10);
    }

    public void t(float[] fArr, long j10) {
        if (fArr == null || fArr.length != 16) {
            throw new IllegalArgumentException("Invalid head transform argument, must be a float[16].");
        }
        nativeGetHeadSpaceFromStartSpaceTransform(this.f126980a, fArr, j10);
    }

    public void u(Point point) {
        nativeGetMaximumEffectiveRenderTargetSize(this.f126980a, point);
    }

    @s9.b
    public long v() {
        return this.f126980a;
    }

    public void w(f fVar) {
        nativeGetRecommendedBufferViewports(this.f126980a, fVar.f127064a);
    }

    public void x(f fVar) {
        nativeGetScreenBufferViewports(this.f126980a, fVar.f127064a);
    }

    public void y(Point point) {
        nativeGetScreenTargetSize(this.f126980a, point);
    }

    com.google.common.logging.nano.a.C1088a.m z() {
        return g0.a(this.f126982c);
    }

    GvrApi(Context context, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Invalid wrapped native GVR context.");
        }
        this.f126982c = context;
        this.f126981b = false;
        this.f126980a = j10;
        this.f126983d = com.google.vr.cardboard.b0.a(context);
        this.f126984e = null;
        this.f126985f = new ArrayList<>();
        Y(context);
    }
}
