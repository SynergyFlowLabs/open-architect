package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.common.util.z0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f66123d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f66124e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66125f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f66126g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f66127h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f66128i = i(false, -9223372036854775807L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f66129j = i(true, -9223372036854775807L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f66130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f66131l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.util.c f66132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private d<? extends e> f66133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private IOException f66134c;

    public interface b<T extends e> {
        c n(T t10, long j10, long j11, IOException iOException, int i10);

        default void q(T t10, long j10, long j11, int i10) {
        }

        void s(T t10, long j10, long j11, boolean z10);

        void w(T t10, long j10, long j11);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f66135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f66136b;

        public boolean c() {
            int i10 = this.f66135a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f66135a = i10;
            this.f66136b = j10;
        }
    }

    @e.a({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f66137k = "LoadTask";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f66138l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f66139m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f66140n = 3;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f66141o = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f66143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f66144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private b<T> f66145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private IOException f66146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f66147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Thread f66148g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f66149h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f66150i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f66143b = t10;
            this.f66145d = bVar;
            this.f66142a = i10;
            this.f66144c = j10;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) androidx.media3.common.util.a.g(this.f66145d)).q(this.f66143b, jElapsedRealtime, jElapsedRealtime - this.f66144c, this.f66147f);
            this.f66146e = null;
            o.this.f66132a.execute((Runnable) androidx.media3.common.util.a.g(o.this.f66133b));
        }

        private void c() {
            o.this.f66133b = null;
        }

        private long d() {
            return Math.min((this.f66147f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f66150i = z10;
            this.f66146e = null;
            if (hasMessages(1)) {
                this.f66149h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f66149h = true;
                        this.f66143b.b();
                        Thread thread = this.f66148g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) androidx.media3.common.util.a.g(this.f66145d)).s(this.f66143b, jElapsedRealtime, jElapsedRealtime - this.f66144c, true);
                this.f66145d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f66146e;
            if (iOException != null && this.f66147f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            androidx.media3.common.util.a.i(o.this.f66133b == null);
            o.this.f66133b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f66150i) {
                int i10 = message.what;
                if (i10 == 1) {
                    b();
                    return;
                }
                if (i10 == 4) {
                    throw ((Error) message.obj);
                }
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = jElapsedRealtime - this.f66144c;
                b bVar = (b) androidx.media3.common.util.a.g(this.f66145d);
                if (this.f66149h) {
                    bVar.s(this.f66143b, jElapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 2) {
                    try {
                        bVar.w(this.f66143b, jElapsedRealtime, j10);
                        return;
                    } catch (RuntimeException e10) {
                        z.e(f66137k, "Unexpected exception handling load completed", e10);
                        o.this.f66134c = new h(e10);
                        return;
                    }
                }
                if (i11 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f66146e = iOException;
                    int i12 = this.f66147f + 1;
                    this.f66147f = i12;
                    c cVarN = bVar.n(this.f66143b, jElapsedRealtime, j10, iOException, i12);
                    if (cVarN.f66135a == 3) {
                        o.this.f66134c = this.f66146e;
                    } else if (cVarN.f66135a != 2) {
                        if (cVarN.f66135a == 1) {
                            this.f66147f = 1;
                        }
                        f(cVarN.f66136b != -9223372036854775807L ? cVarN.f66136b : d());
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f66149h;
                    this.f66148g = Thread.currentThread();
                }
                if (!z10) {
                    z0.a("load:" + this.f66143b.getClass().getSimpleName());
                    try {
                        this.f66143b.a();
                        z0.b();
                    } catch (Throwable th2) {
                        z0.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f66148g = null;
                    Thread.interrupted();
                }
                if (this.f66150i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f66150i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (OutOfMemoryError e11) {
                if (this.f66150i) {
                    return;
                }
                z.e(f66137k, "OutOfMemory error loading stream", e11);
                obtainMessage(3, new h(e11)).sendToTarget();
            } catch (Error e12) {
                if (!this.f66150i) {
                    z.e(f66137k, "Unexpected error loading stream", e12);
                    obtainMessage(4, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (this.f66150i) {
                    return;
                }
                z.e(f66137k, "Unexpected exception loading stream", e13);
                obtainMessage(3, new h(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void a() throws IOException;

        void b();
    }

    public interface f {
        void j();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f66152a;

        public g(f fVar) {
            this.f66152a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66152a.j();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f66130k = new c(2, j10);
        f66131l = new c(3, j10);
    }

    public o(String str) {
        this(androidx.media3.exoplayer.util.c.y3(k1.E1(f66123d + str), new androidx.media3.common.util.o() { // from class: androidx.media3.exoplayer.upstream.n
            @Override // androidx.media3.common.util.o
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c i(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public void a() throws IOException {
        b(Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public void b(int i10) throws IOException {
        IOException iOException = this.f66134c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f66133b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f66142a;
            }
            dVar.e(i10);
        }
    }

    public void g() {
        ((d) androidx.media3.common.util.a.k(this.f66133b)).a(false);
    }

    public void h() {
        this.f66134c = null;
    }

    public boolean j() {
        return this.f66134c != null;
    }

    public boolean k() {
        return this.f66133b != null;
    }

    public void l() {
        m(null);
    }

    public void m(@p0 f fVar) {
        d<? extends e> dVar = this.f66133b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f66132a.execute(new g(fVar));
        }
        this.f66132a.release();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) androidx.media3.common.util.a.k(Looper.myLooper());
        this.f66134c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public o(androidx.media3.exoplayer.util.c cVar) {
        this.f66132a = cVar;
    }
}
