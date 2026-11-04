package com.google.zxing.pdf417.decoder;

import com.google.zxing.m;
import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f130751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f130752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f130753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f130754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f130757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f130758i;

    c(com.google.zxing.common.b bVar, t tVar, t tVar2, t tVar3, t tVar4) throws m {
        boolean z10 = tVar == null || tVar2 == null;
        boolean z11 = tVar3 == null || tVar4 == null;
        if (z10 && z11) {
            throw m.a();
        }
        if (z10) {
            tVar = new t(0.0f, tVar3.d());
            tVar2 = new t(0.0f, tVar4.d());
        } else if (z11) {
            tVar3 = new t(bVar.l() - 1, tVar.d());
            tVar4 = new t(bVar.l() - 1, tVar2.d());
        }
        this.f130750a = bVar;
        this.f130751b = tVar;
        this.f130752c = tVar2;
        this.f130753d = tVar3;
        this.f130754e = tVar4;
        this.f130755f = (int) Math.min(tVar.c(), tVar2.c());
        this.f130756g = (int) Math.max(tVar3.c(), tVar4.c());
        this.f130757h = (int) Math.min(tVar.d(), tVar3.d());
        this.f130758i = (int) Math.max(tVar2.d(), tVar4.d());
    }

    static c j(c cVar, c cVar2) throws m {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.f130750a, cVar.f130751b, cVar.f130752c, cVar2.f130753d, cVar2.f130754e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    c a(int i10, int i11, boolean z10) throws m {
        t tVar;
        t tVar2;
        t tVar3;
        t tVar4;
        t tVar5;
        int iD;
        t tVar6;
        t tVar7 = this.f130751b;
        t tVar8 = this.f130752c;
        t tVar9 = this.f130753d;
        t tVar10 = this.f130754e;
        if (i10 > 0) {
            t tVar11 = z10 ? tVar7 : tVar9;
            int iD2 = ((int) tVar11.d()) - i10;
            if (iD2 < 0) {
                iD2 = 0;
            }
            t tVar12 = new t(tVar11.c(), iD2);
            if (z10) {
                tVar = tVar12;
            } else {
                tVar2 = tVar12;
                tVar = tVar7;
            }
            if (i11 > 0) {
                if (z10) {
                    tVar5 = this.f130752c;
                } else {
                    tVar5 = this.f130754e;
                }
                iD = ((int) tVar5.d()) + i11;
                if (iD >= this.f130750a.h()) {
                    iD = this.f130750a.h() - 1;
                }
                tVar6 = new t(tVar5.c(), iD);
                if (z10) {
                    tVar3 = tVar6;
                } else {
                    tVar4 = tVar6;
                    tVar3 = tVar8;
                }
                return new c(this.f130750a, tVar, tVar3, tVar2, tVar4);
            }
            tVar3 = tVar8;
            tVar4 = tVar10;
            return new c(this.f130750a, tVar, tVar3, tVar2, tVar4);
        }
        tVar = tVar7;
        tVar2 = tVar9;
        if (i11 > 0) {
            if (z10) {
                tVar5 = this.f130752c;
            } else {
                tVar5 = this.f130754e;
            }
            iD = ((int) tVar5.d()) + i11;
            if (iD >= this.f130750a.h()) {
                iD = this.f130750a.h() - 1;
            }
            tVar6 = new t(tVar5.c(), iD);
            if (z10) {
                tVar3 = tVar6;
            } else {
                tVar4 = tVar6;
                tVar3 = tVar8;
            }
            return new c(this.f130750a, tVar, tVar3, tVar2, tVar4);
        }
        tVar3 = tVar8;
        tVar4 = tVar10;
        return new c(this.f130750a, tVar, tVar3, tVar2, tVar4);
    }

    t b() {
        return this.f130752c;
    }

    t c() {
        return this.f130754e;
    }

    int d() {
        return this.f130756g;
    }

    int e() {
        return this.f130758i;
    }

    int f() {
        return this.f130755f;
    }

    int g() {
        return this.f130757h;
    }

    t h() {
        return this.f130751b;
    }

    t i() {
        return this.f130753d;
    }

    c(c cVar) {
        this.f130750a = cVar.f130750a;
        this.f130751b = cVar.h();
        this.f130752c = cVar.b();
        this.f130753d = cVar.i();
        this.f130754e = cVar.c();
        this.f130755f = cVar.f();
        this.f130756g = cVar.d();
        this.f130757h = cVar.g();
        this.f130758i = cVar.e();
    }
}
