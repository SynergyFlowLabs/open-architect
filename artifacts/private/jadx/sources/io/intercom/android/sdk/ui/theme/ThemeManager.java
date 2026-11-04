package io.intercom.android.sdk.ui.theme;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ThemeManager {

    @Nullable
    private static ThemeMode sessionOverride;

    @NotNull
    public static final ThemeManager INSTANCE = new ThemeManager();

    @NotNull
    private static ThemeMode serverTheme = ThemeMode.LIGHT;
    public static final int $stable = 8;

    private ThemeManager() {
    }

    private final void updateCurrentTheme() {
        IntercomColorsKt.getCurrentThemeMode().setValue(getCurrentThemeMode());
    }

    public final void clearSessionOverride() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    @NotNull
    public final ThemeMode getCurrentThemeMode() {
        ThemeMode themeMode = sessionOverride;
        return themeMode == null ? serverTheme : themeMode;
    }

    @NotNull
    public final n3<ThemeMode> getThemeModeState() {
        return IntercomColorsKt.getCurrentThemeMode();
    }

    public final void initialize() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final void setSessionOverride(@NotNull ThemeMode themeMode) {
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        sessionOverride = themeMode;
        updateCurrentTheme();
    }

    public final void setThemeModeForTesting(@NotNull ThemeMode themeMode) {
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        setSessionOverride(themeMode);
    }

    public final void updateServerTheme(@NotNull ThemeMode themeMode) {
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        serverTheme = themeMode;
        updateCurrentTheme();
    }
}
