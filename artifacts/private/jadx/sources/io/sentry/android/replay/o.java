package io.sentry.android.replay;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum o {
    INITIAL,
    STARTED,
    RESUMED,
    PAUSED,
    STOPPED,
    CLOSED;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<o> getEntries() {
        return $ENTRIES;
    }
}
