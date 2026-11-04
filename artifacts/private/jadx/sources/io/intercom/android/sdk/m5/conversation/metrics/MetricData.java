package io.intercom.android.sdk.m5.conversation.metrics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class MetricData {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class ComposerInputClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        private final String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerInputClicked(@NotNull String input) {
            super(null);
            Intrinsics.checkNotNullParameter(input, "input");
            int i10 = 2 | 0;
            this.input = input;
        }

        public static /* synthetic */ ComposerInputClicked copy$default(ComposerInputClicked composerInputClicked, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = composerInputClicked.input;
            }
            return composerInputClicked.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.input;
        }

        @NotNull
        public final ComposerInputClicked copy(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new ComposerInputClicked(input);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerInputClicked) && Intrinsics.areEqual(this.input, ((ComposerInputClicked) obj).input);
        }

        @NotNull
        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        @NotNull
        public String toString() {
            return "ComposerInputClicked(input=" + this.input + ')';
        }
    }

    @w0(parameters = 1)
    public static final class ConversationsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public ConversationsInMoreMenuClicked(boolean z10) {
            super(null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ ConversationsInMoreMenuClicked copy$default(ConversationsInMoreMenuClicked conversationsInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = conversationsInMoreMenuClicked.isMoreMenuContext;
            }
            return conversationsInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final ConversationsInMoreMenuClicked copy(boolean z10) {
            return new ConversationsInMoreMenuClicked(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConversationsInMoreMenuClicked) && this.isMoreMenuContext == ((ConversationsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return "ConversationsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    @w0(parameters = 1)
    public static final class HelpInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final HelpInMoreMenuClicked INSTANCE = new HelpInMoreMenuClicked();

        private HelpInMoreMenuClicked() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class MoreMenuClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final MoreMenuClicked INSTANCE = new MoreMenuClicked();

        private MoreMenuClicked() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class NewConversationInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public NewConversationInMoreMenuClicked(boolean z10) {
            super(null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ NewConversationInMoreMenuClicked copy$default(NewConversationInMoreMenuClicked newConversationInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = newConversationInMoreMenuClicked.isMoreMenuContext;
            }
            return newConversationInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final NewConversationInMoreMenuClicked copy(boolean z10) {
            return new NewConversationInMoreMenuClicked(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversationInMoreMenuClicked) && this.isMoreMenuContext == ((NewConversationInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return "NewConversationInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    @w0(parameters = 1)
    public static final class PoweredByClicked extends MetricData {
        public static final int $stable = 0;

        @NotNull
        public static final PoweredByClicked INSTANCE = new PoweredByClicked();

        private PoweredByClicked() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class TicketsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public TicketsInMoreMenuClicked(boolean z10) {
            super(null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ TicketsInMoreMenuClicked copy$default(TicketsInMoreMenuClicked ticketsInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = ticketsInMoreMenuClicked.isMoreMenuContext;
            }
            return ticketsInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public final TicketsInMoreMenuClicked copy(boolean z10) {
            return new TicketsInMoreMenuClicked(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketsInMoreMenuClicked) && this.isMoreMenuContext == ((TicketsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        @NotNull
        public String toString() {
            return "TicketsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    public /* synthetic */ MetricData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MetricData() {
    }
}
