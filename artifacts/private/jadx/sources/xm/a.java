package xm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.locationtech.jts.planargraph.c;
import org.locationtech.jts.planargraph.d;
import org.locationtech.jts.planargraph.e;
import org.locationtech.jts.planargraph.g;
import org.locationtech.jts.planargraph.h;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f390637a;

    public a(g gVar) {
        this.f390637a = gVar;
    }

    private void a(e eVar, Stack stack, h hVar) {
        eVar.w(true);
        Iterator itJ = eVar.I().j();
        while (itJ.hasNext()) {
            org.locationtech.jts.planargraph.a aVar = (org.locationtech.jts.planargraph.a) itJ.next();
            hVar.a(aVar.H());
            e eVarO = aVar.O();
            if (!eVarO.p()) {
                stack.push(eVarO);
            }
        }
    }

    private void b(e eVar, h hVar) {
        Stack stack = new Stack();
        stack.add(eVar);
        while (!stack.empty()) {
            a((e) stack.pop(), stack, hVar);
        }
    }

    private h c(e eVar) {
        h hVar = new h(this.f390637a);
        b(eVar, hVar);
        return hVar;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        d.v(this.f390637a.l(), false);
        Iterator itG = this.f390637a.g();
        while (itG.hasNext()) {
            e eVarL = ((c) itG.next()).x(0).L();
            if (!eVarL.p()) {
                arrayList.add(c(eVarL));
            }
        }
        return arrayList;
    }
}
