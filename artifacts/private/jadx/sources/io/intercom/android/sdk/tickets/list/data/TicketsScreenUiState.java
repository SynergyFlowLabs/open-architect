package io.intercom.android.sdk.tickets.list.data;

import androidx.compose.runtime.internal.w0;
import androidx.paging.compose.b;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class TicketsScreenUiState {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class Content extends TicketsScreenUiState {
        public static final int $stable = b.f71648f;

        @Nullable
        private final ErrorState errorState;
        private final boolean isLoadingMore;

        @NotNull
        private final b<TicketRowData> lazyPagingTickets;

        @NotNull
        private final String screenLabel;

        public /* synthetic */ Content(b bVar, boolean z10, ErrorState errorState, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : errorState, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, b bVar, boolean z10, ErrorState errorState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = content.lazyPagingTickets;
            }
            if ((i10 & 2) != 0) {
                z10 = content.isLoadingMore;
            }
            if ((i10 & 4) != 0) {
                errorState = content.errorState;
            }
            if ((i10 & 8) != 0) {
                str = content.screenLabel;
            }
            return content.copy(bVar, z10, errorState, str);
        }

        @NotNull
        public final b<TicketRowData> component1() {
            return this.lazyPagingTickets;
        }

        public final boolean component2() {
            return this.isLoadingMore;
        }

        @Nullable
        public final ErrorState component3() {
            return this.errorState;
        }

        @NotNull
        public final String component4() {
            return this.screenLabel;
        }

        @NotNull
        public final Content copy(@NotNull b<TicketRowData> lazyPagingTickets, boolean z10, @Nullable ErrorState errorState, @NotNull String screenLabel) {
            Intrinsics.checkNotNullParameter(lazyPagingTickets, "lazyPagingTickets");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Content(lazyPagingTickets, z10, errorState, screenLabel);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.lazyPagingTickets, content.lazyPagingTickets) && this.isLoadingMore == content.isLoadingMore && Intrinsics.areEqual(this.errorState, content.errorState) && Intrinsics.areEqual(this.screenLabel, content.screenLabel);
        }

        @Nullable
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final b<TicketRowData> getLazyPagingTickets() {
            return this.lazyPagingTickets;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        @NotNull
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            int iHashCode = ((this.lazyPagingTickets.hashCode() * 31) + Boolean.hashCode(this.isLoadingMore)) * 31;
            ErrorState errorState = this.errorState;
            return ((iHashCode + (errorState == null ? 0 : errorState.hashCode())) * 31) + this.screenLabel.hashCode();
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        @NotNull
        public String toString() {
            return "Content(lazyPagingTickets=" + this.lazyPagingTickets + ", isLoadingMore=" + this.isLoadingMore + ", errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull b<TicketRowData> lazyPagingTickets, boolean z10, @Nullable ErrorState errorState, @NotNull String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(lazyPagingTickets, "lazyPagingTickets");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.lazyPagingTickets = lazyPagingTickets;
            this.isLoadingMore = z10;
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }
    }

    @w0(parameters = 1)
    public static final class Empty extends TicketsScreenUiState {
        public static final int $stable = 0;

        @NotNull
        private final EmptyState emptyState;

        @NotNull
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(@NotNull EmptyState emptyState, @NotNull String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.emptyState = emptyState;
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, EmptyState emptyState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emptyState = empty.emptyState;
            }
            if ((i10 & 2) != 0) {
                str = empty.screenLabel;
            }
            return empty.copy(emptyState, str);
        }

        @NotNull
        public final EmptyState component1() {
            return this.emptyState;
        }

        @NotNull
        public final String component2() {
            return this.screenLabel;
        }

        @NotNull
        public final Empty copy(@NotNull EmptyState emptyState, @NotNull String screenLabel) {
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Empty(emptyState, screenLabel);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.areEqual(this.emptyState, empty.emptyState) && Intrinsics.areEqual(this.screenLabel, empty.screenLabel);
        }

        @NotNull
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        @NotNull
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return (this.emptyState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Empty(emptyState=" + this.emptyState + ", screenLabel=" + this.screenLabel + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Error extends TicketsScreenUiState {
        public static final int $stable = 0;

        @NotNull
        private final ErrorState errorState;

        @NotNull
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ErrorState errorState, @NotNull String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            if ((i10 & 2) != 0) {
                str = error.screenLabel;
            }
            return error.copy(errorState, str);
        }

        @NotNull
        public final ErrorState component1() {
            return this.errorState;
        }

        @NotNull
        public final String component2() {
            return this.screenLabel;
        }

        @NotNull
        public final Error copy(@NotNull ErrorState errorState, @NotNull String screenLabel) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Error(errorState, screenLabel);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.errorState, error.errorState) && Intrinsics.areEqual(this.screenLabel, error.screenLabel);
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        @NotNull
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return (this.errorState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends TicketsScreenUiState {
        public static final int $stable = 0;

        @NotNull
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(@NotNull String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Initial copy$default(Initial initial, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initial.screenLabel;
            }
            return initial.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.screenLabel;
        }

        @NotNull
        public final Initial copy(@NotNull String screenLabel) {
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Initial(screenLabel);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && Intrinsics.areEqual(this.screenLabel, ((Initial) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        @NotNull
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Initial(screenLabel=" + this.screenLabel + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends TicketsScreenUiState {
        public static final int $stable = 0;

        @NotNull
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loading.screenLabel;
            }
            return loading.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.screenLabel;
        }

        @NotNull
        public final Loading copy(@NotNull String screenLabel) {
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Loading(screenLabel);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.screenLabel, ((Loading) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        @NotNull
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(screenLabel=" + this.screenLabel + ')';
        }
    }

    public /* synthetic */ TicketsScreenUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getScreenLabel();

    private TicketsScreenUiState() {
    }
}
