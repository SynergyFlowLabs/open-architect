package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class HelpCenterCollection {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f291588id;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterCollection> serializer() {
            return HelpCenterCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollection(int i10, String str, String str2, String str3, int i11, int i12, v2 v2Var) {
        if (2 != (i10 & 2)) {
            g2.b(i10, 2, HelpCenterCollection$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.summary = "";
        } else {
            this.summary = str;
        }
        this.f291588id = str2;
        if ((i10 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 8) == 0) {
            this.articlesCount = 0;
        } else {
            this.articlesCount = i11;
        }
        if ((i10 & 16) == 0) {
            this.collectionsCount = 0;
        } else {
            this.collectionsCount = i12;
        }
    }

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String str, String str2, String str3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = helpCenterCollection.summary;
        }
        if ((i12 & 2) != 0) {
            str2 = helpCenterCollection.f291588id;
        }
        if ((i12 & 4) != 0) {
            str3 = helpCenterCollection.title;
        }
        if ((i12 & 8) != 0) {
            i10 = helpCenterCollection.articlesCount;
        }
        if ((i12 & 16) != 0) {
            i11 = helpCenterCollection.collectionsCount;
        }
        int i13 = i11;
        String str4 = str3;
        return helpCenterCollection.copy(str, str2, str4, i10, i13);
    }

    @a0("article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @a0("collection_count")
    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @a0("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollection helpCenterCollection, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(helpCenterCollection.summary, "")) {
            eVar.encodeStringElement(serialDescriptor, 0, helpCenterCollection.summary);
        }
        eVar.encodeStringElement(serialDescriptor, 1, helpCenterCollection.f291588id);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(helpCenterCollection.title, "")) {
            eVar.encodeStringElement(serialDescriptor, 2, helpCenterCollection.title);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || helpCenterCollection.articlesCount != 0) {
            eVar.encodeIntElement(serialDescriptor, 3, helpCenterCollection.articlesCount);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 4) && helpCenterCollection.collectionsCount == 0) {
            return;
        }
        eVar.encodeIntElement(serialDescriptor, 4, helpCenterCollection.collectionsCount);
    }

    @NotNull
    public final String component1() {
        return this.summary;
    }

    @NotNull
    public final String component2() {
        return this.f291588id;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.articlesCount;
    }

    public final int component5() {
        return this.collectionsCount;
    }

    @NotNull
    public final HelpCenterCollection copy(@NotNull String summary, @NotNull String id2, @NotNull String title, int i10, int i11) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HelpCenterCollection(summary, id2, title, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollection)) {
            return false;
        }
        HelpCenterCollection helpCenterCollection = (HelpCenterCollection) obj;
        return Intrinsics.areEqual(this.summary, helpCenterCollection.summary) && Intrinsics.areEqual(this.f291588id, helpCenterCollection.f291588id) && Intrinsics.areEqual(this.title, helpCenterCollection.title) && this.articlesCount == helpCenterCollection.articlesCount && this.collectionsCount == helpCenterCollection.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    @NotNull
    public final String getId() {
        return this.f291588id;
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
        return (((((((this.summary.hashCode() * 31) + this.f291588id.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + Integer.hashCode(this.collectionsCount);
    }

    @NotNull
    public String toString() {
        return "HelpCenterCollection(summary=" + this.summary + ", id=" + this.f291588id + ", title=" + this.title + ", articlesCount=" + this.articlesCount + ", collectionsCount=" + this.collectionsCount + ')';
    }

    public HelpCenterCollection(@NotNull String summary, @NotNull String id2, @NotNull String title, int i10, int i11) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.summary = summary;
        this.f291588id = id2;
        this.title = title;
        this.articlesCount = i10;
        this.collectionsCount = i11;
    }

    public /* synthetic */ HelpCenterCollection(String str, String str2, String str3, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
    }
}
