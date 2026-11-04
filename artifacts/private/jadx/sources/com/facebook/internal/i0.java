package com.facebook.internal;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum i0 {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99888a;

    i0(String str) {
        this.f99888a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static i0[] valuesCustom() {
        i0[] i0VarArrValuesCustom = values();
        return (i0[]) Arrays.copyOf(i0VarArrValuesCustom, i0VarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f99888a;
    }
}
