package io.intercom.android.sdk.m5.conversation.usecase;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum Action {
    MESSAGE_SENT,
    ADMIN_MESSAGE_RECEIVED,
    OPERATOR_MESSAGE_RECEIVED,
    MESSAGE_FAILED;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<Action> getEntries() {
        return $ENTRIES;
    }
}
