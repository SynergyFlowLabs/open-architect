package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class TopBarState {
    public static final int $stable = 0;

    public /* synthetic */ TopBarState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract TopBarState enableDismissButton();

    @NotNull
    public abstract ProgressBarState getProgressBarState();

    public abstract boolean getShowDismissButton();

    @NotNull
    public abstract SurveyUiColors getSurveyUiColors();

    @NotNull
    public abstract TopBarState withProgressBarState(@NotNull ProgressBarState progressBarState);

    @w0(parameters = 1)
    public static final class NoTopBarState extends TopBarState {
        public static final int $stable = 0;

        @NotNull
        private final ProgressBarState progressBarState;
        private final boolean showDismissButton;

        @NotNull
        private final SurveyUiColors surveyUiColors;

        public /* synthetic */ NoTopBarState(boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, surveyUiColors, (i10 & 4) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }

        public static /* synthetic */ NoTopBarState copy$default(NoTopBarState noTopBarState, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = noTopBarState.showDismissButton;
            }
            if ((i10 & 2) != 0) {
                surveyUiColors = noTopBarState.surveyUiColors;
            }
            if ((i10 & 4) != 0) {
                progressBarState = noTopBarState.progressBarState;
            }
            return noTopBarState.copy(z10, surveyUiColors, progressBarState);
        }

        public final boolean component1() {
            return this.showDismissButton;
        }

        @NotNull
        public final SurveyUiColors component2() {
            return this.surveyUiColors;
        }

        @NotNull
        public final ProgressBarState component3() {
            return this.progressBarState;
        }

        @NotNull
        public final NoTopBarState copy(boolean z10, @NotNull SurveyUiColors surveyUiColors, @NotNull ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return new NoTopBarState(z10, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public TopBarState enableDismissButton() {
            return copy$default(this, true, null, null, 6, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoTopBarState)) {
                return false;
            }
            NoTopBarState noTopBarState = (NoTopBarState) obj;
            return this.showDismissButton == noTopBarState.showDismissButton && Intrinsics.areEqual(this.surveyUiColors, noTopBarState.surveyUiColors) && Intrinsics.areEqual(this.progressBarState, noTopBarState.progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.showDismissButton) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoTopBarState(showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public TopBarState withProgressBarState(@NotNull ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return copy$default(this, false, null, progressBarState, 3, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoTopBarState(boolean z10, @NotNull SurveyUiColors surveyUiColors, @NotNull ProgressBarState progressBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }
    }

    @w0(parameters = 0)
    public static final class SenderTopBarState extends TopBarState {
        public static final int $stable = 8;

        @NotNull
        private final AppConfig appConfig;

        @NotNull
        private final Avatar avatar;

        @NotNull
        private final ProgressBarState progressBarState;

        @NotNull
        private final String senderName;
        private final boolean showDismissButton;

        @NotNull
        private final SurveyUiColors surveyUiColors;

        public /* synthetic */ SenderTopBarState(Avatar avatar, String str, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(avatar, str, appConfig, z10, surveyUiColors, (i10 & 32) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }

        public static /* synthetic */ SenderTopBarState copy$default(SenderTopBarState senderTopBarState, Avatar avatar, String str, AppConfig appConfig, boolean z10, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatar = senderTopBarState.avatar;
            }
            if ((i10 & 2) != 0) {
                str = senderTopBarState.senderName;
            }
            if ((i10 & 4) != 0) {
                appConfig = senderTopBarState.appConfig;
            }
            if ((i10 & 8) != 0) {
                z10 = senderTopBarState.showDismissButton;
            }
            if ((i10 & 16) != 0) {
                surveyUiColors = senderTopBarState.surveyUiColors;
            }
            if ((i10 & 32) != 0) {
                progressBarState = senderTopBarState.progressBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            ProgressBarState progressBarState2 = progressBarState;
            return senderTopBarState.copy(avatar, str, appConfig, z10, surveyUiColors2, progressBarState2);
        }

        @NotNull
        public final Avatar component1() {
            return this.avatar;
        }

        @NotNull
        public final String component2() {
            return this.senderName;
        }

        @NotNull
        public final AppConfig component3() {
            return this.appConfig;
        }

        public final boolean component4() {
            return this.showDismissButton;
        }

        @NotNull
        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        @NotNull
        public final ProgressBarState component6() {
            return this.progressBarState;
        }

        @NotNull
        public final SenderTopBarState copy(@NotNull Avatar avatar, @NotNull String senderName, @NotNull AppConfig appConfig, boolean z10, @NotNull SurveyUiColors surveyUiColors, @NotNull ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(senderName, "senderName");
            Intrinsics.checkNotNullParameter(appConfig, "appConfig");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return new SenderTopBarState(avatar, senderName, appConfig, z10, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public TopBarState enableDismissButton() {
            return copy$default(this, null, null, null, true, null, null, 55, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SenderTopBarState)) {
                return false;
            }
            SenderTopBarState senderTopBarState = (SenderTopBarState) obj;
            return Intrinsics.areEqual(this.avatar, senderTopBarState.avatar) && Intrinsics.areEqual(this.senderName, senderTopBarState.senderName) && Intrinsics.areEqual(this.appConfig, senderTopBarState.appConfig) && this.showDismissButton == senderTopBarState.showDismissButton && Intrinsics.areEqual(this.surveyUiColors, senderTopBarState.surveyUiColors) && Intrinsics.areEqual(this.progressBarState, senderTopBarState.progressBarState);
        }

        @NotNull
        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        @NotNull
        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        @NotNull
        public final String getSenderName() {
            return this.senderName;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return (((((((((this.avatar.hashCode() * 31) + this.senderName.hashCode()) * 31) + this.appConfig.hashCode()) * 31) + Boolean.hashCode(this.showDismissButton)) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        @NotNull
        public String toString() {
            return "SenderTopBarState(avatar=" + this.avatar + ", senderName=" + this.senderName + ", appConfig=" + this.appConfig + ", showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        @NotNull
        public TopBarState withProgressBarState(@NotNull ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return copy$default(this, null, null, null, false, null, progressBarState, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderTopBarState(@NotNull Avatar avatar, @NotNull String senderName, @NotNull AppConfig appConfig, boolean z10, @NotNull SurveyUiColors surveyUiColors, @NotNull ProgressBarState progressBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(senderName, "senderName");
            Intrinsics.checkNotNullParameter(appConfig, "appConfig");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            this.avatar = avatar;
            this.senderName = senderName;
            this.appConfig = appConfig;
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }
    }

    private TopBarState() {
    }
}
