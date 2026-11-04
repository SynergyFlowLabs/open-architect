package com.google.api.client.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.util.h0;
import com.google.api.client.util.o0;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.a f115156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f115157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.api.client.json.d f115158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.api.client.http.p f115160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f115161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f115162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.api.client.util.f
    @Deprecated
    private final l f115163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.api.client.util.f
    private final com.google.api.client.util.store.d<q> f115164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f115165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.api.client.util.l f115166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Collection<String> f115167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f115168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Collection<k> f115169n;

    /* JADX INFO: renamed from: com.google.api.client.auth.oauth2.a$a, reason: collision with other inner class name */
    public static class C1009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j.a f115170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b0 f115171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.google.api.client.json.d f115172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.api.client.http.j f115173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.api.client.http.p f115174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f115175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f115176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @com.google.api.client.util.f
        @Deprecated
        l f115177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @com.google.api.client.util.f
        com.google.api.client.util.store.d<q> f115178i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        w f115179j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        b f115182m;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Collection<String> f115180k = com.google.api.client.util.w.a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.google.api.client.util.l f115181l = com.google.api.client.util.l.f116096a;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Collection<k> f115183n = com.google.api.client.util.w.a();

        public C1009a(j.a aVar, b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, com.google.api.client.http.p pVar, String str, String str2) {
            z(aVar);
            E(b0Var);
            y(dVar);
            D(jVar);
            r(pVar);
            s(str);
            q(str2);
        }

        public C1009a A(Collection<k> collection) {
            this.f115183n = (Collection) h0.d(collection);
            return this;
        }

        public C1009a B(w wVar) {
            this.f115179j = wVar;
            return this;
        }

        public C1009a C(Collection<String> collection) {
            this.f115180k = (Collection) h0.d(collection);
            return this;
        }

        public C1009a D(com.google.api.client.http.j jVar) {
            this.f115173d = (com.google.api.client.http.j) h0.d(jVar);
            return this;
        }

        public C1009a E(b0 b0Var) {
            this.f115171b = (b0) h0.d(b0Var);
            return this;
        }

        public C1009a a(k kVar) {
            this.f115183n.add((k) h0.d(kVar));
            return this;
        }

        public a b() {
            return new a(this);
        }

        public final String c() {
            return this.f115176g;
        }

        public final com.google.api.client.http.p d() {
            return this.f115174e;
        }

        public final String e() {
            return this.f115175f;
        }

        public final com.google.api.client.util.l f() {
            return this.f115181l;
        }

        public final b g() {
            return this.f115182m;
        }

        @com.google.api.client.util.f
        public final com.google.api.client.util.store.d<q> h() {
            return this.f115178i;
        }

        @com.google.api.client.util.f
        @Deprecated
        public final l i() {
            return this.f115177h;
        }

        public final com.google.api.client.json.d j() {
            return this.f115172c;
        }

        public final j.a k() {
            return this.f115170a;
        }

        public final Collection<k> l() {
            return this.f115183n;
        }

        public final w m() {
            return this.f115179j;
        }

        public final Collection<String> n() {
            return this.f115180k;
        }

        public final com.google.api.client.http.j o() {
            return this.f115173d;
        }

        public final b0 p() {
            return this.f115171b;
        }

        public C1009a q(String str) {
            this.f115176g = (String) h0.d(str);
            return this;
        }

        public C1009a r(com.google.api.client.http.p pVar) {
            this.f115174e = pVar;
            return this;
        }

        public C1009a s(String str) {
            this.f115175f = (String) h0.d(str);
            return this;
        }

        public C1009a t(com.google.api.client.util.l lVar) {
            this.f115181l = (com.google.api.client.util.l) h0.d(lVar);
            return this;
        }

        public C1009a u(b bVar) {
            this.f115182m = bVar;
            return this;
        }

        @com.google.api.client.util.f
        public C1009a v(com.google.api.client.util.store.d<q> dVar) {
            h0.a(this.f115177h == null);
            this.f115178i = dVar;
            return this;
        }

        @com.google.api.client.util.f
        @Deprecated
        public C1009a w(l lVar) {
            h0.a(this.f115178i == null);
            this.f115177h = lVar;
            return this;
        }

        @com.google.api.client.util.f
        public C1009a x(com.google.api.client.util.store.e eVar) throws IOException {
            return v(q.b(eVar));
        }

        public C1009a y(com.google.api.client.json.d dVar) {
            this.f115172c = (com.google.api.client.json.d) h0.d(dVar);
            return this;
        }

        public C1009a z(j.a aVar) {
            this.f115170a = (j.a) h0.d(aVar);
            return this;
        }
    }

    public interface b {
        void a(j jVar, t tVar) throws IOException;
    }

    public a(j.a aVar, b0 b0Var, com.google.api.client.json.d dVar, com.google.api.client.http.j jVar, com.google.api.client.http.p pVar, String str, String str2) {
        this(new C1009a(aVar, b0Var, dVar, jVar, pVar, str, str2));
    }

    private j r(String str) {
        j.b bVarL = new j.b(this.f115156a).r(this.f115157b).m(this.f115158c).p(this.f115159d).k(this.f115160e).o(this.f115165j).l(this.f115166k);
        com.google.api.client.util.store.d<q> dVar = this.f115164i;
        if (dVar != null) {
            bVarL.a(new n(str, dVar));
        } else {
            l lVar = this.f115163h;
            if (lVar != null) {
                bVarL.a(new m(str, lVar));
            }
        }
        bVarL.g().addAll(this.f115169n);
        return bVarL.b();
    }

    public j a(t tVar, String str) throws IOException {
        j jVarU = r(str).u(tVar);
        l lVar = this.f115163h;
        if (lVar != null) {
            lVar.b(str, jVarU);
        }
        com.google.api.client.util.store.d<q> dVar = this.f115164i;
        if (dVar != null) {
            dVar.b(str, new q(jVarU));
        }
        b bVar = this.f115168m;
        if (bVar != null) {
            bVar.a(jVarU, tVar);
        }
        return jVarU;
    }

    public final String b() {
        return this.f115162g;
    }

    public final com.google.api.client.http.p c() {
        return this.f115160e;
    }

    public final String d() {
        return this.f115161f;
    }

    public final com.google.api.client.util.l e() {
        return this.f115166k;
    }

    @com.google.api.client.util.f
    public final com.google.api.client.util.store.d<q> f() {
        return this.f115164i;
    }

    @com.google.api.client.util.f
    @Deprecated
    public final l g() {
        return this.f115163h;
    }

    public final com.google.api.client.json.d h() {
        return this.f115158c;
    }

    public final j.a i() {
        return this.f115156a;
    }

    public final Collection<k> j() {
        return this.f115169n;
    }

    public final w k() {
        return this.f115165j;
    }

    public final Collection<String> l() {
        return this.f115167l;
    }

    public final String m() {
        return com.google.api.client.util.u.b(' ').a(this.f115167l);
    }

    public final String n() {
        return this.f115159d;
    }

    public final b0 o() {
        return this.f115157b;
    }

    public j p(String str) throws IOException {
        if (o0.a(str)) {
            return null;
        }
        if (this.f115164i == null && this.f115163h == null) {
            return null;
        }
        j jVarR = r(str);
        com.google.api.client.util.store.d<q> dVar = this.f115164i;
        if (dVar == null) {
            if (this.f115163h.a(str, jVarR)) {
                return jVarR;
            }
            return null;
        }
        q qVar = (q) dVar.get(str);
        if (qVar == null) {
            return null;
        }
        jVarR.r(qVar.a());
        jVarR.v(qVar.d());
        jVarR.s(qVar.c());
        return jVarR;
    }

    public com.google.api.client.auth.oauth2.b q() {
        return new com.google.api.client.auth.oauth2.b(this.f115162g, this.f115161f).c0(this.f115167l);
    }

    public d s(String str) {
        return new d(this.f115157b, this.f115158c, new com.google.api.client.http.j(this.f115159d), str).s(this.f115160e).u(this.f115165j).v(this.f115167l);
    }

    protected a(C1009a c1009a) {
        this.f115156a = (j.a) h0.d(c1009a.f115170a);
        this.f115157b = (b0) h0.d(c1009a.f115171b);
        this.f115158c = (com.google.api.client.json.d) h0.d(c1009a.f115172c);
        this.f115159d = ((com.google.api.client.http.j) h0.d(c1009a.f115173d)).k();
        this.f115160e = c1009a.f115174e;
        this.f115161f = (String) h0.d(c1009a.f115175f);
        this.f115162g = (String) h0.d(c1009a.f115176g);
        this.f115165j = c1009a.f115179j;
        this.f115163h = c1009a.f115177h;
        this.f115164i = c1009a.f115178i;
        this.f115167l = Collections.unmodifiableCollection(c1009a.f115180k);
        this.f115166k = (com.google.api.client.util.l) h0.d(c1009a.f115181l);
        this.f115168m = c1009a.f115182m;
        this.f115169n = Collections.unmodifiableCollection(c1009a.f115183n);
    }
}
