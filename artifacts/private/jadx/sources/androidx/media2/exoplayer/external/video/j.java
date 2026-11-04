package androidx.media2.exoplayer.external.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f57836m = 500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f57837n = 20000000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f57838o = 80;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f57839p = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f57840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f57841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f57842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f57843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f57844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f57845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f57846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f57847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f57848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f57849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f57850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f57851l;

    @e.b(17)
    private final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f57852a;

        public a(DisplayManager displayManager) {
            this.f57852a = displayManager;
        }

        public void a() {
            this.f57852a.registerDisplayListener(this, null);
        }

        public void b() {
            this.f57852a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
            if (displayId == 0) {
                j.this.h();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
        }
    }

    private static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f57854f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f57855g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f57856h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f57857i = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f57858a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f57859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f57860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f57861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57862e;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f57860c = handlerThread;
            handlerThread.start();
            Handler handlerW = q0.w(handlerThread.getLooper(), this);
            this.f57859b = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        private void b() {
            int i10 = this.f57862e + 1;
            this.f57862e = i10;
            if (i10 == 1) {
                this.f57861d.postFrameCallback(this);
            }
        }

        private void c() {
            this.f57861d = Choreographer.getInstance();
        }

        public static b d() {
            return f57857i;
        }

        private void f() {
            int i10 = this.f57862e - 1;
            this.f57862e = i10;
            if (i10 == 0) {
                this.f57861d.removeFrameCallback(this);
                this.f57858a = -9223372036854775807L;
            }
        }

        public void a() {
            this.f57859b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long vsyncTimeNs) {
            this.f57858a = vsyncTimeNs;
            this.f57861d.postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f57859b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public j() {
        this(null);
    }

    private static long c(long releaseTime, long sampledVsyncTime, long vsyncDuration) {
        long j10;
        long j11 = sampledVsyncTime + (((releaseTime - sampledVsyncTime) / vsyncDuration) * vsyncDuration);
        if (releaseTime <= j11) {
            j10 = j11 - vsyncDuration;
        } else {
            long j12 = vsyncDuration + j11;
            j10 = j11;
            j11 = j12;
        }
        return j11 - releaseTime < releaseTime - j10 ? j11 : j10;
    }

    private boolean f(long frameTimeNs, long releaseTimeNs) {
        return Math.abs((releaseTimeNs - this.f57849j) - (frameTimeNs - this.f57850k)) > f57837n;
    }

    @e.b(17)
    private a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Display defaultDisplay = this.f57840a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f57843d = refreshRate;
            this.f57844e = (refreshRate * f57838o) / 100;
        }
    }

    public long b(long framePresentationTimeUs, long unadjustedReleaseTimeNs) {
        long j10;
        long j11;
        long j12 = 1000 * framePresentationTimeUs;
        if (this.f57848i) {
            if (framePresentationTimeUs != this.f57845f) {
                this.f57851l++;
                this.f57846g = this.f57847h;
            }
            long j13 = this.f57851l;
            if (j13 >= 6) {
                j11 = this.f57846g + ((j12 - this.f57850k) / j13);
                if (f(j11, unadjustedReleaseTimeNs)) {
                    this.f57848i = false;
                } else {
                    j10 = (this.f57849j + j11) - this.f57850k;
                }
            } else if (f(j12, unadjustedReleaseTimeNs)) {
                this.f57848i = false;
            }
            j10 = unadjustedReleaseTimeNs;
            j11 = j12;
        } else {
            j10 = unadjustedReleaseTimeNs;
            j11 = j12;
        }
        if (!this.f57848i) {
            this.f57850k = j12;
            this.f57849j = unadjustedReleaseTimeNs;
            this.f57851l = 0L;
            int i10 = 5 & 1;
            this.f57848i = true;
        }
        this.f57845f = framePresentationTimeUs;
        this.f57847h = j11;
        b bVar = this.f57841b;
        if (bVar != null && this.f57843d != -9223372036854775807L) {
            long j14 = bVar.f57858a;
            if (j14 != -9223372036854775807L) {
                return c(j10, j14, this.f57843d) - this.f57844e;
            }
        }
        return j10;
    }

    public void d() {
        if (this.f57840a != null) {
            a aVar = this.f57842c;
            if (aVar != null) {
                aVar.b();
            }
            this.f57841b.e();
        }
    }

    public void e() {
        this.f57848i = false;
        if (this.f57840a != null) {
            this.f57841b.a();
            a aVar = this.f57842c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public j(@p0 Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f57840a = (WindowManager) context.getSystemService("window");
        } else {
            this.f57840a = null;
        }
        if (this.f57840a != null) {
            this.f57842c = q0.f57626a >= 17 ? g(context) : null;
            this.f57841b = b.d();
        } else {
            this.f57842c = null;
            this.f57841b = null;
        }
        this.f57843d = -9223372036854775807L;
        this.f57844e = -9223372036854775807L;
    }
}
