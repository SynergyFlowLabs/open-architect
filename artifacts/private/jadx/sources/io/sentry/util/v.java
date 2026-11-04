package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class v {
    public static void a(@NotNull Class<?> cls, @Nullable Object obj, @NotNull ILogger iLogger) {
        iLogger.c(y7.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
