package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
