package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
final class v1 extends io.grpc.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f289949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.w1<?, ?> f289950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.grpc.v1 f289951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.e f289952d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f289954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.n[] f289955g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.h
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private s f289957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f289958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e0 f289959k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f289956h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.grpc.w f289953e = io.grpc.w.g();

    public interface a {
        void onComplete();
    }

    v1(u uVar, io.grpc.w1<?, ?> w1Var, io.grpc.v1 v1Var, io.grpc.e eVar, a aVar, io.grpc.n[] nVarArr) {
        this.f289949a = uVar;
        this.f289950b = w1Var;
        this.f289951c = v1Var;
        this.f289952d = eVar;
        this.f289954f = aVar;
        this.f289955g = nVarArr;
    }

    private void c(s sVar) {
        boolean z10;
        com.google.common.base.j0.h0(!this.f289958j, "already finalized");
        this.f289958j = true;
        synchronized (this.f289956h) {
            try {
                if (this.f289957i == null) {
                    this.f289957i = sVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f289954f.onComplete();
            return;
        }
        com.google.common.base.j0.h0(this.f289959k != null, "delayedStream is null");
        Runnable runnableE = this.f289959k.E(sVar);
        if (runnableE != null) {
            runnableE.run();
        }
        this.f289954f.onComplete();
    }

    @Override // io.grpc.d.a
    public void a(io.grpc.v1 v1Var) {
        com.google.common.base.j0.h0(!this.f289958j, "apply() or fail() already called");
        com.google.common.base.j0.F(v1Var, "headers");
        this.f289951c.s(v1Var);
        io.grpc.w wVarB = this.f289953e.b();
        try {
            s sVarE = this.f289949a.e(this.f289950b, this.f289951c, this.f289952d, this.f289955g);
            this.f289953e.j(wVarB);
            c(sVarE);
        } catch (Throwable th2) {
            this.f289953e.j(wVarB);
            throw th2;
        }
    }

    @Override // io.grpc.d.a
    public void b(io.grpc.y2 y2Var) {
        com.google.common.base.j0.e(!y2Var.r(), "Cannot fail with OK status");
        com.google.common.base.j0.h0(!this.f289958j, "apply() or fail() already called");
        c(new i0(v0.s(y2Var), this.f289955g));
    }

    s d() {
        synchronized (this.f289956h) {
            try {
                s sVar = this.f289957i;
                if (sVar != null) {
                    return sVar;
                }
                e0 e0Var = new e0();
                this.f289959k = e0Var;
                this.f289957i = e0Var;
                return e0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
