package io.ably.lib.rest;

import io.ably.lib.http.k;
import io.ably.lib.http.l;
import io.ably.lib.http.m;
import io.ably.lib.http.o;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.h0;
import io.ably.lib.types.i0;
import io.ably.lib.types.k0;
import io.ably.lib.types.l0;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.types.t;
import io.ably.lib.types.u;
import io.ably.lib.types.y;
import io.ably.lib.util.p;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f287674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ably.lib.http.f f287675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.ably.lib.http.i f287676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ably.lib.rest.d f287677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f287678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pg.a f287679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.ably.lib.push.a f287680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final io.ably.lib.util.n f287681h;

    /* JADX INFO: renamed from: io.ably.lib.rest.a$a, reason: collision with other inner class name */
    class C1940a implements io.ably.lib.http.f.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0[] f287682a;

        /* JADX INFO: renamed from: io.ably.lib.rest.a$a$a, reason: collision with other inner class name */
        class C1941a implements io.ably.lib.http.i.e<Long> {
            C1941a() {
            }

            @Override // io.ably.lib.http.i.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Long a(io.ably.lib.http.i.d dVar, r rVar) throws io.ably.lib.types.a {
                if (rVar == null) {
                    return ((Long[]) p.f288250c.r(new String(dVar.f287361f), Long[].class))[0];
                }
                throw io.ably.lib.types.a.a(rVar);
            }
        }

        C1940a(b0[] b0VarArr) {
            this.f287682a = b0VarArr;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<Long> iVar) throws io.ably.lib.types.a {
            lVar.g("/time", m.d(false), this.f287682a, new C1941a(), false, iVar);
        }
    }

    class b implements io.ably.lib.http.f.b<h0[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a[] f287685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0[] f287686b;

        /* JADX INFO: renamed from: io.ably.lib.rest.a$b$a, reason: collision with other inner class name */
        class C1942a implements io.ably.lib.http.i.e<h0[]> {
            C1942a() {
            }

            @Override // io.ably.lib.http.i.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h0[] a(io.ably.lib.http.i.d dVar, r rVar) throws io.ably.lib.types.a {
                if (rVar == null || rVar.f288156a == 40020) {
                    return h0.i(dVar.f287356a).a(dVar.f287359d, dVar.f287361f);
                }
                throw io.ably.lib.types.a.a(rVar);
            }
        }

        b(u.a[] aVarArr, b0[] b0VarArr) {
            this.f287685a = aVarArr;
            this.f287686b = b0VarArr;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<h0[]> iVar) throws io.ably.lib.types.a {
            lVar.l("/messages", m.d(a.this.f287674a.f288125u), a.this.f287674a.R ? b0.f(this.f287686b, io.ably.lib.util.e.f()) : this.f287686b, a.this.f287674a.f288125u ? y.f(this.f287685a) : y.b(this.f287685a), new C1942a(), true, iVar);
        }
    }

    public interface c extends i0<String, e> {
        e b(String str, io.ably.lib.types.l lVar) throws io.ably.lib.types.a;

        void c(String str);

        e get(String str);

        @Override // io.ably.lib.types.i0
        int size();

        @Override // io.ably.lib.types.i0
        Iterable<e> values();
    }

    private class d extends io.ably.lib.util.h<String, e> implements c {
        private d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.ably.lib.rest.a.c
        public e b(String str, io.ably.lib.types.l lVar) throws io.ably.lib.types.a {
            e eVar = (e) this.f288234a.get(str);
            if (eVar != null) {
                if (lVar != null) {
                    eVar.f287738f = lVar;
                }
                return eVar;
            }
            e eVar2 = new e(a.this, str, lVar);
            this.f288234a.put((K) str, (V) eVar2);
            return eVar2;
        }

        @Override // io.ably.lib.rest.a.c
        public void c(String str) {
            this.f288234a.remove(str);
        }

        @Override // io.ably.lib.rest.a.c
        public e get(String str) {
            try {
                return b(str, null);
            } catch (io.ably.lib.types.a unused) {
                return null;
            }
        }

        /* synthetic */ d(a aVar, C1940a c1940a) {
            this();
        }
    }

    public a(String str, io.ably.lib.util.n nVar) throws io.ably.lib.types.a {
        this(new n(str), nVar);
    }

    private io.ably.lib.http.f.c<Long> R(io.ably.lib.http.f fVar) {
        return fVar.e(new C1940a(this.f287674a.R ? b0.a(io.ably.lib.util.e.f()) : null));
    }

    private io.ably.lib.http.f.c<h0[]> j(u.a[] aVarArr, io.ably.lib.types.l lVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        boolean z10 = false;
        for (u.a aVar : aVarArr) {
            for (u uVar : aVar.f288186b) {
                z10 |= uVar.f288017a != null;
                this.f287677d.h(uVar, true, false);
                uVar.d(lVar);
            }
            if (!z10 && this.f287674a.A) {
                String strO = io.ably.lib.util.e.o();
                int i10 = 0;
                while (true) {
                    u[] uVarArr = aVar.f288186b;
                    if (i10 < uVarArr.length) {
                        uVarArr[i10].f288017a = strO + AbstractJsonLexerKt.COLON + i10;
                        i10++;
                    }
                }
            }
        }
        return this.f287675b.e(new b(aVarArr, b0VarArr));
    }

    public long E() throws io.ably.lib.types.a {
        return H(this.f287675b);
    }

    long H(io.ably.lib.http.f fVar) throws io.ably.lib.types.a {
        return R(fVar).b().longValue();
    }

    void I(io.ably.lib.http.f fVar, io.ably.lib.types.i<Long> iVar) {
        R(fVar).a(iVar);
    }

    public void N(io.ably.lib.types.i<Long> iVar) {
        I(this.f287675b, iVar);
    }

    protected void a(r rVar) {
    }

    protected void b(String str, boolean z10) throws io.ably.lib.types.a {
    }

    protected void c(String str, io.ably.lib.rest.d.f fVar) {
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.f287675b.close();
    }

    protected void d(String str) {
    }

    @jg.a
    public h0[] e(u.a[] aVarArr, io.ably.lib.types.l lVar) throws io.ably.lib.types.a {
        return j(aVarArr, lVar, null).b();
    }

    @jg.a
    public h0[] f(u.a[] aVarArr, io.ably.lib.types.l lVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return j(aVarArr, lVar, b0VarArr).b();
    }

    @jg.a
    public void g(u.a[] aVarArr, io.ably.lib.types.l lVar, io.ably.lib.types.i<h0[]> iVar) throws io.ably.lib.types.a {
        j(aVarArr, lVar, null).a(iVar);
    }

    @jg.a
    public void h(u.a[] aVarArr, io.ably.lib.types.l lVar, b0[] b0VarArr, io.ably.lib.types.i<h0[]> iVar) throws io.ably.lib.types.a {
        j(aVarArr, lVar, b0VarArr).a(iVar);
    }

    t l(io.ably.lib.http.f fVar, String str, String str2, b0[] b0VarArr, io.ably.lib.http.i.c cVar, b0[] b0VarArr2) throws io.ably.lib.types.a {
        return new k(fVar, str, str2, m.j(m.d(false), b0VarArr2), b0VarArr, cVar).g();
    }

    public t m(String str, String str2, b0[] b0VarArr, io.ably.lib.http.i.c cVar, b0[] b0VarArr2) throws io.ably.lib.types.a {
        return l(this.f287675b, str, str2, b0VarArr, cVar, b0VarArr2);
    }

    void o(io.ably.lib.http.f fVar, String str, String str2, b0[] b0VarArr, io.ably.lib.http.i.c cVar, b0[] b0VarArr2, io.ably.lib.types.e.a aVar) {
        new io.ably.lib.http.a(fVar, str, str2, m.j(m.d(false), b0VarArr2), b0VarArr, cVar).g(aVar);
    }

    public void q(String str, String str2, b0[] b0VarArr, io.ably.lib.http.i.c cVar, b0[] b0VarArr2, io.ably.lib.types.e.a aVar) {
        o(this.f287675b, str, str2, b0VarArr, cVar, b0VarArr2, aVar);
    }

    a0<k0> r(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return new io.ably.lib.http.n(fVar, "/stats", m.d(false), b0VarArr, l0.f288110a).a();
    }

    public a0<k0> t(b0[] b0VarArr) throws io.ably.lib.types.a {
        return r(this.f287675b, b0VarArr);
    }

    void x(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<k0>> iVar) {
        new io.ably.lib.http.c(fVar, "/stats", m.d(false), b0VarArr, l0.f288110a).a(iVar);
    }

    public void y(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<k0>> iVar) {
        x(this.f287675b, b0VarArr, iVar);
    }

    public a(n nVar, io.ably.lib.util.n nVar2) throws io.ably.lib.types.a {
        if (nVar == null) {
            io.ably.lib.util.k.d(getClass().getName(), "no options provided");
            throw io.ably.lib.types.a.a(new r("no options provided", 400, 40000));
        }
        this.f287674a = nVar;
        io.ably.lib.util.k.j(nVar.f288116l);
        io.ably.lib.util.k.i(nVar.f288117m);
        io.ably.lib.util.k.f(getClass().getName(), "started");
        this.f287681h = nVar2;
        io.ably.lib.rest.d dVar = new io.ably.lib.rest.d(this, nVar);
        this.f287677d = dVar;
        io.ably.lib.http.i iVar = new io.ably.lib.http.i(nVar, dVar, nVar2);
        this.f287676c = iVar;
        this.f287675b = new io.ably.lib.http.f(new io.ably.lib.http.b(iVar, nVar), new o(iVar));
        this.f287678e = new d(this, null);
        this.f287679f = new pg.a();
        this.f287680g = new io.ably.lib.push.a(this);
    }
}
