package io.sentry.android.core.internal.util;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class n {
    private n() {
    }

    @Nullable
    public static io.sentry.protocol.e.b a(int i10) {
        if (i10 == 1) {
            return io.sentry.protocol.e.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return io.sentry.protocol.e.b.LANDSCAPE;
    }
}
