package io.ktor.client.utils;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    @NotNull
    public static final Throwable a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Throwable cause = th2;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (!Intrinsics.areEqual(cause, cancellationException.getCause())) {
                cause = cancellationException.getCause();
            }
        }
        return cause == null ? th2 : cause;
    }
}
