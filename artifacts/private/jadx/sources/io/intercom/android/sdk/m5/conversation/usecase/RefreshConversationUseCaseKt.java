package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class RefreshConversationUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<FloatingIndicatorState, String> calculateJumpToBottomButtonState(ConversationClientState conversationClientState, Conversation conversation, List<? extends Part> list) {
        String id2 = null;
        if (!(conversationClientState.getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
            Conversation conversation2 = conversationClientState.getConversation();
            List<Part> listParts = conversation2 != null ? conversation2.parts() : null;
            if (listParts == null) {
                listParts = CollectionsKt.emptyList();
            }
            return TuplesKt.to(conversationClientState.getFloatingIndicatorState(), listParts.size() == conversation.parts().size() ? conversationClientState.getNewMessageId() : null);
        }
        String newMessageId = conversationClientState.getNewMessageId();
        if (newMessageId == null) {
            Part part = (Part) CollectionsKt.firstOrNull((List) list);
            if (part != null) {
                id2 = part.getId();
            }
        } else {
            id2 = newMessageId;
        }
        int i10 = 2 & 0;
        return TuplesKt.to(new FloatingIndicatorState.JumpToBottomIndicator(JumpToBottomButtonState.copy$default(((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState(), ((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState().getUnreadMessages() + list.size(), 0, 0, 6, null)), id2);
    }
}
