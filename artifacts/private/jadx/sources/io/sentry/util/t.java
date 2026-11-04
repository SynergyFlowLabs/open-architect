package io.sentry.util;

import io.sentry.m1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class t {
    public static void a(@Nullable Object obj) {
        if (obj == null || !(obj instanceof m1)) {
            return;
        }
        ((m1) obj).close();
    }
}
