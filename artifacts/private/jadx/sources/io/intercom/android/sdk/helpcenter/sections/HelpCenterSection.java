package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@b0
public final class HelpCenterSection {

    @NotNull
    private final List<HelpCenterArticle> helpCenterArticles;

    @NotNull
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(HelpCenterArticle$$serializer.INSTANCE), null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterSection> serializer() {
            return HelpCenterSection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 2 & 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HelpCenterSection() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((i10 & 2) != 0) {
            str = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, str);
    }

    @a0("articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @a0("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterSection helpCenterSection, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(helpCenterSection.helpCenterArticles, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], helpCenterSection.helpCenterArticles);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.areEqual(helpCenterSection.title, "")) {
            return;
        }
        eVar.encodeStringElement(serialDescriptor, 1, helpCenterSection.title);
    }

    @NotNull
    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final HelpCenterSection copy(@NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull String title) {
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HelpCenterSection(helpCenterArticles, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterSection)) {
            return false;
        }
        HelpCenterSection helpCenterSection = (HelpCenterSection) obj;
        if (Intrinsics.areEqual(this.helpCenterArticles, helpCenterSection.helpCenterArticles) && Intrinsics.areEqual(this.title, helpCenterSection.title)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.helpCenterArticles.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "HelpCenterSection(helpCenterArticles=" + this.helpCenterArticles + ", title=" + this.title + ')';
    }

    public /* synthetic */ HelpCenterSection(int i10, List list, String str, v2 v2Var) {
        this.helpCenterArticles = (i10 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
    }

    public HelpCenterSection(@NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull String title) {
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(title, "title");
        this.helpCenterArticles = helpCenterArticles;
        this.title = title;
    }

    public /* synthetic */ HelpCenterSection(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? "" : str);
    }
}
