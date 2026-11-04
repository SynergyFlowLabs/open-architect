package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class CollectionRowData {
    public static final int $stable = 0;
    private final int articlesCount;
    private final int collectionsCount;

    @NotNull
    private final String descriptionText;
    private final int descriptionVisibility;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f292695id;

    @NotNull
    private final String titleText;

    public CollectionRowData(@NotNull String id2, @NotNull String titleText, int i10, @NotNull String descriptionText, int i11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        this.f292695id = id2;
        this.titleText = titleText;
        this.descriptionVisibility = i10;
        this.descriptionText = descriptionText;
        this.articlesCount = i11;
        this.collectionsCount = i12;
    }

    public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String str, String str2, int i10, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collectionRowData.f292695id;
        }
        if ((i13 & 2) != 0) {
            str2 = collectionRowData.titleText;
        }
        if ((i13 & 4) != 0) {
            i10 = collectionRowData.descriptionVisibility;
        }
        if ((i13 & 8) != 0) {
            str3 = collectionRowData.descriptionText;
        }
        if ((i13 & 16) != 0) {
            i11 = collectionRowData.articlesCount;
        }
        if ((i13 & 32) != 0) {
            i12 = collectionRowData.collectionsCount;
        }
        int i14 = i11;
        int i15 = i12;
        return collectionRowData.copy(str, str2, i10, str3, i14, i15);
    }

    @NotNull
    public final String component1() {
        return this.f292695id;
    }

    @NotNull
    public final String component2() {
        return this.titleText;
    }

    public final int component3() {
        return this.descriptionVisibility;
    }

    @NotNull
    public final String component4() {
        return this.descriptionText;
    }

    public final int component5() {
        return this.articlesCount;
    }

    public final int component6() {
        return this.collectionsCount;
    }

    @NotNull
    public final CollectionRowData copy(@NotNull String id2, @NotNull String titleText, int i10, @NotNull String descriptionText, int i11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        return new CollectionRowData(id2, titleText, i10, descriptionText, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionRowData)) {
            return false;
        }
        CollectionRowData collectionRowData = (CollectionRowData) obj;
        return Intrinsics.areEqual(this.f292695id, collectionRowData.f292695id) && Intrinsics.areEqual(this.titleText, collectionRowData.titleText) && this.descriptionVisibility == collectionRowData.descriptionVisibility && Intrinsics.areEqual(this.descriptionText, collectionRowData.descriptionText) && this.articlesCount == collectionRowData.articlesCount && this.collectionsCount == collectionRowData.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    @NotNull
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    @NotNull
    public final String getId() {
        return this.f292695id;
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (((((((((this.f292695id.hashCode() * 31) + this.titleText.hashCode()) * 31) + Integer.hashCode(this.descriptionVisibility)) * 31) + this.descriptionText.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + Integer.hashCode(this.collectionsCount);
    }

    @NotNull
    public String toString() {
        return "CollectionRowData(id=" + this.f292695id + ", titleText=" + this.titleText + ", descriptionVisibility=" + this.descriptionVisibility + ", descriptionText=" + this.descriptionText + ", articlesCount=" + this.articlesCount + ", collectionsCount=" + this.collectionsCount + ')';
    }

    public /* synthetic */ CollectionRowData(String str, String str2, int i10, String str3, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
