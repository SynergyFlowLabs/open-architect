package io.intercom.android.sdk.m5.conversation.data;

import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum GetConversationReason {
    NEW_COMMENT,
    NEXUS_CONNECTED,
    NETWORK_CONNECTED,
    OPEN_CONVERSATION,
    POLLING;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

    @NotNull
    public static kotlin.enums.a<GetConversationReason> getEntries() {
        return $ENTRIES;
    }
}
