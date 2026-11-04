package io.grpc;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 {

    class a implements w1.c<InputStream> {
        a() {
        }

        @Override // io.grpc.w1.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream a(InputStream inputStream) {
            if (inputStream.markSupported()) {
                return inputStream;
            }
            return inputStream instanceof n1 ? new d(inputStream) : new BufferedInputStream(inputStream);
        }

        @Override // io.grpc.w1.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [WRespT, WReqT] */
    class b<WReqT, WRespT> implements m2<WReqT, WRespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1 f290839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f290840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m2 f290841c;

        /* JADX INFO: Add missing generic type declarations: [OReqT, ORespT] */
        class a<OReqT, ORespT> extends c2<OReqT, ORespT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k2 f290842a;

            a(k2 k2Var) {
                this.f290842a = k2Var;
            }

            @Override // io.grpc.k2
            public w1<OReqT, ORespT> d() {
                return b.this.f290839a;
            }

            @Override // io.grpc.k2
            public void j(ORespT orespt) {
                m().j(b.this.f290840b.s(b.this.f290839a.v(orespt)));
            }

            @Override // io.grpc.c2
            protected k2<WReqT, WRespT> m() {
                return this.f290842a;
            }
        }

        /* JADX INFO: renamed from: io.grpc.p2$b$b, reason: collision with other inner class name */
        class C1985b extends d2<WReqT> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k2.a f290844a;

            C1985b(k2.a aVar) {
                this.f290844a = aVar;
            }

            @Override // io.grpc.k2.a
            public void d(WReqT wreqt) {
                f().d(b.this.f290839a.r(b.this.f290840b.u(wreqt)));
            }

            @Override // io.grpc.d2
            protected k2.a<OReqT> f() {
                return this.f290844a;
            }
        }

        b(w1 w1Var, w1 w1Var2, m2 m2Var) {
            this.f290839a = w1Var;
            this.f290840b = w1Var2;
            this.f290841c = m2Var;
        }

        @Override // io.grpc.m2
        public k2.a<WReqT> a(k2<WReqT, WRespT> k2Var, v1 v1Var) {
            return new C1985b(this.f290841c.a(new a(k2Var), v1Var));
        }
    }

    static final class c<ReqT, RespT> implements m2<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o2 f290846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m2<ReqT, RespT> f290847b;

        private c(o2 o2Var, m2<ReqT, RespT> m2Var) {
            this.f290846a = (o2) com.google.common.base.j0.F(o2Var, "interceptor");
            this.f290847b = m2Var;
        }

        public static <ReqT, RespT> c<ReqT, RespT> b(o2 o2Var, m2<ReqT, RespT> m2Var) {
            return new c<>(o2Var, m2Var);
        }

        @Override // io.grpc.m2
        public k2.a<ReqT> a(k2<ReqT, RespT> k2Var, v1 v1Var) {
            return this.f290846a.a(k2Var, v1Var, this.f290847b);
        }
    }

    private static final class d extends BufferedInputStream implements n1 {
        d(InputStream inputStream) {
            super(inputStream);
        }
    }

    private p2() {
    }

    public static t2 a(io.grpc.c cVar, List<? extends o2> list) {
        com.google.common.base.j0.F(cVar, "bindableService");
        return c(cVar.a(), list);
    }

    public static t2 b(io.grpc.c cVar, o2... o2VarArr) {
        com.google.common.base.j0.F(cVar, "bindableService");
        return c(cVar.a(), Arrays.asList(o2VarArr));
    }

    public static t2 c(t2 t2Var, List<? extends o2> list) {
        com.google.common.base.j0.F(t2Var, "serviceDef");
        if (list.isEmpty()) {
            return t2Var;
        }
        t2.b bVarA = t2.a(t2Var.e());
        Iterator<q2<?, ?>> it = t2Var.d().iterator();
        while (it.hasNext()) {
            l(bVarA, it.next(), list);
        }
        return bVarA.c();
    }

    public static t2 d(t2 t2Var, o2... o2VarArr) {
        return c(t2Var, Arrays.asList(o2VarArr));
    }

    public static t2 e(io.grpc.c cVar, List<? extends o2> list) {
        return g(cVar.a(), list);
    }

    public static t2 f(io.grpc.c cVar, o2... o2VarArr) {
        return g(cVar.a(), Arrays.asList(o2VarArr));
    }

    public static t2 g(t2 t2Var, List<? extends o2> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return c(t2Var, arrayList);
    }

    public static t2 h(t2 t2Var, o2... o2VarArr) {
        return g(t2Var, Arrays.asList(o2VarArr));
    }

    @e0("https://github.com/grpc/grpc-java/issues/1712")
    public static t2 i(t2 t2Var) {
        return j(t2Var, new a());
    }

    @e0("https://github.com/grpc/grpc-java/issues/1712")
    public static <T> t2 j(t2 t2Var, w1.c<T> cVar) {
        return k(t2Var, cVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e0("https://github.com/grpc/grpc-java/issues/9870")
    public static <ReqT, RespT> t2 k(t2 t2Var, w1.c<ReqT> cVar, w1.c<RespT> cVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (q2<?, ?> q2Var : t2Var.d()) {
            w1 w1VarA = q2Var.b().x(cVar, cVar2).a();
            arrayList2.add(w1VarA);
            arrayList.add(n(q2Var, w1VarA));
        }
        w2.b bVarI = w2.d(t2Var.e().b()).i(t2Var.e().c());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            bVarI.f((w1) it.next());
        }
        t2.b bVarA = t2.a(bVarI.g());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bVarA.b((q2) it2.next());
        }
        return bVarA.c();
    }

    private static <ReqT, RespT> void l(t2.b bVar, q2<ReqT, RespT> q2Var, List<? extends o2> list) {
        m2<ReqT, RespT> m2VarC = q2Var.c();
        Iterator<? extends o2> it = list.iterator();
        while (it.hasNext()) {
            m2VarC = c.b(it.next(), m2VarC);
        }
        bVar.b(q2Var.d(m2VarC));
    }

    private static <OReqT, ORespT, WReqT, WRespT> m2<WReqT, WRespT> m(m2<OReqT, ORespT> m2Var, w1<OReqT, ORespT> w1Var, w1<WReqT, WRespT> w1Var2) {
        return new b(w1Var, w1Var2, m2Var);
    }

    static <OReqT, ORespT, WReqT, WRespT> q2<WReqT, WRespT> n(q2<OReqT, ORespT> q2Var, w1<WReqT, WRespT> w1Var) {
        return q2.a(w1Var, m(q2Var.c(), q2Var.b(), w1Var));
    }
}
