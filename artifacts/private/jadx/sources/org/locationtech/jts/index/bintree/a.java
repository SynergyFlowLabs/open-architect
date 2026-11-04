package org.locationtech.jts.index.bintree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338381b = 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f338380a = new f();

    private void a(b bVar) {
        double dG = bVar.g();
        if (dG >= this.f338381b || dG <= 0.0d) {
            return;
        }
        this.f338381b = dG;
    }

    public static b c(b bVar, double d10) {
        double dF = bVar.f();
        double dE = bVar.e();
        if (dF != dE) {
            return bVar;
        }
        if (dF == dE) {
            double d11 = d10 / 2.0d;
            dF -= d11;
            dE = dF + d11;
        }
        return new b(dF, dE);
    }

    public int b() {
        f fVar = this.f338380a;
        if (fVar != null) {
            return fVar.d();
        }
        return 0;
    }

    public void d(b bVar, Object obj) {
        a(bVar);
        this.f338380a.n(c(bVar, this.f338381b), obj);
    }

    public Iterator e() {
        ArrayList arrayList = new ArrayList();
        this.f338380a.b(arrayList);
        return arrayList.iterator();
    }

    public int f() {
        f fVar = this.f338380a;
        if (fVar != null) {
            return fVar.k();
        }
        return 0;
    }

    public List g(double d10) {
        return h(new b(d10, d10));
    }

    public List h(b bVar) {
        ArrayList arrayList = new ArrayList();
        i(bVar, arrayList);
        return arrayList;
    }

    public void i(b bVar, Collection collection) {
        this.f338380a.c(bVar, collection);
    }

    public boolean j(b bVar, Object obj) {
        return this.f338380a.l(c(bVar, this.f338381b), obj);
    }

    public int k() {
        f fVar = this.f338380a;
        if (fVar != null) {
            return fVar.m();
        }
        return 0;
    }
}
