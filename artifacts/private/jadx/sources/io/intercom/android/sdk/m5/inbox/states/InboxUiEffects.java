package io.intercom.android.sdk.m5.inbox.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.Conversation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class InboxUiEffects {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class NavigateToConversation extends InboxUiEffects {
        public static final int $stable = 8;

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(@NotNull Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.conversation = conversation;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, Conversation conversation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversation = navigateToConversation.conversation;
            }
            return navigateToConversation.copy(conversation);
        }

        @NotNull
        public final Conversation component1() {
            return this.conversation;
        }

        @NotNull
        public final NavigateToConversation copy(@NotNull Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new NavigateToConversation(conversation);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && Intrinsics.areEqual(this.conversation, ((NavigateToConversation) obj).conversation);
        }

        @NotNull
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        @NotNull
        public String toString() {
            return "NavigateToConversation(conversation=" + this.conversation + ')';
        }
    }

    @w0(parameters = 1)
    public static final class RefreshInbox extends InboxUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final RefreshInbox INSTANCE = new RefreshInbox();

        private RefreshInbox() {
            super(null);
        }
    }

    public /* synthetic */ InboxUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InboxUiEffects() {
    }
}
