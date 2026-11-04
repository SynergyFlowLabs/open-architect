package com.superwall.sdk.paywall.view.webview;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class WrappedPaywallMessages {

    @NotNull
    private final PayloadMessages payload;
    private int version;

    public WrappedPaywallMessages(int i10, @NotNull PayloadMessages payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.version = i10;
        this.payload = payload;
    }

    public static /* synthetic */ WrappedPaywallMessages copy$default(WrappedPaywallMessages wrappedPaywallMessages, int i10, PayloadMessages payloadMessages, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = wrappedPaywallMessages.version;
        }
        if ((i11 & 2) != 0) {
            payloadMessages = wrappedPaywallMessages.payload;
        }
        return wrappedPaywallMessages.copy(i10, payloadMessages);
    }

    public final int component1() {
        return this.version;
    }

    @NotNull
    public final PayloadMessages component2() {
        return this.payload;
    }

    @NotNull
    public final WrappedPaywallMessages copy(int i10, @NotNull PayloadMessages payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new WrappedPaywallMessages(i10, payload);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedPaywallMessages)) {
            return false;
        }
        WrappedPaywallMessages wrappedPaywallMessages = (WrappedPaywallMessages) obj;
        return this.version == wrappedPaywallMessages.version && Intrinsics.areEqual(this.payload, wrappedPaywallMessages.payload);
    }

    @NotNull
    public final PayloadMessages getPayload() {
        return this.payload;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.payload.hashCode();
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }

    @NotNull
    public String toString() {
        return "WrappedPaywallMessages(version=" + this.version + ", payload=" + this.payload + ")";
    }

    public /* synthetic */ WrappedPaywallMessages(int i10, PayloadMessages payloadMessages, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1 : i10, payloadMessages);
    }
}
