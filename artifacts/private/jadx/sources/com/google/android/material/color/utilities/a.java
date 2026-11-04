package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class a {
    private a() {
    }

    public static int a(int i10, int i11, double d10) {
        b bVarB = b.b(i10);
        b bVarB2 = b.b(i11);
        double dN = bVarB.n();
        double dI = bVarB.i();
        double dJ = bVarB.j();
        return b.f(dN + ((bVarB2.n() - dN) * d10), dI + ((bVarB2.i() - dI) * d10), dJ + ((bVarB2.j() - dJ) * d10)).r();
    }

    public static int b(int i10, int i11) {
        l lVarB = l.b(i10);
        l lVarB2 = l.b(i11);
        return l.a(v5.g(lVarB.d() + (Math.min(v5.c(lVarB.d(), lVarB2.d()) * 0.5d, 15.0d) * v5.f(lVarB.d(), lVarB2.d()))), lVarB.c(), lVarB.e()).k();
    }

    public static int c(int i10, int i11, double d10) {
        return l.a(b.b(a(i10, i11, d10)).l(), b.b(i10).k(), c.o(i10)).k();
    }
}
