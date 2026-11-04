package org.commonmark.renderer.html;

import com.facebook.appevents.l0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.commonmark.node.a0;
import org.commonmark.node.b0;
import org.commonmark.node.i;
import org.commonmark.node.j;
import org.commonmark.node.k;
import org.commonmark.node.l;
import org.commonmark.node.m;
import org.commonmark.node.n;
import org.commonmark.node.o;
import org.commonmark.node.p;
import org.commonmark.node.q;
import org.commonmark.node.r;
import org.commonmark.node.t;
import org.commonmark.node.u;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* JADX INFO: loaded from: classes14.dex */
public class d extends org.commonmark.node.a implements dm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e f337758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f337759b;

    private static class b extends org.commonmark.node.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f337760a;

        private b() {
            this.f337760a = new StringBuilder();
        }

        @Override // org.commonmark.node.a, org.commonmark.node.c0
        public void A(a0 a0Var) {
            this.f337760a.append(a0Var.p());
        }

        String M() {
            return this.f337760a.toString();
        }

        @Override // org.commonmark.node.a, org.commonmark.node.c0
        public void k(l lVar) {
            this.f337760a.append('\n');
        }

        @Override // org.commonmark.node.a, org.commonmark.node.c0
        public void t(y yVar) {
            this.f337760a.append('\n');
        }
    }

    public d(e eVar) {
        this.f337758a = eVar;
        this.f337759b = eVar.b();
    }

    private Map<String, String> M(v vVar, String str) {
        return N(vVar, str, Collections.EMPTY_MAP);
    }

    private Map<String, String> N(v vVar, String str, Map<String, String> map) {
        return this.f337758a.c(vVar, str, map);
    }

    private boolean O(x xVar) {
        v vVarH;
        org.commonmark.node.b bVarH = xVar.h();
        if (bVarH == null || (vVarH = bVarH.h()) == null || !(vVarH instanceof t)) {
            return false;
        }
        return ((t) vVarH).q();
    }

    private void P(String str, v vVar, Map<String, String> map) {
        this.f337759b.b();
        this.f337759b.e("pre", M(vVar, "pre"));
        this.f337759b.e("code", N(vVar, "code", map));
        this.f337759b.g(str);
        this.f337759b.d("/code");
        this.f337759b.d("/pre");
        this.f337759b.b();
    }

    private void Q(t tVar, String str, Map<String, String> map) {
        this.f337759b.b();
        this.f337759b.e(str, map);
        this.f337759b.b();
        d(tVar);
        this.f337759b.b();
        this.f337759b.d('/' + str);
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void A(a0 a0Var) {
        this.f337759b.g(a0Var.p());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void B(o oVar) {
        if (this.f337758a.f()) {
            this.f337759b.g(oVar.p());
        } else {
            this.f337759b.c(oVar.p());
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void C(p pVar) {
        String strE = this.f337758a.e(pVar.p());
        b bVar = new b();
        pVar.c(bVar);
        String strM = bVar.M();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("src", strE);
        linkedHashMap.put("alt", strM);
        if (pVar.q() != null) {
            linkedHashMap.put("title", pVar.q());
        }
        this.f337759b.f("img", N(pVar, "img", linkedHashMap), true);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void E(b0 b0Var) {
        this.f337759b.b();
        this.f337759b.f("hr", M(b0Var, "hr"), true);
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void F(x xVar) {
        boolean zO = O(xVar);
        if (!zO) {
            this.f337759b.b();
            this.f337759b.e("p", M(xVar, "p"));
        }
        d(xVar);
        if (zO) {
            return;
        }
        this.f337759b.d("/p");
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void G(z zVar) {
        this.f337759b.e("strong", M(zVar, "strong"));
        d(zVar);
        this.f337759b.d("/strong");
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void H(u uVar) {
        this.f337759b.e("li", M(uVar, "li"));
        d(uVar);
        this.f337759b.d("/li");
        this.f337759b.b();
    }

    @Override // dm.a
    public Set<Class<? extends v>> J() {
        return new HashSet(Arrays.asList(i.class, m.class, x.class, org.commonmark.node.c.class, org.commonmark.node.d.class, k.class, n.class, b0.class, q.class, r.class, u.class, w.class, p.class, j.class, z.class, a0.class, org.commonmark.node.e.class, o.class, y.class, l.class));
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void K(j jVar) {
        this.f337759b.e(l0.f99132k, M(jVar, l0.f99132k));
        d(jVar);
        this.f337759b.d("/em");
    }

    @Override // dm.a
    public void a(v vVar) {
        vVar.c(this);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void c(org.commonmark.node.e eVar) {
        this.f337759b.e("code", M(eVar, "code"));
        this.f337759b.g(eVar.p());
        this.f337759b.d("/code");
    }

    @Override // org.commonmark.node.a
    protected void d(v vVar) {
        v vVarE = vVar.e();
        while (vVarE != null) {
            v vVarG = vVarE.g();
            this.f337758a.a(vVarE);
            vVarE = vVarG;
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void e(m mVar) {
        String str = androidx.media3.exoplayer.upstream.h.f65993g + mVar.q();
        this.f337759b.b();
        this.f337759b.e(str, M(mVar, str));
        d(mVar);
        this.f337759b.d('/' + str);
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void g(w wVar) {
        int iT = wVar.t();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iT != 1) {
            linkedHashMap.put("start", String.valueOf(iT));
        }
        Q(wVar, "ol", N(wVar, "ol", linkedHashMap));
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void k(l lVar) {
        this.f337759b.f("br", M(lVar, "br"), true);
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void o(org.commonmark.node.d dVar) {
        Q(dVar, "ul", M(dVar, "ul"));
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void q(r rVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("href", this.f337758a.e(rVar.p()));
        if (rVar.q() != null) {
            linkedHashMap.put("title", rVar.q());
        }
        this.f337759b.e(androidx.media3.exoplayer.upstream.h.f65998l, N(rVar, androidx.media3.exoplayer.upstream.h.f65998l, linkedHashMap));
        d(rVar);
        this.f337759b.d("/a");
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void r(q qVar) {
        P(qVar.q(), qVar, Collections.EMPTY_MAP);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void t(y yVar) {
        this.f337759b.c(this.f337758a.d());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void u(i iVar) {
        d(iVar);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void v(org.commonmark.node.c cVar) {
        this.f337759b.b();
        this.f337759b.e("blockquote", M(cVar, "blockquote"));
        this.f337759b.b();
        d(cVar);
        this.f337759b.b();
        this.f337759b.d("/blockquote");
        this.f337759b.b();
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void x(k kVar) {
        String strU = kVar.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strT = kVar.t();
        if (strT != null && !strT.isEmpty()) {
            int iIndexOf = strT.indexOf(" ");
            int i10 = 0 & (-1);
            if (iIndexOf != -1) {
                strT = strT.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-" + strT);
        }
        P(strU, kVar, linkedHashMap);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void z(n nVar) {
        this.f337759b.b();
        if (this.f337758a.f()) {
            this.f337759b.e("p", M(nVar, "p"));
            this.f337759b.g(nVar.q());
            this.f337759b.d("/p");
        } else {
            this.f337759b.c(nVar.q());
        }
        this.f337759b.b();
    }
}
