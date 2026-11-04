package io.intercom.android.sdk.helpcenter.articles;

import androidx.annotation.d0;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ArticleViewState {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class Content extends ArticleViewState {
        public static final int $stable = 0;

        @Nullable
        private final ArticleMetadata articleMetadata;

        @NotNull
        private final String articleUrl;

        @NotNull
        private final ReactionState reactionState;

        @NotNull
        private final TeamPresenceState teamPresenceState;

        @NotNull
        private final WebViewStatus webViewStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull String articleUrl, @Nullable ArticleMetadata articleMetadata, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.checkNotNullParameter(articleUrl, "articleUrl");
            Intrinsics.checkNotNullParameter(webViewStatus, "webViewStatus");
            Intrinsics.checkNotNullParameter(reactionState, "reactionState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            this.articleUrl = articleUrl;
            this.articleMetadata = articleMetadata;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i10 & 2) != 0) {
                articleMetadata = content.articleMetadata;
            }
            if ((i10 & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            if ((i10 & 8) != 0) {
                reactionState = content.reactionState;
            }
            if ((i10 & 16) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            WebViewStatus webViewStatus2 = webViewStatus;
            return content.copy(str, articleMetadata, webViewStatus2, reactionState, teamPresenceState2);
        }

        @NotNull
        public final String component1() {
            return this.articleUrl;
        }

        @Nullable
        public final ArticleMetadata component2() {
            return this.articleMetadata;
        }

        @NotNull
        public final WebViewStatus component3() {
            return this.webViewStatus;
        }

        @NotNull
        public final ReactionState component4() {
            return this.reactionState;
        }

        @NotNull
        public final TeamPresenceState component5() {
            return this.teamPresenceState;
        }

        @NotNull
        public final Content copy(@NotNull String articleUrl, @Nullable ArticleMetadata articleMetadata, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(articleUrl, "articleUrl");
            Intrinsics.checkNotNullParameter(webViewStatus, "webViewStatus");
            Intrinsics.checkNotNullParameter(reactionState, "reactionState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            return new Content(articleUrl, articleMetadata, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.articleUrl, content.articleUrl) && Intrinsics.areEqual(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && Intrinsics.areEqual(this.reactionState, content.reactionState) && Intrinsics.areEqual(this.teamPresenceState, content.teamPresenceState);
        }

        @Nullable
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @NotNull
        public final String getArticleUrl() {
            return this.articleUrl;
        }

        @NotNull
        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        @NotNull
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int iHashCode = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata = this.articleMetadata;
            return ((((((iHashCode + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31) + this.webViewStatus.hashCode()) * 31) + this.reactionState.hashCode()) * 31) + this.teamPresenceState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(@f1 int i10, int i11, int i12) {
            super(null);
            this.message = i10;
            this.retryButtonVisibility = i11;
            this.retryButtonPrimaryColor = i12;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = error.message;
            }
            if ((i13 & 2) != 0) {
                i11 = error.retryButtonVisibility;
            }
            if ((i13 & 4) != 0) {
                i12 = error.retryButtonPrimaryColor;
            }
            return error.copy(i10, i11, i12);
        }

        public final int component1() {
            return this.message;
        }

        public final int component2() {
            return this.retryButtonVisibility;
        }

        public final int component3() {
            return this.retryButtonPrimaryColor;
        }

        @NotNull
        public final Error copy(@f1 int i10, int i11, int i12) {
            return new Error(i10, i11, i12);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.message) * 31) + Integer.hashCode(this.retryButtonVisibility)) * 31) + Integer.hashCode(this.retryButtonPrimaryColor);
        }

        @NotNull
        public String toString() {
            return "Error(message=" + this.message + ", retryButtonVisibility=" + this.retryButtonVisibility + ", retryButtonPrimaryColor=" + this.retryButtonPrimaryColor + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    public enum Reaction {
        None,
        Sad,
        Neutral,
        Happy;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static kotlin.enums.a<Reaction> getEntries() {
            return $ENTRIES;
        }
    }

    public enum WebViewStatus {
        Idle,
        Loading,
        Ready;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static kotlin.enums.a<WebViewStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ ArticleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ArticleViewState() {
    }

    @w0(parameters = 1)
    public static final class ConversationState {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(@NotNull String conversationId, @f1 int i10) {
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            this.conversationId = conversationId;
            this.messageButtonText = i10;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i11 & 2) != 0) {
                i10 = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i10);
        }

        @NotNull
        public final String component1() {
            return this.conversationId;
        }

        public final int component2() {
            return this.messageButtonText;
        }

        @NotNull
        public final ConversationState copy(@NotNull String conversationId, @f1 int i10) {
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            return new ConversationState(conversationId, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) obj;
            return Intrinsics.areEqual(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return (this.conversationId.hashCode() * 31) + Integer.hashCode(this.messageButtonText);
        }

        @NotNull
        public String toString() {
            return "ConversationState(conversationId=" + this.conversationId + ", messageButtonText=" + this.messageButtonText + ')';
        }

        public /* synthetic */ ConversationState(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? R.string.intercom_continue_the_conversation : i10);
        }
    }

    @w0(parameters = 1)
    public static final class ReactionState {
        public static final int $stable = 0;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final ReactionState defaultReactionState = new ReactionState(8, R.id.start, null, 8, false, 4, null);
        private final int reactionComponentVisibility;

        @NotNull
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;
        private final int transitionState;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReactionState getDefaultReactionState() {
                return ReactionState.defaultReactionState;
            }

            private Companion() {
            }
        }

        public ReactionState(int i10, @d0 int i11, @NotNull Reaction selectedReaction, int i12, boolean z10) {
            Intrinsics.checkNotNullParameter(selectedReaction, "selectedReaction");
            this.reactionComponentVisibility = i10;
            this.transitionState = i11;
            this.selectedReaction = selectedReaction;
            this.teamHelpVisibility = i12;
            this.shouldScrollToBottom = z10;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = reactionState.reactionComponentVisibility;
            }
            if ((i13 & 2) != 0) {
                i11 = reactionState.transitionState;
            }
            if ((i13 & 4) != 0) {
                reaction = reactionState.selectedReaction;
            }
            if ((i13 & 8) != 0) {
                i12 = reactionState.teamHelpVisibility;
            }
            if ((i13 & 16) != 0) {
                z10 = reactionState.shouldScrollToBottom;
            }
            boolean z11 = z10;
            Reaction reaction2 = reaction;
            return reactionState.copy(i10, i11, reaction2, i12, z11);
        }

        public final int component1() {
            return this.reactionComponentVisibility;
        }

        public final int component2() {
            return this.transitionState;
        }

        @NotNull
        public final Reaction component3() {
            return this.selectedReaction;
        }

        public final int component4() {
            return this.teamHelpVisibility;
        }

        public final boolean component5() {
            return this.shouldScrollToBottom;
        }

        @NotNull
        public final ReactionState copy(int i10, @d0 int i11, @NotNull Reaction selectedReaction, int i12, boolean z10) {
            Intrinsics.checkNotNullParameter(selectedReaction, "selectedReaction");
            return new ReactionState(i10, i11, selectedReaction, i12, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) obj;
            return this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.transitionState == reactionState.transitionState && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        @NotNull
        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public final int getTransitionState() {
            return this.transitionState;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.reactionComponentVisibility) * 31) + Integer.hashCode(this.transitionState)) * 31) + this.selectedReaction.hashCode()) * 31) + Integer.hashCode(this.teamHelpVisibility)) * 31) + Boolean.hashCode(this.shouldScrollToBottom);
        }

        @NotNull
        public String toString() {
            return "ReactionState(reactionComponentVisibility=" + this.reactionComponentVisibility + ", transitionState=" + this.transitionState + ", selectedReaction=" + this.selectedReaction + ", teamHelpVisibility=" + this.teamHelpVisibility + ", shouldScrollToBottom=" + this.shouldScrollToBottom + ')';
        }

        public /* synthetic */ ReactionState(int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i13 & 4) != 0 ? Reaction.None : reaction, i12, z10);
        }
    }

    @w0(parameters = 1)
    public static final class TeamPresenceState {
        public static final int $stable = 0;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final TeamPresenceState defaultTeamPresenceState;

        @Nullable
        private final ArticleMetadata articleMetadata;

        @Nullable
        private final ConversationState conversationState;

        @Nullable
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;

        @NotNull
        private final String metricContext;

        @NotNull
        private final String metricPlace;

        @Nullable
        private final Integer subtitleText;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.defaultTeamPresenceState;
            }

            private Companion() {
            }
        }

        static {
            ArticleMetadata articleMetadata = null;
            ConversationState conversationState = null;
            defaultTeamPresenceState = new TeamPresenceState(articleMetadata, conversationState, Integer.valueOf(R.string.intercom_the_team_can_help_if_needed), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, null, 512, null);
        }

        public TeamPresenceState(@Nullable ArticleMetadata articleMetadata, @Nullable ConversationState conversationState, @f1 @Nullable Integer num, @f1 int i10, @androidx.annotation.v int i11, @androidx.annotation.l int i12, @NotNull String metricPlace, @NotNull String metricContext, boolean z10, @Nullable OpenMessengerResponse.NewConversationData.Cta cta) {
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            Intrinsics.checkNotNullParameter(metricContext, "metricContext");
            this.articleMetadata = articleMetadata;
            this.conversationState = conversationState;
            this.subtitleText = num;
            this.messageButtonText = i10;
            this.messageButtonIcon = i11;
            this.messageButtonColor = i12;
            this.metricPlace = metricPlace;
            this.metricContext = metricContext;
            this.isFromSearchBrowse = z10;
            this.ctaData = cta;
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                articleMetadata = teamPresenceState.articleMetadata;
            }
            if ((i13 & 2) != 0) {
                conversationState = teamPresenceState.conversationState;
            }
            if ((i13 & 4) != 0) {
                num = teamPresenceState.subtitleText;
            }
            if ((i13 & 8) != 0) {
                i10 = teamPresenceState.messageButtonText;
            }
            if ((i13 & 16) != 0) {
                i11 = teamPresenceState.messageButtonIcon;
            }
            if ((i13 & 32) != 0) {
                i12 = teamPresenceState.messageButtonColor;
            }
            if ((i13 & 64) != 0) {
                str = teamPresenceState.metricPlace;
            }
            if ((i13 & 128) != 0) {
                str2 = teamPresenceState.metricContext;
            }
            if ((i13 & 256) != 0) {
                z10 = teamPresenceState.isFromSearchBrowse;
            }
            if ((i13 & 512) != 0) {
                cta = teamPresenceState.ctaData;
            }
            boolean z11 = z10;
            OpenMessengerResponse.NewConversationData.Cta cta2 = cta;
            String str3 = str;
            String str4 = str2;
            int i14 = i11;
            int i15 = i12;
            return teamPresenceState.copy(articleMetadata, conversationState, num, i10, i14, i15, str3, str4, z11, cta2);
        }

        @Nullable
        public final ArticleMetadata component1() {
            return this.articleMetadata;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.Cta component10() {
            return this.ctaData;
        }

        @Nullable
        public final ConversationState component2() {
            return this.conversationState;
        }

        @Nullable
        public final Integer component3() {
            return this.subtitleText;
        }

        public final int component4() {
            return this.messageButtonText;
        }

        public final int component5() {
            return this.messageButtonIcon;
        }

        public final int component6() {
            return this.messageButtonColor;
        }

        @NotNull
        public final String component7() {
            return this.metricPlace;
        }

        @NotNull
        public final String component8() {
            return this.metricContext;
        }

        public final boolean component9() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public final TeamPresenceState copy(@Nullable ArticleMetadata articleMetadata, @Nullable ConversationState conversationState, @f1 @Nullable Integer num, @f1 int i10, @androidx.annotation.v int i11, @androidx.annotation.l int i12, @NotNull String metricPlace, @NotNull String metricContext, boolean z10, @Nullable OpenMessengerResponse.NewConversationData.Cta cta) {
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            Intrinsics.checkNotNullParameter(metricContext, "metricContext");
            return new TeamPresenceState(articleMetadata, conversationState, num, i10, i11, i12, metricPlace, metricContext, z10, cta);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) obj;
            return Intrinsics.areEqual(this.articleMetadata, teamPresenceState.articleMetadata) && Intrinsics.areEqual(this.conversationState, teamPresenceState.conversationState) && Intrinsics.areEqual(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && Intrinsics.areEqual(this.metricPlace, teamPresenceState.metricPlace) && Intrinsics.areEqual(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && Intrinsics.areEqual(this.ctaData, teamPresenceState.ctaData);
        }

        @Nullable
        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        @Nullable
        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        @NotNull
        public final String getMetricContext() {
            return this.metricContext;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Nullable
        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            ArticleMetadata articleMetadata = this.articleMetadata;
            int iHashCode = (articleMetadata == null ? 0 : articleMetadata.hashCode()) * 31;
            ConversationState conversationState = this.conversationState;
            int iHashCode2 = (iHashCode + (conversationState == null ? 0 : conversationState.hashCode())) * 31;
            Integer num = this.subtitleText;
            int iHashCode3 = (((((((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.messageButtonText)) * 31) + Integer.hashCode(this.messageButtonIcon)) * 31) + Integer.hashCode(this.messageButtonColor)) * 31) + this.metricPlace.hashCode()) * 31) + this.metricContext.hashCode()) * 31) + Boolean.hashCode(this.isFromSearchBrowse)) * 31;
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            return iHashCode3 + (cta != null ? cta.hashCode() : 0);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        public /* synthetic */ TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(articleMetadata, conversationState, num, i10, i11, i12, str, str2, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? null : cta);
        }
    }
}
