package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SuggestedArticle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f292829id;

    @c("title")
    @NotNull
    private final String title;

    @c("url")
    @NotNull
    private final String url;

    public SuggestedArticle(@NotNull String id2, @NotNull String title, @NotNull String url) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f292829id = id2;
        this.title = title;
        this.url = url;
    }

    public static /* synthetic */ SuggestedArticle copy$default(SuggestedArticle suggestedArticle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestedArticle.f292829id;
        }
        if ((i10 & 2) != 0) {
            str2 = suggestedArticle.title;
        }
        if ((i10 & 4) != 0) {
            str3 = suggestedArticle.url;
        }
        return suggestedArticle.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f292829id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final SuggestedArticle copy(@NotNull String id2, @NotNull String title, @NotNull String url) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        return new SuggestedArticle(id2, title, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedArticle)) {
            return false;
        }
        SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
        return Intrinsics.areEqual(this.f292829id, suggestedArticle.f292829id) && Intrinsics.areEqual(this.title, suggestedArticle.title) && Intrinsics.areEqual(this.url, suggestedArticle.url);
    }

    @NotNull
    public final String getId() {
        return this.f292829id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.f292829id.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "SuggestedArticle(id=" + this.f292829id + ", title=" + this.title + ", url=" + this.url + ')';
    }
}
