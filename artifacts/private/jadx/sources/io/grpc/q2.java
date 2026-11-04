package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public final class q2<ReqT, RespT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1<ReqT, RespT> f290882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2<ReqT, RespT> f290883b;

    private q2(w1<ReqT, RespT> w1Var, m2<ReqT, RespT> m2Var) {
        this.f290882a = w1Var;
        this.f290883b = m2Var;
    }

    public static <ReqT, RespT> q2<ReqT, RespT> a(w1<ReqT, RespT> w1Var, m2<ReqT, RespT> m2Var) {
        return new q2<>(w1Var, m2Var);
    }

    public w1<ReqT, RespT> b() {
        return this.f290882a;
    }

    public m2<ReqT, RespT> c() {
        return this.f290883b;
    }

    public q2<ReqT, RespT> d(m2<ReqT, RespT> m2Var) {
        return new q2<>(this.f290882a, m2Var);
    }
}
