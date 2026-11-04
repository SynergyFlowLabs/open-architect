package io.grpc.internal;

import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
final class w1 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.b f290007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.internal.g f290008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f290009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.internal.g.d f290010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f290011e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290014h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290016j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f290012f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f290013g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Queue<i> f290015i = new ArrayDeque();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.perfmark.b f290017a;

        a(io.perfmark.b bVar) {
            this.f290017a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.perfmark.f fVarZ = io.perfmark.c.z("MigratingThreadDeframer.messageAvailable");
            try {
                io.perfmark.c.n(this.f290017a);
                w1.this.f290007a.a(w1.this.f290012f);
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th2) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    class b implements i {
        b() {
        }

        @Override // io.grpc.internal.w1.i
        public void a(boolean z10) {
            w1.this.f290011e.close();
        }
    }

    class c implements i {
        c() {
        }

        @Override // io.grpc.internal.w1.i
        public void a(boolean z10) {
            w1.this.f290011e.j();
        }
    }

    class d implements i, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f290021a;

        d(i2 i2Var) {
            this.f290021a = i2Var;
        }

        @Override // io.grpc.internal.w1.i
        public void a(boolean z10) {
            io.perfmark.f fVarZ = io.perfmark.c.z("MigratingThreadDeframer.deframe");
            try {
                if (z10) {
                    w1.this.f290011e.g(this.f290021a);
                    if (fVarZ != null) {
                        fVarZ.close();
                        return;
                    }
                    return;
                }
                try {
                    w1.this.f290011e.g(this.f290021a);
                } catch (Throwable th2) {
                    w1.this.f290008b.i(th2);
                    w1.this.f290011e.close();
                }
                if (fVarZ != null) {
                    fVarZ.close();
                }
            } catch (Throwable th3) {
                if (fVarZ != null) {
                    try {
                        fVarZ.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f290021a.close();
        }
    }

    class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f290023a;

        e(int i10) {
            this.f290023a = i10;
        }

        @Override // io.grpc.internal.w1.i
        public void a(boolean z10) {
            if (!z10) {
                w1.this.b(this.f290023a);
                return;
            }
            try {
                w1.this.f290011e.b(this.f290023a);
            } catch (Throwable th2) {
                w1.this.f290008b.i(th2);
                w1.this.f290011e.close();
            }
            if (w1.this.f290011e.l()) {
                return;
            }
            synchronized (w1.this.f290013g) {
                io.perfmark.c.j("MigratingThreadDeframer.deframerOnApplicationThread");
                w1.this.f290009c.e(w1.this.f290008b);
                w1.this.f290014h = false;
            }
        }
    }

    class f implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f290025a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.perfmark.b f290027a;

            a(io.perfmark.b bVar) {
                this.f290027a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.perfmark.f fVarZ = io.perfmark.c.z("MigratingThreadDeframer.request");
                try {
                    io.perfmark.c.n(this.f290027a);
                    f fVar = f.this;
                    w1.this.r(fVar.f290025a);
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        f(int i10) {
            this.f290025a = i10;
        }

        @Override // io.grpc.internal.w1.i
        public void a(boolean z10) {
            if (z10) {
                w1.this.f290010d.f(new a(io.perfmark.c.o()));
                return;
            }
            try {
                io.perfmark.f fVarZ = io.perfmark.c.z("MigratingThreadDeframer.request");
                try {
                    w1.this.f290011e.b(this.f290025a);
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                w1.this.f290008b.i(th4);
                w1.this.f290011e.close();
            }
        }
    }

    class g implements k3.a, Closeable {
        g() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i iVar;
            while (true) {
                synchronized (w1.this.f290013g) {
                    do {
                        try {
                            iVar = (i) w1.this.f290015i.poll();
                            if (iVar == null) {
                                break;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } while (!(iVar instanceof Closeable));
                    if (iVar == null) {
                        w1.this.f290016j = false;
                        return;
                    }
                }
                v0.f((Closeable) iVar);
            }
        }

        @Override // io.grpc.internal.k3.a
        public InputStream next() {
            i iVar;
            while (true) {
                InputStream inputStreamE = w1.this.f290008b.e();
                if (inputStreamE != null) {
                    return inputStreamE;
                }
                synchronized (w1.this.f290013g) {
                    try {
                        iVar = (i) w1.this.f290015i.poll();
                        if (iVar == null) {
                            if (w1.this.f290011e.l()) {
                                io.perfmark.c.j("MigratingThreadDeframer.deframerOnTransportThread");
                                w1.this.f290009c.e(w1.this.f290007a);
                                w1.this.f290014h = true;
                            }
                            w1.this.f290016j = false;
                            return null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                iVar.a(false);
            }
        }
    }

    static class h extends p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t1.b f290030a;

        public h(t1.b bVar) {
            e(bVar);
        }

        @Override // io.grpc.internal.p0
        protected t1.b c() {
            return this.f290030a;
        }

        public void e(t1.b bVar) {
            this.f290030a = (t1.b) com.google.common.base.j0.F(bVar, "delegate");
        }
    }

    private interface i {
        void a(boolean z10);
    }

    public w1(t1.b bVar, io.grpc.internal.g.d dVar, t1 t1Var) {
        h3 h3Var = new h3((t1.b) com.google.common.base.j0.F(bVar, com.google.android.gms.common.internal.z.a.f106673a));
        this.f290007a = h3Var;
        this.f290010d = (io.grpc.internal.g.d) com.google.common.base.j0.F(dVar, "transportExecutor");
        io.grpc.internal.g gVar = new io.grpc.internal.g(h3Var, dVar);
        this.f290008b = gVar;
        h hVar = new h(gVar);
        this.f290009c = hVar;
        t1Var.x(hVar);
        this.f290011e = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i10) {
        s(new e(i10));
    }

    private boolean s(i iVar) {
        return t(iVar, true);
    }

    private boolean t(i iVar, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f290013g) {
            try {
                z11 = this.f290014h;
                z12 = this.f290016j;
                if (!z11) {
                    this.f290015i.offer(iVar);
                    this.f290016j = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            iVar.a(true);
            return true;
        }
        if (!z12) {
            if (z10) {
                io.perfmark.f fVarZ = io.perfmark.c.z("MigratingThreadDeframer.messageAvailable");
                try {
                    this.f290007a.a(this.f290012f);
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th3) {
                    if (fVarZ != null) {
                        try {
                            fVarZ.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } else {
                this.f290010d.f(new a(io.perfmark.c.o()));
            }
        }
        return false;
    }

    @Override // io.grpc.internal.m3, io.grpc.internal.b0
    public void b(int i10) {
        t(new f(i10), false);
    }

    @Override // io.grpc.internal.b0
    public void close() {
        if (s(new b())) {
            return;
        }
        this.f290011e.y();
    }

    @Override // io.grpc.internal.b0
    public void d(int i10) {
        this.f290011e.d(i10);
    }

    @Override // io.grpc.internal.b0
    public void f(io.grpc.z zVar) {
        this.f290011e.f(zVar);
    }

    @Override // io.grpc.internal.b0
    public void g(i2 i2Var) {
        s(new d(i2Var));
    }

    @Override // io.grpc.internal.b0
    public void h(w0 w0Var) {
        this.f290011e.h(w0Var);
    }

    @Override // io.grpc.internal.b0
    public void j() {
        s(new c());
    }
}
