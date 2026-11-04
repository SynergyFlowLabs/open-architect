package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338061b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338062c = false;

    public v(org.locationtech.jts.geom.a aVar) {
        this.f338060a = aVar;
    }

    public static int e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.e eVar) {
        v vVar = new v(aVar);
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a();
        for (int i10 = 1; i10 < eVar.size(); i10++) {
            eVar.Ob(i10, aVar2);
            eVar.Ob(i10 - 1, aVar3);
            vVar.a(aVar2, aVar3);
            if (vVar.c()) {
                return vVar.b();
            }
        }
        return vVar.b();
    }

    public static int f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        v vVar = new v(aVar);
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            vVar.a(aVarArr[i10], aVarArr[i10 - 1]);
            if (vVar.c()) {
                return vVar.b();
            }
        }
        return vVar.b();
    }

    public void a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = aVar.f338092a;
        org.locationtech.jts.geom.a aVar3 = this.f338060a;
        double d11 = aVar3.f338092a;
        if (d10 >= d11 || aVar2.f338092a >= d11) {
            double d12 = aVar2.f338092a;
            if (d11 == d12 && aVar3.f338093b == aVar2.f338093b) {
                this.f338062c = true;
                return;
            }
            double d13 = aVar.f338093b;
            double d14 = aVar3.f338093b;
            if (d13 == d14 && aVar2.f338093b == d14) {
                if (d10 > d12) {
                    d12 = d10;
                    d10 = d12;
                }
                if (d11 < d10 || d11 > d12) {
                    return;
                }
                this.f338062c = true;
                return;
            }
            if ((d13 <= d14 || aVar2.f338093b > d14) && (aVar2.f338093b <= d14 || d13 > d14)) {
                return;
            }
            int iA = s.a(aVar, aVar2, aVar3);
            if (iA == 0) {
                this.f338062c = true;
                return;
            }
            if (aVar2.f338093b < aVar.f338093b) {
                iA = -iA;
            }
            if (iA == 1) {
                this.f338061b++;
            }
        }
    }

    public int b() {
        if (this.f338062c) {
            return 1;
        }
        return this.f338061b % 2 == 1 ? 0 : 2;
    }

    public boolean c() {
        return this.f338062c;
    }

    public boolean d() {
        return b() != 2;
    }
}
