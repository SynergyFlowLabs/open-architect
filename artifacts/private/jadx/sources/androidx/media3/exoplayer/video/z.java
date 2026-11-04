package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f66612r = "VideoFrameReleaseHelper";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f66613s = 5000000000L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f66614t = 0.02f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f66615u = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f66616v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f66617w = 500;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f66618x = 20000000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f66619y = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f66620a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final b f66621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final c f66622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Surface f66624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f66625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f66626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f66627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f66628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f66630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f66631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f66632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f66633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f66634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f66635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f66636q;

    @w0(30)
    private static final class a {
        private a() {
        }

        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                androidx.media3.common.util.z.e(z.f66612r, "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f66637a;

        public b(DisplayManager displayManager) {
            this.f66637a = displayManager;
        }

        private Display a() {
            return this.f66637a.getDisplay(0);
        }

        public void b() {
            this.f66637a.registerDisplayListener(this, k1.H());
            z.this.p(a());
        }

        public void c() {
            this.f66637a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                z.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f66639f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f66640g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f66641h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f66642i = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f66643a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f66644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f66645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f66646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f66647e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f66645c = handlerThread;
            handlerThread.start();
            Handler handlerG = k1.G(handlerThread.getLooper(), this);
            this.f66644b = handlerG;
            handlerG.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f66646d;
            if (choreographer != null) {
                int i10 = this.f66647e + 1;
                this.f66647e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f66646d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                androidx.media3.common.util.z.o(z.f66612r, "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f66642i;
        }

        private void f() {
            Choreographer choreographer = this.f66646d;
            if (choreographer != null) {
                int i10 = this.f66647e - 1;
                this.f66647e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f66643a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f66644b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f66643a = j10;
            ((Choreographer) androidx.media3.common.util.a.g(this.f66646d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f66644b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public z(@p0 Context context) {
        b bVarF = f(context);
        this.f66621b = bVarF;
        this.f66622c = bVarF != null ? c.d() : null;
        this.f66630k = -9223372036854775807L;
        this.f66631l = -9223372036854775807L;
        this.f66625f = -1.0f;
        this.f66628i = 1.0f;
        this.f66629j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= f66618x;
    }

    private void d() {
        Surface surface;
        if (k1.f61540a < 30 || (surface = this.f66624e) == null || this.f66629j == Integer.MIN_VALUE || this.f66627h == 0.0f) {
            return;
        }
        this.f66627h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    @p0
    private b f(@p0 Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f66632m = 0L;
        this.f66635p = -1L;
        this.f66633n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(@p0 Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f66630k = refreshRate;
            this.f66631l = (refreshRate * f66619y) / 100;
        } else {
            androidx.media3.common.util.z.n(f66612r, "Unable to query display refresh rate");
            this.f66630k = -9223372036854775807L;
            this.f66631l = -9223372036854775807L;
        }
    }

    private void q() {
        if (k1.f61540a >= 30 && this.f66624e != null) {
            float fB = this.f66620a.e() ? this.f66620a.b() : this.f66625f;
            float f10 = this.f66626g;
            if (fB != f10) {
                if (fB != -1.0f && f10 != -1.0f) {
                    if (Math.abs(fB - this.f66626g) < ((!this.f66620a.e() || this.f66620a.d() < f66613s) ? 1.0f : f66614t)) {
                        return;
                    }
                } else if (fB != -1.0f || this.f66620a.c() >= 30) {
                }
                this.f66626g = fB;
                r(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (k1.f61540a >= 30 && (surface = this.f66624e) != null && this.f66629j != Integer.MIN_VALUE) {
            if (this.f66623d) {
                float f11 = this.f66626g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f66628i;
                } else {
                    f10 = 0.0f;
                }
            } else {
                f10 = 0.0f;
            }
            if (z10 || this.f66627h != f10) {
                this.f66627h = f10;
                a.a(surface, f10);
            }
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f66635p == -1 || !this.f66620a.e()) {
            j11 = j10;
        } else {
            long jA = this.f66636q + ((long) ((this.f66620a.a() * (this.f66632m - this.f66635p)) / this.f66628i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f66633n = this.f66632m;
        this.f66634o = j11;
        c cVar = this.f66622c;
        if (cVar != null && this.f66630k != -9223372036854775807L) {
            long j12 = cVar.f66643a;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f66630k) - this.f66631l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f66625f = f10;
        this.f66620a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f66633n;
        if (j11 != -1) {
            this.f66635p = j11;
            this.f66636q = this.f66634o;
        }
        this.f66632m++;
        this.f66620a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f66628i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f66623d = true;
        n();
        if (this.f66621b != null) {
            ((c) androidx.media3.common.util.a.g(this.f66622c)).a();
            this.f66621b.b();
        }
        r(false);
    }

    public void l() {
        this.f66623d = false;
        b bVar = this.f66621b;
        if (bVar != null) {
            bVar.c();
            ((c) androidx.media3.common.util.a.g(this.f66622c)).e();
        }
        d();
    }

    public void m(@p0 Surface surface) {
        if (this.f66624e == surface) {
            return;
        }
        d();
        this.f66624e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f66629j == i10) {
            return;
        }
        this.f66629j = i10;
        r(true);
    }
}
