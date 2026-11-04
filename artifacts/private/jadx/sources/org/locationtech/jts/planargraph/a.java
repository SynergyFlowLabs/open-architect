package org.locationtech.jts.planargraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.s;
import org.locationtech.jts.geomgraph.t;

/* JADX INFO: loaded from: classes14.dex */
public class a extends d implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f338943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f338944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f338945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected a f338948i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f338949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f338950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected double f338951l;

    public a(e eVar, e eVar2, org.locationtech.jts.geom.a aVar, boolean z10) {
        this.f338944e = eVar;
        this.f338945f = eVar2;
        this.f338949j = z10;
        org.locationtech.jts.geom.a aVarZ = eVar.z();
        this.f338946g = aVarZ;
        this.f338947h = aVar;
        double d10 = aVar.f338092a - aVarZ.f338092a;
        double d11 = aVar.f338093b - aVarZ.f338093b;
        this.f338950k = t.e(d10, d11);
        this.f338951l = Math.atan2(d11, d10);
    }

    public static List V(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).f338943d);
        }
        return arrayList;
    }

    public org.locationtech.jts.geom.a D() {
        return this.f338944e.z();
    }

    public org.locationtech.jts.geom.a E() {
        return this.f338947h;
    }

    public c H() {
        return this.f338943d;
    }

    public boolean I() {
        return this.f338949j;
    }

    public e L() {
        return this.f338944e;
    }

    public int M() {
        return this.f338950k;
    }

    public a N() {
        return this.f338948i;
    }

    public e O() {
        return this.f338945f;
    }

    public void R(PrintStream printStream) {
        String name = getClass().getName();
        printStream.print("  " + name.substring(name.lastIndexOf(46) + 1) + ": " + this.f338946g + " - " + this.f338947h + " " + this.f338950k + ":" + this.f338951l);
    }

    void S() {
        this.f338948i = null;
        this.f338943d = null;
    }

    public void T(c cVar) {
        this.f338943d = cVar;
    }

    public void U(a aVar) {
        this.f338948i = aVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return x((a) obj);
    }

    @Override // org.locationtech.jts.planargraph.d
    public boolean o() {
        return this.f338943d == null;
    }

    public int x(a aVar) {
        int i10 = this.f338950k;
        int i11 = aVar.f338950k;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return s.a(aVar.f338946g, aVar.f338947h, this.f338947h);
    }

    public double z() {
        return this.f338951l;
    }
}
