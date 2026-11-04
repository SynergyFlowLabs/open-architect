package io.grpc.util;

import com.google.common.base.j0;
import io.grpc.o1;
import io.grpc.t0;
import io.grpc.v;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1.f f291037a;

    @com.google.common.annotations.e
    static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o1.j f291038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o1.l f291039b;

        /* JADX INFO: renamed from: io.grpc.util.i$a$a, reason: collision with other inner class name */
        class C1992a implements o1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o1.l f291040a;

            C1992a(o1.l lVar) {
                this.f291040a = lVar;
            }

            @Override // io.grpc.o1.l
            public void a(v vVar) {
                this.f291040a.a(vVar);
                a.this.f291039b.a(vVar);
            }
        }

        a(o1.j jVar, o1.l lVar) {
            this.f291038a = (o1.j) j0.F(jVar, "delegate");
            this.f291039b = (o1.l) j0.F(lVar, "healthListener");
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public io.grpc.a d() {
            return super.d().g().d(o1.f290193d, Boolean.TRUE).a();
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public void i(o1.l lVar) {
            this.f291038a.i(new C1992a(lVar));
        }

        @Override // io.grpc.util.g
        public o1.j k() {
            return this.f291038a;
        }
    }

    public i(o1.f fVar) {
        this.f291037a = (o1.f) j0.F(fVar, "helper");
    }

    @Override // io.grpc.util.f, io.grpc.o1.f
    public o1.j f(o1.b bVar) {
        o1.l lVar = (o1.l) bVar.c(o1.f290192c);
        o1.j jVarF = super.f(bVar);
        return (lVar == null || jVarF.d().b(o1.f290193d) != null) ? jVarF : new a(jVarF, lVar);
    }

    @Override // io.grpc.util.f
    protected o1.f t() {
        return this.f291037a;
    }
}
