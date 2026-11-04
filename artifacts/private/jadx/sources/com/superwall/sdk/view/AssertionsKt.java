package com.superwall.sdk.view;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AssertionsKt {
    public static final void fatalAssert(boolean z10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
