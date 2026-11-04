package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import com.google.gson.f;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SurveyRepository {
    public static final int $stable = 8;

    @NotNull
    private final SurveyApi surveyApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Object dismissSurvey(@NotNull String str, @NotNull String str2, @NotNull d<? super NetworkResponse<Unit>> dVar) {
        return this.surveyApi.dismissSurvey(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("survey_progress_id", str2))), dVar);
    }

    @Nullable
    public final Object fetchSurvey(@NotNull String str, @NotNull d<? super NetworkResponse<FetchSurveyRequest>> dVar) {
        return this.surveyApi.fetchSurvey(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), dVar);
    }

    @Nullable
    public final Object reportFailure(@NotNull String str, @NotNull String str2, @NotNull d<? super NetworkResponse<Unit>> dVar) {
        return this.surveyApi.reportFailure(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("survey_progress_id", str2))), dVar);
    }

    @Nullable
    public final Object submitCtaStat(@NotNull String str, @NotNull StatsCtaRequestModel statsCtaRequestModel, @NotNull d<? super Unit> dVar) {
        Object objR = new f().r(new f().D(statsCtaRequestModel), Map.class);
        Intrinsics.checkNotNull(objR, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Object objSubmitCtaStat = this.surveyApi.submitCtaStat(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objR), dVar);
        return objSubmitCtaStat == kotlin.coroutines.intrinsics.b.l() ? objSubmitCtaStat : Unit.f312394a;
    }

    @Nullable
    public final Object submitSurvey(@NotNull SubmitSurveyRequest submitSurveyRequest, @NotNull String str, @NotNull d<? super NetworkResponse<SubmitSurveyResponse>> dVar) {
        Object objR = new f().r(new f().D(submitSurveyRequest), Map.class);
        Intrinsics.checkNotNull(objR, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return this.surveyApi.submitSurveyStep(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objR), dVar);
    }

    public SurveyRepository(@NotNull SurveyApi surveyApi) {
        Intrinsics.checkNotNullParameter(surveyApi, "surveyApi");
        this.surveyApi = surveyApi;
    }

    public /* synthetic */ SurveyRepository(SurveyApi surveyApi, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getSurveyApi() : surveyApi);
    }
}
