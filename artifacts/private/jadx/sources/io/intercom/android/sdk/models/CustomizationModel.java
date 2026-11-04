package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class CustomizationModel {
    public static final int $stable = 0;

    @c(com.facebook.internal.w0.f100156c1)
    @NotNull
    private final CustomizationColorsModel action;

    @c("action_contrast_dark")
    @Nullable
    private final CustomizationColorsModel actionContrastDark;

    @c("action_contrast_white")
    @Nullable
    private final CustomizationColorsModel actionContrastWhite;

    @c("alignment")
    @NotNull
    private final String alignment;

    @c("brand_name")
    @NotNull
    private final String brandName;

    @c("header")
    @NotNull
    private final CustomizationColorsModel header;

    @c("horizontal_padding")
    private final int horizontalPadding;

    @c("launcher_logo_dark_url")
    @Nullable
    private final String launcherLogoDarkUrl;

    @c("launcher_logo_url")
    @Nullable
    private final String launcherLogoUrl;

    @c("messenger_wallpaper")
    @NotNull
    private final String messengerWallpaper;

    @c("theme_mode")
    @Nullable
    private final String themeMode;

    @c("vertical_padding")
    private final int verticalPadding;

    public CustomizationModel(@NotNull CustomizationColorsModel action, @Nullable CustomizationColorsModel customizationColorsModel, @Nullable CustomizationColorsModel customizationColorsModel2, @NotNull String alignment, @NotNull String brandName, @NotNull CustomizationColorsModel header, int i10, @Nullable String str, @Nullable String str2, @NotNull String messengerWallpaper, @Nullable String str3, int i11) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(messengerWallpaper, "messengerWallpaper");
        this.action = action;
        this.actionContrastWhite = customizationColorsModel;
        this.actionContrastDark = customizationColorsModel2;
        this.alignment = alignment;
        this.brandName = brandName;
        this.header = header;
        this.horizontalPadding = i10;
        this.launcherLogoUrl = str;
        this.launcherLogoDarkUrl = str2;
        this.messengerWallpaper = messengerWallpaper;
        this.themeMode = str3;
        this.verticalPadding = i11;
    }

    public static /* synthetic */ CustomizationModel copy$default(CustomizationModel customizationModel, CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i10, String str3, String str4, String str5, String str6, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            customizationColorsModel = customizationModel.action;
        }
        if ((i12 & 2) != 0) {
            customizationColorsModel2 = customizationModel.actionContrastWhite;
        }
        if ((i12 & 4) != 0) {
            customizationColorsModel3 = customizationModel.actionContrastDark;
        }
        if ((i12 & 8) != 0) {
            str = customizationModel.alignment;
        }
        if ((i12 & 16) != 0) {
            str2 = customizationModel.brandName;
        }
        if ((i12 & 32) != 0) {
            customizationColorsModel4 = customizationModel.header;
        }
        if ((i12 & 64) != 0) {
            i10 = customizationModel.horizontalPadding;
        }
        if ((i12 & 128) != 0) {
            str3 = customizationModel.launcherLogoUrl;
        }
        if ((i12 & 256) != 0) {
            str4 = customizationModel.launcherLogoDarkUrl;
        }
        if ((i12 & 512) != 0) {
            str5 = customizationModel.messengerWallpaper;
        }
        if ((i12 & 1024) != 0) {
            str6 = customizationModel.themeMode;
        }
        if ((i12 & 2048) != 0) {
            i11 = customizationModel.verticalPadding;
        }
        String str7 = str6;
        int i13 = i11;
        String str8 = str4;
        String str9 = str5;
        int i14 = i10;
        String str10 = str3;
        String str11 = str2;
        CustomizationColorsModel customizationColorsModel5 = customizationColorsModel4;
        return customizationModel.copy(customizationColorsModel, customizationColorsModel2, customizationColorsModel3, str, str11, customizationColorsModel5, i14, str10, str8, str9, str7, i13);
    }

    @NotNull
    public final CustomizationColorsModel component1() {
        return this.action;
    }

    @NotNull
    public final String component10() {
        return this.messengerWallpaper;
    }

    @Nullable
    public final String component11() {
        return this.themeMode;
    }

    public final int component12() {
        return this.verticalPadding;
    }

    @Nullable
    public final CustomizationColorsModel component2() {
        return this.actionContrastWhite;
    }

    @Nullable
    public final CustomizationColorsModel component3() {
        return this.actionContrastDark;
    }

    @NotNull
    public final String component4() {
        return this.alignment;
    }

    @NotNull
    public final String component5() {
        return this.brandName;
    }

    @NotNull
    public final CustomizationColorsModel component6() {
        return this.header;
    }

    public final int component7() {
        return this.horizontalPadding;
    }

    @Nullable
    public final String component8() {
        return this.launcherLogoUrl;
    }

    @Nullable
    public final String component9() {
        return this.launcherLogoDarkUrl;
    }

    @NotNull
    public final CustomizationModel copy(@NotNull CustomizationColorsModel action, @Nullable CustomizationColorsModel customizationColorsModel, @Nullable CustomizationColorsModel customizationColorsModel2, @NotNull String alignment, @NotNull String brandName, @NotNull CustomizationColorsModel header, int i10, @Nullable String str, @Nullable String str2, @NotNull String messengerWallpaper, @Nullable String str3, int i11) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(messengerWallpaper, "messengerWallpaper");
        return new CustomizationModel(action, customizationColorsModel, customizationColorsModel2, alignment, brandName, header, i10, str, str2, messengerWallpaper, str3, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationModel)) {
            return false;
        }
        CustomizationModel customizationModel = (CustomizationModel) obj;
        return Intrinsics.areEqual(this.action, customizationModel.action) && Intrinsics.areEqual(this.actionContrastWhite, customizationModel.actionContrastWhite) && Intrinsics.areEqual(this.actionContrastDark, customizationModel.actionContrastDark) && Intrinsics.areEqual(this.alignment, customizationModel.alignment) && Intrinsics.areEqual(this.brandName, customizationModel.brandName) && Intrinsics.areEqual(this.header, customizationModel.header) && this.horizontalPadding == customizationModel.horizontalPadding && Intrinsics.areEqual(this.launcherLogoUrl, customizationModel.launcherLogoUrl) && Intrinsics.areEqual(this.launcherLogoDarkUrl, customizationModel.launcherLogoDarkUrl) && Intrinsics.areEqual(this.messengerWallpaper, customizationModel.messengerWallpaper) && Intrinsics.areEqual(this.themeMode, customizationModel.themeMode) && this.verticalPadding == customizationModel.verticalPadding;
    }

    @NotNull
    public final CustomizationColorsModel getAction() {
        return this.action;
    }

    @Nullable
    public final CustomizationColorsModel getActionContrastDark() {
        return this.actionContrastDark;
    }

    @Nullable
    public final CustomizationColorsModel getActionContrastWhite() {
        return this.actionContrastWhite;
    }

    @NotNull
    public final String getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final CustomizationColorsModel getHeader() {
        return this.header;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Nullable
    public final String getLauncherLogoDarkUrl() {
        return this.launcherLogoDarkUrl;
    }

    @Nullable
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String getMessengerWallpaper() {
        return this.messengerWallpaper;
    }

    @Nullable
    public final String getThemeMode() {
        return this.themeMode;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        CustomizationColorsModel customizationColorsModel = this.actionContrastWhite;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (customizationColorsModel == null ? 0 : customizationColorsModel.hashCode())) * 31;
        CustomizationColorsModel customizationColorsModel2 = this.actionContrastDark;
        int iHashCode4 = (((((((((iHashCode3 + (customizationColorsModel2 == null ? 0 : customizationColorsModel2.hashCode())) * 31) + this.alignment.hashCode()) * 31) + this.brandName.hashCode()) * 31) + this.header.hashCode()) * 31) + Integer.hashCode(this.horizontalPadding)) * 31;
        String str = this.launcherLogoUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.launcherLogoDarkUrl;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.messengerWallpaper.hashCode()) * 31;
        String str3 = this.themeMode;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return ((iHashCode6 + iHashCode2) * 31) + Integer.hashCode(this.verticalPadding);
    }

    @NotNull
    public String toString() {
        return "CustomizationModel(action=" + this.action + ", actionContrastWhite=" + this.actionContrastWhite + ", actionContrastDark=" + this.actionContrastDark + ", alignment=" + this.alignment + ", brandName=" + this.brandName + ", header=" + this.header + ", horizontalPadding=" + this.horizontalPadding + ", launcherLogoUrl=" + this.launcherLogoUrl + ", launcherLogoDarkUrl=" + this.launcherLogoDarkUrl + ", messengerWallpaper=" + this.messengerWallpaper + ", themeMode=" + this.themeMode + ", verticalPadding=" + this.verticalPadding + ')';
    }

    public /* synthetic */ CustomizationModel(CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i10, String str3, String str4, String str5, String str6, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(customizationColorsModel, customizationColorsModel2, (i12 & 4) != 0 ? null : customizationColorsModel3, str, str2, customizationColorsModel4, i10, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : str4, str5, (i12 & 1024) != 0 ? null : str6, i11);
    }
}
