package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class FetchSurveyRequest {
    public static final int $stable = 8;

    @c("survey")
    @NotNull
    private final SurveyData survey;

    public FetchSurveyRequest(@NotNull SurveyData survey) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        this.survey = survey;
    }

    public static /* synthetic */ FetchSurveyRequest copy$default(FetchSurveyRequest fetchSurveyRequest, SurveyData surveyData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyData = fetchSurveyRequest.survey;
        }
        return fetchSurveyRequest.copy(surveyData);
    }

    @NotNull
    public final SurveyData component1() {
        return this.survey;
    }

    @NotNull
    public final FetchSurveyRequest copy(@NotNull SurveyData survey) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        return new FetchSurveyRequest(survey);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchSurveyRequest) && Intrinsics.areEqual(this.survey, ((FetchSurveyRequest) obj).survey);
    }

    @NotNull
    public final SurveyData getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return this.survey.hashCode();
    }

    @NotNull
    public String toString() {
        return "FetchSurveyRequest(survey=" + this.survey + ')';
    }
}
