package com.devtodev.analytics.internal.modues.messaging;

import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.events.push.PushOpened;
import com.devtodev.analytics.internal.domain.events.push.PushReceived;
import com.devtodev.analytics.internal.domain.events.push.PushToken;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IEventsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingLogic implements IMessaging {

    @NotNull
    private final IActivityService activityService;

    @NotNull
    private final IEventsService eventsService;

    public MessagingLogic(@NotNull IServicesFactory servicesFactory) {
        Intrinsics.checkNotNullParameter(servicesFactory, "servicesFactory");
        this.eventsService = servicesFactory.getEventsService();
        this.activityService = servicesFactory.getActivityService();
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushOpened(long j10, int i10, @Nullable String str) {
        Long sessionId = this.activityService.getSessionId();
        if (!this.activityService.isValidSession()) {
            sessionId = null;
        }
        this.eventsService.addEvent(new PushOpened(null, j10, sessionId, i10, str, 1, null));
        Core.INSTANCE.getAnalyticsProxy().sendBufferedEvents();
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushReceive(long j10, int i10) {
        Long sessionId = this.activityService.getSessionId();
        if (!this.activityService.isValidSession()) {
            sessionId = null;
        }
        this.eventsService.addEvent(new PushReceived(null, j10, sessionId, i10, 1, null));
        Core.INSTANCE.getAnalyticsProxy().sendBufferedEvents();
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushToken(@NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(token, "token");
        Long sessionId = this.activityService.getSessionId();
        if (!this.activityService.isValidSession()) {
            sessionId = null;
        }
        this.eventsService.addEvent(new PushToken(null, 0L, sessionId, token, z10, 3, null));
        Core.INSTANCE.getAnalyticsProxy().sendBufferedEvents();
    }
}
