package org.locationtech.jts.noding;

import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.i0;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f338551b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338550a = new org.locationtech.jts.algorithm.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338552c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f338553d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338554e = true;

    public b(Collection collection) {
        this.f338551b = collection;
    }

    private void a() {
        this.f338554e = true;
        d dVar = new d(this.f338550a);
        this.f338553d = dVar;
        dVar.l(this.f338552c);
        i iVar = new i();
        iVar.c(this.f338553d);
        iVar.a(this.f338551b);
        if (this.f338553d.i()) {
            this.f338554e = false;
        }
    }

    public static List c(Collection collection) {
        b bVar = new b(collection);
        bVar.h(true);
        bVar.g();
        return bVar.f();
    }

    private void d() {
        if (this.f338553d != null) {
            return;
        }
        a();
    }

    public void b() {
        d();
        if (!this.f338554e) {
            throw new i0(e(), this.f338553d.f());
        }
    }

    public String e() {
        if (this.f338554e) {
            return "no intersections found";
        }
        org.locationtech.jts.geom.a[] aVarArrG = this.f338553d.g();
        return "found non-noded intersection between " + rm.o.A(aVarArrG[0], aVarArrG[1]) + " and " + rm.o.A(aVarArrG[2], aVarArrG[3]);
    }

    public List f() {
        return this.f338553d.h();
    }

    public boolean g() {
        d();
        return this.f338554e;
    }

    public void h(boolean z10) {
        this.f338552c = z10;
    }
}
