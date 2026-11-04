package io.grpc;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1914")
public final class q extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f290859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f290860b;

    private static final class a extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.a f290861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v1 f290862b;

        public a(d.a aVar, v1 v1Var) {
            this.f290861a = aVar;
            this.f290862b = v1Var;
        }

        @Override // io.grpc.d.a
        public void a(v1 v1Var) {
            com.google.common.base.j0.F(v1Var, "headers");
            v1 v1Var2 = new v1();
            v1Var2.s(this.f290862b);
            v1Var2.s(v1Var);
            this.f290861a.a(v1Var2);
        }

        @Override // io.grpc.d.a
        public void b(y2 y2Var) {
            this.f290861a.b(y2Var);
        }
    }

    private final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f290863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f290864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d.a f290865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w f290866d;

        public b(d.b bVar, Executor executor, d.a aVar, w wVar) {
            this.f290863a = bVar;
            this.f290864b = executor;
            this.f290865c = (d.a) com.google.common.base.j0.F(aVar, "delegate");
            this.f290866d = (w) com.google.common.base.j0.F(wVar, "context");
        }

        @Override // io.grpc.d.a
        public void a(v1 v1Var) {
            com.google.common.base.j0.F(v1Var, "headers");
            w wVarB = this.f290866d.b();
            try {
                q.this.f290860b.a(this.f290863a, this.f290864b, new a(this.f290865c, v1Var));
                w wVar = this.f290866d;
            } finally {
                this.f290866d.j(wVarB);
            }
        }

        @Override // io.grpc.d.a
        public void b(y2 y2Var) {
            this.f290865c.b(y2Var);
        }
    }

    public q(d dVar, d dVar2) {
        this.f290859a = (d) com.google.common.base.j0.F(dVar, "creds1");
        this.f290860b = (d) com.google.common.base.j0.F(dVar2, "creds2");
    }

    @Override // io.grpc.d
    public void a(d.b bVar, Executor executor, d.a aVar) {
        this.f290859a.a(bVar, executor, new b(bVar, executor, aVar, w.g()));
    }
}
