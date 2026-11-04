package io.intercom.android.sdk.m5.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TicketStatusHeaderArgs {
    public static final int $stable = 0;

    @NotNull
    private final androidx.compose.ui.text.font.v0 fontWeight;

    @NotNull
    private final String title;

    public TicketStatusHeaderArgs(@NotNull String title, @NotNull androidx.compose.ui.text.font.v0 fontWeight) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.title = title;
        this.fontWeight = fontWeight;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, androidx.compose.ui.text.font.v0 v0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i10 & 2) != 0) {
            v0Var = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, v0Var);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final androidx.compose.ui.text.font.v0 component2() {
        return this.fontWeight;
    }

    @NotNull
    public final TicketStatusHeaderArgs copy(@NotNull String title, @NotNull androidx.compose.ui.text.font.v0 fontWeight) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new TicketStatusHeaderArgs(title, fontWeight);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) obj;
        if (Intrinsics.areEqual(this.title, ticketStatusHeaderArgs.title) && Intrinsics.areEqual(this.fontWeight, ticketStatusHeaderArgs.fontWeight)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final androidx.compose.ui.text.font.v0 getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    public /* synthetic */ TicketStatusHeaderArgs(String str, androidx.compose.ui.text.font.v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? androidx.compose.ui.text.font.v0.f41742b.m() : v0Var);
    }
}
