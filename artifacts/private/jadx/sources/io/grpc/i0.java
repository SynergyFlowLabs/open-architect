package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i0<RespT> extends b2<RespT> {

    public static abstract class a<RespT> extends i0<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k.a<RespT> f288810a;

        protected a(k.a<RespT> aVar) {
            this.f288810a = aVar;
        }

        @Override // io.grpc.i0, io.grpc.b2, io.grpc.k.a
        public /* bridge */ /* synthetic */ void a(y2 y2Var, v1 v1Var) {
            super.a(y2Var, v1Var);
        }

        @Override // io.grpc.i0, io.grpc.b2, io.grpc.k.a
        public /* bridge */ /* synthetic */ void b(v1 v1Var) {
            super.b(v1Var);
        }

        @Override // io.grpc.i0, io.grpc.b2, io.grpc.k.a
        public /* bridge */ /* synthetic */ void d() {
            super.d();
        }

        @Override // io.grpc.i0, io.grpc.b2
        protected k.a<RespT> e() {
            return this.f288810a;
        }

        @Override // io.grpc.i0, io.grpc.b2
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.b2, io.grpc.k.a
    public /* bridge */ /* synthetic */ void a(y2 y2Var, v1 v1Var) {
        super.a(y2Var, v1Var);
    }

    @Override // io.grpc.b2, io.grpc.k.a
    public /* bridge */ /* synthetic */ void b(v1 v1Var) {
        super.b(v1Var);
    }

    @Override // io.grpc.k.a
    public void c(RespT respt) {
        e().c(respt);
    }

    @Override // io.grpc.b2, io.grpc.k.a
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // io.grpc.b2
    protected abstract k.a<RespT> e();

    @Override // io.grpc.b2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
