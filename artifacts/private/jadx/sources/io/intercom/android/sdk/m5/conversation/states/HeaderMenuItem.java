package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class HeaderMenuItem {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class Help extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Help(boolean z10, @NotNull StringProvider label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.enabled = z10;
            this.label = label;
        }

        public static /* synthetic */ Help copy$default(Help help, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = help.enabled;
            }
            if ((i10 & 2) != 0) {
                stringProvider = help.label;
            }
            return help.copy(z10, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        @NotNull
        public final StringProvider component2() {
            return this.label;
        }

        @NotNull
        public final Help copy(boolean z10, @NotNull StringProvider label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Help(z10, label);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Help)) {
                return false;
            }
            Help help = (Help) obj;
            return this.enabled == help.enabled && Intrinsics.areEqual(this.label, help.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.enabled) * 31) + this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return "Help(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    @w0(parameters = 0)
    public static final class Messages extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        @NotNull
        private final TotalCountIndicator totalCountIndicator;

        @NotNull
        private final String unreadMessagesCount;

        public /* synthetic */ Messages(TotalCountIndicator totalCountIndicator, String str, boolean z10, StringProvider stringProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(totalCountIndicator, str, (i10 & 4) != 0 ? true : z10, stringProvider);
        }

        public static /* synthetic */ Messages copy$default(Messages messages, TotalCountIndicator totalCountIndicator, String str, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                totalCountIndicator = messages.totalCountIndicator;
            }
            if ((i10 & 2) != 0) {
                str = messages.unreadMessagesCount;
            }
            if ((i10 & 4) != 0) {
                z10 = messages.enabled;
            }
            if ((i10 & 8) != 0) {
                stringProvider = messages.label;
            }
            return messages.copy(totalCountIndicator, str, z10, stringProvider);
        }

        @NotNull
        public final TotalCountIndicator component1() {
            return this.totalCountIndicator;
        }

        @NotNull
        public final String component2() {
            return this.unreadMessagesCount;
        }

        public final boolean component3() {
            return this.enabled;
        }

        @NotNull
        public final StringProvider component4() {
            return this.label;
        }

        @NotNull
        public final Messages copy(@NotNull TotalCountIndicator totalCountIndicator, @NotNull String unreadMessagesCount, boolean z10, @NotNull StringProvider label) {
            Intrinsics.checkNotNullParameter(totalCountIndicator, "totalCountIndicator");
            Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Messages(totalCountIndicator, unreadMessagesCount, z10, label);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) obj;
            return Intrinsics.areEqual(this.totalCountIndicator, messages.totalCountIndicator) && Intrinsics.areEqual(this.unreadMessagesCount, messages.unreadMessagesCount) && this.enabled == messages.enabled && Intrinsics.areEqual(this.label, messages.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        @NotNull
        public final TotalCountIndicator getTotalCountIndicator() {
            return this.totalCountIndicator;
        }

        @NotNull
        public final String getUnreadMessagesCount() {
            return this.unreadMessagesCount;
        }

        public int hashCode() {
            return (((((this.totalCountIndicator.hashCode() * 31) + this.unreadMessagesCount.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return "Messages(totalCountIndicator=" + this.totalCountIndicator + ", unreadMessagesCount=" + this.unreadMessagesCount + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Messages(@NotNull TotalCountIndicator totalCountIndicator, @NotNull String unreadMessagesCount, boolean z10, @NotNull StringProvider label) {
            super(null);
            Intrinsics.checkNotNullParameter(totalCountIndicator, "totalCountIndicator");
            Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
            Intrinsics.checkNotNullParameter(label, "label");
            this.totalCountIndicator = totalCountIndicator;
            this.unreadMessagesCount = unreadMessagesCount;
            this.enabled = z10;
            this.label = label;
        }
    }

    @w0(parameters = 0)
    public static final class StartNewConversation extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartNewConversation(boolean z10, @NotNull StringProvider label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.enabled = z10;
            this.label = label;
        }

        public static /* synthetic */ StartNewConversation copy$default(StartNewConversation startNewConversation, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = startNewConversation.enabled;
            }
            if ((i10 & 2) != 0) {
                stringProvider = startNewConversation.label;
            }
            return startNewConversation.copy(z10, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        @NotNull
        public final StringProvider component2() {
            return this.label;
        }

        @NotNull
        public final StartNewConversation copy(boolean z10, @NotNull StringProvider label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new StartNewConversation(z10, label);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartNewConversation)) {
                return false;
            }
            StartNewConversation startNewConversation = (StartNewConversation) obj;
            return this.enabled == startNewConversation.enabled && Intrinsics.areEqual(this.label, startNewConversation.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.enabled) * 31) + this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return "StartNewConversation(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    @w0(parameters = 0)
    public static final class Tickets extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final boolean hasUnreadTickets;

        @NotNull
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tickets(boolean z10, boolean z11, @NotNull StringProvider label) {
            super(null);
            Intrinsics.checkNotNullParameter(label, "label");
            this.hasUnreadTickets = z10;
            this.enabled = z11;
            this.label = label;
        }

        public static /* synthetic */ Tickets copy$default(Tickets tickets, boolean z10, boolean z11, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = tickets.hasUnreadTickets;
            }
            if ((i10 & 2) != 0) {
                z11 = tickets.enabled;
            }
            if ((i10 & 4) != 0) {
                stringProvider = tickets.label;
            }
            return tickets.copy(z10, z11, stringProvider);
        }

        public final boolean component1() {
            return this.hasUnreadTickets;
        }

        public final boolean component2() {
            return this.enabled;
        }

        @NotNull
        public final StringProvider component3() {
            return this.label;
        }

        @NotNull
        public final Tickets copy(boolean z10, boolean z11, @NotNull StringProvider label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Tickets(z10, z11, label);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) obj;
            return this.hasUnreadTickets == tickets.hasUnreadTickets && this.enabled == tickets.enabled && Intrinsics.areEqual(this.label, tickets.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getHasUnreadTickets() {
            return this.hasUnreadTickets;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        @NotNull
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.hasUnreadTickets) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.label.hashCode();
        }

        @NotNull
        public String toString() {
            return "Tickets(hasUnreadTickets=" + this.hasUnreadTickets + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    public interface TotalCountIndicator {

        @w0(parameters = 1)
        public static final class NoIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            public static final NoIndicator INSTANCE = new NoIndicator();

            private NoIndicator() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof NoIndicator);
            }

            public int hashCode() {
                return -94121592;
            }

            @NotNull
            public String toString() {
                return "NoIndicator";
            }
        }

        @w0(parameters = 1)
        public static final class UnreadCountIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            private final String unreadMessagesCount;

            public UnreadCountIndicator(@NotNull String unreadMessagesCount) {
                Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
                this.unreadMessagesCount = unreadMessagesCount;
            }

            public static /* synthetic */ UnreadCountIndicator copy$default(UnreadCountIndicator unreadCountIndicator, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unreadCountIndicator.unreadMessagesCount;
                }
                return unreadCountIndicator.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.unreadMessagesCount;
            }

            @NotNull
            public final UnreadCountIndicator copy(@NotNull String unreadMessagesCount) {
                Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
                return new UnreadCountIndicator(unreadMessagesCount);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof UnreadCountIndicator) && Intrinsics.areEqual(this.unreadMessagesCount, ((UnreadCountIndicator) obj).unreadMessagesCount)) {
                    return true;
                }
                return false;
            }

            @NotNull
            public final String getUnreadMessagesCount() {
                return this.unreadMessagesCount;
            }

            public int hashCode() {
                return this.unreadMessagesCount.hashCode();
            }

            @NotNull
            public String toString() {
                return "UnreadCountIndicator(unreadMessagesCount=" + this.unreadMessagesCount + ')';
            }
        }

        @w0(parameters = 1)
        public static final class UnreadDotIndicator implements TotalCountIndicator {
            public static final int $stable = 0;

            @NotNull
            public static final UnreadDotIndicator INSTANCE = new UnreadDotIndicator();

            private UnreadDotIndicator() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof UnreadDotIndicator);
            }

            public int hashCode() {
                return -715258213;
            }

            @NotNull
            public String toString() {
                return "UnreadDotIndicator";
            }
        }
    }

    public /* synthetic */ HeaderMenuItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getEnabled();

    @NotNull
    public abstract StringProvider getLabel();

    private HeaderMenuItem() {
    }
}
