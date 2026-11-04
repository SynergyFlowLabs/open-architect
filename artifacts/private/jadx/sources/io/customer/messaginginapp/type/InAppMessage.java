package io.customer.messaginginapp.type;

import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppMessage {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String deliveryId;

    @NotNull
    private final String messageId;

    @Nullable
    private final String queueId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InAppMessage getFromGistMessage$messaginginapp_release(@NotNull Message gistMessage) {
            Intrinsics.checkNotNullParameter(gistMessage, "gistMessage");
            return new InAppMessage(gistMessage.getMessageId(), gistMessage.getQueueId(), gistMessage.getGistProperties().getCampaignId());
        }

        private Companion() {
        }
    }

    public InAppMessage(@NotNull String messageId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.queueId = str;
        this.deliveryId = str2;
    }

    public static /* synthetic */ InAppMessage copy$default(InAppMessage inAppMessage, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inAppMessage.messageId;
        }
        if ((i10 & 2) != 0) {
            str2 = inAppMessage.queueId;
        }
        if ((i10 & 4) != 0) {
            str3 = inAppMessage.deliveryId;
        }
        return inAppMessage.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.messageId;
    }

    @Nullable
    public final String component2() {
        return this.queueId;
    }

    @Nullable
    public final String component3() {
        return this.deliveryId;
    }

    @NotNull
    public final InAppMessage copy(@NotNull String messageId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new InAppMessage(messageId, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) obj;
        return Intrinsics.areEqual(this.messageId, inAppMessage.messageId) && Intrinsics.areEqual(this.queueId, inAppMessage.queueId) && Intrinsics.areEqual(this.deliveryId, inAppMessage.deliveryId);
    }

    @Nullable
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getQueueId() {
        return this.queueId;
    }

    public int hashCode() {
        int iHashCode = this.messageId.hashCode() * 31;
        String str = this.queueId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InAppMessage(messageId=" + this.messageId + ", queueId=" + this.queueId + ", deliveryId=" + this.deliveryId + ")";
    }
}
