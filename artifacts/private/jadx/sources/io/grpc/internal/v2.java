package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
final class v2<ReqT, RespT> extends io.grpc.u2.c<ReqT, RespT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.w1<ReqT, RespT> f289960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.a f289961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f289962c;

    v2(io.grpc.w1<ReqT, RespT> w1Var, io.grpc.a aVar, @fj.h String str) {
        this.f289960a = w1Var;
        this.f289961b = aVar;
        this.f289962c = str;
    }

    @Override // io.grpc.u2.c
    public io.grpc.a a() {
        return this.f289961b;
    }

    @Override // io.grpc.u2.c
    @fj.h
    public String b() {
        return this.f289962c;
    }

    @Override // io.grpc.u2.c
    public io.grpc.w1<ReqT, RespT> c() {
        return this.f289960a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (!com.google.common.base.d0.a(this.f289960a, v2Var.f289960a) || !com.google.common.base.d0.a(this.f289961b, v2Var.f289961b) || !com.google.common.base.d0.a(this.f289962c, v2Var.f289962c)) {
            return false;
        }
        int i10 = 4 >> 1;
        return true;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f289960a, this.f289961b, this.f289962c);
    }
}
