package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ParsedNexusEvent {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static class ConversationNexusEvent extends ParsedNexusEvent {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        @NotNull
        private final NexusEventType eventType;

        @w0(parameters = 0)
        public static final class AdminIsTyping extends ConversationNexusEvent {
            public static final int $stable = 8;

            @NotNull
            private final Avatar avatar;

            @NotNull
            private final String clientId;

            @NotNull
            private final String conversationId;

            @NotNull
            private final String createdByUser;
            private final boolean isBot;
            private final boolean showAvatar;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdminIsTyping(@NotNull String conversationId, @NotNull String createdByUser, @NotNull Avatar avatar, boolean z10, boolean z11, @NotNull String clientId) {
                super(conversationId, NexusEventType.AdminIsTyping);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z10;
                this.showAvatar = z11;
                this.clientId = clientId;
            }

            public static /* synthetic */ AdminIsTyping copy$default(AdminIsTyping adminIsTyping, String str, String str2, Avatar avatar, boolean z10, boolean z11, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = adminIsTyping.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = adminIsTyping.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    avatar = adminIsTyping.avatar;
                }
                if ((i10 & 8) != 0) {
                    z10 = adminIsTyping.isBot;
                }
                if ((i10 & 16) != 0) {
                    z11 = adminIsTyping.showAvatar;
                }
                if ((i10 & 32) != 0) {
                    str3 = adminIsTyping.clientId;
                }
                boolean z12 = z11;
                String str4 = str3;
                return adminIsTyping.copy(str, str2, avatar, z10, z12, str4);
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
            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final boolean component5() {
                return this.showAvatar;
            }

            @NotNull
            public final String component6() {
                return this.clientId;
            }

            @NotNull
            public final AdminIsTyping copy(@NotNull String conversationId, @NotNull String createdByUser, @NotNull Avatar avatar, boolean z10, boolean z11, @NotNull String clientId) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                return new AdminIsTyping(conversationId, createdByUser, avatar, z10, z11, clientId);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdminIsTyping)) {
                    return false;
                }
                AdminIsTyping adminIsTyping = (AdminIsTyping) obj;
                return Intrinsics.areEqual(this.conversationId, adminIsTyping.conversationId) && Intrinsics.areEqual(this.createdByUser, adminIsTyping.createdByUser) && Intrinsics.areEqual(this.avatar, adminIsTyping.avatar) && this.isBot == adminIsTyping.isBot && this.showAvatar == adminIsTyping.showAvatar && Intrinsics.areEqual(this.clientId, adminIsTyping.clientId);
            }

            @NotNull
            public final Avatar getAvatar() {
                return this.avatar;
            }

            @NotNull
            public final String getClientId() {
                return this.clientId;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            @NotNull
            public String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            public int hashCode() {
                return (((((((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot)) * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.clientId.hashCode();
            }

            public final boolean isBot() {
                return this.isBot;
            }

            @NotNull
            public String toString() {
                return "AdminIsTyping(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ", showAvatar=" + this.showAvatar + ", clientId=" + this.clientId + ')';
            }
        }

        @w0(parameters = 0)
        public static final class FinStreaming extends ConversationNexusEvent {
            public static final int $stable = 8;

            @NotNull
            private final List<Block> blocks;

            @NotNull
            private final String clientAssignedUUID;

            @NotNull
            private final String conversationId;

            @NotNull
            private final String partType;
            private final int tokenSequenceIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FinStreaming(@NotNull String conversationId, @NotNull String clientAssignedUUID, @NotNull String partType, int i10, @NotNull List<? extends Block> blocks) {
                super(conversationId, NexusEventType.ConversationPartToken);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
                Intrinsics.checkNotNullParameter(partType, "partType");
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                this.conversationId = conversationId;
                this.clientAssignedUUID = clientAssignedUUID;
                this.partType = partType;
                this.tokenSequenceIndex = i10;
                this.blocks = blocks;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinStreaming copy$default(FinStreaming finStreaming, String str, String str2, String str3, int i10, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = finStreaming.conversationId;
                }
                if ((i11 & 2) != 0) {
                    str2 = finStreaming.clientAssignedUUID;
                }
                if ((i11 & 4) != 0) {
                    str3 = finStreaming.partType;
                }
                if ((i11 & 8) != 0) {
                    i10 = finStreaming.tokenSequenceIndex;
                }
                if ((i11 & 16) != 0) {
                    list = finStreaming.blocks;
                }
                List list2 = list;
                String str4 = str3;
                return finStreaming.copy(str, str2, str4, i10, list2);
            }

            @NotNull
            public final String component1() {
                return this.conversationId;
            }

            @NotNull
            public final String component2() {
                return this.clientAssignedUUID;
            }

            @NotNull
            public final String component3() {
                return this.partType;
            }

            public final int component4() {
                return this.tokenSequenceIndex;
            }

            @NotNull
            public final List<Block> component5() {
                return this.blocks;
            }

            @NotNull
            public final FinStreaming copy(@NotNull String conversationId, @NotNull String clientAssignedUUID, @NotNull String partType, int i10, @NotNull List<? extends Block> blocks) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
                Intrinsics.checkNotNullParameter(partType, "partType");
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                return new FinStreaming(conversationId, clientAssignedUUID, partType, i10, blocks);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinStreaming)) {
                    return false;
                }
                FinStreaming finStreaming = (FinStreaming) obj;
                return Intrinsics.areEqual(this.conversationId, finStreaming.conversationId) && Intrinsics.areEqual(this.clientAssignedUUID, finStreaming.clientAssignedUUID) && Intrinsics.areEqual(this.partType, finStreaming.partType) && this.tokenSequenceIndex == finStreaming.tokenSequenceIndex && Intrinsics.areEqual(this.blocks, finStreaming.blocks);
            }

            @NotNull
            public final List<Block> getBlocks() {
                return this.blocks;
            }

            @NotNull
            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            @NotNull
            public String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final String getPartType() {
                return this.partType;
            }

            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public int hashCode() {
                return (((((((this.conversationId.hashCode() * 31) + this.clientAssignedUUID.hashCode()) * 31) + this.partType.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex)) * 31) + this.blocks.hashCode();
            }

            @NotNull
            public String toString() {
                return "FinStreaming(conversationId=" + this.conversationId + ", clientAssignedUUID=" + this.clientAssignedUUID + ", partType=" + this.partType + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ", blocks=" + this.blocks + ')';
            }
        }

        @w0(parameters = 0)
        public static final class NewComment extends ConversationNexusEvent {
            public static final int $stable = 8;

            @NotNull
            private final String conversationId;

            @NotNull
            private final String createdByUser;

            @Nullable
            private final Part.Builder partBuilder;

            @Nullable
            private final String ticketId;

            public /* synthetic */ NewComment(String str, String str2, String str3, Part.Builder builder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : builder);
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

            @Nullable
            public final String component3() {
                return this.ticketId;
            }

            @Nullable
            public final Part.Builder component4() {
                return this.partBuilder;
            }

            @NotNull
            public final NewComment copy(@NotNull String conversationId, @NotNull String createdByUser, @Nullable String str, @Nullable Part.Builder builder) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                return new NewComment(conversationId, createdByUser, str, builder);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                if (Intrinsics.areEqual(this.conversationId, newComment.conversationId) && Intrinsics.areEqual(this.createdByUser, newComment.createdByUser) && Intrinsics.areEqual(this.ticketId, newComment.ticketId) && Intrinsics.areEqual(this.partBuilder, newComment.partBuilder)) {
                    return true;
                }
                return false;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            @NotNull
            public String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            @Nullable
            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            @Nullable
            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                int iHashCode = ((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31;
                String str = this.ticketId;
                int iHashCode2 = 0;
                int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Part.Builder builder = this.partBuilder;
                if (builder != null) {
                    iHashCode2 = builder.hashCode();
                }
                return iHashCode3 + iHashCode2;
            }

            @NotNull
            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(@NotNull String conversationId, @NotNull String createdByUser, @Nullable String str, @Nullable Part.Builder builder) {
                super(conversationId, NexusEventType.NewComment);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.ticketId = str;
                this.partBuilder = builder;
            }
        }

        @w0(parameters = 0)
        public static final class UserContentSeenByAdmin extends ConversationNexusEvent {
            public static final int $stable = 8;

            @NotNull
            private final Avatar avatar;

            @NotNull
            private final String conversationId;

            @NotNull
            private final String createdByUser;
            private final boolean isBot;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserContentSeenByAdmin(@NotNull String conversationId, @NotNull String createdByUser, @NotNull Avatar avatar, boolean z10) {
                super(conversationId, NexusEventType.AdminIsTyping);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z10;
            }

            public static /* synthetic */ UserContentSeenByAdmin copy$default(UserContentSeenByAdmin userContentSeenByAdmin, String str, String str2, Avatar avatar, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userContentSeenByAdmin.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = userContentSeenByAdmin.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    avatar = userContentSeenByAdmin.avatar;
                }
                if ((i10 & 8) != 0) {
                    z10 = userContentSeenByAdmin.isBot;
                }
                return userContentSeenByAdmin.copy(str, str2, avatar, z10);
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
            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            @NotNull
            public final UserContentSeenByAdmin copy(@NotNull String conversationId, @NotNull String createdByUser, @NotNull Avatar avatar, boolean z10) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                return new UserContentSeenByAdmin(conversationId, createdByUser, avatar, z10);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserContentSeenByAdmin)) {
                    return false;
                }
                UserContentSeenByAdmin userContentSeenByAdmin = (UserContentSeenByAdmin) obj;
                if (Intrinsics.areEqual(this.conversationId, userContentSeenByAdmin.conversationId) && Intrinsics.areEqual(this.createdByUser, userContentSeenByAdmin.createdByUser) && Intrinsics.areEqual(this.avatar, userContentSeenByAdmin.avatar) && this.isBot == userContentSeenByAdmin.isBot) {
                    return true;
                }
                return false;
            }

            @NotNull
            public final Avatar getAvatar() {
                return this.avatar;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            @NotNull
            public String getConversationId() {
                return this.conversationId;
            }

            @NotNull
            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public int hashCode() {
                return (((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            @NotNull
            public String toString() {
                return "UserContentSeenByAdmin(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationNexusEvent(@NotNull String conversationId, @NotNull NexusEventType eventType) {
            super(null);
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            this.conversationId = conversationId;
            this.eventType = eventType;
        }

        @NotNull
        public String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final NexusEventType getEventType() {
            return this.eventType;
        }
    }

    @w0(parameters = 1)
    public static final class NexusConnected extends ParsedNexusEvent {
        public static final int $stable = 0;

        @NotNull
        public static final NexusConnected INSTANCE = new NexusConnected();

        private NexusConnected() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof NexusConnected);
        }

        public int hashCode() {
            return -1135156447;
        }

        @NotNull
        public String toString() {
            return "NexusConnected";
        }
    }

    @w0(parameters = 1)
    public static final class UnSupportedEvent extends ParsedNexusEvent {
        public static final int $stable = 0;

        @NotNull
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof UnSupportedEvent);
        }

        public int hashCode() {
            return -2056396516;
        }

        @NotNull
        public String toString() {
            return "UnSupportedEvent";
        }
    }

    public /* synthetic */ ParsedNexusEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedNexusEvent() {
    }
}
