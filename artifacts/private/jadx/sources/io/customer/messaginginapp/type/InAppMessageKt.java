package io.customer.messaginginapp.type;

import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppMessageKt {
    @NotNull
    public static final Message getMessage(@NotNull InAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "<this>");
        return new Message(inAppMessage.getMessageId(), null, inAppMessage.getQueueId(), MapsKt.mapOf(new Pair("gist", MapsKt.mapOf(new Pair("campaignId", inAppMessage.getDeliveryId())))), 2, null);
    }
}
