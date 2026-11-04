package io.sentry.util;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h {
    @NotNull
    public static Throwable a(@NotNull Throwable th2) {
        y.c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    @lm.a.c
    public static boolean b(@NotNull Set<Class<? extends Throwable>> set, @NotNull Throwable th2) {
        return set.contains(th2.getClass());
    }
}
