package com.superwall.sdk.delegate;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PurchaseResult {

    public static final class Cancelled extends PurchaseResult {
        public Cancelled() {
            super(null);
        }
    }

    public static final class Failed extends PurchaseResult {

        @NotNull
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failed.errorMessage;
            }
            return failed.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.errorMessage;
        }

        @NotNull
        public final Failed copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Failed(errorMessage);
        }

        @Override // com.superwall.sdk.delegate.PurchaseResult
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.errorMessage, ((Failed) obj).errorMessage);
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(errorMessage=" + this.errorMessage + ")";
        }
    }

    public static final class Pending extends PurchaseResult {
        public Pending() {
            super(null);
        }
    }

    public static final class Purchased extends PurchaseResult {
        public Purchased() {
            super(null);
        }
    }

    public /* synthetic */ PurchaseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object obj) {
        if ((this instanceof Cancelled) && (obj instanceof Cancelled)) {
            return true;
        }
        if ((this instanceof Purchased) && (obj instanceof Purchased)) {
            return true;
        }
        if ((this instanceof Pending) && (obj instanceof Pending)) {
            return true;
        }
        if ((this instanceof Failed) && (obj instanceof Failed)) {
            return Intrinsics.areEqual(((Failed) this).getErrorMessage(), ((Failed) obj).getErrorMessage());
        }
        return false;
    }

    private PurchaseResult() {
    }
}
