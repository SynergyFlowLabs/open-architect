package io.intercom.android.sdk.m5.conversation.utils.audio;

import androidx.compose.runtime.internal.w0;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.e0;
import okhttp3.x;
import okio.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AudioRequestBody extends e0 {
    public static final int $stable = 8;

    @NotNull
    private final File audioFile;

    @NotNull
    private final e0 fileRequestBody;

    public AudioRequestBody(@NotNull File audioFile) {
        Intrinsics.checkNotNullParameter(audioFile, "audioFile");
        this.audioFile = audioFile;
        this.fileRequestBody = e0.Companion.a(audioFile, x.f334808e.d(AudioConstants.AUDIO_MEDIA_TYPE));
    }

    @Override // okhttp3.e0
    public long contentLength() {
        return this.fileRequestBody.contentLength();
    }

    @Override // okhttp3.e0
    @Nullable
    public x contentType() {
        return this.fileRequestBody.contentType();
    }

    @Override // okhttp3.e0
    public void writeTo(@NotNull m sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.fileRequestBody.writeTo(sink);
    }
}
