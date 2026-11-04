package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/2861")
public abstract class n extends b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e.c<Long> f290181a = e.c.b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public static abstract class a {
        public n a(b bVar, v1 v1Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/2861")
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f290182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f290183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f290184c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private e f290185a = e.f288718k;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f290186b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f290187c;

            a() {
            }

            public b a() {
                return new b(this.f290185a, this.f290186b, this.f290187c);
            }

            public a b(e eVar) {
                this.f290185a = (e) com.google.common.base.j0.F(eVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z10) {
                this.f290187c = z10;
                return this;
            }

            public a d(int i10) {
                this.f290186b = i10;
                return this;
            }
        }

        b(e eVar, int i10, boolean z10) {
            this.f290182a = (e) com.google.common.base.j0.F(eVar, "callOptions");
            this.f290183b = i10;
            this.f290184c = z10;
        }

        public static a d() {
            return new a();
        }

        public e a() {
            return this.f290182a;
        }

        public int b() {
            return this.f290183b;
        }

        public boolean c() {
            return this.f290184c;
        }

        public a e() {
            return new a().b(this.f290182a).d(this.f290183b).c(this.f290184c);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("callOptions", this.f290182a).d("previousAttempts", this.f290183b).g("isTransparentRetry", this.f290184c).toString();
        }
    }

    public void j() {
    }

    public void k() {
    }

    public void l(v1 v1Var) {
    }

    public void m() {
    }

    public void n(io.grpc.a aVar, v1 v1Var) {
    }
}
