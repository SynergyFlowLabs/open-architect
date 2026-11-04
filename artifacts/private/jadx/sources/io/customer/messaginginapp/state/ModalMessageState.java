package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ModalMessageState {

    public static final class Dismissed extends ModalMessageState {

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

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Dismissed(message=" + this.message.getQueueId() + ")";
        }
    }

    public static final class Displayed extends ModalMessageState {

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Displayed(@NotNull Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Displayed copy$default(Displayed displayed, Message message, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = displayed.message;
            }
            return displayed.copy(message);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final Displayed copy(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Displayed(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Displayed) && Intrinsics.areEqual(this.message, ((Displayed) obj).message);
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Displayed(message=" + this.message.getQueueId() + ")";
        }
    }

    public static final class Initial extends ModalMessageState {

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }

    public static final class Loading extends ModalMessageState {

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, Message message, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = loading.message;
            }
            return loading.copy(message);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final Loading copy(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Loading(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.message, ((Loading) obj).message);
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(message=" + this.message.getQueueId() + ")";
        }
    }

    public /* synthetic */ ModalMessageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ModalMessageState() {
    }
}
