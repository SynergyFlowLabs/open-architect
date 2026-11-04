package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {
    public static p a(String str, f fVar, e5 e5Var, List list) {
        byte b10;
        double dI;
        double d10;
        double dT;
        f fVar2;
        f fVar3;
        Double dValueOf = Double.valueOf(-1.0d);
        switch (str) {
            case "toString":
                b10 = com.google.common.base.c.f116468u;
                break;
            case "concat":
                b10 = 0;
                break;
            case "filter":
                b10 = 2;
                break;
            case "reduce":
                b10 = 10;
                break;
            case "splice":
                b10 = 17;
                break;
            case "forEach":
                b10 = 3;
                break;
            case "lastIndexOf":
                b10 = 6;
                break;
            case "unshift":
                b10 = 19;
                break;
            case "map":
                b10 = 7;
                break;
            case "pop":
                b10 = 8;
                break;
            case "join":
                b10 = 5;
                break;
            case "push":
                b10 = 9;
                break;
            case "some":
                b10 = com.google.common.base.c.f116464q;
                break;
            case "sort":
                b10 = com.google.common.base.c.f116465r;
                break;
            case "every":
                b10 = 1;
                break;
            case "shift":
                b10 = com.google.common.base.c.f116462o;
                break;
            case "slice":
                b10 = com.google.common.base.c.f116463p;
                break;
            case "reduceRight":
                b10 = 11;
                break;
            case "reverse":
                b10 = com.google.common.base.c.f116461n;
                break;
            case "indexOf":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        String strH = ",";
        j jVar = null;
        switch (b10) {
            case 0:
                f fVar4 = (f) fVar.Y();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        p pVarA = e5Var.a((p) it.next());
                        if (pVarA instanceof h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iT = fVar4.t();
                        if (pVarA instanceof f) {
                            f fVar5 = (f) pVarA;
                            Iterator itS = fVar5.s();
                            while (itS.hasNext()) {
                                Integer num = (Integer) itS.next();
                                fVar4.w(num.intValue() + iT, fVar5.v(num.intValue()));
                            }
                        } else {
                            fVar4.w(iT, pVarA);
                        }
                    }
                }
                return fVar4;
            case 1:
                f6.a("every", 1, list);
                p pVarA2 = e5Var.a((p) list.get(0));
                if (!(pVarA2 instanceof o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.t() != 0 && c(fVar, e5Var, (o) pVarA2, Boolean.FALSE, Boolean.TRUE).t() != fVar.t()) {
                    return p.Y1;
                }
                return p.X1;
            case 2:
                f6.a("filter", 1, list);
                p pVarA3 = e5Var.a((p) list.get(0));
                if (!(pVarA3 instanceof o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.u() == 0) {
                    return new f();
                }
                f fVar6 = (f) fVar.Y();
                f fVarC = c(fVar, e5Var, (o) pVarA3, null, Boolean.TRUE);
                f fVar7 = new f();
                Iterator itS2 = fVarC.s();
                while (itS2.hasNext()) {
                    fVar7.w(fVar7.t(), fVar6.v(((Integer) itS2.next()).intValue()));
                }
                return fVar7;
            case 3:
                f6.a("forEach", 1, list);
                p pVarA4 = e5Var.a((p) list.get(0));
                if (!(pVarA4 instanceof o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.u() == 0) {
                    return p.S1;
                }
                c(fVar, e5Var, (o) pVarA4, null, null);
                return p.S1;
            case 4:
                f6.c("indexOf", 2, list);
                p pVarA5 = p.S1;
                if (!list.isEmpty()) {
                    pVarA5 = e5Var.a((p) list.get(0));
                }
                if (list.size() > 1) {
                    dI = f6.i(e5Var.a((p) list.get(1)).m().doubleValue());
                    if (dI >= fVar.t()) {
                        return new i(dValueOf);
                    }
                    if (dI < 0.0d) {
                        dI += (double) fVar.t();
                    }
                } else {
                    dI = 0.0d;
                }
                Iterator itS3 = fVar.s();
                while (itS3.hasNext()) {
                    int iIntValue = ((Integer) itS3.next()).intValue();
                    double d11 = iIntValue;
                    if (d11 >= dI && f6.f(fVar.v(iIntValue), pVarA5)) {
                        return new i(Double.valueOf(d11));
                    }
                }
                return new i(dValueOf);
            case 5:
                f6.c("join", 1, list);
                if (fVar.t() == 0) {
                    return p.Z1;
                }
                if (!list.isEmpty()) {
                    p pVarA6 = e5Var.a((p) list.get(0));
                    strH = ((pVarA6 instanceof n) || (pVarA6 instanceof u)) ? "" : pVarA6.h();
                }
                return new t(fVar.F(strH));
            case 6:
                f6.c("lastIndexOf", 2, list);
                p pVarA7 = p.S1;
                if (!list.isEmpty()) {
                    pVarA7 = e5Var.a((p) list.get(0));
                }
                int iT2 = fVar.t() - 1;
                if (list.size() > 1) {
                    p pVarA8 = e5Var.a((p) list.get(1));
                    dT = Double.isNaN(pVarA8.m().doubleValue()) ? fVar.t() - 1 : f6.i(pVarA8.m().doubleValue());
                    d10 = 0.0d;
                    if (dT < 0.0d) {
                        dT += (double) fVar.t();
                    }
                } else {
                    d10 = 0.0d;
                    dT = iT2;
                }
                if (dT < d10) {
                    return new i(dValueOf);
                }
                for (int iMin = (int) Math.min(fVar.t(), dT); iMin >= 0; iMin--) {
                    if (fVar.A(iMin) && f6.f(fVar.v(iMin), pVarA7)) {
                        return new i(Double.valueOf(iMin));
                    }
                }
                return new i(dValueOf);
            case 7:
                f6.a("map", 1, list);
                p pVarA9 = e5Var.a((p) list.get(0));
                if (pVarA9 instanceof o) {
                    return fVar.t() == 0 ? new f() : c(fVar, e5Var, (o) pVarA9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                f6.a("pop", 0, list);
                int iT3 = fVar.t();
                if (iT3 == 0) {
                    return p.S1;
                }
                int i10 = iT3 - 1;
                p pVarV = fVar.v(i10);
                fVar.D(i10);
                return pVarV;
            case 9:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        fVar.w(fVar.t(), e5Var.a((p) it2.next()));
                    }
                }
                return new i(Double.valueOf(fVar.t()));
            case 10:
                return b(fVar, e5Var, list, true);
            case 11:
                return b(fVar, e5Var, list, false);
            case 12:
                fVar2 = fVar;
                f6.a("reverse", 0, list);
                int iT4 = fVar2.t();
                if (iT4 != 0) {
                    for (int i11 = 0; i11 < iT4 / 2; i11++) {
                        if (fVar2.A(i11)) {
                            p pVarV2 = fVar2.v(i11);
                            fVar2.w(i11, null);
                            int i12 = (iT4 - 1) - i11;
                            if (fVar2.A(i12)) {
                                fVar2.w(i11, fVar2.v(i12));
                            }
                            fVar2.w(i12, pVarV2);
                        }
                    }
                }
                return fVar2;
            case 13:
                f6.a("shift", 0, list);
                if (fVar.t() == 0) {
                    return p.S1;
                }
                p pVarV3 = fVar.v(0);
                fVar.D(0);
                return pVarV3;
            case 14:
                f6.c("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.Y();
                }
                double dT2 = fVar.t();
                double dI2 = f6.i(e5Var.a((p) list.get(0)).m().doubleValue());
                double dMax = dI2 < 0.0d ? Math.max(dI2 + dT2, 0.0d) : Math.min(dI2, dT2);
                if (list.size() == 2) {
                    double dI3 = f6.i(e5Var.a((p) list.get(1)).m().doubleValue());
                    dT2 = dI3 < 0.0d ? Math.max(dT2 + dI3, 0.0d) : Math.min(dT2, dI3);
                }
                f fVar8 = new f();
                for (int i13 = (int) dMax; i13 < dT2; i13++) {
                    fVar8.w(fVar8.t(), fVar.v(i13));
                }
                return fVar8;
            case 15:
                f6.a("some", 1, list);
                p pVarA10 = e5Var.a((p) list.get(0));
                if (!(pVarA10 instanceof j)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.t() == 0) {
                    return p.Y1;
                }
                j jVar2 = (j) pVarA10;
                Iterator itS4 = fVar.s();
                while (itS4.hasNext()) {
                    int iIntValue2 = ((Integer) itS4.next()).intValue();
                    if (fVar.A(iIntValue2) && jVar2.a(e5Var, Arrays.asList(fVar.v(iIntValue2), new i(Double.valueOf(iIntValue2)), fVar)).j().booleanValue()) {
                        return p.X1;
                    }
                }
                return p.Y1;
            case 16:
                fVar2 = fVar;
                f6.c("sort", 1, list);
                if (fVar2.t() >= 2) {
                    List listR = fVar2.r();
                    if (!list.isEmpty()) {
                        p pVarA11 = e5Var.a((p) list.get(0));
                        if (!(pVarA11 instanceof j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        jVar = (j) pVarA11;
                    }
                    Collections.sort(listR, new a0(jVar, e5Var));
                    fVar2.B();
                    Iterator it3 = listR.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        fVar2.w(i14, (p) it3.next());
                        i14++;
                    }
                }
                return fVar2;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int i15 = (int) f6.i(e5Var.a((p) list.get(0)).m().doubleValue());
                if (i15 < 0) {
                    i15 = Math.max(0, i15 + fVar.t());
                } else if (i15 > fVar.t()) {
                    i15 = fVar.t();
                }
                int iT5 = fVar.t();
                f fVar9 = new f();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) f6.i(e5Var.a((p) list.get(1)).m().doubleValue()));
                    if (iMax > 0) {
                        for (int i16 = i15; i16 < Math.min(iT5, i15 + iMax); i16++) {
                            fVar9.w(fVar9.t(), fVar.v(i15));
                            fVar.D(i15);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i17 = 2; i17 < list.size(); i17++) {
                            p pVarA12 = e5Var.a((p) list.get(i17));
                            if (pVarA12 instanceof h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            fVar.C((i15 + i17) - 2, pVarA12);
                        }
                    }
                } else {
                    while (i15 < iT5) {
                        fVar9.w(fVar9.t(), fVar.v(i15));
                        fVar.w(i15, null);
                        i15++;
                    }
                }
                return fVar9;
            case 18:
                f6.a("toString", 0, list);
                return new t(fVar.F(","));
            case 19:
                if (list.isEmpty()) {
                    fVar3 = fVar;
                } else {
                    f fVar10 = new f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        p pVarA13 = e5Var.a((p) it4.next());
                        if (pVarA13 instanceof h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        fVar10.w(fVar10.t(), pVarA13);
                    }
                    int iT6 = fVar10.t();
                    Iterator itS5 = fVar.s();
                    while (itS5.hasNext()) {
                        Integer num2 = (Integer) itS5.next();
                        fVar10.w(num2.intValue() + iT6, fVar.v(num2.intValue()));
                    }
                    fVar3 = fVar;
                    fVar3.B();
                    Iterator itS6 = fVar10.s();
                    while (itS6.hasNext()) {
                        Integer num3 = (Integer) itS6.next();
                        fVar3.w(num3.intValue(), fVar10.v(num3.intValue()));
                    }
                }
                return new i(Double.valueOf(fVar3.t()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static p b(f fVar, e5 e5Var, List list, boolean z10) {
        p pVarA;
        f6.b("reduce", 1, list);
        f6.c("reduce", 2, list);
        p pVarA2 = e5Var.a((p) list.get(0));
        if (!(pVarA2 instanceof j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            pVarA = e5Var.a((p) list.get(1));
            if (pVarA instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            pVarA = null;
        }
        j jVar = (j) pVarA2;
        int iT = fVar.t();
        int i10 = z10 ? 0 : iT - 1;
        int i11 = z10 ? iT - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (pVarA == null) {
            pVarA = fVar.v(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (fVar.A(i10)) {
                pVarA = jVar.a(e5Var, Arrays.asList(pVarA, fVar.v(i10), new i(Double.valueOf(i10)), fVar));
                if (pVarA instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return pVarA;
    }

    private static f c(f fVar, e5 e5Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator itS = fVar.s();
        while (itS.hasNext()) {
            int iIntValue = ((Integer) itS.next()).intValue();
            if (fVar.A(iIntValue)) {
                p pVarA = jVar.a(e5Var, Arrays.asList(fVar.v(iIntValue), new i(Double.valueOf(iIntValue)), fVar));
                if (pVarA.j().equals(bool)) {
                    break;
                }
                if (bool2 == null || pVarA.j().equals(bool2)) {
                    fVar2.w(iIntValue, pVarA);
                }
            }
        }
        return fVar2;
    }
}
