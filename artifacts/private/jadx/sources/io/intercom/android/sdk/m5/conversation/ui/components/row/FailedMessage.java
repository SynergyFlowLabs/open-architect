package io.intercom.android.sdk.m5.conversation.ui.components.row;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class FailedMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    @NotNull
    private final Function0<Unit> onRetryMessageClicked;

    public FailedMessage(@NotNull String message, @NotNull Function0<Unit> onRetryMessageClicked) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRetryMessageClicked, "onRetryMessageClicked");
        this.message = message;
        this.onRetryMessageClicked = onRetryMessageClicked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedMessage copy$default(FailedMessage failedMessage, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = failedMessage.message;
        }
        if ((i10 & 2) != 0) {
            function0 = failedMessage.onRetryMessageClicked;
        }
        return failedMessage.copy(str, function0);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onRetryMessageClicked;
    }

    @NotNull
    public final FailedMessage copy(@NotNull String message, @NotNull Function0<Unit> onRetryMessageClicked) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRetryMessageClicked, "onRetryMessageClicked");
        return new FailedMessage(message, onRetryMessageClicked);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedMessage)) {
            return false;
        }
        FailedMessage failedMessage = (FailedMessage) obj;
        return Intrinsics.areEqual(this.message, failedMessage.message) && Intrinsics.areEqual(this.onRetryMessageClicked, failedMessage.onRetryMessageClicked);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Function0<Unit> getOnRetryMessageClicked() {
        return this.onRetryMessageClicked;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.onRetryMessageClicked.hashCode();
    }

    @NotNull
    public String toString() {
        return "FailedMessage(message=" + this.message + ", onRetryMessageClicked=" + this.onRetryMessageClicked + ')';
    }
}
