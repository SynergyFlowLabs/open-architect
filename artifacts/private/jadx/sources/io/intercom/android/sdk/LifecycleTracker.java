package io.intercom.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.l1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
class LifecycleTracker extends SimpleActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Provider<Api> apiProvider;
    private final IntercomDataLayer dataLayer;
    private final DeDuper deDuper;
    private final ErrorReporter errorReporter;
    private final ActivityLifecycleHandler handler;
    private final MetricsStore metricsStore;
    private final ResetManager resetManager;
    private final TimeProvider timeProvider;
    private final UserUpdaterHelper userUpdaterHelper;
    private final Set<Integer> startedActivities = new HashSet();
    private final Twig twig = LumberMill.getLogger();

    @l1
    LifecycleTracker(MetricsStore metricsStore, ErrorReporter errorReporter, DeDuper deDuper, TimeProvider timeProvider, ResetManager resetManager, ActivityLifecycleHandler activityLifecycleHandler, Provider<Api> provider, IntercomDataLayer intercomDataLayer, UserUpdaterHelper userUpdaterHelper) {
        this.metricsStore = metricsStore;
        this.errorReporter = errorReporter;
        this.deDuper = deDuper;
        this.timeProvider = timeProvider;
        this.resetManager = resetManager;
        this.handler = activityLifecycleHandler;
        this.apiProvider = provider;
        this.dataLayer = intercomDataLayer;
        this.userUpdaterHelper = userUpdaterHelper;
    }

    static LifecycleTracker create(MetricsStore metricsStore, ErrorReporter errorReporter, DeDuper deDuper, TimeProvider timeProvider, ResetManager resetManager, float f10, Provider<Api> provider, IntercomDataLayer intercomDataLayer, UserUpdaterHelper userUpdaterHelper) {
        return new LifecycleTracker(metricsStore, errorReporter, deDuper, timeProvider, resetManager, new ActivityLifecycleHandler(Looper.getMainLooper(), f10, intercomDataLayer), provider, intercomDataLayer, userUpdaterHelper);
    }

    private void handleExtras(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID)) {
            String stringExtra = intent.getStringExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.twig.i("Activity started from Mobile Push: " + activity, new Object[0]);
                this.apiProvider.get().markPushAsOpened(stringExtra);
                Injector.get().getMetricTracker().openedPushOnlyNotification(stringExtra);
            }
            intent.removeExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID);
        }
    }

    private boolean hasApplicationBecomeBackgrounded(Activity activity) {
        return isApplicationInBackground(activity) && !this.dataLayer.getHostAppState().getValue().isBackgrounded();
    }

    private static boolean isScreenLocked(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void registerActivity(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        this.twig.i("Started observing " + activity, new Object[0]);
    }

    private void unregisterActivity(Activity activity) {
        this.startedActivities.remove(Integer.valueOf(System.identityHashCode(activity)));
        this.twig.i("Stopped observing " + activity, new Object[0]);
    }

    @l1
    boolean isApplicationInBackground(Activity activity) {
        if (isScreenLocked(activity)) {
            return true;
        }
        return this.startedActivities.isEmpty() && !activity.isChangingConfigurations();
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(2, activity));
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(0, activity));
        handleExtras(activity);
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        registerActivity(activity);
        handleExtras(activity);
        if (this.dataLayer.getHostAppState().getValue().isBackgrounded()) {
            long jCurrentTimeMillis = this.timeProvider.currentTimeMillis();
            this.userUpdaterHelper.update(jCurrentTimeMillis);
            this.dataLayer.emitEvent(new IntercomEvent.AppEnteredForeground(jCurrentTimeMillis));
            this.dataLayer.appEnteredForeground();
            this.metricsStore.loadAndSendMetrics();
            this.errorReporter.sendSavedReport();
            if (activity instanceof IntercomRootActivity) {
                IntercomPushClientHandler.Companion.clear(activity);
            }
        }
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        unregisterActivity(activity);
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(3, activity));
        if (hasApplicationBecomeBackgrounded(activity)) {
            if (this.resetManager.isSoftReset()) {
                this.resetManager.hardReset();
            }
            long jCurrentTimeMillis = this.timeProvider.currentTimeMillis();
            this.dataLayer.emitEvent(new IntercomEvent.AppEnteredBackground(jCurrentTimeMillis));
            this.dataLayer.appEnteredBackground(jCurrentTimeMillis);
            this.deDuper.reset();
            this.metricsStore.loadAndSendMetrics();
        }
    }

    void registerActivities(Collection<Integer> collection) {
        this.startedActivities.addAll(collection);
    }
}
