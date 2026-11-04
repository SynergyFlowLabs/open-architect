package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ContentAlignment {

    @w0(parameters = 1)
    public static final class Center implements ContentAlignment {
        public static final int $stable = 0;

        @NotNull
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Center);
        }

        public int hashCode() {
            return 2101579366;
        }

        @NotNull
        public String toString() {
            return "Center";
        }
    }

    @w0(parameters = 1)
    public static final class Start implements ContentAlignment {
        public static final int $stable = 0;

        @NotNull
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Start);
        }

        public int hashCode() {
            return 1052834865;
        }

        @NotNull
        public String toString() {
            return "Start";
        }
    }
}
