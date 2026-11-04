package io.customer.messaginginapp.gist.presentation;

import io.customer.messaginginapp.gist.data.model.Message;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface GistListener {
    void embedMessage(@NotNull Message message, @NotNull String str);

    void onAction(@NotNull Message message, @NotNull String str, @NotNull String str2, @NotNull String str3);

    void onError(@NotNull Message message);

    void onMessageCancelled(@NotNull Message message);

    void onMessageDismissed(@NotNull Message message);

    void onMessageShown(@NotNull Message message);
}
