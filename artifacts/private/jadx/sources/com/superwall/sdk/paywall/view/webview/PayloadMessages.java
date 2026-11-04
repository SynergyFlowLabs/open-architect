package com.superwall.sdk.paywall.view.webview;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PayloadMessages {

    @NotNull
    private final List<PaywallMessage> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public PayloadMessages(@NotNull List<? extends PaywallMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayloadMessages copy$default(PayloadMessages payloadMessages, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = payloadMessages.messages;
        }
        return payloadMessages.copy(list);
    }

    @NotNull
    public final List<PaywallMessage> component1() {
        return this.messages;
    }

    @NotNull
    public final PayloadMessages copy(@NotNull List<? extends PaywallMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new PayloadMessages(messages);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayloadMessages) && Intrinsics.areEqual(this.messages, ((PayloadMessages) obj).messages);
    }

    @NotNull
    public final List<PaywallMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    @NotNull
    public String toString() {
        return "PayloadMessages(messages=" + this.messages + ")";
    }
}
