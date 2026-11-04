package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class Card {
    public static final int $stable = 8;

    @c(com.facebook.internal.w0.f100156c1)
    @NotNull
    private final Action action;

    @c("card_title")
    @NotNull
    private final String cardTitle;

    @c("space_items")
    @NotNull
    private final List<SpaceItem> spaceItems;

    @c("suggested_articles")
    @NotNull
    private final List<SuggestedArticle> suggestedArticles;

    @c("type")
    @NotNull
    private final String type;

    public Card(@NotNull Action action, @NotNull String cardTitle, @NotNull List<SpaceItem> spaceItems, @NotNull List<SuggestedArticle> suggestedArticles, @NotNull String type) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(spaceItems, "spaceItems");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(type, "type");
        this.action = action;
        this.cardTitle = cardTitle;
        this.spaceItems = spaceItems;
        this.suggestedArticles = suggestedArticles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Card copy$default(Card card, Action action, String str, List list, List list2, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            action = card.action;
        }
        if ((i10 & 2) != 0) {
            str = card.cardTitle;
        }
        if ((i10 & 4) != 0) {
            list = card.spaceItems;
        }
        if ((i10 & 8) != 0) {
            list2 = card.suggestedArticles;
        }
        if ((i10 & 16) != 0) {
            str2 = card.type;
        }
        String str3 = str2;
        List list3 = list;
        return card.copy(action, str, list3, list2, str3);
    }

    @NotNull
    public final Action component1() {
        return this.action;
    }

    @NotNull
    public final String component2() {
        return this.cardTitle;
    }

    @NotNull
    public final List<SpaceItem> component3() {
        return this.spaceItems;
    }

    @NotNull
    public final List<SuggestedArticle> component4() {
        return this.suggestedArticles;
    }

    @NotNull
    public final String component5() {
        return this.type;
    }

    @NotNull
    public final Card copy(@NotNull Action action, @NotNull String cardTitle, @NotNull List<SpaceItem> spaceItems, @NotNull List<SuggestedArticle> suggestedArticles, @NotNull String type) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(spaceItems, "spaceItems");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Card(action, cardTitle, spaceItems, suggestedArticles, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(this.action, card.action) && Intrinsics.areEqual(this.cardTitle, card.cardTitle) && Intrinsics.areEqual(this.spaceItems, card.spaceItems) && Intrinsics.areEqual(this.suggestedArticles, card.suggestedArticles) && Intrinsics.areEqual(this.type, card.type);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @NotNull
    public final List<SpaceItem> getSpaceItems() {
        return this.spaceItems;
    }

    @NotNull
    public final List<SuggestedArticle> getSuggestedArticles() {
        return this.suggestedArticles;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.action.hashCode() * 31) + this.cardTitle.hashCode()) * 31) + this.spaceItems.hashCode()) * 31) + this.suggestedArticles.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Card(action=" + this.action + ", cardTitle=" + this.cardTitle + ", spaceItems=" + this.spaceItems + ", suggestedArticles=" + this.suggestedArticles + ", type=" + this.type + ')';
    }
}
