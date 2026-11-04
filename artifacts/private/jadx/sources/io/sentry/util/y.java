package io.sentry.util;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class y {
    private y() {
    }

    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T c(@Nullable T t10, @NotNull String str) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(str);
    }
}
