package io.grpc.internal;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
abstract class m2<ReqT> implements io.grpc.internal.s {

    @com.google.common.annotations.e
    static final io.grpc.v1.i<String> A;

    @com.google.common.annotations.e
    static final io.grpc.v1.i<String> B;
    private static final io.grpc.y2 C;
    private static Random D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.w1<ReqT, ?> f289349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f289350b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f289352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.grpc.v1 f289353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.h
    private final n2 f289354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.h
    private final x0 f289355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f289356h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f289358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f289359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f289360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @fj.h
    private final e0 f289361m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z f289367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private long f289368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.grpc.internal.t f289369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private v f289370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private v f289371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f289372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private io.grpc.y2 f289373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f289374z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f289351c = new io.grpc.c3(new a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f289357i = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final b1 f289362n = new b1();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile b0 f289363o = new b0(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f289364p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicInteger f289365q = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicInteger f289366r = new AtomicInteger();

    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            throw io.grpc.y2.n(th2).u("Uncaught exception in the SynchronizationContext. Re-thrown.").e();
        }
    }

    class a0 implements s {
        a0() {
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.v(new c0(d0Var));
        }
    }

    class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f289377a;

        b(String str) {
            this.f289377a = str;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.s(this.f289377a);
        }
    }

    private static final class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f289379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final List<s> f289380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Collection<d0> f289381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection<d0> f289382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f289383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.h
        final d0 f289384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f289385g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f289386h;

        b0(@fj.h List<s> list, Collection<d0> collection, Collection<d0> collection2, @fj.h d0 d0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f289380b = list;
            this.f289381c = (Collection) com.google.common.base.j0.F(collection, "drainedSubstreams");
            this.f289384f = d0Var;
            this.f289382d = collection2;
            this.f289385g = z10;
            this.f289379a = z11;
            this.f289386h = z12;
            this.f289383e = i10;
            com.google.common.base.j0.h0(!z11 || list == null, "passThrough should imply buffer is null");
            com.google.common.base.j0.h0((z11 && d0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            com.google.common.base.j0.h0(!z11 || (collection.size() == 1 && collection.contains(d0Var)) || (collection.size() == 0 && d0Var.f289409b), "passThrough should imply winningSubstream is drained");
            com.google.common.base.j0.h0((z10 && d0Var == null) ? false : true, "cancelled should imply committed");
        }

        @fj.c
        b0 a(d0 d0Var) {
            Collection collectionUnmodifiableCollection;
            com.google.common.base.j0.h0(!this.f289386h, "hedging frozen");
            com.google.common.base.j0.h0(this.f289384f == null, "already committed");
            if (this.f289382d == null) {
                collectionUnmodifiableCollection = Collections.singleton(d0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f289382d);
                arrayList.add(d0Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new b0(this.f289380b, this.f289381c, collectionUnmodifiableCollection, this.f289384f, this.f289385g, this.f289379a, this.f289386h, this.f289383e + 1);
        }

        @fj.c
        b0 b() {
            return new b0(this.f289380b, this.f289381c, this.f289382d, this.f289384f, true, this.f289379a, this.f289386h, this.f289383e);
        }

        @fj.c
        b0 c(d0 d0Var) {
            List<s> list;
            boolean z10;
            Collection collectionSingleton;
            com.google.common.base.j0.h0(this.f289384f == null, "Already committed");
            List<s> list2 = this.f289380b;
            if (this.f289381c.contains(d0Var)) {
                collectionSingleton = Collections.singleton(d0Var);
                list = null;
                z10 = true;
            } else {
                list = list2;
                z10 = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            return new b0(list, collectionSingleton, this.f289382d, d0Var, this.f289385g, z10, this.f289386h, this.f289383e);
        }

        @fj.c
        b0 d() {
            return this.f289386h ? this : new b0(this.f289380b, this.f289381c, this.f289382d, this.f289384f, this.f289385g, this.f289379a, true, this.f289383e);
        }

        @fj.c
        b0 e(d0 d0Var) {
            ArrayList arrayList = new ArrayList(this.f289382d);
            arrayList.remove(d0Var);
            return new b0(this.f289380b, this.f289381c, Collections.unmodifiableCollection(arrayList), this.f289384f, this.f289385g, this.f289379a, this.f289386h, this.f289383e);
        }

        @fj.c
        b0 f(d0 d0Var, d0 d0Var2) {
            ArrayList arrayList = new ArrayList(this.f289382d);
            arrayList.remove(d0Var);
            arrayList.add(d0Var2);
            return new b0(this.f289380b, this.f289381c, Collections.unmodifiableCollection(arrayList), this.f289384f, this.f289385g, this.f289379a, this.f289386h, this.f289383e);
        }

        @fj.c
        b0 g(d0 d0Var) {
            d0Var.f289409b = true;
            if (!this.f289381c.contains(d0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f289381c);
            arrayList.remove(d0Var);
            return new b0(this.f289380b, Collections.unmodifiableCollection(arrayList), this.f289382d, this.f289384f, this.f289385g, this.f289379a, this.f289386h, this.f289383e);
        }

        @fj.c
        b0 h(d0 d0Var) {
            Collection collectionUnmodifiableCollection;
            com.google.common.base.j0.h0(!this.f289379a, "Already passThrough");
            if (d0Var.f289409b) {
                collectionUnmodifiableCollection = this.f289381c;
            } else if (this.f289381c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(d0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f289381c);
                arrayList.add(d0Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            d0 d0Var2 = this.f289384f;
            boolean z10 = d0Var2 != null;
            List<s> list = this.f289380b;
            if (z10) {
                com.google.common.base.j0.h0(d0Var2 == d0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new b0(list, collection, this.f289382d, this.f289384f, this.f289385g, z10, this.f289386h, this.f289383e);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f289387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f289388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Future f289389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Future f289390d;

        c(Collection collection, d0 d0Var, Future future, Future future2) {
            this.f289387a = collection;
            this.f289388b = d0Var;
            this.f289389c = future;
            this.f289390d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (d0 d0Var : this.f289387a) {
                if (d0Var != this.f289388b) {
                    d0Var.f289408a.a(m2.C);
                }
            }
            Future future = this.f289389c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f289390d;
            if (future2 != null) {
                future2.cancel(false);
            }
            m2.this.q0();
        }
    }

    private final class c0 implements io.grpc.internal.t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f289392c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d0 f289393a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f289395a;

            a(io.grpc.v1 v1Var) {
                this.f289395a = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f289369u.c(this.f289395a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0 f289397a;

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    m2.this.m0(bVar.f289397a);
                }
            }

            b(d0 d0Var) {
                this.f289397a = d0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f289350b.execute(new a());
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f289374z = true;
                m2.this.f289369u.f(m2.this.f289367s.f289458a, m2.this.f289367s.f289459b, m2.this.f289367s.f289460c);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0 f289401a;

            d(d0 d0Var) {
                this.f289401a = d0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.m0(this.f289401a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k3.a f289403a;

            e(k3.a aVar) {
                this.f289403a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f289369u.a(this.f289403a);
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!m2.this.f289374z) {
                    m2.this.f289369u.e();
                }
            }
        }

        c0(d0 d0Var) {
            this.f289393a = d0Var;
        }

        @fj.h
        private Integer g(io.grpc.v1 v1Var) {
            String str = (String) v1Var.l(m2.B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private w h(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
            Integer numG = g(v1Var);
            boolean zContains = m2.this.f289355g.f290107c.contains(y2Var.p());
            boolean z10 = (m2.this.f289361m == null || (!zContains && (numG == null || numG.intValue() >= 0))) ? false : !m2.this.f289361m.b();
            if (zContains && !z10 && !y2Var.r() && numG != null && numG.intValue() > 0) {
                numG = 0;
            }
            return new w(zContains && !z10, numG);
        }

        private y i(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
            long nanos = 0;
            boolean z10 = false;
            if (m2.this.f289354f == null) {
                return new y(false, 0L);
            }
            boolean zContains = m2.this.f289354f.f289632f.contains(y2Var.p());
            Integer numG = g(v1Var);
            boolean z11 = (m2.this.f289361m == null || (!zContains && (numG == null || numG.intValue() >= 0))) ? false : !m2.this.f289361m.b();
            if (m2.this.f289354f.f289627a > this.f289393a.f289411d + 1 && !z11) {
                if (numG == null) {
                    if (zContains) {
                        nanos = (long) (m2.this.f289372x * m2.D.nextDouble());
                        m2 m2Var = m2.this;
                        m2Var.f289372x = Math.min((long) (m2Var.f289372x * m2.this.f289354f.f289630d), m2.this.f289354f.f289629c);
                        z10 = true;
                    }
                } else if (numG.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numG.intValue());
                    m2 m2Var2 = m2.this;
                    m2Var2.f289372x = m2Var2.f289354f.f289628b;
                    z10 = true;
                }
            }
            return new y(z10, nanos);
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            b0 b0Var = m2.this.f289363o;
            com.google.common.base.j0.h0(b0Var.f289384f != null, "Headers should be received prior to messages.");
            if (b0Var.f289384f != this.f289393a) {
                v0.e(aVar);
            } else {
                m2.this.f289351c.execute(new e(aVar));
            }
        }

        @Override // io.grpc.internal.t
        public void c(io.grpc.v1 v1Var) {
            if (this.f289393a.f289411d > 0) {
                io.grpc.v1.i<String> iVar = m2.A;
                v1Var.j(iVar);
                v1Var.w(iVar, String.valueOf(this.f289393a.f289411d));
            }
            m2.this.j0(this.f289393a);
            if (m2.this.f289363o.f289384f == this.f289393a) {
                if (m2.this.f289361m != null) {
                    m2.this.f289361m.c();
                }
                m2.this.f289351c.execute(new a(v1Var));
            }
        }

        @Override // io.grpc.internal.k3
        public void e() {
            if (m2.this.isReady()) {
                m2.this.f289351c.execute(new f());
            }
        }

        /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
        @Override // io.grpc.internal.t
        public void f(io.grpc.y2 y2Var, io.grpc.internal.t.a aVar, io.grpc.v1 v1Var) {
            v vVar;
            synchronized (m2.this.f289357i) {
                try {
                    m2 m2Var = m2.this;
                    m2Var.f289363o = m2Var.f289363o.g(this.f289393a);
                    m2.this.f289362n.a(y2Var.p());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (m2.this.f289366r.decrementAndGet() == Integer.MIN_VALUE) {
                m2.this.f289351c.execute(new c());
                return;
            }
            d0 d0Var = this.f289393a;
            if (d0Var.f289410c) {
                m2.this.j0(d0Var);
                if (m2.this.f289363o.f289384f == this.f289393a) {
                    m2.this.t0(y2Var, aVar, v1Var);
                }
            } else {
                io.grpc.internal.t.a aVar2 = io.grpc.internal.t.a.MISCARRIED;
                if (aVar == aVar2 && m2.this.f289365q.incrementAndGet() > 1000) {
                    m2.this.j0(this.f289393a);
                    if (m2.this.f289363o.f289384f == this.f289393a) {
                        m2.this.t0(io.grpc.y2.f291464s.u("Too many transparent retries. Might be a bug in gRPC").t(y2Var.e()), aVar, v1Var);
                    }
                } else if (m2.this.f289363o.f289384f != null) {
                    m2.this.j0(this.f289393a);
                    if (m2.this.f289363o.f289384f == this.f289393a) {
                        m2.this.t0(y2Var, aVar, v1Var);
                    }
                } else if (aVar == aVar2 || (aVar == io.grpc.internal.t.a.REFUSED && m2.this.f289364p.compareAndSet(false, true))) {
                    d0 d0VarK0 = m2.this.k0(this.f289393a.f289411d, true);
                    if (d0VarK0 != null) {
                        if (m2.this.f289356h) {
                            synchronized (m2.this.f289357i) {
                                m2 m2Var2 = m2.this;
                                m2Var2.f289363o = m2Var2.f289363o.f(this.f289393a, d0VarK0);
                            }
                        }
                        m2.this.f289350b.execute(new d(d0VarK0));
                    }
                } else {
                    if (aVar != io.grpc.internal.t.a.DROPPED) {
                        m2.this.f289364p.set(true);
                        if (m2.this.f289356h) {
                            w wVarH = h(y2Var, v1Var);
                            if (wVarH.f289450a) {
                                m2.this.s0(wVarH.f289451b);
                            }
                            synchronized (m2.this.f289357i) {
                                try {
                                    m2 m2Var3 = m2.this;
                                    m2Var3.f289363o = m2Var3.f289363o.e(this.f289393a);
                                    if (wVarH.f289450a) {
                                        m2 m2Var4 = m2.this;
                                        if (!m2Var4.o0(m2Var4.f289363o)) {
                                            if (!m2.this.f289363o.f289382d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } else {
                            y yVarI = i(y2Var, v1Var);
                            if (yVarI.f289456a) {
                                d0 d0VarK1 = m2.this.k0(this.f289393a.f289411d + 1, false);
                                if (d0VarK1 != null) {
                                    synchronized (m2.this.f289357i) {
                                        try {
                                            m2 m2Var5 = m2.this;
                                            vVar = new v(m2Var5.f289357i);
                                            m2Var5.f289370v = vVar;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    vVar.c(m2.this.f289352d.schedule(new b(d0VarK1), yVarI.f289457b, TimeUnit.NANOSECONDS));
                                    return;
                                }
                            }
                        }
                    } else if (m2.this.f289356h) {
                        m2.this.n0();
                    }
                    m2.this.j0(this.f289393a);
                    if (m2.this.f289363o.f289384f == this.f289393a) {
                        m2.this.t0(y2Var, aVar, v1Var);
                    }
                }
            }
        }
    }

    class d implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.s f289406a;

        d(io.grpc.s sVar) {
            this.f289406a = sVar;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.c(this.f289406a);
        }
    }

    private static final class d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.grpc.internal.s f289408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f289409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f289410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f289411d;

        d0(int i10) {
            this.f289411d = i10;
        }
    }

    class e implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y f289412a;

        e(io.grpc.y yVar) {
            this.f289412a = yVar;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.u(this.f289412a);
        }
    }

    static final class e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f289414e = 1000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f289415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f289416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f289417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f289418d;

        e0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f289418d = atomicInteger;
            this.f289417c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f289415a = i10;
            this.f289416b = i10 / 2;
            atomicInteger.set(i10);
        }

        @com.google.common.annotations.e
        boolean a() {
            return this.f289418d.get() > this.f289416b;
        }

        @com.google.common.annotations.e
        boolean b() {
            int i10;
            int i11;
            do {
                i10 = this.f289418d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f289418d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f289416b;
        }

        @com.google.common.annotations.e
        void c() {
            int i10;
            int i11;
            do {
                i10 = this.f289418d.get();
                i11 = this.f289415a;
                if (i10 == i11) {
                    break;
                }
            } while (!this.f289418d.compareAndSet(i10, Math.min(this.f289417c + i10, i11)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return this.f289415a == e0Var.f289415a && this.f289417c == e0Var.f289417c;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(Integer.valueOf(this.f289415a), Integer.valueOf(this.f289417c));
        }
    }

    class f implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.a0 f289419a;

        f(io.grpc.a0 a0Var) {
            this.f289419a = a0Var;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.q(this.f289419a);
        }
    }

    class g implements s {
        g() {
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.flush();
        }
    }

    class h implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f289422a;

        h(boolean z10) {
            this.f289422a = z10;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.k(this.f289422a);
        }
    }

    class i implements s {
        i() {
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.o();
        }
    }

    class j implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289425a;

        j(int i10) {
            this.f289425a = i10;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.d(this.f289425a);
        }
    }

    class k implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289427a;

        k(int i10) {
            this.f289427a = i10;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.e(this.f289427a);
        }
    }

    class l implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f289429a;

        l(boolean z10) {
            this.f289429a = z10;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.g(this.f289429a);
        }
    }

    class m implements s {
        m() {
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.j();
        }
    }

    class n implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289432a;

        n(int i10) {
            this.f289432a = i10;
        }

        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.b(this.f289432a);
        }
    }

    class o implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f289434a;

        o(Object obj) {
            this.f289434a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.m2.s
        public void a(d0 d0Var) {
            d0Var.f289408a.i(m2.this.f289349a.u(this.f289434a));
            d0Var.f289408a.flush();
        }
    }

    class p extends io.grpc.n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.n f289436a;

        p(io.grpc.n nVar) {
            this.f289436a = nVar;
        }

        @Override // io.grpc.n.a
        public io.grpc.n a(io.grpc.n.b bVar, io.grpc.v1 v1Var) {
            return this.f289436a;
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m2.this.f289374z) {
                return;
            }
            m2.this.f289369u.e();
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f289439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.internal.t.a f289440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.grpc.v1 f289441c;

        r(io.grpc.y2 y2Var, io.grpc.internal.t.a aVar, io.grpc.v1 v1Var) {
            this.f289439a = y2Var;
            this.f289440b = aVar;
            this.f289441c = v1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2.this.f289374z = true;
            m2.this.f289369u.f(this.f289439a, this.f289440b, this.f289441c);
        }
    }

    private interface s {
        void a(d0 d0Var);
    }

    class t extends io.grpc.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f289443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        long f289444c;

        t(d0 d0Var) {
            this.f289443b = d0Var;
        }

        @Override // io.grpc.b3
        public void h(long j10) {
            if (m2.this.f289363o.f289384f != null) {
                return;
            }
            synchronized (m2.this.f289357i) {
                try {
                    if (m2.this.f289363o.f289384f == null && !this.f289443b.f289409b) {
                        long j11 = this.f289444c + j10;
                        this.f289444c = j11;
                        if (j11 <= m2.this.f289368t) {
                            return;
                        }
                        if (this.f289444c > m2.this.f289359k) {
                            this.f289443b.f289410c = true;
                        } else {
                            long jA = m2.this.f289358j.a(this.f289444c - m2.this.f289368t);
                            m2.this.f289368t = this.f289444c;
                            if (jA > m2.this.f289360l) {
                                this.f289443b.f289410c = true;
                            }
                        }
                        d0 d0Var = this.f289443b;
                        Runnable runnableI0 = d0Var.f289410c ? m2.this.i0(d0Var) : null;
                        if (runnableI0 != null) {
                            runnableI0.run();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicLong f289446a = new AtomicLong();

        u() {
        }

        @com.google.common.annotations.e
        long a(long j10) {
            return this.f289446a.addAndGet(j10);
        }
    }

    private static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f289447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        Future<?> f289448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @gj.a(io.sentry.protocol.z.b.f306551r)
        boolean f289449c;

        v(Object obj) {
            this.f289447a = obj;
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        boolean a() {
            return this.f289449c;
        }

        @gj.a(io.sentry.protocol.z.b.f306551r)
        @fj.a
        Future<?> b() {
            this.f289449c = true;
            return this.f289448b;
        }

        void c(Future<?> future) {
            synchronized (this.f289447a) {
                try {
                    if (!this.f289449c) {
                        this.f289448b = future;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f289450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final Integer f289451b;

        public w(boolean z10, @fj.h Integer num) {
            this.f289450a = z10;
            this.f289451b = num;
        }
    }

    private final class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v f289452a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0 f289454a;

            a(d0 d0Var) {
                this.f289454a = d0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                v vVar;
                boolean z10;
                synchronized (m2.this.f289357i) {
                    try {
                        vVar = null;
                        if (x.this.f289452a.a()) {
                            z10 = true;
                        } else {
                            m2 m2Var = m2.this;
                            m2Var.f289363o = m2Var.f289363o.a(this.f289454a);
                            m2 m2Var2 = m2.this;
                            if (m2Var2.o0(m2Var2.f289363o) && (m2.this.f289361m == null || m2.this.f289361m.a())) {
                                m2 m2Var3 = m2.this;
                                vVar = new v(m2Var3.f289357i);
                                m2Var3.f289371w = vVar;
                            } else {
                                m2 m2Var4 = m2.this;
                                m2Var4.f289363o = m2Var4.f289363o.d();
                                m2.this.f289371w = null;
                            }
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    this.f289454a.f289408a.v(new c0(this.f289454a));
                    this.f289454a.f289408a.a(io.grpc.y2.f291451f.u("Unneeded hedging"));
                } else {
                    if (vVar != null) {
                        vVar.c(m2.this.f289352d.schedule(new x(vVar), m2.this.f289355g.f290106b, TimeUnit.NANOSECONDS));
                    }
                    m2.this.m0(this.f289454a);
                }
            }
        }

        x(v vVar) {
            this.f289452a = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2 m2Var = m2.this;
            d0 d0VarK0 = m2Var.k0(m2Var.f289363o.f289383e, false);
            if (d0VarK0 == null) {
                return;
            }
            m2.this.f289350b.execute(new a(d0VarK0));
        }
    }

    private static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f289456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f289457b;

        y(boolean z10, long j10) {
            this.f289456a = z10;
            this.f289457b = j10;
        }
    }

    private static final class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.y2 f289458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.internal.t.a f289459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.grpc.v1 f289460c;

        z(io.grpc.y2 y2Var, io.grpc.internal.t.a aVar, io.grpc.v1 v1Var) {
            this.f289458a = y2Var;
            this.f289459b = aVar;
            this.f289460c = v1Var;
        }
    }

    static {
        io.grpc.v1.d<String> dVar = io.grpc.v1.f291323f;
        A = io.grpc.v1.i.e("grpc-previous-rpc-attempts", dVar);
        B = io.grpc.v1.i.e("grpc-retry-pushback-ms", dVar);
        C = io.grpc.y2.f291451f.u("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    m2(io.grpc.w1<ReqT, ?> w1Var, io.grpc.v1 v1Var, u uVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, @fj.h n2 n2Var, @fj.h x0 x0Var, @fj.h e0 e0Var) {
        this.f289349a = w1Var;
        this.f289358j = uVar;
        this.f289359k = j10;
        this.f289360l = j11;
        this.f289350b = executor;
        this.f289352d = scheduledExecutorService;
        this.f289353e = v1Var;
        this.f289354f = n2Var;
        if (n2Var != null) {
            this.f289372x = n2Var.f289628b;
        }
        this.f289355g = x0Var;
        com.google.common.base.j0.e(n2Var == null || x0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f289356h = x0Var != null;
        this.f289361m = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.h
    @fj.c
    public Runnable i0(d0 d0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f289357i) {
            try {
                if (this.f289363o.f289384f != null) {
                    return null;
                }
                Collection<d0> collection = this.f289363o.f289381c;
                this.f289363o = this.f289363o.c(d0Var);
                this.f289358j.a(-this.f289368t);
                v vVar = this.f289370v;
                if (vVar != null) {
                    Future<?> futureB = vVar.b();
                    this.f289370v = null;
                    future = futureB;
                } else {
                    future = null;
                }
                v vVar2 = this.f289371w;
                if (vVar2 != null) {
                    Future<?> futureB2 = vVar2.b();
                    this.f289371w = null;
                    future2 = futureB2;
                } else {
                    future2 = null;
                }
                return new c(collection, d0Var, future, future2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(d0 d0Var) {
        Runnable runnableI0 = i0(d0Var);
        if (runnableI0 != null) {
            this.f289350b.execute(runnableI0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.h
    public d0 k0(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f289366r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f289366r.compareAndSet(i11, i11 + 1));
        d0 d0Var = new d0(i10);
        d0Var.f289408a = p0(w0(this.f289353e, i10), new p(new t(d0Var)), i10, z10);
        return d0Var;
    }

    private void l0(s sVar) {
        Collection<d0> collection;
        synchronized (this.f289357i) {
            try {
                if (!this.f289363o.f289379a) {
                    this.f289363o.f289380b.add(sVar);
                }
                collection = this.f289363o.f289381c;
            } finally {
            }
        }
        Iterator<d0> it = collection.iterator();
        while (it.hasNext()) {
            sVar.a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r0.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r4 = (io.grpc.internal.m2.s) r0.next();
        r4.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        if ((r4 instanceof io.grpc.internal.m2.a0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        r4 = r9.f289363o;
        r5 = r4.f289384f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        if (r5 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        if (r5 == r10) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r4.f289385g == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m0(io.grpc.internal.m2.d0 r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.m2.m0(io.grpc.internal.m2$d0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        Future<?> future;
        synchronized (this.f289357i) {
            try {
                v vVar = this.f289371w;
                future = null;
                if (vVar != null) {
                    Future<?> futureB = vVar.b();
                    this.f289371w = null;
                    future = futureB;
                }
                this.f289363o = this.f289363o.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    public boolean o0(b0 b0Var) {
        return b0Var.f289384f == null && b0Var.f289383e < this.f289355g.f290105a && !b0Var.f289386h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(@fj.h Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            n0();
            return;
        }
        synchronized (this.f289357i) {
            try {
                v vVar = this.f289371w;
                if (vVar == null) {
                    return;
                }
                Future<?> futureB = vVar.b();
                v vVar2 = new v(this.f289357i);
                this.f289371w = vVar2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                vVar2.c(this.f289352d.schedule(new x(vVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(io.grpc.y2 y2Var, io.grpc.internal.t.a aVar, io.grpc.v1 v1Var) {
        this.f289367s = new z(y2Var, aVar, v1Var);
        if (this.f289366r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f289351c.execute(new r(y2Var, aVar, v1Var));
        }
    }

    @com.google.common.annotations.e
    static void v0(Random random) {
        D = random;
    }

    @Override // io.grpc.internal.s
    public final void a(io.grpc.y2 y2Var) {
        d0 d0Var;
        d0 d0Var2 = new d0(0);
        d0Var2.f289408a = new y1();
        Runnable runnableI0 = i0(d0Var2);
        if (runnableI0 != null) {
            synchronized (this.f289357i) {
                this.f289363o = this.f289363o.h(d0Var2);
            }
            runnableI0.run();
            t0(y2Var, io.grpc.internal.t.a.PROCESSED, new io.grpc.v1());
            return;
        }
        synchronized (this.f289357i) {
            try {
                if (this.f289363o.f289381c.contains(this.f289363o.f289384f)) {
                    d0Var = this.f289363o.f289384f;
                } else {
                    this.f289373y = y2Var;
                    d0Var = null;
                }
                this.f289363o = this.f289363o.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d0Var != null) {
            d0Var.f289408a.a(y2Var);
        }
    }

    @Override // io.grpc.internal.j3
    public final void b(int i10) {
        b0 b0Var = this.f289363o;
        if (b0Var.f289379a) {
            b0Var.f289384f.f289408a.b(i10);
        } else {
            l0(new n(i10));
        }
    }

    @Override // io.grpc.internal.j3
    public final void c(io.grpc.s sVar) {
        l0(new d(sVar));
    }

    @Override // io.grpc.internal.s
    public final void d(int i10) {
        l0(new j(i10));
    }

    @Override // io.grpc.internal.s
    public final void e(int i10) {
        l0(new k(i10));
    }

    @Override // io.grpc.internal.j3
    public final void flush() {
        b0 b0Var = this.f289363o;
        if (b0Var.f289379a) {
            b0Var.f289384f.f289408a.flush();
        } else {
            l0(new g());
        }
    }

    @Override // io.grpc.internal.j3
    public final void g(boolean z10) {
        l0(new l(z10));
    }

    @Override // io.grpc.internal.s
    public final io.grpc.a getAttributes() {
        return this.f289363o.f289384f != null ? this.f289363o.f289384f.f289408a.getAttributes() : io.grpc.a.f288673c;
    }

    @Override // io.grpc.internal.j3
    public final void i(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.j3
    public final boolean isReady() {
        Iterator<d0> it = this.f289363o.f289381c.iterator();
        while (it.hasNext()) {
            if (it.next().f289408a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.j3
    public void j() {
        l0(new m());
    }

    @Override // io.grpc.internal.s
    public final void k(boolean z10) {
        l0(new h(z10));
    }

    @Override // io.grpc.internal.s
    public final void o() {
        l0(new i());
    }

    abstract io.grpc.internal.s p0(io.grpc.v1 v1Var, io.grpc.n.a aVar, int i10, boolean z10);

    @Override // io.grpc.internal.s
    public final void q(io.grpc.a0 a0Var) {
        l0(new f(a0Var));
    }

    abstract void q0();

    @fj.h
    @fj.c
    abstract io.grpc.y2 r0();

    @Override // io.grpc.internal.s
    public final void s(String str) {
        l0(new b(str));
    }

    @Override // io.grpc.internal.s
    public void t(b1 b1Var) {
        b0 b0Var;
        synchronized (this.f289357i) {
            b1Var.b(MetricTracker.Action.CLOSED, this.f289362n);
            b0Var = this.f289363o;
        }
        if (b0Var.f289384f != null) {
            b1 b1Var2 = new b1();
            b0Var.f289384f.f289408a.t(b1Var2);
            b1Var.b("committed", b1Var2);
            return;
        }
        b1 b1Var3 = new b1();
        for (d0 d0Var : b0Var.f289381c) {
            b1 b1Var4 = new b1();
            d0Var.f289408a.t(b1Var4);
            b1Var3.a(b1Var4);
        }
        b1Var.b("open", b1Var3);
    }

    @Override // io.grpc.internal.s
    public final void u(io.grpc.y yVar) {
        l0(new e(yVar));
    }

    final void u0(ReqT reqt) {
        b0 b0Var = this.f289363o;
        if (b0Var.f289379a) {
            b0Var.f289384f.f289408a.i(this.f289349a.u(reqt));
        } else {
            l0(new o(reqt));
        }
    }

    @Override // io.grpc.internal.s
    public final void v(io.grpc.internal.t tVar) {
        v vVar;
        e0 e0Var;
        this.f289369u = tVar;
        io.grpc.y2 y2VarR0 = r0();
        if (y2VarR0 != null) {
            a(y2VarR0);
            return;
        }
        synchronized (this.f289357i) {
            try {
                this.f289363o.f289380b.add(new a0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0 d0VarK0 = k0(0, false);
        if (d0VarK0 == null) {
            return;
        }
        if (this.f289356h) {
            synchronized (this.f289357i) {
                try {
                    this.f289363o = this.f289363o.a(d0VarK0);
                    if (o0(this.f289363o) && ((e0Var = this.f289361m) == null || e0Var.a())) {
                        vVar = new v(this.f289357i);
                        this.f289371w = vVar;
                    } else {
                        vVar = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (vVar != null) {
                vVar.c(this.f289352d.schedule(new x(vVar), this.f289355g.f290106b, TimeUnit.NANOSECONDS));
            }
        }
        m0(d0VarK0);
    }

    @com.google.common.annotations.e
    final io.grpc.v1 w0(io.grpc.v1 v1Var, int i10) {
        io.grpc.v1 v1Var2 = new io.grpc.v1();
        v1Var2.s(v1Var);
        if (i10 > 0) {
            v1Var2.w(A, String.valueOf(i10));
        }
        return v1Var2;
    }
}
