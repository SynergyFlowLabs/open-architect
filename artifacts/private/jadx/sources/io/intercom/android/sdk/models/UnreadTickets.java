package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class UnreadTickets {

    @c("total_count")
    private final int totalCount;

    @c("unread_ticket_ids")
    @NotNull
    private final List<String> unreadTicketIds;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final UnreadTickets NULL = new UnreadTickets(0, CollectionsKt.emptyList());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UnreadTickets getNULL() {
            return UnreadTickets.NULL;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 7 | 0;
    }

    public UnreadTickets(int i10, @NotNull List<String> unreadTicketIds) {
        Intrinsics.checkNotNullParameter(unreadTicketIds, "unreadTicketIds");
        this.totalCount = i10;
        this.unreadTicketIds = unreadTicketIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadTickets copy$default(UnreadTickets unreadTickets, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = unreadTickets.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = unreadTickets.unreadTicketIds;
        }
        return unreadTickets.copy(i10, list);
    }

    public final int component1() {
        return this.totalCount;
    }

    @NotNull
    public final List<String> component2() {
        return this.unreadTicketIds;
    }

    @NotNull
    public final UnreadTickets copy(int i10, @NotNull List<String> unreadTicketIds) {
        Intrinsics.checkNotNullParameter(unreadTicketIds, "unreadTicketIds");
        return new UnreadTickets(i10, unreadTicketIds);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnreadTickets)) {
            return false;
        }
        UnreadTickets unreadTickets = (UnreadTickets) obj;
        return this.totalCount == unreadTickets.totalCount && Intrinsics.areEqual(this.unreadTicketIds, unreadTickets.unreadTicketIds);
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final List<String> getUnreadTicketIds() {
        return this.unreadTicketIds;
    }

    public int hashCode() {
        return (Integer.hashCode(this.totalCount) * 31) + this.unreadTicketIds.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnreadTickets(totalCount=" + this.totalCount + ", unreadTicketIds=" + this.unreadTicketIds + ')';
    }
}
