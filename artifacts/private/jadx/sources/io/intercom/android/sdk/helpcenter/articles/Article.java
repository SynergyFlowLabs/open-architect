package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class Article {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ArticleCard card;

    @Nullable
    private final String relatedConversationId;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Article> serializer() {
            return Article$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Article(int i10, String str, ArticleCard articleCard, v2 v2Var) {
        if (2 != (i10 & 2)) {
            g2.b(i10, 2, Article$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.relatedConversationId = null;
        } else {
            this.relatedConversationId = str;
        }
        this.card = articleCard;
    }

    public static /* synthetic */ Article copy$default(Article article, String str, ArticleCard articleCard, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = article.relatedConversationId;
        }
        if ((i10 & 2) != 0) {
            articleCard = article.card;
        }
        return article.copy(str, articleCard);
    }

    @kotlinx.serialization.a0("card")
    public static /* synthetic */ void getCard$annotations() {
    }

    @kotlinx.serialization.a0("related_conversation_id")
    public static /* synthetic */ void getRelatedConversationId$annotations() {
    }

    @oj.n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Article article, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || article.relatedConversationId != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, article.relatedConversationId);
        }
        eVar.encodeSerializableElement(serialDescriptor, 1, ArticleCard$$serializer.INSTANCE, article.card);
    }

    @Nullable
    public final String component1() {
        return this.relatedConversationId;
    }

    @NotNull
    public final ArticleCard component2() {
        return this.card;
    }

    @NotNull
    public final Article copy(@Nullable String str, @NotNull ArticleCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new Article(str, card);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return Intrinsics.areEqual(this.relatedConversationId, article.relatedConversationId) && Intrinsics.areEqual(this.card, article.card);
    }

    @NotNull
    public final ArticleCard getCard() {
        return this.card;
    }

    @Nullable
    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    public int hashCode() {
        String str = this.relatedConversationId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.card.hashCode();
    }

    @NotNull
    public String toString() {
        return "Article(relatedConversationId=" + this.relatedConversationId + ", card=" + this.card + ')';
    }

    public Article(@Nullable String str, @NotNull ArticleCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.relatedConversationId = str;
        this.card = card;
    }

    public /* synthetic */ Article(String str, ArticleCard articleCard, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, articleCard);
    }
}
