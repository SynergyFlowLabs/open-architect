package io.intercom.android.sdk.m5.conversation;

import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModelKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,709:1\n188#2,3:710\n*S KotlinDebug\n*F\n+ 1 ConversationViewModel.kt\nio/intercom/android/sdk/m5/conversation/ConversationViewModelKt\n*L\n708#1:710,3\n*E\n"})
public final class ConversationViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFastFinTyping(ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping, ConversationClientState conversationClientState) {
        if (adminIsTyping.getClientId().length() > 0) {
            Map<String, PendingMessage> pendingMessages = conversationClientState.getPendingMessages();
            if (!pendingMessages.isEmpty()) {
                Iterator<Map.Entry<String, PendingMessage>> it = pendingMessages.entrySet().iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getValue().getPart().getUuid(), adminIsTyping.getClientId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
