package io.sentry.android.core;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class m0 {
    @NotNull
    public static io.sentry.x1 a(@NotNull Context context, @NotNull u0 u0Var) {
        return u0Var.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
