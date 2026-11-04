package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLSurfaceView;
import android.os.Trace;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.vr.cardboard.UsedByNative;
import com.google.vr.cardboard.v;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.a0;
import com.google.vr.ndk.base.u;
import com.google.vr.ndk.base.z;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class CardboardViewNativeImpl implements com.google.vr.cardboard.c.a, com.google.vr.sdk.base.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f127465p = "CardboardViewNativeImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f127466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f127467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f127468c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Runnable f127470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Runnable f127471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f127472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.vr.cardboard.c f127473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f127474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a0 f127475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GvrApi f127476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f127477l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f127480o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127469d = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f127478m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f127479n = true;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f127481a;

        a(boolean z10) {
            this.f127481a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetDistortionCorrectionEnabled(cardboardViewNativeImpl.f127480o, this.f127481a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f127483a;

        b(float f10) {
            this.f127483a = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetDistortionCorrectionScale(cardboardViewNativeImpl.f127480o, this.f127483a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f127485a;

        c(int i10) {
            this.f127485a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetMultisampling(cardboardViewNativeImpl.f127480o, this.f127485a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f127487a;

        d(int i10) {
            this.f127487a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetDepthStencilFormat(cardboardViewNativeImpl.f127480o, this.f127487a);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl.this.onCardboardTrigger();
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.vr.sdk.base.g f127490a;

        f(com.google.vr.sdk.base.g gVar) {
            this.f127490a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetGvrViewerParams(cardboardViewNativeImpl.f127480o, this.f127490a.C());
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f127492a;

        g(m mVar) {
            this.f127492a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardboardViewNativeImpl.this.f127466a.p(this.f127492a);
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetScreenParams(cardboardViewNativeImpl.f127480o, this.f127492a.e(), this.f127492a.c(), this.f127492a.f() / this.f127492a.e(), this.f127492a.d() / this.f127492a.c(), this.f127492a.b());
        }
    }

    class h implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private GvrView.Renderer f127494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GvrView.StereoRenderer f127495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f127496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f127497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f127498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f127499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private EGLDisplay f127500g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if ((h.this.f127494a != null || h.this.f127495b != null) && h.this.f127498e) {
                    h.this.f127498e = false;
                    h.this.i();
                }
                CardboardViewNativeImpl.this.f127468c.countDown();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f127503a;

            b(boolean z10) {
                this.f127503a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = h.this.f127497d;
                boolean z11 = this.f127503a;
                if (z10 == z11) {
                    return;
                }
                h.this.f127497d = z11;
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetStereoModeEnabled(cardboardViewNativeImpl.f127480o, this.f127503a);
                if (EGL10.EGL_NO_SURFACE.equals(((EGL10) EGLContext.getEGL()).eglGetCurrentSurface(12377))) {
                    return;
                }
                h hVar = h.this;
                hVar.onSurfaceChanged(null, hVar.f127496c.e(), h.this.f127496c.c());
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HeadTransform f127505a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Eye f127506b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Eye f127507c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Eye f127508d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Eye f127509e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Eye f127510f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ CountDownLatch f127511g;

            c(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5, CountDownLatch countDownLatch) {
                this.f127505a = headTransform;
                this.f127506b = eye;
                this.f127507c = eye2;
                this.f127508d = eye3;
                this.f127509e = eye4;
                this.f127510f = eye5;
                this.f127511g = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeGetCurrentEyeParams(cardboardViewNativeImpl.f127480o, this.f127505a, this.f127506b, this.f127507c, this.f127508d, this.f127509e, this.f127510f);
                this.f127511g.countDown();
            }
        }

        public h() {
            this.f127496c = new m(CardboardViewNativeImpl.this.i1());
            this.f127497d = CardboardViewNativeImpl.this.f127478m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            GvrView.Renderer renderer = this.f127494a;
            if (renderer != null) {
                renderer.a();
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.f127495b;
            if (stereoRenderer != null) {
                stereoRenderer.a();
            }
        }

        private void j(int i10, int i11) {
            GvrView.Renderer renderer = this.f127494a;
            if (renderer != null) {
                renderer.c(i10, i11);
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.f127495b;
            if (stereoRenderer != null) {
                if (this.f127497d) {
                    stereoRenderer.c(i10 / 2, i11);
                } else {
                    stereoRenderer.c(i10, i11);
                }
            }
        }

        private void k(EGLConfig eGLConfig) {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeOnSurfaceCreated(cardboardViewNativeImpl.f127480o);
            GvrView.Renderer renderer = this.f127494a;
            if (renderer != null) {
                renderer.b(eGLConfig);
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.f127495b;
            if (stereoRenderer != null) {
                stereoRenderer.b(eGLConfig);
            }
        }

        public void m(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5) {
            CardboardViewNativeImpl.this.A();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            CardboardViewNativeImpl.this.C(new c(headTransform, eye, eye2, eye3, eye4, eye5, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                String unused = CardboardViewNativeImpl.f127465p;
                String strValueOf = String.valueOf(e10.toString());
                if (strValueOf.length() != 0) {
                    "Interrupted while reading frame params: ".concat(strValueOf);
                }
            }
        }

        public void n(GvrView.Renderer renderer) {
            this.f127494a = renderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetRenderer(cardboardViewNativeImpl.f127480o, renderer);
        }

        public void o(GvrView.StereoRenderer stereoRenderer) {
            this.f127495b = stereoRenderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetStereoRenderer(cardboardViewNativeImpl.f127480o, stereoRenderer);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (!(this.f127494a == null && this.f127495b == null) && this.f127498e) {
                Trace.beginSection("Render");
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnDrawFrame(cardboardViewNativeImpl.f127480o);
                Trace.endSection();
                EGL14.eglSwapInterval(this.f127500g, 1);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            if (!(this.f127494a == null && this.f127495b == null) && this.f127498e) {
                if (!this.f127497d || (i10 == this.f127496c.e() && i11 == this.f127496c.c())) {
                    this.f127499f = false;
                } else {
                    if (!this.f127499f) {
                        String unused = CardboardViewNativeImpl.f127465p;
                        this.f127496c.e();
                        this.f127496c.c();
                    }
                    this.f127499f = true;
                }
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnSurfaceChanged(cardboardViewNativeImpl.f127480o, i10, i11);
                j(i10, i11);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (this.f127494a == null && this.f127495b == null) {
                return;
            }
            this.f127498e = true;
            this.f127500g = EGL14.eglGetCurrentDisplay();
            k(eGLConfig);
        }

        public void p(m mVar) {
            this.f127496c = mVar;
        }

        public void q(boolean z10) {
            CardboardViewNativeImpl.this.A();
            CardboardViewNativeImpl.this.f127474i.setStereoModeEnabled(z10);
            CardboardViewNativeImpl.this.C(new b(z10));
        }

        public void r() {
            CardboardViewNativeImpl.this.C(new a());
        }
    }

    public CardboardViewNativeImpl(Context context) {
        String str;
        this.f127477l = context;
        this.f127467b = new i(context);
        try {
            str = (String) Class.forName(String.valueOf(getClass().getPackage().getName()).concat(".NativeProxy")).getDeclaredField("PROXY_LIBRARY").get(null);
        } catch (Exception unused) {
            str = "gvr";
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() != 0) {
            "Loading native library ".concat(strValueOf);
        }
        System.loadLibrary(str);
        nativeSetApplicationState(getClass().getClassLoader(), context.getApplicationContext());
        com.google.vr.cardboard.c cVar = new com.google.vr.cardboard.c(context, this);
        this.f127473h = cVar;
        u uVar = new u(context);
        this.f127474i = uVar;
        uVar.setPresentationView(cVar);
        this.f127466a = new h();
        this.f127475j = uVar.getUiLayout();
        GvrApi gvrApi = uVar.getGvrApi();
        this.f127476k = gvrApi;
        this.f127480o = nativeInit(gvrApi.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.f127480o == 0) {
            throw new IllegalStateException("GvrView has already been shut down.");
        }
    }

    private static Display B(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Runnable runnable) {
        this.f127473h.q(runnable);
    }

    private void D() {
        Runnable runnable = this.f127471f;
        if (runnable != null) {
            v.a(runnable);
        }
    }

    private void E(com.google.vr.sdk.base.g gVar) {
        this.f127475j.j(new com.google.vr.sdk.base.g(gVar).j());
        C(new f(gVar));
    }

    private void F(m mVar) {
        C(new g(new m(mVar)));
    }

    private native void nativeDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetCurrentEyeParams(long j10, HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    private native float nativeGetNeckModelFactor(long j10);

    private native long nativeInit(long j10);

    private native void nativeLogEvent(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDrawFrame(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceChanged(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceCreated(long j10);

    private static native long nativeSetApplicationState(ClassLoader classLoader, Context context);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDepthStencilFormat(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDistortionCorrectionEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDistortionCorrectionScale(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetGvrViewerParams(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetMultisampling(long j10, int i10);

    private native void nativeSetNeckModelEnabled(long j10, boolean z10);

    private native void nativeSetNeckModelFactor(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetRenderer(long j10, GvrView.Renderer renderer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetScreenParams(long j10, int i10, int i11, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetStereoModeEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetStereoRenderer(long j10, GvrView.StereoRenderer stereoRenderer);

    private native void nativeUndistortTexture(long j10, int i10);

    @UsedByNative
    private void onCardboardBack() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UsedByNative
    public void onCardboardTrigger() {
        Runnable runnable = this.f127470e;
        if (runnable != null) {
            v.a(runnable);
        }
    }

    @Override // com.google.vr.sdk.base.b
    public GvrApi A1() {
        return this.f127476k;
    }

    @Override // com.google.vr.sdk.base.b
    public void B1(boolean z10) {
        nativeSetNeckModelEnabled(this.f127480o, z10);
    }

    @Override // com.google.vr.sdk.base.b
    public void C1(boolean z10) {
        A();
        this.f127479n = z10;
        C(new a(z10));
    }

    @Override // com.google.vr.sdk.base.b
    public void D1(GvrView.StereoRenderer stereoRenderer) {
        this.f127466a.o(stereoRenderer);
        this.f127473h.setRenderer(this.f127466a);
    }

    @Override // com.google.vr.sdk.base.b
    public void E1(float f10) {
        nativeSetNeckModelFactor(this.f127480o, f10);
    }

    @Override // com.google.vr.sdk.base.b
    public float F1() {
        return nativeGetNeckModelFactor(this.f127480o);
    }

    @Override // com.google.vr.sdk.base.b
    public boolean G1() {
        return this.f127479n;
    }

    @Override // com.google.vr.sdk.base.b
    public void N(boolean z10) {
        this.f127478m = z10;
        this.f127466a.q(z10);
    }

    @Override // com.google.vr.sdk.base.b
    public boolean a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || this.f127470e == null) {
            return false;
        }
        onCardboardTrigger();
        return true;
    }

    @Override // com.google.vr.cardboard.c.a
    public void b() {
        if (this.f127468c == null) {
            this.f127468c = new CountDownLatch(1);
            this.f127466a.r();
            try {
                this.f127468c.await();
            } catch (InterruptedException e10) {
                String strValueOf = String.valueOf(e10.toString());
                if (strValueOf.length() != 0) {
                    "Interrupted during shutdown: ".concat(strValueOf);
                }
            }
            this.f127468c = null;
        }
    }

    @Override // com.google.vr.sdk.base.b
    public void d() {
        A();
        this.f127476k.M();
        this.f127467b.f();
        this.f127473h.m();
        this.f127474i.f();
    }

    @Override // com.google.vr.sdk.base.b
    public void d1(boolean z10) {
        this.f127475j.h(z10);
    }

    @Override // com.google.vr.sdk.base.b
    public void e1() {
        this.f127474i.c(new e());
    }

    @Override // com.google.vr.sdk.base.b
    public float f1() {
        return j1().h();
    }

    protected void finalize() throws Throwable {
        try {
            long j10 = this.f127480o;
            if (j10 != 0) {
                nativeDestroy(j10);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.vr.sdk.base.b
    public z g1() {
        return this.f127473h;
    }

    @Override // com.google.vr.sdk.base.b
    public View getRootView() {
        return this.f127474i;
    }

    @Override // com.google.vr.sdk.base.b
    public void h1(float f10) {
        A();
        C(new b(f10));
    }

    @Override // com.google.vr.sdk.base.b
    public m i1() {
        return this.f127467b.e().b();
    }

    @Override // com.google.vr.sdk.base.b
    public com.google.vr.sdk.base.g j1() {
        return this.f127467b.e().a();
    }

    @Override // com.google.vr.sdk.base.b
    public void k1(int i10) {
        A();
        C(new c(i10));
    }

    @Override // com.google.vr.sdk.base.b
    public void l() {
        A();
        this.f127474i.g();
        this.f127473h.o();
        this.f127467b.g();
        F(i1());
        E(j1());
        this.f127476k.W();
    }

    @Override // com.google.vr.sdk.base.b
    public void l1(Runnable runnable) {
        this.f127471f = runnable;
    }

    @Override // com.google.vr.sdk.base.b
    public boolean m1() {
        return this.f127478m;
    }

    @Override // com.google.vr.sdk.base.b
    public void n1(Runnable runnable) {
        this.f127475j.i(runnable);
    }

    @Override // com.google.vr.sdk.base.b
    public void o1(Runnable runnable) {
        this.f127470e = runnable;
    }

    @Override // com.google.vr.sdk.base.b
    public void onBackPressed() {
        this.f127474i.e();
    }

    @Override // com.google.vr.sdk.base.b
    public boolean p1(boolean z10) {
        return this.f127474i.h(z10);
    }

    @Override // com.google.vr.sdk.base.b
    public void q1(Runnable runnable) {
        this.f127475j.c(runnable);
    }

    @Override // com.google.vr.sdk.base.b
    public void r1() {
        this.f127476k.P();
    }

    @Override // com.google.vr.sdk.base.b
    public com.google.vr.sdk.base.h s1() {
        return this.f127467b.e();
    }

    @Override // com.google.vr.sdk.base.b
    public void shutdown() {
        if (this.f127480o != 0) {
            this.f127467b.a();
            this.f127474i.k();
            nativeDestroy(this.f127480o);
            this.f127480o = 0L;
        }
    }

    @Override // com.google.vr.sdk.base.b
    public void t1(m mVar) {
        if (this.f127467b.i(mVar)) {
            F(i1());
        }
    }

    @Override // com.google.vr.sdk.base.b
    public void u1(GvrView.Renderer renderer) {
        this.f127466a.n(renderer);
        this.f127473h.setRenderer(this.f127466a);
    }

    @Override // com.google.vr.sdk.base.b
    public boolean v1() {
        return this.f127474i.getGvrApi().l();
    }

    @Override // com.google.vr.sdk.base.b
    public void w1() {
        this.f127476k.U();
    }

    @Override // com.google.vr.sdk.base.b
    public void x1(int i10) {
        A();
        if (!com.google.vr.ndk.base.d.d(i10)) {
            throw new IllegalArgumentException("Invalid depth-stencil format.");
        }
        C(new d(i10));
    }

    @Override // com.google.vr.sdk.base.b
    public void y1(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5) {
        this.f127466a.m(headTransform, eye, eye2, eye3, eye4, eye5);
    }

    @Override // com.google.vr.sdk.base.b
    public void z1(com.google.vr.sdk.base.g gVar) {
        if (this.f127467b.h(gVar)) {
            E(j1());
        }
    }
}
