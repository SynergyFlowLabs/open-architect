package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum u2 {
    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR;

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
