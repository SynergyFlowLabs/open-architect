package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class TicketProgressRowState {
    public static final int $stable = 0;

    @NotNull
    private final String name;

    @NotNull
    private final String status;

    public TicketProgressRowState(@NotNull String name, @NotNull String status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        this.name = name;
        this.status = status;
    }

    public static /* synthetic */ TicketProgressRowState copy$default(TicketProgressRowState ticketProgressRowState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketProgressRowState.name;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketProgressRowState.status;
        }
        return ticketProgressRowState.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final TicketProgressRowState copy(@NotNull String name, @NotNull String status) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TicketProgressRowState(name, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketProgressRowState)) {
            return false;
        }
        TicketProgressRowState ticketProgressRowState = (TicketProgressRowState) obj;
        return Intrinsics.areEqual(this.name, ticketProgressRowState.name) && Intrinsics.areEqual(this.status, ticketProgressRowState.status);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketProgressRowState(name=" + this.name + ", status=" + this.status + ')';
    }
}
