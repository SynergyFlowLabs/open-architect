package androidx.media2.exoplayer.external;

import android.os.Handler;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f55615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f55616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f55618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f55619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f55621h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55622i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55626m;

    public interface a {
        void d(q0 message);
    }

    public interface b {
        void i(int messageType, @androidx.annotation.p0 Object payload) throws i;
    }

    public q0(a sender, b target, z0 timeline, int defaultWindowIndex, Handler defaultHandler) {
        this.f55615b = sender;
        this.f55614a = target;
        this.f55616c = timeline;
        this.f55619f = defaultHandler;
        this.f55620g = defaultWindowIndex;
    }

    public synchronized boolean a() throws InterruptedException {
        try {
            androidx.media2.exoplayer.external.util.a.i(this.f55623j);
            androidx.media2.exoplayer.external.util.a.i(this.f55619f.getLooper().getThread() != Thread.currentThread());
            while (!this.f55625l) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55624k;
    }

    public synchronized q0 b() {
        androidx.media2.exoplayer.external.util.a.i(this.f55623j);
        this.f55626m = true;
        l(false);
        return this;
    }

    public boolean c() {
        return this.f55622i;
    }

    public Handler d() {
        return this.f55619f;
    }

    @androidx.annotation.p0
    public Object e() {
        return this.f55618e;
    }

    public long f() {
        return this.f55621h;
    }

    public b g() {
        return this.f55614a;
    }

    public z0 h() {
        return this.f55616c;
    }

    public int i() {
        return this.f55617d;
    }

    public int j() {
        return this.f55620g;
    }

    public synchronized boolean k() {
        return this.f55626m;
    }

    public synchronized void l(boolean isDelivered) {
        this.f55624k = isDelivered | this.f55624k;
        this.f55625l = true;
        notifyAll();
    }

    public q0 m() {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        if (this.f55621h == -9223372036854775807L) {
            androidx.media2.exoplayer.external.util.a.a(this.f55622i);
        }
        this.f55623j = true;
        this.f55615b.d(this);
        return this;
    }

    public q0 n(boolean deleteAfterDelivery) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        this.f55622i = deleteAfterDelivery;
        return this;
    }

    public q0 o(Handler handler) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        this.f55619f = handler;
        return this;
    }

    public q0 p(@androidx.annotation.p0 Object payload) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        this.f55618e = payload;
        return this;
    }

    public q0 q(int windowIndex, long positionMs) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        androidx.media2.exoplayer.external.util.a.a(positionMs != -9223372036854775807L);
        if (windowIndex < 0 || (!this.f55616c.s() && windowIndex >= this.f55616c.r())) {
            throw new e0(this.f55616c, windowIndex, positionMs);
        }
        this.f55620g = windowIndex;
        this.f55621h = positionMs;
        return this;
    }

    public q0 r(long positionMs) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        this.f55621h = positionMs;
        return this;
    }

    public q0 s(int messageType) {
        androidx.media2.exoplayer.external.util.a.i(!this.f55623j);
        this.f55617d = messageType;
        return this;
    }
}
