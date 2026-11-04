package com.planner5d.library.engine.libgdx.compatibility;

import android.opengl.GLSurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.badlogic.gdx.backends.android.a implements vb.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile EnumC1544b f160778t;

    private static class a implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f160779b = 12440;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicReference<com.badlogic.gdx.backends.android.a> f160780a;

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{f160779b, 2, 12344});
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            com.badlogic.gdx.backends.android.a andSet = this.f160780a.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    throw new RuntimeException("eglDestroyContext failed: " + egl10.eglGetError());
                }
            }
        }

        @l0
        private a(com.badlogic.gdx.backends.android.a aVar) {
            this.f160780a = new AtomicReference<>(aVar);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.engine.libgdx.compatibility.b$b, reason: collision with other inner class name */
    enum EnumC1544b {
        Unknown,
        Resumed,
        Paused
    }

    public b(vb.a aVar, vb.b bVar, @NonNull vb.g gVar) {
        super(aVar, bVar);
        this.f160778t = EnumC1544b.Unknown;
        View viewA = gVar.a(aVar, bVar, g(), new a(this), this);
        this.f89747a = viewA;
        viewA.setFocusable(true);
        this.f89747a.setFocusableInTouchMode(true);
    }

    @Override // com.badlogic.gdx.backends.android.a
    protected GLSurfaceView.EGLConfigChooser g() {
        return new e(super.g(), this.f89762s);
    }

    @Override // com.badlogic.gdx.backends.android.a, vb.c
    @l0
    public void l() {
        super.l();
        EnumC1544b enumC1544b = this.f160778t;
        EnumC1544b enumC1544b2 = EnumC1544b.Resumed;
        if (enumC1544b == enumC1544b2 || this.f160778t == EnumC1544b.Paused) {
            p();
        }
        this.f160778t = enumC1544b2;
    }

    @l0
    protected void o() {
        if (this.f160778t == EnumC1544b.Resumed) {
            this.f160778t = EnumC1544b.Paused;
            pause();
        }
    }

    @androidx.annotation.d
    void q() {
        if (this.f160778t == EnumC1544b.Resumed) {
            a();
        }
    }
}
