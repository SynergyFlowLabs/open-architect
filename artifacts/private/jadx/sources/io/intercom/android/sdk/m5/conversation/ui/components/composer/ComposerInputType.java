package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ComposerInputType {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class Text implements ComposerInputType {
        public static final int $stable = 0;

        @NotNull
        public static final Text INSTANCE = new Text();

        private Text() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Text);
        }

        public int hashCode() {
            return 877964142;
        }

        @NotNull
        public String toString() {
            return "Text";
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class VoiceNotes implements ComposerInputType {
        public static final int $stable = 0;

        @NotNull
        public static final VoiceNotes INSTANCE = new VoiceNotes();

        private VoiceNotes() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof VoiceNotes);
        }

        public int hashCode() {
            return -193831376;
        }

        @NotNull
        public String toString() {
            return "VoiceNotes";
        }
    }
}
