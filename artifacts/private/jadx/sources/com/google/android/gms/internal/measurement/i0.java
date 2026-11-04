package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends w {
    protected i0() {
        this.f108934a.add(m0.FOR_IN);
        this.f108934a.add(m0.FOR_IN_CONST);
        this.f108934a.add(m0.FOR_IN_LET);
        this.f108934a.add(m0.FOR_LET);
        this.f108934a.add(m0.FOR_OF);
        this.f108934a.add(m0.FOR_OF_CONST);
        this.f108934a.add(m0.FOR_OF_LET);
        this.f108934a.add(m0.WHILE);
    }

    private static p c(g0 g0Var, p pVar, p pVar2) {
        return e(g0Var, pVar.c(), pVar2);
    }

    private static p d(g0 g0Var, p pVar, p pVar2) {
        if (pVar instanceof Iterable) {
            return e(g0Var, ((Iterable) pVar).iterator(), pVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static p e(g0 g0Var, Iterator it, p pVar) {
        if (it != null) {
            while (it.hasNext()) {
                p pVarB = g0Var.a((p) it.next()).b((f) pVar);
                if (pVarB instanceof h) {
                    h hVar = (h) pVarB;
                    if ("break".equals(hVar.b())) {
                        return p.S1;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
        }
        return p.S1;
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        m0 m0Var = m0.ADD;
        int iOrdinal = f6.e(str).ordinal();
        if (iOrdinal == 65) {
            f6.a(m0.WHILE.name(), 4, list);
            p pVar = (p) list.get(0);
            p pVar2 = (p) list.get(1);
            p pVar3 = (p) list.get(2);
            p pVarA = e5Var.a((p) list.get(3));
            if (e5Var.a(pVar3).j().booleanValue()) {
                p pVarB = e5Var.b((f) pVarA);
                if (pVarB instanceof h) {
                    h hVar = (h) pVarB;
                    if ("break".equals(hVar.b())) {
                        return p.S1;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
            while (e5Var.a(pVar).j().booleanValue()) {
                p pVarB2 = e5Var.b((f) pVarA);
                if (pVarB2 instanceof h) {
                    h hVar2 = (h) pVarB2;
                    if ("break".equals(hVar2.b())) {
                        return p.S1;
                    }
                    if ("return".equals(hVar2.b())) {
                        return hVar2;
                    }
                }
                e5Var.a(pVar2);
            }
            return p.S1;
        }
        switch (iOrdinal) {
            case 26:
                f6.a(m0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new h0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            case 27:
                f6.a(m0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new e0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            case 28:
                f6.a(m0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new f0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            case 29:
                f6.a(m0.FOR_LET.name(), 4, list);
                p pVarA2 = e5Var.a((p) list.get(0));
                if (!(pVarA2 instanceof f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                f fVar = (f) pVarA2;
                p pVar4 = (p) list.get(1);
                p pVar5 = (p) list.get(2);
                p pVarA3 = e5Var.a((p) list.get(3));
                e5 e5VarC = e5Var.c();
                for (int i10 = 0; i10 < fVar.t(); i10++) {
                    String strH = fVar.v(i10).h();
                    e5VarC.e(strH, e5Var.h(strH));
                }
                while (e5Var.a(pVar4).j().booleanValue()) {
                    p pVarB3 = e5Var.b((f) pVarA3);
                    if (pVarB3 instanceof h) {
                        h hVar3 = (h) pVarB3;
                        if ("break".equals(hVar3.b())) {
                            return p.S1;
                        }
                        if ("return".equals(hVar3.b())) {
                            return hVar3;
                        }
                    }
                    e5 e5VarC2 = e5Var.c();
                    for (int i11 = 0; i11 < fVar.t(); i11++) {
                        String strH2 = fVar.v(i11).h();
                        e5VarC2.e(strH2, e5VarC.h(strH2));
                    }
                    e5VarC2.a(pVar5);
                    e5VarC = e5VarC2;
                }
                return p.S1;
            case 30:
                f6.a(m0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new h0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            case 31:
                f6.a(m0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new e0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            case 32:
                f6.a(m0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new f0(e5Var, ((p) list.get(0)).h()), e5Var.a((p) list.get(1)), e5Var.a((p) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
