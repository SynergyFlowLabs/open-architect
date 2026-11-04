package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class f implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.b f289131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.internal.g f289132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1 f289133c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289134a;

        a(int i10) {
            this.f289134a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f289133c.isClosed()) {
                return;
            }
            try {
                f.this.f289133c.b(this.f289134a);
            } catch (Throwable th2) {
                f.this.f289132b.i(th2);
                f.this.f289133c.close();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f289136a;

        b(i2 i2Var) {
            this.f289136a = i2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f289133c.g(this.f289136a);
            } catch (Throwable th2) {
                f.this.f289132b.i(th2);
                f.this.f289133c.close();
            }
        }
    }

    class c implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f289138a;

        c(i2 i2Var) {
            this.f289138a = i2Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f289138a.close();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f289133c.j();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f289133c.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$f, reason: collision with other inner class name */
    private class C1972f extends g implements Closeable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Closeable f289142d;

        public C1972f(Runnable runnable, Closeable closeable) {
            super(f.this, runnable, null);
            this.f289142d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f289142d.close();
        }
    }

    private class g implements k3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f289144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f289145b;

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f289145b) {
                return;
            }
            this.f289144a.run();
            this.f289145b = true;
        }

        @Override // io.grpc.internal.k3.a
        @fj.h
        public InputStream next() {
            a();
            return f.this.f289132b.e();
        }

        private g(Runnable runnable) {
            this.f289145b = false;
            this.f289144a = runnable;
        }
    }

    interface h extends io.grpc.internal.g.d {
    }

    f(t1.b bVar, h hVar, t1 t1Var) {
        h3 h3Var = new h3((t1.b) com.google.common.base.j0.F(bVar, com.google.android.gms.common.internal.z.a.f106673a));
        this.f289131a = h3Var;
        io.grpc.internal.g gVar = new io.grpc.internal.g(h3Var, hVar);
        this.f289132b = gVar;
        t1Var.x(gVar);
        this.f289133c = t1Var;
    }

    @Override // io.grpc.internal.b0
    public void b(int i10) {
        this.f289131a.a(new g(this, new a(i10), null));
    }

    @Override // io.grpc.internal.b0
    public void close() {
        this.f289133c.y();
        this.f289131a.a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.b0
    public void d(int i10) {
        this.f289133c.d(i10);
    }

    @com.google.common.annotations.e
    t1.b e() {
        return this.f289132b;
    }

    @Override // io.grpc.internal.b0
    public void f(io.grpc.z zVar) {
        this.f289133c.f(zVar);
    }

    @Override // io.grpc.internal.b0
    public void g(i2 i2Var) {
        this.f289131a.a(new C1972f(new b(i2Var), new c(i2Var)));
    }

    @Override // io.grpc.internal.b0
    public void h(w0 w0Var) {
        this.f289133c.h(w0Var);
    }

    @Override // io.grpc.internal.b0
    public void j() {
        this.f289131a.a(new g(this, new d(), null));
    }
}
