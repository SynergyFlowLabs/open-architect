package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61598h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61599i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f61600j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f61601k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f61602l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f61603m = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f61604n = 12992;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f61605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f61606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final b f61607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLDisplay f61608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLContext f61609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLSurface f61610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private SurfaceTexture f61611g;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a();
    }

    public q(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws t.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f61603m, 0, eGLConfigArr, 0, 1, iArr, 0);
        t.g(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, k1.S("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws t.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f61604n, 1, 12344}, 0);
        t.g(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws t.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, f61604n, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            t.g(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        t.g(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void d() {
        b bVar = this.f61607c;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static void e(int[] iArr) throws t.a {
        GLES20.glGenTextures(1, iArr, 0);
        t.f();
    }

    private static EGLDisplay f() throws t.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        t.g(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int i10 = 4 << 2;
        int[] iArr = new int[2];
        t.g(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) androidx.media3.common.util.a.g(this.f61611g);
    }

    public void h(int i10) throws t.a {
        EGLDisplay eGLDisplayF = f();
        this.f61608d = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f61608d, eGLConfigA, i10);
        this.f61609e = eGLContextB;
        this.f61610f = c(this.f61608d, eGLConfigA, eGLContextB, i10);
        e(this.f61606b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f61606b[0]);
        this.f61611g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f61605a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f61611g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f61606b, 0);
            }
            EGLDisplay eGLDisplay = this.f61608d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f61608d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f61610f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f61608d, this.f61610f);
            }
            EGLContext eGLContext = this.f61609e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f61608d, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f61608d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f61608d);
            }
            this.f61608d = null;
            this.f61609e = null;
            this.f61610f = null;
            this.f61611g = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f61608d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f61608d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f61610f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f61608d, this.f61610f);
            }
            EGLContext eGLContext2 = this.f61609e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f61608d, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f61608d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f61608d);
            }
            this.f61608d = null;
            this.f61609e = null;
            this.f61610f = null;
            this.f61611g = null;
            throw th2;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f61605a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f61611g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public q(Handler handler, @androidx.annotation.p0 b bVar) {
        this.f61605a = handler;
        this.f61607c = bVar;
        this.f61606b = new int[1];
    }
}
