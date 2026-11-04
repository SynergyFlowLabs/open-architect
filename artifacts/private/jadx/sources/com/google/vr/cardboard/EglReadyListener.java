package com.google.vr.cardboard;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class EglReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile EGLContext f126768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f126769b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile a f126772e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f126770c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f126771d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f126773f = new Object();

    public interface a {
        void a();
    }

    public static int e(String str) {
        int iIndexOf;
        int numericValue;
        if (str != null && (iIndexOf = str.indexOf(46)) > 0 && (numericValue = Character.getNumericValue(str.charAt(iIndexOf - 1))) >= 0) {
            return numericValue;
        }
        return 2;
    }

    public void a() {
        synchronized (this.f126771d) {
            try {
                this.f126768a = null;
                this.f126770c = 2;
                this.f126769b = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public EGLContext b() {
        return this.f126768a;
    }

    public int c() {
        return this.f126769b;
    }

    public int d() {
        return this.f126770c;
    }

    public void f() {
        synchronized (this.f126773f) {
            this.f126772e = null;
        }
    }

    public void g(a aVar) {
        synchronized (this.f126773f) {
            try {
                this.f126772e = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @UsedByNative
    public void onEglReady() {
        synchronized (this.f126771d) {
            try {
                this.f126768a = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
                if (this.f126768a != null) {
                    EGLContext eGLContext = this.f126768a;
                    EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
                }
                this.f126770c = e(GLES20.glGetString(7938));
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(33310, iArr, 0);
                GLES20.glGetError();
                this.f126769b = iArr[0];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f126773f) {
            try {
                if (this.f126772e != null) {
                    this.f126772e.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
