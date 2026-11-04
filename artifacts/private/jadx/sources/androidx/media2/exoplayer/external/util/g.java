package androidx.media2.exoplayer.external.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@e.b(17)
@b1({b1.a.LIBRARY_GROUP})
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57548h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f57549i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f57550j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f57551k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f57552l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f57553m = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f57554n = 12992;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f57555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f57556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final d f57557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLDisplay f57558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLContext f57559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLSurface f57560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private SurfaceTexture f57561g;

    public static final class b extends RuntimeException {
        private b(String msg) {
            super(msg);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void a();
    }

    public g(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay display) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(display, f57553m, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(q0.B("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext b(EGLDisplay display, EGLConfig config, int secureMode) {
        int[] iArr;
        if (secureMode == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            int i10 = 7 | 4;
            iArr = new int[]{12440, 2, f57554n, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay display, EGLConfig config, EGLContext context, int secureMode) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (secureMode == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(display, config, secureMode == 2 ? new int[]{12375, 1, 12374, 1, f57554n, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(display, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, context)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private void d() {
        d dVar = this.f57557c;
        if (dVar != null) {
            dVar.a();
        }
    }

    private static void e(int[] textureIdHolder) {
        GLES20.glGenTextures(1, textureIdHolder, 0);
        m.b();
    }

    private static EGLDisplay f() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) androidx.media2.exoplayer.external.util.a.g(this.f57561g);
    }

    public void h(int secureMode) {
        EGLDisplay eGLDisplayF = f();
        this.f57558d = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f57558d, eGLConfigA, secureMode);
        this.f57559e = eGLContextB;
        this.f57560f = c(this.f57558d, eGLConfigA, eGLContextB, secureMode);
        e(this.f57556b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f57556b[0]);
        this.f57561g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f57555a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f57561g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f57556b, 0);
            }
            EGLDisplay eGLDisplay = this.f57558d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f57558d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f57560f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f57558d, this.f57560f);
            }
            EGLContext eGLContext = this.f57559e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f57558d, eGLContext);
            }
            if (q0.f57626a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f57558d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f57558d);
            }
            this.f57558d = null;
            this.f57559e = null;
            this.f57560f = null;
            this.f57561g = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f57558d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f57558d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f57560f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f57558d, this.f57560f);
            }
            EGLContext eGLContext2 = this.f57559e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f57558d, eGLContext2);
            }
            if (q0.f57626a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f57558d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f57558d);
            }
            this.f57558d = null;
            this.f57559e = null;
            this.f57560f = null;
            this.f57561g = null;
            throw th2;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f57555a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f57561g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public g(Handler handler, @androidx.annotation.p0 d callback) {
        this.f57555a = handler;
        this.f57557c = callback;
        this.f57556b = new int[1];
    }
}
