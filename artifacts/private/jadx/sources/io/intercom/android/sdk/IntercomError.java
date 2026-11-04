package io.intercom.android.sdk;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;

    @NotNull
    private final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomError() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i10, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    @NotNull
    public final String component2() {
        return this.errorMessage;
    }

    @NotNull
    public final IntercomError copy(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new IntercomError(i10, errorMessage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) obj;
        return this.errorCode == intercomError.errorCode && Intrinsics.areEqual(this.errorMessage, intercomError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntercomError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
    }

    public IntercomError(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = i10;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ IntercomError(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str);
    }
}
