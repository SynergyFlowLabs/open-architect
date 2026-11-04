package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class InlineSource {
    public static final int $stable = 0;

    @NotNull
    private final String dataEntityId;

    @Nullable
    private final String dataEntityType;

    @NotNull
    private final String dataSourceIndex;

    @NotNull
    private final String href;

    @Nullable
    private final String title;

    public InlineSource(@NotNull String dataEntityId, @Nullable String str, @NotNull String dataSourceIndex, @NotNull String href, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(dataEntityId, "dataEntityId");
        Intrinsics.checkNotNullParameter(dataSourceIndex, "dataSourceIndex");
        Intrinsics.checkNotNullParameter(href, "href");
        this.dataEntityId = dataEntityId;
        this.dataEntityType = str;
        this.dataSourceIndex = dataSourceIndex;
        this.href = href;
        this.title = str2;
    }

    public static /* synthetic */ InlineSource copy$default(InlineSource inlineSource, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineSource.dataEntityId;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineSource.dataEntityType;
        }
        if ((i10 & 4) != 0) {
            str3 = inlineSource.dataSourceIndex;
        }
        if ((i10 & 8) != 0) {
            str4 = inlineSource.href;
        }
        if ((i10 & 16) != 0) {
            str5 = inlineSource.title;
        }
        String str6 = str5;
        String str7 = str3;
        return inlineSource.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    public final String component1() {
        return this.dataEntityId;
    }

    @Nullable
    public final String component2() {
        return this.dataEntityType;
    }

    @NotNull
    public final String component3() {
        return this.dataSourceIndex;
    }

    @NotNull
    public final String component4() {
        return this.href;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @NotNull
    public final InlineSource copy(@NotNull String dataEntityId, @Nullable String str, @NotNull String dataSourceIndex, @NotNull String href, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(dataEntityId, "dataEntityId");
        Intrinsics.checkNotNullParameter(dataSourceIndex, "dataSourceIndex");
        Intrinsics.checkNotNullParameter(href, "href");
        return new InlineSource(dataEntityId, str, dataSourceIndex, href, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineSource)) {
            return false;
        }
        InlineSource inlineSource = (InlineSource) obj;
        return Intrinsics.areEqual(this.dataEntityId, inlineSource.dataEntityId) && Intrinsics.areEqual(this.dataEntityType, inlineSource.dataEntityType) && Intrinsics.areEqual(this.dataSourceIndex, inlineSource.dataSourceIndex) && Intrinsics.areEqual(this.href, inlineSource.href) && Intrinsics.areEqual(this.title, inlineSource.title);
    }

    @NotNull
    public final String getDataEntityId() {
        return this.dataEntityId;
    }

    @Nullable
    public final String getDataEntityType() {
        return this.dataEntityType;
    }

    @NotNull
    public final String getDataSourceIndex() {
        return this.dataSourceIndex;
    }

    @NotNull
    public final String getHref() {
        return this.href;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.dataEntityId.hashCode() * 31;
        String str = this.dataEntityType;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dataSourceIndex.hashCode()) * 31) + this.href.hashCode()) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InlineSource(dataEntityId=" + this.dataEntityId + ", dataEntityType=" + this.dataEntityType + ", dataSourceIndex=" + this.dataSourceIndex + ", href=" + this.href + ", title=" + this.title + ')';
    }
}
