package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 extends y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f289249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.grpc.y2 f289250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f289251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.grpc.n[] f289252e;

    public i0(io.grpc.y2 y2Var, io.grpc.n[] nVarArr) {
        this(y2Var, t.a.PROCESSED, nVarArr);
    }

    @Override // io.grpc.internal.y1, io.grpc.internal.s
    public void t(b1 b1Var) {
        b1Var.b("error", this.f289250c).b("progress", this.f289251d);
    }

    @Override // io.grpc.internal.y1, io.grpc.internal.s
    public void v(t tVar) {
        com.google.common.base.j0.h0(!this.f289249b, "already started");
        this.f289249b = true;
        for (io.grpc.n nVar : this.f289252e) {
            nVar.i(this.f289250c);
        }
        tVar.f(this.f289250c, this.f289251d, new io.grpc.v1());
    }

    @com.google.common.annotations.e
    io.grpc.y2 w() {
        return this.f289250c;
    }

    public i0(io.grpc.y2 y2Var, t.a aVar, io.grpc.n[] nVarArr) {
        com.google.common.base.j0.e(!y2Var.r(), "error must not be OK");
        this.f289250c = y2Var;
        this.f289251d = aVar;
        this.f289252e = nVarArr;
    }
}
