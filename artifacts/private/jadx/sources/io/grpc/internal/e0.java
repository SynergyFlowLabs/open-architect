package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class e0 implements s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f289005j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f289006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f289007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f289008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @gj.a("this")
    private io.grpc.y2 f289009d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @gj.a("this")
    private p f289011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @gj.a("this")
    private long f289012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @gj.a("this")
    private long f289013h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @gj.a("this")
    private List<Runnable> f289010e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Runnable> f289014i = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289015a;

        a(int i10) {
            this.f289015a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.b(this.f289015a);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.j();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.s f289018a;

        c(io.grpc.s sVar) {
            this.f289018a = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.c(this.f289018a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f289020a;

        d(boolean z10) {
            this.f289020a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.k(this.f289020a);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.a0 f289022a;

        e(io.grpc.a0 a0Var) {
            this.f289022a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.q(this.f289022a);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f289024a;

        f(boolean z10) {
            this.f289024a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.g(this.f289024a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289026a;

        g(int i10) {
            this.f289026a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.d(this.f289026a);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289028a;

        h(int i10) {
            this.f289028a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.e(this.f289028a);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y f289030a;

        i(io.grpc.y yVar) {
            this.f289030a = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.u(this.f289030a);
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.z();
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f289033a;

        k(String str) {
            this.f289033a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.s(this.f289033a);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f289035a;

        l(InputStream inputStream) {
            this.f289035a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.i(this.f289035a);
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.flush();
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.y2 f289038a;

        n(io.grpc.y2 y2Var) {
            this.f289038a = y2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.a(this.f289038a);
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f289008c.o();
        }
    }

    private static class p implements t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f289041d = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f289042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f289043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @gj.a("this")
        private List<Runnable> f289044c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k3.a f289045a;

            a(k3.a aVar) {
                this.f289045a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f289042a.a(this.f289045a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f289042a.e();
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f289048a;

            c(io.grpc.v1 v1Var) {
                this.f289048a = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f289042a.c(this.f289048a);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.y2 f289050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t.a f289051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.v1 f289052c;

            d(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
                this.f289050a = y2Var;
                this.f289051b = aVar;
                this.f289052c = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f289042a.f(this.f289050a, this.f289051b, this.f289052c);
            }
        }

        public p(t tVar) {
            this.f289042a = tVar;
        }

        private void h(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f289043b) {
                        runnable.run();
                    } else {
                        this.f289044c.add(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.k3
        public void a(k3.a aVar) {
            if (this.f289043b) {
                this.f289042a.a(aVar);
            } else {
                h(new a(aVar));
            }
        }

        @Override // io.grpc.internal.t
        public void c(io.grpc.v1 v1Var) {
            h(new c(v1Var));
        }

        @Override // io.grpc.internal.k3
        public void e() {
            if (this.f289043b) {
                this.f289042a.e();
            } else {
                h(new b());
            }
        }

        @Override // io.grpc.internal.t
        public void f(io.grpc.y2 y2Var, t.a aVar, io.grpc.v1 v1Var) {
            h(new d(y2Var, aVar, v1Var));
        }

        public void i() {
            List<Runnable> list;
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f289044c.isEmpty()) {
                            this.f289044c = null;
                            this.f289043b = true;
                            return;
                        } else {
                            list = this.f289044c;
                            this.f289044c = arrayList;
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

    e0() {
    }

    private void B(t tVar) {
        Iterator<Runnable> it = this.f289014i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f289014i = null;
        this.f289008c.v(tVar);
    }

    @gj.a("this")
    private void D(s sVar) {
        s sVar2 = this.f289008c;
        com.google.common.base.j0.x0(sVar2 == null, "realStream already set to %s", sVar2);
        this.f289008c = sVar;
        this.f289013h = System.nanoTime();
    }

    private void y(Runnable runnable) {
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f289006a) {
                    runnable.run();
                } else {
                    this.f289010e.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r0.next().run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            r3 = 7
            monitor-enter(r4)
            java.util.List<java.lang.Runnable> r1 = r4.f289010e     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L25
            r0 = 0
            r0 = 0
            r4.f289010e = r0     // Catch: java.lang.Throwable -> L22
            r0 = 1
            r4.f289006a = r0     // Catch: java.lang.Throwable -> L22
            r3 = 3
            io.grpc.internal.e0$p r0 = r4.f289011f     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            if (r0 == 0) goto L20
            r0.i()
        L20:
            r3 = 4
            return
        L22:
            r0 = move-exception
            r3 = 2
            goto L45
        L25:
            java.util.List<java.lang.Runnable> r1 = r4.f289010e     // Catch: java.lang.Throwable -> L22
            r4.f289010e = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r1.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.next()
            r3 = 0
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2e
        L40:
            r1.clear()
            r0 = r1
            goto L5
        L45:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.e0.z():void");
    }

    @com.google.common.annotations.e
    s A() {
        return this.f289008c;
    }

    protected void C(io.grpc.y2 y2Var) {
    }

    @fj.c
    final Runnable E(s sVar) {
        synchronized (this) {
            try {
                if (this.f289008c != null) {
                    return null;
                }
                D((s) com.google.common.base.j0.F(sVar, "stream"));
                t tVar = this.f289007b;
                if (tVar == null) {
                    this.f289010e = null;
                    int i10 = 2 | 1;
                    this.f289006a = true;
                }
                if (tVar == null) {
                    return null;
                }
                B(tVar);
                return new j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.s
    public void a(io.grpc.y2 y2Var) {
        boolean z10 = false;
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        com.google.common.base.j0.F(y2Var, io.sentry.clientreport.g.b.f305285a);
        synchronized (this) {
            try {
                if (this.f289008c == null) {
                    D(y1.f290145a);
                    this.f289009d = y2Var;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            y(new n(y2Var));
            return;
        }
        z();
        C(y2Var);
        this.f289007b.f(y2Var, t.a.PROCESSED, new io.grpc.v1());
    }

    @Override // io.grpc.internal.j3
    public void b(int i10) {
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        if (this.f289006a) {
            this.f289008c.b(i10);
        } else {
            y(new a(i10));
        }
    }

    @Override // io.grpc.internal.j3
    public void c(io.grpc.s sVar) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        com.google.common.base.j0.F(sVar, "compressor");
        this.f289014i.add(new c(sVar));
    }

    @Override // io.grpc.internal.s
    public void d(int i10) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        this.f289014i.add(new g(i10));
    }

    @Override // io.grpc.internal.s
    public void e(int i10) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        this.f289014i.add(new h(i10));
    }

    @Override // io.grpc.internal.j3
    public void flush() {
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        if (this.f289006a) {
            this.f289008c.flush();
        } else {
            y(new m());
        }
    }

    @Override // io.grpc.internal.j3
    public void g(boolean z10) {
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        if (this.f289006a) {
            this.f289008c.g(z10);
        } else {
            y(new f(z10));
        }
    }

    @Override // io.grpc.internal.s
    public io.grpc.a getAttributes() {
        s sVar;
        synchronized (this) {
            try {
                sVar = this.f289008c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar != null ? sVar.getAttributes() : io.grpc.a.f288673c;
    }

    @Override // io.grpc.internal.j3
    public void i(InputStream inputStream) {
        boolean z10;
        if (this.f289007b != null) {
            z10 = true;
            int i10 = 5 >> 1;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.h0(z10, "May only be called after start");
        com.google.common.base.j0.F(inputStream, "message");
        if (this.f289006a) {
            this.f289008c.i(inputStream);
        } else {
            y(new l(inputStream));
        }
    }

    @Override // io.grpc.internal.j3
    public boolean isReady() {
        if (this.f289006a) {
            return this.f289008c.isReady();
        }
        return false;
    }

    @Override // io.grpc.internal.j3
    public void j() {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        this.f289014i.add(new b());
    }

    @Override // io.grpc.internal.s
    public void k(boolean z10) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        this.f289014i.add(new d(z10));
    }

    @Override // io.grpc.internal.s
    public void o() {
        com.google.common.base.j0.h0(this.f289007b != null, "May only be called after start");
        y(new o());
    }

    @Override // io.grpc.internal.s
    public void q(io.grpc.a0 a0Var) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        com.google.common.base.j0.F(a0Var, "decompressorRegistry");
        this.f289014i.add(new e(a0Var));
    }

    @Override // io.grpc.internal.s
    public void s(String str) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        com.google.common.base.j0.F(str, "authority");
        this.f289014i.add(new k(str));
    }

    @Override // io.grpc.internal.s
    public void t(b1 b1Var) {
        synchronized (this) {
            try {
                if (this.f289007b == null) {
                    return;
                }
                if (this.f289008c != null) {
                    b1Var.b("buffered_nanos", Long.valueOf(this.f289013h - this.f289012g));
                    this.f289008c.t(b1Var);
                } else {
                    b1Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f289012g));
                    b1Var.a("waiting_for_connection");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.s
    public void u(io.grpc.y yVar) {
        com.google.common.base.j0.h0(this.f289007b == null, "May only be called before start");
        this.f289014i.add(new i(yVar));
    }

    @Override // io.grpc.internal.s
    public void v(t tVar) {
        io.grpc.y2 y2Var;
        boolean z10;
        com.google.common.base.j0.F(tVar, com.google.android.gms.common.internal.z.a.f106673a);
        com.google.common.base.j0.h0(this.f289007b == null, "already started");
        synchronized (this) {
            try {
                y2Var = this.f289009d;
                z10 = this.f289006a;
                if (!z10) {
                    p pVar = new p(tVar);
                    this.f289011f = pVar;
                    tVar = pVar;
                }
                this.f289007b = tVar;
                this.f289012g = System.nanoTime();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (y2Var != null) {
            tVar.f(y2Var, t.a.PROCESSED, new io.grpc.v1());
        } else {
            if (z10) {
                B(tVar);
            }
        }
    }
}
