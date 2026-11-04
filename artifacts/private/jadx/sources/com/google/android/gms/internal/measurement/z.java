package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends w {
    protected z() {
        this.f108934a.add(m0.APPLY);
        this.f108934a.add(m0.BLOCK);
        this.f108934a.add(m0.BREAK);
        this.f108934a.add(m0.CASE);
        this.f108934a.add(m0.DEFAULT);
        this.f108934a.add(m0.CONTINUE);
        this.f108934a.add(m0.DEFINE_FUNCTION);
        this.f108934a.add(m0.FN);
        this.f108934a.add(m0.IF);
        this.f108934a.add(m0.QUOTE);
        this.f108934a.add(m0.RETURN);
        this.f108934a.add(m0.SWITCH);
        this.f108934a.add(m0.TERNARY);
    }

    private static p c(e5 e5Var, List list) {
        f6.b(m0.FN.name(), 2, list);
        p pVarA = e5Var.a((p) list.get(0));
        p pVarA2 = e5Var.a((p) list.get(1));
        if (!(pVarA2 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", pVarA2.getClass().getCanonicalName()));
        }
        List listR = ((f) pVarA2).r();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new o(pVarA.h(), listR, arrayList, e5Var);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        m0 m0Var = m0.ADD;
        int iOrdinal = f6.e(str).ordinal();
        if (iOrdinal == 2) {
            f6.a(m0.APPLY.name(), 3, list);
            p pVarA = e5Var.a((p) list.get(0));
            String strH = e5Var.a((p) list.get(1)).h();
            p pVarA2 = e5Var.a((p) list.get(2));
            if (!(pVarA2 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", pVarA2.getClass().getCanonicalName()));
            }
            if (strH.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return pVarA.p(strH, e5Var, ((f) pVarA2).r());
        }
        if (iOrdinal == 15) {
            f6.a(m0.BREAK.name(), 0, list);
            return p.U1;
        }
        if (iOrdinal == 25) {
            return c(e5Var, list);
        }
        if (iOrdinal == 41) {
            f6.b(m0.IF.name(), 2, list);
            p pVarA3 = e5Var.a((p) list.get(0));
            p pVarA4 = e5Var.a((p) list.get(1));
            p pVarA5 = list.size() > 2 ? e5Var.a((p) list.get(2)) : null;
            p pVar = p.S1;
            p pVarB = pVarA3.j().booleanValue() ? e5Var.b((f) pVarA4) : pVarA5 != null ? e5Var.b((f) pVarA5) : pVar;
            return true != (pVarB instanceof h) ? pVar : pVarB;
        }
        if (iOrdinal == 54) {
            return new f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return p.W1;
            }
            f6.a(m0.RETURN.name(), 1, list);
            return new h("return", e5Var.a((p) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                f6.b(m0.DEFINE_FUNCTION.name(), 2, list);
                o oVar = (o) c(e5Var, list);
                if (oVar.b() == null) {
                    e5Var.e("", oVar);
                    return oVar;
                }
                e5Var.e(oVar.b(), oVar);
                return oVar;
            }
            if (iOrdinal == 60) {
                f6.a(m0.SWITCH.name(), 3, list);
                p pVarA6 = e5Var.a((p) list.get(0));
                p pVarA7 = e5Var.a((p) list.get(1));
                p pVarA8 = e5Var.a((p) list.get(2));
                if (!(pVarA7 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(pVarA8 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) pVarA7;
                f fVar2 = (f) pVarA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < fVar.t(); i10++) {
                    if (z10 || pVarA6.equals(e5Var.a(fVar.v(i10)))) {
                        p pVarA9 = e5Var.a(fVar2.v(i10));
                        if (pVarA9 instanceof h) {
                            return ((h) pVarA9).b().equals("break") ? p.S1 : pVarA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (fVar.t() + 1 == fVar2.t()) {
                    p pVarA10 = e5Var.a(fVar2.v(fVar.t()));
                    if (pVarA10 instanceof h) {
                        String strB = ((h) pVarA10).b();
                        if (strB.equals("return") || strB.equals(ActionType.CONTINUE)) {
                            return pVarA10;
                        }
                    }
                }
                return p.S1;
            }
            if (iOrdinal == 61) {
                f6.a(m0.TERNARY.name(), 3, list);
                return e5Var.a((p) list.get(0)).j().booleanValue() ? e5Var.a((p) list.get(1)) : e5Var.a((p) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return e5Var.c().b(new f(list));
                case 12:
                    f6.a(m0.BREAK.name(), 0, list);
                    return p.V1;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return p.S1;
        }
        p pVarA11 = e5Var.a((p) list.get(0));
        return pVarA11 instanceof f ? e5Var.b((f) pVarA11) : p.S1;
    }
}
