package com.superwall.sdk.utilities;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ErrorTracking {

    @b0
    public static final class ErrorOccurence {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final boolean isFatal;

        @NotNull
        private final String message;

        @NotNull
        private final String stacktrace;
        private final long timestamp;

        @NotNull
        private final String type;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<ErrorOccurence> serializer() {
                return ErrorTracking$ErrorOccurence$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ErrorOccurence(int i10, String str, String str2, String str3, long j10, boolean z10, v2 v2Var) {
            if (31 != (i10 & 31)) {
                g2.b(i10, 31, ErrorTracking$ErrorOccurence$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            this.message = str2;
            this.stacktrace = str3;
            this.timestamp = j10;
            this.isFatal = z10;
        }

        public static /* synthetic */ ErrorOccurence copy$default(ErrorOccurence errorOccurence, String str, String str2, String str3, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorOccurence.type;
            }
            if ((i10 & 2) != 0) {
                str2 = errorOccurence.message;
            }
            if ((i10 & 4) != 0) {
                str3 = errorOccurence.stacktrace;
            }
            if ((i10 & 8) != 0) {
                j10 = errorOccurence.timestamp;
            }
            if ((i10 & 16) != 0) {
                z10 = errorOccurence.isFatal;
            }
            boolean z11 = z10;
            String str4 = str3;
            return errorOccurence.copy(str, str2, str4, j10, z11);
        }

        @a0("message")
        public static /* synthetic */ void getMessage$annotations() {
        }

        @a0("stacktrace")
        public static /* synthetic */ void getStacktrace$annotations() {
        }

        @a0("timestamp")
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @a0("type")
        public static /* synthetic */ void getType$annotations() {
        }

        @a0("isFatal")
        public static /* synthetic */ void isFatal$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(ErrorOccurence errorOccurence, e eVar, SerialDescriptor serialDescriptor) {
            eVar.encodeStringElement(serialDescriptor, 0, errorOccurence.type);
            eVar.encodeStringElement(serialDescriptor, 1, errorOccurence.message);
            eVar.encodeStringElement(serialDescriptor, 2, errorOccurence.stacktrace);
            eVar.encodeLongElement(serialDescriptor, 3, errorOccurence.timestamp);
            eVar.encodeBooleanElement(serialDescriptor, 4, errorOccurence.isFatal);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        @NotNull
        public final String component2() {
            return this.message;
        }

        @NotNull
        public final String component3() {
            return this.stacktrace;
        }

        public final long component4() {
            return this.timestamp;
        }

        public final boolean component5() {
            return this.isFatal;
        }

        @NotNull
        public final ErrorOccurence copy(@NotNull String type, @NotNull String message, @NotNull String stacktrace, long j10, boolean z10) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            return new ErrorOccurence(type, message, stacktrace, j10, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorOccurence)) {
                return false;
            }
            ErrorOccurence errorOccurence = (ErrorOccurence) obj;
            return Intrinsics.areEqual(this.type, errorOccurence.type) && Intrinsics.areEqual(this.message, errorOccurence.message) && Intrinsics.areEqual(this.stacktrace, errorOccurence.stacktrace) && this.timestamp == errorOccurence.timestamp && this.isFatal == errorOccurence.isFatal;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((this.type.hashCode() * 31) + this.message.hashCode()) * 31) + this.stacktrace.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isFatal);
        }

        public final boolean isFatal() {
            return this.isFatal;
        }

        @NotNull
        public String toString() {
            return "ErrorOccurence(type=" + this.type + ", message=" + this.message + ", stacktrace=" + this.stacktrace + ", timestamp=" + this.timestamp + ", isFatal=" + this.isFatal + ")";
        }

        public ErrorOccurence(@NotNull String type, @NotNull String message, @NotNull String stacktrace, long j10, boolean z10) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            this.type = type;
            this.message = message;
            this.stacktrace = stacktrace;
            this.timestamp = j10;
            this.isFatal = z10;
        }
    }

    void trackError(@NotNull Throwable th2);
}
