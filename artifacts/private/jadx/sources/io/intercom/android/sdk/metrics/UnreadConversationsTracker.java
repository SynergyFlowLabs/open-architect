package io.intercom.android.sdk.metrics;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUnreadConversationsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnreadConversationsTracker.kt\nio/intercom/android/sdk/metrics/UnreadConversationsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 UnreadConversationsTracker.kt\nio/intercom/android/sdk/metrics/UnreadConversationsTracker\n*L\n20#1:49,2\n*E\n"})
public final class UnreadConversationsTracker {
    public static final int $stable = 8;

    @NotNull
    private final Set<String> trackedPartIds;

    @NotNull
    private final Provider<MetricTracker> trackerProvider;

    public UnreadConversationsTracker(@NotNull Provider<MetricTracker> trackerProvider) {
        Intrinsics.checkNotNullParameter(trackerProvider, "trackerProvider");
        this.trackerProvider = trackerProvider;
        this.trackedPartIds = new LinkedHashSet();
    }

    private final MetricTracker getTracker() {
        MetricTracker metricTracker = this.trackerProvider.get();
        Intrinsics.checkNotNullExpressionValue(metricTracker, "get(...)");
        return metricTracker;
    }

    private final void trackReceivedPart(Part part, String str) {
        boolean zHasAttachments = part.hasAttachments();
        boolean zIsLinkCard = PartExtensionsKt.isLinkCard(part);
        String id2 = part.getId();
        MessageStyle messageStyle = part.getMessageStyle();
        if (DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            getTracker().receivedMessageFromFullWhenClosed(zHasAttachments, zIsLinkCard, str, id2, messageStyle);
        } else if (part.isInitialMessage()) {
            getTracker().receivedMessageFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id2, messageStyle);
        } else {
            getTracker().receivedReplyFromSnippetWhenClosed(zHasAttachments, zIsLinkCard, str, id2);
        }
    }

    public final void clear() {
        this.trackedPartIds.clear();
    }

    public final void track(@NotNull UsersResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<Conversation> conversations = response.getUnreadConversations().getConversations();
        Intrinsics.checkNotNull(conversations);
        for (Conversation conversation : conversations) {
            Part partLastPart = conversation.lastPart();
            if (!this.trackedPartIds.contains(partLastPart.getId())) {
                Set<String> set = this.trackedPartIds;
                String id2 = partLastPart.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                set.add(id2);
                trackReceivedPart(partLastPart, conversation.getId());
            }
        }
    }
}
