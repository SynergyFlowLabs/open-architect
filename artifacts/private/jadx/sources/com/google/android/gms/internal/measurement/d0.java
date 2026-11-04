package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends w {
    protected d0() {
        this.f108934a.add(m0.AND);
        this.f108934a.add(m0.NOT);
        this.f108934a.add(m0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        m0 m0Var = m0.ADD;
        int iOrdinal = f6.e(str).ordinal();
        if (iOrdinal == 1) {
            f6.a(m0.AND.name(), 2, list);
            p pVarA = e5Var.a((p) list.get(0));
            return pVarA.j().booleanValue() ? e5Var.a((p) list.get(1)) : pVarA;
        }
        if (iOrdinal == 47) {
            f6.a(m0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!e5Var.a((p) list.get(0)).j().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        f6.a(m0.OR.name(), 2, list);
        p pVarA2 = e5Var.a((p) list.get(0));
        if (!pVarA2.j().booleanValue()) {
            pVarA2 = e5Var.a((p) list.get(1));
        }
        return pVarA2;
    }
}
