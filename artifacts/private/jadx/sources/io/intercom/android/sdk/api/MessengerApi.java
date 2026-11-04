package io.intercom.android.sdk.api;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyConnectResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import java.util.List;
import okhttp3.e0;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
public interface MessengerApi {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getAblyAuthTokenSuspend$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAblyAuthTokenSuspend");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyAuthTokenSuspend(e0Var, dVar);
        }

        public static /* synthetic */ Object getAblyConnectConfigSuspend$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAblyConnectConfigSuspend");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyConnectConfigSuspend(e0Var, dVar);
        }

        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String str, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationSuspend");
            }
            if ((i10 & 2) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationSuspend(str, e0Var, dVar);
        }

        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationsSuspend(e0Var, dVar);
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getHomeCardsV2Suspend(e0Var, dVar);
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getUnreadConversationsSuspended(e0Var, dVar);
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, e0 e0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
            }
            if ((i10 & 1) != 0) {
                e0Var = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.openMessengerSuspended(e0Var, dVar);
        }
    }

    @POST("conversations/{conversationId}/quick_reply")
    @Nullable
    Object addConversationQuickReplySuspend(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Part.Builder>> dVar);

    @POST("conversations/{conversationId}/remark")
    @NotNull
    Call<Void> addConversationRatingRemark(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var);

    @PUT("device_tokens")
    @NotNull
    Call<Void> deleteDeviceToken(@Body @NotNull e0 e0Var);

    @POST("realtime/authorize")
    @Nullable
    Object getAblyAuthTokenSuspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<AblyAuthResponse>> dVar);

    @POST("realtime/connect")
    @Nullable
    Object getAblyConnectConfigSuspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<AblyConnectResponse>> dVar);

    @POST("content/fetch_carousel")
    @NotNull
    Call<CarouselResponse.Builder> getCarousel(@Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}")
    @Nullable
    Object getConversationSuspend(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Conversation>> dVar);

    @POST("conversations/inbox")
    @Nullable
    Object getConversationsSuspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<ConversationsResponse.Builder>> dVar);

    @POST("gifs")
    @Nullable
    Object getGifsSuspended(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<? extends GifResponse>> dVar);

    @POST("home")
    @Nullable
    Object getHomeCardsV2Suspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<HomeV2Response>> dVar);

    @POST("articles/{articleId}")
    @NotNull
    Call<LinkResponse.Builder> getLink(@Path("articleId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("carousels/{carouselId}/fetch")
    @NotNull
    Call<CarouselResponse.Builder> getProgrammaticCarousel(@Path("carouselId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("sheets/open")
    @NotNull
    Call<Sheet.Builder> getSheet(@Body @NotNull e0 e0Var);

    @POST("content/fetch_survey")
    @NotNull
    Call<FetchSurveyRequest> getSurvey(@Body @NotNull e0 e0Var);

    @POST("conversations/unread")
    @NotNull
    Call<UsersResponse.Builder> getUnreadConversations(@Body @NotNull e0 e0Var);

    @POST("conversations/unread")
    @Nullable
    Object getUnreadConversationsSuspended(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<? extends UsersResponse.Builder>> dVar);

    @POST("uploads")
    @Nullable
    Object getUploadFileUrlSuspended(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Upload.Builder>> dVar);

    @POST(EventEntry.tableName)
    @NotNull
    Call<LogEventResponse.Builder> logEvent(@Body @NotNull e0 e0Var);

    @POST("conversations/dismiss")
    @NotNull
    Call<Void> markAsDismissed(@Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}/read")
    @NotNull
    Call<Void> markAsRead(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}/read")
    @Nullable
    Object markAsReadSuspend(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Void>> dVar);

    @POST("stats_system/carousel_button_action_tapped")
    @NotNull
    Call<Void> markCarouselActionButtonTapped(@Body @NotNull e0 e0Var);

    @POST("stats_system/carousel_completed")
    @NotNull
    Call<Void> markCarouselAsCompleted(@Body @NotNull e0 e0Var);

    @POST("stats_system/carousel_dismissed")
    @NotNull
    Call<Void> markCarouselAsDismissed(@Body @NotNull e0 e0Var);

    @POST("stats_system/carousel_screen_viewed")
    @NotNull
    Call<Void> markCarouselScreenViewed(@Body @NotNull e0 e0Var);

    @POST("stats_system/carousel_permission_granted")
    @NotNull
    Call<Void> markPermissionGranted(@Body @NotNull e0 e0Var);

    @POST("stats_system/push_opened")
    @NotNull
    Call<Void> markPushAsOpened(@Body @NotNull e0 e0Var);

    @POST("open")
    @NotNull
    Call<OpenMessengerResponse> openMessenger(@Body @NotNull e0 e0Var);

    @POST("open")
    @Nullable
    Object openMessengerSuspended(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<OpenMessengerResponse>> dVar);

    @POST("conversations/{conversationId}/rate")
    @NotNull
    Call<Void> rateConversation(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}/react")
    @NotNull
    Call<Void> reactToConversation(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("articles/{articleId}/react")
    @NotNull
    Call<Void> reactToLink(@Path("articleId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}/record_interactions")
    @NotNull
    Call<Void> recordInteractions(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var);

    @POST("conversations/{conversationId}/reply")
    @Nullable
    Object replyToConversationSuspend(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Part.Builder>> dVar);

    @POST("error_reports")
    @NotNull
    Call<Void> reportError(@Body @NotNull e0 e0Var);

    @POST("metrics")
    @NotNull
    Call<Void> sendMetrics(@Body @NotNull e0 e0Var);

    @POST("user_auth_tokens")
    @NotNull
    Call<Void> setAuthToken(@Body @NotNull e0 e0Var);

    @POST("device_tokens")
    @NotNull
    Call<Void> setDeviceToken(@Body @NotNull e0 e0Var);

    @POST("conversations")
    @Nullable
    Object startNewConversationSuspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<ConversationResponse.Builder>> dVar);

    @POST("conversations/{conversationId}/form")
    @Nullable
    Object submitFormSuspend(@Path("conversationId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Conversation>> dVar);

    @POST("sheets/submit")
    @NotNull
    Call<Void> submitSheet(@Body @NotNull e0 e0Var);

    @POST("conversations/transcribe")
    @Nullable
    @Multipart
    Object transcribeSuspend(@NotNull @retrofit2.http.Part y.c cVar, @NotNull @retrofit2.http.Part y.c cVar2, @NotNull @retrofit2.http.Part y.c cVar3, @NotNull @retrofit2.http.Part List<y.c> list, @NotNull kotlin.coroutines.d<? super NetworkResponse<TranscribedText>> dVar);

    @POST("custom_bots/trigger_inbound_conversation")
    @Nullable
    Object triggerInboundConversationSuspend(@Body @NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super NetworkResponse<Conversation>> dVar);

    @POST(UserEntry.tableName)
    @NotNull
    Call<UpdateUserResponse.Builder> updateUser(@Body @NotNull e0 e0Var);
}
