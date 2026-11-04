package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@gk.d
public final class ArticleStatsArguments implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();

    @NotNull
    private final String articleId;
    private final boolean isFromSearchBrowse;

    public static final class Creator implements Parcelable.Creator<ArticleStatsArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ArticleStatsArguments(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments[] newArray(int i10) {
            return new ArticleStatsArguments[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public ArticleStatsArguments() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleStatsArguments.articleId;
        }
        if ((i10 & 2) != 0) {
            z10 = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(str, z10);
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    public final boolean component2() {
        return this.isFromSearchBrowse;
    }

    @NotNull
    public final ArticleStatsArguments copy(@NotNull String articleId, boolean z10) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        return new ArticleStatsArguments(articleId, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStatsArguments)) {
            return false;
        }
        ArticleStatsArguments articleStatsArguments = (ArticleStatsArguments) obj;
        return Intrinsics.areEqual(this.articleId, articleStatsArguments.articleId) && this.isFromSearchBrowse == articleStatsArguments.isFromSearchBrowse;
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return (this.articleId.hashCode() * 31) + Boolean.hashCode(this.isFromSearchBrowse);
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    @NotNull
    public String toString() {
        return "ArticleStatsArguments(articleId=" + this.articleId + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.articleId);
        dest.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ArticleStatsArguments(@NotNull String articleId) {
        this(articleId, false, 2, null);
        Intrinsics.checkNotNullParameter(articleId, "articleId");
    }

    @oj.j
    public ArticleStatsArguments(@NotNull String articleId, boolean z10) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.articleId = articleId;
        this.isFromSearchBrowse = z10;
    }

    public /* synthetic */ ArticleStatsArguments(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
