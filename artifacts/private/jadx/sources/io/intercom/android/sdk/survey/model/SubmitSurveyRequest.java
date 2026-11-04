package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SubmitSurveyRequest {
    public static final int $stable = 8;

    @c("current_step_id")
    @NotNull
    private final String currentStepId;

    @c("responses")
    @NotNull
    private final List<SubmitSurveyRequestItem> responses;

    @c("survey_progress_id")
    @NotNull
    private final String surveyProgressId;

    public SubmitSurveyRequest(@NotNull String surveyProgressId, @NotNull String currentStepId, @NotNull List<SubmitSurveyRequestItem> responses) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(currentStepId, "currentStepId");
        Intrinsics.checkNotNullParameter(responses, "responses");
        this.surveyProgressId = surveyProgressId;
        this.currentStepId = currentStepId;
        this.responses = responses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequest copy$default(SubmitSurveyRequest submitSurveyRequest, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitSurveyRequest.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = submitSurveyRequest.currentStepId;
        }
        if ((i10 & 4) != 0) {
            list = submitSurveyRequest.responses;
        }
        return submitSurveyRequest.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.surveyProgressId;
    }

    @NotNull
    public final String component2() {
        return this.currentStepId;
    }

    @NotNull
    public final List<SubmitSurveyRequestItem> component3() {
        return this.responses;
    }

    @NotNull
    public final SubmitSurveyRequest copy(@NotNull String surveyProgressId, @NotNull String currentStepId, @NotNull List<SubmitSurveyRequestItem> responses) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(currentStepId, "currentStepId");
        Intrinsics.checkNotNullParameter(responses, "responses");
        return new SubmitSurveyRequest(surveyProgressId, currentStepId, responses);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequest)) {
            return false;
        }
        SubmitSurveyRequest submitSurveyRequest = (SubmitSurveyRequest) obj;
        return Intrinsics.areEqual(this.surveyProgressId, submitSurveyRequest.surveyProgressId) && Intrinsics.areEqual(this.currentStepId, submitSurveyRequest.currentStepId) && Intrinsics.areEqual(this.responses, submitSurveyRequest.responses);
    }

    @NotNull
    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    @NotNull
    public final List<SubmitSurveyRequestItem> getResponses() {
        return this.responses;
    }

    @NotNull
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return (((this.surveyProgressId.hashCode() * 31) + this.currentStepId.hashCode()) * 31) + this.responses.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubmitSurveyRequest(surveyProgressId=" + this.surveyProgressId + ", currentStepId=" + this.currentStepId + ", responses=" + this.responses + ')';
    }
}
