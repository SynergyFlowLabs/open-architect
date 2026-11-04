package org.locationtech.jts.planargraph;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes14.dex */
public class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f338959e;

    public e(org.locationtech.jts.geom.a aVar) {
        this(aVar, new b());
    }

    public static Collection E(e eVar, e eVar2) {
        HashSet hashSet = new HashSet(a.V(eVar.I().d()));
        hashSet.retainAll(a.V(eVar2.I().d()));
        return hashSet;
    }

    public int D() {
        return this.f338959e.c();
    }

    public int H(c cVar) {
        return this.f338959e.g(cVar);
    }

    public b I() {
        return this.f338959e;
    }

    void L() {
        this.f338958d = null;
    }

    public void M(a aVar) {
        this.f338959e.k(aVar);
    }

    @Override // org.locationtech.jts.planargraph.d
    public boolean o() {
        return this.f338958d == null;
    }

    public void x(a aVar) {
        this.f338959e.a(aVar);
    }

    public org.locationtech.jts.geom.a z() {
        return this.f338958d;
    }

    public e(org.locationtech.jts.geom.a aVar, b bVar) {
        this.f338958d = aVar;
        this.f338959e = bVar;
    }
}
