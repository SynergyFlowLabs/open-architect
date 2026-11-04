package io.intercom.android.sdk.m5.conversation.errors;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public abstract class VoiceTranscriptionError {
    public static final int $stable = 8;

    @Nullable
    private final Throwable cause;

    @NotNull
    private final String debugMessage;

    @NotNull
    private final StringProvider userMessage;

    @w0(parameters = 1)
    public static final class FileTooLarge extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FileTooLarge(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge(@Nullable Throwable th2) {
            super(new StringProvider.StringRes(R.string.intercom_file_too_large_to_transcribe, null, 2, 0 == true ? 1 : 0), "Audio file exceeds maximum size limit", th2, 0 == true ? 1 : 0);
        }
    }

    @w0(parameters = 1)
    public static final class RecordingFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RecordingFailed(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed(@Nullable Throwable th2) {
            String message;
            Object[] objArr = 0;
            StringProvider.StringRes stringRes = new StringProvider.StringRes(R.string.intercom_something_went_wrong_try_again, null, 2, 0 == true ? 1 : 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Audio recording failed: ");
            sb2.append((th2 == null || (message = th2.getMessage()) == null) ? "Unknown error" : message);
            super(stringRes, sb2.toString(), th2, objArr == true ? 1 : 0);
        }
    }

    @w0(parameters = 1)
    public static final class TranscriptionFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TranscriptionFailed(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed(@Nullable Throwable th2) {
            String message;
            Object[] objArr = 0;
            StringProvider.StringRes stringRes = new StringProvider.StringRes(R.string.intercom_transcription_failed, null, 2, 0 == true ? 1 : 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Transcription failed: ");
            sb2.append((th2 == null || (message = th2.getMessage()) == null) ? "Unknown error" : message);
            super(stringRes, sb2.toString(), th2, objArr == true ? 1 : 0);
        }
    }

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, str, th2);
    }

    @Nullable
    public final Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    @NotNull
    public final StringProvider getUserMessage() {
        return this.userMessage;
    }

    private VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th2) {
        this.userMessage = stringProvider;
        this.debugMessage = str;
        this.cause = th2;
    }

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, str, (i10 & 4) != 0 ? null : th2, null);
    }
}
