package io.intercom.android.sdk.helpcenter.sections;

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
public final class HelpCenterArticle {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String articleId;

    @NotNull
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterArticle> serializer() {
            return HelpCenterArticle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterArticle(int i10, String str, String str2, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, HelpCenterArticle$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public static /* synthetic */ HelpCenterArticle copy$default(HelpCenterArticle helpCenterArticle, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticle.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticle.title;
        }
        return helpCenterArticle.copy(str, str2);
    }

    @a0("id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @a0("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticle helpCenterArticle, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, helpCenterArticle.articleId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(helpCenterArticle.title, "")) {
            eVar.encodeStringElement(serialDescriptor, 1, helpCenterArticle.title);
        }
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
    public final HelpCenterArticle copy(@NotNull String articleId, @NotNull String title) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HelpCenterArticle(articleId, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticle)) {
            return false;
        }
        HelpCenterArticle helpCenterArticle = (HelpCenterArticle) obj;
        return Intrinsics.areEqual(this.articleId, helpCenterArticle.articleId) && Intrinsics.areEqual(this.title, helpCenterArticle.title);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.articleId.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "HelpCenterArticle(articleId=" + this.articleId + ", title=" + this.title + ')';
    }

    public HelpCenterArticle(@NotNull String articleId, @NotNull String title) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.articleId = articleId;
        this.title = title;
    }

    public /* synthetic */ HelpCenterArticle(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
