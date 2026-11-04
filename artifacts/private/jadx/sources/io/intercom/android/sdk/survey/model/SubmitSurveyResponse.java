package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.NotificationStatuses;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SubmitSurveyResponse {
    public static final int $stable = 8;

    @c(NotificationStatuses.COMPLETE_STATUS)
    private final boolean complete;

    @c("next_step")
    @NotNull
    private final SurveyData.Step nextStep;

    @c("survey_id")
    @NotNull
    private final String surveyId;

    public SubmitSurveyResponse(boolean z10, @NotNull SurveyData.Step nextStep, @NotNull String surveyId) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.complete = z10;
        this.nextStep = nextStep;
        this.surveyId = surveyId;
    }

    public static /* synthetic */ SubmitSurveyResponse copy$default(SubmitSurveyResponse submitSurveyResponse, boolean z10, SurveyData.Step step, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = submitSurveyResponse.complete;
        }
        if ((i10 & 2) != 0) {
            step = submitSurveyResponse.nextStep;
        }
        if ((i10 & 4) != 0) {
            str = submitSurveyResponse.surveyId;
        }
        return submitSurveyResponse.copy(z10, step, str);
    }

    public final boolean component1() {
        return this.complete;
    }

    @NotNull
    public final SurveyData.Step component2() {
        return this.nextStep;
    }

    @NotNull
    public final String component3() {
        return this.surveyId;
    }

    @NotNull
    public final SubmitSurveyResponse copy(boolean z10, @NotNull SurveyData.Step nextStep, @NotNull String surveyId) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        return new SubmitSurveyResponse(z10, nextStep, surveyId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyResponse)) {
            return false;
        }
        SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) obj;
        return this.complete == submitSurveyResponse.complete && Intrinsics.areEqual(this.nextStep, submitSurveyResponse.nextStep) && Intrinsics.areEqual(this.surveyId, submitSurveyResponse.surveyId);
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @NotNull
    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    @NotNull
    public final String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.complete) * 31) + this.nextStep.hashCode()) * 31) + this.surveyId.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubmitSurveyResponse(complete=" + this.complete + ", nextStep=" + this.nextStep + ", surveyId=" + this.surveyId + ')';
    }
}
