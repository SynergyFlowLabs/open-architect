package io.intercom.android.sdk.m5;

import androidx.compose.foundation.t1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfigurableIntercomThemeKt {
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    @o
    @p(scheme = "[0[0]]")
    public static final void ConfigurableIntercomTheme(@NotNull final AppConfig appConfig, @NotNull final Function2<? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10) {
        boolean z10;
        CustomizationColorsModel actionContrastDark;
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(180143044);
        ConfigModules configModules = appConfig.getConfigModules();
        IntercomColors colors = null;
        CustomizationModel customization = configModules != null ? configModules.getCustomization() : null;
        c0VarR.E(-1126606345);
        if (customization != null) {
            ThemeMode currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode();
            c0VarR.E(-1126607475);
            if (currentThemeMode != ThemeMode.DARK) {
                if (currentThemeMode != ThemeMode.LIGHT) {
                    if (currentThemeMode != ThemeMode.SYSTEM) {
                        throw new k0();
                    }
                    if (t1.a(c0VarR, 0)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                z10 = false;
            }
            c0VarR.A();
            ThemeUtils themeUtils = ThemeUtils.INSTANCE;
            long composeColor$default = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getBackgroundColor(), customization.getAction().getBackgroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null);
            long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getForegroundColor(), customization.getAction().getForegroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null);
            if (z10 || (actionContrastDark = customization.getActionContrastDark()) == null) {
                actionContrastDark = customization.getActionContrastWhite();
            }
            c0VarR.E(-1126577992);
            q0 q0VarN = actionContrastDark == null ? null : q0.n(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getBackgroundColor(), actionContrastDark.getBackgroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null));
            c0VarR.A();
            long jM = q0VarN != null ? q0VarN.M() : composeColor$default;
            c0VarR.E(-1126568904);
            q0 q0VarN2 = actionContrastDark == null ? null : q0.n(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getForegroundColor(), actionContrastDark.getForegroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null));
            c0VarR.A();
            colors = IntercomColorsKt.m726getIntercomColorshIzCY_Q(composeColor$default, composeColor$default2, jM, q0VarN2 != null ? q0VarN2.M() : composeColor$default2, ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getHeader().getBackgroundColor(), customization.getHeader().getBackgroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getHeader().getForegroundColor(), customization.getHeader().getForegroundColorDark(), c0VarR, a5.S0), 0.0f, 1, null), z10, (128 & 128) != 0 ? null : null);
        }
        c0VarR.A();
        c0VarR.E(-1126607561);
        if (colors == null) {
            colors = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable);
        }
        c0VarR.A();
        IntercomThemeKt.IntercomTheme(colors, null, null, content, c0VarR, (i10 << 6) & 7168, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfigurableIntercomThemeKt.ConfigurableIntercomTheme$lambda$3(appConfig, content, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigurableIntercomTheme$lambda$3(AppConfig appConfig, Function2 content, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(appConfig, "$appConfig");
        Intrinsics.checkNotNullParameter(content, "$content");
        ConfigurableIntercomTheme(appConfig, content, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
