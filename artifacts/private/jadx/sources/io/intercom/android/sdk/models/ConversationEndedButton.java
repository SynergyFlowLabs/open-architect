package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ConversationEndedButton {
    public static final int $stable = 0;

    @c("text")
    @NotNull
    private final String ctaTitle;

    @c("title")
    @NotNull
    private final String message;

    @Nullable
    private final Metadata metadata;

    @NotNull
    private final Reason reason;

    @w0(parameters = 1)
    public static final class Metadata {
        public static final int $stable = 0;

        @c("merged_into_conversation_id")
        @NotNull
        private final String mergedIntoConversationId;

        public Metadata(@NotNull String mergedIntoConversationId) {
            Intrinsics.checkNotNullParameter(mergedIntoConversationId, "mergedIntoConversationId");
            this.mergedIntoConversationId = mergedIntoConversationId;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = metadata.mergedIntoConversationId;
            }
            return metadata.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.mergedIntoConversationId;
        }

        @NotNull
        public final Metadata copy(@NotNull String mergedIntoConversationId) {
            Intrinsics.checkNotNullParameter(mergedIntoConversationId, "mergedIntoConversationId");
            return new Metadata(mergedIntoConversationId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && Intrinsics.areEqual(this.mergedIntoConversationId, ((Metadata) obj).mergedIntoConversationId);
        }

        @NotNull
        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }

        public int hashCode() {
            return this.mergedIntoConversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Metadata(mergedIntoConversationId=" + this.mergedIntoConversationId + ')';
        }
    }

    public enum Reason {
        UNKNOWN,
        MERGED_INTO_CONVERSATION;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

        static {
            boolean z10 = true & true;
        }

        @NotNull
        public static a<Reason> getEntries() {
            return $ENTRIES;
        }
    }

    public ConversationEndedButton(@NotNull String message, @NotNull String ctaTitle, @NotNull Reason reason, @Nullable Metadata metadata) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.ctaTitle = ctaTitle;
        this.reason = reason;
        this.metadata = metadata;
    }

    public static /* synthetic */ ConversationEndedButton copy$default(ConversationEndedButton conversationEndedButton, String str, String str2, Reason reason, Metadata metadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = conversationEndedButton.message;
        }
        if ((i10 & 2) != 0) {
            str2 = conversationEndedButton.ctaTitle;
        }
        if ((i10 & 4) != 0) {
            reason = conversationEndedButton.reason;
        }
        if ((i10 & 8) != 0) {
            metadata = conversationEndedButton.metadata;
        }
        return conversationEndedButton.copy(str, str2, reason, metadata);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final String component2() {
        return this.ctaTitle;
    }

    @NotNull
    public final Reason component3() {
        return this.reason;
    }

    @Nullable
    public final Metadata component4() {
        return this.metadata;
    }

    @NotNull
    public final ConversationEndedButton copy(@NotNull String message, @NotNull String ctaTitle, @NotNull Reason reason, @Nullable Metadata metadata) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ConversationEndedButton(message, ctaTitle, reason, metadata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationEndedButton)) {
            return false;
        }
        ConversationEndedButton conversationEndedButton = (ConversationEndedButton) obj;
        return Intrinsics.areEqual(this.message, conversationEndedButton.message) && Intrinsics.areEqual(this.ctaTitle, conversationEndedButton.ctaTitle) && this.reason == conversationEndedButton.reason && Intrinsics.areEqual(this.metadata, conversationEndedButton.metadata);
    }

    @NotNull
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Metadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = ((((this.message.hashCode() * 31) + this.ctaTitle.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Metadata metadata = this.metadata;
        if (metadata == null) {
            iHashCode = 0;
            int i10 = 5 >> 0;
        } else {
            iHashCode = metadata.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @NotNull
    public String toString() {
        return "ConversationEndedButton(message=" + this.message + ", ctaTitle=" + this.ctaTitle + ", reason=" + this.reason + ", metadata=" + this.metadata + ')';
    }

    public /* synthetic */ ConversationEndedButton(String str, String str2, Reason reason, Metadata metadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, reason, (i10 & 8) != 0 ? null : metadata);
    }
}
