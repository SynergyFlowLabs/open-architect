package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import com.facebook.internal.a;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface VoiceTranscriptionState {

    @w0(parameters = 1)
    public static final class Completed implements VoiceTranscriptionState {
        public static final int $stable = 0;

        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Completed);
        }

        public int hashCode() {
            return -291535589;
        }

        @NotNull
        public String toString() {
            return a.f99695s;
        }
    }

    @w0(parameters = 0)
    public static final class Error implements VoiceTranscriptionState {
        public static final int $stable = 8;

        @NotNull
        private final VoiceTranscriptionError error;

        public Error(@NotNull VoiceTranscriptionError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, VoiceTranscriptionError voiceTranscriptionError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                voiceTranscriptionError = error.error;
            }
            return error.copy(voiceTranscriptionError);
        }

        @NotNull
        public final VoiceTranscriptionError component1() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull VoiceTranscriptionError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        @NotNull
        public final VoiceTranscriptionError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Idle implements VoiceTranscriptionState {
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
            return 1546170116;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    @w0(parameters = 1)
    public static final class Processing implements VoiceTranscriptionState {
        public static final int $stable = 0;

        @NotNull
        public static final Processing INSTANCE = new Processing();

        private Processing() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Processing);
        }

        public int hashCode() {
            return 515734083;
        }

        @NotNull
        public String toString() {
            return "Processing";
        }
    }

    @w0(parameters = 1)
    public static final class Recording implements VoiceTranscriptionState {
        public static final int $stable = 0;

        @NotNull
        public static final Recording INSTANCE = new Recording();

        private Recording() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Recording);
        }

        public int hashCode() {
            return 2104954049;
        }

        @NotNull
        public String toString() {
            return "Recording";
        }
    }
}
