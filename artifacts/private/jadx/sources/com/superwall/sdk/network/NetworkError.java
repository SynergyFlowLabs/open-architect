package com.superwall.sdk.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NetworkError extends Throwable {

    public static final class Decoding extends NetworkError {
        /* JADX WARN: Multi-variable type inference failed */
        public Decoding() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Decoding(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public Decoding(@Nullable Throwable th2) {
            super("Decoding error " + (th2 != null ? th2.getMessage() : null), th2, null);
        }
    }

    public static final class InvalidUrl extends NetworkError {
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidUrl() {
            super("URL invalid.", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class NotAuthenticated extends NetworkError {
        /* JADX WARN: Multi-variable type inference failed */
        public NotAuthenticated() {
            super("Unauthorized.", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class NotFound extends NetworkError {
        /* JADX WARN: Multi-variable type inference failed */
        public NotFound() {
            super("Not found.", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Timeout extends NetworkError {

        @NotNull
        public static final Timeout INSTANCE = new Timeout();

        /* JADX WARN: Multi-variable type inference failed */
        private Timeout() {
            super("Timeout occured.", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Unknown extends NetworkError {

        @Nullable
        private final Throwable cause;

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = unknown.cause;
            }
            return unknown.copy(th2);
        }

        @Nullable
        public final Throwable component1() {
            return this.cause;
        }

        @NotNull
        public final Unknown copy(@Nullable Throwable th2) {
            return new Unknown(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.cause, ((Unknown) obj).cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Unknown(cause=" + this.cause + ")";
        }

        public /* synthetic */ Unknown(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Unknown(@Nullable Throwable th2) {
            String message;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (th2 == null || (message = th2.getLocalizedMessage()) == null) {
                message = th2 != null ? th2.getMessage() : null;
                if (message == null) {
                    message = "Unknown error occurred.";
                }
            }
            super(message, th2, defaultConstructorMarker);
            this.cause = th2;
        }
    }

    public /* synthetic */ NetworkError(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    public /* synthetic */ NetworkError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2, null);
    }

    private NetworkError(String str, Throwable th2) {
        super(str, th2);
    }
}
