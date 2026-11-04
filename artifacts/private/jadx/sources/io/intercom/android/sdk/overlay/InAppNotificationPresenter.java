package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
class InAppNotificationPresenter implements InAppNotification.Listener, View.OnClickListener {
    private static final int MAX_DISPLAYED_NOTIFICATIONS = 3;
    private static final int PILL_START_OFFSET_DP = 66;
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final ContextLocaliser contextLocaliser;
    final Handler handler;
    private final LayoutInflater inflater;
    private final Listener listener;
    private final MetricTracker metricTracker;
    private float pillPosition;
    private final Twig twig = LumberMill.getLogger();
    private final Map<String, InAppNotification> notifications = new HashMap();
    private final List<Conversation> lastDisplayedConversations = new ArrayList();
    private boolean hasAnimated = false;
    private int bottomPadding = 0;

    interface Listener {
        ViewGroup getRootView() throws Exception;

        void markAsDismissed(Conversation conversation);

        void openNotification(Conversation conversation);
    }

    public InAppNotificationPresenter(LayoutInflater layoutInflater, Handler handler, Listener listener, MetricTracker metricTracker, Provider<AppConfig> provider, ContextLocaliser contextLocaliser, Activity activity) {
        this.inflater = layoutInflater;
        this.listener = listener;
        this.handler = handler;
        this.metricTracker = metricTracker;
        this.appConfigProvider = provider;
        this.contextLocaliser = contextLocaliser;
        this.activity = activity;
    }

    private void addNewNotifications(List<Conversation> list, ViewGroup viewGroup) {
        InAppNotification stackableSnippet;
        InAppNotificationPresenter inAppNotificationPresenter;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Conversation conversation = list.get(i10);
            Context contextCreateLocalisedContext = this.contextLocaliser.createLocalisedContext(viewGroup.getContext());
            Part partLastPart = conversation.lastPart();
            if (size >= 2 || !MessageStyle.CHAT.equals(partLastPart.getMessageStyle())) {
                InAppNotificationPresenter inAppNotificationPresenter2 = this;
                stackableSnippet = new StackableSnippet(contextCreateLocalisedContext, conversation, i10, inAppNotificationPresenter2.handler, viewGroup.getHeight(), inAppNotificationPresenter2, inAppNotificationPresenter2.appConfigProvider);
                inAppNotificationPresenter = inAppNotificationPresenter2;
            } else if (partLastPart.getDeliveryOption() == DeliveryOption.SUMMARY) {
                inAppNotificationPresenter = this;
                stackableSnippet = new ChatSnippet(contextCreateLocalisedContext, conversation, i10, viewGroup.getHeight(), inAppNotificationPresenter, this.appConfigProvider);
            } else {
                inAppNotificationPresenter = this;
                stackableSnippet = new ChatFull(contextCreateLocalisedContext, conversation, i10, viewGroup.getHeight(), inAppNotificationPresenter, inAppNotificationPresenter.metricTracker, inAppNotificationPresenter.appConfigProvider);
            }
            inAppNotificationPresenter.notifications.put(conversation.getId(), stackableSnippet);
            if (i10 < 3) {
                stackableSnippet.display(viewGroup, inAppNotificationPresenter.inflater, !inAppNotificationPresenter.hasAnimated, inAppNotificationPresenter.bottomPadding);
            }
            i10++;
            this = inAppNotificationPresenter;
        }
    }

    private void animatePill(final View view) {
        this.handler.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.4
            @Override // java.lang.Runnable
            public void run() {
                view.setY(InAppNotificationPresenter.this.pillPosition + ScreenUtils.dpToPx(66.0f, view.getContext()));
                view.animate().setInterpolator(new OvershootInterpolator()).y(InAppNotificationPresenter.this.pillPosition).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
            }
        }, (long) (SystemSettings.getTransitionScale(view.getContext()) * 500.0f));
    }

    private void displayPill(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R.id.notification_pill);
        if (this.notifications.size() <= 3) {
            if (textView != null) {
                viewGroup.removeView(textView);
                return;
            }
            return;
        }
        if (textView == null) {
            layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, true);
            textView = (TextView) viewGroup.findViewById(R.id.notification_pill);
            textView.setAlpha(0.0f);
            textView.setScaleX(0.4f);
            textView.setScaleY(0.4f);
            textView.setY(this.pillPosition);
            textView.setOnClickListener(this);
            animatePill(textView);
        }
        Phrase.from(this.contextLocaliser.createLocalisedContext(textView.getContext()), R.string.intercom_plus_x_more).put("n", this.notifications.size() - 3).into(textView);
    }

    private boolean isReply(Conversation conversation) {
        return !this.lastDisplayedConversations.isEmpty() && conversation.getId().equals(this.lastDisplayedConversations.get(0).getId());
    }

    private void updateNotifications(final List<Conversation> list, final Map<String, InAppNotification> map, final ViewGroup viewGroup) {
        InAppNotification inAppNotification;
        final Conversation conversation = list.get(0);
        Iterator<InAppNotification> it = map.values().iterator();
        InAppNotification next = it.next();
        loop0: while (true) {
            inAppNotification = next;
            do {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    next = it.next();
                }
            } while (next.getPosition() >= inAppNotification.getPosition());
        }
        if (isReply(conversation)) {
            inAppNotification.update(conversation, new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    InAppNotificationPresenter.this.syncUpdates(list, map, viewGroup);
                }
            });
            return;
        }
        if (map.size() == 1 && (inAppNotification instanceof ChatSnippet)) {
            inAppNotification.moveBackward(viewGroup, new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    InAppNotificationPresenter.this.addNewView(conversation, viewGroup, map);
                    InAppNotificationPresenter.this.handler.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            InAppNotificationPresenter.this.syncUpdates(list, map, viewGroup);
                        }
                    }, 220L);
                }
            });
            return;
        }
        for (InAppNotification inAppNotification2 : map.values()) {
            if (inAppNotification2.getPosition() < 3) {
                inAppNotification2.moveBackward(viewGroup);
            } else {
                inAppNotification2.setPosition(inAppNotification2.getPosition() + 1);
            }
        }
        addNewView(conversation, viewGroup, map);
        syncUpdates(list, map, viewGroup);
    }

    private void updatePillPosition(View view) {
        int i10 = 3 ^ 1;
        ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("y", view.getY(), this.pillPosition)).setDuration(300L).start();
    }

    void addNewView(Conversation conversation, ViewGroup viewGroup, Map<String, InAppNotification> map) {
        StackableSnippet stackableSnippet = new StackableSnippet(this.contextLocaliser.createLocalisedContext(viewGroup.getContext()), conversation, 0, this.handler, viewGroup.getHeight(), this, this.appConfigProvider);
        stackableSnippet.display(viewGroup, this.inflater, true, this.bottomPadding);
        if (map.containsKey(conversation.getId())) {
            map.get(conversation.getId()).removeView();
        }
        map.put(conversation.getId(), stackableSnippet);
    }

    public void displayNotifications(final ViewGroup viewGroup, final List<Conversation> list) {
        ViewUtils.waitForViewAttachment(viewGroup, new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                InAppNotificationPresenter.this.displayNotificationsAfterAttach(list, viewGroup);
            }
        });
    }

    void displayNotificationsAfterAttach(List<Conversation> list, ViewGroup viewGroup) {
        boolean z10 = (this.lastDisplayedConversations.equals(list) || this.notifications.isEmpty()) ? false : true;
        HashMap map = new HashMap(this.notifications);
        if (z10) {
            updateNotifications(list, map, viewGroup);
        } else if (!isDisplaying()) {
            addNewNotifications(list, viewGroup);
        }
        this.hasAnimated = true;
        Resources resources = viewGroup.getResources();
        this.pillPosition = ((viewGroup.getHeight() - resources.getDimensionPixelSize(R.dimen.intercom_overlay_pill_bottom_margin)) - resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) - this.bottomPadding;
        displayPill(this.inflater, viewGroup);
        this.lastDisplayedConversations.clear();
        this.lastDisplayedConversations.addAll(list);
    }

    public boolean isDisplaying() {
        return !this.notifications.isEmpty();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IntercomRootActivityLauncher.INSTANCE.startMessages(view.getContext());
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification.Listener
    public void onInAppNotificationDismiss(InAppNotification inAppNotification) {
        ViewGroup rootView;
        try {
            rootView = this.listener.getRootView();
        } catch (Exception e10) {
            this.twig.internal("Couldn't get root view: " + e10.getMessage());
            rootView = null;
        }
        Conversation conversation = inAppNotification.getConversation();
        if (rootView != null) {
            this.listener.markAsDismissed(conversation);
            rootView.removeView(inAppNotification.getRootView());
            this.notifications.remove(conversation.getId());
            this.lastDisplayedConversations.remove(conversation);
            Iterator<InAppNotification> it = this.notifications.values().iterator();
            while (it.hasNext()) {
                it.next().moveForward(rootView, this.inflater);
            }
            displayPill(this.inflater, rootView);
            if (this.notifications.isEmpty()) {
                this.hasAnimated = false;
            }
        }
        Part lastAdminPart = conversation.getLastAdminPart();
        if (MessageStyle.CHAT.equals(lastAdminPart.getMessageStyle()) && DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
            this.metricTracker.closedInAppFromFull(conversation.getId(), lastAdminPart.getId());
        } else if (lastAdminPart.isInitialMessage()) {
            this.metricTracker.dismissInAppMessageSnippet(conversation.getId(), lastAdminPart.getId());
        } else {
            this.metricTracker.dismissInAppCommentSnippet(conversation.getId(), lastAdminPart.getId());
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification.Listener
    public void onInAppNotificationTap(Conversation conversation) {
        this.listener.openNotification(conversation);
    }

    public void reset(ViewGroup viewGroup) {
        Iterator<InAppNotification> it = this.notifications.values().iterator();
        while (it.hasNext()) {
            it.next().removeView();
        }
        View viewFindViewById = viewGroup.findViewById(R.id.notification_pill);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        this.notifications.clear();
    }

    public void setBottomPadding(int i10) {
        ViewGroup rootView;
        this.bottomPadding = i10;
        if (isDisplaying()) {
            Iterator<InAppNotification> it = this.notifications.values().iterator();
            while (it.hasNext()) {
                it.next().updateBottomPadding(this.inflater.getContext(), this.bottomPadding);
            }
            try {
                rootView = this.listener.getRootView();
            } catch (Exception e10) {
                this.twig.internal("Couldn't get root view: " + e10.getMessage());
                rootView = null;
            }
            if (rootView != null) {
                Resources resources = rootView.getResources();
                this.pillPosition = ((rootView.getHeight() - resources.getDimensionPixelSize(R.dimen.intercom_overlay_pill_bottom_margin)) - resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) - i10;
                View viewFindViewById = rootView.findViewById(R.id.notification_pill);
                if (viewFindViewById != null) {
                    updatePillPosition(viewFindViewById);
                }
            }
        }
    }

    void syncUpdates(List<Conversation> list, Map<String, InAppNotification> map, ViewGroup viewGroup) {
        InAppNotification stackableSnippet;
        ViewGroup viewGroup2;
        int i10 = 0;
        while (i10 < list.size()) {
            Conversation conversation = list.get(i10);
            InAppNotification inAppNotificationRemove = map.remove(conversation.getId());
            if ((!(inAppNotificationRemove instanceof ChatSnippet) || i10 <= 0) && inAppNotificationRemove != null) {
                stackableSnippet = inAppNotificationRemove;
            } else {
                if (inAppNotificationRemove != null) {
                    inAppNotificationRemove.removeView();
                }
                stackableSnippet = new StackableSnippet(this.contextLocaliser.createLocalisedContext(viewGroup.getContext()), conversation, i10, this.handler, viewGroup.getHeight(), this, this.appConfigProvider);
            }
            if (i10 < 3) {
                viewGroup2 = viewGroup;
                stackableSnippet.display(viewGroup2, conversation, this.inflater, false, this.bottomPadding);
            } else {
                viewGroup2 = viewGroup;
                stackableSnippet.removeView();
            }
            this.notifications.put(conversation.getId(), stackableSnippet);
            i10++;
            viewGroup = viewGroup2;
        }
        Iterator<InAppNotification> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().removeView();
        }
    }
}
