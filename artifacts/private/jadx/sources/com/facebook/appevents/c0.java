package com.facebook.appevents;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum c0 {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    static {
        int i10 = 5 & 2;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static c0[] valuesCustom() {
        c0[] c0VarArrValuesCustom = values();
        return (c0[]) Arrays.copyOf(c0VarArrValuesCustom, c0VarArrValuesCustom.length);
    }
}
