package io.intercom.android.sdk.m5.conversation.states;

import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ComposerState {

    @w0(parameters = 1)
    public static final class Hidden implements ComposerState {
        public static final int $stable = 0;
        private final boolean hideKeyboard;

        public Hidden() {
            this(false, 1, null);
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = hidden.hideKeyboard;
            }
            return hidden.copy(z10);
        }

        public final boolean component1() {
            return this.hideKeyboard;
        }

        @NotNull
        public final Hidden copy(boolean z10) {
            return new Hidden(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hidden) && this.hideKeyboard == ((Hidden) obj).hideKeyboard;
        }

        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideKeyboard);
        }

        @NotNull
        public String toString() {
            return "Hidden(hideKeyboard=" + this.hideKeyboard + ')';
        }

        public Hidden(boolean z10) {
            this.hideKeyboard = z10;
        }

        public /* synthetic */ Hidden(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @w0(parameters = 0)
    public static final class Reactions implements ComposerState {
        public static final int $stable = 8;

        @NotNull
        private final String conversationId;

        @NotNull
        private final String lastPartId;

        @NotNull
        private final ReactionReply reactionReply;

        public Reactions(@NotNull ReactionReply reactionReply, @NotNull String lastPartId, @NotNull String conversationId) {
            Intrinsics.checkNotNullParameter(reactionReply, "reactionReply");
            Intrinsics.checkNotNullParameter(lastPartId, "lastPartId");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            this.reactionReply = reactionReply;
            this.lastPartId = lastPartId;
            this.conversationId = conversationId;
        }

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionReply reactionReply, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                reactionReply = reactions.reactionReply;
            }
            if ((i10 & 2) != 0) {
                str = reactions.lastPartId;
            }
            if ((i10 & 4) != 0) {
                str2 = reactions.conversationId;
            }
            return reactions.copy(reactionReply, str, str2);
        }

        @NotNull
        public final ReactionReply component1() {
            return this.reactionReply;
        }

        @NotNull
        public final String component2() {
            return this.lastPartId;
        }

        @NotNull
        public final String component3() {
            return this.conversationId;
        }

        @NotNull
        public final Reactions copy(@NotNull ReactionReply reactionReply, @NotNull String lastPartId, @NotNull String conversationId) {
            Intrinsics.checkNotNullParameter(reactionReply, "reactionReply");
            Intrinsics.checkNotNullParameter(lastPartId, "lastPartId");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            return new Reactions(reactionReply, lastPartId, conversationId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) obj;
            return Intrinsics.areEqual(this.reactionReply, reactions.reactionReply) && Intrinsics.areEqual(this.lastPartId, reactions.lastPartId) && Intrinsics.areEqual(this.conversationId, reactions.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getLastPartId() {
            return this.lastPartId;
        }

        @NotNull
        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        public int hashCode() {
            return (((this.reactionReply.hashCode() * 31) + this.lastPartId.hashCode()) * 31) + this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Reactions(reactionReply=" + this.reactionReply + ", lastPartId=" + this.lastPartId + ", conversationId=" + this.conversationId + ')';
        }
    }

    @w0(parameters = 0)
    public static final class ConversationEnded implements ComposerState {
        public static final int $stable = StringProvider.$stable;

        @Nullable
        private final ConversationEndedCta cta;

        @NotNull
        private final StringProvider message;

        public ConversationEnded(@NotNull StringProvider message, @Nullable ConversationEndedCta conversationEndedCta) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cta = conversationEndedCta;
        }

        public static /* synthetic */ ConversationEnded copy$default(ConversationEnded conversationEnded, StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                stringProvider = conversationEnded.message;
            }
            if ((i10 & 2) != 0) {
                conversationEndedCta = conversationEnded.cta;
            }
            return conversationEnded.copy(stringProvider, conversationEndedCta);
        }

        @NotNull
        public final StringProvider component1() {
            return this.message;
        }

        @Nullable
        public final ConversationEndedCta component2() {
            return this.cta;
        }

        @NotNull
        public final ConversationEnded copy(@NotNull StringProvider message, @Nullable ConversationEndedCta conversationEndedCta) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ConversationEnded(message, conversationEndedCta);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationEnded)) {
                return false;
            }
            ConversationEnded conversationEnded = (ConversationEnded) obj;
            return Intrinsics.areEqual(this.message, conversationEnded.message) && Intrinsics.areEqual(this.cta, conversationEnded.cta);
        }

        @Nullable
        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        @NotNull
        public final StringProvider getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            ConversationEndedCta conversationEndedCta = this.cta;
            return iHashCode + (conversationEndedCta == null ? 0 : conversationEndedCta.hashCode());
        }

        @NotNull
        public String toString() {
            return "ConversationEnded(message=" + this.message + ", cta=" + this.cta + ')';
        }

        @w0(parameters = 0)
        public static final class ConversationEndedCta {
            public static final int $stable = StringProvider.$stable;

            @Nullable
            private final String linkedConversationId;

            @NotNull
            private final StringProvider title;
            private final int trailingIcon;

            public ConversationEndedCta(@NotNull StringProvider title, @v int i10, @Nullable String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.trailingIcon = i10;
                this.linkedConversationId = str;
            }

            public static /* synthetic */ ConversationEndedCta copy$default(ConversationEndedCta conversationEndedCta, StringProvider stringProvider, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    stringProvider = conversationEndedCta.title;
                }
                if ((i11 & 2) != 0) {
                    i10 = conversationEndedCta.trailingIcon;
                }
                if ((i11 & 4) != 0) {
                    str = conversationEndedCta.linkedConversationId;
                }
                return conversationEndedCta.copy(stringProvider, i10, str);
            }

            @NotNull
            public final StringProvider component1() {
                return this.title;
            }

            public final int component2() {
                return this.trailingIcon;
            }

            @Nullable
            public final String component3() {
                return this.linkedConversationId;
            }

            @NotNull
            public final ConversationEndedCta copy(@NotNull StringProvider title, @v int i10, @Nullable String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new ConversationEndedCta(title, i10, str);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConversationEndedCta)) {
                    return false;
                }
                ConversationEndedCta conversationEndedCta = (ConversationEndedCta) obj;
                return Intrinsics.areEqual(this.title, conversationEndedCta.title) && this.trailingIcon == conversationEndedCta.trailingIcon && Intrinsics.areEqual(this.linkedConversationId, conversationEndedCta.linkedConversationId);
            }

            @Nullable
            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }

            @NotNull
            public final StringProvider getTitle() {
                return this.title;
            }

            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            public int hashCode() {
                int iHashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.trailingIcon)) * 31;
                String str = this.linkedConversationId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "ConversationEndedCta(title=" + this.title + ", trailingIcon=" + this.trailingIcon + ", linkedConversationId=" + this.linkedConversationId + ')';
            }

            public /* synthetic */ ConversationEndedCta(StringProvider stringProvider, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringProvider, i10, (i11 & 4) != 0 ? null : str);
            }
        }

        public /* synthetic */ ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringProvider, (i10 & 2) != 0 ? null : conversationEndedCta);
        }
    }

    @w0(parameters = 0)
    public static final class TextInput implements ComposerState {
        public static final int $stable = 8;

        @NotNull
        private final List<BottomBarUiState.BottomBarButton> buttons;

        @NotNull
        private final StringProvider hintText;

        @NotNull
        private final String initialMessage;

        @NotNull
        private final ComposerInputType inputType;
        private final boolean isDisabled;

        /* JADX WARN: Multi-variable type inference failed */
        public TextInput(@NotNull String initialMessage, @NotNull StringProvider hintText, boolean z10, @NotNull List<? extends BottomBarUiState.BottomBarButton> buttons, @NotNull ComposerInputType inputType) {
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            this.initialMessage = initialMessage;
            this.hintText = hintText;
            this.isDisabled = z10;
            this.buttons = buttons;
            this.inputType = inputType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, StringProvider stringProvider, boolean z10, List list, ComposerInputType composerInputType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textInput.initialMessage;
            }
            if ((i10 & 2) != 0) {
                stringProvider = textInput.hintText;
            }
            if ((i10 & 4) != 0) {
                z10 = textInput.isDisabled;
            }
            if ((i10 & 8) != 0) {
                list = textInput.buttons;
            }
            if ((i10 & 16) != 0) {
                composerInputType = textInput.inputType;
            }
            ComposerInputType composerInputType2 = composerInputType;
            boolean z11 = z10;
            return textInput.copy(str, stringProvider, z11, list, composerInputType2);
        }

        @NotNull
        public final String component1() {
            return this.initialMessage;
        }

        @NotNull
        public final StringProvider component2() {
            return this.hintText;
        }

        public final boolean component3() {
            return this.isDisabled;
        }

        @NotNull
        public final List<BottomBarUiState.BottomBarButton> component4() {
            return this.buttons;
        }

        @NotNull
        public final ComposerInputType component5() {
            return this.inputType;
        }

        @NotNull
        public final TextInput copy(@NotNull String initialMessage, @NotNull StringProvider hintText, boolean z10, @NotNull List<? extends BottomBarUiState.BottomBarButton> buttons, @NotNull ComposerInputType inputType) {
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            return new TextInput(initialMessage, hintText, z10, buttons, inputType);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) obj;
            return Intrinsics.areEqual(this.initialMessage, textInput.initialMessage) && Intrinsics.areEqual(this.hintText, textInput.hintText) && this.isDisabled == textInput.isDisabled && Intrinsics.areEqual(this.buttons, textInput.buttons) && Intrinsics.areEqual(this.inputType, textInput.inputType);
        }

        @NotNull
        public final List<BottomBarUiState.BottomBarButton> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final StringProvider getHintText() {
            return this.hintText;
        }

        @NotNull
        public final String getInitialMessage() {
            return this.initialMessage;
        }

        @NotNull
        public final ComposerInputType getInputType() {
            return this.inputType;
        }

        public int hashCode() {
            return (((((((this.initialMessage.hashCode() * 31) + this.hintText.hashCode()) * 31) + Boolean.hashCode(this.isDisabled)) * 31) + this.buttons.hashCode()) * 31) + this.inputType.hashCode();
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            return "TextInput(initialMessage=" + this.initialMessage + ", hintText=" + this.hintText + ", isDisabled=" + this.isDisabled + ", buttons=" + this.buttons + ", inputType=" + this.inputType + ')';
        }

        public /* synthetic */ TextInput(String str, StringProvider stringProvider, boolean z10, List list, ComposerInputType composerInputType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringProvider, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list, (i10 & 16) != 0 ? ComposerInputType.Text.INSTANCE : composerInputType);
        }
    }
}
