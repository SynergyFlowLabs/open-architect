package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.g0;

/* JADX INFO: loaded from: classes14.dex */
public class y extends o {
    private org.locationtech.jts.geom.a A(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        org.locationtech.jts.geom.a aVar5 = new org.locationtech.jts.geom.a(aVar);
        org.locationtech.jts.geom.a aVar6 = new org.locationtech.jts.geom.a(aVar2);
        org.locationtech.jts.geom.a aVar7 = new org.locationtech.jts.geom.a(aVar3);
        org.locationtech.jts.geom.a aVar8 = new org.locationtech.jts.geom.a(aVar4);
        org.locationtech.jts.geom.a aVar9 = new org.locationtech.jts.geom.a();
        D(aVar5, aVar6, aVar7, aVar8, aVar9);
        org.locationtech.jts.geom.a aVarF = F(aVar5, aVar6, aVar7, aVar8);
        aVarF.f338092a += aVar9.f338092a;
        aVarF.f338093b += aVar9.f338093b;
        return aVarF;
    }

    private boolean B(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a[] aVarArr = this.f338033b[0];
        org.locationtech.jts.geom.m mVar = new org.locationtech.jts.geom.m(aVarArr[0], aVarArr[1]);
        org.locationtech.jts.geom.a[] aVarArr2 = this.f338033b[1];
        return mVar.n(aVar) && new org.locationtech.jts.geom.m(aVarArr2[0], aVarArr2[1]).n(aVar);
    }

    private static org.locationtech.jts.geom.a C(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        org.locationtech.jts.geom.a aVar5;
        double dB = i.b(aVar, aVar3, aVar4);
        double dB2 = i.b(aVar2, aVar3, aVar4);
        if (dB2 < dB) {
            dB = dB2;
            aVar5 = aVar2;
        } else {
            aVar5 = aVar;
        }
        double dB3 = i.b(aVar3, aVar, aVar2);
        if (dB3 < dB) {
            dB = dB3;
        } else {
            aVar3 = aVar5;
        }
        return i.b(aVar4, aVar, aVar2) < dB ? aVar4 : aVar3;
    }

    private void D(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5) {
        double d10 = aVar.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = d10 < d11 ? d10 : d11;
        double d13 = aVar.f338093b;
        double d14 = aVar2.f338093b;
        double d15 = d13 < d14 ? d13 : d14;
        if (d10 <= d11) {
            d10 = d11;
        }
        if (d13 <= d14) {
            d13 = d14;
        }
        double d16 = aVar3.f338092a;
        double d17 = aVar4.f338092a;
        double d18 = d16 < d17 ? d16 : d17;
        double d19 = d10;
        double d20 = aVar3.f338093b;
        double d21 = aVar4.f338093b;
        double d22 = d20 < d21 ? d20 : d21;
        if (d16 <= d17) {
            d16 = d17;
        }
        if (d20 > d21) {
            d21 = d20;
        }
        if (d12 <= d18) {
            d12 = d18;
        }
        if (d19 >= d16) {
            d19 = d16;
        }
        if (d15 <= d22) {
            d15 = d22;
        }
        if (d13 >= d21) {
            d13 = d21;
        }
        double d23 = (d12 + d19) / 2.0d;
        double d24 = (d15 + d13) / 2.0d;
        aVar5.f338092a = d23;
        aVar5.f338093b = d24;
        aVar.f338092a -= d23;
        aVar.f338093b -= d24;
        aVar2.f338092a -= aVar5.f338092a;
        aVar2.f338093b -= aVar5.f338093b;
        aVar3.f338092a -= aVar5.f338092a;
        aVar3.f338093b -= aVar5.f338093b;
        aVar4.f338092a -= aVar5.f338092a;
        aVar4.f338093b -= aVar5.f338093b;
    }

    private void E(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5) {
        aVar5.f338092a = G(aVar.f338092a, aVar2.f338092a, aVar3.f338092a, aVar4.f338092a);
        double dG = G(aVar.f338093b, aVar2.f338093b, aVar3.f338093b, aVar4.f338093b);
        aVar5.f338093b = dG;
        aVar.f338092a -= aVar5.f338092a;
        aVar.f338093b -= dG;
        aVar2.f338092a -= aVar5.f338092a;
        aVar2.f338093b -= aVar5.f338093b;
        aVar3.f338092a -= aVar5.f338092a;
        aVar3.f338093b -= aVar5.f338093b;
        aVar4.f338092a -= aVar5.f338092a;
        aVar4.f338093b -= aVar5.f338093b;
    }

    private org.locationtech.jts.geom.a F(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        try {
            return j.d(aVar, aVar2, aVar3, aVar4);
        } catch (r unused) {
            return C(aVar, aVar2, aVar3, aVar4);
        }
    }

    private double G(double d10, double d11, double d12, double d13) {
        double dAbs = Math.abs(d10);
        if (Math.abs(d11) < dAbs) {
            dAbs = Math.abs(d11);
            d10 = d11;
        }
        if (Math.abs(d12) < dAbs) {
            dAbs = Math.abs(d12);
        } else {
            d12 = d10;
        }
        return Math.abs(d13) < dAbs ? d13 : d12;
    }

    private void x(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5) {
        org.locationtech.jts.geom.a aVarA = f.a(aVar, aVar2, aVar3, aVar4);
        boolean zB = B(aVarA);
        System.out.println("DD in env = " + zB + "  --------------------- " + aVarA);
        if (aVar5.l(aVarA) > 1.0E-4d) {
            System.out.println("Distance = " + aVar5.l(aVarA));
        }
    }

    private int y(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        boolean Z = org.locationtech.jts.geom.m.Z(aVar, aVar2, aVar3);
        boolean Z2 = org.locationtech.jts.geom.m.Z(aVar, aVar2, aVar4);
        boolean Z3 = org.locationtech.jts.geom.m.Z(aVar3, aVar4, aVar);
        boolean Z4 = org.locationtech.jts.geom.m.Z(aVar3, aVar4, aVar2);
        if (Z && Z2) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338034c;
            aVarArr[0] = aVar3;
            aVarArr[1] = aVar4;
            return 2;
        }
        if (Z3 && Z4) {
            org.locationtech.jts.geom.a[] aVarArr2 = this.f338034c;
            aVarArr2[0] = aVar;
            aVarArr2[1] = aVar2;
            return 2;
        }
        if (Z && Z3) {
            org.locationtech.jts.geom.a[] aVarArr3 = this.f338034c;
            aVarArr3[0] = aVar3;
            aVarArr3[1] = aVar;
            return (!aVar3.equals(aVar) || Z2 || Z4) ? 2 : 1;
        }
        if (Z && Z4) {
            org.locationtech.jts.geom.a[] aVarArr4 = this.f338034c;
            aVarArr4[0] = aVar3;
            aVarArr4[1] = aVar2;
            return (!aVar3.equals(aVar2) || Z2 || Z3) ? 2 : 1;
        }
        if (Z2 && Z3) {
            org.locationtech.jts.geom.a[] aVarArr5 = this.f338034c;
            aVarArr5[0] = aVar4;
            aVarArr5[1] = aVar;
            return (!aVar4.equals(aVar) || Z || Z4) ? 2 : 1;
        }
        if (!Z2 || !Z4) {
            return 0;
        }
        org.locationtech.jts.geom.a[] aVarArr6 = this.f338034c;
        aVarArr6[0] = aVar4;
        aVarArr6[1] = aVar2;
        return (!aVar4.equals(aVar2) || Z || Z3) ? 2 : 1;
    }

    private org.locationtech.jts.geom.a z(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        org.locationtech.jts.geom.a aVarA = A(aVar, aVar2, aVar3, aVar4);
        if (!B(aVarA)) {
            aVarA = new org.locationtech.jts.geom.a(C(aVar, aVar2, aVar3, aVar4));
        }
        g0 g0Var = this.f338039h;
        if (g0Var != null) {
            g0Var.s(aVarA);
        }
        return aVarA;
    }

    @Override // org.locationtech.jts.algorithm.o
    protected int d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        this.f338036e = false;
        if (!org.locationtech.jts.geom.m.a0(aVar, aVar2, aVar3, aVar4)) {
            return 0;
        }
        int iA = s.a(aVar, aVar2, aVar3);
        int iA2 = s.a(aVar, aVar2, aVar4);
        if ((iA > 0 && iA2 > 0) || (iA < 0 && iA2 < 0)) {
            return 0;
        }
        int iA3 = s.a(aVar3, aVar4, aVar);
        int iA4 = s.a(aVar3, aVar4, aVar2);
        if ((iA3 > 0 && iA4 > 0) || (iA3 < 0 && iA4 < 0)) {
            return 0;
        }
        if (iA == 0 && iA2 == 0 && iA3 == 0 && iA4 == 0) {
            return y(aVar, aVar2, aVar3, aVar4);
        }
        if (iA == 0 || iA2 == 0 || iA3 == 0 || iA4 == 0) {
            this.f338036e = false;
            if (aVar.p(aVar3) || aVar.p(aVar4)) {
                this.f338034c[0] = aVar;
            } else if (aVar2.p(aVar3) || aVar2.p(aVar4)) {
                this.f338034c[0] = aVar2;
            } else if (iA == 0) {
                this.f338034c[0] = new org.locationtech.jts.geom.a(aVar3);
            } else if (iA2 == 0) {
                this.f338034c[0] = new org.locationtech.jts.geom.a(aVar4);
            } else if (iA3 == 0) {
                this.f338034c[0] = new org.locationtech.jts.geom.a(aVar);
            } else if (iA4 == 0) {
                this.f338034c[0] = new org.locationtech.jts.geom.a(aVar2);
            }
        } else {
            this.f338036e = true;
            this.f338034c[0] = z(aVar, aVar2, aVar3, aVar4);
        }
        return 1;
    }

    @Override // org.locationtech.jts.algorithm.o
    public void e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        this.f338036e = false;
        if (!org.locationtech.jts.geom.m.Z(aVar2, aVar3, aVar) || s.a(aVar2, aVar3, aVar) != 0 || s.a(aVar3, aVar2, aVar) != 0) {
            this.f338032a = 0;
            return;
        }
        this.f338036e = true;
        if (aVar.equals(aVar2) || aVar.equals(aVar3)) {
            this.f338036e = false;
        }
        this.f338032a = 1;
    }
}
