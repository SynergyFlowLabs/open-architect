package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class TicketDetailState {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class Error extends TicketDetailState {
        public static final int $stable = 0;

        @NotNull
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ErrorState errorState) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        @NotNull
        public final ErrorState component1() {
            return this.errorState;
        }

        @NotNull
        public final Error copy(@NotNull ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) obj).errorState);
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends TicketDetailState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends TicketDetailState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @w0(parameters = 0)
    public static final class TicketDetailContentState extends TicketDetailState {
        public static final int $stable = 8;

        @NotNull
        private final ConversationButtonState conversationButtonState;

        @Nullable
        private final String conversationId;

        @NotNull
        private final List<Ticket.TicketAttribute> ticketAttributes;

        @NotNull
        private final String ticketName;

        @NotNull
        private final TicketTimelineCardState ticketTimelineCardState;

        @NotNull
        private final String userEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TicketDetailContentState(@NotNull String ticketName, @NotNull TicketTimelineCardState ticketTimelineCardState, @NotNull List<? extends Ticket.TicketAttribute> ticketAttributes, @NotNull String userEmail, @Nullable String str, @NotNull ConversationButtonState conversationButtonState) {
            super(null);
            Intrinsics.checkNotNullParameter(ticketName, "ticketName");
            Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
            Intrinsics.checkNotNullParameter(ticketAttributes, "ticketAttributes");
            Intrinsics.checkNotNullParameter(userEmail, "userEmail");
            Intrinsics.checkNotNullParameter(conversationButtonState, "conversationButtonState");
            this.ticketName = ticketName;
            this.ticketTimelineCardState = ticketTimelineCardState;
            this.ticketAttributes = ticketAttributes;
            this.userEmail = userEmail;
            this.conversationId = str;
            this.conversationButtonState = conversationButtonState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TicketDetailContentState copy$default(TicketDetailContentState ticketDetailContentState, String str, TicketTimelineCardState ticketTimelineCardState, List list, String str2, String str3, ConversationButtonState conversationButtonState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketDetailContentState.ticketName;
            }
            if ((i10 & 2) != 0) {
                ticketTimelineCardState = ticketDetailContentState.ticketTimelineCardState;
            }
            if ((i10 & 4) != 0) {
                list = ticketDetailContentState.ticketAttributes;
            }
            if ((i10 & 8) != 0) {
                str2 = ticketDetailContentState.userEmail;
            }
            if ((i10 & 16) != 0) {
                str3 = ticketDetailContentState.conversationId;
            }
            if ((i10 & 32) != 0) {
                conversationButtonState = ticketDetailContentState.conversationButtonState;
            }
            String str4 = str3;
            ConversationButtonState conversationButtonState2 = conversationButtonState;
            return ticketDetailContentState.copy(str, ticketTimelineCardState, list, str2, str4, conversationButtonState2);
        }

        @NotNull
        public final String component1() {
            return this.ticketName;
        }

        @NotNull
        public final TicketTimelineCardState component2() {
            return this.ticketTimelineCardState;
        }

        @NotNull
        public final List<Ticket.TicketAttribute> component3() {
            return this.ticketAttributes;
        }

        @NotNull
        public final String component4() {
            return this.userEmail;
        }

        @Nullable
        public final String component5() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationButtonState component6() {
            return this.conversationButtonState;
        }

        @NotNull
        public final TicketDetailContentState copy(@NotNull String ticketName, @NotNull TicketTimelineCardState ticketTimelineCardState, @NotNull List<? extends Ticket.TicketAttribute> ticketAttributes, @NotNull String userEmail, @Nullable String str, @NotNull ConversationButtonState conversationButtonState) {
            Intrinsics.checkNotNullParameter(ticketName, "ticketName");
            Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
            Intrinsics.checkNotNullParameter(ticketAttributes, "ticketAttributes");
            Intrinsics.checkNotNullParameter(userEmail, "userEmail");
            Intrinsics.checkNotNullParameter(conversationButtonState, "conversationButtonState");
            return new TicketDetailContentState(ticketName, ticketTimelineCardState, ticketAttributes, userEmail, str, conversationButtonState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailContentState)) {
                return false;
            }
            TicketDetailContentState ticketDetailContentState = (TicketDetailContentState) obj;
            return Intrinsics.areEqual(this.ticketName, ticketDetailContentState.ticketName) && Intrinsics.areEqual(this.ticketTimelineCardState, ticketDetailContentState.ticketTimelineCardState) && Intrinsics.areEqual(this.ticketAttributes, ticketDetailContentState.ticketAttributes) && Intrinsics.areEqual(this.userEmail, ticketDetailContentState.userEmail) && Intrinsics.areEqual(this.conversationId, ticketDetailContentState.conversationId) && Intrinsics.areEqual(this.conversationButtonState, ticketDetailContentState.conversationButtonState);
        }

        @NotNull
        public final ConversationButtonState getConversationButtonState() {
            return this.conversationButtonState;
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final List<Ticket.TicketAttribute> getTicketAttributes() {
            return this.ticketAttributes;
        }

        @NotNull
        public final String getTicketName() {
            return this.ticketName;
        }

        @NotNull
        public final TicketTimelineCardState getTicketTimelineCardState() {
            return this.ticketTimelineCardState;
        }

        @NotNull
        public final String getUserEmail() {
            return this.userEmail;
        }

        public int hashCode() {
            int iHashCode = ((((((this.ticketName.hashCode() * 31) + this.ticketTimelineCardState.hashCode()) * 31) + this.ticketAttributes.hashCode()) * 31) + this.userEmail.hashCode()) * 31;
            String str = this.conversationId;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.conversationButtonState.hashCode();
        }

        @NotNull
        public String toString() {
            return "TicketDetailContentState(ticketName=" + this.ticketName + ", ticketTimelineCardState=" + this.ticketTimelineCardState + ", ticketAttributes=" + this.ticketAttributes + ", userEmail=" + this.userEmail + ", conversationId=" + this.conversationId + ", conversationButtonState=" + this.conversationButtonState + ')';
        }
    }

    public /* synthetic */ TicketDetailState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TicketDetailState() {
    }
}
