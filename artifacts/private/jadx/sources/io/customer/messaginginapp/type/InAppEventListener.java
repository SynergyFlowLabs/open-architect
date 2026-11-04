package io.customer.messaginginapp.type;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface InAppEventListener {
    void errorWithMessage(@NotNull InAppMessage inAppMessage);

    void messageActionTaken(@NotNull InAppMessage inAppMessage, @NotNull String str, @NotNull String str2);

    void messageDismissed(@NotNull InAppMessage inAppMessage);

    void messageShown(@NotNull InAppMessage inAppMessage);
}
