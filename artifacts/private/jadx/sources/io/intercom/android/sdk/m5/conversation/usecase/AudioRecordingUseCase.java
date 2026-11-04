package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AudioRecordingUseCase {
    public static final int $stable = 8;

    @NotNull
    private final AudioRecordingManager audioRecordingManager;

    @NotNull
    private final Twig twig;

    public AudioRecordingUseCase(@NotNull AudioRecordingManager audioRecordingManager, @NotNull Twig twig) {
        Intrinsics.checkNotNullParameter(audioRecordingManager, "audioRecordingManager");
        Intrinsics.checkNotNullParameter(twig, "twig");
        this.audioRecordingManager = audioRecordingManager;
        this.twig = twig;
    }

    public final void cancelRecording() {
        this.audioRecordingManager.cancelRecording();
    }

    public final void cleanupCompletedRecording() {
        this.audioRecordingManager.cleanupCompletedRecording();
    }

    @NotNull
    /* JADX INFO: renamed from: startRecording-d1pmJ48, reason: not valid java name */
    public final Object m326startRecordingd1pmJ48() {
        try {
            if (!Intrinsics.areEqual(this.audioRecordingManager.getRecordingState().getValue(), AudioRecordingManager.RecordingState.Idle.INSTANCE)) {
                this.audioRecordingManager.cancelRecording();
            }
            AudioRecordingManager.RecordingResult recordingResultStartRecording = this.audioRecordingManager.startRecording();
            if (recordingResultStartRecording instanceof AudioRecordingManager.RecordingResult.Success) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(Unit.f312394a);
            }
            if (!(recordingResultStartRecording instanceof AudioRecordingManager.RecordingResult.Error)) {
                throw new k0();
            }
            this.twig.e("Failed to start recording: " + ((AudioRecordingManager.RecordingResult.Error) recordingResultStartRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(new RecordingException(((AudioRecordingManager.RecordingResult.Error) recordingResultStartRecording).getMessage(), null, 2, null)));
        } catch (Exception e10) {
            this.twig.e(e10, "Failed to start recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(e10));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: stopRecording-d1pmJ48, reason: not valid java name */
    public final Object m327stopRecordingd1pmJ48() {
        try {
            AudioRecordingManager.RecordingStopResult recordingStopResultStopRecording = this.audioRecordingManager.stopRecording();
            if (recordingStopResultStopRecording instanceof AudioRecordingManager.RecordingStopResult.Success) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(new RecordedAudioFile(((AudioRecordingManager.RecordingStopResult.Success) recordingStopResultStopRecording).getFile(), ((AudioRecordingManager.RecordingStopResult.Success) recordingStopResultStopRecording).getUri()));
            }
            if (!(recordingStopResultStopRecording instanceof AudioRecordingManager.RecordingStopResult.Error)) {
                throw new k0();
            }
            this.twig.e("Failed to stop recording: " + ((AudioRecordingManager.RecordingStopResult.Error) recordingStopResultStopRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(new RecordingException(((AudioRecordingManager.RecordingStopResult.Error) recordingStopResultStopRecording).getMessage(), null, 2, null)));
        } catch (Exception e10) {
            this.twig.e(e10, "Failed to stop recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(e10));
        }
    }

    public /* synthetic */ AudioRecordingUseCase(AudioRecordingManager audioRecordingManager, Twig twig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioRecordingManager, (i10 & 2) != 0 ? LumberMill.getLogger() : twig);
    }
}
