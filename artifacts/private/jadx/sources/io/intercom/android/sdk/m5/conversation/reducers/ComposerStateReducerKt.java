package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.PrivacyNotice;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nComposerStateReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerStateReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ComposerStateReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1755#2,3:180\n1#3:183\n*S KotlinDebug\n*F\n+ 1 ComposerStateReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ComposerStateReducerKt\n*L\n99#1:180,3\n*E\n"})
public final class ComposerStateReducerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEndedButton.Reason.values().length];
            try {
                iArr[ConversationEndedButton.Reason.MERGED_INTO_CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final BottomBarUiState.BottomBadgeState reduceBottomBadge(ConversationClientState conversationClientState) {
        PoweredBy poweredBy;
        if (conversationClientState.getConversation() == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            poweredBy = openMessengerResponse != null ? openMessengerResponse.getPoweredBy() : null;
        } else {
            poweredBy = conversationClientState.getConversation().getPoweredBy();
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        PrivacyNotice privacyNotice = openMessengerResponse2 != null ? openMessengerResponse2.getPrivacyNotice() : null;
        if (privacyNotice == null || privacyNotice.isDismissed() || conversationClientState.hasUserSentAMessage$intercom_sdk_base_release() || conversationClientState.getDismissedPrivacyNotice()) {
            return poweredBy != null ? new BottomBarUiState.BottomBadgeState.PoweredByBadgeState(poweredBy) : BottomBarUiState.BottomBadgeState.None.INSTANCE;
        }
        return new BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState(privacyNotice.getText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v11, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v12, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden] */
    /* JADX WARN: Type inference failed for: r14v5, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions] */
    /* JADX WARN: Type inference failed for: r14v6, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded] */
    @NotNull
    public static final BottomBarUiState reduceComposerState(@NotNull ConversationClientState clientState, @NotNull AppConfig config, boolean z10) {
        ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta;
        ComposerState hidden;
        ?? reactions;
        ComposerState composerStateCopy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        io.intercom.android.sdk.models.ComposerState composerState;
        ComposerSuggestions composerSuggestions;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(config, "config");
        Conversation conversation = clientState.getConversation();
        boolean z11 = false;
        placeholder = null;
        String placeholder = null;
        if (conversation == null) {
            OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
            if (openMessengerResponse == null || (composerSuggestions = openMessengerResponse.getComposerSuggestions()) == null || !composerSuggestions.isComposerDisabled()) {
                ComposerState composerState2 = clientState.getComposerState();
                OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
                if (openMessengerResponse2 != null && (composerState = openMessengerResponse2.getComposerState()) != null) {
                    placeholder = composerState.getPlaceholder();
                }
                reactions = reduceTextInput(composerState2, z10, placeholder, false, reduceTextInputButtons(config));
            } else {
                reactions = new ComposerState.Hidden(false, 1, null);
            }
        } else {
            boolean z12 = AppConfigExtensionsKt.canStartNewConversation(config) && !conversation.getInboundConversationsDisabled();
            OpenMessengerResponse openMessengerResponse3 = clientState.getOpenMessengerResponse();
            OpenMessengerResponse.NewConversationData.Cta cta = (openMessengerResponse3 == null || (newConversationData = openMessengerResponse3.getNewConversationData()) == null) ? null : newConversationData.getCta();
            if (!z12 || cta == null) {
                conversationEndedCta = null;
            } else {
                StringProvider.ActualString actualString = new StringProvider.ActualString(cta.getText());
                Integer icon = cta.getIcon().getIcon();
                conversationEndedCta = new ComposerState.ConversationEnded.ConversationEndedCta(actualString, icon != null ? icon.intValue() : R.drawable.intercom_send_message_icon, null, 4, null);
            }
            boolean zIsNull = ReactionReply.isNull(conversation.lastPart().getReactionReply());
            if (conversation.getPreventEndUserReplies()) {
                reactions = new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), conversationEndedCta);
                ConversationEndedButton conversationEndedButton = conversation.getConversationEndedButton();
                if (conversationEndedButton != null) {
                    if (WhenMappings.$EnumSwitchMapping$0[conversationEndedButton.getReason().ordinal()] == 1) {
                        hidden = reactions.copy(new StringProvider.ActualString(conversationEndedButton.getMessage()), conversationEndedButton.getMetadata() != null ? new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString(conversationEndedButton.getCtaTitle()), R.drawable.intercom_send_message_icon, conversationEndedButton.getMetadata().getMergedIntoConversationId()) : null);
                    } else {
                        composerStateCopy$default = ComposerState.ConversationEnded.copy$default(reactions, new StringProvider.ActualString(conversationEndedButton.getMessage()), null, 2, null);
                    }
                    if (hidden != null) {
                        hidden = composerStateCopy$default;
                        reactions = hidden;
                    }
                }
            } else if (conversation.getComposerState().isVisible() && zIsNull) {
                reactions = reduceTextInput(clientState.getComposerState(), z10, conversation.getComposerState().getPlaceholder(), conversation.getComposerState().isDisabled(), reduceTextInputButtons(config));
            } else if (zIsNull) {
                List<Part> listParts = conversation.parts();
                if (!(listParts instanceof Collection) || !listParts.isEmpty()) {
                    Iterator it = listParts.iterator();
                    while (it.hasNext()) {
                        if (((Part) it.next()).getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR) {
                            z11 = true;
                            break;
                        }
                    }
                }
                hidden = new ComposerState.Hidden(!z11);
                hidden = composerStateCopy$default;
                reactions = hidden;
            } else {
                ReactionReply reactionReply = conversation.lastPart().getReactionReply();
                Intrinsics.checkNotNullExpressionValue(reactionReply, "getReactionReply(...)");
                String id2 = conversation.lastPart().getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                reactions = new ComposerState.Reactions(reactionReply, id2, conversation.getId());
            }
        }
        hidden = composerStateCopy$default;
        return new BottomBarUiState(reactions, clientState.getCurrentlyTypingState(), new InputTypeState(config.getAttachmentSettings().getMediaEnabled(), config.getAttachmentSettings().getGifsEnabled(), config.getAttachmentSettings().getCameraEnabled(), config.getAttachmentSettings().getFilesEnabled(), config.getAttachmentSettings().getTrustedFileExtensions()), reduceBottomBadge(clientState));
    }

    private static final ComposerState reduceTextInput(ComposerState composerState, boolean z10, String str, boolean z11, List<? extends BottomBarUiState.BottomBarButton> list) {
        if (composerState instanceof ComposerState.TextInput) {
            ComposerState.TextInput textInput = (ComposerState.TextInput) composerState;
            composerState = ComposerState.TextInput.copy$default(textInput, z10 ? textInput.getInitialMessage() : "", str != null ? new StringProvider.ActualString(str) : new StringProvider.StringRes(R.string.intercom_message_placeholder, null, 2, null), z11, list, null, 16, null);
        }
        return composerState;
    }

    private static final List<BottomBarUiState.BottomBarButton> reduceTextInputButtons(AppConfig appConfig) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (appConfig.getAttachmentSettings().getGifsEnabled()) {
            listCreateListBuilder.add(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getVoiceNotesEnabled()) {
            listCreateListBuilder.add(BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getMediaEnabled() || appConfig.getAttachmentSettings().getCameraEnabled() || appConfig.getAttachmentSettings().getFilesEnabled()) {
            listCreateListBuilder.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
