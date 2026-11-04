package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<Integer, Integer> f112256a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    l f112257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f112258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f112259d;

    private s6(double d10, double d11, l lVar) {
        this.f112258c = d10;
        this.f112259d = d11;
        this.f112257b = lVar;
    }

    private static l a(double d10, double d11) {
        l lVarA = l.a(d10, d11, 50.0d);
        double dAbs = Math.abs(lVarA.c() - d11);
        for (double d12 = 1.0d; d12 < 50.0d && Math.round(d11) != Math.round(lVarA.c()); d12 += 1.0d) {
            l lVarA2 = l.a(d10, d11, 50.0d + d12);
            double dAbs2 = Math.abs(lVarA2.c() - d11);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                lVarA = lVarA2;
            }
            l lVarA3 = l.a(d10, d11, 50.0d - d12);
            double dAbs3 = Math.abs(lVarA3.c() - d11);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                lVarA = lVarA3;
            }
        }
        return lVarA;
    }

    public static s6 b(l lVar) {
        return new s6(lVar.d(), lVar.c(), lVar);
    }

    public static s6 c(double d10, double d11) {
        return new s6(d10, d11, a(d10, d11));
    }

    public static s6 d(int i10) {
        return b(l.b(i10));
    }

    public double e() {
        return this.f112259d;
    }

    public l f(double d10) {
        return l.a(this.f112258c, this.f112259d, d10);
    }

    public double g() {
        return this.f112258c;
    }

    public l h() {
        return this.f112257b;
    }

    public int i(int i10) {
        Integer numValueOf = this.f112256a.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(l.a(this.f112258c, this.f112259d, i10).k());
            this.f112256a.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
