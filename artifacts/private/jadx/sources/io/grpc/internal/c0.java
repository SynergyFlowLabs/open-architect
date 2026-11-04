package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class c0<ReqT, RespT> extends io.grpc.k<ReqT, RespT> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f288886j = Logger.getLogger(c0.class.getName());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final io.grpc.k<Object, Object> f288887k = new j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f288888l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final ScheduledFuture<?> f288889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f288890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.grpc.w f288891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f288892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.grpc.k.a<RespT> f288893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.grpc.k<ReqT, RespT> f288894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @gj.a("this")
    private io.grpc.y2 f288895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @gj.a("this")
    private List<Runnable> f288896h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @gj.a("this")
    private l<RespT> f288897i;

    class a extends a0 {
        a(io.grpc.w wVar) {
            super(wVar);
        }

        @Override // io.grpc.internal.a0
        public void a() {
            c0.this.p();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f288899a;

        b(StringBuilder sb2) {
            this.f288899a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.n(io.grpc.y2.f291454i.u(this.f288899a.toString()), true);
        }
    }

    class c extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f288901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(c0.this.f288891c);
            this.f288901b = lVar;
        }

        @Override // io.grpc.internal.a0
        public void a() {
            this.f288901b.g();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.k.a f288903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.grpc.v1 f288904b;

        d(io.grpc.k.a aVar, io.grpc.v1 v1Var) {
            this.f288903a = aVar;
            this.f288904b = v1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.h(this.f288903a, this.f288904b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f288906a;

        e(io.grpc.y2 y2Var) {
            this.f288906a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.a(this.f288906a.q(), this.f288906a.o());
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f288908a;

        f(Object obj) {
            this.f288908a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.f(this.f288908a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f288910a;

        g(boolean z10) {
            this.f288910a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.g(this.f288910a);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f288912a;

        h(int i10) {
            this.f288912a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.e(this.f288912a);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f288894f.c();
        }
    }

    class j extends io.grpc.k<Object, Object> {
        j() {
        }

        @Override // io.grpc.k
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.k
        public void c() {
        }

        @Override // io.grpc.k
        public boolean d() {
            return false;
        }

        @Override // io.grpc.k
        public void e(int i10) {
        }

        @Override // io.grpc.k
        public void f(Object obj) {
        }

        @Override // io.grpc.k
        public void h(io.grpc.k.a<Object> aVar, io.grpc.v1 v1Var) {
        }
    }

    private final class k extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.grpc.k.a<RespT> f288915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.grpc.y2 f288916c;

        k(io.grpc.k.a<RespT> aVar, io.grpc.y2 y2Var) {
            super(c0.this.f288891c);
            this.f288915b = aVar;
            this.f288916c = y2Var;
        }

        @Override // io.grpc.internal.a0
        public void a() {
            this.f288915b.a(this.f288916c, new io.grpc.v1());
        }
    }

    private static final class l<RespT> extends io.grpc.k.a<RespT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f288918d = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.k.a<RespT> f288919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f288920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @gj.a("this")
        private List<Runnable> f288921c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f288922a;

            a(io.grpc.v1 v1Var) {
                this.f288922a = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f288919a.b(this.f288922a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f288924a;

            b(Object obj) {
                this.f288924a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f288919a.c(this.f288924a);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f288926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f288927b;

            c(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
                this.f288926a = y2Var;
                this.f288927b = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f288919a.a(this.f288926a, this.f288927b);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f288919a.d();
            }
        }

        public l(io.grpc.k.a<RespT> aVar) {
            this.f288919a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f288920b) {
                        runnable.run();
                    } else {
                        this.f288921c.add(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.k.a
        public void a(io.grpc.y2 y2Var, io.grpc.v1 v1Var) {
            f(new c(y2Var, v1Var));
        }

        @Override // io.grpc.k.a
        public void b(io.grpc.v1 v1Var) {
            if (this.f288920b) {
                this.f288919a.b(v1Var);
            } else {
                f(new a(v1Var));
            }
        }

        @Override // io.grpc.k.a
        public void c(RespT respt) {
            if (this.f288920b) {
                this.f288919a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        @Override // io.grpc.k.a
        public void d() {
            if (this.f288920b) {
                this.f288919a.d();
            } else {
                f(new d());
            }
        }

        void g() {
            List<Runnable> list;
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f288921c.isEmpty()) {
                            this.f288921c = null;
                            this.f288920b = true;
                            return;
                        } else {
                            list = this.f288921c;
                            this.f288921c = arrayList;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    protected c0(Executor executor, ScheduledExecutorService scheduledExecutorService, @fj.h io.grpc.y yVar) {
        this.f288890b = (Executor) com.google.common.base.j0.F(executor, "callExecutor");
        com.google.common.base.j0.F(scheduledExecutorService, "scheduler");
        this.f288891c = io.grpc.w.g();
        this.f288889a = s(scheduledExecutorService, yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void n(io.grpc.y2 y2Var, boolean z10) {
        boolean z11;
        io.grpc.k.a<RespT> aVar;
        synchronized (this) {
            try {
                if (this.f288894f == null) {
                    u(f288887k);
                    aVar = this.f288893e;
                    this.f288895g = y2Var;
                    z11 = false;
                } else {
                    if (z10) {
                        return;
                    }
                    z11 = true;
                    aVar = null;
                }
                if (z11) {
                    o(new e(y2Var));
                } else {
                    if (aVar != null) {
                        this.f288890b.execute(new k(aVar, y2Var));
                    }
                    p();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f288892d) {
                    runnable.run();
                } else {
                    this.f288896h.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r0.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        r0.next().run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r4)
            r3 = 0
            java.util.List<java.lang.Runnable> r1 = r4.f288896h     // Catch: java.lang.Throwable -> L29
            r3 = 1
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2c
            r0 = 0
            r3 = 6
            r4.f288896h = r0     // Catch: java.lang.Throwable -> L29
            r0 = 1
            r4.f288892d = r0     // Catch: java.lang.Throwable -> L29
            io.grpc.internal.c0$l<RespT> r0 = r4.f288897i     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L27
            java.util.concurrent.Executor r1 = r4.f288890b
            io.grpc.internal.c0$c r2 = new io.grpc.internal.c0$c
            r2.<init>(r0)
            r3 = 1
            r1.execute(r2)
        L27:
            r3 = 0
            return
        L29:
            r0 = move-exception
            r3 = 3
            goto L4e
        L2c:
            java.util.List<java.lang.Runnable> r1 = r4.f288896h     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r4.f288896h = r0     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r0 = r1.iterator()
        L36:
            r3 = 1
            boolean r2 = r0.hasNext()
            r3 = 4
            if (r2 == 0) goto L49
            r3 = 1
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L36
        L49:
            r1.clear()
            r0 = r1
            goto L5
        L4e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c0.p():void");
    }

    private boolean r(@fj.h io.grpc.y yVar, @fj.h io.grpc.y yVar2) {
        if (yVar2 == null) {
            return true;
        }
        if (yVar == null) {
            return false;
        }
        return yVar.l(yVar2);
    }

    @fj.h
    private ScheduledFuture<?> s(ScheduledExecutorService scheduledExecutorService, @fj.h io.grpc.y yVar) {
        io.grpc.y yVarO = this.f288891c.o();
        if (yVar == null && yVarO == null) {
            return null;
        }
        long jR = yVar != null ? yVar.r(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (yVarO != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (yVarO.r(timeUnit) < jR) {
                jR = yVarO.r(timeUnit);
                Logger logger = f288886j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jR)));
                    if (yVar == null) {
                        sb2.append(" Explicit call timeout was not set.");
                    } else {
                        sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(yVar.r(timeUnit))));
                    }
                    logger.fine(sb2.toString());
                }
            }
        }
        long jAbs = Math.abs(jR);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jR) % timeUnit2.toNanos(1L);
        StringBuilder sb3 = new StringBuilder();
        String str = r(yVarO, yVar) ? "Context" : "CallOptions";
        if (jR < 0) {
            sb3.append("ClientCall started after ");
            sb3.append(str);
            sb3.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb3.append("Deadline ");
            sb3.append(str);
            sb3.append(" will be exceeded in ");
        }
        sb3.append(nanos);
        sb3.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb3.append("s. ");
        return scheduledExecutorService.schedule(new b(sb3), jR, TimeUnit.NANOSECONDS);
    }

    @gj.a("this")
    private void u(io.grpc.k<ReqT, RespT> kVar) {
        io.grpc.k<ReqT, RespT> kVar2 = this.f288894f;
        boolean z10 = false;
        com.google.common.base.j0.x0(kVar2 == null, "realCall already set to %s", kVar2);
        ScheduledFuture<?> scheduledFuture = this.f288889a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f288894f = kVar;
    }

    @Override // io.grpc.k
    public final void a(@fj.h String str, @fj.h Throwable th2) {
        io.grpc.y2 y2Var = io.grpc.y2.f291451f;
        io.grpc.y2 y2VarU = str != null ? y2Var.u(str) : y2Var.u("Call cancelled without message");
        if (th2 != null) {
            y2VarU = y2VarU.t(th2);
        }
        n(y2VarU, false);
    }

    @Override // io.grpc.k
    public final io.grpc.a b() {
        io.grpc.k<ReqT, RespT> kVar;
        synchronized (this) {
            try {
                kVar = this.f288894f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar != null ? kVar.b() : io.grpc.a.f288673c;
    }

    @Override // io.grpc.k
    public final void c() {
        o(new i());
    }

    @Override // io.grpc.k
    public final boolean d() {
        if (this.f288892d) {
            return this.f288894f.d();
        }
        return false;
    }

    @Override // io.grpc.k
    public final void e(int i10) {
        if (this.f288892d) {
            this.f288894f.e(i10);
        } else {
            o(new h(i10));
        }
    }

    @Override // io.grpc.k
    public final void f(ReqT reqt) {
        if (this.f288892d) {
            this.f288894f.f(reqt);
        } else {
            o(new f(reqt));
        }
    }

    @Override // io.grpc.k
    public final void g(boolean z10) {
        if (this.f288892d) {
            this.f288894f.g(z10);
        } else {
            o(new g(z10));
        }
    }

    @Override // io.grpc.k
    public final void h(io.grpc.k.a<RespT> aVar, io.grpc.v1 v1Var) {
        io.grpc.y2 y2Var;
        boolean z10;
        com.google.common.base.j0.h0(this.f288893e == null, "already started");
        synchronized (this) {
            try {
                this.f288893e = (io.grpc.k.a) com.google.common.base.j0.F(aVar, com.google.android.gms.common.internal.z.a.f106673a);
                y2Var = this.f288895g;
                z10 = this.f288892d;
                if (!z10) {
                    l<RespT> lVar = new l<>(aVar);
                    this.f288897i = lVar;
                    aVar = lVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (y2Var != null) {
            this.f288890b.execute(new k(aVar, y2Var));
        } else if (z10) {
            this.f288894f.h(aVar, v1Var);
        } else {
            o(new d(aVar, v1Var));
        }
    }

    protected void m() {
    }

    @com.google.common.annotations.e
    final io.grpc.k<ReqT, RespT> q() {
        return this.f288894f;
    }

    public final Runnable t(io.grpc.k<ReqT, RespT> kVar) {
        synchronized (this) {
            try {
                if (this.f288894f != null) {
                    return null;
                }
                u((io.grpc.k) com.google.common.base.j0.F(kVar, androidx.core.app.w.E0));
                return new a(this.f288891c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("realCall", this.f288894f).toString();
    }
}
