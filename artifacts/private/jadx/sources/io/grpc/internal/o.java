package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f289634f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n3 f289635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l1 f289636b = m1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1 f289637c = m1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l1 f289638d = m1.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f289639e;

    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.o.b
        public o k() {
            return new o(n3.f289633a);
        }
    }

    public interface b {
        o k();
    }

    o(n3 n3Var) {
        this.f289635a = n3Var;
    }

    public static b a() {
        return f289634f;
    }

    public void b(boolean z10) {
        if (z10) {
            this.f289637c.add(1L);
        } else {
            this.f289638d.add(1L);
        }
    }

    public void c() {
        this.f289636b.add(1L);
        this.f289639e = this.f289635a.a();
    }

    void d(io.grpc.v0.b.a aVar) {
        aVar.c(this.f289636b.value()).d(this.f289637c.value()).b(this.f289638d.value()).f(this.f289639e);
    }

    void e(io.grpc.v0.j.a aVar) {
        aVar.d(this.f289636b.value()).e(this.f289637c.value()).c(this.f289638d.value()).f(this.f289639e);
    }
}
