package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMarkUserContentAsSeenByAdmin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkUserContentAsSeenByAdmin.kt\nio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n226#2,3:37\n229#2,2:45\n1567#3:40\n1598#3,4:41\n*S KotlinDebug\n*F\n+ 1 MarkUserContentAsSeenByAdmin.kt\nio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin\n*L\n12#1:37,3\n12#1:45,2\n15#1:40\n15#1:41,4\n*E\n"})
public final class MarkUserContentAsSeenByAdmin {
    public static final int $stable = 0;

    public final void invoke(@NotNull k0<ConversationClientState> clientStateFlow) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversationCopy$default;
        Intrinsics.checkNotNullParameter(clientStateFlow, "clientStateFlow");
        do {
            value = clientStateFlow.getValue();
            conversationClientState = value;
            Conversation conversation = conversationClientState.getConversation();
            if (conversation != null) {
                List list = CollectionsKt.toList(conversationClientState.getConversation().getPartBuilderList());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Part.Builder builderWithSeenByAdmin = (Part.Builder) obj;
                    Part partBuild = builderWithSeenByAdmin.build();
                    if (!partBuild.isAdmin()) {
                        if (i10 == CollectionsKt.getLastIndex(conversationClientState.getConversation().parts())) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.SEEN);
                        } else if (!Intrinsics.areEqual(partBuild.getSeenByAdmin(), SeenState.HIDE)) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.HIDE);
                        }
                    }
                    arrayList.add(builderWithSeenByAdmin);
                    i10 = i11;
                }
                conversationCopy$default = Conversation.copy$default(conversation, null, false, null, arrayList, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048567, null);
            } else {
                conversationCopy$default = null;
            }
        } while (!clientStateFlow.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, conversationCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194301, null)));
    }
}
