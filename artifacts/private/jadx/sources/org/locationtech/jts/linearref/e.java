package org.locationtech.jts.linearref;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338532b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.d f338533c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338534d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338535e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338536f = null;

    public e(r rVar) {
        this.f338531a = rVar;
    }

    private org.locationtech.jts.geom.a[] h(org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length >= 2) {
            return aVarArr;
        }
        org.locationtech.jts.geom.a aVar = aVarArr[0];
        return new org.locationtech.jts.geom.a[]{aVar, aVar};
    }

    public void a(org.locationtech.jts.geom.a aVar) {
        b(aVar, true);
    }

    public void b(org.locationtech.jts.geom.a aVar, boolean z10) {
        if (this.f338533c == null) {
            this.f338533c = new org.locationtech.jts.geom.d();
        }
        this.f338533c.i(aVar, z10);
        this.f338536f = aVar;
    }

    public void c() {
        org.locationtech.jts.geom.d dVar = this.f338533c;
        if (dVar == null) {
            return;
        }
        v vVarH = null;
        if (this.f338534d && dVar.size() < 2) {
            this.f338533c = null;
            return;
        }
        org.locationtech.jts.geom.a[] aVarArrUf = this.f338533c.Uf();
        if (this.f338535e) {
            aVarArrUf = h(aVarArrUf);
        }
        this.f338533c = null;
        try {
            vVarH = this.f338531a.h(aVarArrUf);
        } catch (IllegalArgumentException e10) {
            if (!this.f338534d) {
                throw e10;
            }
        }
        if (vVarH != null) {
            this.f338532b.add(vVarH);
        }
    }

    public n d() {
        c();
        return this.f338531a.b(this.f338532b);
    }

    public org.locationtech.jts.geom.a e() {
        return this.f338536f;
    }

    public void f(boolean z10) {
        this.f338535e = z10;
    }

    public void g(boolean z10) {
        this.f338534d = z10;
    }
}
