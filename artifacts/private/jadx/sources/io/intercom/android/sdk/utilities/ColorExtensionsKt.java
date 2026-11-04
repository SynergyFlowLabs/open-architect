package io.intercom.android.sdk.utilities;

import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* JADX INFO: renamed from: darken-8_81llA, reason: not valid java name */
    public static final long m728darken8_81llA(long j10) {
        return s0.b(ColorUtils.darkenColor(s0.t(j10)));
    }

    /* JADX INFO: renamed from: generateTextColor-8_81llA, reason: not valid java name */
    public static final long m729generateTextColor8_81llA(long j10) {
        return m735isDarkColor8_81llA(j10) ? q0.f38131b.w() : q0.f38131b.a();
    }

    /* JADX INFO: renamed from: getAccessibleBorderColor-8_81llA, reason: not valid java name */
    public static final long m730getAccessibleBorderColor8_81llA(long j10) {
        return m735isDarkColor8_81llA(j10) ? m738lighten8_81llA(j10) : m728darken8_81llA(j10);
    }

    /* JADX INFO: renamed from: getAccessibleColorOnDarkBackground-8_81llA, reason: not valid java name */
    public static final long m731getAccessibleColorOnDarkBackground8_81llA(long j10) {
        if (m735isDarkColor8_81llA(j10)) {
            j10 = m738lighten8_81llA(j10);
        }
        return j10;
    }

    /* JADX INFO: renamed from: getAccessibleColorOnWhiteBackground-8_81llA, reason: not valid java name */
    public static final long m732getAccessibleColorOnWhiteBackground8_81llA(long j10) {
        return m734isColorTooWhite8_81llA(j10) ? q0.f38131b.a() : j10;
    }

    @NotNull
    public static final Pair<String, Float> getGreetingTextColor(@Nullable String str) {
        if (Intrinsics.areEqual(str, "dark")) {
            return new Pair<>("#000000", Float.valueOf(0.6f));
        }
        return Intrinsics.areEqual(str, "light") ? new Pair<>("#FFFFFF", Float.valueOf(0.7f)) : new Pair<>("#000000", Float.valueOf(1.0f));
    }

    /* JADX INFO: renamed from: isBlack-8_81llA, reason: not valid java name */
    public static final boolean m733isBlack8_81llA(long j10) {
        return q0.y(j10, q0.f38131b.a());
    }

    /* JADX INFO: renamed from: isColorTooWhite-8_81llA, reason: not valid java name */
    private static final boolean m734isColorTooWhite8_81llA(long j10) {
        return q0.I(j10) >= WHITENESS_CUTOFF && q0.G(j10) >= WHITENESS_CUTOFF && q0.C(j10) >= WHITENESS_CUTOFF;
    }

    /* JADX INFO: renamed from: isDarkColor-8_81llA, reason: not valid java name */
    public static final boolean m735isDarkColor8_81llA(long j10) {
        return s0.r(j10) < 0.6f;
    }

    /* JADX INFO: renamed from: isLightColor-8_81llA, reason: not valid java name */
    public static final boolean m736isLightColor8_81llA(long j10) {
        return !m735isDarkColor8_81llA(j10);
    }

    /* JADX INFO: renamed from: isWhite-8_81llA, reason: not valid java name */
    public static final boolean m737isWhite8_81llA(long j10) {
        return q0.y(j10, q0.f38131b.w());
    }

    /* JADX INFO: renamed from: lighten-8_81llA, reason: not valid java name */
    public static final long m738lighten8_81llA(long j10) {
        return s0.b(ColorUtils.lightenColor(s0.t(j10)));
    }

    public static final long toComposeColor(@NotNull String str, float f10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z10 = false;
        return q0.w(s0.b(ColorUtils.parseColor(str)), f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return toComposeColor(str, f10);
    }
}
