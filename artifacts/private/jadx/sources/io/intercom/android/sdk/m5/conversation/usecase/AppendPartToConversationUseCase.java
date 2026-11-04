package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAppendPartToConversationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppendPartToConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/AppendPartToConversationUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n1755#2,3:64\n226#3,5:67\n*S KotlinDebug\n*F\n+ 1 AppendPartToConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/AppendPartToConversationUseCase\n*L\n35#1:64,3\n55#1:67,5\n*E\n"})
public final class AppendPartToConversationUseCase {
    public static final int $stable = 8;

    @NotNull
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;

    @NotNull
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    public AppendPartToConversationUseCase(@NotNull TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, @NotNull RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    public final void invoke(@NotNull k0<ConversationClientState> clientStateFlow, @NotNull Part.Builder partBuilder) {
        Intrinsics.checkNotNullParameter(clientStateFlow, "clientStateFlow");
        Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
        Conversation conversation = clientStateFlow.getValue().getConversation();
        if (conversation == null) {
            return;
        }
        Conversation conversationCopy$default = Conversation.copy$default(conversation, null, false, null, CollectionsKt.plus((Collection<? extends Part.Builder>) conversation.getPartBuilderList(), partBuilder), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048567, null);
        Part part = (Part) CollectionsKt.last((List) conversationCopy$default.parts());
        List<Part> listParts = conversation.parts();
        if (!(listParts instanceof Collection) || !listParts.isEmpty()) {
            for (Part part2 : listParts) {
                if (Intrinsics.areEqual(part2.getId(), part.getId())) {
                    return;
                }
                String uuid = part.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                if (uuid.length() > 0 && Intrinsics.areEqual(part2.getUuid(), part.getUuid())) {
                    return;
                }
            }
        }
        this.trackLastReceivedPartsUseCase.invoke(conversationCopy$default);
        this.recordOpenedInteractionUseCase.invoke(conversationCopy$default);
        while (true) {
            ConversationClientState value = clientStateFlow.getValue();
            Conversation conversation2 = conversationCopy$default;
            if (clientStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, conversation2, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194293, null))) {
                return;
            } else {
                conversationCopy$default = conversation2;
            }
        }
    }
}
