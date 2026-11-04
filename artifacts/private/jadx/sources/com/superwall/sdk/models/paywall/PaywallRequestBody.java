package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PaywallRequestBody {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private String appUserId;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PaywallRequestBody> serializer() {
            return PaywallRequestBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaywallRequestBody(int i10, String str, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, PaywallRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.appUserId = str;
    }

    public static /* synthetic */ PaywallRequestBody copy$default(PaywallRequestBody paywallRequestBody, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallRequestBody.appUserId;
        }
        return paywallRequestBody.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.appUserId;
    }

    @NotNull
    public final PaywallRequestBody copy(@NotNull String appUserId) {
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        return new PaywallRequestBody(appUserId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallRequestBody) && Intrinsics.areEqual(this.appUserId, ((PaywallRequestBody) obj).appUserId);
    }

    @NotNull
    public final String getAppUserId() {
        return this.appUserId;
    }

    public int hashCode() {
        return this.appUserId.hashCode();
    }

    public final void setAppUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appUserId = str;
    }

    @NotNull
    public String toString() {
        return "PaywallRequestBody(appUserId=" + this.appUserId + ")";
    }

    public PaywallRequestBody(@NotNull String appUserId) {
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        this.appUserId = appUserId;
    }
}
