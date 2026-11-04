package io.grpc.internal;

import io.grpc.internal.p2.a;

/* JADX INFO: loaded from: classes13.dex */
final class p2 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final io.grpc.a.c<b> f289688e = io.grpc.a.c.a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.x1 f289689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f289690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.grpc.c3 f289691d;

    @com.google.common.annotations.e
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p2.this.b();
        }
    }

    class b {
        b() {
        }

        public void a(io.grpc.y2 y2Var) {
            if (y2Var.r()) {
                p2.this.f289690c.reset();
            } else {
                p2.this.f289690c.a(p2.this.new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends io.grpc.x1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.x1.e f289694a;

        c(io.grpc.x1.e eVar) {
            this.f289694a = eVar;
        }

        @Override // io.grpc.x1.e, io.grpc.x1.f
        public void b(io.grpc.y2 y2Var) {
            this.f289694a.b(y2Var);
            p2.this.f289691d.execute(new Runnable() { // from class: io.grpc.internal.q2
                @Override // java.lang.Runnable
                public final void run() {
                    p2.c cVar = this.f289720a;
                    p2.this.f289690c.a(p2.this.new a());
                }
            });
        }

        @Override // io.grpc.x1.e
        public void c(io.grpc.x1.g gVar) {
            io.grpc.a aVarB = gVar.b();
            io.grpc.a.c<b> cVar = p2.f289688e;
            if (aVarB.b(cVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f289694a.c(gVar.e().c(gVar.b().g().d(cVar, p2.this.new b()).a()).a());
        }
    }

    p2(io.grpc.x1 x1Var, o2 o2Var, io.grpc.c3 c3Var) {
        super(x1Var);
        this.f289689b = x1Var;
        this.f289690c = o2Var;
        this.f289691d = c3Var;
    }

    @Override // io.grpc.internal.r0, io.grpc.x1
    public void c() {
        super.c();
        this.f289690c.reset();
    }

    @Override // io.grpc.internal.r0, io.grpc.x1
    public void d(io.grpc.x1.e eVar) {
        super.d(new c(eVar));
    }

    @com.google.common.annotations.e
    io.grpc.x1 h() {
        return this.f289689b;
    }
}
