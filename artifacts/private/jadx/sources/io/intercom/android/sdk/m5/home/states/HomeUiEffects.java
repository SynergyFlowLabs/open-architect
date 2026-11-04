package io.intercom.android.sdk.m5.home.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class HomeUiEffects {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class NavigateToConversation extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(@NotNull String conversationId) {
            super(null);
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToConversation.conversationId;
            }
            return navigateToConversation.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.conversationId;
        }

        @NotNull
        public final NavigateToConversation copy(@NotNull String conversationId) {
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            return new NavigateToConversation(conversationId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && Intrinsics.areEqual(this.conversationId, ((NavigateToConversation) obj).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return "NavigateToConversation(conversationId=" + this.conversationId + ')';
        }
    }

    @w0(parameters = 1)
    public static final class NavigateToMessages extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateToMessages INSTANCE = new NavigateToMessages();

        private NavigateToMessages() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof NavigateToMessages);
        }

        public int hashCode() {
            return 982177798;
        }

        @NotNull
        public String toString() {
            return "NavigateToMessages";
        }
    }

    @w0(parameters = 1)
    public static final class NavigateToNewConversation extends HomeUiEffects {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateToNewConversation INSTANCE = new NavigateToNewConversation();

        private NavigateToNewConversation() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj && !(obj instanceof NavigateToNewConversation)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 453078601;
        }

        @NotNull
        public String toString() {
            return "NavigateToNewConversation";
        }
    }

    public /* synthetic */ HomeUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeUiEffects() {
    }
}
