package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import com.rabbitmq.client.r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HeaderBackgroundModel {
    public static final int $stable = 8;

    @c("color")
    @NotNull
    private final String color;

    @c("color_dark")
    @Nullable
    private final String colorDark;

    @c("enabled")
    private final boolean enabled;

    @c("fade_to_white")
    private final boolean fade;

    @c("fade_to_dark")
    @Nullable
    private final Boolean fadeToDark;

    @c("gradient")
    @Nullable
    private final List<String> gradient;

    @c("gradient_dark")
    @Nullable
    private final List<String> gradientDark;

    @c("image_dark_url")
    @Nullable
    private final String imageDarkUrl;

    @c("image_url")
    @Nullable
    private final String imageUrl;

    @c("type")
    @NotNull
    private final HeaderBackdropType type;

    @c("type_dark")
    @Nullable
    private final HeaderBackdropType typeDark;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderBackgroundModel() {
        this(null, null, null, null, null, null, false, null, null, null, false, r.f265987x3, null);
        boolean z10 = true & false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderBackgroundModel copy$default(HeaderBackgroundModel headerBackgroundModel, String str, String str2, List list, List list2, String str3, String str4, boolean z10, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerBackgroundModel.color;
        }
        if ((i10 & 2) != 0) {
            str2 = headerBackgroundModel.colorDark;
        }
        if ((i10 & 4) != 0) {
            list = headerBackgroundModel.gradient;
        }
        if ((i10 & 8) != 0) {
            list2 = headerBackgroundModel.gradientDark;
        }
        if ((i10 & 16) != 0) {
            str3 = headerBackgroundModel.imageUrl;
        }
        if ((i10 & 32) != 0) {
            str4 = headerBackgroundModel.imageDarkUrl;
        }
        if ((i10 & 64) != 0) {
            z10 = headerBackgroundModel.fade;
        }
        if ((i10 & 128) != 0) {
            bool = headerBackgroundModel.fadeToDark;
        }
        if ((i10 & 256) != 0) {
            headerBackdropType = headerBackgroundModel.type;
        }
        if ((i10 & 512) != 0) {
            headerBackdropType2 = headerBackgroundModel.typeDark;
        }
        if ((i10 & 1024) != 0) {
            z11 = headerBackgroundModel.enabled;
        }
        HeaderBackdropType headerBackdropType3 = headerBackdropType2;
        boolean z12 = z11;
        Boolean bool2 = bool;
        HeaderBackdropType headerBackdropType4 = headerBackdropType;
        String str5 = str4;
        boolean z13 = z10;
        String str6 = str3;
        List list3 = list;
        return headerBackgroundModel.copy(str, str2, list3, list2, str6, str5, z13, bool2, headerBackdropType4, headerBackdropType3, z12);
    }

    @NotNull
    public final String component1() {
        return this.color;
    }

    @Nullable
    public final HeaderBackdropType component10() {
        return this.typeDark;
    }

    public final boolean component11() {
        return this.enabled;
    }

    @Nullable
    public final String component2() {
        return this.colorDark;
    }

    @Nullable
    public final List<String> component3() {
        return this.gradient;
    }

    @Nullable
    public final List<String> component4() {
        return this.gradientDark;
    }

    @Nullable
    public final String component5() {
        return this.imageUrl;
    }

    @Nullable
    public final String component6() {
        return this.imageDarkUrl;
    }

    public final boolean component7() {
        return this.fade;
    }

    @Nullable
    public final Boolean component8() {
        return this.fadeToDark;
    }

    @NotNull
    public final HeaderBackdropType component9() {
        return this.type;
    }

    @NotNull
    public final HeaderBackgroundModel copy(@NotNull String color, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable Boolean bool, @NotNull HeaderBackdropType type, @Nullable HeaderBackdropType headerBackdropType, boolean z11) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(type, "type");
        return new HeaderBackgroundModel(color, str, list, list2, str2, str3, z10, bool, type, headerBackdropType, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) obj;
        return Intrinsics.areEqual(this.color, headerBackgroundModel.color) && Intrinsics.areEqual(this.colorDark, headerBackgroundModel.colorDark) && Intrinsics.areEqual(this.gradient, headerBackgroundModel.gradient) && Intrinsics.areEqual(this.gradientDark, headerBackgroundModel.gradientDark) && Intrinsics.areEqual(this.imageUrl, headerBackgroundModel.imageUrl) && Intrinsics.areEqual(this.imageDarkUrl, headerBackgroundModel.imageDarkUrl) && this.fade == headerBackgroundModel.fade && Intrinsics.areEqual(this.fadeToDark, headerBackgroundModel.fadeToDark) && this.type == headerBackgroundModel.type && this.typeDark == headerBackgroundModel.typeDark && this.enabled == headerBackgroundModel.enabled;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getColorDark() {
        return this.colorDark;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFade() {
        return this.fade;
    }

    @Nullable
    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    @Nullable
    public final List<String> getGradient() {
        return this.gradient;
    }

    @Nullable
    public final List<String> getGradientDark() {
        return this.gradientDark;
    }

    @Nullable
    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final HeaderBackdropType getType() {
        return this.type;
    }

    @Nullable
    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        String str = this.colorDark;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.gradient;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gradientDark;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDarkUrl;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.fade)) * 31;
        Boolean bool = this.fadeToDark;
        int iHashCode7 = (((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + this.type.hashCode()) * 31;
        HeaderBackdropType headerBackdropType = this.typeDark;
        return ((iHashCode7 + (headerBackdropType != null ? headerBackdropType.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled);
    }

    @NotNull
    public String toString() {
        return "HeaderBackgroundModel(color=" + this.color + ", colorDark=" + this.colorDark + ", gradient=" + this.gradient + ", gradientDark=" + this.gradientDark + ", imageUrl=" + this.imageUrl + ", imageDarkUrl=" + this.imageDarkUrl + ", fade=" + this.fade + ", fadeToDark=" + this.fadeToDark + ", type=" + this.type + ", typeDark=" + this.typeDark + ", enabled=" + this.enabled + ')';
    }

    public HeaderBackgroundModel(@NotNull String color, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable Boolean bool, @NotNull HeaderBackdropType type, @Nullable HeaderBackdropType headerBackdropType, boolean z11) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(type, "type");
        this.color = color;
        this.colorDark = str;
        this.gradient = list;
        this.gradientDark = list2;
        this.imageUrl = str2;
        this.imageDarkUrl = str3;
        this.fade = z10;
        this.fadeToDark = bool;
        this.type = type;
        this.typeDark = headerBackdropType;
        this.enabled = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HeaderBackgroundModel(String str, String str2, List list, List list2, String str3, String str4, boolean z10, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "#FFFFFF" : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        list = (i10 & 4) != 0 ? null : list;
        list2 = (i10 & 8) != 0 ? null : list2;
        str3 = (i10 & 16) != 0 ? null : str3;
        str4 = (i10 & 32) != 0 ? null : str4;
        z10 = (i10 & 64) != 0 ? true : z10;
        bool = (i10 & 128) != 0 ? null : bool;
        headerBackdropType = (i10 & 256) != 0 ? HeaderBackdropType.SOLID : headerBackdropType;
        headerBackdropType2 = (i10 & 512) != 0 ? null : headerBackdropType2;
        if ((i10 & 1024) != 0) {
            z11 = false;
            int i11 = 7 | 0;
        }
        this(str, str2, list, list2, str3, str4, z10, bool, headerBackdropType, headerBackdropType2, z11);
    }
}
