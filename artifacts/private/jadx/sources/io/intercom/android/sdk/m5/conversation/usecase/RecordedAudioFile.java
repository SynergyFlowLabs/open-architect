package io.intercom.android.sdk.m5.conversation.usecase;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class RecordedAudioFile {
    public static final int $stable = 8;

    @NotNull
    private final File file;

    @NotNull
    private final Uri uri;

    public RecordedAudioFile(@NotNull File file, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.file = file;
        this.uri = uri;
    }

    public static /* synthetic */ RecordedAudioFile copy$default(RecordedAudioFile recordedAudioFile, File file, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = recordedAudioFile.file;
        }
        if ((i10 & 2) != 0) {
            uri = recordedAudioFile.uri;
        }
        return recordedAudioFile.copy(file, uri);
    }

    @NotNull
    public final File component1() {
        return this.file;
    }

    @NotNull
    public final Uri component2() {
        return this.uri;
    }

    @NotNull
    public final RecordedAudioFile copy(@NotNull File file, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new RecordedAudioFile(file, uri);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedAudioFile)) {
            return false;
        }
        RecordedAudioFile recordedAudioFile = (RecordedAudioFile) obj;
        return Intrinsics.areEqual(this.file, recordedAudioFile.file) && Intrinsics.areEqual(this.uri, recordedAudioFile.uri);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + this.uri.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecordedAudioFile(file=" + this.file + ", uri=" + this.uri + ')';
    }
}
