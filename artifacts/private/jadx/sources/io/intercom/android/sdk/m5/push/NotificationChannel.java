package io.intercom.android.sdk.m5.push;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum NotificationChannel {
    CHAT_REPLIES_CHANNEL("intercom_chat_replies_channel"),
    NEW_CHATS_CHANNEL("intercom_new_chats_channel"),
    ACTIONS_CHANNEL("intercom_actions_channel");

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    private final String channelName;

    NotificationChannel(String str) {
        this.channelName = str;
    }

    @NotNull
    public static kotlin.enums.a<NotificationChannel> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }
}
