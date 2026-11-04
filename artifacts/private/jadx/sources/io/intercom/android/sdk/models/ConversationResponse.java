package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ConversationResponse extends BaseResponse {
    public static final int $stable = 8;

    @NotNull
    private final Builder builder;

    @NotNull
    private final Conversation conversation;

    @w0(parameters = 0)
    public static final class Builder extends BaseResponse.Builder {
        public static final int $stable = 8;

        @Nullable
        private ComposerState composer_state;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @Nullable
        private String f293115id;
        private boolean inbound_conversations_disabled;
        private boolean is_inbound;

        @Nullable
        private String notification_status;
        private boolean prevent_end_user_replies;
        private boolean read;

        @Nullable
        private String state;

        @Nullable
        private Ticket ticket;

        @Nullable
        private ConversationUiFlags ui_flags;

        @NotNull
        private List<Participant.Builder> participants = CollectionsKt.emptyList();

        @NotNull
        private List<Part.Builder> conversation_parts = CollectionsKt.emptyList();

        @NotNull
        private List<String> group_conversation_participant_ids = CollectionsKt.emptyList();

        @NotNull
        private LastParticipatingAdmin.Builder last_participating_admin = new LastParticipatingAdmin.Builder();

        @Nullable
        public final ComposerState getComposer_state() {
            return this.composer_state;
        }

        @NotNull
        public final List<Part.Builder> getConversation_parts() {
            return this.conversation_parts;
        }

        @NotNull
        public final List<String> getGroup_conversation_participant_ids() {
            return this.group_conversation_participant_ids;
        }

        @Nullable
        public final String getId() {
            return this.f293115id;
        }

        public final boolean getInbound_conversations_disabled() {
            return this.inbound_conversations_disabled;
        }

        @NotNull
        public final LastParticipatingAdmin.Builder getLast_participating_admin() {
            return this.last_participating_admin;
        }

        @Nullable
        public final String getNotification_status() {
            return this.notification_status;
        }

        @NotNull
        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final boolean getPrevent_end_user_replies() {
            return this.prevent_end_user_replies;
        }

        public final boolean getRead() {
            return this.read;
        }

        @Nullable
        public final String getState() {
            return this.state;
        }

        @Nullable
        public final Ticket getTicket() {
            return this.ticket;
        }

        @Nullable
        public final ConversationUiFlags getUi_flags() {
            return this.ui_flags;
        }

        public final boolean is_inbound() {
            return this.is_inbound;
        }

        public final void setComposer_state(@Nullable ComposerState composerState) {
            this.composer_state = composerState;
        }

        public final void setConversation_parts(@NotNull List<Part.Builder> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.conversation_parts = list;
        }

        public final void setGroup_conversation_participant_ids(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.group_conversation_participant_ids = list;
        }

        public final void setId(@Nullable String str) {
            this.f293115id = str;
        }

        public final void setInbound_conversations_disabled(boolean z10) {
            this.inbound_conversations_disabled = z10;
        }

        public final void setLast_participating_admin(@NotNull LastParticipatingAdmin.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.last_participating_admin = builder;
        }

        public final void setNotification_status(@Nullable String str) {
            this.notification_status = str;
        }

        public final void setParticipants(@NotNull List<Participant.Builder> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.participants = list;
        }

        public final void setPrevent_end_user_replies(boolean z10) {
            this.prevent_end_user_replies = z10;
        }

        public final void setRead(boolean z10) {
            this.read = z10;
        }

        public final void setState(@Nullable String str) {
            this.state = str;
        }

        public final void setTicket(@Nullable Ticket ticket) {
            this.ticket = ticket;
        }

        public final void setUi_flags(@Nullable ConversationUiFlags conversationUiFlags) {
            this.ui_flags = conversationUiFlags;
        }

        public final void set_inbound(boolean z10) {
            this.is_inbound = z10;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        @NotNull
        public ConversationResponse build() {
            return new ConversationResponse(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationResponse(@NotNull Builder builder) {
        super(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        String id2 = builder.getId();
        id2 = id2 == null ? "" : id2;
        boolean read = builder.getRead();
        List<Participant.Builder> participants = builder.getParticipants();
        List<Part.Builder> conversation_parts = builder.getConversation_parts();
        List<String> group_conversation_participant_ids = builder.getGroup_conversation_participant_ids();
        LastParticipatingAdmin.Builder last_participating_admin = builder.getLast_participating_admin();
        ComposerState composer_state = builder.getComposer_state();
        composer_state = composer_state == null ? ComposerState.Companion.getNULL() : composer_state;
        boolean prevent_end_user_replies = builder.getPrevent_end_user_replies();
        boolean inbound_conversations_disabled = builder.getInbound_conversations_disabled();
        String notification_status = builder.getNotification_status();
        notification_status = notification_status == null ? "" : notification_status;
        String state = builder.getState();
        state = state == null ? "" : state;
        boolean zIs_inbound = builder.is_inbound();
        Ticket ticket = builder.getTicket();
        ConversationUiFlags ui_flags = builder.getUi_flags();
        this.conversation = new Conversation(id2, read, participants, conversation_parts, group_conversation_participant_ids, last_participating_admin, composer_state, prevent_end_user_replies, inbound_conversations_disabled, notification_status, state, zIs_inbound, ticket, ui_flags == null ? ConversationUiFlags.Companion.getDEFAULT() : ui_flags, null, null, null, null, null, null, 1032192, null);
    }

    @NotNull
    public final Builder getBuilder() {
        return this.builder;
    }

    @NotNull
    public final Conversation getConversation() {
        return this.conversation;
    }
}
