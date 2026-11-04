package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ComposerUiEffect {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class ReportAiAnswer extends ComposerUiEffect {
        public static final int $stable = 0;

        @NotNull
        public static final ReportAiAnswer INSTANCE = new ReportAiAnswer();

        private ReportAiAnswer() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class UpdateTranscribedText extends ComposerUiEffect {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateTranscribedText(@NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ UpdateTranscribedText copy$default(UpdateTranscribedText updateTranscribedText, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = updateTranscribedText.text;
            }
            return updateTranscribedText.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.text;
        }

        @NotNull
        public final UpdateTranscribedText copy(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new UpdateTranscribedText(text);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTranscribedText) && Intrinsics.areEqual(this.text, ((UpdateTranscribedText) obj).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateTranscribedText(text=" + this.text + ')';
        }
    }

    public /* synthetic */ ComposerUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComposerUiEffect() {
    }
}
