package io.ably.lib.rest;

import io.ably.lib.http.m;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.c0;
import io.ably.lib.types.d0;
import io.ably.lib.types.l;
import io.ably.lib.types.u;
import io.ably.lib.types.y;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f287734b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f287735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.ably.lib.rest.a f287736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f287737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    l f287738f;

    class a implements io.ably.lib.http.f.b<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u[] f287739a;

        a(u[] uVarArr) {
            this.f287739a = uVarArr;
        }

        @Override // io.ably.lib.http.f.b
        public void a(io.ably.lib.http.l lVar, io.ably.lib.types.i<Void> iVar) throws io.ably.lib.types.a {
            int i10 = 0;
            boolean z10 = false;
            for (u uVar : this.f287739a) {
                z10 |= uVar.f288017a != null;
                f.this.f287736d.f287677d.h(uVar, true, false);
                uVar.d(f.this.f287738f);
            }
            if (!z10 && f.this.f287736d.f287674a.A) {
                String strO = io.ably.lib.util.e.o();
                while (true) {
                    u[] uVarArr = this.f287739a;
                    if (i10 >= uVarArr.length) {
                        break;
                    }
                    uVarArr[i10].f288017a = strO + AbstractJsonLexerKt.COLON + i10;
                    i10++;
                }
            }
            lVar.l(f.this.f287737e + "/messages", m.d(f.this.f287736d.f287674a.f288125u), f.this.f287736d.f287674a.R ? b0.a(io.ably.lib.util.e.f()) : null, f.this.f287736d.f287674a.f288125u ? y.g(this.f287739a) : y.d(this.f287739a), null, true, iVar);
        }
    }

    public class b {
        public b() {
        }

        private io.ably.lib.http.d.f<c0> e(io.ably.lib.http.f fVar, b0[] b0VarArr) {
            io.ably.lib.http.i.b<c0> bVarE = d0.e(f.this.f287738f);
            if (f.this.f287736d.f287674a.R) {
                b0VarArr = b0.f(b0VarArr, io.ably.lib.util.e.f());
            }
            return new io.ably.lib.http.d(fVar, f.this.f287737e + "/presence", m.d(f.this.f287736d.f287674a.f288125u), b0VarArr, bVarE).h();
        }

        private io.ably.lib.http.d.f<c0> j(io.ably.lib.http.f fVar, b0[] b0VarArr) {
            io.ably.lib.http.i.b<c0> bVarE = d0.e(f.this.f287738f);
            if (f.this.f287736d.f287674a.R) {
                b0VarArr = b0.f(b0VarArr, io.ably.lib.util.e.f());
            }
            return new io.ably.lib.http.d(fVar, f.this.f287737e + "/presence/history", m.d(f.this.f287736d.f287674a.f288125u), b0VarArr, bVarE).h();
        }

        a0<c0> a(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
            return e(fVar, b0VarArr).b();
        }

        public a0<c0> b(b0[] b0VarArr) throws io.ably.lib.types.a {
            return a(f.this.f287736d.f287675b, b0VarArr);
        }

        void c(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
            e(fVar, b0VarArr).a(iVar);
        }

        public void d(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
            c(f.this.f287736d.f287675b, b0VarArr, iVar);
        }

        a0<c0> f(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
            return j(fVar, b0VarArr).b();
        }

        public a0<c0> g(b0[] b0VarArr) throws io.ably.lib.types.a {
            return f(f.this.f287736d.f287675b, b0VarArr);
        }

        void h(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
            j(fVar, b0VarArr).a(iVar);
        }

        public void i(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<c0>> iVar) {
            h(f.this.f287736d.f287675b, b0VarArr, iVar);
        }
    }

    f(io.ably.lib.rest.a aVar, String str, l lVar) throws io.ably.lib.types.a {
        this.f287736d = aVar;
        this.f287733a = str;
        this.f287738f = lVar;
        this.f287737e = "/channels/" + m.f(str);
        this.f287735c = new i(str, aVar.f287675b, aVar.f287674a, lVar);
    }

    private io.ably.lib.http.d.f<u> g(io.ably.lib.http.f fVar, b0[] b0VarArr) {
        io.ably.lib.http.i.b<u> bVarH = y.h(this.f287738f);
        if (this.f287736d.f287674a.R) {
            b0VarArr = b0.f(b0VarArr, io.ably.lib.util.e.f());
        }
        return new io.ably.lib.http.d(fVar, this.f287737e + "/messages", m.d(this.f287736d.f287674a.f288125u), b0VarArr, bVarH).h();
    }

    private io.ably.lib.http.f.c<Void> p(io.ably.lib.http.f fVar, String str, Object obj) {
        return q(fVar, new u[]{new u(str, obj)});
    }

    private io.ably.lib.http.f.c<Void> q(io.ably.lib.http.f fVar, u[] uVarArr) {
        return fVar.e(new a(uVarArr));
    }

    a0<u> c(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return g(fVar, b0VarArr).b();
    }

    public a0<u> d(b0[] b0VarArr) throws io.ably.lib.types.a {
        return c(this.f287736d.f287675b, b0VarArr);
    }

    void e(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<u>> iVar) {
        g(fVar, b0VarArr).a(iVar);
    }

    public void f(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<u>> iVar) {
        e(this.f287736d.f287675b, b0VarArr, iVar);
    }

    void h(io.ably.lib.http.f fVar, String str, Object obj) throws io.ably.lib.types.a {
        p(fVar, str, obj).b();
    }

    void i(io.ably.lib.http.f fVar, u[] uVarArr) throws io.ably.lib.types.a {
        q(fVar, uVarArr).b();
    }

    public void j(String str, Object obj) throws io.ably.lib.types.a {
        h(this.f287736d.f287675b, str, obj);
    }

    public void k(u[] uVarArr) throws io.ably.lib.types.a {
        i(this.f287736d.f287675b, uVarArr);
    }

    void l(io.ably.lib.http.f fVar, String str, Object obj, io.ably.lib.realtime.g gVar) {
        p(fVar, str, obj).a(new io.ably.lib.realtime.g.c(gVar));
    }

    void m(io.ably.lib.http.f fVar, u[] uVarArr, io.ably.lib.realtime.g gVar) {
        q(fVar, uVarArr).a(new io.ably.lib.realtime.g.c(gVar));
    }

    public void n(String str, Object obj, io.ably.lib.realtime.g gVar) {
        l(this.f287736d.f287675b, str, obj, gVar);
    }

    public void o(u[] uVarArr, io.ably.lib.realtime.g gVar) {
        m(this.f287736d.f287675b, uVarArr, gVar);
    }
}
