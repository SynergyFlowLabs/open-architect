package com.devtodev.analytics.internal.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GoogleAdvertisingIdResult {

    public static final class AdvertisingId extends GoogleAdvertisingIdResult {
        private final boolean isLimitAdTrackingEnabled;

        @Nullable
        private final String token;

        public AdvertisingId(@Nullable String str, boolean z10) {
            super(null);
            this.token = str;
            this.isLimitAdTrackingEnabled = z10;
        }

        public static /* synthetic */ AdvertisingId copy$default(AdvertisingId advertisingId, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = advertisingId.token;
            }
            if ((i10 & 2) != 0) {
                z10 = advertisingId.isLimitAdTrackingEnabled;
            }
            return advertisingId.copy(str, z10);
        }

        @Nullable
        public final String component1() {
            return this.token;
        }

        public final boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public final AdvertisingId copy(@Nullable String str, boolean z10) {
            return new AdvertisingId(str, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertisingId)) {
                return false;
            }
            AdvertisingId advertisingId = (AdvertisingId) obj;
            return Intrinsics.areEqual(this.token, advertisingId.token) && this.isLimitAdTrackingEnabled == advertisingId.isLimitAdTrackingEnabled;
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
            return "AdvertisingId(token=" + this.token + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ")";
        }
    }

    public static final class ExceptionData extends GoogleAdvertisingIdResult {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExceptionData(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
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
            return (obj instanceof ExceptionData) && Intrinsics.areEqual(this.message, ((ExceptionData) obj).message);
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
            return "ExceptionData(message=" + this.message + ")";
        }
    }

    public /* synthetic */ GoogleAdvertisingIdResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoogleAdvertisingIdResult() {
    }
}
