package com.sdk.growthbook.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f266505b;

    public j(@Nullable Throwable th2) {
        String message;
        this.f266504a = (th2 == null || (message = th2.getMessage()) == null) ? "" : message;
        this.f266505b = th2 != null ? kotlin.p.i(th2) : null;
    }

    @NotNull
    public final String a() {
        return this.f266504a;
    }

    @Nullable
    public final String b() {
        return this.f266505b;
    }
}
