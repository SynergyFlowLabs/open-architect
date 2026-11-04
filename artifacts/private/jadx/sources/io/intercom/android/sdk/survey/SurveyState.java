package io.intercom.android.sdk.survey;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class SurveyState {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class Content extends SurveyState {
        public static final int $stable = 8;

        @NotNull
        private final PrimaryCta primaryCta;

        @NotNull
        private final List<QuestionState> questions;

        @NotNull
        private final List<SecondaryCta> secondaryCtaActions;

        @NotNull
        private final List<Block.Builder> stepTitle;

        @NotNull
        private final SurveyUiColors surveyUiColors;

        @NotNull
        private final TopBarState topBarState;

        @w0(parameters = 1)
        public static abstract class PrimaryCta {
            public static final int $stable = 0;

            @w0(parameters = 1)
            public static final class Custom extends PrimaryCta {
                public static final int $stable = 0;

                @NotNull
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(@NotNull String text) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = custom.text;
                    }
                    return custom.copy(str);
                }

                @NotNull
                public final String component1() {
                    return this.text;
                }

                @NotNull
                public final Custom copy(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Custom(text);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Custom) && Intrinsics.areEqual(this.text, ((Custom) obj).text);
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Custom(text=" + this.text + ')';
                }
            }

            @w0(parameters = 1)
            public static final class Fallback extends PrimaryCta {
                public static final int $stable = 0;
                private final int fallbackTextRes;

                public Fallback(@f1 int i10) {
                    super(null);
                    this.fallbackTextRes = i10;
                }

                public static /* synthetic */ Fallback copy$default(Fallback fallback, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = fallback.fallbackTextRes;
                    }
                    return fallback.copy(i10);
                }

                public final int component1() {
                    return this.fallbackTextRes;
                }

                @NotNull
                public final Fallback copy(@f1 int i10) {
                    return new Fallback(i10);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof Fallback) && this.fallbackTextRes == ((Fallback) obj).fallbackTextRes) {
                        return true;
                    }
                    return false;
                }

                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.fallbackTextRes);
                }

                @NotNull
                public String toString() {
                    return "Fallback(fallbackTextRes=" + this.fallbackTextRes + ')';
                }
            }

            public /* synthetic */ PrimaryCta(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private PrimaryCta() {
            }
        }

        @w0(parameters = 1)
        public static final class SecondaryCta {
            public static final int $stable = 0;

            @NotNull
            private final String buttonText;

            @NotNull
            private final String destination;
            private final boolean isExternalUrl;

            public SecondaryCta(@NotNull String buttonText, @NotNull String destination, boolean z10) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.buttonText = buttonText;
                this.destination = destination;
                this.isExternalUrl = z10;
            }

            public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, String str2, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = secondaryCta.buttonText;
                }
                if ((i10 & 2) != 0) {
                    str2 = secondaryCta.destination;
                }
                if ((i10 & 4) != 0) {
                    z10 = secondaryCta.isExternalUrl;
                }
                return secondaryCta.copy(str, str2, z10);
            }

            @NotNull
            public final String component1() {
                return this.buttonText;
            }

            @NotNull
            public final String component2() {
                return this.destination;
            }

            public final boolean component3() {
                return this.isExternalUrl;
            }

            @NotNull
            public final SecondaryCta copy(@NotNull String buttonText, @NotNull String destination, boolean z10) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(destination, "destination");
                return new SecondaryCta(buttonText, destination, z10);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryCta)) {
                    return false;
                }
                SecondaryCta secondaryCta = (SecondaryCta) obj;
                return Intrinsics.areEqual(this.buttonText, secondaryCta.buttonText) && Intrinsics.areEqual(this.destination, secondaryCta.destination) && this.isExternalUrl == secondaryCta.isExternalUrl;
            }

            @NotNull
            public final String getButtonText() {
                return this.buttonText;
            }

            @NotNull
            public final String getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return (((this.buttonText.hashCode() * 31) + this.destination.hashCode()) * 31) + Boolean.hashCode(this.isExternalUrl);
            }

            public final boolean isExternalUrl() {
                return this.isExternalUrl;
            }

            @NotNull
            public String toString() {
                return "SecondaryCta(buttonText=" + this.buttonText + ", destination=" + this.destination + ", isExternalUrl=" + this.isExternalUrl + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull List<Block.Builder> stepTitle, @NotNull List<QuestionState> questions, @NotNull List<SecondaryCta> secondaryCtaActions, @NotNull PrimaryCta primaryCta, @NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(stepTitle, "stepTitle");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(secondaryCtaActions, "secondaryCtaActions");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            this.stepTitle = stepTitle;
            this.questions = questions;
            this.secondaryCtaActions = secondaryCtaActions;
            this.primaryCta = primaryCta;
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, List list2, List list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.stepTitle;
            }
            if ((i10 & 2) != 0) {
                list2 = content.questions;
            }
            if ((i10 & 4) != 0) {
                list3 = content.secondaryCtaActions;
            }
            if ((i10 & 8) != 0) {
                primaryCta = content.primaryCta;
            }
            if ((i10 & 16) != 0) {
                surveyUiColors = content.surveyUiColors;
            }
            if ((i10 & 32) != 0) {
                topBarState = content.topBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            TopBarState topBarState2 = topBarState;
            return content.copy(list, list2, list3, primaryCta, surveyUiColors2, topBarState2);
        }

        @NotNull
        public final List<Block.Builder> component1() {
            return this.stepTitle;
        }

        @NotNull
        public final List<QuestionState> component2() {
            return this.questions;
        }

        @NotNull
        public final List<SecondaryCta> component3() {
            return this.secondaryCtaActions;
        }

        @NotNull
        public final PrimaryCta component4() {
            return this.primaryCta;
        }

        @NotNull
        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        @NotNull
        public final TopBarState component6() {
            return this.topBarState;
        }

        @NotNull
        public final Content copy(@NotNull List<Block.Builder> stepTitle, @NotNull List<QuestionState> questions, @NotNull List<SecondaryCta> secondaryCtaActions, @NotNull PrimaryCta primaryCta, @NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(stepTitle, "stepTitle");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(secondaryCtaActions, "secondaryCtaActions");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            return new Content(stepTitle, questions, secondaryCtaActions, primaryCta, surveyUiColors, topBarState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.stepTitle, content.stepTitle) && Intrinsics.areEqual(this.questions, content.questions) && Intrinsics.areEqual(this.secondaryCtaActions, content.secondaryCtaActions) && Intrinsics.areEqual(this.primaryCta, content.primaryCta) && Intrinsics.areEqual(this.surveyUiColors, content.surveyUiColors) && Intrinsics.areEqual(this.topBarState, content.topBarState);
        }

        @NotNull
        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        @NotNull
        public final List<QuestionState> getQuestions() {
            return this.questions;
        }

        @NotNull
        public final List<SecondaryCta> getSecondaryCtaActions() {
            return this.secondaryCtaActions;
        }

        @NotNull
        public final List<Block.Builder> getStepTitle() {
            return this.stepTitle;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return (((((((((this.stepTitle.hashCode() * 31) + this.questions.hashCode()) * 31) + this.secondaryCtaActions.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.surveyUiColors.hashCode()) * 31) + this.topBarState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(stepTitle=" + this.stepTitle + ", questions=" + this.questions + ", secondaryCtaActions=" + this.secondaryCtaActions + ", primaryCta=" + this.primaryCta + ", surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    @w0(parameters = 1)
    public static abstract class Error extends SurveyState {
        public static final int $stable = 0;

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getMessageResId();

        @w0(parameters = 1)
        public static final class WithCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;

            @NotNull
            private final Function0<Unit> onClick;

            @NotNull
            private final SurveyUiColors surveyUiColors;

            @NotNull
            private final TopBarState topBarState;

            public /* synthetic */ WithCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors, topBarState, function0);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @NotNull
            public final Function0<Unit> getOnClick() {
                return this.onClick;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            @NotNull
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            @NotNull
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithCTA(@f1 int i10, @NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState, @NotNull Function0<Unit> onClick) {
                super(null);
                Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
                Intrinsics.checkNotNullParameter(topBarState, "topBarState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
                this.onClick = onClick;
            }
        }

        @w0(parameters = 1)
        public static final class WithoutCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;

            @NotNull
            private final SurveyUiColors surveyUiColors;

            @NotNull
            private final TopBarState topBarState;

            public /* synthetic */ WithoutCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors, topBarState);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            @NotNull
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            @NotNull
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutCTA(@f1 int i10, @NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState) {
                super(null);
                Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
                Intrinsics.checkNotNullParameter(topBarState, "topBarState");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
            }
        }

        private Error() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends SurveyState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE;

        @NotNull
        private static final SurveyUiColors surveyUiColors;

        @NotNull
        private static final TopBarState topBarState;

        static {
            Initial initial = new Initial();
            INSTANCE = initial;
            surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null));
            topBarState = new TopBarState.NoTopBarState(true, initial.getSurveyUiColors(), null, 4, null);
        }

        private Initial() {
            super(null);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public SurveyUiColors getSurveyUiColors() {
            return surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public TopBarState getTopBarState() {
            return topBarState;
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends SurveyState {
        public static final int $stable = 0;

        @NotNull
        private final SurveyUiColors surveyUiColors;

        @NotNull
        private final TopBarState topBarState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, SurveyUiColors surveyUiColors, TopBarState topBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyUiColors = loading.surveyUiColors;
            }
            if ((i10 & 2) != 0) {
                topBarState = loading.topBarState;
            }
            return loading.copy(surveyUiColors, topBarState);
        }

        @NotNull
        public final SurveyUiColors component1() {
            return this.surveyUiColors;
        }

        @NotNull
        public final TopBarState component2() {
            return this.topBarState;
        }

        @NotNull
        public final Loading copy(@NotNull SurveyUiColors surveyUiColors, @NotNull TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            return new Loading(surveyUiColors, topBarState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.surveyUiColors, loading.surveyUiColors) && Intrinsics.areEqual(this.topBarState, loading.topBarState);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        @NotNull
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return (this.surveyUiColors.hashCode() * 31) + this.topBarState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    public /* synthetic */ SurveyState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract SurveyUiColors getSurveyUiColors();

    @NotNull
    public abstract TopBarState getTopBarState();

    private SurveyState() {
    }
}
