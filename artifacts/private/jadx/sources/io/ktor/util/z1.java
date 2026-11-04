package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class z1 {
    @Nullable
    public static final Throwable a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        while (true) {
            if ((th2 != null ? th2.getCause() : null) == null) {
                return th2;
            }
            th2 = th2.getCause();
        }
    }

    @io.ktor.utils.io.o0
    public static /* synthetic */ void b(Throwable th2) {
    }
}
