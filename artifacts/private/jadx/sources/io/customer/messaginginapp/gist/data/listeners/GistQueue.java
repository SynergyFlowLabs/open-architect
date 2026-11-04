package io.customer.messaginginapp.gist.data.listeners;

import io.customer.messaginginapp.gist.data.model.Message;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface GistQueue {
    void fetchUserMessages();

    void logView(@NotNull Message message);
}
