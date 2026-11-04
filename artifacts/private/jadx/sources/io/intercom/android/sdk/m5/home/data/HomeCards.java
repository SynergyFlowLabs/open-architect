package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public class HomeCards {
    public static final int $stable = 0;

    @c("card_title")
    @NotNull
    private final String cardTitle;

    @c("type")
    @NotNull
    private final HomeCardType type;

    @w0(parameters = 0)
    public static final class HomeExternalLinkData extends HomeCards {
        public static final int $stable = 8;

        @c("links")
        @NotNull
        private final List<Link> links;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeExternalLinkData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<Link> links) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(links, "links");
            this.links = links;
        }

        @NotNull
        public final List<Link> getLinks() {
            return this.links;
        }
    }

    @w0(parameters = 0)
    public static final class HomeHelpCenterData extends HomeCards {
        public static final int $stable = 8;

        @c("suggested_articles")
        @NotNull
        private final List<SuggestedArticle> suggestedArticles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeHelpCenterData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<SuggestedArticle> suggestedArticles) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
            this.suggestedArticles = suggestedArticles;
        }

        @NotNull
        public final List<SuggestedArticle> getSuggestedArticles() {
            return this.suggestedArticles;
        }
    }

    @w0(parameters = 1)
    public static final class HomeMessengerAppData extends HomeCards {
        public static final int $stable = 0;

        @c("fallback_url")
        @NotNull
        private final String fallbackUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeMessengerAppData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull String fallbackUrl) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(fallbackUrl, "fallbackUrl");
            this.fallbackUrl = fallbackUrl;
        }

        @NotNull
        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }
    }

    @w0(parameters = 0)
    public static final class HomeNewConversationData extends HomeCards {
        public static final int $stable = 8;

        @c(com.facebook.internal.w0.f100156c1)
        @NotNull
        private final Action action;

        @Nullable
        private final OpenMessengerResponse.NewConversationData.HomeCard homeCard;

        @c("open_inbound_conversation_ids")
        @NotNull
        private final List<String> openInboundConversationsIds;

        @c("prevent_multiple_inbound_conversations_enabled")
        private final boolean preventMultipleInboundConversationsEnabled;

        @c("show_fin_avatar")
        private final boolean showFinAvatar;

        @c("show_teammate_expectations")
        private final boolean showTeammateExpectations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeNewConversationData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull Action action, boolean z10, @NotNull List<String> openInboundConversationsIds, boolean z11, boolean z12, @Nullable OpenMessengerResponse.NewConversationData.HomeCard homeCard) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(openInboundConversationsIds, "openInboundConversationsIds");
            this.action = action;
            this.preventMultipleInboundConversationsEnabled = z10;
            this.openInboundConversationsIds = openInboundConversationsIds;
            this.showFinAvatar = z11;
            this.showTeammateExpectations = z12;
            this.homeCard = homeCard;
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.HomeCard getHomeCard() {
            return this.homeCard;
        }

        @NotNull
        public final List<String> getOpenInboundConversationsIds() {
            return this.openInboundConversationsIds;
        }

        public final boolean getPreventMultipleInboundConversationsEnabled() {
            return this.preventMultipleInboundConversationsEnabled;
        }

        public final boolean getShowFinAvatar() {
            return this.showFinAvatar;
        }

        public final boolean getShowTeammateExpectations() {
            return this.showTeammateExpectations;
        }
    }

    @w0(parameters = 0)
    public static final class HomeRecentConversationData extends HomeCards {
        public static final int $stable = 8;

        @c("conversations")
        @NotNull
        private final List<Conversation> conversations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentConversationData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<Conversation> conversations) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(conversations, "conversations");
            this.conversations = conversations;
        }

        @NotNull
        public final List<Conversation> getConversations() {
            return this.conversations;
        }
    }

    @w0(parameters = 0)
    public static final class HomeRecentTicketsData extends HomeCards {
        public static final int $stable = 8;

        @c("tickets")
        @NotNull
        private final List<Ticket> tickets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentTicketsData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<Ticket> tickets) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(tickets, "tickets");
            this.tickets = tickets;
        }

        @NotNull
        public final List<Ticket> getTickets() {
            return this.tickets;
        }
    }

    @w0(parameters = 0)
    public static final class HomeSpacesData extends HomeCards {
        public static final int $stable = 8;

        @c("space_items")
        @NotNull
        private final List<SpaceItem> spaceItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeSpacesData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<SpaceItem> spaceItems) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(spaceItems, "spaceItems");
            this.spaceItems = spaceItems;
        }

        @NotNull
        public final List<SpaceItem> getSpaceItems() {
            return this.spaceItems;
        }
    }

    @w0(parameters = 1)
    public static final class UnSupported extends HomeCards {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnSupported(@NotNull String cardTitle, @NotNull HomeCardType type) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    public HomeCards(@NotNull String cardTitle, @NotNull HomeCardType type) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        this.cardTitle = cardTitle;
        this.type = type;
    }

    @NotNull
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @NotNull
    public final HomeCardType getType() {
        return this.type;
    }

    @w0(parameters = 0)
    public static final class HomeTicketLinksData extends HomeCards {
        public static final int $stable = 8;

        @c("links")
        @NotNull
        private final List<TicketLink> links;

        public /* synthetic */ HomeTicketLinksData(String str, HomeCardType homeCardType, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, homeCardType, list);
        }

        @NotNull
        public final List<TicketLink> getLinks() {
            return this.links;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTicketLinksData(@NotNull String cardTitle, @NotNull HomeCardType type, @NotNull List<TicketLink> links) {
            super(cardTitle, type);
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(links, "links");
            this.links = links;
        }
    }
}
