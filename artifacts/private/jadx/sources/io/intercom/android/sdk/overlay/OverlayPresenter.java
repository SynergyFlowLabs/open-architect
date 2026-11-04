package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.graphics.j;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
public class OverlayPresenter implements InAppNotificationPresenter.Listener {
    private final Provider<Api> api;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    private final IntercomDataLayer intercomDataLayer;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final UserIdentity userIdentity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<String> viewedPartIds = new HashSet();

    public OverlayPresenter(Application application, Provider<AppConfig> provider, MetricTracker metricTracker, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, Provider<Api> provider2) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.api = provider2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(application);
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(layoutInflaterFrom, handler, this, metricTracker, provider, new ContextLocaliser(provider), hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(layoutInflaterFrom, new LauncherOpenBehaviour(), metricTracker);
        s0 s0VarB = t0.b();
        intercomDataLayer.unreadConversationIdsUpdates(s0VarB, new Function1() { // from class: io.intercom.android.sdk.overlay.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.b(this.f293139a, (Set) obj);
            }
        });
        intercomDataLayer.configUpdates(s0VarB, new Function1() { // from class: io.intercom.android.sdk.overlay.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.h(this.f293140a, (AppConfig) obj);
            }
        });
        intercomDataLayer.overlayStateUpdates(s0VarB, new Function1() { // from class: io.intercom.android.sdk.overlay.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.f(this.f293141a, (OverlayState) obj);
            }
        });
        intercomDataLayer.listenToEvents(s0VarB, new Function1() { // from class: io.intercom.android.sdk.overlay.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.g(this.f293142a, (IntercomEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyLegacyBottomPadding(ViewGroup viewGroup, Activity activity) {
        try {
            int i10 = (int) (activity.getResources().getDisplayMetrics().density * 8.0f);
            int legacyNavigationBarHeight = getLegacyNavigationBarHeight(activity);
            if (legacyNavigationBarHeight > 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), legacyNavigationBarHeight + i10);
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + i10);
            }
        } catch (Throwable unused) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + ((int) (activity.getResources().getDisplayMetrics().density * 8.0f)));
        }
    }

    public static /* synthetic */ Unit b(OverlayPresenter overlayPresenter, Set set) {
        overlayPresenter.onStateChange(Integer.valueOf(set.size()), overlayPresenter.intercomDataLayer.getOverlayState().getValue());
        return Unit.f312394a;
    }

    public static /* synthetic */ void c(OverlayPresenter overlayPresenter, String str, List list, Intercom.Visibility visibility, Activity activity) {
        if (str.equals(overlayPresenter.userIdentity.getFingerprint()) && overlayPresenter.shouldDisplayNotifications(list, visibility, activity)) {
            overlayPresenter.displayNotifications(list, activity);
        }
    }

    public static /* synthetic */ void d(OverlayPresenter overlayPresenter, ViewGroup viewGroup) {
        overlayPresenter.inAppNotificationPresenter.reset(viewGroup);
        overlayPresenter.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, overlayPresenter.appConfigProvider.get());
    }

    public static /* synthetic */ g3 e(View view, g3 g3Var) {
        j jVarF = g3Var.f(g3.m.i());
        view.setPadding(jVarF.f47823a, jVarF.f47824b, jVarF.f47825c, jVarF.f47826d + ((int) (view.getResources().getDisplayMetrics().density * 8.0f)));
        return g3.f48754c;
    }

    public static /* synthetic */ Unit f(OverlayPresenter overlayPresenter, OverlayState overlayState) {
        overlayPresenter.onStateChange(Integer.valueOf(overlayPresenter.intercomDataLayer.getUnreadConversationIds().getValue().size()), overlayState);
        return Unit.f312394a;
    }

    public static /* synthetic */ Unit g(OverlayPresenter overlayPresenter, IntercomEvent intercomEvent) {
        overlayPresenter.handleLifecycleEvents(intercomEvent);
        return Unit.f312394a;
    }

    private int getLegacyNavigationBarHeight(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ Unit h(OverlayPresenter overlayPresenter, AppConfig appConfig) {
        overlayPresenter.onNewConfig();
        return Unit.f312394a;
    }

    @p0
    private Activity hostActivity() {
        return this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
    }

    public static /* synthetic */ void i(OverlayPresenter overlayPresenter, View view) {
        if (view == null) {
            overlayPresenter.getClass();
            return;
        }
        overlayPresenter.launcherPresenter.removeLauncher();
        overlayPresenter.inAppNotificationPresenter.reset((ViewGroup) view);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private void openCarousel(@NonNull Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) IntercomCarouselActivity.class));
    }

    private void openMessenger(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            ArrayList arrayList = new ArrayList();
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(activityHostActivity, conversation.getId());
            arrayList.add(IntercomRootActivityArgsKt.getIntentForArgs(activityHostActivity, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, IntercomRootActivity.class, 268435456));
            arrayList.add(conversationIntent);
            activityHostActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity activityHostActivity = hostActivity();
            if (activityHostActivity != null) {
                activityHostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible()));
            }
        } catch (IllegalArgumentException e10) {
            this.twig.internal("Overlay", "Error loading the note " + e10.getMessage());
        }
    }

    private void openPost(Conversation conversation) {
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            activityHostActivity.startActivity(IntercomPostActivity.buildPostIntent(activityHostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible(), true));
        }
    }

    private void openSurvey(@NonNull Activity activity) {
        activity.startActivity(IntercomSurveyActivity.buildIntent(activity));
    }

    private void removeOverlays(@p0 Activity activity) {
        if (activity != null) {
            removeOverlaysIfPresent(activity);
        }
    }

    private void setupLegacyOverlayPositioning(final ViewGroup viewGroup, final Activity activity) {
        viewGroup.setFitsSystemWindows(false);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                OverlayPresenter.this.applyLegacyBottomPadding(viewGroup, activity);
            }
        });
    }

    private void setupUniversalOverlayPositioning(ViewGroup viewGroup) {
        u1.j2(viewGroup, new b1() { // from class: io.intercom.android.sdk.overlay.a
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return OverlayPresenter.e(view, g3Var);
            }
        });
        u1.A1(viewGroup);
    }

    private void trackInAppView(String str, String str2, @MetricTracker.InAppMessageViewContext int i10) {
        if (this.viewedPartIds.contains(str2)) {
            return;
        }
        this.viewedPartIds.add(str2);
        this.metricTracker.viewedInApp(str, str2, i10);
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages(null);
    }

    void displayNotifications(final List<Conversation> list, Activity activity) {
        DeliveryOption deliveryOption;
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        MessageStyle messageStyle = conversation.lastPart().getMessageStyle();
        DeliveryOption deliveryOption2 = conversation.lastPart().getDeliveryOption();
        if (list.size() > 1 || this.inAppNotificationPresenter.isDisplaying() || deliveryOption2 == DeliveryOption.SUMMARY || (deliveryOption2 == (deliveryOption = DeliveryOption.FULL) && MessageStyle.CHAT.equals(messageStyle))) {
            if (!this.launcherPresenter.isDisplaying()) {
                this.inAppNotificationPresenter.displayNotifications(rootView, list);
                return;
            }
            final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
            if (list.size() == 1) {
                andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                andUnsetLauncher.removeView();
                            }
                        });
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            } else {
                andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.removeView();
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
                return;
            }
        }
        if (deliveryOption2 == deliveryOption) {
            if (MessageStyle.POST.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openPost(conversation);
            } else if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openNote(conversation);
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public ViewGroup getRootView() {
        Activity activityHostActivity = hostActivity();
        activityHostActivity.getClass();
        return getRootView(activityHostActivity);
    }

    @l1
    void handleLifecycleEvents(IntercomEvent intercomEvent) {
        OverlayState value = this.intercomDataLayer.getOverlayState().getValue();
        Activity pausedHostActivity = value.getPausedHostActivity();
        Activity resumedHostActivity = value.getResumedHostActivity();
        if (intercomEvent instanceof IntercomEvent.ActivityReadyForViewAttachment) {
            if (((IntercomEvent.ActivityReadyForViewAttachment) intercomEvent).getActivity() != pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else {
            if (intercomEvent instanceof IntercomEvent.ActivityPaused) {
                removeOverlays(pausedHostActivity);
                return;
            }
            if (intercomEvent instanceof IntercomEvent.ActivityStopped) {
                if (((IntercomEvent.ActivityStopped) intercomEvent).getActivity() == pausedHostActivity) {
                    removeOverlays(pausedHostActivity);
                }
            } else if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                cancelAnimations();
                removeOverlays(pausedHostActivity);
                removeOverlays(resumedHostActivity);
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void markAsDismissed(Conversation conversation) {
        this.api.get().markConversationAsDismissed(conversation.getId());
        this.intercomDataLayer.markConversationPartAsDismissed(conversation.lastPart().getId());
    }

    public void onNewConfig() {
        Intercom.Visibility launcherVisibility = this.intercomDataLayer.getOverlayState().getValue().getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = this.intercomDataLayer.getOverlayState().getValue().getInAppNotificationsVisibility();
        List<Conversation> conversations = this.intercomDataLayer.getOverlayState().getValue().getConversations();
        Activity resumedHostActivity = this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
        if (!shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            this.launcherPresenter.setLauncherBackgroundColor(this.appConfigProvider.get());
        } else {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.d
                @Override // java.lang.Runnable
                public final void run() {
                    OverlayPresenter overlayPresenter = this.f293137a;
                    overlayPresenter.launcherPresenter.displayLauncherOnAttachedRoot(rootView, overlayPresenter.appConfigProvider.get());
                }
            });
        }
    }

    public void onStateChange(Integer num, OverlayState overlayState) {
        Activity resumedHostActivity = overlayState.getResumedHostActivity();
        List<Conversation> conversations = overlayState.getConversations();
        SurveyData surveyData = overlayState.getSurveyData();
        Carousel carousel = overlayState.getCarousel();
        int bottomPadding = overlayState.getBottomPadding();
        Intercom.Visibility launcherVisibility = overlayState.getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = overlayState.getInAppNotificationsVisibility();
        this.launcherPresenter.setBottomPadding(bottomPadding);
        this.launcherPresenter.setUnreadCount(num.intValue());
        this.inAppNotificationPresenter.setBottomPadding(bottomPadding);
        if (resumedHostActivity != null && !resumedHostActivity.isFinishing() && !resumedHostActivity.isDestroyed()) {
            if (shouldDisplaySurvey(surveyData, resumedHostActivity)) {
                openSurvey(resumedHostActivity);
                return;
            }
            if (shouldDisplayCarousel(carousel, resumedHostActivity)) {
                openCarousel(resumedHostActivity);
                return;
            }
            if (shouldDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity)) {
                preloadAvatarThenDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
            } else if (!shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
                removeOverlaysIfPresent(resumedHostActivity);
            } else {
                final ViewGroup rootView = getRootView(resumedHostActivity);
                ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        OverlayPresenter.d(this.f293133a, rootView);
                    }
                });
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        MessageStyle messageStyle = lastAdminPart.getMessageStyle();
        if (MessageStyle.POST.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openPost(conversation);
        } else {
            if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
                openNote(conversation);
                return;
            }
            openMessenger(conversation);
            if (MessageStyle.CHAT.equals(messageStyle) && DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    void preloadAvatarThenDisplayNotifications(final List<Conversation> list, final Intercom.Visibility visibility, final Activity activity, final String str) {
        AvatarUtils.preloadAvatar(list.get(0).lastAdmin().getAvatar(), new Runnable() { // from class: io.intercom.android.sdk.overlay.i
            @Override // java.lang.Runnable
            public final void run() {
                OverlayPresenter.c(this.f293143a, str, list, visibility, activity);
            }
        }, activity);
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), this.intercomDataLayer.getOverlayState().getValue());
    }

    public void removeOverlaysIfPresent(Activity activity) {
        final View viewFindViewById = activity.findViewById(R.id.intercom_overlay_root);
        activity.runOnUiThread(new Runnable() { // from class: io.intercom.android.sdk.overlay.c
            @Override // java.lang.Runnable
            public final void run() {
                OverlayPresenter.i(this.f293135a, viewFindViewById);
            }
        });
    }

    @l1
    boolean shouldDisplayCarousel(Carousel carousel, @p0 Activity activity) {
        return (Carousel.NULL.equals(carousel) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, @p0 Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            Iterator<Conversation> it = list.iterator();
            while (it.hasNext()) {
                if (DeliveryOption.BADGE != it.next().lastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        return visibility2 == Intercom.Visibility.VISIBLE && !this.userIdentity.isSoftReset() && this.userIdentity.identityExists() && this.appConfigProvider.get().isReceivedFromServer() && activity != null;
    }

    boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, @p0 Activity activity) {
        return (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) ? false : true;
    }

    @l1
    boolean shouldDisplaySurvey(SurveyData surveyData, @p0 Activity activity) {
        return (SurveyData.Companion.getNULL().equals(surveyData) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    public void softReset() {
        cancelAnimations();
        Activity activityHostActivity = hostActivity();
        if (activityHostActivity != null) {
            removeOverlaysIfPresent(activityHostActivity);
        }
    }

    private ViewGroup getRootView(Activity activity) {
        ViewGroup frameLayout = (ViewGroup) activity.findViewById(R.id.intercom_overlay_root);
        if (frameLayout == null) {
            frameLayout = new FrameLayout(activity);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setId(R.id.intercom_overlay_root);
            if (Build.VERSION.SDK_INT >= 30) {
                setupUniversalOverlayPositioning(frameLayout);
            } else {
                setupLegacyOverlayPositioning(frameLayout, activity);
            }
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        return frameLayout;
    }
}
