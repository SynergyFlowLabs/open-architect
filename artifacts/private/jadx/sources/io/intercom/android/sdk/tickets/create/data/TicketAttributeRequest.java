package io.intercom.android.sdk.tickets.create.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketAttributeRequest {
    public static final int $stable = 8;

    @c("descriptor_id")
    @NotNull
    private final String descriptorId;

    @c("value")
    @NotNull
    private final Object value;

    public TicketAttributeRequest(@NotNull String descriptorId, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(descriptorId, "descriptorId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.descriptorId = descriptorId;
        this.value = value;
    }

    public static /* synthetic */ TicketAttributeRequest copy$default(TicketAttributeRequest ticketAttributeRequest, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = ticketAttributeRequest.descriptorId;
        }
        if ((i10 & 2) != 0) {
            obj = ticketAttributeRequest.value;
        }
        return ticketAttributeRequest.copy(str, obj);
    }

    @NotNull
    public final String component1() {
        return this.descriptorId;
    }

    @NotNull
    public final Object component2() {
        return this.value;
    }

    @NotNull
    public final TicketAttributeRequest copy(@NotNull String descriptorId, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(descriptorId, "descriptorId");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TicketAttributeRequest(descriptorId, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttributeRequest)) {
            return false;
        }
        TicketAttributeRequest ticketAttributeRequest = (TicketAttributeRequest) obj;
        return Intrinsics.areEqual(this.descriptorId, ticketAttributeRequest.descriptorId) && Intrinsics.areEqual(this.value, ticketAttributeRequest.value);
    }

    @NotNull
    public final String getDescriptorId() {
        return this.descriptorId;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.descriptorId.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketAttributeRequest(descriptorId=" + this.descriptorId + ", value=" + this.value + ')';
    }
}
