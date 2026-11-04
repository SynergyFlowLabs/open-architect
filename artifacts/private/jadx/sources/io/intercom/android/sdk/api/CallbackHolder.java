package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.UsersResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
class CallbackHolder {
    private static final Twig TWIG = LumberMill.getLogger();
    final IntercomDataLayer dataLayer;
    private final UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;

    CallbackHolder(IntercomDataLayer intercomDataLayer, UserIdentity userIdentity, UnreadConversationsTracker unreadConversationsTracker) {
        this.dataLayer = intercomDataLayer;
        this.userIdentity = userIdentity;
        this.unreadConversationsTracker = unreadConversationsTracker;
    }

    BaseCallback<LogEventResponse.Builder> logEventCallback() {
        return new BaseCallback<LogEventResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.1
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(LogEventResponse.Builder builder) {
                LogEventResponse logEventResponseBuild = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(logEventResponseBuild));
                CallbackHolder.this.unreadConversationsTracker.track(logEventResponseBuild);
                CallbackHolder.this.userIdentity.update(logEventResponseBuild.getUser());
                CallbackHolder.this.dataLayer.updateConfig(logEventResponseBuild.getConfig());
                CallbackHolder.this.dataLayer.updateCarousel(logEventResponseBuild.getCarousel());
                CallbackHolder.this.dataLayer.updateOverlayConversations(logEventResponseBuild.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(logEventResponseBuild.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }

    Callback<Void> loggingCallback(final String str) {
        return new Callback<Void>() { // from class: io.intercom.android.sdk.api.CallbackHolder.3
            @Override // retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                CallbackHolder.TWIG.internal(str + " failure");
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                CallbackHolder.TWIG.internal(str + " success");
            }
        };
    }

    BaseCallback<UsersResponse.Builder> unreadCallback() {
        return new BaseCallback<UsersResponse.Builder>() { // from class: io.intercom.android.sdk.api.CallbackHolder.2
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(UsersResponse.Builder builder) {
                UsersResponse usersResponseBuild = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(usersResponseBuild));
                CallbackHolder.this.unreadConversationsTracker.track(usersResponseBuild);
                CallbackHolder.this.userIdentity.update(usersResponseBuild.getUser());
                CallbackHolder.this.dataLayer.updateConfig(usersResponseBuild.getConfig());
                CallbackHolder.this.dataLayer.updateOverlayConversations(usersResponseBuild.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(usersResponseBuild.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }
}
