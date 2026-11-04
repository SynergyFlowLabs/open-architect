package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HomeV2Response {
    public static final int $stable = 8;

    @c("cards")
    @NotNull
    private final List<HomeCards> cards;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeV2Response(@NotNull List<? extends HomeCards> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.cards = cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeV2Response copy$default(HomeV2Response homeV2Response, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeV2Response.cards;
        }
        return homeV2Response.copy(list);
    }

    @NotNull
    public final List<HomeCards> component1() {
        return this.cards;
    }

    @NotNull
    public final HomeV2Response copy(@NotNull List<? extends HomeCards> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new HomeV2Response(cards);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeV2Response) && Intrinsics.areEqual(this.cards, ((HomeV2Response) obj).cards);
    }

    @NotNull
    public final List<HomeCards> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    @NotNull
    public String toString() {
        return "HomeV2Response(cards=" + this.cards + ')';
    }
}
