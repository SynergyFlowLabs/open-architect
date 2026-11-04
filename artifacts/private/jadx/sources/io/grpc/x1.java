package io.grpc;

import io.sentry.a8;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1770")
public abstract class x1 {

    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f291414a;

        a(f fVar) {
            this.f291414a = fVar;
        }

        @Override // io.grpc.x1.e, io.grpc.x1.f
        public void b(y2 y2Var) {
            this.f291414a.b(y2Var);
        }

        @Override // io.grpc.x1.e
        public void c(g gVar) {
            this.f291414a.a(gVar.a(), gVar.b());
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f291416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g2 f291417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c3 f291418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i f291419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.h
        private final ScheduledExecutorService f291420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.h
        private final io.grpc.h f291421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.h
        private final Executor f291422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.h
        private final String f291423h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f291424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private g2 f291425b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private c3 f291426c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private i f291427d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f291428e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private io.grpc.h f291429f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f291430g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f291431h;

            a() {
            }

            public b a() {
                return new b(this.f291424a, this.f291425b, this.f291426c, this.f291427d, this.f291428e, this.f291429f, this.f291430g, this.f291431h, null);
            }

            @e0("https://github.com/grpc/grpc-java/issues/6438")
            public a b(io.grpc.h hVar) {
                this.f291429f = (io.grpc.h) com.google.common.base.j0.E(hVar);
                return this;
            }

            public a c(int i10) {
                this.f291424a = Integer.valueOf(i10);
                return this;
            }

            public a d(Executor executor) {
                this.f291430g = executor;
                return this;
            }

            @e0("https://github.com/grpc/grpc-java/issues/9406")
            public a e(String str) {
                this.f291431h = str;
                return this;
            }

            public a f(g2 g2Var) {
                this.f291425b = (g2) com.google.common.base.j0.E(g2Var);
                return this;
            }

            @e0("https://github.com/grpc/grpc-java/issues/6454")
            public a g(ScheduledExecutorService scheduledExecutorService) {
                this.f291428e = (ScheduledExecutorService) com.google.common.base.j0.E(scheduledExecutorService);
                return this;
            }

            public a h(i iVar) {
                this.f291427d = (i) com.google.common.base.j0.E(iVar);
                return this;
            }

            public a i(c3 c3Var) {
                this.f291426c = (c3) com.google.common.base.j0.E(c3Var);
                return this;
            }
        }

        /* synthetic */ b(Integer num, g2 g2Var, c3 c3Var, i iVar, ScheduledExecutorService scheduledExecutorService, io.grpc.h hVar, Executor executor, String str, a aVar) {
            this(num, g2Var, c3Var, iVar, scheduledExecutorService, hVar, executor, str);
        }

        public static a i() {
            return new a();
        }

        @e0("https://github.com/grpc/grpc-java/issues/6438")
        public io.grpc.h a() {
            io.grpc.h hVar = this.f291421f;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("ChannelLogger is not set in Builder");
        }

        public int b() {
            return this.f291416a;
        }

        @fj.h
        public Executor c() {
            return this.f291422g;
        }

        @fj.h
        @e0("https://github.com/grpc/grpc-java/issues/9406")
        public String d() {
            return this.f291423h;
        }

        public g2 e() {
            return this.f291417b;
        }

        @e0("https://github.com/grpc/grpc-java/issues/6454")
        public ScheduledExecutorService f() {
            ScheduledExecutorService scheduledExecutorService = this.f291420e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public i g() {
            return this.f291419d;
        }

        public c3 h() {
            return this.f291418c;
        }

        public a j() {
            a aVar = new a();
            aVar.c(this.f291416a);
            aVar.f(this.f291417b);
            aVar.i(this.f291418c);
            aVar.h(this.f291419d);
            aVar.g(this.f291420e);
            aVar.b(this.f291421f);
            aVar.d(this.f291422g);
            aVar.e(this.f291423h);
            return aVar;
        }

        public String toString() {
            return com.google.common.base.b0.c(this).d("defaultPort", this.f291416a).f("proxyDetector", this.f291417b).f("syncContext", this.f291418c).f("serviceConfigParser", this.f291419d).f("scheduledExecutorService", this.f291420e).f("channelLogger", this.f291421f).f("executor", this.f291422g).f("overrideAuthority", this.f291423h).toString();
        }

        private b(Integer num, g2 g2Var, c3 c3Var, i iVar, @fj.h ScheduledExecutorService scheduledExecutorService, @fj.h io.grpc.h hVar, @fj.h Executor executor, @fj.h String str) {
            this.f291416a = ((Integer) com.google.common.base.j0.F(num, "defaultPort not set")).intValue();
            this.f291417b = (g2) com.google.common.base.j0.F(g2Var, "proxyDetector not set");
            this.f291418c = (c3) com.google.common.base.j0.F(c3Var, "syncContext not set");
            this.f291419d = (i) com.google.common.base.j0.F(iVar, "serviceConfigParser not set");
            this.f291420e = scheduledExecutorService;
            this.f291421f = hVar;
            this.f291422g = executor;
            this.f291423h = str;
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class d {
        public abstract String a();

        public abstract x1 b(URI uri, b bVar);
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class e implements f {
        @Override // io.grpc.x1.f
        @z7.m(imports = {"io.grpc.NameResolver.ResolutionResult"}, replacement = "this.onResult(ResolutionResult.newBuilder().setAddresses(servers).setAttributes(attributes).build())")
        @Deprecated
        public final void a(List<d0> list, io.grpc.a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        @Override // io.grpc.x1.f
        public abstract void b(y2 y2Var);

        public abstract void c(g gVar);
    }

    @gj.d
    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public interface f {
        void a(List<d0> list, io.grpc.a aVar);

        void b(y2 y2Var);
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d0> f291435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.a f291436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        private final c f291437c;

        @e0("https://github.com/grpc/grpc-java/issues/1770")
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List<d0> f291438a = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private io.grpc.a f291439b = io.grpc.a.f288673c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @fj.h
            private c f291440c;

            a() {
            }

            public g a() {
                return new g(this.f291438a, this.f291439b, this.f291440c);
            }

            public a b(List<d0> list) {
                this.f291438a = list;
                return this;
            }

            public a c(io.grpc.a aVar) {
                this.f291439b = aVar;
                return this;
            }

            public a d(@fj.h c cVar) {
                this.f291440c = cVar;
                return this;
            }
        }

        g(List<d0> list, io.grpc.a aVar, c cVar) {
            this.f291435a = Collections.unmodifiableList(new ArrayList(list));
            this.f291436b = (io.grpc.a) com.google.common.base.j0.F(aVar, a8.b.f303905f);
            this.f291437c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<d0> a() {
            return this.f291435a;
        }

        public io.grpc.a b() {
            return this.f291436b;
        }

        @fj.h
        public c c() {
            return this.f291437c;
        }

        public a e() {
            return d().b(this.f291435a).c(this.f291436b).d(this.f291437c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return com.google.common.base.d0.a(this.f291435a, gVar.f291435a) && com.google.common.base.d0.a(this.f291436b, gVar.f291436b) && com.google.common.base.d0.a(this.f291437c, gVar.f291437c);
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f291435a, this.f291436b, this.f291437c);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("addresses", this.f291435a).f(a8.b.f303905f, this.f291436b).f("serviceConfig", this.f291437c).toString();
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @e0("https://github.com/grpc/grpc-java/issues/4972")
    public @interface h {
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class i {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(fVar));
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1770")
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f291432c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y2 f291433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f291434b;

        private c(Object obj) {
            this.f291434b = com.google.common.base.j0.F(obj, "config");
            this.f291433a = null;
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(y2 y2Var) {
            return new c(y2Var);
        }

        @fj.h
        public Object c() {
            return this.f291434b;
        }

        @fj.h
        public y2 d() {
            return this.f291433a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (com.google.common.base.d0.a(this.f291433a, cVar.f291433a) && com.google.common.base.d0.a(this.f291434b, cVar.f291434b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f291433a, this.f291434b);
        }

        public String toString() {
            return this.f291434b != null ? com.google.common.base.b0.c(this).f("config", this.f291434b).toString() : com.google.common.base.b0.c(this).f("error", this.f291433a).toString();
        }

        private c(y2 y2Var) {
            this.f291434b = null;
            this.f291433a = (y2) com.google.common.base.j0.F(y2Var, "status");
            com.google.common.base.j0.u(!y2Var.r(), "cannot use OK status: %s", y2Var);
        }
    }
}
