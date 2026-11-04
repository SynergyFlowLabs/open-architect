package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Part;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class PendingMessage {
    public static final int $stable = 8;

    @Nullable
    private final FailedImageUploadData failedImageUploadData;
    private final boolean isFailed;

    @NotNull
    private final Part part;

    @w0(parameters = 0)
    public static final class FailedImageUploadData {
        public static final int $stable = 8;

        @NotNull
        private final String clientAssignedUUID;

        @NotNull
        private final MediaData.Media imageData;

        public FailedImageUploadData(@NotNull String clientAssignedUUID, @NotNull MediaData.Media imageData) {
            Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
            Intrinsics.checkNotNullParameter(imageData, "imageData");
            this.clientAssignedUUID = clientAssignedUUID;
            this.imageData = imageData;
        }

        public static /* synthetic */ FailedImageUploadData copy$default(FailedImageUploadData failedImageUploadData, String str, MediaData.Media media, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failedImageUploadData.clientAssignedUUID;
            }
            if ((i10 & 2) != 0) {
                media = failedImageUploadData.imageData;
            }
            return failedImageUploadData.copy(str, media);
        }

        @NotNull
        public final String component1() {
            return this.clientAssignedUUID;
        }

        @NotNull
        public final MediaData.Media component2() {
            return this.imageData;
        }

        @NotNull
        public final FailedImageUploadData copy(@NotNull String clientAssignedUUID, @NotNull MediaData.Media imageData) {
            Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
            Intrinsics.checkNotNullParameter(imageData, "imageData");
            return new FailedImageUploadData(clientAssignedUUID, imageData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedImageUploadData)) {
                return false;
            }
            FailedImageUploadData failedImageUploadData = (FailedImageUploadData) obj;
            return Intrinsics.areEqual(this.clientAssignedUUID, failedImageUploadData.clientAssignedUUID) && Intrinsics.areEqual(this.imageData, failedImageUploadData.imageData);
        }

        @NotNull
        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        @NotNull
        public final MediaData.Media getImageData() {
            return this.imageData;
        }

        public int hashCode() {
            return (this.clientAssignedUUID.hashCode() * 31) + this.imageData.hashCode();
        }

        @NotNull
        public String toString() {
            return "FailedImageUploadData(clientAssignedUUID=" + this.clientAssignedUUID + ", imageData=" + this.imageData + ')';
        }
    }

    public PendingMessage(@NotNull Part part, boolean z10, @Nullable FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.part = part;
        this.isFailed = z10;
        this.failedImageUploadData = failedImageUploadData;
    }

    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Part part, boolean z10, FailedImageUploadData failedImageUploadData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            part = pendingMessage.part;
        }
        if ((i10 & 2) != 0) {
            z10 = pendingMessage.isFailed;
        }
        if ((i10 & 4) != 0) {
            failedImageUploadData = pendingMessage.failedImageUploadData;
        }
        return pendingMessage.copy(part, z10, failedImageUploadData);
    }

    @NotNull
    public final Part component1() {
        return this.part;
    }

    public final boolean component2() {
        return this.isFailed;
    }

    @Nullable
    public final FailedImageUploadData component3() {
        return this.failedImageUploadData;
    }

    @NotNull
    public final PendingMessage copy(@NotNull Part part, boolean z10, @Nullable FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(part, "part");
        return new PendingMessage(part, z10, failedImageUploadData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) obj;
        return Intrinsics.areEqual(this.part, pendingMessage.part) && this.isFailed == pendingMessage.isFailed && Intrinsics.areEqual(this.failedImageUploadData, pendingMessage.failedImageUploadData);
    }

    @Nullable
    public final FailedImageUploadData getFailedImageUploadData() {
        return this.failedImageUploadData;
    }

    @NotNull
    public final Part getPart() {
        return this.part;
    }

    public int hashCode() {
        int iHashCode = ((this.part.hashCode() * 31) + Boolean.hashCode(this.isFailed)) * 31;
        FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
        return iHashCode + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode());
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    @NotNull
    public String toString() {
        return "PendingMessage(part=" + this.part + ", isFailed=" + this.isFailed + ", failedImageUploadData=" + this.failedImageUploadData + ')';
    }

    public /* synthetic */ PendingMessage(Part part, boolean z10, FailedImageUploadData failedImageUploadData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(part, z10, (i10 & 4) != 0 ? null : failedImageUploadData);
    }
}
