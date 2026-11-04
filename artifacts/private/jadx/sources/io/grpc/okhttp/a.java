package io.grpc.okhttp;

import io.grpc.internal.t2;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.Socket;
import okio.e1;
import okio.z0;

/* JADX INFO: loaded from: classes13.dex */
final class a implements z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t2 f290220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.okhttp.b.a f290221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f290222e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.h
    private z0 f290226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @fj.h
    private Socket f290227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f290228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f290229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int f290230m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f290218a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okio.l f290219b = new okio.l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290223f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private boolean f290224g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f290225h = false;

    /* JADX INFO: renamed from: io.grpc.okhttp.a$a, reason: collision with other inner class name */
    class C1980a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.perfmark.b f290231b;

        C1980a() {
            super(a.this, null);
            this.f290231b = io.perfmark.c.o();
        }

        @Override // io.grpc.okhttp.a.e
        public void a() throws IOException {
            int i10;
            okio.l lVar = new okio.l();
            io.perfmark.f fVarZ = io.perfmark.c.z("WriteRunnable.runWrite");
            try {
                io.perfmark.c.n(this.f290231b);
                synchronized (a.this.f290218a) {
                    lVar.Ga(a.this.f290219b, a.this.f290219b.e());
                    a.this.f290223f = false;
                    i10 = a.this.f290230m;
                }
                a.this.f290226i.Ga(lVar, lVar.size());
                synchronized (a.this.f290218a) {
                    a.e(a.this, i10);
                }
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

    class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.perfmark.b f290233b;

        b() {
            super(a.this, null);
            this.f290233b = io.perfmark.c.o();
        }

        @Override // io.grpc.okhttp.a.e
        public void a() throws IOException {
            okio.l lVar = new okio.l();
            io.perfmark.f fVarZ = io.perfmark.c.z("WriteRunnable.runFlush");
            try {
                io.perfmark.c.n(this.f290233b);
                synchronized (a.this.f290218a) {
                    try {
                        lVar.Ga(a.this.f290219b, a.this.f290219b.size());
                        a.this.f290224g = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a.this.f290226i.Ga(lVar, lVar.size());
                a.this.f290226i.flush();
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
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f290226i != null && a.this.f290219b.size() > 0) {
                    a.this.f290226i.Ga(a.this.f290219b, a.this.f290219b.size());
                }
            } catch (IOException e10) {
                a.this.f290221d.g(e10);
            }
            a.this.f290219b.close();
            try {
                if (a.this.f290226i != null) {
                    a.this.f290226i.close();
                }
            } catch (IOException e11) {
                a.this.f290221d.g(e11);
            }
            try {
                if (a.this.f290227j != null) {
                    a.this.f290227j.close();
                }
            } catch (IOException e12) {
                a.this.f290221d.g(e12);
            }
        }
    }

    private class d extends io.grpc.okhttp.c {
        public d(io.grpc.okhttp.internal.framed.c cVar) {
            super(cVar);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void Da(io.grpc.okhttp.internal.framed.i iVar) throws IOException {
            a.l(a.this);
            super.Da(iVar);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) throws IOException {
            a.l(a.this);
            super.M1(i10, aVar);
        }

        @Override // io.grpc.okhttp.c, io.grpc.okhttp.internal.framed.c
        public void W(boolean z10, int i10, int i11) throws IOException {
            if (z10) {
                a.l(a.this);
            }
            super.W(z10, i10, i11);
        }
    }

    private abstract class e implements Runnable {
        private e() {
        }

        public abstract void a() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f290226i == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                a.this.f290221d.g(e10);
            }
        }

        /* synthetic */ e(a aVar, C1980a c1980a) {
            this();
        }
    }

    private a(t2 t2Var, io.grpc.okhttp.b.a aVar, int i10) {
        this.f290220c = (t2) com.google.common.base.j0.F(t2Var, "executor");
        this.f290221d = (io.grpc.okhttp.b.a) com.google.common.base.j0.F(aVar, "exceptionHandler");
        this.f290222e = i10;
    }

    static /* synthetic */ int e(a aVar, int i10) {
        int i11 = aVar.f290230m - i10;
        aVar.f290230m = i11;
        return i11;
    }

    static /* synthetic */ int l(a aVar) {
        int i10 = aVar.f290229l;
        aVar.f290229l = i10 + 1;
        return i10;
    }

    static a q(t2 t2Var, io.grpc.okhttp.b.a aVar, int i10) {
        return new a(t2Var, aVar, i10);
    }

    @Override // okio.z0
    public void Ga(okio.l lVar, long j10) throws IOException {
        com.google.common.base.j0.F(lVar, "source");
        if (this.f290225h) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        io.perfmark.f fVarZ = io.perfmark.c.z("AsyncSink.write");
        try {
            synchronized (this.f290218a) {
                try {
                    this.f290219b.Ga(lVar, j10);
                    int i10 = this.f290230m + this.f290229l;
                    this.f290230m = i10;
                    boolean z10 = false;
                    this.f290229l = 0;
                    if (this.f290228k || i10 <= this.f290222e) {
                        if (!this.f290223f && !this.f290224g && this.f290219b.e() > 0) {
                            this.f290223f = true;
                        }
                        if (fVarZ != null) {
                            fVarZ.close();
                            return;
                        }
                        return;
                    }
                    this.f290228k = true;
                    z10 = true;
                    if (!z10) {
                        this.f290220c.execute(new C1980a());
                        if (fVarZ != null) {
                            fVarZ.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f290227j.close();
                    } catch (IOException e10) {
                        this.f290221d.g(e10);
                    }
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
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

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f290225h) {
            return;
        }
        this.f290225h = true;
        this.f290220c.execute(new c());
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        if (this.f290225h) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        io.perfmark.f fVarZ = io.perfmark.c.z("AsyncSink.flush");
        try {
            synchronized (this.f290218a) {
                if (!this.f290224g) {
                    this.f290224g = true;
                    this.f290220c.execute(new b());
                    if (fVarZ != null) {
                        fVarZ.close();
                    }
                } else if (fVarZ != null) {
                    fVarZ.close();
                }
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

    void m(z0 z0Var, Socket socket) {
        com.google.common.base.j0.h0(this.f290226i == null, "AsyncSink's becomeConnected should only be called once.");
        this.f290226i = (z0) com.google.common.base.j0.F(z0Var, "sink");
        this.f290227j = (Socket) com.google.common.base.j0.F(socket, "socket");
    }

    io.grpc.okhttp.internal.framed.c o(io.grpc.okhttp.internal.framed.c cVar) {
        return new d(cVar);
    }

    @Override // okio.z0
    public e1 timeout() {
        return e1.f334887f;
    }
}
