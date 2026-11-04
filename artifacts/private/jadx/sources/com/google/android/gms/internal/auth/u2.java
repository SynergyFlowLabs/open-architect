package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class u2 implements Comparator {
    u2() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        d3 d3Var = (d3) obj;
        d3 d3Var2 = (d3) obj2;
        t2 t2Var = new t2(d3Var);
        t2 t2Var2 = new t2(d3Var2);
        while (t2Var.hasNext() && t2Var2.hasNext()) {
            int iCompareTo = Integer.valueOf(t2Var.a() & 255).compareTo(Integer.valueOf(t2Var2.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(d3Var.i()).compareTo(Integer.valueOf(d3Var2.i()));
    }
}
