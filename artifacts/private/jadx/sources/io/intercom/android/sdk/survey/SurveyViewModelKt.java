package io.intercom.android.sdk.survey;

import androidx.compose.ui.graphics.s0;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class SurveyViewModelKt {
    @NotNull
    public static final SurveyUiColors toSurveyUiColors(@NotNull SurveyCustomization surveyCustomization) {
        Intrinsics.checkNotNullParameter(surveyCustomization, "<this>");
        long jB = s0.b(ColorUtils.parseColor(surveyCustomization.getBackgroundColor()));
        long jB2 = s0.b(ColorUtils.parseColor(surveyCustomization.getButtonColor()));
        return new SurveyUiColors(jB, ColorExtensionsKt.m729generateTextColor8_81llA(jB), jB2, ColorExtensionsKt.m729generateTextColor8_81llA(jB2), null, 16, null);
    }
}
