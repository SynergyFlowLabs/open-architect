package io.grpc.stub;

import com.google.common.base.j0;
import io.grpc.h0;
import io.grpc.i0;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    private static final class a implements io.grpc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v1 f290935a;

        /* JADX INFO: renamed from: io.grpc.stub.j$a$a, reason: collision with other inner class name */
        private final class C1988a<ReqT, RespT> extends h0.a<ReqT, RespT> {
            C1988a(io.grpc.k<ReqT, RespT> kVar) {
                super(kVar);
            }

            @Override // io.grpc.h0, io.grpc.k
            public void h(io.grpc.k.a<RespT> aVar, v1 v1Var) {
                v1Var.s(a.this.f290935a);
                super.h(aVar, v1Var);
            }
        }

        a(v1 v1Var) {
            this.f290935a = (v1) j0.F(v1Var, "extraHeaders");
        }

        @Override // io.grpc.l
        public <ReqT, RespT> io.grpc.k<ReqT, RespT> a(w1<ReqT, RespT> w1Var, io.grpc.e eVar, io.grpc.f fVar) {
            return new C1988a(fVar.g(w1Var, eVar));
        }
    }

    private static final class b implements io.grpc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<v1> f290937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<v1> f290938b;

        private final class a<ReqT, RespT> extends h0.a<ReqT, RespT> {

            /* JADX INFO: renamed from: io.grpc.stub.j$b$a$a, reason: collision with other inner class name */
            private final class C1989a extends i0.a<RespT> {
                C1989a(io.grpc.k.a<RespT> aVar) {
                    super(aVar);
                }

                @Override // io.grpc.i0.a, io.grpc.i0, io.grpc.b2, io.grpc.k.a
                public void a(y2 y2Var, v1 v1Var) {
                    b.this.f290938b.set(v1Var);
                    super.a(y2Var, v1Var);
                }

                @Override // io.grpc.i0.a, io.grpc.i0, io.grpc.b2, io.grpc.k.a
                public void b(v1 v1Var) {
                    b.this.f290937a.set(v1Var);
                    super.b(v1Var);
                }
            }

            a(io.grpc.k<ReqT, RespT> kVar) {
                super(kVar);
            }

            @Override // io.grpc.h0, io.grpc.k
            public void h(io.grpc.k.a<RespT> aVar, v1 v1Var) {
                b.this.f290937a.set(null);
                b.this.f290938b.set(null);
                super.h(new C1989a(aVar), v1Var);
            }
        }

        b(AtomicReference<v1> atomicReference, AtomicReference<v1> atomicReference2) {
            this.f290937a = (AtomicReference) j0.F(atomicReference, "headersCapture");
            this.f290938b = (AtomicReference) j0.F(atomicReference2, "trailersCapture");
        }

        @Override // io.grpc.l
        public <ReqT, RespT> io.grpc.k<ReqT, RespT> a(w1<ReqT, RespT> w1Var, io.grpc.e eVar, io.grpc.f fVar) {
            return new a(fVar.g(w1Var, eVar));
        }
    }

    private j() {
    }

    public static io.grpc.l a(v1 v1Var) {
        return new a(v1Var);
    }

    public static io.grpc.l b(AtomicReference<v1> atomicReference, AtomicReference<v1> atomicReference2) {
        return new b(atomicReference, atomicReference2);
    }
}
