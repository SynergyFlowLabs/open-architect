package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class CloseButtonModel {
    public static final int $stable = 0;

    @c("background_color")
    @NotNull
    private final String backgroundColor;

    @c("background_opacity")
    private final float backgroundOpacity;

    @c("foreground_color")
    @NotNull
    private final String foregroundColor;

    public CloseButtonModel() {
        this(null, 0.0f, null, 7, null);
    }

    public static /* synthetic */ CloseButtonModel copy$default(CloseButtonModel closeButtonModel, String str, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = closeButtonModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            f10 = closeButtonModel.backgroundOpacity;
        }
        if ((i10 & 4) != 0) {
            str2 = closeButtonModel.foregroundColor;
        }
        return closeButtonModel.copy(str, f10, str2);
    }

    @NotNull
    public final String component1() {
        return this.backgroundColor;
    }

    public final float component2() {
        return this.backgroundOpacity;
    }

    @NotNull
    public final String component3() {
        return this.foregroundColor;
    }

    @NotNull
    public final CloseButtonModel copy(@NotNull String backgroundColor, float f10, @NotNull String foregroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        return new CloseButtonModel(backgroundColor, f10, foregroundColor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseButtonModel)) {
            return false;
        }
        CloseButtonModel closeButtonModel = (CloseButtonModel) obj;
        return Intrinsics.areEqual(this.backgroundColor, closeButtonModel.backgroundColor) && Float.compare(this.backgroundOpacity, closeButtonModel.backgroundOpacity) == 0 && Intrinsics.areEqual(this.foregroundColor, closeButtonModel.foregroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    @NotNull
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + Float.hashCode(this.backgroundOpacity)) * 31) + this.foregroundColor.hashCode();
    }

    @NotNull
    public String toString() {
        return "CloseButtonModel(backgroundColor=" + this.backgroundColor + ", backgroundOpacity=" + this.backgroundOpacity + ", foregroundColor=" + this.foregroundColor + ')';
    }

    public CloseButtonModel(@NotNull String backgroundColor, float f10, @NotNull String foregroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        this.backgroundColor = backgroundColor;
        this.backgroundOpacity = f10;
        this.foregroundColor = foregroundColor;
    }

    public /* synthetic */ CloseButtonModel(String str, float f10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2);
    }
}
