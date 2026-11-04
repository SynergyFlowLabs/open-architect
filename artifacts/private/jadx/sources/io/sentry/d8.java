package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum d8 implements k2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements a2<d8> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d8 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return d8.valueOf(y3Var.jc().toUpperCase(Locale.ROOT));
        }
    }

    d8(int i10) {
        this.severityNumber = i10;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(name().toLowerCase(Locale.ROOT));
    }
}
