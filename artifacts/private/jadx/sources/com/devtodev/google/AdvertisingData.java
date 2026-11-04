package com.devtodev.google;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdvertisingData {

    public static final class ExceptionData extends AdvertisingData {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExceptionData(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            int i10 = 6 & 0;
            this.message = message;
        }

        public static /* synthetic */ ExceptionData copy$default(ExceptionData exceptionData, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = exceptionData.message;
            }
            return exceptionData.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final ExceptionData copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ExceptionData(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ExceptionData) && Intrinsics.areEqual(this.message, ((ExceptionData) obj).message)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ExceptionData(message=" + this.message + ')';
        }
    }

    public static final class GoogleAdvertisingId extends AdvertisingData {
        private final boolean isLimitAdTrackingEnabled;

        @Nullable
        private final String token;

        public GoogleAdvertisingId(@Nullable String str, boolean z10) {
            super(null);
            this.token = str;
            this.isLimitAdTrackingEnabled = z10;
        }

        public static /* synthetic */ GoogleAdvertisingId copy$default(GoogleAdvertisingId googleAdvertisingId, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = googleAdvertisingId.token;
            }
            if ((i10 & 2) != 0) {
                z10 = googleAdvertisingId.isLimitAdTrackingEnabled;
            }
            return googleAdvertisingId.copy(str, z10);
        }

        @Nullable
        public final String component1() {
            return this.token;
        }

        public final boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final GoogleAdvertisingId copy(@Nullable String str, boolean z10) {
            return new GoogleAdvertisingId(str, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleAdvertisingId)) {
                return false;
            }
            GoogleAdvertisingId googleAdvertisingId = (GoogleAdvertisingId) obj;
            return Intrinsics.areEqual(this.token, googleAdvertisingId.token) && this.isLimitAdTrackingEnabled == googleAdvertisingId.isLimitAdTrackingEnabled;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            String str = this.token;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z10 = this.isLimitAdTrackingEnabled;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public String toString() {
            return "GoogleAdvertisingId(token=" + this.token + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ')';
        }
    }

    public /* synthetic */ AdvertisingData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AdvertisingData() {
    }
}
