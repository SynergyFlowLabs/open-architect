package io.ktor.http.cio.internals;

import io.ktor.utils.io.o0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@o0
public final class l extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
