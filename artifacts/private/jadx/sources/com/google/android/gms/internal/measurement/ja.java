package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ja extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f108586b;

    public ja(c cVar) {
        this.f108586b = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    @Override // com.google.android.gms.internal.measurement.m, com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        byte b10;
        switch (str) {
            case "getEventName":
                b10 = 0;
                break;
            case "getTimestamp":
                b10 = 3;
                break;
            case "getParamValue":
                b10 = 1;
                break;
            case "getParams":
                b10 = 2;
                break;
            case "setParamValue":
                b10 = 5;
                break;
            case "setEventName":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            f6.a("getEventName", 0, list);
            return new t(this.f108586b.c().b());
        }
        if (b10 == 1) {
            f6.a("getParamValue", 1, list);
            return g7.a(this.f108586b.c().e(e5Var.a((p) list.get(0)).h()));
        }
        if (b10 == 2) {
            f6.a("getParams", 0, list);
            Map mapF = this.f108586b.c().f();
            m mVar = new m();
            for (String str2 : mapF.keySet()) {
                mVar.n(str2, g7.a(mapF.get(str2)));
            }
            return mVar;
        }
        if (b10 == 3) {
            f6.a("getTimestamp", 0, list);
            return new i(Double.valueOf(this.f108586b.c().a()));
        }
        if (b10 != 4) {
            if (b10 != 5) {
                return super.p(str, e5Var, list);
            }
            f6.a("setParamValue", 2, list);
            String strH = e5Var.a((p) list.get(0)).h();
            p pVarA = e5Var.a((p) list.get(1));
            this.f108586b.c().d(strH, f6.j(pVarA));
            return pVarA;
        }
        f6.a("setEventName", 1, list);
        p pVarA2 = e5Var.a((p) list.get(0));
        if (p.S1.equals(pVarA2) || p.T1.equals(pVarA2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.f108586b.c().c(pVarA2.h());
        return new t(pVarA2.h());
    }
}
