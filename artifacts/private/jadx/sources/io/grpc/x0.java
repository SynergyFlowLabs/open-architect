package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
@t0
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.grpc.a.c<x0> f291408a = io.grpc.a.c.a("internal:io.grpc.config-selector");

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y2 f291409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f291410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        public l f291411c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f291412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private l f291413b;

            public b a() {
                com.google.common.base.j0.h0(this.f291412a != null, "config is not set");
                return new b(y2.f291450e, this.f291412a, this.f291413b);
            }

            public a b(Object obj) {
                this.f291412a = com.google.common.base.j0.F(obj, "config");
                return this;
            }

            public a c(l lVar) {
                this.f291413b = (l) com.google.common.base.j0.F(lVar, "interceptor");
                return this;
            }

            private a() {
            }
        }

        public static b a(y2 y2Var) {
            com.google.common.base.j0.e(!y2Var.r(), "status is OK");
            return new b(y2Var, null, null);
        }

        public static a e() {
            return new a();
        }

        public Object b() {
            return this.f291410b;
        }

        @fj.h
        public l c() {
            return this.f291411c;
        }

        public y2 d() {
            return this.f291409a;
        }

        private b(y2 y2Var, Object obj, l lVar) {
            this.f291409a = (y2) com.google.common.base.j0.F(y2Var, "status");
            this.f291410b = obj;
            this.f291411c = lVar;
        }
    }

    public abstract b a(o1.h hVar);
}
