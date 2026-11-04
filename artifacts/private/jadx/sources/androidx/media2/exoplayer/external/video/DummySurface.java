package androidx.media2.exoplayer.external.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@e.b(17)
@b1({b1.a.LIBRARY_GROUP})
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f57735d = "DummySurface";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f57736e = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f57737f = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f57738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f57739h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f57741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57742c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f57743f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f57744g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media2.exoplayer.external.util.g f57745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f57746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Error f57747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private RuntimeException f57748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private DummySurface f57749e;

        public b() {
            super("dummySurface");
        }

        private void b(int secureMode) {
            androidx.media2.exoplayer.external.util.a.g(this.f57745a);
            this.f57745a.h(secureMode);
            this.f57749e = new DummySurface(this, this.f57745a.g(), secureMode != 0);
        }

        private void d() {
            androidx.media2.exoplayer.external.util.a.g(this.f57745a);
            this.f57745a.i();
        }

        public DummySurface a(int secureMode) {
            boolean z10;
            start();
            this.f57746b = new Handler(getLooper(), this);
            this.f57745a = new androidx.media2.exoplayer.external.util.g(this.f57746b);
            synchronized (this) {
                try {
                    z10 = false;
                    this.f57746b.obtainMessage(1, secureMode, 0).sendToTarget();
                    while (this.f57749e == null && this.f57748d == null && this.f57747c == null) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f57748d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f57747c;
            if (error == null) {
                return (DummySurface) androidx.media2.exoplayer.external.util.a.g(this.f57749e);
            }
            throw error;
        }

        public void c() {
            androidx.media2.exoplayer.external.util.a.g(this.f57746b);
            this.f57746b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            int i10 = msg.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            androidx.media2.exoplayer.external.util.p.e(DummySurface.f57735d, "Failed to release dummy surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    quit();
                    return true;
                }
                try {
                    b(msg.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    androidx.media2.exoplayer.external.util.p.e(DummySurface.f57735d, "Failed to initialize dummy surface", e10);
                    this.f57747c = e10;
                    synchronized (this) {
                        try {
                            notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (RuntimeException e11) {
                    androidx.media2.exoplayer.external.util.p.e(DummySurface.f57735d, "Failed to initialize dummy surface", e11);
                    this.f57748d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th4) {
                synchronized (this) {
                    try {
                        notify();
                        throw th4;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
    }

    private static void a() {
        if (q0.f57626a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @e.b(24)
    private static int b(Context context) {
        String strEglQueryString;
        int i10 = q0.f57626a;
        if (i10 < 26 && ("samsung".equals(q0.f57628c) || "XT1650".equals(q0.f57629d))) {
            return 0;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f57736e)) {
            return strEglQueryString.contains(f57737f) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        try {
            if (!f57739h) {
                f57738g = q0.f57626a < 24 ? 0 : b(context);
                f57739h = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f57738g != 0;
    }

    public static DummySurface e(Context context, boolean secure) {
        a();
        androidx.media2.exoplayer.external.util.a.i(!secure || c(context));
        return new b().a(secure ? f57738g : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f57741b) {
            try {
                if (!this.f57742c) {
                    this.f57741b.c();
                    this.f57742c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private DummySurface(b thread, SurfaceTexture surfaceTexture, boolean secure) {
        super(surfaceTexture);
        this.f57741b = thread;
        this.f57740a = secure;
    }
}
