package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum w5 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE;

    static {
        int i10 = 4 << 1;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
