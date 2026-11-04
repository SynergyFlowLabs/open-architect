package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface TicketsScreenEffects {

    @w0(parameters = 1)
    public static final class RefreshTickets implements TicketsScreenEffects {
        public static final int $stable = 0;

        @NotNull
        public static final RefreshTickets INSTANCE = new RefreshTickets();

        private RefreshTickets() {
        }
    }
}
