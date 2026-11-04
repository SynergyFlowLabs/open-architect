package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.vr.cardboard.UsedByNative;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.z;
import javax.microedition.khronos.egl.EGLConfig;

/* JADX INFO: loaded from: classes5.dex */
public class GvrView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f127524a;

    public interface Renderer {
        void a();

        void b(EGLConfig eGLConfig);

        void c(int i10, int i11);

        @UsedByNative
        void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2);

        @UsedByNative
        void onFinishFrame(Viewport viewport);
    }

    public interface StereoRenderer {
        void a();

        void b(EGLConfig eGLConfig);

        void c(int i10, int i11);

        @UsedByNative
        void onDrawEye(Eye eye);

        @UsedByNative
        void onFinishFrame(Viewport viewport);

        @UsedByNative
        void onNewFrame(HeadTransform headTransform);
    }

    public GvrView(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        if (isInEditMode()) {
            return;
        }
        if (!com.google.vr.cardboard.f.a(context)) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        b bVarA = k.a(context);
        this.f127524a = bVarA;
        addView(bVarA.getRootView(), 0);
        z zVarG1 = this.f127524a.g1();
        zVarG1.setEGLContextClientVersion(2);
        zVarG1.setPreserveEGLContextOnPause(true);
    }

    public void a() {
        this.f127524a.e1();
    }

    public void b(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5) {
        this.f127524a.y1(headTransform, eye, eye2, eye3, eye4, eye5);
    }

    public void d() {
        this.f127524a.onBackPressed();
    }

    public void e() {
        this.f127524a.d();
    }

    public void f() {
        this.f127524a.l();
    }

    public void g(Runnable runnable) {
        this.f127524a.g1().q(runnable);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return GvrView.class.getName();
    }

    public boolean getAsyncReprojectionEnabled() {
        return this.f127524a.v1();
    }

    public boolean getDistortionCorrectionEnabled() {
        return this.f127524a.G1();
    }

    public GvrApi getGvrApi() {
        return this.f127524a.A1();
    }

    public g getGvrViewerParams() {
        return this.f127524a.j1();
    }

    public h getHeadMountedDisplay() {
        return this.f127524a.s1();
    }

    public float getInterpupillaryDistance() {
        return this.f127524a.f1();
    }

    public float getNeckModelFactor() {
        return this.f127524a.F1();
    }

    public m getScreenParams() {
        return this.f127524a.i1();
    }

    public boolean getStereoModeEnabled() {
        return this.f127524a.m1();
    }

    public void h() {
        this.f127524a.r1();
    }

    @Deprecated
    public void i() {
        this.f127524a.w1();
    }

    public boolean j(boolean z10) {
        return this.f127524a.p1(z10);
    }

    public void k(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f127524a.g1().t(i10, i11, i12, i13, i14, i15);
    }

    public void l() {
        this.f127524a.shutdown();
    }

    public void m(g gVar) {
        this.f127524a.z1(gVar);
    }

    public void n(m mVar) {
        this.f127524a.t1(mVar);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f127524a.a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDepthStencilFormat(int i10) {
        this.f127524a.x1(i10);
    }

    public void setDistortionCorrectionEnabled(boolean z10) {
        this.f127524a.C1(z10);
    }

    public void setEGLContextClientVersion(int i10) {
        this.f127524a.g1().setEGLContextClientVersion(i10);
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.f127524a.g1().setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public void setMultisampling(int i10) {
        this.f127524a.k1(i10);
    }

    public void setNeckModelEnabled(boolean z10) {
        this.f127524a.B1(z10);
    }

    public void setNeckModelFactor(float f10) {
        this.f127524a.E1(f10);
    }

    public void setOnCardboardBackListener(Runnable runnable) {
        this.f127524a.l1(runnable);
    }

    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.f127524a.o1(runnable);
    }

    public void setOnCloseButtonListener(Runnable runnable) {
        this.f127524a.q1(runnable);
    }

    public void setOnTransitionViewDoneListener(Runnable runnable) {
        this.f127524a.n1(runnable);
    }

    public void setRenderTargetScale(float f10) {
        this.f127524a.h1(f10);
    }

    public void setRenderer(Renderer renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer must not be null");
        }
        this.f127524a.u1(renderer);
    }

    public void setStereoModeEnabled(boolean z10) {
        this.f127524a.N(z10);
    }

    public void setTransitionViewEnabled(boolean z10) {
        this.f127524a.d1(z10);
    }

    public GvrView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public void setRenderer(StereoRenderer stereoRenderer) {
        if (stereoRenderer != null) {
            this.f127524a.D1(stereoRenderer);
            return;
        }
        throw new IllegalArgumentException("StereoRenderer must not be null");
    }
}
