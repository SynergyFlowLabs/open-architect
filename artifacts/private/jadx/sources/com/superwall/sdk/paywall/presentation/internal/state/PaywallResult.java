package com.superwall.sdk.paywall.presentation.internal.state;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallResult {

    public static final class Declined extends PaywallResult {
        public Declined() {
            super(null);
        }
    }

    public static final class Purchased extends PaywallResult {

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchased(@NotNull String productId) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
        }

        public static /* synthetic */ Purchased copy$default(Purchased purchased, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = purchased.productId;
            }
            return purchased.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.productId;
        }

        @NotNull
        public final Purchased copy(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new Purchased(productId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Purchased) && Intrinsics.areEqual(this.productId, ((Purchased) obj).productId);
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Purchased(productId=" + this.productId + ")";
        }
    }

    public static final class Restored extends PaywallResult {
        public Restored() {
            super(null);
        }
    }

    public /* synthetic */ PaywallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallResult() {
    }
}
