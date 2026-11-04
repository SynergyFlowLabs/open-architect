package androidx.media2.exoplayer.external.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57291d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57292e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57293f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57294g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f57295h = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f57296i = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f57297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f57298k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f57299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<? extends e> f57300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f57301c;

    public interface b<T extends e> {
        c d(T loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount);

        void t(T loadable, long elapsedRealtimeMs, long loadDurationMs);

        void u(T loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f57303b;

        public boolean c() {
            int i10 = this.f57302a;
            return i10 == 0 || i10 == 1;
        }

        private c(int type, long retryDelayMillis) {
            this.f57302a = type;
            this.f57303b = retryDelayMillis;
        }
    }

    @e.a({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f57304k = "LoadTask";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f57305l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f57306m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f57307n = 2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f57308o = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f57309s = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f57311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f57312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private b<T> f57313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f57314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f57315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile Thread f57316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f57317h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f57318i;

        public d(Looper looper, T loadable, b<T> callback, int defaultMinRetryCount, long startTimeMs) {
            super(looper);
            this.f57311b = loadable;
            this.f57313d = callback;
            this.f57310a = defaultMinRetryCount;
            this.f57312c = startTimeMs;
        }

        private void b() {
            this.f57314e = null;
            g0.this.f57299a.execute(g0.this.f57300b);
        }

        private void c() {
            g0.this.f57300b = null;
        }

        private long d() {
            return Math.min((this.f57315f - 1) * 1000, 5000);
        }

        public void a(boolean released) {
            this.f57318i = released;
            this.f57314e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!released) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f57317h = true;
                this.f57311b.b();
                if (this.f57316g != null) {
                    this.f57316g.interrupt();
                }
            }
            if (released) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f57313d.u(this.f57311b, jElapsedRealtime, jElapsedRealtime - this.f57312c, true);
                this.f57313d = null;
            }
        }

        public void e(int minRetryCount) throws IOException {
            IOException iOException = this.f57314e;
            if (iOException != null && this.f57315f > minRetryCount) {
                throw iOException;
            }
        }

        public void f(long delayMillis) {
            androidx.media2.exoplayer.external.util.a.i(g0.this.f57300b == null);
            g0.this.f57300b = this;
            if (delayMillis > 0) {
                sendEmptyMessageDelayed(0, delayMillis);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (this.f57318i) {
                return;
            }
            int i10 = msg.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) msg.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f57312c;
            if (this.f57317h) {
                this.f57313d.u(this.f57311b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = msg.what;
            if (i11 == 1) {
                this.f57313d.u(this.f57311b, jElapsedRealtime, j10, false);
                return;
            }
            if (i11 == 2) {
                try {
                    this.f57313d.t(this.f57311b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    androidx.media2.exoplayer.external.util.p.e(f57304k, "Unexpected exception handling load completed", e10);
                    g0.this.f57301c = new i(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) msg.obj;
            this.f57314e = iOException;
            int i12 = this.f57315f + 1;
            this.f57315f = i12;
            c cVarD = this.f57313d.d(this.f57311b, jElapsedRealtime, j10, iOException, i12);
            if (cVarD.f57302a == 3) {
                g0.this.f57301c = this.f57314e;
            } else if (cVarD.f57302a != 2) {
                if (cVarD.f57302a == 1) {
                    this.f57315f = 1;
                }
                f(cVarD.f57303b != -9223372036854775807L ? cVarD.f57303b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f57316g = Thread.currentThread();
                if (!this.f57317h) {
                    String simpleName = this.f57311b.getClass().getSimpleName();
                    androidx.media2.exoplayer.external.util.l0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f57311b.a();
                        androidx.media2.exoplayer.external.util.l0.c();
                    } catch (Throwable th2) {
                        androidx.media2.exoplayer.external.util.l0.c();
                        throw th2;
                    }
                }
                if (this.f57318i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f57318i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                androidx.media2.exoplayer.external.util.p.e(f57304k, "Unexpected error loading stream", e11);
                if (!this.f57318i) {
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (InterruptedException unused) {
                androidx.media2.exoplayer.external.util.a.i(this.f57317h);
                if (this.f57318i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e12) {
                androidx.media2.exoplayer.external.util.p.e(f57304k, "Unexpected exception loading stream", e12);
                if (this.f57318i) {
                    return;
                }
                obtainMessage(3, new i(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                androidx.media2.exoplayer.external.util.p.e(f57304k, "OutOfMemory error loading stream", e13);
                if (this.f57318i) {
                    return;
                }
                obtainMessage(3, new i(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void a() throws InterruptedException, IOException;

        void b();
    }

    public interface f {
        void j();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f57320a;

        public g(f callback) {
            this.f57320a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57320a.j();
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface h {
    }

    public static final class i extends IOException {
        public i(Throwable cause) {
            String simpleName = cause.getClass().getSimpleName();
            String message = cause.getMessage();
            StringBuilder sb2 = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb2.append("Unexpected ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(message);
            super(sb2.toString(), cause);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f57297j = new c(2, j10);
        f57298k = new c(3, j10);
    }

    public g0(String threadName) {
        this.f57299a = androidx.media2.exoplayer.external.util.q0.w0(threadName);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // androidx.media2.exoplayer.external.upstream.h0
    public void a() throws IOException {
        b(Integer.MIN_VALUE);
    }

    @Override // androidx.media2.exoplayer.external.upstream.h0
    public void b(int minRetryCount) throws IOException {
        IOException iOException = this.f57301c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f57300b;
        if (dVar != null) {
            if (minRetryCount == Integer.MIN_VALUE) {
                minRetryCount = dVar.f57310a;
            }
            dVar.e(minRetryCount);
        }
    }

    public void g() {
        this.f57300b.a(false);
    }

    public boolean i() {
        return this.f57300b != null;
    }

    public void j() {
        k(null);
    }

    public void k(@androidx.annotation.p0 f callback) {
        d<? extends e> dVar = this.f57300b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (callback != null) {
            this.f57299a.execute(new g(callback));
        }
        this.f57299a.shutdown();
    }

    public <T extends e> long l(T loadable, b<T> callback, int defaultMinRetryCount) {
        Looper looperMyLooper = Looper.myLooper();
        androidx.media2.exoplayer.external.util.a.i(looperMyLooper != null);
        this.f57301c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looperMyLooper, loadable, callback, defaultMinRetryCount, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
