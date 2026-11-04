package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InlineMessageState {

    public static final class Dismissed extends InlineMessageState {

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismissed(@NotNull Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Dismissed copy$default(Dismissed dismissed, Message message, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = dismissed.message;
            }
            return dismissed.copy(message);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final Dismissed copy(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Dismissed(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dismissed) && Intrinsics.areEqual(this.message, ((Dismissed) obj).message);
        }

        @Override // io.customer.messaginginapp.state.InlineMessageState
        @NotNull
        public Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Dismissed(message=" + getMessage().getQueueId() + ")";
        }
    }

    public static final class Embedded extends InlineMessageState {

        @NotNull
        private final String elementId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Embedded(@NotNull Message message, @NotNull String elementId) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elementId, "elementId");
            this.message = message;
            this.elementId = elementId;
        }

        public static /* synthetic */ Embedded copy$default(Embedded embedded, Message message, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = embedded.message;
            }
            if ((i10 & 2) != 0) {
                str = embedded.elementId;
            }
            return embedded.copy(message, str);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final String component2() {
            return this.elementId;
        }

        @NotNull
        public final Embedded copy(@NotNull Message message, @NotNull String elementId) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elementId, "elementId");
            return new Embedded(message, elementId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Embedded)) {
                return false;
            }
            Embedded embedded = (Embedded) obj;
            return Intrinsics.areEqual(this.message, embedded.message) && Intrinsics.areEqual(this.elementId, embedded.elementId);
        }

        @NotNull
        public final String getElementId() {
            return this.elementId;
        }

        @Override // io.customer.messaginginapp.state.InlineMessageState
        @NotNull
        public Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.elementId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Embedded(message=" + getMessage().getQueueId() + ", elementId=" + this.elementId + ")";
        }
    }

    public static final class ReadyToEmbed extends InlineMessageState {

        @NotNull
        private final String elementId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyToEmbed(@NotNull Message message, @NotNull String elementId) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elementId, "elementId");
            this.message = message;
            this.elementId = elementId;
        }

        public static /* synthetic */ ReadyToEmbed copy$default(ReadyToEmbed readyToEmbed, Message message, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = readyToEmbed.message;
            }
            if ((i10 & 2) != 0) {
                str = readyToEmbed.elementId;
            }
            return readyToEmbed.copy(message, str);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final String component2() {
            return this.elementId;
        }

        @NotNull
        public final ReadyToEmbed copy(@NotNull Message message, @NotNull String elementId) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(elementId, "elementId");
            return new ReadyToEmbed(message, elementId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadyToEmbed)) {
                return false;
            }
            ReadyToEmbed readyToEmbed = (ReadyToEmbed) obj;
            return Intrinsics.areEqual(this.message, readyToEmbed.message) && Intrinsics.areEqual(this.elementId, readyToEmbed.elementId);
        }

        @NotNull
        public final String getElementId() {
            return this.elementId;
        }

        @Override // io.customer.messaginginapp.state.InlineMessageState
        @NotNull
        public Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.elementId.hashCode();
        }

        @NotNull
        public String toString() {
            return "ReadyToEmbed(message=" + getMessage().getQueueId() + ", elementId=" + this.elementId + ")";
        }
    }

    public /* synthetic */ InlineMessageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract Message getMessage();

    private InlineMessageState() {
    }
}
