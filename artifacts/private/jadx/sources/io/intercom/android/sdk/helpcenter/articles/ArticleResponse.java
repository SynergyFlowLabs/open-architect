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
public final class ArticleResponse {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Article article;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ArticleResponse> serializer() {
            return ArticleResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ArticleResponse(int i10, Article article, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, ArticleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.article = article;
    }

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, Article article, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            article = articleResponse.article;
        }
        return articleResponse.copy(article);
    }

    @kotlinx.serialization.a0("article")
    public static /* synthetic */ void getArticle$annotations() {
    }

    @oj.n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(ArticleResponse articleResponse, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        int i10 = 6 | 0;
        eVar.encodeSerializableElement(serialDescriptor, 0, Article$$serializer.INSTANCE, articleResponse.article);
    }

    @NotNull
    public final Article component1() {
        return this.article;
    }

    @NotNull
    public final ArticleResponse copy(@NotNull Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        return new ArticleResponse(article);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArticleResponse) && Intrinsics.areEqual(this.article, ((ArticleResponse) obj).article);
    }

    @NotNull
    public final Article getArticle() {
        return this.article;
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    @NotNull
    public String toString() {
        return "ArticleResponse(article=" + this.article + ')';
    }

    public ArticleResponse(@NotNull Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.article = article;
    }
}
