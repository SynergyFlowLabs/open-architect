package io.intercom.android.sdk.m5.home.data;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum SpaceItemType {
    MESSAGES,
    HELP,
    TICKETS;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<SpaceItemType> getEntries() {
        return $ENTRIES;
    }
}
