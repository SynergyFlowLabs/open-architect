package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ArticleMetadata {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f291562id;

    @Nullable
    private final String title;

    public ArticleMetadata(@NotNull String id2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f291562id = id2;
        this.title = str;
    }

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleMetadata.f291562id;
        }
        if ((i10 & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f291562id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final ArticleMetadata copy(@NotNull String id2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ArticleMetadata(id2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) obj;
        return Intrinsics.areEqual(this.f291562id, articleMetadata.f291562id) && Intrinsics.areEqual(this.title, articleMetadata.title);
    }

    @NotNull
    public final String getId() {
        return this.f291562id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.f291562id.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ArticleMetadata(id=" + this.f291562id + ", title=" + this.title + ')';
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
