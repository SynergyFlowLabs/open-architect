package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.l6;
import androidx.compose.material3.o6;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.media3.common.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomColorsKt {

    @NotNull
    private static final m4<IntercomColors> LocalIntercomColors = a1.m(new Function0() { // from class: io.intercom.android.sdk.ui.theme.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomColorsKt.intercomLightColors();
        }
    });

    @NotNull
    private static n3<ThemeMode> currentThemeMode = d7.g(ThemeMode.LIGHT, null, 2, null);

    @NotNull
    public static final n3<ThemeMode> getCurrentThemeMode() {
        return currentThemeMode;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntercomColors-hIzCY_Q, reason: not valid java name */
    public static final IntercomColors m726getIntercomColorshIzCY_Q(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, @Nullable q0 q0Var) {
        if (z10) {
            IntercomColors intercomColorsIntercomLightColors = intercomLightColors();
            return intercomColorsIntercomLightColors.m683copyTCGdx94(((-64) & 1) != 0 ? intercomColorsIntercomLightColors.action : j10, ((-64) & 2) != 0 ? intercomColorsIntercomLightColors.onAction : j11, ((-64) & 4) != 0 ? intercomColorsIntercomLightColors.actionContrastWhite : j12, ((-64) & 8) != 0 ? intercomColorsIntercomLightColors.onActionContrastWhite : j13, ((-64) & 16) != 0 ? intercomColorsIntercomLightColors.header : j14, ((-64) & 32) != 0 ? intercomColorsIntercomLightColors.onHeader : j15, ((-64) & 64) != 0 ? intercomColorsIntercomLightColors.background : 0L, ((-64) & 128) != 0 ? intercomColorsIntercomLightColors.primaryText : 0L, ((-64) & 256) != 0 ? intercomColorsIntercomLightColors.primaryIcon : 0L, ((-64) & 512) != 0 ? intercomColorsIntercomLightColors.descriptionText : 0L, ((-64) & 1024) != 0 ? intercomColorsIntercomLightColors.captionText : 0L, ((-64) & 2048) != 0 ? intercomColorsIntercomLightColors.bubbleBackground : 0L, ((-64) & 4096) != 0 ? intercomColorsIntercomLightColors.adminBackground : 0L, ((-64) & 8192) != 0 ? intercomColorsIntercomLightColors.adminBorder : 0L, ((-64) & 16384) != 0 ? intercomColorsIntercomLightColors.timestampBackground : 0L, ((-64) & 32768) != 0 ? intercomColorsIntercomLightColors.onDisabled : 0L, ((-64) & 65536) != 0 ? intercomColorsIntercomLightColors.cardBorder : 0L, ((-64) & 131072) != 0 ? intercomColorsIntercomLightColors.composerBorder : 0L, ((-64) & 262144) != 0 ? intercomColorsIntercomLightColors.collectorBorder : 0L, ((-64) & 524288) != 0 ? intercomColorsIntercomLightColors.collectorSelected : 0L, ((-64) & 1048576) != 0 ? intercomColorsIntercomLightColors.border : 0L, ((-64) & 2097152) != 0 ? intercomColorsIntercomLightColors.shadow : 0L, ((-64) & 4194304) != 0 ? intercomColorsIntercomLightColors.specialNoticeBackground : 0L, ((-64) & 8388608) != 0 ? intercomColorsIntercomLightColors.specialNoticeBorder : 0L, ((-64) & 16777216) != 0 ? intercomColorsIntercomLightColors.poweredByBackgroundColor : 0L, ((-64) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? intercomColorsIntercomLightColors.divider : 0L, ((-64) & 67108864) != 0 ? intercomColorsIntercomLightColors.disabled : 0L, ((-64) & j.W0) != 0 ? intercomColorsIntercomLightColors.greetingText : 0L, ((-64) & 268435456) != 0 ? intercomColorsIntercomLightColors.introText : 0L, ((-64) & 536870912) != 0 ? intercomColorsIntercomLightColors.isTyping : 0L, ((-64) & 1073741824) != 0 ? intercomColorsIntercomLightColors.hintText : 0L, ((-64) & Integer.MIN_VALUE) != 0 ? intercomColorsIntercomLightColors.sourceBackground : 0L, (2046 & 1) != 0 ? intercomColorsIntercomLightColors.inputAlt : q0Var != null ? q0Var.M() : intercomLightColors().m706getInputAlt0d7_KjU(), (2046 & 2) != 0 ? intercomColorsIntercomLightColors.reminderBackgroundColor : 0L, (2046 & 4) != 0 ? intercomColorsIntercomLightColors.reminderTextColor : 0L, (2046 & 8) != 0 ? intercomColorsIntercomLightColors.badge : 0L, (2046 & 16) != 0 ? intercomColorsIntercomLightColors.waiting : 0L, (2046 & 32) != 0 ? intercomColorsIntercomLightColors.submitted : 0L, (2046 & 64) != 0 ? intercomColorsIntercomLightColors.resolved : 0L, (2046 & 128) != 0 ? intercomColorsIntercomLightColors.away : 0L, (2046 & 256) != 0 ? intercomColorsIntercomLightColors.active : 0L, (2046 & 512) != 0 ? intercomColorsIntercomLightColors.error : 0L, (2046 & 1024) != 0 ? intercomColorsIntercomLightColors.isLight : false);
        }
        IntercomColors intercomColorsIntercomDarkColors = intercomDarkColors();
        return intercomColorsIntercomDarkColors.m683copyTCGdx94(((-64) & 1) != 0 ? intercomColorsIntercomDarkColors.action : j10, ((-64) & 2) != 0 ? intercomColorsIntercomDarkColors.onAction : j11, ((-64) & 4) != 0 ? intercomColorsIntercomDarkColors.actionContrastWhite : j12, ((-64) & 8) != 0 ? intercomColorsIntercomDarkColors.onActionContrastWhite : j13, ((-64) & 16) != 0 ? intercomColorsIntercomDarkColors.header : j14, ((-64) & 32) != 0 ? intercomColorsIntercomDarkColors.onHeader : j15, ((-64) & 64) != 0 ? intercomColorsIntercomDarkColors.background : 0L, ((-64) & 128) != 0 ? intercomColorsIntercomDarkColors.primaryText : 0L, ((-64) & 256) != 0 ? intercomColorsIntercomDarkColors.primaryIcon : 0L, ((-64) & 512) != 0 ? intercomColorsIntercomDarkColors.descriptionText : 0L, ((-64) & 1024) != 0 ? intercomColorsIntercomDarkColors.captionText : 0L, ((-64) & 2048) != 0 ? intercomColorsIntercomDarkColors.bubbleBackground : 0L, ((-64) & 4096) != 0 ? intercomColorsIntercomDarkColors.adminBackground : 0L, ((-64) & 8192) != 0 ? intercomColorsIntercomDarkColors.adminBorder : 0L, ((-64) & 16384) != 0 ? intercomColorsIntercomDarkColors.timestampBackground : 0L, ((-64) & 32768) != 0 ? intercomColorsIntercomDarkColors.onDisabled : 0L, ((-64) & 65536) != 0 ? intercomColorsIntercomDarkColors.cardBorder : 0L, ((-64) & 131072) != 0 ? intercomColorsIntercomDarkColors.composerBorder : 0L, ((-64) & 262144) != 0 ? intercomColorsIntercomDarkColors.collectorBorder : 0L, ((-64) & 524288) != 0 ? intercomColorsIntercomDarkColors.collectorSelected : 0L, ((-64) & 1048576) != 0 ? intercomColorsIntercomDarkColors.border : 0L, ((-64) & 2097152) != 0 ? intercomColorsIntercomDarkColors.shadow : 0L, ((-64) & 4194304) != 0 ? intercomColorsIntercomDarkColors.specialNoticeBackground : 0L, ((-64) & 8388608) != 0 ? intercomColorsIntercomDarkColors.specialNoticeBorder : 0L, ((-64) & 16777216) != 0 ? intercomColorsIntercomDarkColors.poweredByBackgroundColor : 0L, ((-64) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? intercomColorsIntercomDarkColors.divider : 0L, ((-64) & 67108864) != 0 ? intercomColorsIntercomDarkColors.disabled : 0L, ((-64) & j.W0) != 0 ? intercomColorsIntercomDarkColors.greetingText : 0L, ((-64) & 268435456) != 0 ? intercomColorsIntercomDarkColors.introText : 0L, ((-64) & 536870912) != 0 ? intercomColorsIntercomDarkColors.isTyping : 0L, ((-64) & 1073741824) != 0 ? intercomColorsIntercomDarkColors.hintText : 0L, ((-64) & Integer.MIN_VALUE) != 0 ? intercomColorsIntercomDarkColors.sourceBackground : 0L, (2046 & 1) != 0 ? intercomColorsIntercomDarkColors.inputAlt : q0Var != null ? q0Var.M() : intercomDarkColors().m706getInputAlt0d7_KjU(), (2046 & 2) != 0 ? intercomColorsIntercomDarkColors.reminderBackgroundColor : 0L, (2046 & 4) != 0 ? intercomColorsIntercomDarkColors.reminderTextColor : 0L, (2046 & 8) != 0 ? intercomColorsIntercomDarkColors.badge : 0L, (2046 & 16) != 0 ? intercomColorsIntercomDarkColors.waiting : 0L, (2046 & 32) != 0 ? intercomColorsIntercomDarkColors.submitted : 0L, (2046 & 64) != 0 ? intercomColorsIntercomDarkColors.resolved : 0L, (2046 & 128) != 0 ? intercomColorsIntercomDarkColors.away : 0L, (2046 & 256) != 0 ? intercomColorsIntercomDarkColors.active : 0L, (2046 & 512) != 0 ? intercomColorsIntercomDarkColors.error : 0L, (2046 & 1024) != 0 ? intercomColorsIntercomDarkColors.isLight : false);
    }

    @NotNull
    public static final m4<IntercomColors> getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    @NotNull
    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM628getFallback0d7_KjU = baseColors.m628getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM628getFallback0d7_KjU, newColorScheme.m637getGray250d7_KjU(), newColorScheme.m637getGray250d7_KjU(), newColorScheme.m639getGray9000d7_KjU(), newColorScheme.m639getGray9000d7_KjU(), newColorScheme.m637getGray250d7_KjU(), newColorScheme.m639getGray9000d7_KjU(), newColorScheme.m637getGray250d7_KjU(), newColorScheme.m637getGray250d7_KjU(), baseColors.m622getBlack450d7_KjU(), baseColors.m626getBlack950d7_KjU(), baseColors.m620getBlack100d7_KjU(), newColorScheme.m638getGray8500d7_KjU(), q0.w(newColorScheme.m638getGray8500d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), baseColors.m620getBlack100d7_KjU(), q0.w(newColorScheme.m637getGray250d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), q0.w(newColorScheme.m638getGray8500d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), baseColors.m621getBlack200d7_KjU(), newColorScheme.m638getGray8500d7_KjU(), q0.w(newColorScheme.m638getGray8500d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), newColorScheme.m638getGray8500d7_KjU(), s0.d(4279176975L), newColorScheme.m638getGray8500d7_KjU(), baseColors.m620getBlack100d7_KjU(), baseColors.m620getBlack100d7_KjU(), q0.w(newColorScheme.m638getGray8500d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), baseColors.m625getBlack900d7_KjU(), baseColors.m622getBlack450d7_KjU(), newColorScheme.m637getGray250d7_KjU(), baseColors.m623getBlack700d7_KjU(), baseColors.m623getBlack700d7_KjU(), s0.d(4293256677L), s0.d(4281216558L), newColorScheme.m638getGray8500d7_KjU(), baseColors.m631getMuted0d7_KjU(), baseColors.m633getRed0d7_KjU(), baseColors.m632getOrange0d7_KjU(), baseColors.m627getBlue0d7_KjU(), baseColors.m629getGreen0d7_KjU(), baseColors.m635getYellow0d7_KjU(), baseColors.m630getGreenLighter200d7_KjU(), baseColors.m633getRed0d7_KjU(), false, null);
    }

    @NotNull
    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM628getFallback0d7_KjU = baseColors.m628getFallback0d7_KjU();
        long jM634getWhite0d7_KjU = baseColors.m634getWhite0d7_KjU();
        long jM619getBlack0d7_KjU = baseColors.m619getBlack0d7_KjU();
        long jM634getWhite0d7_KjU2 = baseColors.m634getWhite0d7_KjU();
        long jM634getWhite0d7_KjU3 = baseColors.m634getWhite0d7_KjU();
        long jM619getBlack0d7_KjU2 = baseColors.m619getBlack0d7_KjU();
        long jM634getWhite0d7_KjU4 = baseColors.m634getWhite0d7_KjU();
        long jM620getBlack100d7_KjU = baseColors.m620getBlack100d7_KjU();
        long jM619getBlack0d7_KjU3 = baseColors.m619getBlack0d7_KjU();
        long jM622getBlack450d7_KjU = baseColors.m622getBlack450d7_KjU();
        long jM621getBlack200d7_KjU = baseColors.m621getBlack200d7_KjU();
        long jM626getBlack950d7_KjU = baseColors.m626getBlack950d7_KjU();
        long jW = q0.w(baseColors.m619getBlack0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
        long jW2 = q0.w(baseColors.m619getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM626getBlack950d7_KjU2 = baseColors.m626getBlack950d7_KjU();
        long jW3 = q0.w(baseColors.m619getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        long jW4 = q0.w(baseColors.m619getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        long jD = s0.d(4292993505L);
        long jD2 = s0.d(4294375158L);
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM628getFallback0d7_KjU, jM634getWhite0d7_KjU, jM619getBlack0d7_KjU, jM634getWhite0d7_KjU2, jM634getWhite0d7_KjU3, jM619getBlack0d7_KjU2, jM634getWhite0d7_KjU4, jM620getBlack100d7_KjU, jM619getBlack0d7_KjU3, jM622getBlack450d7_KjU, jM621getBlack200d7_KjU, jM626getBlack950d7_KjU, jW, jW2, jM626getBlack950d7_KjU2, q0.w(baseColors.m620getBlack100d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), jW3, jW4, jD, jD2, newColorScheme.m636getGray1000d7_KjU(), s0.d(4279176975L), baseColors.m634getWhite0d7_KjU(), baseColors.m626getBlack950d7_KjU(), s0.d(4294440951L), q0.w(baseColors.m619getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), baseColors.m625getBlack900d7_KjU(), baseColors.m622getBlack450d7_KjU(), baseColors.m619getBlack0d7_KjU(), baseColors.m623getBlack700d7_KjU(), baseColors.m623getBlack700d7_KjU(), s0.d(4293256677L), baseColors.m634getWhite0d7_KjU(), newColorScheme.m636getGray1000d7_KjU(), baseColors.m631getMuted0d7_KjU(), baseColors.m633getRed0d7_KjU(), baseColors.m632getOrange0d7_KjU(), baseColors.m627getBlue0d7_KjU(), baseColors.m629getGreen0d7_KjU(), baseColors.m635getYellow0d7_KjU(), baseColors.m630getGreenLighter200d7_KjU(), baseColors.m633getRed0d7_KjU(), true, null);
    }

    public static final void setCurrentThemeMode(@NotNull n3<ThemeMode> n3Var) {
        Intrinsics.checkNotNullParameter(n3Var, "<set-?>");
        currentThemeMode = n3Var;
    }

    @NotNull
    public static final l6 toMaterialColors(@NotNull IntercomColors intercomColors) {
        Intrinsics.checkNotNullParameter(intercomColors, "<this>");
        if (intercomColors.isLight()) {
            return o6.x(intercomColors.m684getAction0d7_KjU(), intercomColors.m708getOnAction0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), 0L, 0L, intercomColors.m702getError0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -5234692, 65535, null);
        }
        return o6.m(intercomColors.m684getAction0d7_KjU(), intercomColors.m708getOnAction0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), intercomColors.m714getPrimaryText0d7_KjU(), intercomColors.m690getBackground0d7_KjU(), 0L, 0L, intercomColors.m702getError0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -5234692, 65535, null);
    }
}
