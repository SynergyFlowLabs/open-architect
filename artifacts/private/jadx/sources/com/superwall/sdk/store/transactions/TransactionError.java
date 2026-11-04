package com.superwall.sdk.store.transactions;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TransactionError extends Throwable {

    public static final class Failure extends TransactionError {

        @NotNull
        private final String message;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String message, @NotNull StoreProduct product) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(product, "product");
            this.message = message;
            this.product = product;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, StoreProduct storeProduct, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.message;
            }
            if ((i10 & 2) != 0) {
                storeProduct = failure.product;
            }
            return failure.copy(str, storeProduct);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final StoreProduct component2() {
            return this.product;
        }

        @NotNull
        public final Failure copy(@NotNull String message, @NotNull StoreProduct product) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(product, "product");
            return new Failure(message, product);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.message, failure.message) && Intrinsics.areEqual(this.product, failure.product);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.product.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Failure(message=" + this.message + ", product=" + this.product + ")";
        }
    }

    public static final class Pending extends TransactionError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Pending copy$default(Pending pending, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pending.message;
            }
            return pending.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final Pending copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Pending(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Pending) && Intrinsics.areEqual(this.message, ((Pending) obj).message)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Pending(message=" + this.message + ")";
        }
    }

    public /* synthetic */ TransactionError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransactionError() {
    }
}
