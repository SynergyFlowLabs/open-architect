package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.models.Part;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AblyEventData {
    public static final int $stable = 8;

    @c("conversation")
    @Nullable
    private final Object conversation;

    @c("conversationId")
    private final long conversationId;

    @c("mobileConversationPart")
    @NotNull
    private final Part.Builder conversationPart;

    public AblyEventData(long j10, @NotNull Part.Builder conversationPart, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        this.conversationId = j10;
        this.conversationPart = conversationPart;
        this.conversation = obj;
    }

    public static /* synthetic */ AblyEventData copy$default(AblyEventData ablyEventData, long j10, Part.Builder builder, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            j10 = ablyEventData.conversationId;
        }
        if ((i10 & 2) != 0) {
            builder = ablyEventData.conversationPart;
        }
        if ((i10 & 4) != 0) {
            obj = ablyEventData.conversation;
        }
        return ablyEventData.copy(j10, builder, obj);
    }

    public final long component1() {
        return this.conversationId;
    }

    @NotNull
    public final Part.Builder component2() {
        return this.conversationPart;
    }

    @Nullable
    public final Object component3() {
        return this.conversation;
    }

    @NotNull
    public final AblyEventData copy(long j10, @NotNull Part.Builder conversationPart, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        return new AblyEventData(j10, conversationPart, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyEventData)) {
            return false;
        }
        AblyEventData ablyEventData = (AblyEventData) obj;
        return this.conversationId == ablyEventData.conversationId && Intrinsics.areEqual(this.conversationPart, ablyEventData.conversationPart) && Intrinsics.areEqual(this.conversation, ablyEventData.conversation);
    }

    @Nullable
    public final Object getConversation() {
        return this.conversation;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final Part.Builder getConversationPart() {
        return this.conversationPart;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.conversationId) * 31) + this.conversationPart.hashCode()) * 31;
        Object obj = this.conversation;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "AblyEventData(conversationId=" + this.conversationId + ", conversationPart=" + this.conversationPart + ", conversation=" + this.conversation + ')';
    }

    public /* synthetic */ AblyEventData(long j10, Part.Builder builder, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, builder, (i10 & 4) != 0 ? null : obj);
    }
}
