package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class CustomizationColorsModel {
    public static final int $stable = 0;

    @c("background_color")
    @NotNull
    private final String backgroundColor;

    @c("background_color_dark")
    @Nullable
    private final String backgroundColorDark;

    @c("foreground_color")
    @NotNull
    private final String foregroundColor;

    @c("foreground_color_dark")
    @Nullable
    private final String foregroundColorDark;

    @c("foreground_color_low_contrast")
    @NotNull
    private final String foregroundLowContrastColor;

    @c("foreground_color_low_contrast_dark")
    @Nullable
    private final String foregroundLowContrastColorDark;

    public CustomizationColorsModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CustomizationColorsModel copy$default(CustomizationColorsModel customizationColorsModel, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customizationColorsModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = customizationColorsModel.foregroundColor;
        }
        if ((i10 & 4) != 0) {
            str3 = customizationColorsModel.foregroundLowContrastColor;
        }
        if ((i10 & 8) != 0) {
            str4 = customizationColorsModel.backgroundColorDark;
        }
        if ((i10 & 16) != 0) {
            str5 = customizationColorsModel.foregroundColorDark;
        }
        if ((i10 & 32) != 0) {
            str6 = customizationColorsModel.foregroundLowContrastColorDark;
        }
        String str7 = str5;
        String str8 = str6;
        return customizationColorsModel.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    public final String component1() {
        return this.backgroundColor;
    }

    @NotNull
    public final String component2() {
        return this.foregroundColor;
    }

    @NotNull
    public final String component3() {
        return this.foregroundLowContrastColor;
    }

    @Nullable
    public final String component4() {
        return this.backgroundColorDark;
    }

    @Nullable
    public final String component5() {
        return this.foregroundColorDark;
    }

    @Nullable
    public final String component6() {
        return this.foregroundLowContrastColorDark;
    }

    @NotNull
    public final CustomizationColorsModel copy(@NotNull String backgroundColor, @NotNull String foregroundColor, @NotNull String foregroundLowContrastColor, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(foregroundLowContrastColor, "foregroundLowContrastColor");
        return new CustomizationColorsModel(backgroundColor, foregroundColor, foregroundLowContrastColor, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationColorsModel)) {
            return false;
        }
        CustomizationColorsModel customizationColorsModel = (CustomizationColorsModel) obj;
        return Intrinsics.areEqual(this.backgroundColor, customizationColorsModel.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, customizationColorsModel.foregroundColor) && Intrinsics.areEqual(this.foregroundLowContrastColor, customizationColorsModel.foregroundLowContrastColor) && Intrinsics.areEqual(this.backgroundColorDark, customizationColorsModel.backgroundColorDark) && Intrinsics.areEqual(this.foregroundColorDark, customizationColorsModel.foregroundColorDark) && Intrinsics.areEqual(this.foregroundLowContrastColorDark, customizationColorsModel.foregroundLowContrastColorDark);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @NotNull
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    public final String getForegroundColorDark() {
        return this.foregroundColorDark;
    }

    @NotNull
    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    @Nullable
    public final String getForegroundLowContrastColorDark() {
        return this.foregroundLowContrastColorDark;
    }

    public int hashCode() {
        int iHashCode = ((((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31) + this.foregroundLowContrastColor.hashCode()) * 31;
        String str = this.backgroundColorDark;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foregroundColorDark;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundLowContrastColorDark;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CustomizationColorsModel(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", foregroundLowContrastColor=" + this.foregroundLowContrastColor + ", backgroundColorDark=" + this.backgroundColorDark + ", foregroundColorDark=" + this.foregroundColorDark + ", foregroundLowContrastColorDark=" + this.foregroundLowContrastColorDark + ')';
    }

    public CustomizationColorsModel(@NotNull String backgroundColor, @NotNull String foregroundColor, @NotNull String foregroundLowContrastColor, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(foregroundLowContrastColor, "foregroundLowContrastColor");
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.foregroundLowContrastColor = foregroundLowContrastColor;
        this.backgroundColorDark = str;
        this.foregroundColorDark = str2;
        this.foregroundLowContrastColorDark = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomizationColorsModel(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "#FFFFFF" : str;
        str2 = (i10 & 2) != 0 ? "#000000" : str2;
        this(str, str2, (i10 & 4) != 0 ? str2 : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}
