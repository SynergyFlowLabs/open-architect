package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AttachmentSettings {

    @c("conversation_camera_enabled")
    private final boolean cameraEnabled;

    @c("conversation_files_enabled")
    private final boolean filesEnabled;

    @c("conversation_gifs_enabled")
    private final boolean gifsEnabled;

    @c("conversation_media_enabled")
    private final boolean mediaEnabled;

    @c("file_upload_extension_trusted_list")
    @NotNull
    private final Set<String> trustedFileExtensions;

    @c("upload_size_limit")
    private final long uploadSizeLimit;

    @c("conversation_voice_notes_enabled")
    private final boolean voiceNotesEnabled;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;

    @NotNull
    private static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, true, SetsKt.emptySet(), DEFAULT_UPLOAD_SIZE_LIMIT);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public AttachmentSettings(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull Set<String> trustedFileExtensions, long j10) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.cameraEnabled = z10;
        this.mediaEnabled = z11;
        this.filesEnabled = z12;
        this.gifsEnabled = z13;
        this.voiceNotesEnabled = z14;
        this.trustedFileExtensions = trustedFileExtensions;
        this.uploadSizeLimit = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Set set, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = attachmentSettings.cameraEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = attachmentSettings.mediaEnabled;
        }
        if ((i10 & 4) != 0) {
            z12 = attachmentSettings.filesEnabled;
        }
        if ((i10 & 8) != 0) {
            z13 = attachmentSettings.gifsEnabled;
        }
        if ((i10 & 16) != 0) {
            z14 = attachmentSettings.voiceNotesEnabled;
        }
        if ((i10 & 32) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        if ((i10 & 64) != 0) {
            j10 = attachmentSettings.uploadSizeLimit;
        }
        long j11 = j10;
        boolean z15 = z14;
        Set set2 = set;
        return attachmentSettings.copy(z10, z11, z12, z13, z15, set2, j11);
    }

    public final boolean component1() {
        return this.cameraEnabled;
    }

    public final boolean component2() {
        return this.mediaEnabled;
    }

    public final boolean component3() {
        return this.filesEnabled;
    }

    public final boolean component4() {
        return this.gifsEnabled;
    }

    public final boolean component5() {
        return this.voiceNotesEnabled;
    }

    @NotNull
    public final Set<String> component6() {
        return this.trustedFileExtensions;
    }

    public final long component7() {
        return this.uploadSizeLimit;
    }

    @NotNull
    public final AttachmentSettings copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull Set<String> trustedFileExtensions, long j10) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        return new AttachmentSettings(z10, z11, z12, z13, z14, trustedFileExtensions, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) obj;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && this.voiceNotesEnabled == attachmentSettings.voiceNotesEnabled && Intrinsics.areEqual(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    @NotNull
    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    @NotNull
    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / ((long) 1048576));
    }

    public final boolean getVoiceNotesEnabled() {
        return this.voiceNotesEnabled;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.cameraEnabled) * 31) + Boolean.hashCode(this.mediaEnabled)) * 31) + Boolean.hashCode(this.filesEnabled)) * 31) + Boolean.hashCode(this.gifsEnabled)) * 31) + Boolean.hashCode(this.voiceNotesEnabled)) * 31) + this.trustedFileExtensions.hashCode()) * 31) + Long.hashCode(this.uploadSizeLimit);
    }

    @NotNull
    public String toString() {
        return "AttachmentSettings(cameraEnabled=" + this.cameraEnabled + ", mediaEnabled=" + this.mediaEnabled + ", filesEnabled=" + this.filesEnabled + ", gifsEnabled=" + this.gifsEnabled + ", voiceNotesEnabled=" + this.voiceNotesEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ", uploadSizeLimit=" + this.uploadSizeLimit + ')';
    }
}
