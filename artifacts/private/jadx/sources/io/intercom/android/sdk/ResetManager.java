package io.intercom.android.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.ActivityFinisher;

/* JADX INFO: loaded from: classes13.dex */
public class ResetManager {
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final OverlayPresenter overlayPresenter;
    private final UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Twig twig = LumberMill.getLogger();
    private final Runnable hardResetTask = new Runnable() { // from class: io.intercom.android.sdk.ResetManager.1
        @Override // java.lang.Runnable
        public void run() {
            ResetManager.this.hardReset();
        }
    };

    public ResetManager(Provider<Api> provider, UserIdentity userIdentity, OverlayPresenter overlayPresenter, Provider<AppConfig> provider2, Context context, ActivityFinisher activityFinisher, IntercomDataLayer intercomDataLayer, UnreadConversationsTracker unreadConversationsTracker) {
        this.apiProvider = provider;
        this.userIdentity = userIdentity;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider2;
        this.context = context;
        this.activityFinisher = activityFinisher;
        this.dataLayer = intercomDataLayer;
        this.unreadConversationsTracker = unreadConversationsTracker;
    }

    public void clear() {
        this.handler.removeCallbacks(this.hardResetTask);
    }

    public void hardReset() {
        this.handler.removeCallbacks(this.hardResetTask);
        this.dataLayer.clearUserData();
        this.unreadConversationsTracker.clear();
        if (isSoftReset()) {
            String deviceToken = DeviceData.getDeviceToken(this.context);
            if (TextUtils.isEmpty(deviceToken)) {
                this.twig.internal("There is no device token to remove.");
            } else {
                this.apiProvider.get().removeDeviceToken(deviceToken, this.userIdentity);
            }
            this.dataLayer.hardReset();
            this.userIdentity.hardReset();
        }
    }

    boolean isSoftReset() {
        return this.userIdentity.isSoftReset();
    }

    public void softReset() {
        this.activityFinisher.finishActivities();
        this.overlayPresenter.softReset();
        this.handler.postDelayed(this.hardResetTask, this.appConfigProvider.get().getSoftResetTimeoutMs());
        this.dataLayer.emitEvent(IntercomEvent.SoftReset.INSTANCE);
        this.userIdentity.softReset();
        this.twig.i("Successfully reset the user. To resume communicating with Intercom, you can register a user", new Object[0]);
    }
}
