package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AblyMessage {
    public static final int $stable = 8;

    @c("eventData")
    @NotNull
    private final AblyEventData eventData;

    @c("eventName")
    @NotNull
    private final String eventName;

    public AblyMessage(@NotNull String eventName, @NotNull AblyEventData eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventName = eventName;
        this.eventData = eventData;
    }

    public static /* synthetic */ AblyMessage copy$default(AblyMessage ablyMessage, String str, AblyEventData ablyEventData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ablyMessage.eventName;
        }
        if ((i10 & 2) != 0) {
            ablyEventData = ablyMessage.eventData;
        }
        return ablyMessage.copy(str, ablyEventData);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final AblyEventData component2() {
        return this.eventData;
    }

    @NotNull
    public final AblyMessage copy(@NotNull String eventName, @NotNull AblyEventData eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        return new AblyMessage(eventName, eventData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyMessage)) {
            return false;
        }
        AblyMessage ablyMessage = (AblyMessage) obj;
        return Intrinsics.areEqual(this.eventName, ablyMessage.eventName) && Intrinsics.areEqual(this.eventData, ablyMessage.eventData);
    }

    @NotNull
    public final AblyEventData getEventData() {
        return this.eventData;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.eventData.hashCode();
    }

    @NotNull
    public String toString() {
        return "AblyMessage(eventName=" + this.eventName + ", eventData=" + this.eventData + ')';
    }
}
