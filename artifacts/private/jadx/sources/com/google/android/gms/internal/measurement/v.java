package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends w {
    public v() {
        this.f108934a.add(m0.BITWISE_AND);
        this.f108934a.add(m0.BITWISE_LEFT_SHIFT);
        this.f108934a.add(m0.BITWISE_NOT);
        this.f108934a.add(m0.BITWISE_OR);
        this.f108934a.add(m0.BITWISE_RIGHT_SHIFT);
        this.f108934a.add(m0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f108934a.add(m0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        m0 m0Var = m0.ADD;
        switch (f6.e(str).ordinal()) {
            case 4:
                f6.a(m0.BITWISE_AND.name(), 2, list);
                return new i(Double.valueOf(f6.g(e5Var.a((p) list.get(0)).m().doubleValue()) & f6.g(e5Var.a((p) list.get(1)).m().doubleValue())));
            case 5:
                f6.a(m0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(f6.g(e5Var.a((p) list.get(0)).m().doubleValue()) << ((int) (f6.h(e5Var.a((p) list.get(1)).m().doubleValue()) & 31))));
            case 6:
                f6.a(m0.BITWISE_NOT.name(), 1, list);
                return new i(Double.valueOf(~f6.g(e5Var.a((p) list.get(0)).m().doubleValue())));
            case 7:
                f6.a(m0.BITWISE_OR.name(), 2, list);
                return new i(Double.valueOf(f6.g(e5Var.a((p) list.get(0)).m().doubleValue()) | f6.g(e5Var.a((p) list.get(1)).m().doubleValue())));
            case 8:
                f6.a(m0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(f6.g(e5Var.a((p) list.get(0)).m().doubleValue()) >> ((int) (f6.h(e5Var.a((p) list.get(1)).m().doubleValue()) & 31))));
            case 9:
                f6.a(m0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(f6.h(e5Var.a((p) list.get(0)).m().doubleValue()) >>> ((int) (f6.h(e5Var.a((p) list.get(1)).m().doubleValue()) & 31))));
            case 10:
                f6.a(m0.BITWISE_XOR.name(), 2, list);
                return new i(Double.valueOf(f6.g(e5Var.a((p) list.get(0)).m().doubleValue()) ^ f6.g(e5Var.a((p) list.get(1)).m().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
