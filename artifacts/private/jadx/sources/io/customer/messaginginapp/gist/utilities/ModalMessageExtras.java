package io.customer.messaginginapp.gist.utilities;

import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.MessagePosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalMessageExtras {

    @NotNull
    private final Message message;

    @NotNull
    private final MessagePosition messagePosition;

    public ModalMessageExtras(@NotNull Message message, @NotNull MessagePosition messagePosition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messagePosition, "messagePosition");
        this.message = message;
        this.messagePosition = messagePosition;
    }

    public static /* synthetic */ ModalMessageExtras copy$default(ModalMessageExtras modalMessageExtras, Message message, MessagePosition messagePosition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = modalMessageExtras.message;
        }
        if ((i10 & 2) != 0) {
            messagePosition = modalMessageExtras.messagePosition;
        }
        return modalMessageExtras.copy(message, messagePosition);
    }

    @NotNull
    public final Message component1() {
        return this.message;
    }

    @NotNull
    public final MessagePosition component2() {
        return this.messagePosition;
    }

    @NotNull
    public final ModalMessageExtras copy(@NotNull Message message, @NotNull MessagePosition messagePosition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messagePosition, "messagePosition");
        return new ModalMessageExtras(message, messagePosition);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalMessageExtras)) {
            return false;
        }
        ModalMessageExtras modalMessageExtras = (ModalMessageExtras) obj;
        return Intrinsics.areEqual(this.message, modalMessageExtras.message) && this.messagePosition == modalMessageExtras.messagePosition;
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    public final MessagePosition getMessagePosition() {
        return this.messagePosition;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.messagePosition.hashCode();
    }

    @NotNull
    public String toString() {
        return "ModalMessageExtras(message=" + this.message + ", messagePosition=" + this.messagePosition + ")";
    }
}
