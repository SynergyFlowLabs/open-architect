package androidx.media3.exoplayer;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f66651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f66652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.j f66653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.z3 f66654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f66656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f66657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f66658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f66659i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66660j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f66662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f66663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f66664n;

    public interface a {
        void d(w4 w4Var);
    }

    public interface b {
        void i(int i10, @androidx.annotation.p0 Object obj) throws s0;
    }

    public w4(a aVar, b bVar, androidx.media3.common.z3 z3Var, int i10, androidx.media3.common.util.j jVar, Looper looper) {
        this.f66652b = aVar;
        this.f66651a = bVar;
        this.f66654d = z3Var;
        this.f66657g = looper;
        this.f66653c = jVar;
        this.f66658h = i10;
    }

    public synchronized boolean a() throws InterruptedException {
        try {
            androidx.media3.common.util.a.i(this.f66661k);
            androidx.media3.common.util.a.i(this.f66657g.getThread() != Thread.currentThread());
            while (!this.f66663m) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66662l;
    }

    public synchronized boolean b(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            androidx.media3.common.util.a.i(this.f66661k);
            androidx.media3.common.util.a.i(this.f66657g.getThread() != Thread.currentThread());
            long jB = this.f66653c.b() + j10;
            while (true) {
                z10 = this.f66663m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f66653c.e();
                wait(j10);
                j10 = jB - this.f66653c.b();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66662l;
    }

    @z7.a
    public synchronized w4 c() {
        androidx.media3.common.util.a.i(this.f66661k);
        this.f66664n = true;
        m(false);
        return this;
    }

    public boolean d() {
        return this.f66660j;
    }

    public Looper e() {
        return this.f66657g;
    }

    public int f() {
        return this.f66658h;
    }

    @androidx.annotation.p0
    public Object g() {
        return this.f66656f;
    }

    public long h() {
        return this.f66659i;
    }

    public b i() {
        return this.f66651a;
    }

    public androidx.media3.common.z3 j() {
        return this.f66654d;
    }

    public int k() {
        return this.f66655e;
    }

    public synchronized boolean l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66664n;
    }

    public synchronized void m(boolean z10) {
        try {
            this.f66662l = z10 | this.f66662l;
            this.f66663m = true;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @z7.a
    public w4 n() {
        androidx.media3.common.util.a.i(!this.f66661k);
        if (this.f66659i == -9223372036854775807L) {
            androidx.media3.common.util.a.a(this.f66660j);
        }
        this.f66661k = true;
        this.f66652b.d(this);
        return this;
    }

    @z7.a
    public w4 o(boolean z10) {
        androidx.media3.common.util.a.i(!this.f66661k);
        this.f66660j = z10;
        return this;
    }

    @z7.a
    public w4 p(Looper looper) {
        androidx.media3.common.util.a.i(!this.f66661k);
        this.f66657g = looper;
        return this;
    }

    @z7.a
    public w4 q(@androidx.annotation.p0 Object obj) {
        androidx.media3.common.util.a.i(!this.f66661k);
        this.f66656f = obj;
        return this;
    }

    @z7.a
    public w4 r(int i10, long j10) {
        int i11 = 7 << 1;
        androidx.media3.common.util.a.i(!this.f66661k);
        androidx.media3.common.util.a.a(j10 != -9223372036854775807L);
        if (i10 < 0 || (!this.f66654d.w() && i10 >= this.f66654d.v())) {
            throw new androidx.media3.common.i0(this.f66654d, i10, j10);
        }
        this.f66658h = i10;
        this.f66659i = j10;
        return this;
    }

    @z7.a
    public w4 s(long j10) {
        androidx.media3.common.util.a.i(!this.f66661k);
        this.f66659i = j10;
        return this;
    }

    @z7.a
    public w4 t(int i10) {
        androidx.media3.common.util.a.i(!this.f66661k);
        this.f66655e = i10;
        return this;
    }
}
