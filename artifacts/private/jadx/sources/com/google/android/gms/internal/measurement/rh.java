package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final TreeMap f108785a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final TreeMap f108786b = new TreeMap();

    private static final int c(e5 e5Var, o oVar, p pVar) {
        p pVarA = oVar.a(e5Var, Collections.singletonList(pVar));
        if (pVarA instanceof i) {
            return f6.g(pVarA.m().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, o oVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f108786b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f108785a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), oVar);
    }

    public final void b(e5 e5Var, c cVar) {
        ja jaVar = new ja(cVar);
        TreeMap treeMap = this.f108785a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = cVar.c().clone();
            int iC = c(e5Var, (o) treeMap.get(num), jaVar);
            if (iC == 2 || iC == -1) {
                cVar.d(bVarClone);
            }
        }
        TreeMap treeMap2 = this.f108786b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(e5Var, (o) treeMap2.get((Integer) it.next()), jaVar);
        }
    }
}
