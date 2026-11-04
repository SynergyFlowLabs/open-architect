package com.sdk.growthbook.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f266496a = new com.ionspin.kotlin.bignum.integer.a(2166136261L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f266497b = new com.ionspin.kotlin.bignum.integer.a(16777619);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f266498c = new com.ionspin.kotlin.bignum.integer.a(2).t0(32);

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a a(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        com.ionspin.kotlin.bignum.integer.a aVarR1 = this.f266496a;
        int length = data.length();
        for (int i10 = 0; i10 < length; i10++) {
            aVarR1 = aVarR1.c(new com.ionspin.kotlin.bignum.integer.a(data.charAt(i10) & 255)).T(this.f266497b).r1(this.f266498c);
        }
        return aVarR1;
    }
}
