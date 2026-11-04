package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f290884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f290885b;

    private r(g gVar, d dVar) {
        this.f290884a = (g) com.google.common.base.j0.F(gVar, "channelCreds");
        this.f290885b = (d) com.google.common.base.j0.F(dVar, "callCreds");
    }

    public static g b(g gVar, d dVar) {
        return new r(gVar, dVar);
    }

    @Override // io.grpc.g
    public g a() {
        return this.f290884a.a();
    }

    public d c() {
        return this.f290885b;
    }

    public g d() {
        return this.f290884a;
    }
}
