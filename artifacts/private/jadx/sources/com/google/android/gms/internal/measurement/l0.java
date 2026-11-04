package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.models.AttributeType;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends w {
    protected l0() {
        this.f108934a.add(m0.ASSIGN);
        this.f108934a.add(m0.CONST);
        this.f108934a.add(m0.CREATE_ARRAY);
        this.f108934a.add(m0.CREATE_OBJECT);
        this.f108934a.add(m0.EXPRESSION_LIST);
        this.f108934a.add(m0.GET);
        this.f108934a.add(m0.GET_INDEX);
        this.f108934a.add(m0.GET_PROPERTY);
        this.f108934a.add(m0.NULL);
        this.f108934a.add(m0.SET_PROPERTY);
        this.f108934a.add(m0.TYPEOF);
        this.f108934a.add(m0.UNDEFINED);
        this.f108934a.add(m0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        String str2;
        m0 m0Var = m0.ADD;
        int iOrdinal = f6.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            f6.a(m0.ASSIGN.name(), 2, list);
            p pVarA = e5Var.a((p) list.get(0));
            if (!(pVarA instanceof t)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", pVarA.getClass().getCanonicalName()));
            }
            if (!e5Var.d(pVarA.h())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", pVarA.h()));
            }
            p pVarA2 = e5Var.a((p) list.get(1));
            e5Var.e(pVarA.h(), pVarA2);
            return pVarA2;
        }
        if (iOrdinal == 14) {
            f6.b(m0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                p pVarA3 = e5Var.a((p) list.get(i10));
                if (!(pVarA3 instanceof t)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", pVarA3.getClass().getCanonicalName()));
                }
                e5Var.g(pVarA3.h(), e5Var.a((p) list.get(i10 + 1)));
                i10 += 2;
            }
            return p.S1;
        }
        if (iOrdinal == 24) {
            f6.b(m0.EXPRESSION_LIST.name(), 1, list);
            p pVarA4 = p.S1;
            while (i10 < list.size()) {
                pVarA4 = e5Var.a((p) list.get(i10));
                if (pVarA4 instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return pVarA4;
        }
        if (iOrdinal == 33) {
            f6.a(m0.GET.name(), 1, list);
            p pVarA5 = e5Var.a((p) list.get(0));
            if (pVarA5 instanceof t) {
                return e5Var.h(pVarA5.h());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", pVarA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            f6.a(m0.NULL.name(), 0, list);
            return p.T1;
        }
        if (iOrdinal == 58) {
            f6.a(m0.SET_PROPERTY.name(), 3, list);
            p pVarA6 = e5Var.a((p) list.get(0));
            p pVarA7 = e5Var.a((p) list.get(1));
            p pVarA8 = e5Var.a((p) list.get(2));
            if (pVarA6 == p.S1 || pVarA6 == p.T1) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", pVarA7.h(), pVarA6.h()));
            }
            if ((pVarA6 instanceof f) && (pVarA7 instanceof i)) {
                ((f) pVarA6).w(pVarA7.m().intValue(), pVarA8);
                return pVarA8;
            }
            if (!(pVarA6 instanceof l)) {
                return pVarA8;
            }
            ((l) pVarA6).n(pVarA7.h(), pVarA8);
            return pVarA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p pVarA9 = e5Var.a((p) it.next());
                if (pVarA9 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.w(i10, pVarA9);
                i10++;
            }
            return fVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new m();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            m mVar = new m();
            while (i10 < list.size() - 1) {
                p pVarA10 = e5Var.a((p) list.get(i10));
                p pVarA11 = e5Var.a((p) list.get(i10 + 1));
                if ((pVarA10 instanceof h) || (pVarA11 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                mVar.n(pVarA10.h(), pVarA11);
                i10 += 2;
            }
            return mVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            f6.a(m0.GET_PROPERTY.name(), 2, list);
            p pVarA12 = e5Var.a((p) list.get(0));
            p pVarA13 = e5Var.a((p) list.get(1));
            if ((pVarA12 instanceof f) && f6.d(pVarA13)) {
                return ((f) pVarA12).v(pVarA13.m().intValue());
            }
            if (pVarA12 instanceof l) {
                return ((l) pVarA12).i(pVarA13.h());
            }
            if (pVarA12 instanceof t) {
                if (io.sentry.n7.b.f305917e.equals(pVarA13.h())) {
                    return new i(Double.valueOf(pVarA12.h().length()));
                }
                if (f6.d(pVarA13) && pVarA13.m().doubleValue() < pVarA12.h().length()) {
                    return new t(String.valueOf(pVarA12.h().charAt(pVarA13.m().intValue())));
                }
            }
            return p.S1;
        }
        switch (iOrdinal) {
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                f6.a(m0.TYPEOF.name(), 1, list);
                p pVarA14 = e5Var.a((p) list.get(0));
                if (pVarA14 instanceof u) {
                    str2 = "undefined";
                } else if (pVarA14 instanceof g) {
                    str2 = "boolean";
                } else if (pVarA14 instanceof i) {
                    str2 = AttributeType.NUMBER;
                } else if (pVarA14 instanceof t) {
                    str2 = androidx.constraintlayout.core.motion.utils.v.b.f43988e;
                } else if (pVarA14 instanceof o) {
                    str2 = io.sentry.protocol.z.b.f306535b;
                } else {
                    if ((pVarA14 instanceof q) || (pVarA14 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", pVarA14));
                    }
                    str2 = "object";
                }
                return new t(str2);
            case 63:
                f6.a(m0.UNDEFINED.name(), 0, list);
                return p.S1;
            case 64:
                f6.b(m0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    p pVarA15 = e5Var.a((p) it2.next());
                    if (!(pVarA15 instanceof t)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", pVarA15.getClass().getCanonicalName()));
                    }
                    e5Var.f(pVarA15.h(), p.S1);
                }
                return p.S1;
            default:
                return super.b(str);
        }
    }
}
