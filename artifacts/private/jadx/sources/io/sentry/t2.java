package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum t2 {
    CRONTAB,
    INTERVAL;

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
