package io.ktor.util.cio;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String message, @NotNull Throwable exception) {
        super(message, exception);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}
