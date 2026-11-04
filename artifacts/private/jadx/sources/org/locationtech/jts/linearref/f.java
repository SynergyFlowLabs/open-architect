package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.w;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f338538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v f338539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f338541e;

    public f(n nVar) {
        this(nVar, 0, 0);
    }

    private void h() {
        int i10 = this.f338540d;
        if (i10 >= this.f338538b) {
            this.f338539c = null;
        } else {
            this.f338539c = (v) this.f338537a.h0(i10);
        }
    }

    private static int j(g gVar) {
        return gVar.q() > 0.0d ? gVar.r() + 1 : gVar.r();
    }

    public int a() {
        return this.f338540d;
    }

    public v b() {
        return this.f338539c;
    }

    public org.locationtech.jts.geom.a c() {
        if (this.f338541e < b().m0() - 1) {
            return this.f338539c.R0(this.f338541e + 1);
        }
        return null;
    }

    public org.locationtech.jts.geom.a d() {
        return this.f338539c.R0(this.f338541e);
    }

    public int e() {
        return this.f338541e;
    }

    public boolean f() {
        int i10 = this.f338540d;
        int i11 = this.f338538b;
        if (i10 >= i11) {
            return false;
        }
        return i10 != i11 - 1 || this.f338541e < this.f338539c.m0();
    }

    public boolean g() {
        return this.f338540d < this.f338538b && this.f338541e >= this.f338539c.m0() - 1;
    }

    public void i() {
        if (f()) {
            int i10 = this.f338541e + 1;
            this.f338541e = i10;
            if (i10 >= this.f338539c.m0()) {
                this.f338540d++;
                h();
                this.f338541e = 0;
            }
        }
    }

    public f(n nVar, g gVar) {
        this(nVar, gVar.l(), j(gVar));
    }

    public f(n nVar, int i10, int i11) {
        int i12 = 4 | 0;
        this.f338540d = 0;
        this.f338541e = 0;
        if (!(nVar instanceof w)) {
            throw new IllegalArgumentException("Lineal geometry is required");
        }
        this.f338537a = nVar;
        this.f338538b = nVar.l0();
        this.f338540d = i10;
        this.f338541e = i11;
        h();
    }
}
