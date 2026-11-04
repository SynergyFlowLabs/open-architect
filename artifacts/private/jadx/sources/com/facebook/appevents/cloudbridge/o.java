package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98765a;

    o(String str) {
        this.f98765a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        o[] oVarArrValuesCustom = values();
        return (o[]) Arrays.copyOf(oVarArrValuesCustom, oVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98765a;
    }
}
