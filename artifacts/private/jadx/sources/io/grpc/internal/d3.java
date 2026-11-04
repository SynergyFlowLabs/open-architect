package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
final class d3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f289000e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final io.grpc.x1.c f289001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f289002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private io.grpc.x1.c f289003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f289004d;

    d3(@fj.h q1 q1Var, boolean z10) {
        if (q1Var == null) {
            this.f289001a = null;
        } else {
            this.f289001a = io.grpc.x1.c.a(q1Var);
        }
        this.f289002b = z10;
        if (z10) {
            return;
        }
        this.f289003c = this.f289001a;
    }

    boolean a() {
        return this.f289002b;
    }

    @fj.h
    io.grpc.x1.c b() {
        com.google.common.base.j0.h0(!c(), "still waiting on service config");
        return this.f289003c;
    }

    boolean c() {
        return !this.f289004d && a();
    }

    void d(@fj.h io.grpc.x1.c cVar) {
        com.google.common.base.j0.h0(a(), "unexpected service config update");
        boolean z10 = this.f289004d;
        this.f289004d = true;
        if (!z10) {
            if (cVar == null) {
                this.f289003c = this.f289001a;
                return;
            }
            if (cVar.d() == null) {
                this.f289003c = cVar;
                return;
            }
            io.grpc.x1.c cVar2 = this.f289001a;
            if (cVar2 != null) {
                this.f289003c = cVar2;
                return;
            } else {
                this.f289003c = cVar;
                return;
            }
        }
        if (cVar == null) {
            io.grpc.x1.c cVar3 = this.f289001a;
            if (cVar3 != null) {
                this.f289003c = cVar3;
                return;
            } else {
                this.f289003c = null;
                return;
            }
        }
        if (cVar.d() == null) {
            this.f289003c = cVar;
            return;
        }
        io.grpc.x1.c cVar4 = this.f289003c;
        if (cVar4 == null || cVar4.d() == null) {
            return;
        }
        this.f289003c = cVar;
    }
}
