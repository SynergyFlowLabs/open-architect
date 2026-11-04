package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class r {
    private r() {
    }

    public static boolean a(@NotNull Context context, @NotNull String str) {
        io.sentry.util.y.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
