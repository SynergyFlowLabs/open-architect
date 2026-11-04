package io.ably.lib.transport;

import io.ably.lib.types.e0;
import io.ably.lib.types.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public class b implements io.ably.lib.transport.e.a {
    private static final String F = "io.ably.lib.transport.b";
    private static final String G = "https://internet-up.ably-realtime.com/is-the-internet-up.txt";
    private static final String H = "yes";
    static io.ably.lib.types.r I = new io.ably.lib.types.r("Can't attach when not in an active state", 200, 10000);
    static io.ably.lib.types.r J = new io.ably.lib.types.r("Connection temporarily unavailable", 503, 80003);
    static io.ably.lib.types.r K = new io.ably.lib.types.r("Connection unavailable", 503, 80002);
    static io.ably.lib.types.r L = new io.ably.lib.types.r("Connection failed", 400, androidx.media3.extractor.b.f67118a);
    static io.ably.lib.types.r M = new io.ably.lib.types.r("Access refused", 401, 40100);
    static io.ably.lib.types.r N = new io.ably.lib.types.r("Connection closed; message too large", 400, 40000);
    private static final long O = 5000;
    public int A;
    long B;
    private int C;
    private final lg.a.b D;
    private String E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mg.b f287773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.ably.lib.realtime.a f287774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f287775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.ably.lib.realtime.h f287776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.ably.lib.transport.e.b f287777h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.ably.lib.transport.d f287782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.ably.lib.util.n f287783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Thread f287784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map<io.ably.lib.realtime.j, u> f287785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private u f287786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.ably.lib.types.r f287787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j f287788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f287789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.ably.lib.transport.e f287790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f287791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f287792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f287793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f287794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f287795z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExecutorService f287770a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f287771b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f287772c = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<s> f287778i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f287779j = new r(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashSet<Object> f287780k = new HashSet<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f287781l = new d(0 == true ? 1 : 0);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f287796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f287797b;

        static {
            int[] iArr = new int[e0.a.values().length];
            f287797b = iArr;
            try {
                iArr[e0.a.heartbeat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287797b[e0.a.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f287797b[e0.a.connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f287797b[e0.a.disconnect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f287797b[e0.a.disconnected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f287797b[e0.a.closed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f287797b[e0.a.ack.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f287797b[e0.a.nack.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f287797b[e0.a.auth.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f287797b[e0.a.object.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f287797b[e0.a.object_sync.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[io.ably.lib.realtime.j.values().length];
            f287796a = iArr2;
            try {
                iArr2[io.ably.lib.realtime.j.connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f287796a[io.ably.lib.realtime.j.connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f287796a[io.ably.lib.realtime.j.disconnected.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.transport.b$b, reason: collision with other inner class name */
    private interface InterfaceRunnableC1944b extends Runnable {
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVarC;
            while (true) {
                synchronized (b.this) {
                    while (b.this.f287781l.size() == 0) {
                        try {
                            if (b.this.f287786q.f287822e) {
                                b.this.f287784o = null;
                                b.this.A0();
                                b.this.f287771b = false;
                                b.this.notifyAll();
                                return;
                            }
                            b bVar = b.this;
                            bVar.C0(bVar.f287786q.f287823f);
                            InterfaceRunnableC1944b interfaceRunnableC1944bPeek = b.this.f287781l.peek();
                            if (interfaceRunnableC1944bPeek != null) {
                                io.ably.lib.util.k.b(b.F, "Wait ended by action: " + interfaceRunnableC1944bPeek.toString());
                                break;
                            }
                            if (!b.this.f287789t && (wVarC = b.this.f287786q.c()) != null) {
                                b.this.p0(wVarC);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                while (true) {
                    InterfaceRunnableC1944b interfaceRunnableC1944bPoll = b.this.f287781l.poll();
                    if (interfaceRunnableC1944bPoll != null) {
                        try {
                            interfaceRunnableC1944bPoll.run();
                        } catch (Exception e10) {
                            io.ably.lib.util.k.e(b.F, "Action invocation failed with exception: action = " + interfaceRunnableC1944bPoll.toString(), e10);
                        }
                    }
                }
            }
        }
    }

    private static class d extends ArrayDeque<InterfaceRunnableC1944b> {
        private d() {
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public synchronized boolean add(InterfaceRunnableC1944b interfaceRunnableC1944b) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            return super.add(interfaceRunnableC1944b);
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public synchronized InterfaceRunnableC1944b peek() {
            return (InterfaceRunnableC1944b) super.peek();
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public synchronized InterfaceRunnableC1944b poll() {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            return (InterfaceRunnableC1944b) super.poll();
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
        public synchronized int size() {
            return super.size();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private class f implements io.ably.lib.transport.f.c {
        private f() {
        }

        @Override // io.ably.lib.transport.f.c
        public void a(io.ably.lib.types.r rVar) {
            b bVar = b.this;
            io.ably.lib.realtime.j jVar = bVar.R().f287818a;
            io.ably.lib.util.k.f(b.F, "onNetworkUnavailable(); currentState = " + jVar.name() + "; reason = " + rVar.toString());
            if (jVar == io.ably.lib.realtime.j.connected || jVar == io.ably.lib.realtime.j.connecting) {
                io.ably.lib.util.k.f(b.F, "onNetworkUnavailable(): closing connected transport");
                bVar.p0(new w(io.ably.lib.realtime.j.disconnected, rVar));
            }
        }

        @Override // io.ably.lib.transport.f.c
        public void b() {
            b bVar = b.this;
            io.ably.lib.realtime.j jVar = bVar.R().f287818a;
            io.ably.lib.util.k.f(b.F, "onNetworkAvailable(): currentState = " + jVar.name());
            if (jVar == io.ably.lib.realtime.j.disconnected || jVar == io.ably.lib.realtime.j.suspended) {
                io.ably.lib.util.k.f(b.F, "onNetworkAvailable(): initiating reconnect");
                bVar.M();
            }
        }

        /* synthetic */ f(b bVar, a aVar) {
            this();
        }
    }

    public interface g {
        void a(e0 e0Var);

        void d(io.ably.lib.types.r rVar, boolean z10);

        void e(List<s> list);

        Iterable<io.ably.lib.realtime.b> values();
    }

    class h extends u {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(io.ably.lib.realtime.j.closed, false, false, true, 0L, b.I);
            int i10 = 2 ^ 1;
        }

        @Override // io.ably.lib.transport.b.u
        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
            bVar.n0(b.I);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            if (wVar.f287829a == io.ably.lib.realtime.j.connecting) {
                return wVar;
            }
            return null;
        }
    }

    class i extends u {
        i() {
            super(io.ably.lib.realtime.j.closing, false, false, false, io.ably.lib.transport.c.f287849m, b.I);
        }

        @Override // io.ably.lib.transport.b.u
        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            super.a(wVar, aVar);
            if (b.this.L(aVar.f287640b == io.ably.lib.realtime.j.connecting)) {
                b bVar = b.this;
                bVar.C(bVar.new e(io.ably.lib.realtime.j.closed));
            }
        }

        @Override // io.ably.lib.transport.b.u
        w c() {
            return new w(io.ably.lib.realtime.j.closed);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            io.ably.lib.realtime.j jVar = wVar.f287829a;
            if (jVar == this.f287818a) {
                return null;
            }
            return (jVar == io.ably.lib.realtime.j.disconnected || jVar == io.ably.lib.realtime.j.suspended) ? new w(io.ably.lib.realtime.j.closed) : wVar;
        }
    }

    private class j extends io.ably.lib.transport.e.d {
        j(io.ably.lib.types.n nVar, io.ably.lib.util.n nVar2) {
            super(nVar, nVar2);
            this.f287881d = b.this.f287776g.f287614e;
            this.f287880c = io.ably.lib.transport.c.b(nVar);
        }
    }

    class k extends u {
        k() {
            super(io.ably.lib.realtime.j.connected, false, true, false, 0L, null);
        }

        @Override // io.ably.lib.transport.b.u
        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            super.a(wVar, aVar);
            b.this.f287788s = null;
        }

        @Override // io.ably.lib.transport.b.u
        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
            bVar.m0();
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            if (wVar.f287829a != this.f287818a) {
                return wVar;
            }
            b bVar = b.this;
            bVar.C(bVar.new z(null));
            return null;
        }
    }

    class l extends u {
        l() {
            super(io.ably.lib.realtime.j.connecting, true, false, false, io.ably.lib.transport.c.f287849m, null);
        }

        @Override // io.ably.lib.transport.b.u
        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            super.a(wVar, aVar);
            if (b.this.W(aVar)) {
                b.this.I();
            }
            b.this.N(wVar);
        }

        @Override // io.ably.lib.transport.b.u
        w c() {
            return b.this.H(null);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            return wVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class m implements io.ably.lib.realtime.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.ably.lib.realtime.k.a f287806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f287807b;

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f287807b) {
                return;
            }
            this.f287807b = true;
            b.this.f287776g.d(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized io.ably.lib.types.r e() {
            io.ably.lib.types.r rVar;
            try {
                if (this.f287807b) {
                    throw new IllegalStateException("Already closed.");
                }
                io.ably.lib.util.k.b(b.F, "ConnectionWaiter.waitFor()");
                if (this.f287806a == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                io.ably.lib.util.k.b(b.F, "ConnectionWaiter.waitFor done: currentState=" + b.this.f287786q + ")");
                rVar = this.f287806a.f287643e;
                this.f287806a = null;
            } catch (Throwable th2) {
                throw th2;
            }
            return rVar;
        }

        @Override // io.ably.lib.realtime.k
        public synchronized void c(io.ably.lib.realtime.k.a aVar) {
            try {
                this.f287806a = aVar;
                notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private m() {
            this.f287807b = false;
            b.this.f287776g.f(this);
        }
    }

    class n extends u {
        n() {
            super(io.ably.lib.realtime.j.disconnected, true, false, false, b.this.f287774e.f287674a.G, b.J);
        }

        @Override // io.ably.lib.transport.b.u
        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            super.a(wVar, aVar);
            b.this.J();
            if (aVar.f287640b == io.ably.lib.realtime.j.connected) {
                b.this.x0();
                if (b.this.f287789t) {
                    return;
                }
                io.ably.lib.util.k.k(b.F, "Was previously connected, retrying immediately");
                b.this.o0(io.ably.lib.realtime.j.connecting);
            }
        }

        @Override // io.ably.lib.transport.b.u
        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
        }

        @Override // io.ably.lib.transport.b.u
        w c() {
            return new w(io.ably.lib.realtime.j.connecting);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            io.ably.lib.realtime.j jVar = wVar.f287829a;
            if (jVar == this.f287818a) {
                return null;
            }
            return jVar == io.ably.lib.realtime.j.closing ? new w(io.ably.lib.realtime.j.closed) : wVar;
        }
    }

    class o extends u {
        o() {
            super(io.ably.lib.realtime.j.failed, false, false, true, 0L, b.L);
        }

        @Override // io.ably.lib.transport.b.u
        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            super.a(wVar, aVar);
            b.this.J();
        }

        @Override // io.ably.lib.transport.b.u
        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
            bVar.o0(wVar.f287830b);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            if (wVar.f287829a == io.ably.lib.realtime.j.connecting) {
                return wVar;
            }
            return null;
        }
    }

    private class p extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.realtime.g f287811a;

        p(io.ably.lib.realtime.g gVar) {
            this.f287811a = gVar;
        }

        private boolean b() {
            boolean zRemove = b.this.f287780k.remove(this);
            if (zRemove) {
                interrupt();
            }
            return zRemove;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(io.ably.lib.types.r rVar) {
            b();
            io.ably.lib.realtime.g gVar = this.f287811a;
            if (gVar != null) {
                gVar.a(rVar);
            }
        }

        private void d() {
            b();
            io.ably.lib.realtime.g gVar = this.f287811a;
            if (gVar != null) {
                gVar.onSuccess();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zB;
            synchronized (b.this.f287780k) {
                try {
                    try {
                        b.this.f287780k.wait(5000L);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
                zB = b();
            }
            if (zB) {
                c(new io.ably.lib.types.r("Timed out waiting for heartbeat response", 50000, 500));
            } else {
                d();
            }
        }
    }

    class q extends u {
        q() {
            super(io.ably.lib.realtime.j.initialized, true, false, false, 0L, null);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            if (wVar.f287829a != this.f287818a) {
                return wVar;
            }
            int i10 = 2 & 0;
            return null;
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f287815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.ably.lib.realtime.g f287816b;

        public s(e0 e0Var, io.ably.lib.realtime.g gVar) {
            this.f287815a = e0Var;
            this.f287816b = gVar;
        }
    }

    private class t implements InterfaceRunnableC1944b {
        private t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.V();
        }

        /* synthetic */ t(b bVar, a aVar) {
            this();
        }
    }

    public abstract class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.ably.lib.realtime.j f287818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.ably.lib.types.r f287819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f287820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f287821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f287822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f287823f;

        u(io.ably.lib.realtime.j jVar, boolean z10, boolean z11, boolean z12, long j10, io.ably.lib.types.r rVar) {
            this.f287818a = jVar;
            this.f287820c = z10;
            this.f287821d = z11;
            this.f287822e = z12;
            this.f287823f = j10;
            this.f287819b = rVar;
        }

        void a(w wVar, io.ably.lib.realtime.k.a aVar) {
            if (aVar != null) {
                if (this.f287821d) {
                    b.this.u0();
                } else if (!this.f287820c) {
                    b.this.Q(wVar.f287830b);
                }
                Iterator<io.ably.lib.realtime.b> it = b.this.f287775f.values().iterator();
                while (it.hasNext()) {
                    b(wVar, aVar, it.next());
                }
            }
        }

        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
        }

        w c() {
            return null;
        }

        abstract w d(w wVar);
    }

    private abstract class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final io.ably.lib.transport.e f287825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final w f287826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected io.ably.lib.realtime.k.a f287827c;

        v(io.ably.lib.transport.e eVar, w wVar) {
            this.f287825a = eVar;
            this.f287826b = wVar;
        }

        protected void a() {
            io.ably.lib.realtime.k.a aVar = this.f287827c;
            if (aVar != null) {
                if (aVar.f287641c != aVar.f287640b) {
                    b.this.f287776g.q(this.f287827c);
                }
                ((u) b.this.f287785p.get(this.f287826b.f287829a)).a(this.f287826b, this.f287827c);
                if (b.this.f287786q.f287822e) {
                    b.this.J();
                }
            }
        }

        protected void b() {
            this.f287827c = b.this.w0(this.f287825a, this.f287826b);
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.ably.lib.realtime.j f287829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.ably.lib.types.r f287830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f287831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f287832d;

        w(io.ably.lib.realtime.j jVar) {
            this(jVar, null);
        }

        public w(io.ably.lib.realtime.j jVar, io.ably.lib.types.r rVar) {
            this(jVar, rVar, null, null);
        }

        w(io.ably.lib.realtime.j jVar, io.ably.lib.types.r rVar, String str, String str2) {
            this.f287829a = jVar;
            this.f287830b = rVar;
            this.f287831c = str;
            this.f287832d = str2;
        }
    }

    class x extends u {
        x() {
            super(io.ably.lib.realtime.j.suspended, false, false, false, b.this.f287774e.f287674a.I, b.K);
        }

        @Override // io.ably.lib.transport.b.u
        void b(w wVar, io.ably.lib.realtime.k.a aVar, io.ably.lib.realtime.b bVar) {
            bVar.x0(this.f287819b, true);
        }

        @Override // io.ably.lib.transport.b.u
        w c() {
            return new w(io.ably.lib.realtime.j.connecting);
        }

        @Override // io.ably.lib.transport.b.u
        w d(w wVar) {
            io.ably.lib.realtime.j jVar = wVar.f287829a;
            if (jVar == this.f287818a) {
                return null;
            }
            return jVar == io.ably.lib.realtime.j.closing ? new w(io.ably.lib.realtime.j.closed) : wVar;
        }
    }

    private class y extends v implements InterfaceRunnableC1944b {
        y(io.ably.lib.transport.e eVar, w wVar) {
            super(eVar, wVar);
            b();
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    private class z implements InterfaceRunnableC1944b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.types.r f287835a;

        z(io.ably.lib.types.r rVar) {
            this.f287835a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f287776g.o(this.f287835a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(io.ably.lib.realtime.a aVar, io.ably.lib.realtime.h hVar, g gVar, io.ably.lib.util.n nVar, mg.b bVar) throws io.ably.lib.types.a {
        io.ably.lib.transport.e.b bVar2;
        int i10 = 5 >> 0;
        lg.a.b bVar3 = null;
        HashMap map = new HashMap();
        this.f287785p = map;
        this.f287795z = io.ably.lib.transport.c.f287860x;
        this.A = io.ably.lib.transport.c.f287859w;
        this.B = io.ably.lib.transport.c.f287858v;
        this.C = 0;
        this.f287774e = aVar;
        this.f287776g = hVar;
        this.f287775f = gVar;
        this.f287783n = nVar;
        this.f287773d = bVar;
        io.ably.lib.types.n nVar2 = aVar.f287674a;
        this.f287782m = new io.ably.lib.transport.d(nVar2.f288121q, io.ably.lib.transport.c.f287846j, nVar2);
        if (nVar2 instanceof lg.a) {
            lg.a aVar2 = (lg.a) nVar2;
            bVar3 = aVar2.T;
            bVar2 = aVar2.V;
        } else {
            bVar2 = null;
        }
        this.D = bVar3;
        this.f287777h = bVar2 == null ? io.ably.lib.transport.c.f287861y : bVar2;
        io.ably.lib.realtime.j jVar = io.ably.lib.realtime.j.initialized;
        map.put(jVar, new q());
        map.put(io.ably.lib.realtime.j.connecting, new l());
        map.put(io.ably.lib.realtime.j.connected, new k());
        map.put(io.ably.lib.realtime.j.disconnected, new n());
        map.put(io.ably.lib.realtime.j.suspended, new x());
        map.put(io.ably.lib.realtime.j.closing, new i());
        map.put(io.ably.lib.realtime.j.closed, new h());
        map.put(io.ably.lib.realtime.j.failed, new o());
        this.f287786q = (u) map.get(jVar);
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        this.f287774e.f287679f.a().i(this.f287794y);
        this.f287794y = null;
    }

    private boolean B0() {
        try {
            io.ably.lib.util.k.k(F, "Requesting connection close");
            this.f287790u.a(new e0(e0.a.close));
            return true;
        } catch (io.ably.lib.types.a unused) {
            io.ably.lib.util.k.k(F, "Closing incomplete transport");
            J();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C(InterfaceRunnableC1944b interfaceRunnableC1944b) {
        try {
            this.f287781l.add(interfaceRunnableC1944b);
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(long j10) {
        try {
            if (j10 == 0) {
                wait();
            } else {
                wait(j10);
            }
        } catch (InterruptedException unused) {
        }
    }

    private void D(boolean z10) {
        synchronized (this) {
            try {
                List<s> listE = this.f287779j.e();
                if (z10) {
                    this.f287792w = 0L;
                } else if (!listE.isEmpty()) {
                    this.f287792w = listE.get(0).f287815a.f287963i.longValue();
                }
                this.f287778i.addAll(0, listE);
            } finally {
            }
        }
    }

    private boolean E() {
        if (this.f287793x == 0 || System.currentTimeMillis() - this.f287793x <= this.B + this.f287795z) {
            return false;
        }
        if (this.f287776g.f287614e == null) {
            return true;
        }
        io.ably.lib.util.k.k(F, "Clearing stale connection key to suppress resume");
        io.ably.lib.realtime.h hVar = this.f287776g;
        hVar.f287614e = null;
        hVar.f287615f = null;
        return true;
    }

    private w G(io.ably.lib.types.r rVar) {
        String strB;
        if (this.f287788s == null || ((rVar != null && rVar.f288157b < 500) || !F() || (strB = this.f287782m.b(this.f287788s.f287879b)) == null)) {
            this.f287788s = null;
            return null;
        }
        io.ably.lib.util.k.k(F, "checkFallback: fallback to " + strB);
        return new w(io.ably.lib.realtime.j.connecting, null, strB, this.f287788s.f287879b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized w H(io.ably.lib.types.r rVar) {
        boolean z10;
        try {
            long jCurrentTimeMillis = this.f287791v - System.currentTimeMillis();
            z10 = jCurrentTimeMillis <= 0;
            io.ably.lib.util.k.k(F, "checkSuspended: timeToSuspend = " + jCurrentTimeMillis + "ms; suspendMode = " + z10);
        } catch (Throwable th2) {
            throw th2;
        }
        return new w(z10 ? io.ably.lib.realtime.j.suspended : io.ably.lib.realtime.j.disconnected, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        this.f287792w = 0L;
        this.f287776g.f287613d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        io.ably.lib.transport.e eVar = this.f287790u;
        if (eVar != null) {
            eVar.close();
            this.f287790u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L(boolean z10) {
        if (this.f287790u == null) {
            return true;
        }
        if (z10) {
            return false;
        }
        return !B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(w wVar) {
        io.ably.lib.transport.e eVar;
        String strC = wVar.f287831c;
        if (strC == null) {
            strC = this.f287782m.c();
        }
        E();
        j jVar = new j(this.f287774e.f287674a, this.f287783n);
        this.f287788s = jVar;
        jVar.f287879b = strC;
        this.E = strC;
        try {
            io.ably.lib.transport.e eVarA = this.f287777h.a(jVar, this);
            synchronized (this) {
                try {
                    eVar = this.f287790u;
                    this.f287790u = eVarA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (eVar != null) {
                eVar.close();
            }
            eVarA.c(this);
            lg.a.b bVar = this.D;
            if (bVar != null) {
                bVar.d(eVarA.b());
            }
        } catch (Exception e10) {
            io.ably.lib.util.k.e(getClass().getName(), "Unable to instance transport class", e10);
            throw new RuntimeException("Unable to instance transport class", e10);
        }
    }

    private synchronized List<s> P() {
        ArrayList arrayList;
        Iterator<s> it = this.f287778i.iterator();
        arrayList = new ArrayList();
        while (it.hasNext()) {
            s next = it.next();
            if (next.f287815a.f287966l != null) {
                arrayList.add(next);
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(io.ably.lib.types.r rVar) {
        synchronized (this) {
            try {
                Iterator<s> it = this.f287778i.iterator();
                while (it.hasNext()) {
                    io.ably.lib.realtime.g gVar = it.next().f287816b;
                    if (gVar != null) {
                        try {
                            gVar.a(rVar);
                        } catch (Throwable th2) {
                            io.ably.lib.util.k.e(F, "failQueuedMessages(): Unexpected error calling listener", th2);
                        }
                    }
                }
                this.f287778i.clear();
                this.f287779j.c(rVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        io.ably.lib.types.r rVar;
        if (this.f287786q.f287818a == io.ably.lib.realtime.j.connected) {
            io.ably.lib.util.k.k(F, "Server initiated reauth");
            try {
                this.f287774e.f287677d.w();
                rVar = null;
            } catch (io.ably.lib.types.a e10) {
                rVar = e10.f287918a;
            }
            if (this.f287786q.f287818a == io.ably.lib.realtime.j.connected) {
                this.f287776g.o(rVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean W(io.ably.lib.realtime.k.a aVar) {
        io.ably.lib.realtime.j jVar = aVar.f287640b;
        return jVar == io.ably.lib.realtime.j.failed || jVar == io.ably.lib.realtime.j.closed || jVar == io.ably.lib.realtime.j.closing;
    }

    private boolean Y(io.ably.lib.types.r rVar) {
        if (rVar.f288156a != 0) {
            if (Z(rVar)) {
                return false;
            }
            int i10 = rVar.f288156a;
            if (i10 >= 40000 && i10 < 50000) {
                return true;
            }
        }
        int i11 = rVar.f288157b;
        return i11 != 0 && i11 < 500;
    }

    private boolean Z(io.ably.lib.types.r rVar) {
        int i10 = rVar.f288156a;
        return (i10 >= 40140 && i10 < 40150) || (i10 == 80019 && rVar.f288157b == 401);
    }

    private void a0(e0 e0Var) {
        this.f287779j.b(e0Var.f287963i.longValue(), e0Var.f287957c, e0Var.f287958d);
    }

    public static /* synthetic */ void c(b bVar, m mVar, io.ably.lib.rest.d.f fVar) {
        bVar.getClass();
        boolean z10 = true;
        while (z10) {
            io.ably.lib.types.r rVarE = mVar.e();
            io.ably.lib.realtime.j jVar = bVar.f287786q.f287818a;
            int i10 = a.f287796a[jVar.ordinal()];
            if (i10 == 1) {
                fVar.a(true, null);
                io.ably.lib.util.k.k(F, "onAuthUpdated: got connected");
            } else if (i10 == 2 || i10 == 3) {
                io.ably.lib.util.k.k(F, "onAuthUpdated: " + jVar);
            } else {
                io.ably.lib.util.k.k(F, "onAuthUpdated: throwing exception");
                fVar.a(false, rVarE);
            }
            z10 = false;
        }
        mVar.d();
    }

    private void e0(e0 e0Var) {
        this.f287775f.a(e0Var);
        io.ably.lib.realtime.h hVar = this.f287776g;
        hVar.f287615f = hVar.m();
    }

    private synchronized void f0(e0 e0Var) {
        try {
            if (e0Var.f287958d != null) {
                i0(e0Var);
            } else {
                this.f287776g.f287614e = null;
                p0(new w(io.ably.lib.realtime.j.closed, null));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void g0(e0 e0Var) {
        try {
            this.f287774e.f287674a.f288128x = null;
            io.ably.lib.realtime.h hVar = this.f287776g;
            hVar.f287613d = e0Var.f287958d;
            if (hVar.f287616g != null) {
                String str = F;
                io.ably.lib.util.k.b(str, "There was a connection resume");
                if (e0Var.f287962h.equals(this.f287776g.f287616g)) {
                    if (e0Var.f287958d == null) {
                        io.ably.lib.util.k.b(str, "connection has reconnected and resumed successfully");
                    } else {
                        io.ably.lib.util.k.b(str, "connection resume success with non-fatal error: " + e0Var.f287958d.f288158c);
                    }
                    D(false);
                } else {
                    if (e0Var.f287958d != null) {
                        io.ably.lib.util.k.b(str, "connection resume failed with error: " + e0Var.f287958d.f288158c);
                    } else {
                        io.ably.lib.util.k.b(str, "connection resume failed without error");
                    }
                    D(true);
                    this.f287775f.e(P());
                }
            } else {
                this.f287792w = 0L;
            }
            io.ably.lib.realtime.h hVar2 = this.f287776g;
            hVar2.f287616g = e0Var.f287962h;
            io.ably.lib.types.o oVar = e0Var.f287967m;
            hVar2.f287614e = oVar.f288135b;
            this.B = oVar.f288141h.longValue();
            this.f287795z = oVar.f288142i.longValue();
            this.A = oVar.f288137d;
            try {
                this.f287774e.f287677d.A(oVar.f288134a);
                io.ably.lib.realtime.h hVar3 = this.f287776g;
                hVar3.f287615f = hVar3.m();
                p0(new w(io.ably.lib.realtime.j.connected, e0Var.f287958d, null, null));
            } catch (io.ably.lib.types.a e10) {
                q0(this.f287790u, new w(io.ably.lib.realtime.j.failed, e10.f287918a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void h0(e0 e0Var) {
        try {
            io.ably.lib.types.r rVar = e0Var.f287958d;
            if (rVar != null && Z(rVar)) {
                this.f287774e.f287677d.u(rVar);
            }
            p0(new w(io.ably.lib.realtime.j.disconnected, rVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void i0(e0 e0Var) {
        try {
            this.f287776g.f287614e = null;
            io.ably.lib.types.r rVar = e0Var.f287958d;
            if (Z(rVar)) {
                this.f287774e.f287677d.u(rVar);
            }
            q0(this.f287790u, new w(Y(rVar) ? io.ably.lib.realtime.j.failed : io.ably.lib.realtime.j.disconnected, rVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j0(e0 e0Var) {
        synchronized (this.f287780k) {
            try {
                this.f287780k.clear();
                this.f287780k.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l0(e0 e0Var) {
        this.f287779j.d(e0Var.f287963i.longValue(), e0Var.f287957c, e0Var.f287958d);
    }

    private void n0() {
        for (io.ably.lib.realtime.b bVar : this.f287775f.values()) {
            io.ably.lib.realtime.e eVar = bVar.f287538e;
            if (eVar == io.ably.lib.realtime.e.attached || eVar == io.ably.lib.realtime.e.attaching) {
                bVar.n0(I);
            }
            bVar.t0();
        }
    }

    private synchronized void q0(io.ably.lib.transport.e eVar, w wVar) {
        try {
            io.ably.lib.util.k.k(F, "requestState(): requesting " + wVar.f287829a + "; id = " + this.f287776g.f287616g);
            C(new e(eVar, wVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void s0(s sVar) throws io.ably.lib.types.a {
        if (this.f287790u == null) {
            io.ably.lib.util.k.k(F, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        e0 e0Var = sVar.f287815a;
        if (e0.b(e0Var)) {
            long j10 = this.f287792w;
            this.f287792w = 1 + j10;
            e0Var.f287963i = Long.valueOf(j10);
            this.f287779j.f(sVar);
        }
        lg.a.b bVar = this.D;
        if (bVar != null) {
            bVar.b(e0Var);
        }
        this.f287790u.a(e0Var);
    }

    private void t0(e0 e0Var, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        if (this.f287790u == null) {
            io.ably.lib.util.k.k(F, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        if (e0.b(e0Var)) {
            long j10 = this.f287792w;
            this.f287792w = 1 + j10;
            e0Var.f287963i = Long.valueOf(j10);
            this.f287779j.f(new s(e0Var, gVar));
        }
        lg.a.b bVar = this.D;
        if (bVar != null) {
            bVar.b(e0Var);
        }
        this.f287790u.a(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        List<s> list;
        synchronized (this) {
            while (!this.f287778i.isEmpty()) {
                try {
                    try {
                        s sVar = this.f287778i.get(0);
                        if (sVar.f287815a.f287955a != e0.a.attach) {
                            s0(sVar);
                        }
                        list = this.f287778i;
                    } catch (io.ably.lib.types.a e10) {
                        io.ably.lib.util.k.e(F, "sendQueuedMessages(): Unexpected error sending queued messages", e10);
                        list = this.f287778i;
                    }
                    list.remove(0);
                } catch (Throwable th2) {
                    this.f287778i.remove(0);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized io.ably.lib.realtime.k.a w0(io.ably.lib.transport.e eVar, w wVar) {
        if (eVar != null) {
            try {
                if (eVar != this.f287790u) {
                    io.ably.lib.util.k.k(F, "setState: action received for superseded transport; discarding");
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w wVarD = this.f287786q.d(wVar);
        if (wVarD == null) {
            io.ably.lib.util.k.k(F, "setState(): not transitioning; not a valid transition " + wVar.f287829a);
            return null;
        }
        io.ably.lib.realtime.j jVar = wVar.f287829a;
        if (jVar == io.ably.lib.realtime.j.connected || jVar == io.ably.lib.realtime.j.suspended) {
            this.C = 0;
        }
        io.ably.lib.realtime.j jVar2 = io.ably.lib.realtime.j.disconnected;
        if (jVar == jVar2) {
            u uVar = this.f287785p.get(jVar2);
            long j10 = this.f287774e.f287674a.G;
            int i10 = this.C + 1;
            this.C = i10;
            uVar.f287823f = io.ably.lib.util.o.c(j10, i10);
        }
        io.ably.lib.realtime.j jVar3 = wVar.f287829a;
        if (jVar3 == io.ably.lib.realtime.j.closing || jVar3 == io.ably.lib.realtime.j.closed || jVar3 == io.ably.lib.realtime.j.suspended || jVar3 == io.ably.lib.realtime.j.failed) {
            io.ably.lib.realtime.h hVar = this.f287776g;
            hVar.f287616g = null;
            hVar.f287614e = null;
        }
        io.ably.lib.realtime.j jVar4 = wVarD.f287829a;
        u uVar2 = this.f287785p.get(jVar4);
        io.ably.lib.types.r rVar = wVarD.f287830b;
        if (rVar == null) {
            rVar = uVar2.f287819b;
        }
        io.ably.lib.types.r rVar2 = rVar;
        io.ably.lib.util.k.k(F, "setState(): setting " + uVar2.f287818a + "; reason " + rVar2);
        io.ably.lib.realtime.k.a aVar = new io.ably.lib.realtime.k.a(this.f287786q.f287818a, jVar4, uVar2.f287823f, rVar2);
        this.f287786q = uVar2;
        this.f287771b = uVar2.f287822e;
        this.f287787r = rVar2;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void x0() {
        try {
            this.f287791v = System.currentTimeMillis() + this.f287795z;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void y0() {
        this.f287794y = new f(this, null);
        this.f287774e.f287679f.a().c(this.f287794y);
    }

    private synchronized void z0() throws InterruptedException {
        while (this.f287771b) {
            try {
                io.ably.lib.util.k.k(F, "Waiting for termination action to clean up handler thread");
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f287784o == null) {
            Thread thread = new Thread(new c());
            this.f287784o = thread;
            thread.start();
            y0();
        } else {
            io.ably.lib.util.k.k(F, "`connect()` has been called twice on uninitialized or terminal state");
        }
    }

    protected boolean F() {
        try {
            return io.ably.lib.http.j.d(this.f287774e.f287676c, G).contains(H);
        } catch (io.ably.lib.types.a e10) {
            io.ably.lib.util.k.c(F, "Exception whilst checking connectivity", e10);
            return false;
        }
    }

    public void K() {
        this.f287772c = true;
        o0(io.ably.lib.realtime.j.closing);
    }

    public synchronized void M() {
        u uVar = this.f287786q;
        if (uVar.f287822e || uVar.f287818a == io.ably.lib.realtime.j.initialized) {
            try {
                z0();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                io.ably.lib.util.k.e(F, "Failed to start up connection", e10);
                return;
            }
        }
        if (this.f287772c || this.f287786q.f287822e) {
            n0();
            this.f287772c = false;
        }
        o0(io.ably.lib.realtime.j.connecting);
    }

    void O() {
        io.ably.lib.transport.e eVar = this.f287790u;
        if (eVar != null) {
            eVar.close();
        }
        this.f287789t = true;
    }

    public synchronized u R() {
        try {
        } finally {
        }
        return this.f287786q;
    }

    public String S() {
        return this.E;
    }

    public List<s> T() {
        return this.f287779j.f287814a;
    }

    public io.ably.lib.types.r U() {
        io.ably.lib.types.r rVar = this.f287787r;
        return rVar != null ? rVar : this.f287786q.f287819b;
    }

    public boolean X() {
        u uVar = this.f287786q;
        return uVar.f287820c || uVar.f287821d;
    }

    @Override // io.ably.lib.transport.e.a
    public synchronized void a(io.ably.lib.transport.e eVar, io.ably.lib.types.r rVar) {
        w wVarH;
        try {
            String str = F;
            io.ably.lib.util.k.k(str, "onTransportUnavailable()");
            if (this.f287790u != eVar) {
                io.ably.lib.util.k.k(str, "onTransportUnavailable: ignoring disconnection event from superseded transport");
                return;
            }
            if (this.f287786q.f287818a == io.ably.lib.realtime.j.connected) {
                x0();
            }
            if (this.f287786q.f287818a == io.ably.lib.realtime.j.closing) {
                o0(io.ably.lib.realtime.j.closed);
                return;
            }
            w wVarG = G(rVar);
            if (wVarG != null) {
                p0(wVarG);
                return;
            }
            if (rVar == null) {
                wVarH = null;
            } else if (Y(rVar)) {
                io.ably.lib.util.k.d(str, "onTransportUnavailable: unexpected transport error: " + rVar.f288158c);
                wVarH = new w(io.ably.lib.realtime.j.failed, rVar);
            } else {
                if (Z(rVar)) {
                    this.f287774e.f287677d.u(rVar);
                }
                wVarH = null;
            }
            if (wVarH == null) {
                wVarH = H(rVar);
            }
            C(new y(eVar, wVarH));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.ably.lib.transport.e.a
    public synchronized void b(io.ably.lib.transport.e eVar) {
        try {
            if (this.f287790u != eVar) {
                io.ably.lib.util.k.k(F, "onTransportAvailable: ignoring connection event from superseded transport");
                return;
            }
            lg.a.b bVar = this.D;
            if (bVar != null) {
                bVar.c(eVar.b());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b0(io.ably.lib.types.r rVar) {
        io.ably.lib.util.k.f(F, String.format(Locale.ROOT, "onAuthError: (%d) %s", Integer.valueOf(rVar.f288156a), rVar.f288158c));
        if (rVar.f288157b == 403) {
            this.f287776g.q(new io.ably.lib.realtime.k.a(this.f287776g.f287612c, io.ably.lib.realtime.j.failed, 0L, rVar));
            return;
        }
        int i10 = a.f287796a[this.f287786q.f287818a.ordinal()];
        if (i10 == 1) {
            C(new z(rVar));
        } else if (i10 == 2 && this.f287790u != null) {
            p0(new w(io.ably.lib.realtime.j.disconnected, rVar));
        }
    }

    public void c0(String str, boolean z10) throws io.ably.lib.types.a {
        m mVar = new m(this, null);
        try {
            int i10 = a.f287796a[this.f287786q.f287818a.ordinal()];
            if (i10 == 1) {
                try {
                    e0 e0Var = new e0(e0.a.auth);
                    e0Var.f287968n = new e0.c(str);
                    r0(e0Var, false, null);
                } catch (io.ably.lib.types.a unused) {
                    io.ably.lib.util.k.k(F, "onAuthUpdated: closing transport after send failure");
                    this.f287790u.close();
                }
            } else if (i10 != 2) {
                M();
            } else {
                io.ably.lib.util.k.k(F, "onAuthUpdated: closing connecting transport");
                p0(new w(io.ably.lib.realtime.j.disconnected, new io.ably.lib.types.r("Aborting incomplete connection with superseded auth params", 503, 80003), null, null));
                M();
            }
            if (!z10) {
                mVar.d();
                return;
            }
            boolean z11 = true;
            while (z11) {
                io.ably.lib.types.r rVarE = mVar.e();
                io.ably.lib.realtime.j jVar = this.f287786q.f287818a;
                int i11 = a.f287796a[jVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        io.ably.lib.util.k.k(F, "onAuthUpdated: throwing exception");
                        throw io.ably.lib.types.a.a(rVarE);
                    }
                    io.ably.lib.util.k.k(F, "onAuthUpdated: " + jVar);
                } else {
                    io.ably.lib.util.k.k(F, "onAuthUpdated: got connected");
                    z11 = false;
                }
            }
            mVar.d();
        } catch (Throwable th2) {
            mVar.d();
            throw th2;
        }
    }

    public void d0(String str, final io.ably.lib.rest.d.f fVar) {
        final m mVar = new m(this, null);
        int i10 = a.f287796a[this.f287786q.f287818a.ordinal()];
        if (i10 == 1) {
            try {
                e0 e0Var = new e0(e0.a.auth);
                e0Var.f287968n = new e0.c(str);
                r0(e0Var, false, null);
            } catch (io.ably.lib.types.a unused) {
                io.ably.lib.util.k.k(F, "onAuthUpdated: closing transport after send failure");
                this.f287790u.close();
            }
        } else if (i10 != 2) {
            M();
        } else {
            io.ably.lib.util.k.k(F, "onAuthUpdated: closing connecting transport");
            p0(new w(io.ably.lib.realtime.j.disconnected, new io.ably.lib.types.r("Aborting incomplete connection with superseded auth params", 503, 80003), null, null));
            M();
        }
        this.f287770a.execute(new Runnable() { // from class: io.ably.lib.transport.a
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f287767a, mVar, fVar);
            }
        });
    }

    public void k0(io.ably.lib.transport.e eVar, e0 e0Var) throws io.ably.lib.types.a {
        if (eVar == null || this.f287790u == eVar) {
            if (io.ably.lib.util.k.f288243h <= 2) {
                io.ably.lib.util.k.k(F, "onMessage() (transport = " + eVar + "): " + e0Var.f287955a + ": " + new String(f0.c(e0Var)));
            }
            try {
                lg.a.b bVar = this.D;
                if (bVar != null) {
                    bVar.a(e0Var);
                }
                switch (a.f287797b[e0Var.f287955a.ordinal()]) {
                    case 1:
                        j0(e0Var);
                        return;
                    case 2:
                        io.ably.lib.types.r rVar = e0Var.f287958d;
                        if (rVar == null) {
                            io.ably.lib.util.k.d(F, "onMessage(): ERROR message received (no error detail)");
                        } else {
                            io.ably.lib.util.k.d(F, "onMessage(): ERROR message received; message = " + rVar.f288158c + "; code = " + rVar.f288156a);
                        }
                        if (e0Var.f287960f != null) {
                            e0(e0Var);
                            return;
                        } else {
                            i0(e0Var);
                            return;
                        }
                    case 3:
                        if (this.f287786q.f287818a != io.ably.lib.realtime.j.closing) {
                            g0(e0Var);
                            return;
                        } else if (!B0()) {
                            o0(io.ably.lib.realtime.j.closed);
                        }
                        break;
                    case 4:
                    case 5:
                        h0(e0Var);
                        return;
                    case 6:
                        f0(e0Var);
                        return;
                    case 7:
                        a0(e0Var);
                        return;
                    case 8:
                        l0(e0Var);
                        return;
                    case 9:
                        C(new t(this, null));
                        return;
                    case 10:
                    case 11:
                        mg.b bVar2 = this.f287773d;
                        if (bVar2 != null) {
                            try {
                                bVar2.a(e0Var);
                                return;
                            } catch (Throwable th2) {
                                io.ably.lib.util.k.e(F, "objectsPlugin threw while handling message", th2);
                            }
                        }
                        break;
                    default:
                        e0(e0Var);
                        return;
                }
            } catch (Exception e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    public void m0(io.ably.lib.realtime.g gVar) {
        p pVar = new p(gVar);
        if (this.f287786q.f287818a != io.ably.lib.realtime.j.connected) {
            pVar.c(new io.ably.lib.types.r("Unable to ping service; not connected", 40000, 400));
            return;
        }
        synchronized (this.f287780k) {
            this.f287780k.add(pVar);
            pVar.start();
        }
        try {
            r0(new e0(e0.a.heartbeat), false, null);
        } catch (io.ably.lib.types.a e10) {
            pVar.c(e10.f287918a);
        }
    }

    public void o0(io.ably.lib.realtime.j jVar) {
        p0(new w(jVar, null));
    }

    public void p0(w wVar) {
        q0(null, wVar);
    }

    public void r0(e0 e0Var, boolean z10, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        synchronized (this) {
            try {
                u uVar = this.f287786q;
                if (uVar.f287821d) {
                    t0(e0Var, gVar);
                } else {
                    if (!uVar.f287820c || !z10) {
                        throw io.ably.lib.types.a.a(uVar.f287819b);
                    }
                    this.f287778i.add(new s(e0Var, gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void v0(long j10) {
        this.f287793x = j10;
    }

    private class e extends v implements InterfaceRunnableC1944b {
        e(io.ably.lib.realtime.j jVar) {
            super(null, new w(jVar, null));
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }

        e(io.ably.lib.transport.e eVar, w wVar) {
            super(eVar, wVar);
        }
    }

    private static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<s> f287814a;

        private r() {
            this.f287814a = new ArrayList();
        }

        public void b(long j10, int i10, io.ably.lib.types.r rVar) {
            s[] sVarArr;
            synchronized (this) {
                try {
                    if (this.f287814a.isEmpty()) {
                        return;
                    }
                    long jLongValue = this.f287814a.get(0).f287815a.f287963i.longValue();
                    if (j10 < jLongValue) {
                        i10 -= (int) (jLongValue - j10);
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        j10 = jLongValue;
                    }
                    s[] sVarArr2 = null;
                    if (j10 > jLongValue) {
                        int i11 = (int) (j10 - jLongValue);
                        List<s> listSubList = this.f287814a.subList(0, i11);
                        sVarArr = (s[]) listSubList.toArray(new s[i11]);
                        listSubList.clear();
                        jLongValue = j10;
                    } else {
                        sVarArr = null;
                    }
                    if (j10 == jLongValue) {
                        List<s> listSubList2 = this.f287814a.subList(0, i10);
                        sVarArr2 = (s[]) listSubList2.toArray(new s[i10]);
                        listSubList2.clear();
                    }
                    if (sVarArr != null) {
                        if (rVar == null) {
                            rVar = new io.ably.lib.types.r("Unknown error", 500, 50000);
                        }
                        for (s sVar : sVarArr) {
                            try {
                                io.ably.lib.realtime.g gVar = sVar.f287816b;
                                if (gVar != null) {
                                    gVar.a(rVar);
                                }
                            } catch (Throwable th2) {
                                io.ably.lib.util.k.e(b.F, "ack(): listener exception", th2);
                            }
                        }
                    }
                    if (sVarArr2 != null) {
                        for (s sVar2 : sVarArr2) {
                            try {
                                io.ably.lib.realtime.g gVar2 = sVar2.f287816b;
                                if (gVar2 != null) {
                                    gVar2.onSuccess();
                                }
                            } catch (Throwable th3) {
                                io.ably.lib.util.k.e(b.F, "ack(): listener exception", th3);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        synchronized void c(io.ably.lib.types.r rVar) {
            try {
                Iterator<s> it = this.f287814a.iterator();
                while (it.hasNext()) {
                    io.ably.lib.realtime.g gVar = it.next().f287816b;
                    if (gVar != null) {
                        gVar.a(rVar);
                    }
                }
                this.f287814a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void d(long j10, int i10, io.ably.lib.types.r rVar) {
            try {
                synchronized (this) {
                    try {
                        if (this.f287814a.isEmpty()) {
                            return;
                        }
                        long jLongValue = this.f287814a.get(0).f287815a.f287963i.longValue();
                        if (j10 != jLongValue) {
                            i10 -= (int) (jLongValue - j10);
                        }
                        List<s> listSubList = this.f287814a.subList(0, i10);
                        s[] sVarArr = (s[]) listSubList.toArray(new s[i10]);
                        listSubList.clear();
                        if (sVarArr != null) {
                            if (rVar == null) {
                                rVar = new io.ably.lib.types.r("Unknown error", 500, 50000);
                            }
                            for (s sVar : sVarArr) {
                                try {
                                    io.ably.lib.realtime.g gVar = sVar.f287816b;
                                    if (gVar != null) {
                                        gVar.a(rVar);
                                    }
                                } catch (Throwable th2) {
                                    io.ably.lib.util.k.e(b.F, "nack(): listener exception", th2);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }

        synchronized List<s> e() {
            ArrayList arrayList;
            try {
                arrayList = new ArrayList(this.f287814a);
                this.f287814a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
            return arrayList;
        }

        public synchronized void f(s sVar) {
            this.f287814a.add(sVar);
        }

        /* synthetic */ r(a aVar) {
            this();
        }
    }
}
