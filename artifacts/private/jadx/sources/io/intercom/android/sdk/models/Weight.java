package io.intercom.android.sdk.models;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum Weight {
    REGULAR,
    LIGHT,
    MEDIUM,
    SEMI_BOLD,
    BOLD;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<Weight> getEntries() {
        return $ENTRIES;
    }
}
