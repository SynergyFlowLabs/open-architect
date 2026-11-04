package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.metrics.MetricTracker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum CreateTicketLaunchedFrom {
    Conversation("conversation"),
    Home(MetricTracker.Context.HOME_SCREEN);

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    private final String from;

    CreateTicketLaunchedFrom(String str) {
        this.from = str;
    }

    @NotNull
    public static kotlin.enums.a<CreateTicketLaunchedFrom> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }
}
