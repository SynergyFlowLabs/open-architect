package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.models.Conversation;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class RecordOpenedInteractionUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    public RecordOpenedInteractionUseCase(@NotNull ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    private final boolean shouldRecordOpenedInteraction(Conversation conversation) {
        return CollectionsKt.listOf((Object[]) new String[]{NotificationStatuses.DELIVERED_STATUS, NotificationStatuses.RENOTIFYING_STATUS}).contains(conversation.getNotificationStatus());
    }

    public final void invoke(@NotNull Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (shouldRecordOpenedInteraction(conversation)) {
            this.conversationRepository.recordInteractions(conversation.getId(), new String[]{"opened"});
        }
    }
}
