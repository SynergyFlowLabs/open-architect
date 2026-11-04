package org.locationtech.jts.geom.prep;

import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.a0;

/* JADX INFO: loaded from: classes14.dex */
public class h extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f338199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.noding.c f338200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.algorithm.locate.b f338201e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(f0 f0Var) {
        super((n) f0Var);
        this.f338200d = null;
        this.f338201e = null;
        this.f338199c = j().y0();
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean a(n nVar) {
        return super.a(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public boolean b(n nVar) {
        if (l(nVar)) {
            return this.f338199c ? org.locationtech.jts.operation.predicate.c.b((e0) j(), nVar) : i.l(this, nVar);
        }
        return false;
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean c(n nVar) {
        return super.c(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public boolean d(n nVar) {
        if (!l(nVar)) {
            return false;
        }
        if (this.f338199c) {
            return true;
        }
        return k.l(this, nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean e(n nVar) {
        return super.e(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public boolean f(n nVar) {
        if (m(nVar)) {
            return this.f338199c ? org.locationtech.jts.operation.predicate.d.b((e0) j(), nVar) : l.g(this, nVar);
        }
        return false;
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean g(n nVar) {
        return super.g(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean h(n nVar) {
        return super.h(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean i(n nVar) {
        return super.i(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ n j() {
        return super.j();
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public boolean k(n nVar) {
        if (l(nVar)) {
            return j.g(this, nVar);
        }
        return false;
    }

    @Override // org.locationtech.jts.geom.prep.b
    public /* bridge */ /* synthetic */ List n() {
        return super.n();
    }

    @Override // org.locationtech.jts.geom.prep.b
    public /* bridge */ /* synthetic */ boolean o(n nVar) {
        return super.o(nVar);
    }

    public synchronized org.locationtech.jts.noding.c p() {
        try {
            if (this.f338200d == null) {
                this.f338200d = new org.locationtech.jts.noding.c(a0.b(j()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f338200d;
    }

    public synchronized org.locationtech.jts.algorithm.locate.b q() {
        try {
            if (this.f338201e == null) {
                this.f338201e = new org.locationtech.jts.algorithm.locate.a(j());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f338201e;
    }

    @Override // org.locationtech.jts.geom.prep.b
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
