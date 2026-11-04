package io.intercom.android.sdk.helpcenter.component;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.TeamPresence;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TeammateHelpKt {
    @NotNull
    public static final ArticleViewState.TeamPresenceState computeViewState(@Nullable ArticleMetadata articleMetadata, @NotNull ArticleViewState.TeamPresenceState currentState, @NotNull TeamPresence teamPresence, @NotNull AppConfig appConfig, @NotNull String metricPlace, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        int messageButtonText = currentState.getMessageButtonText();
        int messageButtonIcon = currentState.getMessageButtonIcon();
        Integer subtitleText = currentState.getSubtitleText();
        ActiveBot activeBot = teamPresence.getActiveBot();
        if (activeBot == null || !activeBot.getUseBotUx()) {
            str = MetricTracker.Context.STYLE_HUMAN;
        } else {
            messageButtonText = R.string.intercom_ask_a_question;
            messageButtonIcon = R.drawable.intercom_conversation_card_question;
            subtitleText = appConfig.isAccessToTeammateEnabled() ? Integer.valueOf(R.string.intercom_the_team_can_help_if_needed) : null;
            str = MetricTracker.Context.STYLE_BOT;
        }
        return ArticleViewState.TeamPresenceState.copy$default(currentState, articleMetadata, null, subtitleText, messageButtonText, messageButtonIcon, appConfig.getPrimaryColor(), metricPlace, str, z10, null, 514, null);
    }
}
