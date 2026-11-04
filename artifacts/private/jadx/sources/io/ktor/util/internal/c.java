package io.ktor.util.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final void a(@NotNull Throwable th2, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        th2.initCause(cause);
    }
}
