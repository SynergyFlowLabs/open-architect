package io.intercom.android.sdk.m5.inbox.states;

import androidx.compose.runtime.internal.w0;
import androidx.paging.compose.b;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public class InboxUiState {
    public static final int $stable = IntercomTopBarState.$stable;

    @NotNull
    private final IntercomTopBarState intercomTopBarState;

    @w0(parameters = 0)
    public static final class Content extends InboxUiState {
        public static final int $stable = b.f71648f;

        @Nullable
        private final ErrorState errorState;

        @NotNull
        private final b<Conversation> inboxConversations;
        private final boolean isLoadingMore;
        private final boolean showSendMessageFab;

        public /* synthetic */ Content(IntercomTopBarState intercomTopBarState, b bVar, boolean z10, boolean z11, ErrorState errorState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(intercomTopBarState, bVar, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : errorState);
        }

        @Nullable
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final b<Conversation> getInboxConversations() {
            return this.inboxConversations;
        }

        public final boolean getShowSendMessageFab() {
            return this.showSendMessageFab;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull IntercomTopBarState intercomTopBarState, @NotNull b<Conversation> inboxConversations, boolean z10, boolean z11, @Nullable ErrorState errorState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(inboxConversations, "inboxConversations");
            this.inboxConversations = inboxConversations;
            this.showSendMessageFab = z10;
            this.isLoadingMore = z11;
            this.errorState = errorState;
        }
    }

    @w0(parameters = 1)
    public static final class Empty extends InboxUiState {
        public static final int $stable = 0;

        @NotNull
        private final EmptyState emptyState;
        private final boolean showActionButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(@NotNull IntercomTopBarState intercomTopBarState, @NotNull EmptyState emptyState, boolean z10) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            this.emptyState = emptyState;
            this.showActionButton = z10;
        }

        @NotNull
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }
    }

    @w0(parameters = 1)
    public static final class Error extends InboxUiState {
        public static final int $stable = 0;

        @NotNull
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull IntercomTopBarState intercomTopBarState, @NotNull ErrorState errorState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(@NotNull IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        }
    }

    public InboxUiState(@NotNull IntercomTopBarState intercomTopBarState) {
        Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        this.intercomTopBarState = intercomTopBarState;
    }

    @NotNull
    public final IntercomTopBarState getIntercomTopBarState() {
        return this.intercomTopBarState;
    }
}
