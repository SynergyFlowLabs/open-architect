package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class ArticleCard {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String articleId;

    @NotNull
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ArticleCard> serializer() {
            return ArticleCard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ArticleCard(int i10, String str, String str2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, ArticleCard$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleCard copy$default(ArticleCard articleCard, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleCard.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = articleCard.title;
        }
        return articleCard.copy(str, str2);
    }

    @kotlinx.serialization.a0("articleId")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @kotlinx.serialization.a0("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @oj.n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(ArticleCard articleCard, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, articleCard.articleId);
        eVar.encodeStringElement(serialDescriptor, 1, articleCard.title);
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final ArticleCard copy(@NotNull String articleId, @NotNull String title) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ArticleCard(articleId, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleCard)) {
            return false;
        }
        ArticleCard articleCard = (ArticleCard) obj;
        return Intrinsics.areEqual(this.articleId, articleCard.articleId) && Intrinsics.areEqual(this.title, articleCard.title);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.articleId.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "ArticleCard(articleId=" + this.articleId + ", title=" + this.title + ')';
    }

    public ArticleCard(@NotNull String articleId, @NotNull String title) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.articleId = articleId;
        this.title = title;
    }
}
