package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
final class g implements t1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f289205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1.b f289206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<InputStream> f289207c = new ArrayDeque();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289208a;

        a(int i10) {
            this.f289208a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f289206b.b(this.f289208a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f289210a;

        b(boolean z10) {
            this.f289210a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f289206b.d(this.f289210a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f289212a;

        c(Throwable th2) {
            this.f289212a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f289206b.i(this.f289212a);
        }
    }

    public interface d {
        void f(Runnable runnable);
    }

    public g(t1.b bVar, d dVar) {
        this.f289206b = (t1.b) com.google.common.base.j0.F(bVar, com.google.android.gms.common.internal.z.a.f106673a);
        this.f289205a = (d) com.google.common.base.j0.F(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.t1.b
    public void a(k3.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f289207c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.t1.b
    public void b(int i10) {
        this.f289205a.f(new a(i10));
    }

    @Override // io.grpc.internal.t1.b
    public void d(boolean z10) {
        this.f289205a.f(new b(z10));
    }

    public InputStream e() {
        return this.f289207c.poll();
    }

    @Override // io.grpc.internal.t1.b
    public void i(Throwable th2) {
        this.f289205a.f(new c(th2));
    }
}
