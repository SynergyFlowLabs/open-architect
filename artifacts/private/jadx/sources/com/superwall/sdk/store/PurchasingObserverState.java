package com.superwall.sdk.store;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.n;
import com.android.billingclient.api.z;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PurchasingObserverState {

    public static final class PurchaseError extends PurchasingObserverState {

        @NotNull
        private final Throwable error;

        @NotNull
        private final z product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseError(@NotNull z product, @NotNull Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(error, "error");
            this.product = product;
            this.error = error;
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final z getProduct() {
            return this.product;
        }
    }

    public static final class PurchaseResult extends PurchasingObserverState {

        @Nullable
        private final List<Purchase> purchases;

        @NotNull
        private final n result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PurchaseResult(@NotNull n result, @Nullable List<? extends Purchase> list) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.purchases = list;
        }

        @Nullable
        public final List<Purchase> getPurchases() {
            return this.purchases;
        }

        @NotNull
        public final n getResult() {
            return this.result;
        }
    }

    public static final class PurchaseWillBegin extends PurchasingObserverState {

        @NotNull
        private final z product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseWillBegin(@NotNull z product) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            this.product = product;
        }

        @NotNull
        public final z getProduct() {
            return this.product;
        }
    }

    public /* synthetic */ PurchasingObserverState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PurchasingObserverState() {
    }
}
