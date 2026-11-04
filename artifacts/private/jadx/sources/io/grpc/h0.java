package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h0<ReqT, RespT> extends a2<ReqT, RespT> {

    public static abstract class a<ReqT, RespT> extends h0<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k<ReqT, RespT> f288803a;

        protected a(k<ReqT, RespT> kVar) {
            this.f288803a = kVar;
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ void a(@fj.h String str, @fj.h Throwable th2) {
            super.a(str, th2);
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ io.grpc.a b() {
            return super.b();
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ void c() {
            super.c();
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ boolean d() {
            return super.d();
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ void e(int i10) {
            super.e(i10);
        }

        @Override // io.grpc.h0, io.grpc.a2, io.grpc.k
        public /* bridge */ /* synthetic */ void g(boolean z10) {
            super.g(z10);
        }

        @Override // io.grpc.h0, io.grpc.a2
        protected k<ReqT, RespT> i() {
            return this.f288803a;
        }

        @Override // io.grpc.h0, io.grpc.a2
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ void a(@fj.h String str, @fj.h Throwable th2) {
        super.a(str, th2);
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ io.grpc.a b() {
        return super.b();
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ void e(int i10) {
        super.e(i10);
    }

    @Override // io.grpc.k
    public void f(ReqT reqt) {
        i().f(reqt);
    }

    @Override // io.grpc.a2, io.grpc.k
    public /* bridge */ /* synthetic */ void g(boolean z10) {
        super.g(z10);
    }

    @Override // io.grpc.k
    public void h(k.a<RespT> aVar, v1 v1Var) {
        i().h(aVar, v1Var);
    }

    @Override // io.grpc.a2
    protected abstract k<ReqT, RespT> i();

    @Override // io.grpc.a2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
