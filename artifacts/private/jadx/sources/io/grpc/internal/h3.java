package io.grpc.internal;

import java.io.Closeable;

/* JADX INFO: loaded from: classes13.dex */
final class h3 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.b f289246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f289247b;

    public h3(t1.b bVar) {
        this.f289246a = bVar;
    }

    @Override // io.grpc.internal.p0, io.grpc.internal.t1.b
    public void a(k3.a aVar) {
        if (!this.f289247b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            v0.f((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.p0
    protected t1.b c() {
        return this.f289246a;
    }

    @Override // io.grpc.internal.p0, io.grpc.internal.t1.b
    public void d(boolean z10) {
        this.f289247b = true;
        super.d(z10);
    }

    @Override // io.grpc.internal.p0, io.grpc.internal.t1.b
    public void i(Throwable th2) {
        this.f289247b = true;
        super.i(th2);
    }
}
