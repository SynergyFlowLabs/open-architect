package com.facebook;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum t0 {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static t0[] valuesCustom() {
        t0[] t0VarArrValuesCustom = values();
        return (t0[]) Arrays.copyOf(t0VarArrValuesCustom, t0VarArrValuesCustom.length);
    }
}
