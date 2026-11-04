package com.superwall.sdk.delegate;

import com.android.billingclient.api.Purchase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InternalPurchaseResult {

    public static final class Cancelled extends InternalPurchaseResult {

        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    public static final class Failed extends InternalPurchaseResult {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = failed.error;
            }
            return failed.copy(th2);
        }

        @NotNull
        public final Throwable component1() {
            return this.error;
        }

        @NotNull
        public final Failed copy(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(error=" + this.error + ")";
        }
    }

    public static final class Pending extends InternalPurchaseResult {

        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }
    }

    public static final class Purchased extends InternalPurchaseResult {

        @NotNull
        private final Purchase purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchased(@NotNull Purchase purchase) {
            super(null);
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.purchase = purchase;
        }

        public static /* synthetic */ Purchased copy$default(Purchased purchased, Purchase purchase, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                purchase = purchased.purchase;
            }
            return purchased.copy(purchase);
        }

        @NotNull
        public final Purchase component1() {
            return this.purchase;
        }

        @NotNull
        public final Purchased copy(@NotNull Purchase purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            return new Purchased(purchase);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Purchased) && Intrinsics.areEqual(this.purchase, ((Purchased) obj).purchase);
        }

        @NotNull
        public final Purchase getPurchase() {
            return this.purchase;
        }

        public int hashCode() {
            return this.purchase.hashCode();
        }

        @NotNull
        public String toString() {
            return "Purchased(purchase=" + this.purchase + ")";
        }
    }

    public static final class Restored extends InternalPurchaseResult {

        @NotNull
        public static final Restored INSTANCE = new Restored();

        private Restored() {
            super(null);
        }
    }

    public /* synthetic */ InternalPurchaseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalPurchaseResult() {
    }
}
