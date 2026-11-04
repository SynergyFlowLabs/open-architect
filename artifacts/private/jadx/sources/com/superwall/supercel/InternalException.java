package com.superwall.supercel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
