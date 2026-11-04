package io.intercom.android.sdk.api;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import kotlin.Unit;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
public interface SurveyApi {
    @POST("surveys/{surveyId}/dismiss")
    @Nullable
    Object dismissSurvey(@Path("surveyId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Unit>> dVar);

    @POST("surveys/{surveyId}/fetch")
    @Nullable
    Object fetchSurvey(@Path("surveyId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<FetchSurveyRequest>> dVar);

    @POST("surveys/{survey_id}/failure")
    @Nullable
    Object reportFailure(@Path("survey_id") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Unit>> dVar);

    @POST("surveys/{surveyId}/action_button_clicked")
    @Nullable
    Object submitCtaStat(@Path("surveyId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Unit>> dVar);

    @POST("surveys/{surveyId}/submit")
    @Nullable
    Object submitSurveyStep(@Path("surveyId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<SubmitSurveyResponse>> dVar);
}
