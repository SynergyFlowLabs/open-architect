package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends w {
    protected j0() {
        this.f108934a.add(m0.ADD);
        this.f108934a.add(m0.DIVIDE);
        this.f108934a.add(m0.MODULUS);
        this.f108934a.add(m0.MULTIPLY);
        this.f108934a.add(m0.NEGATE);
        this.f108934a.add(m0.POST_DECREMENT);
        this.f108934a.add(m0.POST_INCREMENT);
        this.f108934a.add(m0.PRE_DECREMENT);
        this.f108934a.add(m0.PRE_INCREMENT);
        this.f108934a.add(m0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        m0 m0Var = m0.ADD;
        int iOrdinal = f6.e(str).ordinal();
        if (iOrdinal == 0) {
            f6.a(m0Var.name(), 2, list);
            p pVarA = e5Var.a((p) list.get(0));
            p pVarA2 = e5Var.a((p) list.get(1));
            if (!(pVarA instanceof l) && !(pVarA instanceof t) && !(pVarA2 instanceof l) && !(pVarA2 instanceof t)) {
                return new i(Double.valueOf(pVarA.m().doubleValue() + pVarA2.m().doubleValue()));
            }
            return new t(String.valueOf(pVarA.h()).concat(String.valueOf(pVarA2.h())));
        }
        if (iOrdinal == 21) {
            f6.a(m0.DIVIDE.name(), 2, list);
            return new i(Double.valueOf(e5Var.a((p) list.get(0)).m().doubleValue() / e5Var.a((p) list.get(1)).m().doubleValue()));
        }
        if (iOrdinal == 59) {
            f6.a(m0.SUBTRACT.name(), 2, list);
            return new i(Double.valueOf(e5Var.a((p) list.get(0)).m().doubleValue() + new i(Double.valueOf(-e5Var.a((p) list.get(1)).m().doubleValue())).m().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            f6.a(str, 2, list);
            p pVarA3 = e5Var.a((p) list.get(0));
            e5Var.a((p) list.get(1));
            return pVarA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            f6.a(str, 1, list);
            return e5Var.a((p) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                f6.a(m0.MODULUS.name(), 2, list);
                return new i(Double.valueOf(e5Var.a((p) list.get(0)).m().doubleValue() % e5Var.a((p) list.get(1)).m().doubleValue()));
            case 45:
                f6.a(m0.MULTIPLY.name(), 2, list);
                return new i(Double.valueOf(e5Var.a((p) list.get(0)).m().doubleValue() * e5Var.a((p) list.get(1)).m().doubleValue()));
            case 46:
                f6.a(m0.NEGATE.name(), 1, list);
                return new i(Double.valueOf(-e5Var.a((p) list.get(0)).m().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
