package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum AdvanceResult {
    ADVANCED,
    ONESHOT,
    LOOP,
    PINGPONG,
    NONE;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<AdvanceResult> getEntries() {
        return $ENTRIES;
    }
}
