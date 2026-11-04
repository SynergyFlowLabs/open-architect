package com.planner5d.library.widget.editor.editor3d.compatibility;

import android.graphics.SurfaceTexture;
import androidx.compose.runtime.internal.w0;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d extends Thread {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f255396j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f255397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SurfaceTexture f255398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f255399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Pair<Integer, Integer> f255400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private EGLSurface f255401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final EGL10 f255402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final EGLDisplay f255403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final EGLConfig f255404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final EGLContext f255405i;

    public d(@NotNull c glState, @NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(glState, "glState");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f255397a = glState;
        this.f255398b = surface;
        EGL egl = EGLContext.getEGL();
        Intrinsics.checkNotNull(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGL10 egl10 = (EGL10) egl;
        this.f255402f = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        Intrinsics.checkNotNullExpressionValue(eGLDisplayEglGetDisplay, "also(...)");
        this.f255403g = eGLDisplayEglGetDisplay;
        EGLConfig eGLConfigChooseConfig = glState.a().chooseConfig(egl10, eGLDisplayEglGetDisplay);
        Intrinsics.checkNotNullExpressionValue(eGLConfigChooseConfig, "chooseConfig(...)");
        this.f255404h = eGLConfigChooseConfig;
        EGLContext eGLContextCreateContext = glState.b().createContext(egl10, eGLDisplayEglGetDisplay, eGLConfigChooseConfig);
        Intrinsics.checkNotNullExpressionValue(eGLContextCreateContext, "createContext(...)");
        this.f255405i = eGLContextCreateContext;
    }

    private final void a() {
        EGLSurface eGLSurface = this.f255401e;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != null && !Intrinsics.areEqual(eGLSurface, eGLSurface2)) {
            this.f255402f.eglMakeCurrent(this.f255403g, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f255402f.eglDestroySurface(this.f255403g, this.f255401e);
            this.f255401e = null;
        }
        try {
            EGLSurface eGLSurfaceEglCreateWindowSurface = this.f255402f.eglCreateWindowSurface(this.f255403g, this.f255404h, this.f255398b, null);
            this.f255401e = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface == null || Intrinsics.areEqual(eGLSurfaceEglCreateWindowSurface, eGLSurface2)) {
                return;
            }
            EGL10 egl10 = this.f255402f;
            EGLDisplay eGLDisplay = this.f255403g;
            EGLSurface eGLSurface3 = this.f255401e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, this.f255405i);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void b() {
        this.f255397a.b().destroyContext(this.f255402f, this.f255403g, this.f255405i);
        this.f255402f.eglTerminate(this.f255403g);
        this.f255402f.eglDestroySurface(this.f255403g, this.f255401e);
    }

    private final void d(GL10 gl10) {
        if (!Intrinsics.areEqual(this.f255405i, this.f255402f.eglGetCurrentContext()) || !Intrinsics.areEqual(this.f255401e, this.f255402f.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f255402f;
            EGLDisplay eGLDisplay = this.f255403g;
            EGLSurface eGLSurface = this.f255401e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f255405i);
        }
        Pair<Integer, Integer> pair = this.f255400d;
        if (pair != null) {
            a();
            this.f255397a.c().onSurfaceChanged(gl10, pair.getFirst().intValue(), pair.getSecond().intValue());
            this.f255400d = null;
        }
        this.f255397a.c().onDrawFrame(gl10);
        this.f255402f.eglSwapBuffers(this.f255403g, this.f255401e);
    }

    public final void c(int i10, int i11) {
        this.f255400d = TuplesKt.to(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final void e() {
        this.f255399c = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        a();
        try {
            EGL10 egl10 = this.f255402f;
            EGLDisplay eGLDisplay = this.f255403g;
            EGLSurface eGLSurface = this.f255401e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f255405i);
            GL gl2 = this.f255405i.getGL();
            Intrinsics.checkNotNull(gl2, "null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10");
            GL10 gl10 = (GL10) gl2;
            this.f255397a.c().onSurfaceCreated(gl10, this.f255404h);
            Pair<Integer, Integer> pair = this.f255400d;
            if (pair != null) {
                this.f255397a.c().onSurfaceChanged(gl10, pair.getFirst().intValue(), pair.getSecond().intValue());
                this.f255400d = null;
            }
            while (!this.f255399c) {
                d(gl10);
            }
        } finally {
            b();
        }
    }
}
