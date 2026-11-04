package org.commonmark.renderer.text;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
import org.commonmark.node.u;
import org.commonmark.node.v;
import org.commonmark.node.w;
import org.commonmark.node.x;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* JADX INFO: loaded from: classes14.dex */
public class a extends org.commonmark.node.a implements dm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f337779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f337780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.commonmark.internal.renderer.text.b f337781c;

    public a(b bVar) {
        this.f337779a = bVar;
        this.f337780b = bVar.b();
    }

    private void M() {
        if (this.f337779a.c()) {
            this.f337780b.e();
        } else {
            this.f337780b.d();
        }
    }

    private void N(v vVar, Character ch2) {
        if (!this.f337779a.c()) {
            if (vVar.g() != null) {
                this.f337780b.d();
            }
        } else {
            if (ch2 != null) {
                this.f337780b.f(ch2.charValue());
            }
            if (vVar.g() != null) {
                this.f337780b.e();
            }
        }
    }

    private void O(v vVar, String str, String str2) {
        boolean z10 = false;
        boolean z11 = vVar.e() != null;
        boolean z12 = (str == null || str.equals(str2)) ? false : true;
        if (str2 != null && !str2.equals("")) {
            z10 = true;
        }
        if (z11) {
            this.f337780b.f('\"');
            d(vVar);
            this.f337780b.f('\"');
            if (z12 || z10) {
                this.f337780b.e();
                this.f337780b.f('(');
            }
        }
        if (z12) {
            this.f337780b.g(str);
            if (z10) {
                this.f337780b.c();
                this.f337780b.e();
            }
        }
        if (z10) {
            this.f337780b.g(str2);
        }
        if (z11 && (z12 || z10)) {
            this.f337780b.f(')');
        }
    }

    private void P(String str) {
        if (this.f337779a.c()) {
            this.f337780b.h(str);
        } else {
            this.f337780b.g(str);
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void A(a0 a0Var) {
        P(a0Var.p());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void B(o oVar) {
        P(oVar.p());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void C(p pVar) {
        O(pVar, pVar.q(), pVar.p());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void E(b0 b0Var) {
        if (!this.f337779a.c()) {
            this.f337780b.g("***");
        }
        N(b0Var, null);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void F(x xVar) {
        d(xVar);
        if (xVar.h() == null || (xVar.h() instanceof i)) {
            N(xVar, null);
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void H(u uVar) {
        org.commonmark.internal.renderer.text.b bVar = this.f337781c;
        if (bVar != null && (bVar instanceof org.commonmark.internal.renderer.text.c)) {
            org.commonmark.internal.renderer.text.c cVar = (org.commonmark.internal.renderer.text.c) bVar;
            String strA = this.f337779a.c() ? "" : cVar.a();
            this.f337780b.g(strA + cVar.c() + cVar.d() + " ");
            d(uVar);
            N(uVar, null);
            cVar.e();
            return;
        }
        if (bVar == null || !(bVar instanceof org.commonmark.internal.renderer.text.a)) {
            return;
        }
        org.commonmark.internal.renderer.text.a aVar = (org.commonmark.internal.renderer.text.a) bVar;
        if (!this.f337779a.c()) {
            this.f337780b.g(aVar.a() + aVar.c() + " ");
        }
        d(uVar);
        N(uVar, null);
    }

    @Override // dm.a
    public Set<Class<? extends v>> J() {
        return new HashSet(Arrays.asList(i.class, m.class, x.class, org.commonmark.node.c.class, org.commonmark.node.d.class, k.class, n.class, b0.class, q.class, r.class, u.class, w.class, p.class, j.class, z.class, a0.class, org.commonmark.node.e.class, o.class, y.class, l.class));
    }

    @Override // dm.a
    public void a(v vVar) {
        vVar.c(this);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void c(org.commonmark.node.e eVar) {
        this.f337780b.f('\"');
        this.f337780b.g(eVar.p());
        this.f337780b.f('\"');
    }

    @Override // org.commonmark.node.a
    protected void d(v vVar) {
        v vVarE = vVar.e();
        while (vVarE != null) {
            v vVarG = vVarE.g();
            this.f337779a.a(vVarE);
            vVarE = vVarG;
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void e(m mVar) {
        d(mVar);
        N(mVar, Character.valueOf(AbstractJsonLexerKt.COLON));
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void g(w wVar) {
        if (this.f337781c != null) {
            M();
        }
        this.f337781c = new org.commonmark.internal.renderer.text.c(this.f337781c, wVar);
        d(wVar);
        int i10 = 2 ^ 0;
        N(wVar, null);
        if (this.f337781c.b() != null) {
            this.f337781c = this.f337781c.b();
        } else {
            this.f337781c = null;
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void k(l lVar) {
        N(lVar, null);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void o(org.commonmark.node.d dVar) {
        if (this.f337781c != null) {
            M();
        }
        this.f337781c = new org.commonmark.internal.renderer.text.a(this.f337781c, dVar);
        d(dVar);
        N(dVar, null);
        if (this.f337781c.b() != null) {
            this.f337781c = this.f337781c.b();
        } else {
            this.f337781c = null;
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void q(r rVar) {
        O(rVar, rVar.q(), rVar.p());
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void r(q qVar) {
        if (!this.f337779a.c()) {
            this.f337780b.g(qVar.q());
        } else {
            this.f337780b.h(qVar.q());
            N(qVar, null);
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void t(y yVar) {
        N(yVar, null);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void u(i iVar) {
        d(iVar);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void v(org.commonmark.node.c cVar) {
        this.f337780b.f((char) 171);
        d(cVar);
        this.f337780b.f((char) 187);
        N(cVar, null);
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void x(k kVar) {
        if (!this.f337779a.c()) {
            this.f337780b.g(kVar.u());
        } else {
            this.f337780b.h(kVar.u());
            N(kVar, null);
        }
    }

    @Override // org.commonmark.node.a, org.commonmark.node.c0
    public void z(n nVar) {
        P(nVar.q());
    }
}
