package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends w {
    @Override // com.google.android.gms.internal.measurement.w
    public final p a(String str, e5 e5Var, List list) {
        if (str == null || str.isEmpty() || !e5Var.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        p pVarH = e5Var.h(str);
        if (pVarH instanceof j) {
            return ((j) pVarH).a(e5Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
