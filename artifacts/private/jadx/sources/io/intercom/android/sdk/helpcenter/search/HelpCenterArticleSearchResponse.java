package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class HelpCenterArticleSearchResponse {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String articleId;

    @NotNull
    private final Highlight highlight;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterArticleSearchResponse> serializer() {
            return HelpCenterArticleSearchResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @w0(parameters = 1)
    public static final class Highlight {
        public static final int $stable = 0;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String summary;

        @NotNull
        private final String title;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Highlight> serializer() {
                return HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Highlight() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = highlight.title;
            }
            if ((i10 & 2) != 0) {
                str2 = highlight.summary;
            }
            return highlight.copy(str, str2);
        }

        @a0("summary")
        public static /* synthetic */ void getSummary$annotations() {
        }

        @a0("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @oj.n
        public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Highlight highlight, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(highlight.title, "")) {
                eVar.encodeStringElement(serialDescriptor, 0, highlight.title);
            }
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(highlight.summary, "")) {
                eVar.encodeStringElement(serialDescriptor, 1, highlight.summary);
            }
        }

        @NotNull
        public final String component1() {
            return this.title;
        }

        @NotNull
        public final String component2() {
            return this.summary;
        }

        @NotNull
        public final Highlight copy(@NotNull String title, @NotNull String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Highlight(title, summary);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) obj;
            return Intrinsics.areEqual(this.title, highlight.title) && Intrinsics.areEqual(this.summary, highlight.summary);
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
            return (this.title.hashCode() * 31) + this.summary.hashCode();
        }

        @NotNull
        public String toString() {
            return "Highlight(title=" + this.title + ", summary=" + this.summary + ')';
        }

        public /* synthetic */ Highlight(int i10, String str, String str2, v2 v2Var) {
            if ((i10 & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i10 & 2) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
        }

        public Highlight(@NotNull String title, @NotNull String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.title = title;
            this.summary = summary;
        }

        public /* synthetic */ Highlight(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(int i10, String str, String str2, String str3, String str4, Highlight highlight, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, HelpCenterArticleSearchResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        if ((i10 & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
        if ((i10 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 8) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i10 & 16) != 0) {
            this.highlight = highlight;
            return;
        }
        this.highlight = new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String str, String str2, String str3, String str4, Highlight highlight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResponse.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResponse.summary;
        }
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResponse.title;
        }
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResponse.url;
        }
        if ((i10 & 16) != 0) {
            highlight = helpCenterArticleSearchResponse.highlight;
        }
        Highlight highlight2 = highlight;
        String str5 = str3;
        return helpCenterArticleSearchResponse.copy(str, str2, str5, str4, highlight2);
    }

    @a0("id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @a0("highlight")
    public static /* synthetic */ void getHighlight$annotations() {
    }

    @a0("summary")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @a0("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @a0("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, helpCenterArticleSearchResponse.articleId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(helpCenterArticleSearchResponse.summary, "")) {
            eVar.encodeStringElement(serialDescriptor, 1, helpCenterArticleSearchResponse.summary);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(helpCenterArticleSearchResponse.title, "")) {
            eVar.encodeStringElement(serialDescriptor, 2, helpCenterArticleSearchResponse.title);
        }
        int i10 = 3;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.areEqual(helpCenterArticleSearchResponse.url, "")) {
            eVar.encodeStringElement(serialDescriptor, 3, helpCenterArticleSearchResponse.url);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.areEqual(helpCenterArticleSearchResponse.highlight, new Highlight((String) null, (String) (0 == true ? 1 : 0), i10, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        eVar.encodeSerializableElement(serialDescriptor, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, helpCenterArticleSearchResponse.highlight);
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    @NotNull
    public final String component2() {
        return this.summary;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final Highlight component5() {
        return this.highlight;
    }

    @NotNull
    public final HelpCenterArticleSearchResponse copy(@NotNull String articleId, @NotNull String summary, @NotNull String title, @NotNull String url, @NotNull Highlight highlight) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        return new HelpCenterArticleSearchResponse(articleId, summary, title, url, highlight);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = (HelpCenterArticleSearchResponse) obj;
        return Intrinsics.areEqual(this.articleId, helpCenterArticleSearchResponse.articleId) && Intrinsics.areEqual(this.summary, helpCenterArticleSearchResponse.summary) && Intrinsics.areEqual(this.title, helpCenterArticleSearchResponse.title) && Intrinsics.areEqual(this.url, helpCenterArticleSearchResponse.url) && Intrinsics.areEqual(this.highlight, helpCenterArticleSearchResponse.highlight);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final Highlight getHighlight() {
        return this.highlight;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
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
        return (((((((this.articleId.hashCode() * 31) + this.summary.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.highlight.hashCode();
    }

    @NotNull
    public String toString() {
        return "HelpCenterArticleSearchResponse(articleId=" + this.articleId + ", summary=" + this.summary + ", title=" + this.title + ", url=" + this.url + ", highlight=" + this.highlight + ')';
    }

    public HelpCenterArticleSearchResponse(@NotNull String articleId, @NotNull String summary, @NotNull String title, @NotNull String url, @NotNull Highlight highlight) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.articleId = articleId;
        this.summary = summary;
        this.title = title;
        this.url = url;
        this.highlight = highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : highlight);
    }
}
