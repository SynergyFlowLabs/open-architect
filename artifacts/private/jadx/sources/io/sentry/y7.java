package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum y7 implements k2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements a2<y7> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y7 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return y7.valueOf(y3Var.jc().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(name().toLowerCase(Locale.ROOT));
    }
}
