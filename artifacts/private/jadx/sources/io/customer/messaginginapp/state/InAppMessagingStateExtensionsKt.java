package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.data.model.Message;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppMessagingStateExtensionsKt {
    @NotNull
    public static final InAppMessagingState withMessageDismissed(@NotNull InAppMessagingState inAppMessagingState, @NotNull Message message, boolean z10) {
        Intrinsics.checkNotNullParameter(inAppMessagingState, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Set<String> shownMessageQueueIds = inAppMessagingState.getShownMessageQueueIds();
        if (z10 && message.getQueueId() != null) {
            shownMessageQueueIds = SetsKt.plus(shownMessageQueueIds, message.getQueueId());
        }
        Set<String> set = shownMessageQueueIds;
        if (message.isEmbedded()) {
            return message.getQueueId() != null ? withUpdatedEmbeddedMessage$default(inAppMessagingState, message.getQueueId(), new InlineMessageState.Dismissed(message), set, null, 8, null) : inAppMessagingState;
        }
        return InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, new ModalMessageState.Dismissed(message), null, null, set, 895, null);
    }

    @NotNull
    public static final InAppMessagingState withUpdatedEmbeddedMessage(@NotNull InAppMessagingState inAppMessagingState, @NotNull String queueId, @NotNull InlineMessageState newState, @NotNull Set<String> shownMessageQueueIds, @NotNull Set<Message> messagesInQueue) {
        Intrinsics.checkNotNullParameter(inAppMessagingState, "<this>");
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(shownMessageQueueIds, "shownMessageQueueIds");
        Intrinsics.checkNotNullParameter(messagesInQueue, "messagesInQueue");
        return InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, null, inAppMessagingState.getQueuedInlineMessagesState().updateMessageState(queueId, newState), messagesInQueue, shownMessageQueueIds, 255, null);
    }

    public static /* synthetic */ InAppMessagingState withUpdatedEmbeddedMessage$default(InAppMessagingState inAppMessagingState, String str, InlineMessageState inlineMessageState, Set set, Set set2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = inAppMessagingState.getShownMessageQueueIds();
        }
        if ((i10 & 8) != 0) {
            set2 = inAppMessagingState.getMessagesInQueue();
        }
        return withUpdatedEmbeddedMessage(inAppMessagingState, str, inlineMessageState, set, set2);
    }
}
