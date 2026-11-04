package com.facebook.bolts;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Exception e10) {
        super("An exception was thrown by an Executor", e10);
        Intrinsics.checkNotNullParameter(e10, "e");
    }
}
