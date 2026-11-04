package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollection(@NotNull Context context, @NotNull String collectionId, @NotNull String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(place, "place");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(collectionId, place), null, null, 12, null));
    }

    public final void startHelpCenterCollections(@NotNull Context context, @NotNull List<String> collectionIds, @NotNull String metricPlace) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(collectionIds, metricPlace), null, null, 12, null));
    }

    public final void startHome(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startMessages(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z10 = true & false;
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTicketDetails(@NotNull Context context, @NotNull String ticketId, @NotNull String from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(from, "from");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(ticketId, from), null, null, 12, null));
    }

    public final void startTickets(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, null, null, 12, null));
    }
}
