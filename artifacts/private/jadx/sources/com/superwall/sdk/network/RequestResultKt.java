package com.superwall.sdk.network;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class RequestResultKt {
    @NotNull
    public static final String authHeader(@NotNull RequestResult requestResult) {
        Intrinsics.checkNotNullParameter(requestResult, "<this>");
        String str = requestResult.getHeaders().get("Authorization");
        return str == null ? "" : str;
    }
}
