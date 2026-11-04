package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface l {
    static p d(l lVar, p pVar, e5 e5Var, List list) {
        if (lVar.l(pVar.h())) {
            p pVarI = lVar.i(pVar.h());
            if (pVarI instanceof j) {
                return ((j) pVarI).a(e5Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", pVar.h()));
        }
        if (!"hasOwnProperty".equals(pVar.h())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", pVar.h()));
        }
        f6.a("hasOwnProperty", 1, list);
        return lVar.l(e5Var.a((p) list.get(0)).h()) ? p.X1 : p.Y1;
    }

    static Iterator k(Map map) {
        return new k(map.keySet().iterator());
    }

    p i(String str);

    boolean l(String str);

    void n(String str, p pVar);
}
