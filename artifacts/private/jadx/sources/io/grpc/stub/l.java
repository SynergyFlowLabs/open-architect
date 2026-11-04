package io.grpc.stub;

import com.google.common.base.j0;
import io.grpc.k2;
import io.grpc.m2;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f290941a = "Too many requests";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f290942b = "Half-closed without a request";

    public interface a<ReqT, RespT> extends f<ReqT, RespT> {
        m<ReqT> b(m<RespT> mVar);
    }

    public interface b<ReqT, RespT> extends f<ReqT, RespT> {
        @Override // io.grpc.stub.l.f, io.grpc.stub.l.a
        m<ReqT> b(m<RespT> mVar);
    }

    static class c<V> implements m<V> {
        c() {
        }

        @Override // io.grpc.stub.m
        public void onCompleted() {
        }

        @Override // io.grpc.stub.m
        public void onError(Throwable th2) {
        }

        @Override // io.grpc.stub.m
        public void onNext(V v10) {
        }
    }

    private static final class d<ReqT, RespT> extends k<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k2<ReqT, RespT> f290943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f290944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f290945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f290946d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f290948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Runnable f290949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Runnable f290950h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Runnable f290953k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f290947e = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f290951i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f290952j = false;

        d(k2<ReqT, RespT> k2Var, boolean z10) {
            this.f290943a = k2Var;
            this.f290944b = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            this.f290946d = true;
        }

        @Override // io.grpc.stub.e
        public void b() {
            g();
        }

        @Override // io.grpc.stub.k, io.grpc.stub.e
        public boolean c() {
            return this.f290943a.g();
        }

        @Override // io.grpc.stub.k, io.grpc.stub.e
        public void d(int i10) {
            this.f290943a.h(i10);
        }

        @Override // io.grpc.stub.k, io.grpc.stub.e
        public void e(boolean z10) {
            this.f290943a.l(z10);
        }

        @Override // io.grpc.stub.k, io.grpc.stub.e
        public void f(Runnable runnable) {
            j0.h0(!this.f290946d, "Cannot alter onReadyHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f290949g = runnable;
        }

        @Override // io.grpc.stub.k
        public void g() {
            j0.h0(!this.f290946d, "Cannot disable auto flow control after initialization");
            this.f290947e = false;
        }

        @Override // io.grpc.stub.k
        public boolean h() {
            return this.f290943a.f();
        }

        @Override // io.grpc.stub.k
        public void i(String str) {
            this.f290943a.k(str);
        }

        @Override // io.grpc.stub.k
        public void j(Runnable runnable) {
            j0.h0(!this.f290946d, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f290950h = runnable;
        }

        @Override // io.grpc.stub.k
        public void k(Runnable runnable) {
            j0.h0(!this.f290946d, "Cannot alter onCloseHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f290953k = runnable;
        }

        @Override // io.grpc.stub.m
        public void onCompleted() {
            this.f290943a.a(y2.f291450e, new v1());
            this.f290952j = true;
        }

        @Override // io.grpc.stub.m
        public void onError(Throwable th2) {
            v1 v1VarS = y2.s(th2);
            if (v1VarS == null) {
                v1VarS = new v1();
            }
            this.f290943a.a(y2.n(th2), v1VarS);
            this.f290951i = true;
        }

        @Override // io.grpc.stub.m
        public void onNext(RespT respt) {
            if (this.f290945c && this.f290944b) {
                throw y2.f291451f.u("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception").e();
            }
            j0.h0(!this.f290951i, "Stream was terminated by error, no further calls are allowed");
            j0.h0(!this.f290952j, "Stream is already completed, no further calls are allowed");
            if (!this.f290948f) {
                this.f290943a.i(new v1());
                this.f290948f = true;
            }
            this.f290943a.j(respt);
        }
    }

    public interface e<ReqT, RespT> extends i<ReqT, RespT> {
        void a(ReqT reqt, m<RespT> mVar);
    }

    private interface f<ReqT, RespT> {
        m<ReqT> b(m<RespT> mVar);
    }

    private static final class g<ReqT, RespT> implements m2<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f<ReqT, RespT> f290954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f290955b;

        private final class a extends k2.a<ReqT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final m<ReqT> f290956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final d<ReqT, RespT> f290957b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final k2<ReqT, RespT> f290958c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f290959d = false;

            a(m<ReqT> mVar, d<ReqT, RespT> dVar, k2<ReqT, RespT> k2Var) {
                this.f290956a = mVar;
                this.f290957b = dVar;
                this.f290958c = k2Var;
            }

            @Override // io.grpc.k2.a
            public void a() {
                if (((d) this.f290957b).f290950h != null) {
                    ((d) this.f290957b).f290950h.run();
                } else {
                    this.f290957b.f290945c = true;
                }
                if (!this.f290959d) {
                    this.f290956a.onError(y2.f291451f.u("client cancelled").e());
                }
            }

            @Override // io.grpc.k2.a
            public void b() {
                if (((d) this.f290957b).f290953k != null) {
                    ((d) this.f290957b).f290953k.run();
                }
            }

            @Override // io.grpc.k2.a
            public void c() {
                this.f290959d = true;
                this.f290956a.onCompleted();
            }

            @Override // io.grpc.k2.a
            public void d(ReqT reqt) {
                this.f290956a.onNext(reqt);
                if (((d) this.f290957b).f290947e) {
                    this.f290958c.h(1);
                }
            }

            @Override // io.grpc.k2.a
            public void e() {
                if (((d) this.f290957b).f290949g != null) {
                    ((d) this.f290957b).f290949g.run();
                }
            }
        }

        g(f<ReqT, RespT> fVar, boolean z10) {
            this.f290954a = fVar;
            this.f290955b = z10;
        }

        @Override // io.grpc.m2
        public k2.a<ReqT> a(k2<ReqT, RespT> k2Var, v1 v1Var) {
            d dVar = new d(k2Var, this.f290955b);
            m<ReqT> mVarB = this.f290954a.b(dVar);
            dVar.q();
            if (dVar.f290947e) {
                k2Var.h(1);
            }
            return new a(mVarB, dVar, k2Var);
        }
    }

    public interface h<ReqT, RespT> extends i<ReqT, RespT> {
        @Override // io.grpc.stub.l.i, io.grpc.stub.l.e
        void a(ReqT reqt, m<RespT> mVar);
    }

    private interface i<ReqT, RespT> {
        void a(ReqT reqt, m<RespT> mVar);
    }

    private static final class j<ReqT, RespT> implements m2<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i<ReqT, RespT> f290961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f290962b;

        private final class a extends k2.a<ReqT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final k2<ReqT, RespT> f290963a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final d<ReqT, RespT> f290964b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f290965c = true;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f290966d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ReqT f290967e;

            a(d<ReqT, RespT> dVar, k2<ReqT, RespT> k2Var) {
                this.f290963a = k2Var;
                this.f290964b = dVar;
            }

            @Override // io.grpc.k2.a
            public void a() {
                if (((d) this.f290964b).f290950h != null) {
                    ((d) this.f290964b).f290950h.run();
                } else {
                    this.f290964b.f290945c = true;
                }
            }

            @Override // io.grpc.k2.a
            public void b() {
                if (((d) this.f290964b).f290953k != null) {
                    ((d) this.f290964b).f290953k.run();
                }
            }

            @Override // io.grpc.k2.a
            public void c() {
                if (this.f290965c) {
                    if (this.f290967e == null) {
                        this.f290963a.a(y2.f291464s.u(l.f290942b), new v1());
                        return;
                    }
                    j.this.f290961a.a(this.f290967e, this.f290964b);
                    this.f290967e = null;
                    this.f290964b.q();
                    if (this.f290966d) {
                        e();
                    }
                }
            }

            @Override // io.grpc.k2.a
            public void d(ReqT reqt) {
                if (this.f290967e == null) {
                    this.f290967e = reqt;
                    return;
                }
                this.f290963a.a(y2.f291464s.u(l.f290941a), new v1());
                int i10 = 4 & 0;
                this.f290965c = false;
            }

            @Override // io.grpc.k2.a
            public void e() {
                this.f290966d = true;
                if (((d) this.f290964b).f290949g != null) {
                    ((d) this.f290964b).f290949g.run();
                }
            }
        }

        j(i<ReqT, RespT> iVar, boolean z10) {
            this.f290961a = iVar;
            this.f290962b = z10;
        }

        @Override // io.grpc.m2
        public k2.a<ReqT> a(k2<ReqT, RespT> k2Var, v1 v1Var) {
            j0.e(k2Var.d().l().k(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            d dVar = new d(k2Var, this.f290962b);
            k2Var.h(2);
            return new a(dVar, k2Var);
        }
    }

    private l() {
    }

    public static <ReqT, RespT> m2<ReqT, RespT> a(a<ReqT, RespT> aVar) {
        return new g(aVar, true);
    }

    public static <ReqT, RespT> m2<ReqT, RespT> b(b<ReqT, RespT> bVar) {
        return new g(bVar, false);
    }

    public static <ReqT, RespT> m2<ReqT, RespT> c(e<ReqT, RespT> eVar) {
        return new j(eVar, true);
    }

    public static <ReqT, RespT> m2<ReqT, RespT> d(h<ReqT, RespT> hVar) {
        return new j(hVar, false);
    }

    public static <ReqT> m<ReqT> e(w1<?, ?> w1Var, m<?> mVar) {
        f(w1Var, mVar);
        return new c();
    }

    public static void f(w1<?, ?> w1Var, m<?> mVar) {
        j0.F(w1Var, "methodDescriptor");
        j0.F(mVar, "responseObserver");
        mVar.onError(y2.f291463r.u(String.format("Method %s is unimplemented", w1Var.f())).e());
    }
}
