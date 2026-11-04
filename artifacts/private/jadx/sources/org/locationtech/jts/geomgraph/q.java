package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f338367a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p f338368b;

    public q(p pVar) {
        this.f338368b = pVar;
    }

    public void a(e eVar) {
        b(eVar.k()).n(eVar);
    }

    public o b(org.locationtech.jts.geom.a aVar) {
        o oVar = (o) this.f338367a.get(aVar);
        if (oVar != null) {
            return oVar;
        }
        o oVarA = this.f338368b.a(aVar);
        this.f338367a.put(aVar, oVarA);
        return oVarA;
    }

    public o c(o oVar) {
        o oVar2 = (o) this.f338367a.get(oVar.b());
        if (oVar2 == null) {
            this.f338367a.put(oVar.b(), oVar);
            return oVar;
        }
        oVar2.s(oVar);
        return oVar2;
    }

    public o d(org.locationtech.jts.geom.a aVar) {
        return (o) this.f338367a.get(aVar);
    }

    public Collection e(int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator itF = f();
        while (itF.hasNext()) {
            o oVar = (o) itF.next();
            if (oVar.c().d(i10) == 1) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    public Iterator f() {
        return this.f338367a.values().iterator();
    }

    public void g(PrintStream printStream) {
        Iterator itF = f();
        while (itF.hasNext()) {
            ((o) itF.next()).t(printStream);
        }
    }

    public Collection h() {
        return this.f338367a.values();
    }
}
