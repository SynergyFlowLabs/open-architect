package io.ably.lib.transport;

import io.ably.lib.http.m;
import io.ably.lib.network.p;
import io.ably.lib.network.s;
import io.ably.lib.network.t;
import io.ably.lib.network.u;
import io.ably.lib.network.v;
import io.ably.lib.network.w;
import io.ably.lib.types.b0;
import io.ably.lib.types.e0;
import io.ably.lib.types.f0;
import io.ably.lib.types.r;
import io.ably.lib.util.k;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.SSLContext;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class i implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f287889j = "io.ably.lib.transport.i";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f287890k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f287891l = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f287892m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f287893n = 1001;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f287894o = 1002;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f287895p = 1003;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f287896q = 1006;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f287897r = 1007;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f287898s = 1008;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f287899t = 1009;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f287900u = 1010;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f287901v = 1011;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f287902w = 1015;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.d f287903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.ably.lib.transport.b f287904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f287905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f287906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f287907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f287908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f287909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f287910i = false;

    public static class a implements e.b {
        @Override // io.ably.lib.transport.e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(e.d dVar, io.ably.lib.transport.b bVar) {
            return new i(dVar, bVar);
        }
    }

    class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f287911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Timer f287912b = new Timer();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TimerTask f287913c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f287914d;

        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    b.this.l();
                } catch (Throwable th2) {
                    k.e(i.f287889j, "Unexpected exception in activity timer handler", th2);
                }
            }
        }

        b(c cVar) {
            this.f287911a = cVar;
        }

        private synchronized void h() {
            try {
                long jK = k();
                if (jK == 0) {
                    k.k(i.f287889j, "checkActivity: infinite timeout");
                } else {
                    if (this.f287913c != null) {
                        return;
                    }
                    n(jK + 100);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private synchronized void i() {
            try {
                this.f287912b.cancel();
                this.f287912b = null;
            } catch (IllegalStateException unused) {
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private synchronized void j() {
            try {
                this.f287914d = System.currentTimeMillis();
                i.this.f287904c.v0(this.f287914d);
                if (this.f287913c == null && i.this.f287904c.B != 0 && !i.this.f287910i) {
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private long k() {
            return i.this.f287904c.B + i.this.f287904c.f287774e.f287674a.F;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            long jK = k() - (System.currentTimeMillis() - this.f287914d);
            if (jK > 0) {
                synchronized (this) {
                    try {
                        this.f287913c = null;
                        k.k(i.f287889j, "onActivityTimerExpiry: ok");
                        n(jK + 100);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            k.d(i.f287889j, "No activity for " + k() + "ms, closing connection");
            i.this.f287908g.l(1006, "timed out");
        }

        private synchronized void m(TimerTask timerTask, long j10) {
            try {
                Timer timer = this.f287912b;
                if (timer != null) {
                    try {
                        timer.schedule(timerTask, j10);
                    } catch (IllegalStateException e10) {
                        k.e(i.f287889j, "Unexpected exception scheduling activity timer", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private synchronized void n(long j10) {
            try {
                if (this.f287913c == null) {
                    a aVar = new a();
                    this.f287913c = aVar;
                    m(aVar, j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.ably.lib.network.w
        public void a() {
            k.b(i.f287889j, "onWebsocketPing()");
            j();
        }

        @Override // io.ably.lib.network.w
        public void b(ByteBuffer byteBuffer) {
            try {
                e0 e0VarB = f0.b(byteBuffer.array());
                k.b(i.f287889j, "onMessage(): msg (binary) = " + e0VarB);
                i.this.k(e0VarB);
                this.f287911a.a(e0VarB);
            } catch (io.ably.lib.types.a e10) {
                k.e(i.f287889j, "Unexpected exception processing received binary message", e10);
            }
            j();
        }

        @Override // io.ably.lib.network.w
        public void c(Throwable th2) {
            k.n(i.f287889j, "Error when trying to set SSL parameters, most likely due to an old Java API version", th2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x005f  */
        @Override // io.ably.lib.network.w
        public void d(int i10, String str) {
            r rVar;
            k.b(i.f287889j, "onClose(): wsCode = " + i10 + "; wsReason = " + str + "; remote = false");
            if (i10 == -2 || i10 == -1 || i10 == 1000 || i10 == 1001) {
                rVar = io.ably.lib.transport.b.J;
            } else if (i10 == 1003) {
                rVar = io.ably.lib.transport.b.M;
            } else if (i10 == 1006) {
                rVar = io.ably.lib.transport.b.J;
            } else if (i10 != 1008) {
                rVar = i10 != 1009 ? io.ably.lib.transport.b.L : io.ably.lib.transport.b.N;
            } else {
                rVar = io.ably.lib.transport.b.M;
            }
            i.this.f287907f.a(i.this, rVar);
            i();
        }

        @Override // io.ably.lib.network.w
        public void e(String str) {
            try {
                e0 e0VarA = f0.a(str);
                k.b(i.f287889j, "onMessage(): msg (text) = " + e0VarA);
                i.this.k(e0VarA);
                this.f287911a.a(e0VarA);
            } catch (io.ably.lib.types.a e10) {
                k.e(i.f287889j, "Unexpected exception processing received text message", e10);
            }
            j();
        }

        @Override // io.ably.lib.network.w
        public void f() {
            k.b(i.f287889j, "onOpen()");
            i.this.f287907f.b(i.this);
            j();
        }

        @Override // io.ably.lib.network.w
        public void onError(Throwable th2) {
            k.e(i.f287889j, "Connection error ", th2);
            i.this.f287907f.a(i.this, new r(th2.getMessage(), 503, androidx.media3.extractor.b.f67118a));
        }
    }

    interface c {
        void a(e0 e0Var) throws io.ably.lib.types.a;
    }

    protected i(e.d dVar, io.ably.lib.transport.b bVar) {
        this.f287903b = dVar;
        this.f287904c = bVar;
        this.f287905d = dVar.f287878a.f288125u;
        t tVarJ = j(dVar);
        this.f287909h = tVarJ;
        dVar.f287883f = !tVarJ.b();
    }

    private static t j(e.d dVar) {
        v vVarB = v.b();
        k.k(f287889j, String.format("Using %s WebSocket Engine", vVarB.c().name()));
        u.a aVarA = u.a();
        aVarA.e(dVar.f287878a.f288118n).b(dVar.f287879b).c(io.ably.lib.util.c.a(dVar.a()));
        if (dVar.f287878a.f288118n && vVarB.c() != io.ably.lib.network.g.OKHTTP) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                aVarA.d(new g(sSLContext.getSocketFactory()));
            } catch (KeyManagementException | NoSuchAlgorithmException e10) {
                throw new IllegalStateException("Can't get safe tls algorithms", e10);
            }
        }
        return vVarB.e(aVarA.a());
    }

    @Override // io.ably.lib.transport.e
    public String A1() {
        return this.f287903b.f287879b;
    }

    @Override // io.ably.lib.transport.e
    public void a(e0 e0Var) throws io.ably.lib.types.a {
        String str = f287889j;
        k.b(str, "send(); action = " + e0Var.f287955a);
        try {
            if (!this.f287905d) {
                if (k.f288243h <= 2) {
                    k.k(str, "send(): " + new String(f0.c(e0Var)));
                }
                this.f287908g.b(f0.c(e0Var));
                return;
            }
            byte[] bArrD = f0.d(e0Var);
            if (k.f288243h <= 2) {
                e0 e0VarB = f0.b(bArrD);
                k.k(str, "send(): " + e0VarB.f287955a + ": " + new String(f0.c(e0VarB)));
            }
            this.f287908g.b(bArrD);
        } catch (p e10) {
            e.a aVar = this.f287907f;
            if (aVar == null) {
                throw io.ably.lib.types.a.c(e10);
            }
            aVar.a(this, io.ably.lib.types.a.c(e10).f287918a);
        } catch (Exception e11) {
            throw io.ably.lib.types.a.c(e11);
        }
    }

    @Override // io.ably.lib.transport.e
    public String b() {
        return this.f287906e;
    }

    @Override // io.ably.lib.transport.e
    public void c(e.a aVar) {
        s sVarA;
        this.f287907f = aVar;
        try {
            this.f287906e = (this.f287903b.f287878a.f288118n ? "wss://" : "ws://") + this.f287903b.f287879b + AbstractJsonLexerKt.COLON + this.f287903b.f287880c + "/";
            b0[] b0VarArrB = this.f287903b.b(this.f287904c.f287774e.f287677d.o());
            if (b0VarArrB.length > 0) {
                this.f287906e = m.e(this.f287906e, b0VarArrB);
            }
            k.b(f287889j, "connect(); wsUri = " + this.f287906e);
            synchronized (this) {
                try {
                    sVarA = this.f287909h.a(this.f287906e, new b(new c() { // from class: io.ably.lib.transport.h
                        @Override // io.ably.lib.transport.i.c
                        public final void a(e0 e0Var) throws io.ably.lib.types.a {
                            this.f287888a.d(e0Var);
                        }
                    }));
                    this.f287908g = sVarA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            sVarA.a();
        } catch (io.ably.lib.types.a e10) {
            k.e(f287889j, "Unexpected exception attempting connection; wsUri = " + this.f287906e, e10);
            aVar.a(this, e10.f287918a);
        } catch (Throwable th3) {
            k.e(f287889j, "Unexpected exception attempting connection; wsUri = " + this.f287906e, th3);
            aVar.a(this, io.ably.lib.types.a.c(th3).f287918a);
        }
    }

    @Override // io.ably.lib.transport.e
    public void close() {
        k.b(f287889j, "close()");
        synchronized (this) {
            try {
                s sVar = this.f287908g;
                if (sVar != null) {
                    sVar.close();
                    this.f287908g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.ably.lib.transport.e
    public void d(e0 e0Var) throws io.ably.lib.types.a {
        this.f287904c.k0(this, e0Var);
    }

    protected void k(e0 e0Var) {
    }

    protected void l() {
        if (this.f287909h.b()) {
            return;
        }
        this.f287910i = true;
    }

    public String toString() {
        return i.class.getName() + " {" + b() + "}";
    }
}
