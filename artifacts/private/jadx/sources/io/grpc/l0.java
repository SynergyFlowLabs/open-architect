package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l0<ReqT> extends d2<ReqT> {

    public static abstract class a<ReqT> extends l0<ReqT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k2.a<ReqT> f290161a;

        protected a(k2.a<ReqT> aVar) {
            this.f290161a = aVar;
        }

        @Override // io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public /* bridge */ /* synthetic */ void a() {
            super.a();
        }

        @Override // io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public /* bridge */ /* synthetic */ void c() {
            super.c();
        }

        @Override // io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public /* bridge */ /* synthetic */ void e() {
            super.e();
        }

        @Override // io.grpc.l0, io.grpc.d2
        protected k2.a<ReqT> f() {
            return this.f290161a;
        }

        @Override // io.grpc.l0, io.grpc.d2
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.d2, io.grpc.k2.a
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // io.grpc.d2, io.grpc.k2.a
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // io.grpc.d2, io.grpc.k2.a
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // io.grpc.k2.a
    public void d(ReqT reqt) {
        f().d(reqt);
    }

    @Override // io.grpc.d2, io.grpc.k2.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // io.grpc.d2
    protected abstract k2.a<ReqT> f();

    @Override // io.grpc.d2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
