package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HeaderContentModel {
    public static final int $stable = 0;

    @c("close_button")
    @NotNull
    private final CloseButtonModel closeButton;

    @c("greeting")
    @NotNull
    private final HeaderTextModel greeting;

    @c("introduction")
    @NotNull
    private final HeaderTextModel intro;

    @c("logo_dark_url")
    @Nullable
    private final String logoDarkUrl;

    @c("logo_url")
    @NotNull
    private final String logoUrl;

    @c("show_avatars")
    private final boolean showAvatars;

    @c("text_color_type")
    @Nullable
    private final String textColorType;

    @c("text_color_type_dark")
    @Nullable
    private final String textColorTypeDark;

    public HeaderContentModel() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ HeaderContentModel copy$default(HeaderContentModel headerContentModel, String str, String str2, boolean z10, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerContentModel.logoUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = headerContentModel.logoDarkUrl;
        }
        if ((i10 & 4) != 0) {
            z10 = headerContentModel.showAvatars;
        }
        if ((i10 & 8) != 0) {
            headerTextModel = headerContentModel.greeting;
        }
        if ((i10 & 16) != 0) {
            headerTextModel2 = headerContentModel.intro;
        }
        if ((i10 & 32) != 0) {
            closeButtonModel = headerContentModel.closeButton;
        }
        if ((i10 & 64) != 0) {
            str3 = headerContentModel.textColorType;
        }
        if ((i10 & 128) != 0) {
            str4 = headerContentModel.textColorTypeDark;
        }
        String str5 = str3;
        String str6 = str4;
        HeaderTextModel headerTextModel3 = headerTextModel2;
        CloseButtonModel closeButtonModel2 = closeButtonModel;
        return headerContentModel.copy(str, str2, z10, headerTextModel, headerTextModel3, closeButtonModel2, str5, str6);
    }

    @NotNull
    public final String component1() {
        return this.logoUrl;
    }

    @Nullable
    public final String component2() {
        return this.logoDarkUrl;
    }

    public final boolean component3() {
        return this.showAvatars;
    }

    @NotNull
    public final HeaderTextModel component4() {
        return this.greeting;
    }

    @NotNull
    public final HeaderTextModel component5() {
        return this.intro;
    }

    @NotNull
    public final CloseButtonModel component6() {
        return this.closeButton;
    }

    @Nullable
    public final String component7() {
        return this.textColorType;
    }

    @Nullable
    public final String component8() {
        return this.textColorTypeDark;
    }

    @NotNull
    public final HeaderContentModel copy(@NotNull String logoUrl, @Nullable String str, boolean z10, @NotNull HeaderTextModel greeting, @NotNull HeaderTextModel intro, @NotNull CloseButtonModel closeButton, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new HeaderContentModel(logoUrl, str, z10, greeting, intro, closeButton, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) obj;
        return Intrinsics.areEqual(this.logoUrl, headerContentModel.logoUrl) && Intrinsics.areEqual(this.logoDarkUrl, headerContentModel.logoDarkUrl) && this.showAvatars == headerContentModel.showAvatars && Intrinsics.areEqual(this.greeting, headerContentModel.greeting) && Intrinsics.areEqual(this.intro, headerContentModel.intro) && Intrinsics.areEqual(this.closeButton, headerContentModel.closeButton) && Intrinsics.areEqual(this.textColorType, headerContentModel.textColorType) && Intrinsics.areEqual(this.textColorTypeDark, headerContentModel.textColorTypeDark);
    }

    @NotNull
    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    @NotNull
    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    @Nullable
    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    @Nullable
    public final String getTextColorType() {
        return this.textColorType;
    }

    @Nullable
    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public int hashCode() {
        int iHashCode = this.logoUrl.hashCode() * 31;
        String str = this.logoDarkUrl;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showAvatars)) * 31) + this.greeting.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.closeButton.hashCode()) * 31;
        String str2 = this.textColorType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColorTypeDark;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HeaderContentModel(logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", showAvatars=" + this.showAvatars + ", greeting=" + this.greeting + ", intro=" + this.intro + ", closeButton=" + this.closeButton + ", textColorType=" + this.textColorType + ", textColorTypeDark=" + this.textColorTypeDark + ')';
    }

    public HeaderContentModel(@NotNull String logoUrl, @Nullable String str, boolean z10, @NotNull HeaderTextModel greeting, @NotNull HeaderTextModel intro, @NotNull CloseButtonModel closeButton, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.logoUrl = logoUrl;
        this.logoDarkUrl = str;
        this.showAvatars = z10;
        this.greeting = greeting;
        this.intro = intro;
        this.closeButton = closeButton;
        this.textColorType = str2;
        this.textColorTypeDark = str3;
    }

    public /* synthetic */ HeaderContentModel(String str, String str2, boolean z10, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel, (i10 & 16) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel2, (i10 & 32) != 0 ? new CloseButtonModel(null, 0.0f, null, 7, null) : closeButtonModel, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4);
    }
}
