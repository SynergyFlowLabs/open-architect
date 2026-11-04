package io.intercom.android.sdk.m5;

import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum IntercomDestination {
    HOME,
    MESSAGES,
    HELP_CENTER,
    CONVERSATION,
    TICKETS,
    TICKET_DETAIL,
    CREATE_TICKET;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

    @NotNull
    public static kotlin.enums.a<IntercomDestination> getEntries() {
        return $ENTRIES;
    }
}
