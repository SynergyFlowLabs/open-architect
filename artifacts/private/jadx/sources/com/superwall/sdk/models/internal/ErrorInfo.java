package com.superwall.sdk.models.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ErrorInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String message;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ErrorInfo> serializer() {
            return ErrorInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ErrorInfo(int i10, String str, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, ErrorInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorInfo.message;
        }
        return errorInfo.copy(str);
    }

    @a0("message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final ErrorInfo copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorInfo(message);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorInfo) && Intrinsics.areEqual(this.message, ((ErrorInfo) obj).message);
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
        return "ErrorInfo(message=" + this.message + ")";
    }

    public ErrorInfo(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }
}
