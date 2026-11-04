package io.intercom.android.sdk.tickets;

import androidx.compose.ui.graphics.s0;
import io.intercom.android.sdk.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum TicketStatus {
    Submitted(s0.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    InProgress(s0.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    WaitingOnCustomer(s0.d(4291644690L), R.drawable.intercom_ticket_waiting_icon),
    Resolved(s0.d(4279072050L), R.drawable.intercom_ticket_resolved_icon);

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());
    private final long color;
    private final int iconRes;

    TicketStatus(long j10, int i10) {
        this.color = j10;
        this.iconRes = i10;
    }

    @NotNull
    public static kotlin.enums.a<TicketStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m543getColor0d7_KjU() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}
