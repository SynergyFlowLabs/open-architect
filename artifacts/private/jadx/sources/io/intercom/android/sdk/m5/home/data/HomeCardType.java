package io.intercom.android.sdk.m5.home.data;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum HomeCardType {
    SPACES,
    RECENT_CONVERSATION,
    NEW_CONVERSATION,
    HELP_CENTER,
    EXTERNAL_LINKS,
    MESSENGER_APP,
    RECENT_TICKETS,
    TICKET_LINKS;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<HomeCardType> getEntries() {
        return $ENTRIES;
    }
}
