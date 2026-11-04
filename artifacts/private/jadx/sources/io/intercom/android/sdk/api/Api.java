package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.app.w;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.AuthToken;
import io.intercom.android.sdk.AuthTokenKt;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.user.DeviceData;
import io.sentry.k9;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.p;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public class Api {
    private static final String AUTH_TOKENS = "auth_tokens";
    private static final String CAROUSEL_AUTOMATIC = "shown_automatically";
    private static final String CAROUSEL_CREATED_VIA = "created_via";
    private static final String CAROUSEL_PROGRAMMATIC = "triggered_from_code";
    private static final String CAROUSEL_VISIBLE = "carousel_visible";
    private static final String DEVICE_DATA = "device_data";
    private static final String DEVICE_IDENTIFIER = "device_identifier";
    private static final String DEVICE_TOKEN = "device_token";
    private static final String HMAC = "hmac";
    private static final String INSTANCE_ID = "instance_id";
    private static final String JWT = "intercom_user_jwt";
    private static final String NEW_SESSION = "new_session";
    private static final String SCREEN_ID = "screen_id";
    private static final String SENT_FROM_BACKGROUND = "sent_from_background";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String USER = "user";
    private static final String USER_ATTRIBUTES = "user_attributes";
    private final b0 apiHttpClient;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    final CallbackHolder callbacks;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final int defaultOkHttpMaxRequests;
    private final MessengerApi messengerApi;
    private OpsMetricTracker opsMetricTracker;
    private final RateLimiter rateLimiter;
    final UserIdentity userIdentity;
    final b0 httpClient = new b0();
    private final Callback<Void> emptyCallback = new Callback<Void>() { // from class: io.intercom.android.sdk.api.Api.6
        @Override // retrofit2.Callback
        public void onFailure(Call<Void> call, Throwable th2) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<Void> call, Response<Void> response) {
        }
    };

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.Api$1, reason: invalid class name */
    class AnonymousClass1 extends BaseCallback<UpdateUserResponse.Builder> {
        final /* synthetic */ String val$fingerprint;
        final /* synthetic */ IntercomStatusCallback val$intercomStatusCallback;
        final /* synthetic */ Map val$params;

        AnonymousClass1(IntercomStatusCallback intercomStatusCallback, String str, Map map) {
            this.val$intercomStatusCallback = intercomStatusCallback;
            this.val$fingerprint = str;
            this.val$params = map;
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        void logFailure(String str, ErrorObject errorObject) {
            super.logFailure("Failed to register or update user", errorObject);
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        public void onError(final ErrorObject errorObject) {
            Map map = (Map) this.val$params.get("user");
            if (Api.isUserNotFound(errorObject, map)) {
                map.remove(UserIdentity.INTERCOM_ID);
                this.val$params.put("user", map);
                Api.this.retriableUpdateUser(this.val$params, this.val$fingerprint, this.val$intercomStatusCallback);
            } else {
                final String strExtractErrorString = ErrorStringExtractorKt.extractErrorString(errorObject);
                Handler handler = new Handler(Looper.getMainLooper());
                final IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
                handler.post(new Runnable() { // from class: io.intercom.android.sdk.api.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        intercomStatusCallback.onFailure(new IntercomError(1001, "ERROR - [HTTP " + errorObject.getStatusCode() + "] - " + strExtractErrorString));
                    }
                });
            }
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        public void onSuccess(UpdateUserResponse.Builder builder) {
            Handler handler = new Handler(Looper.getMainLooper());
            IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
            Objects.requireNonNull(intercomStatusCallback);
            handler.post(new a(intercomStatusCallback));
            if (this.val$fingerprint.equals(Api.this.userIdentity.getFingerprint())) {
                Api.TWIG.i("Successfully registered or updated user", new Object[0]);
                Api.this.callbacks.unreadCallback().onSuccess(builder);
                UpdateUserResponse updateUserResponseBuild = builder.build();
                Api.this.dataLayer.updateTeamPresence(updateUserResponseBuild.getTeamPresence());
                Api.this.dataLayer.updateCarousel(updateUserResponseBuild.getCarousel());
                Api.this.dataLayer.updateBotIntro(updateUserResponseBuild.getBotIntro());
                Api.this.dataLayer.updateSurveyData(updateUserResponseBuild.getSurveyData());
                Api.this.dataLayer.updateBotBehaviourId(updateUserResponseBuild.getBotBehaviourId());
                Api.this.opsMetricTracker.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.TIME_TO_COMPLETE_PING);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.api.Api$2, reason: invalid class name */
    class AnonymousClass2 implements Callback<Void> {
        final /* synthetic */ IntercomStatusCallback val$intercomStatusCallback;

        AnonymousClass2(IntercomStatusCallback intercomStatusCallback) {
            this.val$intercomStatusCallback = intercomStatusCallback;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<Void> call, Throwable th2) {
            Handler handler = new Handler(Looper.getMainLooper());
            final IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
            handler.post(new Runnable() { // from class: io.intercom.android.sdk.api.c
                @Override // java.lang.Runnable
                public final void run() {
                    intercomStatusCallback.onFailure(new IntercomError(1001, "ERROR"));
                }
            });
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<Void> call, Response<Void> response) {
            if (response.isSuccessful()) {
                Handler handler = new Handler(Looper.getMainLooper());
                IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
                Objects.requireNonNull(intercomStatusCallback);
                handler.post(new a(intercomStatusCallback));
                return;
            }
            final ErrorObject errorObject = new ErrorObject(null, response);
            Handler handler2 = new Handler(Looper.getMainLooper());
            final IntercomStatusCallback intercomStatusCallback2 = this.val$intercomStatusCallback;
            handler2.post(new Runnable() { // from class: io.intercom.android.sdk.api.d
                @Override // java.lang.Runnable
                public final void run() {
                    IntercomStatusCallback intercomStatusCallback3 = intercomStatusCallback2;
                    ErrorObject errorObject2 = errorObject;
                    intercomStatusCallback3.onFailure(new IntercomError(1001, "ERROR - [HTTP " + errorObject2.getStatusCode() + "] - " + ErrorStringExtractorKt.extractErrorString(errorObject2)));
                }
            });
        }
    }

    public Api(Context context, AppIdentity appIdentity, UserIdentity userIdentity, b0 b0Var, MessengerApi messengerApi, CallbackHolder callbackHolder, RateLimiter rateLimiter, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        this.context = context;
        this.appIdentity = appIdentity;
        this.userIdentity = userIdentity;
        this.messengerApi = messengerApi;
        this.callbacks = callbackHolder;
        this.rateLimiter = rateLimiter;
        this.appConfigProvider = provider;
        this.opsMetricTracker = opsMetricTracker;
        this.dataLayer = intercomDataLayer;
        this.apiHttpClient = b0Var;
        this.defaultOkHttpMaxRequests = b0Var.Q().k();
        updateMaxRequests();
    }

    private void addCarouselCreatedViaParam(Map<String, Object> map, boolean z10) {
        map.put(CAROUSEL_CREATED_VIA, z10 ? CAROUSEL_PROGRAMMATIC : CAROUSEL_AUTOMATIC);
    }

    private Map<String, Object> generateUpdateUserParams(UserUpdateRequest userUpdateRequest) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put(DEVICE_DATA, DeviceData.generateDeviceData(this.context));
        map.put(NEW_SESSION, Boolean.valueOf(userUpdateRequest.isNewSession()));
        map.put(SENT_FROM_BACKGROUND, Boolean.valueOf(userUpdateRequest.isSentFromBackground()));
        map.put(USER_ATTRIBUTES, userUpdateRequest.getAttributes());
        map.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(map);
        return map;
    }

    private boolean isCarouselVisible() {
        return !Carousel.NULL.equals(this.dataLayer.getOverlayState().getValue().getCarousel());
    }

    protected static boolean isUserNotFound(ErrorObject errorObject, Map map) {
        if (errorObject.hasErrorBody() && errorObject.getStatusCode() == 404 && map != null && map.get(UserIdentity.INTERCOM_ID) != null && map.size() > 1) {
            try {
                if (new JSONObject(errorObject.getErrorBody()).getJSONArray(k9.b.f305800g).getJSONObject(0).getString("code").equals("not_found")) {
                    return true;
                }
            } catch (Exception unused) {
                TWIG.internal("Could not parse error response");
            }
        }
        return false;
    }

    private void logBackgroundDisabledError() {
        TWIG.e("Your request was not sent because the app is in the background. Please contact Intercom to enable background requests.", new Object[0]);
    }

    private boolean shouldStopBackgroundRequest(boolean z10) {
        return z10 && this.appConfigProvider.get().isBackgroundRequestsDisabled();
    }

    private Map<String, Object> statsSystemParams(String str, String str2) {
        Map<String, Object> mapStatsSystemParams = statsSystemParams(str);
        mapStatsSystemParams.put(SCREEN_ID, str2);
        return mapStatsSystemParams;
    }

    public void addConversationRatingRemark(String str, String str2) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("remark", str2);
        addSecureHash(map);
        this.messengerApi.addConversationRatingRemark(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.loggingCallback("adding remark to conversation"));
    }

    public void addSecureHash(Map<String, Object> map) {
        map.put(DEVICE_IDENTIFIER, DeviceIdentifierHolderKt.getDeviceIdentifier(this.context));
        String jwt = this.userIdentity.getJwt();
        if (!TextUtils.isEmpty(jwt)) {
            map.put(JWT, jwt);
            return;
        }
        String hmac = this.userIdentity.getHmac();
        if (TextUtils.isEmpty(hmac)) {
            return;
        }
        map.put(HMAC, hmac);
    }

    public Map<String, Object> baseNewConversationParams() {
        HashMap map = new HashMap();
        map.put("app_id", this.appIdentity.appId());
        map.put("user", this.userIdentity.toMap());
        addSecureHash(map);
        return map;
    }

    public Map<String, Object> createBaseReplyParams() {
        HashMap map = new HashMap();
        map.put("app_id", this.appIdentity.appId());
        map.put("type", "user");
        map.put(com.google.firebase.messaging.e.d.f123513d, "comment");
        map.put("user", this.userIdentity.toMap());
        addSecureHash(map);
        return map;
    }

    public void fetchCarouselByEntityId(String str) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 44);
        addSecureHash(map);
        this.messengerApi.getCarousel(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<CarouselResponse.Builder>() { // from class: io.intercom.android.sdk.api.Api.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(CarouselResponse.Builder builder) {
                Api.this.dataLayer.updateCarousel(builder.build().carousel().build());
            }
        });
    }

    public void fetchProgrammaticCarousel(String str, Callback<CarouselResponse.Builder> callback) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getProgrammaticCarousel(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(callback);
    }

    public void fetchSheet(HashMap<String, Object> map, Callback<Sheet.Builder> callback) {
        HashMap map2 = new HashMap();
        map2.put("user", this.userIdentity.toMap());
        addSecureHash(map2);
        map2.putAll(map);
        this.messengerApi.getSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue(callback);
    }

    public void fetchSurveyByEntityId(String str) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 85);
        addSecureHash(map);
        this.messengerApi.getSurvey(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<FetchSurveyRequest>() { // from class: io.intercom.android.sdk.api.Api.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(FetchSurveyRequest fetchSurveyRequest) {
                Api.this.dataLayer.updateSurveyData(fetchSurveyRequest.getSurvey());
            }
        });
    }

    public void getLink(String str, Callback<LinkResponse.Builder> callback) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(callback);
    }

    public void getUnreadConversations() {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("per_page", "20");
        addSecureHash(map);
        this.messengerApi.getUnreadConversations(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.unreadCallback());
    }

    public void getVideo(String str, okhttp3.f fVar) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.a(new d0.a().B(str).b()), fVar);
    }

    public void hitTrackingUrl(String str) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.a(new d0.a().B(str).b()), new okhttp3.f() { // from class: io.intercom.android.sdk.api.Api.3
            @Override // okhttp3.f
            public void onFailure(okhttp3.e eVar, IOException iOException) {
                Api.TWIG.internal("Tracking Url", "Failed tracking url request");
            }

            @Override // okhttp3.f
            public void onResponse(okhttp3.e eVar, f0 f0Var) {
                Api.TWIG.internal("Tracking Url", "success");
                f0Var.r().close();
            }
        });
    }

    @l1
    public boolean isIdle() {
        if (this.apiHttpClient.Q().q() != 0) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    @l1
    boolean isSynchronous() {
        return this.apiHttpClient.Q().k() == 1;
    }

    public void logEvent(String str, Map<String, ?> map) {
        if (this.rateLimiter.isLimited()) {
            this.rateLimiter.logError();
            return;
        }
        boolean zIsBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (shouldStopBackgroundRequest(zIsBackgrounded)) {
            logBackgroundDisabledError();
            return;
        }
        this.rateLimiter.recordRequest();
        HashMap map2 = new HashMap();
        map2.put("event_name", str);
        if (!map.isEmpty()) {
            map2.put("metadata", map);
        }
        Map<String, Object> map3 = new HashMap<>();
        map3.put(w.I0, map2);
        map3.put(SENT_FROM_BACKGROUND, Boolean.valueOf(zIsBackgrounded));
        map3.put("user", this.userIdentity.toMap());
        map3.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(map3);
        this.messengerApi.logEvent(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map3)).enqueue(this.callbacks.logEventCallback());
    }

    public void markCarouselActionButtonTapped(String str, String str2, boolean z10) {
        Map<String, ? extends Object> mapStatsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(mapStatsSystemParams, z10);
        this.messengerApi.markCarouselActionButtonTapped(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(mapStatsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsCompleted(String str, boolean z10) {
        Map<String, ? extends Object> mapStatsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(mapStatsSystemParams, z10);
        this.messengerApi.markCarouselAsCompleted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(mapStatsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsDismissed(String str, boolean z10) {
        Map<String, ? extends Object> mapStatsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(mapStatsSystemParams, z10);
        this.messengerApi.markCarouselAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(mapStatsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselScreenViewed(String str, String str2, boolean z10) {
        Map<String, ? extends Object> mapStatsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(mapStatsSystemParams, z10);
        this.messengerApi.markCarouselScreenViewed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(mapStatsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markConversationAsDismissed(String str) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("conversation_ids", new String[]{str});
        addSecureHash(map);
        this.messengerApi.markAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.emptyCallback);
    }

    public void markConversationAsRead(String str) {
        HashMap map = new HashMap();
        map.put("app_id", this.appIdentity.appId());
        map.put("user", this.userIdentity.toMap());
        addSecureHash(map);
        this.messengerApi.markAsRead(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.emptyCallback);
    }

    public void markPermissionGranted(String str, String str2, boolean z10) {
        Map<String, ? extends Object> mapStatsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(mapStatsSystemParams, z10);
        this.messengerApi.markPermissionGranted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(mapStatsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markPushAsOpened(String str) {
        this.messengerApi.markPushAsOpened(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams(str))).enqueue(this.emptyCallback);
    }

    public void rateConversation(String str, int i10) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("rating_index", Integer.valueOf(i10));
        addSecureHash(map);
        this.messengerApi.rateConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.loggingCallback("conversation rating"));
    }

    public void reactToConversation(String str, int i10) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("reaction_index", Integer.valueOf(i10));
        addSecureHash(map);
        this.messengerApi.reactToConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.loggingCallback("add reaction to conversation"));
    }

    public void reactToLink(String str, @p0 String str2, int i10, boolean z10) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("article_content_id", str2);
        map.put("reaction_index", Integer.valueOf(i10));
        map.put("allow_auto_responses", Boolean.valueOf(z10));
        addSecureHash(map);
        this.messengerApi.reactToLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.loggingCallback("add reaction to link"));
    }

    public void recordInteractions(String str, String[] strArr) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("interactions", strArr);
        addSecureHash(map);
        this.messengerApi.recordInteractions(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.emptyCallback);
    }

    public void removeDeviceToken(String str, UserIdentity userIdentity) {
        HashMap map = new HashMap();
        if (userIdentity.isSoftReset()) {
            map.put("user", userIdentity.softUserIdentityToMap());
        } else {
            map.put("user", userIdentity.toMap());
        }
        map.put(DEVICE_TOKEN, str);
        addSecureHash(map);
        this.messengerApi.deleteDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.emptyCallback);
    }

    @l1
    void retriableUpdateUser(Map<String, Object> map, IntercomStatusCallback intercomStatusCallback) {
        retriableUpdateUser(map, this.userIdentity.getFingerprint(), intercomStatusCallback);
    }

    public void sendErrorReport(ErrorReport errorReport) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        map.put("error_report", errorReport);
        addSecureHash(map);
        this.messengerApi.reportError(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.loggingCallback("report error"));
    }

    public void sendMetrics(List<MetricObject> list, List<OpsMetricObject> list2, Callback<Void> callback) {
        HashMap map = new HashMap();
        map.put("metrics", list);
        map.put("op_metrics", list2);
        this.messengerApi.sendMetrics(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(callback);
    }

    public void setAuthTokens(List<AuthToken> list, IntercomStatusCallback intercomStatusCallback) {
        HashMap map = new HashMap();
        map.put("user", this.userIdentity.toMap());
        addSecureHash(map);
        if (!list.isEmpty()) {
            map.put("auth_tokens", AuthTokenKt.toMap(list));
        }
        this.messengerApi.setAuthToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new AnonymousClass2(intercomStatusCallback));
    }

    public void setDeviceToken(String str) {
        Map<String, Object> mapGenerateDeviceData = DeviceData.generateDeviceData(this.context);
        mapGenerateDeviceData.put(DEVICE_TOKEN, str);
        Map<String, Object> map = new HashMap<>();
        map.put("user", this.userIdentity.toMap());
        map.put(DEVICE_DATA, mapGenerateDeviceData);
        addSecureHash(map);
        this.messengerApi.setDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.emptyCallback);
    }

    @l1
    public void setIdleCallback(Runnable runnable) {
        this.apiHttpClient.Q().r(runnable);
    }

    public void submitSheet(String str, Map<String, Object> map, Callback<Void> callback) {
        HashMap map2 = new HashMap();
        map2.put("user", this.userIdentity.toMap());
        addSecureHash(map2);
        map2.put("uri", str);
        map2.put("sheet_values", map);
        this.messengerApi.submitSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue(callback);
    }

    public void updateMaxRequests() {
        int i10 = this.userIdentity.hasIntercomId() ? this.defaultOkHttpMaxRequests : 1;
        p pVarQ = this.apiHttpClient.Q();
        if (pVarQ.k() != i10) {
            pVarQ.s(i10);
        }
    }

    public void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        if (!userUpdateRequest.isInternalUpdate()) {
            if (this.rateLimiter.isLimited()) {
                this.rateLimiter.logError();
                intercomStatusCallback.onFailure(new IntercomError(1005, "rate limit reached"));
                return;
            } else {
                if (shouldStopBackgroundRequest(userUpdateRequest.isSentFromBackground())) {
                    logBackgroundDisabledError();
                    intercomStatusCallback.onFailure(new IntercomError(1006, "Background requests are disabled"));
                    return;
                }
                this.rateLimiter.recordRequest();
            }
        }
        retriableUpdateUser(generateUpdateUserParams(userUpdateRequest), intercomStatusCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retriableUpdateUser(Map<String, Object> map, String str, IntercomStatusCallback intercomStatusCallback) {
        this.messengerApi.updateUser(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new AnonymousClass1(intercomStatusCallback, str, map));
    }

    private Map<String, Object> statsSystemParams(String str) {
        HashMap map = new HashMap();
        map.put(INSTANCE_ID, str);
        map.put("user", this.userIdentity.toMap());
        addSecureHash(map);
        return map;
    }
}
