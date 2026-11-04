package io.intercom.android.sdk.m5.conversation.reducers;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nConversationReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1557#2:210\n1628#2,3:211\n1872#2,3:214\n1755#2,3:217\n1557#2:220\n1628#2,3:221\n*S KotlinDebug\n*F\n+ 1 ConversationReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer\n*L\n126#1:210\n126#1:211,3\n130#1:214,3\n153#1:217,3\n182#1:220\n182#1:221,3\n*E\n"})
public final class ConversationReducer {
    public static final int $stable = 8;

    @NotNull
    private final Function0<AppConfig> config;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final Function0<UserIdentity> userIdentity;

    public ConversationReducer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$1() {
        return Injector.get().getUserIdentity();
    }

    private final boolean isBotIntroEmpty(ConversationClientState conversationClientState) {
        ComposerSuggestions composerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (!this.intercomDataLayer.getBotIntro().getValue().getBlocks().isEmpty()) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
        List<ComposerSuggestions.Suggestion> suggestions = null;
        List<Part.Builder> parts = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null) ? null : newConversationData.getParts();
        if (parts != null && !parts.isEmpty()) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        if (openMessengerResponse2 != null && (composerSuggestions = openMessengerResponse2.getComposerSuggestions()) != null) {
            suggestions = composerSuggestions.getSuggestions();
        }
        List<ComposerSuggestions.Suggestion> list = suggestions;
        return list == null || list.isEmpty();
    }

    private final Part toArticlePart(ArticleMetadata articleMetadata) {
        Part partBuild = new Part.Builder().withIsInitialMessage(Boolean.TRUE).withBlocks(CollectionsKt.listOf(new Block.Builder().withArticleId(articleMetadata.getId()).withTitle(articleMetadata.getTitle()))).build();
        Intrinsics.checkNotNullExpressionValue(partBuild, "build(...)");
        return partBuild;
    }

    @NotNull
    public final ConversationUiState computeUiState$intercom_sdk_base_release(@NotNull ConversationClientState clientState) {
        List<Part> listEmptyList;
        FooterNotice footerNotice;
        List listEmptyList2;
        List<Avatar.Builder> avatars;
        ActiveBot activeBot;
        StreamingPart streamingPart;
        List<Part> listParts;
        OpenMessengerResponse openMessengerResponse;
        ComposerSuggestions composerSuggestions;
        ContentRow contentRowReduceComposerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Conversation conversation = clientState.getConversation();
        String conversationId = clientState.getConversationId();
        NetworkResponse<Object> lastNetworkCall = clientState.getLastNetworkCall();
        boolean z10 = conversation == null && conversationId != null;
        boolean z11 = conversation == null && conversationId == null;
        boolean z12 = z11 && (clientState.getArticleMetadata() != null) && isBotIntroEmpty(clientState);
        boolean z13 = z11 && clientState.getOpenMessengerResponse() == null;
        TeamPresenceState teamPresenceStateReduceTeamPresenceState = TeamPresenceReducerKt.reduceTeamPresenceState(clientState.getConversation(), clientState.getOpenMessengerResponse());
        boolean z14 = !clientState.getPendingMessages().isEmpty();
        Conversation conversation2 = clientState.getConversation();
        OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
        boolean z15 = true;
        TopAppBarUiState topAppBarUiStateReduceTopAppBarUiState = HeaderReducerKt.reduceTopAppBarUiState(z11, z14, conversation2, (openMessengerResponse2 == null || (newConversationData = openMessengerResponse2.getNewConversationData()) == null) ? null : newConversationData.getHeader(), this.config.invoke(), clientState.getUnreadConversationsCount(), clientState.getUnreadTicketsCount(), clientState.getLaunchMode(), clientState.getPushNotificationsBannerState());
        if (z10 && lastNetworkCall != null && !(lastNetworkCall instanceof NetworkResponse.Success)) {
            return ErrorReducerKt.reduceError(lastNetworkCall, topAppBarUiStateReduceTopAppBarUiState);
        }
        if (z10 || z13) {
            return LoadingStateReducerKt.reduceLoadingState(topAppBarUiStateReduceTopAppBarUiState);
        }
        NetworkState networkState = clientState.getNetworkState();
        BottomSheetState bottomSheetState = clientState.getBottomSheetState();
        BottomBarUiState bottomBarUiStateReduceComposerState = ComposerStateReducerKt.reduceComposerState(clientState, this.config.invoke(), z11);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!StringsKt.w3(teamPresenceStateReduceTeamPresenceState.getTeamIntro())) {
            listCreateListBuilder.add(new ContentRow.TeamIntroRow(teamPresenceStateReduceTeamPresenceState.getTeamIntro()));
        }
        if (!StringsKt.w3(teamPresenceStateReduceTeamPresenceState.getSpecialNotice())) {
            listCreateListBuilder.add(new ContentRow.SpecialNoticeRow(teamPresenceStateReduceTeamPresenceState.getSpecialNotice()));
        }
        if (z12 && clientState.getArticleMetadata() != null) {
            listCreateListBuilder.add(new ContentRow.AskedAboutRow(toArticlePart(clientState.getArticleMetadata())));
        }
        if (z11) {
            listCreateListBuilder.addAll(IntroPartsReducerKt.reduceIntroParts(clientState, this.intercomDataLayer.getBotIntro().getValue(), this.timeProvider));
        }
        listCreateListBuilder.addAll(ConversationPartsReducerKt.reduceMessages(clientState, this.userIdentity.invoke(), this.config.invoke()));
        if (z11 && clientState.getPendingMessages().isEmpty() && (openMessengerResponse = clientState.getOpenMessengerResponse()) != null && (composerSuggestions = openMessengerResponse.getComposerSuggestions()) != null && (contentRowReduceComposerSuggestions = ComposerSuggestionsReducerKt.reduceComposerSuggestions(composerSuggestions)) != null) {
            listCreateListBuilder.add(contentRowReduceComposerSuggestions);
        }
        Conversation conversation3 = clientState.getConversation();
        if (conversation3 == null || (listEmptyList = conversation3.parts()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Part> list = listEmptyList;
        Collection<PendingMessage> collectionValues = clientState.getPendingMessages().values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingMessage) it.next()).getPart());
        }
        List listPlus = CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        Conversation conversation4 = clientState.getConversation();
        int size = (conversation4 == null || (listParts = conversation4.parts()) == null) ? 0 : listParts.size();
        int i10 = 0;
        for (Object obj : clientState.getPendingMessages().values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PendingMessage pendingMessage = (PendingMessage) obj;
            listCreateListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(pendingMessage.getPart(), i10 == clientState.getPendingMessages().size() + (-1), ConversationPartsReducerKt.isAdminOrAltParticipant(pendingMessage.getPart(), this.userIdentity.invoke()), null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(listPlus, size + i10), pendingMessage.getFailedImageUploadData(), pendingMessage.isFailed(), true));
            i10 = i11;
        }
        if (conversation != null) {
            List<Part> listParts2 = conversation.parts();
            if (!(listParts2 instanceof Collection) || !listParts2.isEmpty()) {
                Iterator<T> it2 = listParts2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z15 = false;
                        break;
                    }
                    Part part = (Part) it2.next();
                    String uuid = part.getUuid();
                    Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                    if (!StringsKt.w3(uuid) && Intrinsics.areEqual(part.getUuid(), clientState.getFinStreamingData().getClientAssignedUUID())) {
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            if (clientState.getFinStreamingData().isFinStreaming() && !z15 && (activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot()) != null && (streamingPart = activeBot.getStreamingPart()) != null) {
                listCreateListBuilder.add(new ContentRow.FinStreamingRow(clientState.getFinStreamingData().getBlocks(), streamingPart));
            }
        }
        if (clientState.getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
            listCreateListBuilder.add(new ContentRow.TypingIndicatorRow(clientState.getCurrentlyTypingState()));
        }
        if (conversation != null && (footerNotice = conversation.getFooterNotice()) != null) {
            String title = footerNotice.getTitle();
            String subtitle = footerNotice.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
            if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            } else {
                List<Avatar.Builder> list2 = avatars;
                listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it3.next()).build();
                    Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                    listEmptyList2.add(new AvatarWrapper(avatarBuild, false, 2, null));
                }
            }
            listCreateListBuilder.add(new ContentRow.FooterNoticeRow(new FooterNoticeState(title, subtitle, listEmptyList2)));
        }
        return new ConversationUiState.Content(topAppBarUiStateReduceTopAppBarUiState, CollectionsKt.build(listCreateListBuilder), bottomBarUiStateReduceComposerState, networkState, bottomSheetState, clientState.getFloatingIndicatorState(), teamPresenceStateReduceTeamPresenceState, clientState.getVoiceTranscriptionState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationReducer(@NotNull Function0<AppConfig> config, @NotNull Function0<? extends UserIdentity> userIdentity, @NotNull TimeProvider timeProvider, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.userIdentity = userIdentity;
        this.timeProvider = timeProvider;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ ConversationReducer(Function0 function0, Function0 function1, TimeProvider timeProvider, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: xh.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationReducer._init_$lambda$0();
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: xh.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationReducer._init_$lambda$1();
            }
        } : function1, (i10 & 4) != 0 ? TimeProvider.SYSTEM : timeProvider, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
