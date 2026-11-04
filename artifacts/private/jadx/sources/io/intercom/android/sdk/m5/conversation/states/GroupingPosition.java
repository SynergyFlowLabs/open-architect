package io.intercom.android.sdk.m5.conversation.states;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum GroupingPosition {
    STANDALONE,
    TOP,
    MIDDLE,
    BOTTOM;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<GroupingPosition> getEntries() {
        return $ENTRIES;
    }
}
