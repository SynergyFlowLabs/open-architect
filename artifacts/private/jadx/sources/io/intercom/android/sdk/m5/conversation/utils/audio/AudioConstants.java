package io.intercom.android.sdk.m5.conversation.utils.audio;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class AudioConstants {
    public static final int $stable = 0;
    public static final int AUDIO_BIT_RATE = 128000;
    public static final int AUDIO_FILE_BUFFER_SIZE = 2048;

    @NotNull
    public static final String AUDIO_FILE_EXTENSION = ".m4a";

    @NotNull
    public static final String AUDIO_MEDIA_TYPE = "audio/m4a";
    public static final int AUDIO_SAMPLE_RATE = 44100;
    public static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    public static final int FILE_AVAILABILITY_MAX_RETRIES = 10;

    @NotNull
    public static final AudioConstants INSTANCE = new AudioConstants();
    public static final int MAX_AUDIO_FILE_SIZE_MB = 10;
    public static final long MAX_RECORDING_DURATION_MS = 300000;
    public static final long MIN_RECORDING_DURATION_MS = 1000;

    @NotNull
    public static final String TEMP_AUDIO_FILE_PREFIX = "intercom_voice_";
    public static final long TRANSCRIPTION_TIMEOUT_MS = 30000;

    private AudioConstants() {
    }
}
