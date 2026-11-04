package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.a0;
import org.commonmark.node.b0;
import org.commonmark.node.z;

/* JADX INFO: loaded from: classes8.dex */
class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f297664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f297665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f297666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends org.commonmark.node.v>, m.c<? extends org.commonmark.node.v>> f297667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m.a f297668e;

    static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<? extends org.commonmark.node.v>, m.c<? extends org.commonmark.node.v>> f297669a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m.a f297670b;

        a() {
        }

        @Override // io.noties.markwon.m.b
        @NonNull
        public <N extends org.commonmark.node.v> m.b a(@NonNull Class<N> cls, @p0 m.c<? super N> cVar) {
            if (cVar == null) {
                this.f297669a.remove(cls);
                return this;
            }
            this.f297669a.put(cls, cVar);
            return this;
        }

        @Override // io.noties.markwon.m.b
        @NonNull
        public m b(@NonNull g gVar, @NonNull u uVar) {
            m.a bVar = this.f297670b;
            if (bVar == null) {
                bVar = new b();
            }
            return new o(gVar, uVar, new y(), Collections.unmodifiableMap(this.f297669a), bVar);
        }

        @Override // io.noties.markwon.m.b
        @NonNull
        public m.b c(@NonNull m.a aVar) {
            this.f297670b = aVar;
            return this;
        }
    }

    o(@NonNull g gVar, @NonNull u uVar, @NonNull y yVar, @NonNull Map<Class<? extends org.commonmark.node.v>, m.c<? extends org.commonmark.node.v>> map, @NonNull m.a aVar) {
        this.f297664a = gVar;
        this.f297665b = uVar;
        this.f297666c = yVar;
        this.f297667d = map;
        this.f297668e = aVar;
    }

    private void a(@NonNull org.commonmark.node.v vVar) {
        m.c<? extends org.commonmark.node.v> cVar = this.f297667d.get(vVar.getClass());
        if (cVar != null) {
            cVar.a(this, vVar);
        } else {
            d(vVar);
        }
    }

    @Override // org.commonmark.node.c0
    public void A(a0 a0Var) {
        a(a0Var);
    }

    @Override // org.commonmark.node.c0
    public void B(org.commonmark.node.o oVar) {
        a(oVar);
    }

    @Override // org.commonmark.node.c0
    public void C(org.commonmark.node.p pVar) {
        a(pVar);
    }

    @Override // org.commonmark.node.c0
    public void D(org.commonmark.node.s sVar) {
        a(sVar);
    }

    @Override // org.commonmark.node.c0
    public void E(b0 b0Var) {
        a(b0Var);
    }

    @Override // org.commonmark.node.c0
    public void F(org.commonmark.node.x xVar) {
        a(xVar);
    }

    @Override // org.commonmark.node.c0
    public void G(z zVar) {
        a(zVar);
    }

    @Override // org.commonmark.node.c0
    public void H(org.commonmark.node.u uVar) {
        a(uVar);
    }

    @Override // io.noties.markwon.m
    public void I(@NonNull org.commonmark.node.v vVar) {
        this.f297668e.b(this, vVar);
    }

    @Override // org.commonmark.node.c0
    public void K(org.commonmark.node.j jVar) {
        a(jVar);
    }

    @Override // io.noties.markwon.m
    public void L() {
        this.f297666c.append('\n');
    }

    @Override // io.noties.markwon.m
    public void b(int i10, @p0 Object obj) {
        y yVar = this.f297666c;
        y.o(yVar, obj, i10, yVar.length());
    }

    @Override // io.noties.markwon.m
    @NonNull
    public y builder() {
        return this.f297666c;
    }

    @Override // org.commonmark.node.c0
    public void c(org.commonmark.node.e eVar) {
        a(eVar);
    }

    @Override // io.noties.markwon.m
    public void clear() {
        this.f297665b.clearAll();
        this.f297666c.clear();
    }

    @Override // io.noties.markwon.m
    public void d(@NonNull org.commonmark.node.v vVar) {
        org.commonmark.node.v vVarE = vVar.e();
        while (vVarE != null) {
            org.commonmark.node.v vVarG = vVarE.g();
            vVarE.c(this);
            vVarE = vVarG;
        }
    }

    @Override // org.commonmark.node.c0
    public void e(org.commonmark.node.m mVar) {
        a(mVar);
    }

    @Override // io.noties.markwon.m
    public <N extends org.commonmark.node.v> void f(@NonNull Class<N> cls, int i10) {
        x xVarA = this.f297664a.f().a(cls);
        if (xVarA != null) {
            b(i10, xVarA.a(this.f297664a, this.f297665b));
        }
    }

    @Override // org.commonmark.node.c0
    public void g(org.commonmark.node.w wVar) {
        a(wVar);
    }

    @Override // io.noties.markwon.m
    public void h(@NonNull org.commonmark.node.v vVar) {
        this.f297668e.a(this, vVar);
    }

    @Override // io.noties.markwon.m
    @NonNull
    public u i() {
        return this.f297665b;
    }

    @Override // io.noties.markwon.m
    public <N extends org.commonmark.node.v> void j(@NonNull N n10, int i10) {
        f(n10.getClass(), i10);
    }

    @Override // org.commonmark.node.c0
    public void k(org.commonmark.node.l lVar) {
        a(lVar);
    }

    @Override // io.noties.markwon.m
    public <N extends org.commonmark.node.v> void l(@NonNull Class<N> cls, int i10) {
        b(i10, this.f297664a.f().b(cls).a(this.f297664a, this.f297665b));
    }

    @Override // io.noties.markwon.m
    public int length() {
        return this.f297666c.length();
    }

    @Override // org.commonmark.node.c0
    public void m(org.commonmark.node.g gVar) {
        a(gVar);
    }

    @Override // io.noties.markwon.m
    @NonNull
    public g n() {
        return this.f297664a;
    }

    @Override // org.commonmark.node.c0
    public void o(org.commonmark.node.d dVar) {
        a(dVar);
    }

    @Override // io.noties.markwon.m
    public void p() {
        if (this.f297666c.length() <= 0 || '\n' == this.f297666c.j()) {
            return;
        }
        this.f297666c.append('\n');
    }

    @Override // org.commonmark.node.c0
    public void q(org.commonmark.node.r rVar) {
        a(rVar);
    }

    @Override // org.commonmark.node.c0
    public void r(org.commonmark.node.q qVar) {
        a(qVar);
    }

    @Override // org.commonmark.node.c0
    public void s(org.commonmark.node.f fVar) {
        a(fVar);
    }

    @Override // org.commonmark.node.c0
    public void t(org.commonmark.node.y yVar) {
        a(yVar);
    }

    @Override // org.commonmark.node.c0
    public void u(org.commonmark.node.i iVar) {
        a(iVar);
    }

    @Override // org.commonmark.node.c0
    public void v(org.commonmark.node.c cVar) {
        a(cVar);
    }

    @Override // io.noties.markwon.m
    public <N extends org.commonmark.node.v> void w(@NonNull N n10, int i10) {
        l(n10.getClass(), i10);
    }

    @Override // org.commonmark.node.c0
    public void x(org.commonmark.node.k kVar) {
        a(kVar);
    }

    @Override // io.noties.markwon.m
    public boolean y(@NonNull org.commonmark.node.v vVar) {
        return vVar.g() != null;
    }

    @Override // org.commonmark.node.c0
    public void z(org.commonmark.node.n nVar) {
        a(nVar);
    }
}
