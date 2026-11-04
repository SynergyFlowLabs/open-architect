package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface NetworkState {

    @w0(parameters = 1)
    public static final class Connected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Connected INSTANCE = new Connected();

        private Connected() {
        }
    }

    @w0(parameters = 1)
    public static final class Disconnected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
        }
    }

    @w0(parameters = 1)
    public static final class Reconnected implements NetworkState {
        public static final int $stable = 0;

        @NotNull
        public static final Reconnected INSTANCE = new Reconnected();

        private Reconnected() {
        }
    }
}
