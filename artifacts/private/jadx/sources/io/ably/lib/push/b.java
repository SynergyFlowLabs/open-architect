package io.ably.lib.push;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.o;
import io.ably.lib.http.f;
import io.ably.lib.http.l;
import io.ably.lib.http.m;
import io.ably.lib.realtime.g;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.i;
import io.ably.lib.util.k;
import io.ably.lib.util.p;
import io.ably.lib.util.q;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final io.ably.lib.rest.a f287497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f287498b;

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f287499d = "io.ably.lib.push.b$a";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f287500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f287501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.ably.lib.rest.a f287502c;

        /* JADX INFO: renamed from: io.ably.lib.push.b$a$a, reason: collision with other inner class name */
        class C1933a implements f.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0[] f287503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f287504b;

            C1933a(b0[] b0VarArr, o oVar) {
                this.f287503a = b0VarArr;
                this.f287504b = oVar;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<Void> iVar) throws io.ably.lib.types.a {
                b0[] b0VarArr = this.f287503a;
                if (b0VarArr == null || b0VarArr.length == 0) {
                    throw io.ably.lib.types.a.c(new Exception("recipient cannot be empty"));
                }
                o oVar = this.f287504b;
                if (oVar == null || oVar.entrySet().isEmpty()) {
                    throw io.ably.lib.types.a.c(new Exception("payload cannot be empty"));
                }
                o oVar2 = new o();
                for (b0 b0Var : this.f287503a) {
                    oVar2.P(b0Var.f287931a, b0Var.f287932b);
                }
                o oVar3 = new o();
                oVar3.L("recipient", oVar2);
                for (Map.Entry<String, com.google.gson.l> entry : this.f287504b.entrySet()) {
                    oVar3.L(entry.getKey(), entry.getValue());
                }
                lVar.l("/push/publish", m.d(a.this.f287502c.f287674a.f288125u), io.ably.lib.util.m.a(null, a.this.f287502c.f287674a), m.m(oVar3, a.this.f287502c.f287674a.f288125u), null, true, iVar);
            }
        }

        a(io.ably.lib.rest.a aVar) {
            this.f287502c = aVar;
            this.f287500a = new d(aVar);
            this.f287501b = new c(aVar);
        }

        private f.c<Void> d(b0[] b0VarArr, o oVar) {
            k.k(f287499d, "publishImpl(): recipient=" + Arrays.toString(b0VarArr) + ", payload=" + oVar);
            return this.f287502c.f287675b.e(new C1933a(b0VarArr, oVar));
        }

        public void b(b0[] b0VarArr, o oVar) throws io.ably.lib.types.a {
            d(b0VarArr, oVar).b();
        }

        public void c(b0[] b0VarArr, o oVar, g gVar) {
            d(b0VarArr, oVar).a(new g.c(gVar));
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.push.b$b, reason: collision with other inner class name */
    public static class C1934b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static p.b<C1934b> f287506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected static io.ably.lib.http.i.e<C1934b> f287507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected static io.ably.lib.http.i.b<C1934b> f287508f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f287509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f287510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f287511c;

        /* JADX INFO: renamed from: io.ably.lib.push.b$b$a */
        class a implements p.b<C1934b> {
            a() {
            }

            @Override // io.ably.lib.util.p.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C1934b a(com.google.gson.l lVar) {
                return C1934b.c((o) lVar);
            }
        }

        static {
            a aVar = new a();
            f287506d = aVar;
            f287507e = new p.d(C1934b.class, aVar);
            f287508f = new p.c(C1934b[].class, f287506d);
        }

        private C1934b(String str, String str2, String str3) {
            this.f287509a = str;
            this.f287510b = str2;
            this.f287511c = str3;
        }

        public static C1934b a(String str, String str2) {
            return new C1934b(str, null, str2);
        }

        public static C1934b b(String str, String str2) {
            return new C1934b(str, str2, null);
        }

        public static C1934b c(o oVar) {
            return (C1934b) p.f288250c.j(oVar, C1934b.class);
        }

        public o d() {
            o oVar = new o();
            oVar.P(AppsFlyerProperties.CHANNEL, this.f287509a);
            String str = this.f287511c;
            if (str != null) {
                oVar.P(io.ably.lib.realtime.l.f287647j, str);
            }
            String str2 = this.f287510b;
            if (str2 != null) {
                oVar.P("deviceId", str2);
            }
            return oVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1934b) {
                return d().equals(((C1934b) obj).d());
            }
            return false;
        }

        public String toString() {
            return d().toString();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f287512b = "io.ably.lib.push.b$c";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.rest.a f287513a;

        class a implements f.b<C1934b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1934b f287514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ably.lib.http.i.c f287515b;

            a(C1934b c1934b, io.ably.lib.http.i.c cVar) {
                this.f287514a = c1934b;
                this.f287515b = cVar;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<C1934b> iVar) throws io.ably.lib.types.a {
                lVar.l("/push/channelSubscriptions", c.this.f287513a.f287680g.a(this.f287514a.f287510b), io.ably.lib.util.m.a(null, c.this.f287513a.f287674a), this.f287515b, C1934b.f287507e, true, iVar);
            }
        }

        /* JADX INFO: renamed from: io.ably.lib.push.b$c$b, reason: collision with other inner class name */
        class C1935b implements f.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0[] f287517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0[] f287518b;

            C1935b(b0[] b0VarArr, b0[] b0VarArr2) {
                this.f287517a = b0VarArr;
                this.f287518b = b0VarArr2;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<Void> iVar) throws io.ably.lib.types.a {
                lVar.d("/push/channelSubscriptions", this.f287517a, this.f287518b, null, true, iVar);
            }
        }

        c(io.ably.lib.rest.a aVar) {
            this.f287513a = aVar;
        }

        public a0<C1934b> b(b0[] b0VarArr) throws io.ably.lib.types.a {
            return g(b0VarArr).b();
        }

        public void c(b0[] b0VarArr, i<io.ably.lib.types.f<C1934b>> iVar) {
            g(b0VarArr).a(iVar);
        }

        public a0<String> d(b0[] b0VarArr) throws io.ably.lib.types.a {
            return f(b0VarArr).b();
        }

        public void e(b0[] b0VarArr, i<io.ably.lib.types.f<String>> iVar) {
            f(b0VarArr).a(iVar);
        }

        protected io.ably.lib.http.d.f<String> f(b0[] b0VarArr) {
            k.k(f287512b, "listChannelsImpl(): params=" + Arrays.toString(b0VarArr));
            String strH = m.h(b0VarArr, "deviceId");
            io.ably.lib.rest.a aVar = this.f287513a;
            return new io.ably.lib.http.d(aVar.f287675b, "/push/channels", aVar.f287680g.a(strH), b0VarArr, q.f288262c).h();
        }

        protected io.ably.lib.http.d.f<C1934b> g(b0[] b0VarArr) {
            k.k(f287512b, "listImpl(): params=" + Arrays.toString(b0VarArr));
            String strH = m.h(b0VarArr, "deviceId");
            io.ably.lib.rest.a aVar = this.f287513a;
            return new io.ably.lib.http.d(aVar.f287675b, "/push/channelSubscriptions", aVar.f287680g.a(strH), b0VarArr, C1934b.f287508f).h();
        }

        public void h(C1934b c1934b) throws io.ably.lib.types.a {
            j(c1934b).b();
        }

        public void i(C1934b c1934b, g gVar) {
            j(c1934b).a(new g.c(gVar));
        }

        protected f.c<Void> j(C1934b c1934b) {
            b0[] b0VarArrE;
            k.k(f287512b, "removeImpl(): subscription=" + c1934b);
            b0[] b0VarArr = {new b0(AppsFlyerProperties.CHANNEL, c1934b.f287509a)};
            String str = c1934b.f287510b;
            if (str != null) {
                b0VarArrE = b0.e(b0VarArr, "deviceId", str);
            } else {
                String str2 = c1934b.f287511c;
                if (str2 == null) {
                    return this.f287513a.f287675b.d(io.ably.lib.types.a.c(new Exception("ChannelSubscription cannot be for both a deviceId and a clientId")));
                }
                b0VarArrE = b0.e(b0VarArr, io.ably.lib.realtime.l.f287647j, str2);
            }
            return m(b0VarArrE);
        }

        public void k(b0[] b0VarArr) throws io.ably.lib.types.a {
            m(b0VarArr).b();
        }

        public void l(b0[] b0VarArr, g gVar) {
            m(b0VarArr).a(new g.c(gVar));
        }

        protected f.c<Void> m(b0[] b0VarArr) {
            k.k(f287512b, "removeWhereImpl(): params=" + Arrays.toString(b0VarArr));
            String strH = m.h(b0VarArr, "deviceId");
            return this.f287513a.f287675b.e(new C1935b(this.f287513a.f287680g.a(strH), io.ably.lib.util.m.a(b0VarArr, this.f287513a.f287674a)));
        }

        public C1934b n(C1934b c1934b) throws io.ably.lib.types.a {
            return p(c1934b).b();
        }

        public void o(C1934b c1934b, i<C1934b> iVar) {
            p(c1934b).a(iVar);
        }

        protected f.c<C1934b> p(C1934b c1934b) {
            k.k(f287512b, "saveImpl(): subscription=" + c1934b);
            return this.f287513a.f287675b.e(new a(c1934b, m.m(c1934b.d(), this.f287513a.f287674a.f288125u)));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f287520b = "io.ably.lib.push.b$d";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.rest.a f287521a;

        class a implements f.b<io.ably.lib.rest.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.ably.lib.rest.g f287522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ably.lib.http.i.c f287523b;

            a(io.ably.lib.rest.g gVar, io.ably.lib.http.i.c cVar) {
                this.f287522a = gVar;
                this.f287523b = cVar;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<io.ably.lib.rest.g> iVar) {
                lVar.m("/push/deviceRegistrations/" + this.f287522a.f287745a, d.this.f287521a.f287680g.a(this.f287522a.f287745a), io.ably.lib.util.m.a(null, d.this.f287521a.f287674a), this.f287523b, io.ably.lib.rest.g.f287743h, true, iVar);
            }
        }

        /* JADX INFO: renamed from: io.ably.lib.push.b$d$b, reason: collision with other inner class name */
        class C1936b implements f.b<io.ably.lib.rest.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f287525a;

            C1936b(String str) {
                this.f287525a = str;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<io.ably.lib.rest.g> iVar) throws io.ably.lib.types.a {
                lVar.g("/push/deviceRegistrations/" + this.f287525a, d.this.f287521a.f287680g.a(this.f287525a), io.ably.lib.util.m.a(null, d.this.f287521a.f287674a), io.ably.lib.rest.g.f287743h, true, iVar);
            }
        }

        class c implements f.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f287527a;

            c(String str) {
                this.f287527a = str;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<Void> iVar) throws io.ably.lib.types.a {
                lVar.d("/push/deviceRegistrations/" + this.f287527a, d.this.f287521a.f287680g.a(this.f287527a), io.ably.lib.util.m.a(null, d.this.f287521a.f287674a), null, true, iVar);
            }
        }

        /* JADX INFO: renamed from: io.ably.lib.push.b$d$d, reason: collision with other inner class name */
        class C1937d implements f.b<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0[] f287529a;

            C1937d(b0[] b0VarArr) {
                this.f287529a = b0VarArr;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, i<Void> iVar) throws io.ably.lib.types.a {
                lVar.d("/push/deviceRegistrations", m.d(d.this.f287521a.f287674a.f288125u), this.f287529a, null, true, iVar);
            }
        }

        d(io.ably.lib.rest.a aVar) {
            this.f287521a = aVar;
        }

        public io.ably.lib.rest.g b(String str) throws io.ably.lib.types.a {
            return d(str).b();
        }

        public void c(String str, i<io.ably.lib.rest.g> iVar) {
            d(str).a(iVar);
        }

        protected f.c<io.ably.lib.rest.g> d(String str) {
            k.k(f287520b, "getImpl(): deviceId=" + str);
            return this.f287521a.f287675b.e(new C1936b(str));
        }

        public a0<io.ably.lib.rest.g> e(b0[] b0VarArr) throws io.ably.lib.types.a {
            return g(b0VarArr).b();
        }

        public void f(b0[] b0VarArr, i<io.ably.lib.types.f<io.ably.lib.rest.g>> iVar) {
            g(b0VarArr).a(iVar);
        }

        protected io.ably.lib.http.d.f<io.ably.lib.rest.g> g(b0[] b0VarArr) {
            k.k(f287520b, "listImpl(): params=" + Arrays.toString(b0VarArr));
            io.ably.lib.rest.a aVar = this.f287521a;
            return new io.ably.lib.http.d(aVar.f287675b, "/push/deviceRegistrations", m.d(aVar.f287674a.f288125u), b0VarArr, io.ably.lib.rest.g.f287744i).h();
        }

        public void h(io.ably.lib.rest.g gVar) throws io.ably.lib.types.a {
            i(gVar.f287745a);
        }

        public void i(String str) throws io.ably.lib.types.a {
            l(str).b();
        }

        public void j(io.ably.lib.rest.g gVar, g gVar2) {
            k(gVar.f287745a, gVar2);
        }

        public void k(String str, g gVar) {
            l(str).a(new g.c(gVar));
        }

        protected f.c<Void> l(String str) {
            k.k(f287520b, "removeImpl(): deviceId=" + str);
            return this.f287521a.f287675b.e(new c(str));
        }

        public void m(b0[] b0VarArr) throws io.ably.lib.types.a {
            o(b0VarArr).b();
        }

        public void n(b0[] b0VarArr, g gVar) {
            o(b0VarArr).a(new g.c(gVar));
        }

        protected f.c<Void> o(b0[] b0VarArr) {
            k.k(f287520b, "removeWhereImpl(): params=" + Arrays.toString(b0VarArr));
            return this.f287521a.f287675b.e(new C1937d(io.ably.lib.util.m.a(b0VarArr, this.f287521a.f287674a)));
        }

        public io.ably.lib.rest.g p(io.ably.lib.rest.g gVar) throws io.ably.lib.types.a {
            return r(gVar).b();
        }

        public void q(io.ably.lib.rest.g gVar, i<io.ably.lib.rest.g> iVar) {
            r(gVar).a(iVar);
        }

        protected f.c<io.ably.lib.rest.g> r(io.ably.lib.rest.g gVar) {
            k.k(f287520b, "saveImpl(): device=" + gVar);
            return this.f287521a.f287675b.e(new a(gVar, m.m(gVar.d(), this.f287521a.f287674a.f288125u)));
        }
    }

    public b(io.ably.lib.rest.a aVar) {
        this.f287497a = aVar;
        this.f287498b = new a(aVar);
    }

    b0[] a(String str) {
        return b(false);
    }

    b0[] b(boolean z10) {
        return m.d(this.f287497a.f287674a.f288125u);
    }
}
