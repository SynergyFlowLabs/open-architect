package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PaywallPresentationInfo {
    private final long delay;

    @NotNull
    private final PaywallPresentationStyle style;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {PaywallPresentationStyle.Companion.serializer(), null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PaywallPresentationInfo> serializer() {
            return PaywallPresentationInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaywallPresentationInfo(int i10, PaywallPresentationStyle paywallPresentationStyle, long j10, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, PaywallPresentationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.style = paywallPresentationStyle;
        this.delay = j10;
    }

    public static /* synthetic */ PaywallPresentationInfo copy$default(PaywallPresentationInfo paywallPresentationInfo, PaywallPresentationStyle paywallPresentationStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallPresentationStyle = paywallPresentationInfo.style;
        }
        if ((i10 & 2) != 0) {
            j10 = paywallPresentationInfo.delay;
        }
        return paywallPresentationInfo.copy(paywallPresentationStyle, j10);
    }

    @a0("delay")
    public static /* synthetic */ void getDelay$annotations() {
    }

    @a0("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PaywallPresentationInfo paywallPresentationInfo, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], paywallPresentationInfo.style);
        eVar.encodeLongElement(serialDescriptor, 1, paywallPresentationInfo.delay);
    }

    @NotNull
    public final PaywallPresentationStyle component1() {
        return this.style;
    }

    public final long component2() {
        return this.delay;
    }

    @NotNull
    public final PaywallPresentationInfo copy(@NotNull PaywallPresentationStyle style, long j10) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new PaywallPresentationInfo(style, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPresentationInfo)) {
            return false;
        }
        PaywallPresentationInfo paywallPresentationInfo = (PaywallPresentationInfo) obj;
        return this.style == paywallPresentationInfo.style && this.delay == paywallPresentationInfo.delay;
    }

    public final long getDelay() {
        return this.delay;
    }

    @NotNull
    public final PaywallPresentationStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return (this.style.hashCode() * 31) + Long.hashCode(this.delay);
    }

    @NotNull
    public String toString() {
        return "PaywallPresentationInfo(style=" + this.style + ", delay=" + this.delay + ")";
    }

    public PaywallPresentationInfo(@NotNull PaywallPresentationStyle style, long j10) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
        this.delay = j10;
    }
}
