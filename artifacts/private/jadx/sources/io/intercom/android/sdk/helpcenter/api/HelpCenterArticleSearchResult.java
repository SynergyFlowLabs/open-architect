package io.intercom.android.sdk.helpcenter.api;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HelpCenterArticleSearchResult {
    public static final int $stable = 0;

    @NotNull
    private final String articleId;

    @NotNull
    private final String matchingSnippet;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    public HelpCenterArticleSearchResult(@NotNull String articleId, @NotNull String title, @NotNull String summary, @NotNull String matchingSnippet) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(matchingSnippet, "matchingSnippet");
        this.articleId = articleId;
        this.title = title;
        this.summary = summary;
        this.matchingSnippet = matchingSnippet;
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
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
    public final String component3() {
        return this.summary;
    }

    @NotNull
    public final String component4() {
        return this.matchingSnippet;
    }

    @NotNull
    public final HelpCenterArticleSearchResult copy(@NotNull String articleId, @NotNull String title, @NotNull String summary, @NotNull String matchingSnippet) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(matchingSnippet, "matchingSnippet");
        return new HelpCenterArticleSearchResult(articleId, title, summary, matchingSnippet);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) obj;
        return Intrinsics.areEqual(this.articleId, helpCenterArticleSearchResult.articleId) && Intrinsics.areEqual(this.title, helpCenterArticleSearchResult.title) && Intrinsics.areEqual(this.summary, helpCenterArticleSearchResult.summary) && Intrinsics.areEqual(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.articleId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.matchingSnippet.hashCode();
    }

    @NotNull
    public String toString() {
        return "HelpCenterArticleSearchResult(articleId=" + this.articleId + ", title=" + this.title + ", summary=" + this.summary + ", matchingSnippet=" + this.matchingSnippet + ')';
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
