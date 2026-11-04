package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f66227d = "PlaceholderSurface";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f66228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f66229f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f66231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66232c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f66233f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f66234g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.q f66235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f66236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Error f66237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private RuntimeException f66238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private PlaceholderSurface f66239e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws androidx.media3.common.util.t.a {
            androidx.media3.common.util.a.g(this.f66235a);
            this.f66235a.h(i10);
            this.f66239e = new PlaceholderSurface(this, this.f66235a.g(), i10 != 0);
        }

        private void d() {
            androidx.media3.common.util.a.g(this.f66235a);
            this.f66235a.i();
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f66236b = new Handler(getLooper(), this);
            this.f66235a = new androidx.media3.common.util.q(this.f66236b);
            synchronized (this) {
                try {
                    z10 = false;
                    this.f66236b.obtainMessage(1, i10, 0).sendToTarget();
                    while (this.f66239e == null && this.f66238d == null && this.f66237c == null) {
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
            RuntimeException runtimeException = this.f66238d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f66237c;
            if (error == null) {
                return (PlaceholderSurface) androidx.media3.common.util.a.g(this.f66239e);
            }
            throw error;
        }

        public void c() {
            androidx.media3.common.util.a.g(this.f66236b);
            this.f66236b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            androidx.media3.common.util.z.e(PlaceholderSurface.f66227d, "Failed to release placeholder surface", th2);
                        } catch (Throwable th3) {
                            quit();
                            throw th3;
                        }
                    }
                    quit();
                    return true;
                }
                try {
                    try {
                        try {
                            b(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e10) {
                            androidx.media3.common.util.z.e(PlaceholderSurface.f66227d, "Failed to initialize placeholder surface", e10);
                            this.f66238d = e10;
                            synchronized (this) {
                                try {
                                    notify();
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                    } catch (androidx.media3.common.util.t.a e11) {
                        androidx.media3.common.util.z.e(PlaceholderSurface.f66227d, "Failed to initialize placeholder surface", e11);
                        this.f66238d = new IllegalStateException(e11);
                        synchronized (this) {
                            try {
                                notify();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Error e12) {
                    androidx.media3.common.util.z.e(PlaceholderSurface.f66227d, "Failed to initialize placeholder surface", e12);
                    this.f66237c = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th6) {
                synchronized (this) {
                    notify();
                    throw th6;
                }
            }
        }
    }

    private static int a(Context context) {
        if (androidx.media3.common.util.t.V(context)) {
            return androidx.media3.common.util.t.W() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        try {
            z10 = true;
            if (!f66229f) {
                f66228e = a(context);
                f66229f = true;
            }
            if (f66228e == 0) {
                z10 = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public static PlaceholderSurface c(Context context, boolean z10) {
        androidx.media3.common.util.a.i(!z10 || b(context));
        return new b().a(z10 ? f66228e : 0);
    }

    @z7.m(imports = {"androidx.media3.exoplayer.video.PlaceholderSurface"}, replacement = "PlaceholderSurface.newInstance(context, secure)")
    @Deprecated
    public static PlaceholderSurface e(Context context, boolean z10) {
        return c(context, z10);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f66231b) {
            try {
                if (!this.f66232c) {
                    this.f66231b.c();
                    this.f66232c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f66231b = bVar;
        this.f66230a = z10;
    }
}
