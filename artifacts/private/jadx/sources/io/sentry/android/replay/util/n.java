package io.sentry.android.replay.util;

import io.sentry.util.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class n {
    public static final boolean a(@NotNull c0 c0Var, @Nullable Double d10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return d10 != null && d10.doubleValue() >= c0Var.g();
    }
}
