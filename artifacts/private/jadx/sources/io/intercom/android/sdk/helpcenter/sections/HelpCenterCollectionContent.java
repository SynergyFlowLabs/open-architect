package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@b0
public final class HelpCenterCollectionContent {
    private final int articlesCount;

    @NotNull
    private final List<Author> authors;

    @NotNull
    private final String collectionId;

    @NotNull
    private final List<HelpCenterArticle> helpCenterArticles;

    @NotNull
    private final List<HelpCenterSection> helpCenterSections;

    @NotNull
    private final List<HelpCenterCollection> subCollections;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new kotlinx.serialization.internal.f(HelpCenterArticle$$serializer.INSTANCE), new kotlinx.serialization.internal.f(HelpCenterSection$$serializer.INSTANCE), new kotlinx.serialization.internal.f(HelpCenterCollection$$serializer.INSTANCE), null, new kotlinx.serialization.internal.f(Author$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterCollectionContent> serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollectionContent(int i10, String str, String str2, String str3, List list, List list2, List list3, int i11, List list4, v2 v2Var) {
        if (65 != (i10 & 65)) {
            g2.b(i10, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
        }
        this.collectionId = str;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i10 & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i10 & 8) == 0) {
            this.helpCenterArticles = CollectionsKt.emptyList();
        } else {
            this.helpCenterArticles = list;
        }
        if ((i10 & 16) == 0) {
            this.helpCenterSections = CollectionsKt.emptyList();
        } else {
            this.helpCenterSections = list2;
        }
        if ((i10 & 32) == 0) {
            this.subCollections = CollectionsKt.emptyList();
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i11;
        if ((i10 & 128) == 0) {
            this.authors = CollectionsKt.emptyList();
        } else {
            this.authors = list4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i10, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = helpCenterCollectionContent.collectionId;
        }
        if ((i11 & 2) != 0) {
            str2 = helpCenterCollectionContent.title;
        }
        if ((i11 & 4) != 0) {
            str3 = helpCenterCollectionContent.summary;
        }
        if ((i11 & 8) != 0) {
            list = helpCenterCollectionContent.helpCenterArticles;
        }
        if ((i11 & 16) != 0) {
            list2 = helpCenterCollectionContent.helpCenterSections;
        }
        if ((i11 & 32) != 0) {
            list3 = helpCenterCollectionContent.subCollections;
        }
        if ((i11 & 64) != 0) {
            i10 = helpCenterCollectionContent.articlesCount;
        }
        if ((i11 & 128) != 0) {
            list4 = helpCenterCollectionContent.authors;
        }
        int i12 = i10;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return helpCenterCollectionContent.copy(str, str2, str3, list, list6, list7, i12, list5);
    }

    @a0("article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @a0("authors")
    public static /* synthetic */ void getAuthors$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getCollectionId$annotations() {
    }

    @a0("articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @l(level = n.WARNING, message = "sections is deprecated and will be removed in a future release. Use collections instead", replaceWith = @b1(expression = "collections", imports = {}))
    @a0("sections")
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    @a0("collections")
    public static /* synthetic */ void getSubCollections$annotations() {
    }

    @a0("description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @a0("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @oj.n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent helpCenterCollectionContent, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, helpCenterCollectionContent.collectionId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(helpCenterCollectionContent.title, "")) {
            eVar.encodeStringElement(serialDescriptor, 1, helpCenterCollectionContent.title);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(helpCenterCollectionContent.summary, "")) {
            eVar.encodeStringElement(serialDescriptor, 2, helpCenterCollectionContent.summary);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.areEqual(helpCenterCollectionContent.helpCenterArticles, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], helpCenterCollectionContent.helpCenterArticles);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.areEqual(helpCenterCollectionContent.helpCenterSections, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], helpCenterCollectionContent.helpCenterSections);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.areEqual(helpCenterCollectionContent.subCollections, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], helpCenterCollectionContent.subCollections);
        }
        eVar.encodeIntElement(serialDescriptor, 6, helpCenterCollectionContent.articlesCount);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.areEqual(helpCenterCollectionContent.authors, CollectionsKt.emptyList())) {
            return;
        }
        eVar.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], helpCenterCollectionContent.authors);
    }

    @NotNull
    public final String component1() {
        return this.collectionId;
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
    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    public final int component7() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> component8() {
        return this.authors;
    }

    @NotNull
    public final HelpCenterCollectionContent copy(@NotNull String collectionId, @NotNull String title, @NotNull String summary, @NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull List<HelpCenterSection> helpCenterSections, @NotNull List<HelpCenterCollection> subCollections, int i10, @NotNull List<Author> authors) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(helpCenterSections, "helpCenterSections");
        Intrinsics.checkNotNullParameter(subCollections, "subCollections");
        Intrinsics.checkNotNullParameter(authors, "authors");
        return new HelpCenterCollectionContent(collectionId, title, summary, helpCenterArticles, helpCenterSections, subCollections, i10, authors);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) obj;
        return Intrinsics.areEqual(this.collectionId, helpCenterCollectionContent.collectionId) && Intrinsics.areEqual(this.title, helpCenterCollectionContent.title) && Intrinsics.areEqual(this.summary, helpCenterCollectionContent.summary) && Intrinsics.areEqual(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && Intrinsics.areEqual(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && Intrinsics.areEqual(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && Intrinsics.areEqual(this.authors, helpCenterCollectionContent.authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> getAuthors() {
        return this.authors;
    }

    @NotNull
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
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
        return (((((((((((((this.collectionId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.helpCenterArticles.hashCode()) * 31) + this.helpCenterSections.hashCode()) * 31) + this.subCollections.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode();
    }

    @NotNull
    public String toString() {
        return "HelpCenterCollectionContent(collectionId=" + this.collectionId + ", title=" + this.title + ", summary=" + this.summary + ", helpCenterArticles=" + this.helpCenterArticles + ", helpCenterSections=" + this.helpCenterSections + ", subCollections=" + this.subCollections + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ')';
    }

    public HelpCenterCollectionContent(@NotNull String collectionId, @NotNull String title, @NotNull String summary, @NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull List<HelpCenterSection> helpCenterSections, @NotNull List<HelpCenterCollection> subCollections, int i10, @NotNull List<Author> authors) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(helpCenterSections, "helpCenterSections");
        Intrinsics.checkNotNullParameter(subCollections, "subCollections");
        Intrinsics.checkNotNullParameter(authors, "authors");
        this.collectionId = collectionId;
        this.title = title;
        this.summary = summary;
        this.helpCenterArticles = helpCenterArticles;
        this.helpCenterSections = helpCenterSections;
        this.subCollections = subCollections;
        this.articlesCount = i10;
        this.authors = authors;
    }

    public /* synthetic */ HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i10, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list3, i10, (i11 & 128) != 0 ? CollectionsKt.emptyList() : list4);
    }
}
