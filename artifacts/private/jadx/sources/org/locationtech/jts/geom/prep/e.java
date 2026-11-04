package org.locationtech.jts.geom.prep;

import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.w;
import org.locationtech.jts.noding.a0;

/* JADX INFO: loaded from: classes14.dex */
public class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.noding.c f338197c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(w wVar) {
        super((n) wVar);
        this.f338197c = null;
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean a(n nVar) {
        return super.a(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean b(n nVar) {
        return super.b(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean c(n nVar) {
        return super.c(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean d(n nVar) {
        return super.d(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public /* bridge */ /* synthetic */ boolean e(n nVar) {
        return super.e(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.b, org.locationtech.jts.geom.prep.c
    public boolean f(n nVar) {
        if (m(nVar)) {
            return f.b(this, nVar);
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
    public /* bridge */ /* synthetic */ boolean k(n nVar) {
        return super.k(nVar);
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
            if (this.f338197c == null) {
                this.f338197c = new org.locationtech.jts.noding.c(a0.b(j()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f338197c;
    }

    @Override // org.locationtech.jts.geom.prep.b
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
