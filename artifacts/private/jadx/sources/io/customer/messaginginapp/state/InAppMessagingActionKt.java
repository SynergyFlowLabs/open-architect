package io.customer.messaginginapp.state;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppMessagingActionKt {
    public static final boolean shouldMarkMessageAsShown(@NotNull InAppMessagingAction inAppMessagingAction) {
        Intrinsics.checkNotNullParameter(inAppMessagingAction, "<this>");
        if (inAppMessagingAction instanceof InAppMessagingAction.DisplayMessage) {
            return !((InAppMessagingAction.DisplayMessage) inAppMessagingAction).getMessage().getGistProperties().getPersistent();
        }
        if (inAppMessagingAction instanceof InAppMessagingAction.DismissMessage) {
            InAppMessagingAction.DismissMessage dismissMessage = (InAppMessagingAction.DismissMessage) inAppMessagingAction;
            if (dismissMessage.getMessage().getGistProperties().getPersistent() && dismissMessage.getShouldLog() && dismissMessage.getViaCloseAction()) {
                return true;
            }
        }
        return false;
    }
}
