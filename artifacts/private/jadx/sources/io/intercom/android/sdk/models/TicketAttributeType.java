package io.intercom.android.sdk.models;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum TicketAttributeType {
    STRING,
    INTEGER,
    FLOAT,
    BOOLEAN,
    DATETIME,
    LIST,
    FILES;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<TicketAttributeType> getEntries() {
        return $ENTRIES;
    }
}
