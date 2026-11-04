package io.intercom.android.sdk.m5.push.ui;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.j0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomPushConversation {
    public static final int $stable = 8;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String conversationTitle;

    @NotNull
    private final List<Message> messages;

    @w0(parameters = 0)
    public static final class Message {
        public static final int $stable = 8;

        @Nullable
        private final Uri contentImageUri;
        private final boolean isCurrentUser;

        @NotNull
        private final String message;

        @Nullable
        private final j0 person;
        private final long timestamp;

        public Message(@Nullable j0 j0Var, long j10, @NotNull String message, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.person = j0Var;
            this.timestamp = j10;
            this.message = message;
            this.contentImageUri = uri;
            this.isCurrentUser = j0Var == null;
        }

        public static /* synthetic */ Message copy$default(Message message, j0 j0Var, long j10, String str, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = message.person;
            }
            if ((i10 & 2) != 0) {
                j10 = message.timestamp;
            }
            if ((i10 & 4) != 0) {
                str = message.message;
            }
            if ((i10 & 8) != 0) {
                uri = message.contentImageUri;
            }
            return message.copy(j0Var, j10, str, uri);
        }

        @Nullable
        public final j0 component1() {
            return this.person;
        }

        public final long component2() {
            return this.timestamp;
        }

        @NotNull
        public final String component3() {
            return this.message;
        }

        @Nullable
        public final Uri component4() {
            return this.contentImageUri;
        }

        @NotNull
        public final Message copy(@Nullable j0 j0Var, long j10, @NotNull String message, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Message(j0Var, j10, message, uri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.areEqual(this.person, message.person) && this.timestamp == message.timestamp && Intrinsics.areEqual(this.message, message.message) && Intrinsics.areEqual(this.contentImageUri, message.contentImageUri);
        }

        @Nullable
        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final j0 getPerson() {
            return this.person;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            j0 j0Var = this.person;
            int iHashCode = (((((j0Var == null ? 0 : j0Var.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.message.hashCode()) * 31;
            Uri uri = this.contentImageUri;
            return iHashCode + (uri != null ? uri.hashCode() : 0);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        @NotNull
        public String toString() {
            return "Message(person=" + this.person + ", timestamp=" + this.timestamp + ", message=" + this.message + ", contentImageUri=" + this.contentImageUri + ')';
        }
    }

    public IntercomPushConversation(@NotNull String conversationId, @NotNull String conversationTitle, @NotNull List<Message> messages) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.conversationId = conversationId;
        this.conversationTitle = conversationTitle;
        this.messages = messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPushConversation copy$default(IntercomPushConversation intercomPushConversation, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = intercomPushConversation.conversationId;
        }
        if ((i10 & 2) != 0) {
            str2 = intercomPushConversation.conversationTitle;
        }
        if ((i10 & 4) != 0) {
            list = intercomPushConversation.messages;
        }
        return intercomPushConversation.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.conversationId;
    }

    @NotNull
    public final String component2() {
        return this.conversationTitle;
    }

    @NotNull
    public final List<Message> component3() {
        return this.messages;
    }

    @NotNull
    public final IntercomPushConversation copy(@NotNull String conversationId, @NotNull String conversationTitle, @NotNull List<Message> messages) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new IntercomPushConversation(conversationId, conversationTitle, messages);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPushConversation)) {
            return false;
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        return Intrinsics.areEqual(this.conversationId, intercomPushConversation.conversationId) && Intrinsics.areEqual(this.conversationTitle, intercomPushConversation.conversationTitle) && Intrinsics.areEqual(this.messages, intercomPushConversation.messages);
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    @NotNull
    public final List<Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return (((this.conversationId.hashCode() * 31) + this.conversationTitle.hashCode()) * 31) + this.messages.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntercomPushConversation(conversationId=" + this.conversationId + ", conversationTitle=" + this.conversationTitle + ", messages=" + this.messages + ')';
    }
}
