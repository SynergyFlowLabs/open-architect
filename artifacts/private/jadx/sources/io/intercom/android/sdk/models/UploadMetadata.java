package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class UploadMetadata {
    public static final int $stable = 0;

    @c("safe_app_id")
    @NotNull
    private final String safeAppId;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadMetadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UploadMetadata copy$default(UploadMetadata uploadMetadata, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadMetadata.safeAppId;
        }
        return uploadMetadata.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.safeAppId;
    }

    @NotNull
    public final UploadMetadata copy(@NotNull String safeAppId) {
        Intrinsics.checkNotNullParameter(safeAppId, "safeAppId");
        return new UploadMetadata(safeAppId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UploadMetadata) && Intrinsics.areEqual(this.safeAppId, ((UploadMetadata) obj).safeAppId)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public int hashCode() {
        return this.safeAppId.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadMetadata(safeAppId=" + this.safeAppId + ')';
    }

    public UploadMetadata(@NotNull String safeAppId) {
        Intrinsics.checkNotNullParameter(safeAppId, "safeAppId");
        this.safeAppId = safeAppId;
    }

    public /* synthetic */ UploadMetadata(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
