package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nUpdateFloatingIndicatorUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateFloatingIndicatorUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n226#2,3:69\n229#2,2:76\n226#2,5:78\n226#2,5:83\n1557#3:72\n1628#3,3:73\n*S KotlinDebug\n*F\n+ 1 UpdateFloatingIndicatorUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase\n*L\n23#1:69,3\n23#1:76,2\n41#1:78,5\n54#1:83,5\n29#1:72\n29#1:73,3\n*E\n"})
public final class UpdateFloatingIndicatorUseCase {
    public static final int $stable = 0;

    public final void invoke(@NotNull k0<ConversationClientState> clientState, @NotNull ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        ConversationClientState value2;
        ConversationClientState value3;
        ConversationClientState conversationClientState;
        String title;
        String subtitle;
        List listEmptyList;
        List<Avatar.Builder> avatars;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(conversationScrolledState, "conversationScrolledState");
        boolean scrolled = conversationScrolledState.getScrolled();
        Conversation conversation = clientState.getValue().getConversation();
        FooterNotice footerNotice = conversation != null ? conversation.getFooterNotice() : null;
        if (footerNotice == null || conversationScrolledState.isLandscape() || conversationScrolledState.isLargeFont()) {
            if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
                do {
                    value = clientState.getValue();
                } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.JumpToBottomIndicator(new JumpToBottomButtonState(0, conversationScrolledState.getScrollToPosition(), conversationScrolledState.getLastSeenItemIndex(), 1, null)), null, false, false, null, null, 4128767, null)));
            }
        } else if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.FooterNoticeIndicator)) {
            do {
                value3 = clientState.getValue();
                conversationClientState = value3;
                title = footerNotice.getTitle();
                subtitle = footerNotice.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
                if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    List<Avatar.Builder> list = avatars;
                    listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                        Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                        listEmptyList.add(new AvatarWrapper(avatarBuild, false, 2, null));
                    }
                }
            } while (!clientState.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.FooterNoticeIndicator(new FooterNoticeState(title, subtitle, listEmptyList)), null, false, false, null, null, 4128767, null)));
        }
        if (scrolled || (clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.None)) {
            return;
        }
        do {
            value2 = clientState.getValue();
        } while (!clientState.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, FloatingIndicatorState.None.INSTANCE, null, false, false, null, null, 4128767, null)));
    }
}
