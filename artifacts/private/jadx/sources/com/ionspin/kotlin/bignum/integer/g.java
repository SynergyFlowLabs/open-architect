package com.ionspin.kotlin.bignum.integer;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum g {
    JVM,
    NATIVE,
    JS,
    WASMJS;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f131109f = kotlin.enums.c.c(k());

    static {
        int i10 = 4 ^ 1;
    }

    @NotNull
    public static kotlin.enums.a<g> l() {
        return f131109f;
    }
}
