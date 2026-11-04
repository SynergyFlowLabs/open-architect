package org.locationtech.jts.edgegraph;

/* JADX INFO: loaded from: classes14.dex */
public class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338086d;

    public d(org.locationtech.jts.geom.a aVar) {
        super(aVar);
        this.f338086d = false;
    }

    public static void A(c cVar, boolean z10) {
        ((d) cVar).B(z10);
    }

    public static void C(c cVar, boolean z10) {
        ((d) cVar).B(z10);
        ((d) cVar.u()).B(z10);
    }

    public static boolean w(c cVar) {
        return ((d) cVar).v();
    }

    public static void y(c cVar) {
        ((d) cVar).x();
    }

    public static void z(c cVar) {
        ((d) cVar).x();
        ((d) cVar.u()).x();
    }

    public void B(boolean z10) {
        this.f338086d = z10;
    }

    public boolean v() {
        return this.f338086d;
    }

    public void x() {
        this.f338086d = true;
    }
}
