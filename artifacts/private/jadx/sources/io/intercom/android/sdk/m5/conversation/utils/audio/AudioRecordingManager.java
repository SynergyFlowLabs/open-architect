package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.FileProvider;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AudioRecordingManager {
    private static final long AMPLITUDE_MONITORING_INTERVAL_MS = 60;
    private static final int AUDIO_BIT_RATE = 128000;

    @NotNull
    private static final String AUDIO_FILE_EXTENSION = "m4a";

    @NotNull
    private static final String AUDIO_RECORDINGS_FOLDER = "audio_recordings";
    private static final int AUDIO_SAMPLE_RATE = 44100;
    private static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    private static final int FILE_AVAILABILITY_MAX_RETRIES = 10;
    private static final double MAX_AMPLITUDE_REFERENCE = 32767.0d;

    @NotNull
    private final k0<Float> _amplitudeLevel;

    @NotNull
    private final k0<RecordingState> _recordingState;

    @NotNull
    private final z0<Float> amplitudeLevel;

    @Nullable
    private p2 amplitudeMonitoringJob;

    @NotNull
    private final s0 amplitudeScope;

    @NotNull
    private final Context context;

    @Nullable
    private File currentRecordingFile;

    @Nullable
    private MediaRecorder mediaRecorder;

    @NotNull
    private final z0<RecordingState> recordingState;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface RecordingResult {

        @w0(parameters = 1)
        public static final class Error implements RecordingResult {
            public static final int $stable = 0;

            @NotNull
            private final String message;

            public Error(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.message;
            }

            @NotNull
            public final Error copy(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
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
                return "Error(message=" + this.message + ')';
            }
        }

        @w0(parameters = 1)
        public static final class Success implements RecordingResult {
            public static final int $stable = 0;

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 1987294265;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }
    }

    public interface RecordingState {

        @w0(parameters = 0)
        public static final class Completed implements RecordingState {
            public static final int $stable = 8;

            @NotNull
            private final File file;

            @NotNull
            private final Uri uri;

            public Completed(@NotNull Uri uri, @NotNull File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                this.uri = uri;
                this.file = file;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, Uri uri, File file, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    uri = completed.uri;
                }
                if ((i10 & 2) != 0) {
                    file = completed.file;
                }
                return completed.copy(uri, file);
            }

            @NotNull
            public final Uri component1() {
                return this.uri;
            }

            @NotNull
            public final File component2() {
                return this.file;
            }

            @NotNull
            public final Completed copy(@NotNull Uri uri, @NotNull File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                return new Completed(uri, file);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Completed)) {
                    return false;
                }
                Completed completed = (Completed) obj;
                return Intrinsics.areEqual(this.uri, completed.uri) && Intrinsics.areEqual(this.file, completed.file);
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
                return (this.uri.hashCode() * 31) + this.file.hashCode();
            }

            @NotNull
            public String toString() {
                return "Completed(uri=" + this.uri + ", file=" + this.file + ')';
            }
        }

        @w0(parameters = 1)
        public static final class Error implements RecordingState {
            public static final int $stable = 0;

            @NotNull
            private final String message;

            public Error(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.message;
            }

            @NotNull
            public final Error copy(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message)) {
                    return true;
                }
                return false;
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
                return "Error(message=" + this.message + ')';
            }
        }

        @w0(parameters = 1)
        public static final class Idle implements RecordingState {
            public static final int $stable = 0;

            @NotNull
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof Idle)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -114329640;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @w0(parameters = 0)
        public static final class Recording implements RecordingState {
            public static final int $stable = 8;

            @NotNull
            private final File file;

            public Recording(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            public static /* synthetic */ Recording copy$default(Recording recording, File file, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    file = recording.file;
                }
                return recording.copy(file);
            }

            @NotNull
            public final File component1() {
                return this.file;
            }

            @NotNull
            public final Recording copy(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return new Recording(file);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Recording) && Intrinsics.areEqual(this.file, ((Recording) obj).file);
            }

            @NotNull
            public final File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            @NotNull
            public String toString() {
                return "Recording(file=" + this.file + ')';
            }
        }
    }

    public interface RecordingStopResult {

        @w0(parameters = 1)
        public static final class Error implements RecordingStopResult {
            public static final int $stable = 0;

            @NotNull
            private final String message;

            public Error(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.message;
            }

            @NotNull
            public final Error copy(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
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
                return "Error(message=" + this.message + ')';
            }
        }

        @w0(parameters = 0)
        public static final class Success implements RecordingStopResult {
            public static final int $stable = 8;

            @NotNull
            private final File file;

            @NotNull
            private final Uri uri;

            public Success(@NotNull Uri uri, @NotNull File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                this.uri = uri;
                this.file = file;
            }

            public static /* synthetic */ Success copy$default(Success success, Uri uri, File file, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    uri = success.uri;
                }
                if ((i10 & 2) != 0) {
                    file = success.file;
                }
                return success.copy(uri, file);
            }

            @NotNull
            public final Uri component1() {
                return this.uri;
            }

            @NotNull
            public final File component2() {
                return this.file;
            }

            @NotNull
            public final Success copy(@NotNull Uri uri, @NotNull File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                return new Success(uri, file);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.uri, success.uri) && Intrinsics.areEqual(this.file, success.file);
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
                return (this.uri.hashCode() * 31) + this.file.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(uri=" + this.uri + ", file=" + this.file + ')';
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager$startAmplitudeMonitoring$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager$startAmplitudeMonitoring$1", f = "AudioRecordingManager.kt", i = {0}, l = {346}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ MediaRecorder $recorder;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AudioRecordingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediaRecorder mediaRecorder, AudioRecordingManager audioRecordingManager, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$recorder = mediaRecorder;
            this.this$0 = audioRecordingManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recorder, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0Var = (s0) this.L$0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (s0) this.L$0;
                ResultKt.m(obj);
            }
            while (t0.k(s0Var)) {
                try {
                    this.this$0._amplitudeLevel.setValue(kotlin.coroutines.jvm.internal.b.e(this.this$0.normalizeAmplitude(this.$recorder.getMaxAmplitude())));
                } catch (Exception unused) {
                    this.this$0._amplitudeLevel.setValue(kotlin.coroutines.jvm.internal.b.e(0.0f));
                }
                this.L$0 = s0Var;
                this.label = 1;
                if (d1.b(60L, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        int i10 = 0 << 0;
    }

    public AudioRecordingManager(@NotNull Context context, @NotNull s0 amplitudeScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        this.context = context;
        this.amplitudeScope = amplitudeScope;
        k0<RecordingState> k0VarA = b1.a(RecordingState.Idle.INSTANCE);
        this._recordingState = k0VarA;
        this.recordingState = k.n(k0VarA);
        k0<Float> k0VarA2 = b1.a(Float.valueOf(0.0f));
        this._amplitudeLevel = k0VarA2;
        this.amplitudeLevel = k.n(k0VarA2);
    }

    private final void cleanup() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception unused) {
            }
            mediaRecorder.release();
        }
        this.mediaRecorder = null;
        File file = this.currentRecordingFile;
        if (file != null) {
            IoUtils.safelyDelete(file);
        }
        this.currentRecordingFile = null;
    }

    private final void configureRecorder(MediaRecorder mediaRecorder, File file) {
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioSamplingRate(44100);
        mediaRecorder.setAudioEncodingBitRate(128000);
        mediaRecorder.setOutputFile(file.getAbsolutePath());
    }

    private final File createAudioFile() throws IOException {
        File externalCacheDir = this.context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.context.getCacheDir();
        }
        if (externalCacheDir == null) {
            throw new IOException("Unable to access cache directories for audio recording");
        }
        File file = new File(externalCacheDir, AUDIO_RECORDINGS_FOLDER);
        file.mkdirs();
        return new File(file, UUID.randomUUID() + AudioConstants.AUDIO_FILE_EXTENSION);
    }

    private final MediaRecorder createMediaRecorder() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        f.a();
        return e.a(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float normalizeAmplitude(int i10) {
        if (i10 <= 0) {
            return 0.0f;
        }
        return (float) Math.max(0.0d, ((((double) 20) * Math.log10(Math.max(((double) i10) / MAX_AMPLITUDE_REFERENCE, 0.001d))) + 60.0d) / 60.0d);
    }

    private final void startAmplitudeMonitoring(MediaRecorder mediaRecorder) {
        this.amplitudeMonitoringJob = kotlinx.coroutines.k.f(this.amplitudeScope, null, null, new AnonymousClass1(mediaRecorder, this, null), 3, null);
    }

    private final void stopAmplitudeMonitoring() {
        p2 p2Var = this.amplitudeMonitoringJob;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.amplitudeMonitoringJob = null;
        this._amplitudeLevel.setValue(Float.valueOf(0.0f));
    }

    private final boolean waitForFileAvailability(File file) throws InterruptedException {
        for (int i10 = 0; i10 < 10; i10++) {
            if (file.exists() && file.length() > 0) {
                return true;
            }
            if (i10 < 9) {
                Thread.sleep(((long) (1 << i10)) * 10);
            }
        }
        return false;
    }

    public final void cancelRecording() {
        stopAmplitudeMonitoring();
        cleanup();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void cleanupCompletedRecording() {
        RecordingState value = this._recordingState.getValue();
        if (value instanceof RecordingState.Completed) {
            IoUtils.safelyDelete(((RecordingState.Completed) value).getFile());
        }
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void dispose() {
        stopAmplitudeMonitoring();
        cleanup();
        cleanupCompletedRecording();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    @NotNull
    public final z0<Float> getAmplitudeLevel() {
        return this.amplitudeLevel;
    }

    @NotNull
    public final z0<RecordingState> getRecordingState() {
        return this.recordingState;
    }

    @NotNull
    public final RecordingResult startRecording() {
        try {
            if (!Intrinsics.areEqual(this._recordingState.getValue(), RecordingState.Idle.INSTANCE)) {
                return new RecordingResult.Error("Recording already in progress");
            }
            File fileCreateAudioFile = createAudioFile();
            this.currentRecordingFile = fileCreateAudioFile;
            MediaRecorder mediaRecorderCreateMediaRecorder = createMediaRecorder();
            this.mediaRecorder = mediaRecorderCreateMediaRecorder;
            configureRecorder(mediaRecorderCreateMediaRecorder, fileCreateAudioFile);
            mediaRecorderCreateMediaRecorder.prepare();
            mediaRecorderCreateMediaRecorder.start();
            startAmplitudeMonitoring(mediaRecorderCreateMediaRecorder);
            this._recordingState.setValue(new RecordingState.Recording(fileCreateAudioFile));
            return RecordingResult.Success.INSTANCE;
        } catch (IOException e10) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Failed to start recording: " + e10.getMessage()));
            return new RecordingResult.Error("Failed to start recording: " + e10.getMessage());
        } catch (Exception e11) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Unexpected error: " + e11.getMessage()));
            return new RecordingResult.Error("Unexpected error: " + e11.getMessage());
        }
    }

    @NotNull
    public final RecordingStopResult stopRecording() {
        try {
            MediaRecorder mediaRecorder = this.mediaRecorder;
            File file = this.currentRecordingFile;
            if (mediaRecorder != null && file != null) {
                stopAmplitudeMonitoring();
                mediaRecorder.stop();
                mediaRecorder.release();
                this.mediaRecorder = null;
                if (!waitForFileAvailability(file)) {
                    cleanup();
                    this._recordingState.setValue(new RecordingState.Error("Recording file is empty or missing"));
                    return new RecordingStopResult.Error("Recording file is empty or missing");
                }
                Context context = this.context;
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file);
                k0<RecordingState> k0Var = this._recordingState;
                Intrinsics.checkNotNull(uriForFile);
                k0Var.setValue(new RecordingState.Completed(uriForFile, file));
                return new RecordingStopResult.Success(uriForFile, file);
            }
            this._recordingState.setValue(new RecordingState.Error("No active recording"));
            return new RecordingStopResult.Error("No active recording");
        } catch (Exception e10) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Failed to stop recording: " + e10.getMessage()));
            return new RecordingStopResult.Error("Failed to stop recording: " + e10.getMessage());
        }
    }
}
