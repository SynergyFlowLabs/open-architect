package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HeaderTextModel {
    public static final int $stable = 0;

    @c("text_color")
    @NotNull
    private final String color;

    @c("text_color_dark")
    @Nullable
    private final String colorDark;

    @c("opacity")
    private final float opacity;

    @c(FirebaseAnalytics.d.P)
    @NotNull
    private final String text;

    public HeaderTextModel() {
        this(null, 0.0f, null, null, 15, null);
    }

    public static /* synthetic */ HeaderTextModel copy$default(HeaderTextModel headerTextModel, String str, float f10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerTextModel.text;
        }
        if ((i10 & 2) != 0) {
            f10 = headerTextModel.opacity;
        }
        if ((i10 & 4) != 0) {
            str2 = headerTextModel.color;
        }
        if ((i10 & 8) != 0) {
            str3 = headerTextModel.colorDark;
        }
        return headerTextModel.copy(str, f10, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    public final float component2() {
        return this.opacity;
    }

    @NotNull
    public final String component3() {
        return this.color;
    }

    @Nullable
    public final String component4() {
        return this.colorDark;
    }

    @NotNull
    public final HeaderTextModel copy(@NotNull String text, float f10, @NotNull String color, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        return new HeaderTextModel(text, f10, color, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextModel)) {
            return false;
        }
        HeaderTextModel headerTextModel = (HeaderTextModel) obj;
        return Intrinsics.areEqual(this.text, headerTextModel.text) && Float.compare(this.opacity, headerTextModel.opacity) == 0 && Intrinsics.areEqual(this.color, headerTextModel.color) && Intrinsics.areEqual(this.colorDark, headerTextModel.colorDark);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getColorDark() {
        return this.colorDark;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + Float.hashCode(this.opacity)) * 31) + this.color.hashCode()) * 31;
        String str = this.colorDark;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "HeaderTextModel(text=" + this.text + ", opacity=" + this.opacity + ", color=" + this.color + ", colorDark=" + this.colorDark + ')';
    }

    public HeaderTextModel(@NotNull String text, float f10, @NotNull String color, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.text = text;
        this.opacity = f10;
        this.color = color;
        this.colorDark = str;
    }

    public /* synthetic */ HeaderTextModel(String str, float f10, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2, (i10 & 8) != 0 ? null : str3);
    }
}
