package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SurveyCustomization {
    public static final int $stable = 0;

    @c("background_color")
    @NotNull
    private final String backgroundColor;

    @c("button_color")
    @NotNull
    private final String buttonColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyCustomization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.backgroundColor;
    }

    @NotNull
    public final String component2() {
        return this.buttonColor;
    }

    @NotNull
    public final SurveyCustomization copy(@NotNull String backgroundColor, @NotNull String buttonColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        return new SurveyCustomization(backgroundColor, buttonColor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) obj;
        if (Intrinsics.areEqual(this.backgroundColor, surveyCustomization.backgroundColor) && Intrinsics.areEqual(this.buttonColor, surveyCustomization.buttonColor)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return (this.backgroundColor.hashCode() * 31) + this.buttonColor.hashCode();
    }

    @NotNull
    public String toString() {
        return "SurveyCustomization(backgroundColor=" + this.backgroundColor + ", buttonColor=" + this.buttonColor + ')';
    }

    public SurveyCustomization(@NotNull String backgroundColor, @NotNull String buttonColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        this.backgroundColor = backgroundColor;
        this.buttonColor = buttonColor;
    }

    public /* synthetic */ SurveyCustomization(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? "#000000" : str2);
    }
}
