package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nConversationClientState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationClientState.kt\nio/intercom/android/sdk/m5/conversation/states/ConversationClientState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1755#2,3:107\n*S KotlinDebug\n*F\n+ 1 ConversationClientState.kt\nio/intercom/android/sdk/m5/conversation/states/ConversationClientState\n*L\n80#1:107,3\n*E\n"})
public final class ConversationClientState {
    public static final int $stable = 8;

    @Nullable
    private final ArticleMetadata articleMetadata;

    @NotNull
    private final BottomSheetState bottomSheetState;

    @NotNull
    private final ComposerState composerState;

    @Nullable
    private final Conversation conversation;

    @Nullable
    private final String conversationId;

    @NotNull
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean dismissedPrivacyNotice;

    @NotNull
    private final List<String> failedAttributeIdentifiers;

    @NotNull
    private final FinStreamingData finStreamingData;

    @NotNull
    private final FloatingIndicatorState floatingIndicatorState;
    private final boolean isConversationScrolled;

    @Nullable
    private final NetworkResponse<Object> lastNetworkCall;

    @NotNull
    private final LaunchMode launchMode;

    @NotNull
    private final List<String> loadingAttributeIdentifiers;

    @NotNull
    private final NetworkState networkState;

    @Nullable
    private final String newMessageId;

    @Nullable
    private final OpenMessengerResponse openMessengerResponse;

    @NotNull
    private final Map<String, PendingMessage> pendingMessages;

    @Nullable
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final int unreadConversationsCount;
    private final int unreadTicketsCount;

    @NotNull
    private final VoiceTranscriptionState voiceTranscriptionState;

    public ConversationClientState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationClientState copy$default(ConversationClientState conversationClientState, Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i10, int i11, FloatingIndicatorState floatingIndicatorState, String str2, boolean z10, boolean z11, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, int i12, Object obj) {
        VoiceTranscriptionState voiceTranscriptionState2;
        PushNotificationsBannerState pushNotificationsBannerState2;
        Map map2 = (i12 & 1) != 0 ? conversationClientState.pendingMessages : map;
        Conversation conversation2 = (i12 & 2) != 0 ? conversationClientState.conversation : conversation;
        String str3 = (i12 & 4) != 0 ? conversationClientState.conversationId : str;
        CurrentlyTypingState currentlyTypingState2 = (i12 & 8) != 0 ? conversationClientState.currentlyTypingState : currentlyTypingState;
        ComposerState composerState2 = (i12 & 16) != 0 ? conversationClientState.composerState : composerState;
        BottomSheetState bottomSheetState2 = (i12 & 32) != 0 ? conversationClientState.bottomSheetState : bottomSheetState;
        LaunchMode launchMode2 = (i12 & 64) != 0 ? conversationClientState.launchMode : launchMode;
        NetworkResponse networkResponse2 = (i12 & 128) != 0 ? conversationClientState.lastNetworkCall : networkResponse;
        ArticleMetadata articleMetadata2 = (i12 & 256) != 0 ? conversationClientState.articleMetadata : articleMetadata;
        NetworkState networkState2 = (i12 & 512) != 0 ? conversationClientState.networkState : networkState;
        List list3 = (i12 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : list;
        List list4 = (i12 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : list2;
        FinStreamingData finStreamingData2 = (i12 & 4096) != 0 ? conversationClientState.finStreamingData : finStreamingData;
        OpenMessengerResponse openMessengerResponse2 = (i12 & 8192) != 0 ? conversationClientState.openMessengerResponse : openMessengerResponse;
        Map map3 = map2;
        int i13 = (i12 & 16384) != 0 ? conversationClientState.unreadConversationsCount : i10;
        int i14 = (i12 & 32768) != 0 ? conversationClientState.unreadTicketsCount : i11;
        FloatingIndicatorState floatingIndicatorState2 = (i12 & 65536) != 0 ? conversationClientState.floatingIndicatorState : floatingIndicatorState;
        String str4 = (i12 & 131072) != 0 ? conversationClientState.newMessageId : str2;
        boolean z12 = (i12 & 262144) != 0 ? conversationClientState.isConversationScrolled : z10;
        boolean z13 = (i12 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : z11;
        PushNotificationsBannerState pushNotificationsBannerState3 = (i12 & 1048576) != 0 ? conversationClientState.pushNotificationsBannerState : pushNotificationsBannerState;
        if ((i12 & 2097152) != 0) {
            pushNotificationsBannerState2 = pushNotificationsBannerState3;
            voiceTranscriptionState2 = conversationClientState.voiceTranscriptionState;
        } else {
            voiceTranscriptionState2 = voiceTranscriptionState;
            pushNotificationsBannerState2 = pushNotificationsBannerState3;
        }
        return conversationClientState.copy(map3, conversation2, str3, currentlyTypingState2, composerState2, bottomSheetState2, launchMode2, networkResponse2, articleMetadata2, networkState2, list3, list4, finStreamingData2, openMessengerResponse2, i13, i14, floatingIndicatorState2, str4, z12, z13, pushNotificationsBannerState2, voiceTranscriptionState2);
    }

    @NotNull
    public final Map<String, PendingMessage> component1() {
        return this.pendingMessages;
    }

    @NotNull
    public final NetworkState component10() {
        return this.networkState;
    }

    @NotNull
    public final List<String> component11() {
        return this.failedAttributeIdentifiers;
    }

    @NotNull
    public final List<String> component12() {
        return this.loadingAttributeIdentifiers;
    }

    @NotNull
    public final FinStreamingData component13() {
        return this.finStreamingData;
    }

    @Nullable
    public final OpenMessengerResponse component14() {
        return this.openMessengerResponse;
    }

    public final int component15() {
        return this.unreadConversationsCount;
    }

    public final int component16() {
        return this.unreadTicketsCount;
    }

    @NotNull
    public final FloatingIndicatorState component17() {
        return this.floatingIndicatorState;
    }

    @Nullable
    public final String component18() {
        return this.newMessageId;
    }

    public final boolean component19() {
        return this.isConversationScrolled;
    }

    @Nullable
    public final Conversation component2() {
        return this.conversation;
    }

    public final boolean component20() {
        return this.dismissedPrivacyNotice;
    }

    @Nullable
    public final PushNotificationsBannerState component21() {
        return this.pushNotificationsBannerState;
    }

    @NotNull
    public final VoiceTranscriptionState component22() {
        return this.voiceTranscriptionState;
    }

    @Nullable
    public final String component3() {
        return this.conversationId;
    }

    @NotNull
    public final CurrentlyTypingState component4() {
        return this.currentlyTypingState;
    }

    @NotNull
    public final ComposerState component5() {
        return this.composerState;
    }

    @NotNull
    public final BottomSheetState component6() {
        return this.bottomSheetState;
    }

    @NotNull
    public final LaunchMode component7() {
        return this.launchMode;
    }

    @Nullable
    public final NetworkResponse<Object> component8() {
        return this.lastNetworkCall;
    }

    @Nullable
    public final ArticleMetadata component9() {
        return this.articleMetadata;
    }

    @NotNull
    public final ConversationClientState copy(@NotNull Map<String, PendingMessage> pendingMessages, @Nullable Conversation conversation, @Nullable String str, @NotNull CurrentlyTypingState currentlyTypingState, @NotNull ComposerState composerState, @NotNull BottomSheetState bottomSheetState, @NotNull LaunchMode launchMode, @Nullable NetworkResponse<? extends Object> networkResponse, @Nullable ArticleMetadata articleMetadata, @NotNull NetworkState networkState, @NotNull List<String> failedAttributeIdentifiers, @NotNull List<String> loadingAttributeIdentifiers, @NotNull FinStreamingData finStreamingData, @Nullable OpenMessengerResponse openMessengerResponse, int i10, int i11, @NotNull FloatingIndicatorState floatingIndicatorState, @Nullable String str2, boolean z10, boolean z11, @Nullable PushNotificationsBannerState pushNotificationsBannerState, @NotNull VoiceTranscriptionState voiceTranscriptionState) {
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(networkState, "networkState");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(finStreamingData, "finStreamingData");
        Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
        Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
        return new ConversationClientState(pendingMessages, conversation, str, currentlyTypingState, composerState, bottomSheetState, launchMode, networkResponse, articleMetadata, networkState, failedAttributeIdentifiers, loadingAttributeIdentifiers, finStreamingData, openMessengerResponse, i10, i11, floatingIndicatorState, str2, z10, z11, pushNotificationsBannerState, voiceTranscriptionState);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationClientState)) {
            return false;
        }
        ConversationClientState conversationClientState = (ConversationClientState) obj;
        return Intrinsics.areEqual(this.pendingMessages, conversationClientState.pendingMessages) && Intrinsics.areEqual(this.conversation, conversationClientState.conversation) && Intrinsics.areEqual(this.conversationId, conversationClientState.conversationId) && Intrinsics.areEqual(this.currentlyTypingState, conversationClientState.currentlyTypingState) && Intrinsics.areEqual(this.composerState, conversationClientState.composerState) && Intrinsics.areEqual(this.bottomSheetState, conversationClientState.bottomSheetState) && this.launchMode == conversationClientState.launchMode && Intrinsics.areEqual(this.lastNetworkCall, conversationClientState.lastNetworkCall) && Intrinsics.areEqual(this.articleMetadata, conversationClientState.articleMetadata) && Intrinsics.areEqual(this.networkState, conversationClientState.networkState) && Intrinsics.areEqual(this.failedAttributeIdentifiers, conversationClientState.failedAttributeIdentifiers) && Intrinsics.areEqual(this.loadingAttributeIdentifiers, conversationClientState.loadingAttributeIdentifiers) && Intrinsics.areEqual(this.finStreamingData, conversationClientState.finStreamingData) && Intrinsics.areEqual(this.openMessengerResponse, conversationClientState.openMessengerResponse) && this.unreadConversationsCount == conversationClientState.unreadConversationsCount && this.unreadTicketsCount == conversationClientState.unreadTicketsCount && Intrinsics.areEqual(this.floatingIndicatorState, conversationClientState.floatingIndicatorState) && Intrinsics.areEqual(this.newMessageId, conversationClientState.newMessageId) && this.isConversationScrolled == conversationClientState.isConversationScrolled && this.dismissedPrivacyNotice == conversationClientState.dismissedPrivacyNotice && Intrinsics.areEqual(this.pushNotificationsBannerState, conversationClientState.pushNotificationsBannerState) && Intrinsics.areEqual(this.voiceTranscriptionState, conversationClientState.voiceTranscriptionState);
    }

    @Nullable
    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    @NotNull
    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    @NotNull
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    @Nullable
    public final Conversation getConversation() {
        return this.conversation;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    @NotNull
    public final List<String> getFailedAttributeIdentifiers() {
        return this.failedAttributeIdentifiers;
    }

    @NotNull
    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    @NotNull
    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    @Nullable
    public final NetworkResponse<Object> getLastNetworkCall() {
        return this.lastNetworkCall;
    }

    @NotNull
    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    @NotNull
    public final List<String> getLoadingAttributeIdentifiers() {
        return this.loadingAttributeIdentifiers;
    }

    @NotNull
    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    @Nullable
    public final String getNewMessageId() {
        return this.newMessageId;
    }

    @Nullable
    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    @NotNull
    public final Map<String, PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    @Nullable
    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    @NotNull
    public final VoiceTranscriptionState getVoiceTranscriptionState() {
        return this.voiceTranscriptionState;
    }

    public final boolean hasUserSentAMessage$intercom_sdk_base_release() {
        List<Part> listParts;
        if (!this.pendingMessages.isEmpty()) {
            return true;
        }
        Conversation conversation = this.conversation;
        if (conversation != null && (listParts = conversation.parts()) != null) {
            List<Part> list = listParts;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Part) it.next()).isUser()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.pendingMessages.hashCode() * 31;
        Conversation conversation = this.conversation;
        int iHashCode2 = (iHashCode + (conversation == null ? 0 : conversation.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode3 = (((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.currentlyTypingState.hashCode()) * 31) + this.composerState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.launchMode.hashCode()) * 31;
        NetworkResponse<Object> networkResponse = this.lastNetworkCall;
        int iHashCode4 = (iHashCode3 + (networkResponse == null ? 0 : networkResponse.hashCode())) * 31;
        ArticleMetadata articleMetadata = this.articleMetadata;
        int iHashCode5 = (((((((((iHashCode4 + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31) + this.networkState.hashCode()) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode()) * 31) + this.finStreamingData.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponse;
        int iHashCode6 = (((((((iHashCode5 + (openMessengerResponse == null ? 0 : openMessengerResponse.hashCode())) * 31) + Integer.hashCode(this.unreadConversationsCount)) * 31) + Integer.hashCode(this.unreadTicketsCount)) * 31) + this.floatingIndicatorState.hashCode()) * 31;
        String str2 = this.newMessageId;
        int iHashCode7 = (((((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isConversationScrolled)) * 31) + Boolean.hashCode(this.dismissedPrivacyNotice)) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        return ((iHashCode7 + (pushNotificationsBannerState != null ? pushNotificationsBannerState.hashCode() : 0)) * 31) + this.voiceTranscriptionState.hashCode();
    }

    public final boolean isConversationScrolled() {
        return this.isConversationScrolled;
    }

    @NotNull
    public String toString() {
        return "ConversationClientState(pendingMessages=" + this.pendingMessages + ", conversation=" + this.conversation + ", conversationId=" + this.conversationId + ", currentlyTypingState=" + this.currentlyTypingState + ", composerState=" + this.composerState + ", bottomSheetState=" + this.bottomSheetState + ", launchMode=" + this.launchMode + ", lastNetworkCall=" + this.lastNetworkCall + ", articleMetadata=" + this.articleMetadata + ", networkState=" + this.networkState + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ", finStreamingData=" + this.finStreamingData + ", openMessengerResponse=" + this.openMessengerResponse + ", unreadConversationsCount=" + this.unreadConversationsCount + ", unreadTicketsCount=" + this.unreadTicketsCount + ", floatingIndicatorState=" + this.floatingIndicatorState + ", newMessageId=" + this.newMessageId + ", isConversationScrolled=" + this.isConversationScrolled + ", dismissedPrivacyNotice=" + this.dismissedPrivacyNotice + ", pushNotificationsBannerState=" + this.pushNotificationsBannerState + ", voiceTranscriptionState=" + this.voiceTranscriptionState + ')';
    }

    public ConversationClientState(@NotNull Map<String, PendingMessage> pendingMessages, @Nullable Conversation conversation, @Nullable String str, @NotNull CurrentlyTypingState currentlyTypingState, @NotNull ComposerState composerState, @NotNull BottomSheetState bottomSheetState, @NotNull LaunchMode launchMode, @Nullable NetworkResponse<? extends Object> networkResponse, @Nullable ArticleMetadata articleMetadata, @NotNull NetworkState networkState, @NotNull List<String> failedAttributeIdentifiers, @NotNull List<String> loadingAttributeIdentifiers, @NotNull FinStreamingData finStreamingData, @Nullable OpenMessengerResponse openMessengerResponse, int i10, int i11, @NotNull FloatingIndicatorState floatingIndicatorState, @Nullable String str2, boolean z10, boolean z11, @Nullable PushNotificationsBannerState pushNotificationsBannerState, @NotNull VoiceTranscriptionState voiceTranscriptionState) {
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(networkState, "networkState");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(finStreamingData, "finStreamingData");
        Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
        Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
        this.pendingMessages = pendingMessages;
        this.conversation = conversation;
        this.conversationId = str;
        this.currentlyTypingState = currentlyTypingState;
        this.composerState = composerState;
        this.bottomSheetState = bottomSheetState;
        this.launchMode = launchMode;
        this.lastNetworkCall = networkResponse;
        this.articleMetadata = articleMetadata;
        this.networkState = networkState;
        this.failedAttributeIdentifiers = failedAttributeIdentifiers;
        this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
        this.finStreamingData = finStreamingData;
        this.openMessengerResponse = openMessengerResponse;
        this.unreadConversationsCount = i10;
        this.unreadTicketsCount = i11;
        this.floatingIndicatorState = floatingIndicatorState;
        this.newMessageId = str2;
        this.isConversationScrolled = z10;
        this.dismissedPrivacyNotice = z11;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
        this.voiceTranscriptionState = voiceTranscriptionState;
    }

    public /* synthetic */ ConversationClientState(Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i10, int i11, FloatingIndicatorState floatingIndicatorState, String str2, boolean z10, boolean z11, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? MapsKt.emptyMap() : map, (i12 & 2) != 0 ? null : conversation, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null) : currentlyTypingState, (i12 & 16) != 0 ? new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null) : composerState, (i12 & 32) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, (i12 & 64) != 0 ? LaunchMode.CLASSIC : launchMode, (i12 & 128) != 0 ? null : networkResponse, (i12 & 256) != 0 ? null : articleMetadata, (i12 & 512) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i12 & 1024) != 0 ? CollectionsKt.emptyList() : list, (i12 & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i12 & 4096) != 0 ? new FinStreamingData(false, CollectionsKt.emptyList(), "", 0) : finStreamingData, (i12 & 8192) != 0 ? null : openMessengerResponse, (i12 & 16384) != 0 ? 0 : i10, (i12 & 32768) != 0 ? 0 : i11, (i12 & 65536) != 0 ? FloatingIndicatorState.None.INSTANCE : floatingIndicatorState, (i12 & 131072) != 0 ? null : str2, (i12 & 262144) != 0 ? false : z10, (i12 & 524288) == 0 ? z11 : false, (i12 & 1048576) != 0 ? null : pushNotificationsBannerState, (i12 & 2097152) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState);
    }
}
