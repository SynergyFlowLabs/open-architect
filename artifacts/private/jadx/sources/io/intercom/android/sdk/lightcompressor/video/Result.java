package io.intercom.android.sdk.lightcompressor.video;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Result {

    @Nullable
    private final String failureMessage;
    private final int index;

    @Nullable
    private final String path;
    private final long size;
    private final boolean success;

    public Result(int i10, boolean z10, @Nullable String str, long j10, @Nullable String str2) {
        this.index = i10;
        this.success = z10;
        this.failureMessage = str;
        this.size = j10;
        this.path = str2;
    }

    public static /* synthetic */ Result copy$default(Result result, int i10, boolean z10, String str, long j10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = result.index;
        }
        if ((i11 & 2) != 0) {
            z10 = result.success;
        }
        if ((i11 & 4) != 0) {
            str = result.failureMessage;
        }
        if ((i11 & 8) != 0) {
            j10 = result.size;
        }
        if ((i11 & 16) != 0) {
            str2 = result.path;
        }
        String str3 = str2;
        String str4 = str;
        return result.copy(i10, z10, str4, j10, str3);
    }

    public final int component1() {
        return this.index;
    }

    public final boolean component2() {
        return this.success;
    }

    @Nullable
    public final String component3() {
        return this.failureMessage;
    }

    public final long component4() {
        return this.size;
    }

    @Nullable
    public final String component5() {
        return this.path;
    }

    @NotNull
    public final Result copy(int i10, boolean z10, @Nullable String str, long j10, @Nullable String str2) {
        return new Result(i10, z10, str, j10, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.index == result.index && this.success == result.success && Intrinsics.areEqual(this.failureMessage, result.failureMessage) && this.size == result.size && Intrinsics.areEqual(this.path, result.path);
    }

    @Nullable
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.success)) * 31;
        String str = this.failureMessage;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.size)) * 31;
        String str2 = this.path;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Result(index=" + this.index + ", success=" + this.success + ", failureMessage=" + this.failureMessage + ", size=" + this.size + ", path=" + this.path + ')';
    }

    public /* synthetic */ Result(int i10, boolean z10, String str, long j10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, str, (i11 & 8) != 0 ? 0L : j10, (i11 & 16) != 0 ? null : str2);
    }
}
