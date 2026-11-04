package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends w {
    public y() {
        this.f108934a.add(m0.EQUALS);
        this.f108934a.add(m0.GREATER_THAN);
        this.f108934a.add(m0.GREATER_THAN_EQUALS);
        this.f108934a.add(m0.IDENTITY_EQUALS);
        this.f108934a.add(m0.IDENTITY_NOT_EQUALS);
        this.f108934a.add(m0.LESS_THAN);
        this.f108934a.add(m0.LESS_THAN_EQUALS);
        this.f108934a.add(m0.NOT_EQUALS);
    }

    private static boolean c(p pVar, p pVar2) {
        if (pVar instanceof l) {
            pVar = new t(pVar.h());
        }
        if (pVar2 instanceof l) {
            pVar2 = new t(pVar2.h());
        }
        if ((pVar instanceof t) && (pVar2 instanceof t)) {
            return pVar.h().compareTo(pVar2.h()) < 0;
        }
        double dDoubleValue = pVar.m().doubleValue();
        double dDoubleValue2 = pVar2.m().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(p pVar, p pVar2) {
        if (pVar.getClass().equals(pVar2.getClass())) {
            if ((pVar instanceof u) || (pVar instanceof n)) {
                return true;
            }
            if (pVar instanceof i) {
                return (Double.isNaN(pVar.m().doubleValue()) || Double.isNaN(pVar2.m().doubleValue()) || pVar.m().doubleValue() != pVar2.m().doubleValue()) ? false : true;
            }
            if (pVar instanceof t) {
                return pVar.h().equals(pVar2.h());
            }
            if (pVar instanceof g) {
                return pVar.j().equals(pVar2.j());
            }
            return pVar == pVar2;
        }
        if (((pVar instanceof u) || (pVar instanceof n)) && ((pVar2 instanceof u) || (pVar2 instanceof n))) {
            return true;
        }
        boolean z10 = pVar instanceof i;
        if (z10 && (pVar2 instanceof t)) {
            return d(pVar, new i(pVar2.m()));
        }
        boolean z11 = pVar instanceof t;
        if ((!z11 || !(pVar2 instanceof i)) && !(pVar instanceof g)) {
            if (pVar2 instanceof g) {
                return d(pVar, new i(pVar2.m()));
            }
            if ((z11 || z10) && (pVar2 instanceof l)) {
                return d(pVar, new t(pVar2.h()));
            }
            if ((pVar instanceof l) && ((pVar2 instanceof t) || (pVar2 instanceof i))) {
                return d(new t(pVar.h()), pVar2);
            }
            return false;
        }
        return d(new i(pVar.m()), pVar2);
    }

    private static boolean e(p pVar, p pVar2) {
        if (pVar instanceof l) {
            pVar = new t(pVar.h());
        }
        if (pVar2 instanceof l) {
            pVar2 = new t(pVar2.h());
        }
        return (((pVar instanceof t) && (pVar2 instanceof t)) || !(Double.isNaN(pVar.m().doubleValue()) || Double.isNaN(pVar2.m().doubleValue()))) && !c(pVar2, pVar);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        boolean zD;
        boolean zD2;
        f6.a(f6.e(str).name(), 2, list);
        p pVarA = e5Var.a((p) list.get(0));
        p pVarA2 = e5Var.a((p) list.get(1));
        int iOrdinal = f6.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(pVarA, pVarA2);
            } else if (iOrdinal == 42) {
                zD = c(pVarA, pVarA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(pVarA2, pVarA);
                        break;
                    case 38:
                        zD = e(pVarA2, pVarA);
                        break;
                    case 39:
                        zD = f6.f(pVarA, pVarA2);
                        break;
                    case 40:
                        zD2 = f6.f(pVarA, pVarA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zD = e(pVarA, pVarA2);
            }
            zD = !zD2;
        } else {
            zD = d(pVarA, pVarA2);
        }
        return zD ? p.X1 : p.Y1;
    }
}
