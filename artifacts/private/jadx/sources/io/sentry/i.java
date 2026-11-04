package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum i {
    IN_PROGRESS,
    OK,
    ERROR;

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
