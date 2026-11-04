package io.customer.messaginginapp.gist.presentation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface GistProvider {
    void dismissMessage();

    void fetchInAppMessages();

    void reset();

    void setCurrentRoute(@NotNull String str);

    void setUserId(@NotNull String str);
}
