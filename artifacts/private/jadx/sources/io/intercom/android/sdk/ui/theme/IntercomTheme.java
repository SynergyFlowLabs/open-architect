package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.ax;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.o;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nIntercomTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomTheme.kt\nio/intercom/android/sdk/ui/theme/IntercomTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,61:1\n75#2:62\n75#2:63\n75#2:64\n*S KotlinDebug\n*F\n+ 1 IntercomTheme.kt\nio/intercom/android/sdk/ui/theme/IntercomTheme\n*L\n51#1:62\n54#1:63\n57#1:64\n*E\n"})
public final class IntercomTheme {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomTheme INSTANCE = new IntercomTheme();

    private IntercomTheme() {
    }

    @o
    @i(name = "getColors")
    @NotNull
    public final IntercomColors getColors(@Nullable c0 c0Var, int i10) {
        c0Var.E(159743073);
        IntercomColors intercomColors = (IntercomColors) c0Var.W(IntercomColorsKt.getLocalIntercomColors());
        c0Var.A();
        return intercomColors;
    }

    @o
    @i(name = "getShapes")
    @NotNull
    public final ax getShapes(@Nullable c0 c0Var, int i10) {
        c0Var.E(-474718694);
        ax axVar = (ax) c0Var.W(IntercomThemeKt.getLocalShapes());
        c0Var.A();
        return axVar;
    }

    @o
    @i(name = "getTypography")
    @NotNull
    public final IntercomTypography getTypography(@Nullable c0 c0Var, int i10) {
        c0Var.E(-989585502);
        IntercomTypography intercomTypography = (IntercomTypography) c0Var.W(IntercomTypographyKt.getLocalIntercomTypography());
        c0Var.A();
        return intercomTypography;
    }
}
