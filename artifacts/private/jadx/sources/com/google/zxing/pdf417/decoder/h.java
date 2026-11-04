package com.google.zxing.pdf417.decoder;

import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
final class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130816d;

    h(c cVar, boolean z10) {
        super(cVar);
        this.f130816d = z10;
    }

    private void h(a aVar) {
        c cVarA = a();
        t tVarH = this.f130816d ? cVarA.h() : cVarA.i();
        t tVarB = this.f130816d ? cVarA.b() : cVarA.c();
        int iE = e((int) tVarB.d());
        d[] dVarArrD = d();
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        for (int iE2 = e((int) tVarH.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        dVarArrD[iE2] = null;
                    } else {
                        iC = dVar.c();
                    }
                    i10 = 1;
                }
            }
        }
    }

    private void l(d[] dVarArr, a aVar) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            if (dVar != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > aVar.c()) {
                    dVarArr[i10] = null;
                } else {
                    if (!this.f130816d) {
                        iC += 2;
                    }
                    int i11 = iC % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && iE + 1 != aVar.a()) {
                                dVarArr[i10] = null;
                            }
                        } else if (iE / 3 != aVar.b() || iE % 3 != aVar.d()) {
                            dVarArr[i10] = null;
                        }
                    } else if ((iE * 3) + 1 != aVar.e()) {
                        dVarArr[i10] = null;
                    }
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    void g(a aVar) {
        d[] dVarArrD = d();
        m();
        l(dVarArrD, aVar);
        c cVarA = a();
        t tVarH = this.f130816d ? cVarA.h() : cVarA.i();
        t tVarB = this.f130816d ? cVarA.b() : cVarA.c();
        int iE = e((int) tVarH.d());
        int iE2 = e((int) tVarB.d());
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        while (iE < iE2) {
            d dVar = dVarArrD[iE];
            if (dVar != null) {
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (iC2 < 0 || dVar.c() >= aVar.c() || iC2 > iE) {
                        dVarArrD[iE] = null;
                    } else {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        boolean z10 = iC2 >= iE;
                        for (int i11 = 1; i11 <= iC2 && !z10; i11++) {
                            z10 = dVarArrD[iE - i11] != null;
                        }
                        if (z10) {
                            dVarArrD[iE] = null;
                        } else {
                            iC = dVar.c();
                        }
                    }
                    i10 = 1;
                }
            }
            iE++;
        }
    }

    a i() {
        d[] dVarArrD = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.f130816d) {
                    iC += 2;
                }
                int i10 = iC % 3;
                if (i10 == 0) {
                    bVar2.c((iE * 3) + 1);
                } else if (i10 == 1) {
                    bVar4.c(iE / 3);
                    bVar3.c(iE % 3);
                } else if (i10 == 2) {
                    bVar.c(iE + 1);
                }
            }
        }
        if (bVar.b().length == 0 || bVar2.b().length == 0 || bVar3.b().length == 0 || bVar4.b().length == 0 || bVar.b()[0] <= 0 || bVar2.b()[0] + bVar3.b()[0] < 3 || bVar2.b()[0] + bVar3.b()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.b()[0], bVar2.b()[0], bVar3.b()[0], bVar4.b()[0]);
        l(dVarArrD, aVar);
        return aVar;
    }

    int[] j() {
        int iC;
        a aVarI = i();
        if (aVarI == null) {
            return null;
        }
        h(aVarI);
        int iC2 = aVarI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    boolean k() {
        return this.f130816d;
    }

    @Override // com.google.zxing.pdf417.decoder.g
    public String toString() {
        return "IsLeft: " + this.f130816d + '\n' + super.toString();
    }
}
