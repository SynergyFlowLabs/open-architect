package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class StatsCtaRequestModel {
    public static final int $stable = 0;

    @c("step_id")
    @NotNull
    private final String stepId;

    @c("survey_progress_id")
    @NotNull
    private final String surveyProgressId;

    public StatsCtaRequestModel(@NotNull String surveyProgressId, @NotNull String stepId) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.surveyProgressId = surveyProgressId;
        this.stepId = stepId;
    }

    public static /* synthetic */ StatsCtaRequestModel copy$default(StatsCtaRequestModel statsCtaRequestModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsCtaRequestModel.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = statsCtaRequestModel.stepId;
        }
        return statsCtaRequestModel.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.surveyProgressId;
    }

    @NotNull
    public final String component2() {
        return this.stepId;
    }

    @NotNull
    public final StatsCtaRequestModel copy(@NotNull String surveyProgressId, @NotNull String stepId) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        return new StatsCtaRequestModel(surveyProgressId, stepId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCtaRequestModel)) {
            return false;
        }
        StatsCtaRequestModel statsCtaRequestModel = (StatsCtaRequestModel) obj;
        return Intrinsics.areEqual(this.surveyProgressId, statsCtaRequestModel.surveyProgressId) && Intrinsics.areEqual(this.stepId, statsCtaRequestModel.stepId);
    }

    @NotNull
    public final String getStepId() {
        return this.stepId;
    }

    @NotNull
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return (this.surveyProgressId.hashCode() * 31) + this.stepId.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatsCtaRequestModel(surveyProgressId=" + this.surveyProgressId + ", stepId=" + this.stepId + ')';
    }
}
