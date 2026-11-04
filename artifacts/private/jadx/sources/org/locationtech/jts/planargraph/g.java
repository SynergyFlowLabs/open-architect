package org.locationtech.jts.planargraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Set f338961a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Set f338962b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected f f338963c = new f();

    protected void a(a aVar) {
        this.f338962b.add(aVar);
    }

    protected void b(c cVar) {
        this.f338961a.add(cVar);
        a(cVar.x(0));
        a(cVar.x(1));
    }

    protected void c(e eVar) {
        this.f338963c.a(eVar);
    }

    public boolean d(a aVar) {
        return this.f338962b.contains(aVar);
    }

    public boolean e(c cVar) {
        return this.f338961a.contains(cVar);
    }

    public Iterator f() {
        return this.f338962b.iterator();
    }

    public Iterator g() {
        return this.f338961a.iterator();
    }

    public e h(org.locationtech.jts.geom.a aVar) {
        return this.f338963c.b(aVar);
    }

    public List i(int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator itL = l();
        while (itL.hasNext()) {
            e eVar = (e) itL.next();
            if (eVar.D() == i10) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public Collection j() {
        return this.f338961a;
    }

    public Collection k() {
        return this.f338963c.e();
    }

    public Iterator l() {
        return this.f338963c.c();
    }

    public void m(a aVar) {
        a aVarN = aVar.N();
        if (aVarN != null) {
            aVarN.U(null);
        }
        aVar.L().M(aVar);
        aVar.S();
        this.f338962b.remove(aVar);
    }

    public void n(c cVar) {
        m(cVar.x(0));
        m(cVar.x(1));
        this.f338961a.remove(cVar);
        cVar.E();
    }

    public void o(e eVar) {
        for (a aVar : eVar.I().d()) {
            a aVarN = aVar.N();
            if (aVarN != null) {
                m(aVarN);
            }
            this.f338962b.remove(aVar);
            c cVarH = aVar.H();
            if (cVarH != null) {
                this.f338961a.remove(cVarH);
            }
        }
        this.f338963c.d(eVar.z());
        eVar.L();
    }
}
