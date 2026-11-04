package com.superwall.sdk.store.transactions;

import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RestoreType {

    public static final class ViaPurchase extends RestoreType {

        @Nullable
        private final StoreTransaction transaction;

        public ViaPurchase(@Nullable StoreTransaction storeTransaction) {
            super(null);
            this.transaction = storeTransaction;
        }

        public static /* synthetic */ ViaPurchase copy$default(ViaPurchase viaPurchase, StoreTransaction storeTransaction, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeTransaction = viaPurchase.transaction;
            }
            return viaPurchase.copy(storeTransaction);
        }

        @Nullable
        public final StoreTransaction component1() {
            return this.transaction;
        }

        @NotNull
        public final ViaPurchase copy(@Nullable StoreTransaction storeTransaction) {
            return new ViaPurchase(storeTransaction);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViaPurchase) && Intrinsics.areEqual(this.transaction, ((ViaPurchase) obj).transaction);
        }

        @Nullable
        public final StoreTransaction getTransaction() {
            return this.transaction;
        }

        public int hashCode() {
            StoreTransaction storeTransaction = this.transaction;
            if (storeTransaction == null) {
                return 0;
            }
            return storeTransaction.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViaPurchase(transaction=" + this.transaction + ")";
        }
    }

    public static final class ViaRestore extends RestoreType {

        @NotNull
        public static final ViaRestore INSTANCE = new ViaRestore();

        private ViaRestore() {
            super(null);
        }
    }

    public /* synthetic */ RestoreType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RestoreType() {
    }
}
