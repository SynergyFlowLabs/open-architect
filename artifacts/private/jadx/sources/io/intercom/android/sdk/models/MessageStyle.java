package io.intercom.android.sdk.models;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum MessageStyle {
    CHAT,
    POST,
    NOTE,
    ADMIN_IS_TYPING_STYLE,
    QUICK_REPLY,
    ATTRIBUTE_COLLECTOR,
    TICKET_STATE_UPDATED,
    MERGED_PRIMARY_CONVERSATION,
    FIN_ANSWER;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    static {
        int i10 = 2 ^ 1;
    }

    @NotNull
    public static a<MessageStyle> getEntries() {
        return $ENTRIES;
    }
}
