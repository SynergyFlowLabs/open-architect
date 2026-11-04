package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k0<ReqT, RespT> extends c2<ReqT, RespT> {

    public static abstract class a<ReqT, RespT> extends k0<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k2<ReqT, RespT> f290160a;

        protected a(k2<ReqT, RespT> k2Var) {
            this.f290160a = k2Var;
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ void a(y2 y2Var, v1 v1Var) {
            super.a(y2Var, v1Var);
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        @e0("https://github.com/grpc/grpc-java/issues/1779")
        public /* bridge */ /* synthetic */ io.grpc.a b() {
            return super.b();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ String c() {
            return super.c();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        @e0("https://github.com/grpc/grpc-java/issues/4692")
        public /* bridge */ /* synthetic */ h2 e() {
            return super.e();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ boolean f() {
            return super.f();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ boolean g() {
            return super.g();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ void h(int i10) {
            super.h(i10);
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ void i(v1 v1Var) {
            super.i(v1Var);
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        @e0("https://github.com/grpc/grpc-java/issues/1704")
        public /* bridge */ /* synthetic */ void k(String str) {
            super.k(str);
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public /* bridge */ /* synthetic */ void l(boolean z10) {
            super.l(z10);
        }

        @Override // io.grpc.k0, io.grpc.c2
        protected k2<ReqT, RespT> m() {
            return this.f290160a;
        }

        @Override // io.grpc.k0, io.grpc.c2
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ void a(y2 y2Var, v1 v1Var) {
        super.a(y2Var, v1Var);
    }

    @Override // io.grpc.c2, io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/1779")
    public /* bridge */ /* synthetic */ io.grpc.a b() {
        return super.b();
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ String c() {
        return super.c();
    }

    @Override // io.grpc.k2
    public w1<ReqT, RespT> d() {
        return m().d();
    }

    @Override // io.grpc.c2, io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/4692")
    public /* bridge */ /* synthetic */ h2 e() {
        return super.e();
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ void h(int i10) {
        super.h(i10);
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ void i(v1 v1Var) {
        super.i(v1Var);
    }

    @Override // io.grpc.k2
    public void j(RespT respt) {
        m().j(respt);
    }

    @Override // io.grpc.c2, io.grpc.k2
    @e0("https://github.com/grpc/grpc-java/issues/1704")
    public /* bridge */ /* synthetic */ void k(String str) {
        super.k(str);
    }

    @Override // io.grpc.c2, io.grpc.k2
    public /* bridge */ /* synthetic */ void l(boolean z10) {
        super.l(z10);
    }

    @Override // io.grpc.c2
    protected abstract k2<ReqT, RespT> m();

    @Override // io.grpc.c2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
