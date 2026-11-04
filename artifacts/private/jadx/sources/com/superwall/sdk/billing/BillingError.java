package com.superwall.sdk.billing;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BillingError extends Exception {
    private final int code;

    @NotNull
    private final String description;

    public static final class BillingNotAvailable extends BillingError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillingNotAvailable(@NotNull String description) {
            super(2, description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    public static final class IllegalStateException extends BillingError {

        @NotNull
        public static final IllegalStateException INSTANCE = new IllegalStateException();

        private IllegalStateException() {
            super(1, "IllegalStateException when connecting to billing client", null);
        }
    }

    public static final class UnknownError extends BillingError {

        @NotNull
        public static final UnknownError INSTANCE = new UnknownError();

        private UnknownError() {
            super(0, "Unknown error.", null);
        }
    }

    public /* synthetic */ BillingError(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    private BillingError(int i10, String str) {
        super(str);
        this.code = i10;
        this.description = str;
    }
}
