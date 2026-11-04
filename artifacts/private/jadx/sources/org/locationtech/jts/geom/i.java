package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class i {
    public static void a(e eVar, int i10, e eVar2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            b(eVar, i10 + i13, eVar2, i11 + i13);
        }
    }

    public static void b(e eVar, int i10, e eVar2, int i11) {
        int iMin = Math.min(eVar.Rg(), eVar2.Rg());
        for (int i12 = 0; i12 < iMin; i12++) {
            eVar2.Ld(i11, i12, eVar.ij(i10, i12));
        }
    }

    private static e c(g gVar, e eVar, int i10) {
        e eVarC = gVar.c(i10, eVar.Rg());
        int size = eVar.size();
        a(eVar, 0, eVarC, 0, size);
        while (size < i10) {
            a(eVar, 0, eVarC, size, 1);
            size++;
        }
        return eVarC;
    }

    public static e d(g gVar, e eVar) {
        int size = eVar.size();
        if (size == 0) {
            return eVar;
        }
        if (size <= 3) {
            return c(gVar, eVar, 4);
        }
        int i10 = size - 1;
        return (eVar.ij(0, 0) == eVar.ij(i10, 0) && eVar.ij(0, 1) == eVar.ij(i10, 1)) ? eVar : c(gVar, eVar, size + 1);
    }

    public static e e(g gVar, e eVar, int i10) {
        e eVarC = gVar.c(i10, eVar.Rg());
        int size = eVar.size();
        a(eVar, 0, eVarC, 0, size);
        if (size > 0) {
            for (int i11 = size; i11 < i10; i11++) {
                a(eVar, size - 1, eVarC, i11, 1);
            }
        }
        return eVarC;
    }

    public static boolean f(e eVar, e eVar2) {
        int size = eVar.size();
        if (size != eVar2.size()) {
            return false;
        }
        int iMin = Math.min(eVar.Rg(), eVar2.Rg());
        for (int i10 = 0; i10 < size; i10++) {
            for (int i11 = 0; i11 < iMin; i11++) {
                double dIj = eVar.ij(i10, i11);
                double dIj2 = eVar2.ij(i10, i11);
                if (eVar.ij(i10, i11) != eVar2.ij(i10, i11) && (!Double.isNaN(dIj) || !Double.isNaN(dIj2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(e eVar) {
        int size = eVar.size();
        if (size == 0) {
            return true;
        }
        if (size <= 3) {
            return false;
        }
        int i10 = size - 1;
        return eVar.ij(0, 0) == eVar.ij(i10, 0) && eVar.ij(0, 1) == eVar.ij(i10, 1);
    }

    public static void h(e eVar) {
        int size = eVar.size() - 1;
        int i10 = size / 2;
        for (int i11 = 0; i11 <= i10; i11++) {
            i(eVar, i11, size - i11);
        }
    }

    public static void i(e eVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        for (int i12 = 0; i12 < eVar.Rg(); i12++) {
            double dIj = eVar.ij(i10, i12);
            eVar.Ld(i10, i12, eVar.ij(i11, i12));
            eVar.Ld(i11, i12, dIj);
        }
    }

    public static String j(e eVar) {
        int size = eVar.size();
        if (size == 0) {
            return "()";
        }
        int iRg = eVar.Rg();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            for (int i11 = 0; i11 < iRg; i11++) {
                if (i11 > 0) {
                    sb2.append(",");
                }
                sb2.append(org.locationtech.jts.util.m.f(eVar.ij(i10, i11)));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
