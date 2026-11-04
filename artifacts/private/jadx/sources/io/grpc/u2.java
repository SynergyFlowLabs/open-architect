package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/2861")
public abstract class u2 extends b3 {

    public static abstract class a {
        public abstract u2 a(String str, v1 v1Var);
    }

    @Deprecated
    private static final class b<ReqT, RespT> extends k0<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<ReqT, RespT> f290994a;

        private b(c<ReqT, RespT> cVar) {
            this.f290994a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <ReqT, RespT> b<ReqT, RespT> o(c<ReqT, RespT> cVar) {
            return new b<>(cVar);
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public io.grpc.a b() {
            return this.f290994a.a();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public String c() {
            return this.f290994a.b();
        }

        @Override // io.grpc.k0, io.grpc.k2
        public w1<ReqT, RespT> d() {
            return this.f290994a.c();
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public boolean f() {
            return false;
        }

        @Override // io.grpc.k0, io.grpc.c2, io.grpc.k2
        public boolean g() {
            return false;
        }

        @Override // io.grpc.k0, io.grpc.c2
        protected k2<ReqT, RespT> m() {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class c<ReqT, RespT> {
        public abstract io.grpc.a a();

        @fj.h
        public abstract String b();

        public abstract w1<ReqT, RespT> c();
    }

    public w j(w wVar) {
        return wVar;
    }

    @Deprecated
    public void k(k2<?, ?> k2Var) {
    }

    public void l(c<?, ?> cVar) {
        k(b.o(cVar));
    }
}
