package io.ktor.util.pipeline;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
