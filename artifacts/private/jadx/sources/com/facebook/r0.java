package com.facebook;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum r0 {
    GET,
    POST,
    DELETE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static r0[] valuesCustom() {
        r0[] r0VarArrValuesCustom = values();
        return (r0[]) Arrays.copyOf(r0VarArrValuesCustom, r0VarArrValuesCustom.length);
    }
}
