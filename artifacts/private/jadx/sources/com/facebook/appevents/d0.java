package com.facebook.appevents;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum d0 {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static d0[] valuesCustom() {
        d0[] d0VarArrValuesCustom = values();
        return (d0[]) Arrays.copyOf(d0VarArrValuesCustom, d0VarArrValuesCustom.length);
    }
}
