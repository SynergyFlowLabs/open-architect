package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.t1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.o;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nThemeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeUtils.kt\nio/intercom/android/sdk/utilities/ThemeUtils\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,215:1\n29#2:216\n85#3:217\n*S KotlinDebug\n*F\n+ 1 ThemeUtils.kt\nio/intercom/android/sdk/utilities/ThemeUtils\n*L\n207#1:216\n44#1:217\n*E\n"})
public final class ThemeUtils {
    public static final int $stable = 0;

    @NotNull
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ThemeUtils() {
    }

    @n
    @NotNull
    public static final String appendInterfaceStyleToUrl(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        String string = Uri.parse(url).buildUpon().appendQueryParameter("theme", isDarkMode$intercom_sdk_base_release(context) ? "dark" : "light").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @n
    public static final boolean isDarkMode$intercom_sdk_base_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        throw new k0();
    }

    private static final ThemeMode isDarkModeCompose$lambda$0(n3<ThemeMode> n3Var) {
        return n3Var.getValue();
    }

    @n
    @NotNull
    public static final String selectColorForTheme(@NotNull Context context, @NotNull String lightColor, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        return (!isDarkMode$intercom_sdk_base_release(context) || str == null || str.length() == 0) ? lightColor : str;
    }

    @n
    @Nullable
    public static final String selectHeaderBackgroundImageUrl$intercom_sdk_base_release(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return selectUrlForTheme(context, str, str2);
    }

    @j
    @n
    @Nullable
    public static final String selectHeaderLogoUrl$intercom_sdk_base_release(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null) ? str : str2;
    }

    @j
    @n
    @Nullable
    public static final String selectLauncherLogoUrl(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return selectLauncherLogoUrl$default(context, str, str2, null, 8, null);
    }

    public static /* synthetic */ String selectLauncherLogoUrl$default(Context context, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return selectLauncherLogoUrl(context, str, str2, str3);
    }

    @n
    @Nullable
    public static final String selectUrlForTheme(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) ? str : str2;
    }

    @o
    public final boolean isDarkModeCompose$intercom_sdk_base_release(@Nullable c0 c0Var, int i10) {
        boolean zA;
        c0Var.E(121228161);
        ThemeMode themeModeIsDarkModeCompose$lambda$0 = isDarkModeCompose$lambda$0(ThemeManager.INSTANCE.getThemeModeState());
        if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.DARK) {
            zA = true;
        } else if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.LIGHT) {
            zA = false;
        } else {
            if (themeModeIsDarkModeCompose$lambda$0 != ThemeMode.SYSTEM) {
                throw new k0();
            }
            zA = t1.a(c0Var, 0);
        }
        c0Var.A();
        return zA;
    }

    @o
    @NotNull
    public final String selectColorForThemeCompose$intercom_sdk_base_release(@NotNull String lightColor, @Nullable String str, @Nullable c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        c0Var.E(-1398327784);
        if (isDarkModeCompose$intercom_sdk_base_release(c0Var, (i10 >> 6) & 14) && str != null && str.length() != 0) {
            lightColor = str;
        }
        c0Var.A();
        return lightColor;
    }

    @o
    @Nullable
    public final String selectUrlForThemeCompose$intercom_sdk_base_release(@Nullable String str, @Nullable String str2, @Nullable c0 c0Var, int i10) {
        c0Var.E(1242850468);
        if (isDarkModeCompose$intercom_sdk_base_release(c0Var, (i10 >> 6) & 14) && str2 != null && str2.length() != 0) {
            str = str2;
        }
        c0Var.A();
        return str;
    }

    @j
    @n
    @Nullable
    public static final String selectLauncherLogoUrl(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isDarkMode$intercom_sdk_base_release(context) && str2 != null && str2.length() != 0) {
            return str2;
        }
        return (str == null || str.length() == 0) ? str3 : str;
    }
}
