package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.Part;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ParsedAblyEvent {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class AblyClosed extends ParsedAblyEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AblyClosed INSTANCE = new AblyClosed();

        private AblyClosed() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class AblyConnected extends ParsedAblyEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AblyConnected INSTANCE = new AblyConnected();

        private AblyConnected() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class AblyFailed extends ParsedAblyEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AblyFailed INSTANCE = new AblyFailed();

        private AblyFailed() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static abstract class ConversationAblyEvent extends ParsedAblyEvent {
        public static final int $stable = 0;

        @w0(parameters = 0)
        public static final class NewComment extends ConversationAblyEvent {
            public static final int $stable = 8;

            @NotNull
            private final String conversationId;

            @NotNull
            private final String createdByUser;

            @NotNull
            private final Part.Builder partBuilder;

            @NotNull
            private final String ticketId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(@NotNull String conversationId, @NotNull String createdByUser, @NotNull String ticketId, @NotNull Part.Builder partBuilder) {
                super(null);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.ticketId = ticketId;
                this.partBuilder = partBuilder;
            }

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, Part.Builder builder, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                if ((i10 & 8) != 0) {
                    builder = newComment.partBuilder;
                }
                return newComment.copy(str, str2, str3, builder);
            }

            @NotNull
            public final String component1() {
                return this.conversationId;
            }

            @NotNull
            public final String component2() {
                return this.createdByUser;
            }

            @NotNull
            public final String component3() {
                return this.ticketId;
            }

            @NotNull
            public final Part.Builder component4() {
                return this.partBuilder;
            }

            @NotNull
            public final NewComment copy(@NotNull String conversationId, @NotNull String createdByUser, @NotNull String ticketId, @NotNull Part.Builder partBuilder) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
                return new NewComment(conversationId, createdByUser, ticketId, partBuilder);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                return Intrinsics.areEqual(this.conversationId, newComment.conversationId) && Intrinsics.areEqual(this.createdByUser, newComment.createdByUser) && Intrinsics.areEqual(this.ticketId, newComment.ticketId) && Intrinsics.areEqual(this.partBuilder, newComment.partBuilder);
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            @NotNull
            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            @NotNull
            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                return (((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.ticketId.hashCode()) * 31) + this.partBuilder.hashCode();
            }

            @NotNull
            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }
        }

        public /* synthetic */ ConversationAblyEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConversationAblyEvent() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class UnSupportedEvent extends ParsedAblyEvent {
        public static final int $stable = 0;

        @NotNull
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }
    }

    public /* synthetic */ ParsedAblyEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedAblyEvent() {
    }
}
