package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SurveyUiColors {
    public static final int $stable = 0;
    private final long background;
    private final long button;

    @Nullable
    private final q0 dropDownSelectedColor;
    private final long onBackground;
    private final long onButton;

    public /* synthetic */ SurveyUiColors(long j10, long j11, long j12, long j13, q0 q0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, q0Var);
    }

    /* JADX INFO: renamed from: copy-qa9m3tE$default, reason: not valid java name */
    public static /* synthetic */ SurveyUiColors m415copyqa9m3tE$default(SurveyUiColors surveyUiColors, long j10, long j11, long j12, long j13, q0 q0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = surveyUiColors.background;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = surveyUiColors.onBackground;
        }
        return surveyUiColors.m421copyqa9m3tE(j14, j11, (i10 & 4) != 0 ? surveyUiColors.button : j12, (i10 & 8) != 0 ? surveyUiColors.onButton : j13, (i10 & 16) != 0 ? surveyUiColors.dropDownSelectedColor : q0Var);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m416component10d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m417component20d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m418component30d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m419component40d7_KjU() {
        return this.onButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final q0 m420component5QN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qa9m3tE, reason: not valid java name */
    public final SurveyUiColors m421copyqa9m3tE(long j10, long j11, long j12, long j13, @Nullable q0 q0Var) {
        return new SurveyUiColors(j10, j11, j12, j13, q0Var, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyUiColors)) {
            return false;
        }
        SurveyUiColors surveyUiColors = (SurveyUiColors) obj;
        return q0.y(this.background, surveyUiColors.background) && q0.y(this.onBackground, surveyUiColors.onBackground) && q0.y(this.button, surveyUiColors.button) && q0.y(this.onButton, surveyUiColors.onButton) && Intrinsics.areEqual(this.dropDownSelectedColor, surveyUiColors.dropDownSelectedColor);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m422getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: getButton-0d7_KjU, reason: not valid java name */
    public final long m423getButton0d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: getButtonBorder-0d7_KjU, reason: not valid java name */
    public final long m424getButtonBorder0d7_KjU() {
        return ColorExtensionsKt.m735isDarkColor8_81llA(this.button) ? ColorExtensionsKt.m738lighten8_81llA(this.button) : ColorExtensionsKt.m728darken8_81llA(this.button);
    }

    @Nullable
    /* JADX INFO: renamed from: getDropDownSelectedColor-QN2ZGVo, reason: not valid java name */
    public final q0 m425getDropDownSelectedColorQN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m426getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getOnButton-0d7_KjU, reason: not valid java name */
    public final long m427getOnButton0d7_KjU() {
        return this.onButton;
    }

    public int hashCode() {
        int iK = ((((((q0.K(this.background) * 31) + q0.K(this.onBackground)) * 31) + q0.K(this.button)) * 31) + q0.K(this.onButton)) * 31;
        q0 q0Var = this.dropDownSelectedColor;
        return iK + (q0Var == null ? 0 : q0.K(q0Var.M()));
    }

    @NotNull
    public String toString() {
        return "SurveyUiColors(background=" + ((Object) q0.L(this.background)) + ", onBackground=" + ((Object) q0.L(this.onBackground)) + ", button=" + ((Object) q0.L(this.button)) + ", onButton=" + ((Object) q0.L(this.onButton)) + ", dropDownSelectedColor=" + this.dropDownSelectedColor + ')';
    }

    private SurveyUiColors(long j10, long j11, long j12, long j13, q0 q0Var) {
        this.background = j10;
        this.onBackground = j11;
        this.button = j12;
        this.onButton = j13;
        this.dropDownSelectedColor = q0Var;
    }

    public /* synthetic */ SurveyUiColors(long j10, long j11, long j12, long j13, q0 q0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, (i10 & 16) != 0 ? null : q0Var, null);
    }
}
