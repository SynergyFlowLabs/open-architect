package com.sdk.growthbook.model;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum l {
    unknownFeature,
    defaultValue,
    force,
    experiment,
    cyclicPrerequisite,
    prerequisite,
    override;


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f266372i = kotlin.enums.c.c(k());

    static {
        int i10 = 2 | 2;
    }

    @NotNull
    public static kotlin.enums.a<l> l() {
        return f266372i;
    }
}
