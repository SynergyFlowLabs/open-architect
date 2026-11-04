package org.locationtech.jts.operation.linemerge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f338792a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f338793b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f338794c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Collection f338795d = null;

    class a implements q {
        a() {
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                e.this.d((v) nVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(v vVar) {
        if (this.f338794c == null) {
            this.f338794c = vVar.g0();
        }
        this.f338792a.p(vVar);
    }

    private org.locationtech.jts.operation.linemerge.a e(b bVar) {
        org.locationtech.jts.operation.linemerge.a aVar = new org.locationtech.jts.operation.linemerge.a(this.f338794c);
        b bVarW = bVar;
        do {
            aVar.a(bVarW);
            bVarW.H().t(true);
            bVarW = bVarW.W();
            if (bVarW == null) {
                break;
            }
        } while (bVarW != bVar);
        return aVar;
    }

    private void f() {
        i();
    }

    private void g() {
        for (org.locationtech.jts.planargraph.e eVar : this.f338792a.k()) {
            if (eVar.D() != 2) {
                j(eVar);
                eVar.t(true);
            }
        }
    }

    private void h() {
        g();
    }

    private void i() {
        for (org.locationtech.jts.planargraph.e eVar : this.f338792a.k()) {
            if (!eVar.n()) {
                org.locationtech.jts.util.a.c(eVar.D() == 2);
                j(eVar);
                eVar.t(true);
            }
        }
    }

    private void j(org.locationtech.jts.planargraph.e eVar) {
        Iterator itJ = eVar.I().j();
        while (itJ.hasNext()) {
            b bVar = (b) itJ.next();
            if (!bVar.H().n()) {
                this.f338795d.add(e(bVar));
            }
        }
    }

    private void l() {
        if (this.f338793b == null) {
            org.locationtech.jts.planargraph.d.s(this.f338792a.l(), false);
            org.locationtech.jts.planargraph.d.s(this.f338792a.g(), false);
            this.f338795d = new ArrayList();
            h();
            f();
            this.f338793b = new ArrayList();
            Iterator it = this.f338795d.iterator();
            while (it.hasNext()) {
                this.f338793b.add(((org.locationtech.jts.operation.linemerge.a) it.next()).c());
            }
        }
    }

    public void b(Collection collection) {
        this.f338793b = null;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((n) it.next());
        }
    }

    public void c(n nVar) {
        nVar.d(new a());
    }

    public Collection k() {
        l();
        return this.f338793b;
    }
}
