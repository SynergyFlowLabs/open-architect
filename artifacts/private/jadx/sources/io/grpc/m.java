package io.grpc;

import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k<Object, Object> f290164a = new b();

    class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1.c f290165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1.c f290166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f290167c;

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* JADX INFO: renamed from: io.grpc.m$a$a, reason: collision with other inner class name */
        class C1977a<ReqT, RespT> extends a2<ReqT, RespT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f290168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w1 f290169b;

            /* JADX INFO: Add missing generic type declarations: [WRespT] */
            /* JADX INFO: renamed from: io.grpc.m$a$a$a, reason: collision with other inner class name */
            class C1978a<WRespT> extends b2<WRespT> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ k.a f290171a;

                C1978a(k.a aVar) {
                    this.f290171a = aVar;
                }

                @Override // io.grpc.k.a
                public void c(WRespT wrespt) {
                    this.f290171a.c(C1977a.this.f290169b.i().a(a.this.f290166b.b(wrespt)));
                }

                @Override // io.grpc.b2
                protected k.a<?> e() {
                    return this.f290171a;
                }
            }

            C1977a(k kVar, w1 w1Var) {
                this.f290168a = kVar;
                this.f290169b = w1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.grpc.k
            public void f(ReqT reqt) {
                this.f290168a.f(a.this.f290165a.a(this.f290169b.h().b(reqt)));
            }

            @Override // io.grpc.k
            public void h(k.a<RespT> aVar, v1 v1Var) {
                this.f290168a.h(new C1978a(aVar), v1Var);
            }

            @Override // io.grpc.a2
            protected k<?, ?> i() {
                return this.f290168a;
            }
        }

        a(w1.c cVar, w1.c cVar2, l lVar) {
            this.f290165a = cVar;
            this.f290166b = cVar2;
            this.f290167c = lVar;
        }

        @Override // io.grpc.l
        public <ReqT, RespT> k<ReqT, RespT> a(w1<ReqT, RespT> w1Var, e eVar, f fVar) {
            return new C1977a(this.f290167c.a(w1Var.x(this.f290165a, this.f290166b).a(), eVar, fVar), w1Var);
        }
    }

    class b extends k<Object, Object> {
        b() {
        }

        @Override // io.grpc.k
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.k
        public void c() {
        }

        @Override // io.grpc.k
        public boolean d() {
            return false;
        }

        @Override // io.grpc.k
        public void e(int i10) {
        }

        @Override // io.grpc.k
        public void f(Object obj) {
        }

        @Override // io.grpc.k
        public void h(k.a<Object> aVar, v1 v1Var) {
        }
    }

    public static abstract class c<ReqT, RespT> extends h0<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k<ReqT, RespT> f290173a;

        protected c(k<ReqT, RespT> kVar) {
            this.f290173a = kVar;
        }

        @Override // io.grpc.h0, io.grpc.k
        public final void h(k.a<RespT> aVar, v1 v1Var) {
            try {
                j(aVar, v1Var);
            } catch (Exception e10) {
                this.f290173a = m.f290164a;
                v1 v1VarS = y2.s(e10);
                y2 y2VarN = y2.n(e10);
                if (v1VarS == null) {
                    v1VarS = new v1();
                }
                aVar.a(y2VarN, v1VarS);
            }
        }

        @Override // io.grpc.h0, io.grpc.a2
        protected final k<ReqT, RespT> i() {
            return this.f290173a;
        }

        protected abstract void j(k.a<RespT> aVar, v1 v1Var) throws Exception;
    }

    private static class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f290174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f290175b;

        /* synthetic */ d(f fVar, l lVar, a aVar) {
            this(fVar, lVar);
        }

        @Override // io.grpc.f
        public String b() {
            return this.f290174a.b();
        }

        @Override // io.grpc.f
        public <ReqT, RespT> k<ReqT, RespT> g(w1<ReqT, RespT> w1Var, e eVar) {
            return this.f290175b.a(w1Var, eVar, this.f290174a);
        }

        private d(f fVar, l lVar) {
            this.f290174a = fVar;
            this.f290175b = (l) com.google.common.base.j0.F(lVar, "interceptor");
        }
    }

    private m() {
    }

    public static f b(f fVar, List<? extends l> list) {
        com.google.common.base.j0.F(fVar, AppsFlyerProperties.CHANNEL);
        Iterator<? extends l> it = list.iterator();
        while (it.hasNext()) {
            fVar = new d(fVar, it.next(), null);
        }
        return fVar;
    }

    public static f c(f fVar, l... lVarArr) {
        return b(fVar, Arrays.asList(lVarArr));
    }

    public static f d(f fVar, List<? extends l> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return b(fVar, arrayList);
    }

    public static f e(f fVar, l... lVarArr) {
        return d(fVar, Arrays.asList(lVarArr));
    }

    static <WReqT, WRespT> l f(l lVar, w1.c<WReqT> cVar, w1.c<WRespT> cVar2) {
        return new a(cVar, cVar2, lVar);
    }
}
