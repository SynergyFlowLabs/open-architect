package com.google.vr.cardboard;

import android.opengl.GLSurfaceView;
import android.os.Build;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes5.dex */
public class h implements GLSurfaceView.EGLContextFactory, GLSurfaceView.EGLWindowSurfaceFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f126828a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f126829b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f126830c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f126831d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f126832e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLContext f126833f = EGL10.EGL_NO_CONTEXT;

    private boolean g(EGL10 egl10, EGLDisplay eGLDisplay) {
        return egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_EXT_protected_content");
    }

    public void a(int i10) {
        this.f126832e = i10;
    }

    public void b(boolean z10) {
        this.f126831d = z10;
    }

    public void c(EGLContext eGLContext) {
        this.f126833f = eGLContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        IntBuffer intBufferAllocate = IntBuffer.allocate(10);
        intBufferAllocate.put(12440);
        intBufferAllocate.put(this.f126832e);
        if (this.f126830c) {
            intBufferAllocate.put(12540);
            intBufferAllocate.put(1);
        }
        if (this.f126828a && !Build.FINGERPRINT.contains("generic_x86")) {
            intBufferAllocate.put(12544);
            intBufferAllocate.put(12545);
        }
        if (this.f126829b && g(egl10, eGLDisplay)) {
            intBufferAllocate.put(12992);
            intBufferAllocate.put(1);
        }
        if (!this.f126831d && egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_KHR_create_context_no_error")) {
            intBufferAllocate.put(12723);
            intBufferAllocate.put(1);
        }
        while (intBufferAllocate.hasRemaining()) {
            intBufferAllocate.put(12344);
        }
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f126833f, intBufferAllocate.array());
        if ((eGLContextEglCreateContext != null && eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) || this.f126832e <= 2) {
            return eGLContextEglCreateContext;
        }
        intBufferAllocate.array()[1] = 2;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f126833f, intBufferAllocate.array());
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (this.f126829b && g(egl10, eGLDisplay)) ? new int[]{12992, 1, 12344} : null);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public void d(boolean z10) {
        this.f126830c = z10;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    public void e(boolean z10) {
        this.f126828a = z10;
    }

    public void f(boolean z10) {
        this.f126829b = z10;
    }
}
