package io.intercom.android.sdk.ui.theme;

import android.view.View;
import androidx.compose.foundation.t1;
import androidx.compose.material3.ax;
import androidx.compose.material3.c7;
import androidx.compose.material3.vj;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.planner5d.library.engine.input.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomTheme.kt\nio/intercom/android/sdk/ui/theme/IntercomThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,61:1\n75#2:62\n*S KotlinDebug\n*F\n+ 1 IntercomTheme.kt\nio/intercom/android/sdk/ui/theme/IntercomThemeKt\n*L\n46#1:62\n*E\n"})
public final class IntercomThemeKt {

    @NotNull
    private static final m4<ax> LocalShapes = a1.m(new Function0() { // from class: io.intercom.android.sdk.ui.theme.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomThemeKt.LocalShapes$lambda$1();
        }
    });

    @o
    @p(scheme = "[0[0]]")
    public static final void IntercomTheme(@Nullable IntercomColors intercomColors, @Nullable final IntercomTypography intercomTypography, @Nullable final ax axVar, @NotNull final Function2<? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        final IntercomColors intercomColorsIntercomDarkColors;
        ThemeMode currentThemeMode;
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(163228735);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(intercomColors) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & f.b.B) == 0) {
            i12 |= ((i11 & 2) == 0 && c0VarR.D(intercomTypography)) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.D(axVar)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.k0(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if (i13 != 0) {
                    intercomColors = null;
                }
                if ((i11 & 2) != 0) {
                    intercomTypography = IntercomTheme.INSTANCE.getTypography(c0VarR, 6);
                }
                if ((i11 & 4) != 0) {
                    axVar = IntercomTheme.INSTANCE.getShapes(c0VarR, 6);
                }
            } else {
                c0VarR.u();
            }
            c0VarR.Z();
            c0VarR.E(-541037209);
            if (intercomColors != null) {
                intercomColorsIntercomDarkColors = intercomColors;
            } else if (isDarkThemeInEditMode(c0VarR, 0) || (currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode()) == ThemeMode.DARK) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomDarkColors();
            } else if (currentThemeMode == ThemeMode.LIGHT) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomLightColors();
            } else {
                if (currentThemeMode != ThemeMode.SYSTEM) {
                    throw new k0();
                }
                intercomColorsIntercomDarkColors = t1.a(c0VarR, 0) ? IntercomColorsKt.intercomDarkColors() : IntercomColorsKt.intercomLightColors();
            }
            c0VarR.A();
            a1.f(new n4[]{IntercomColorsKt.getLocalIntercomColors().f(intercomColorsIntercomDarkColors), IntercomTypographyKt.getLocalIntercomTypography().f(intercomTypography), c7.a().f(q0.n(intercomColorsIntercomDarkColors.m714getPrimaryText0d7_KjU()))}, w.e(1689661311, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt.IntercomTheme.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @o
                public final void invoke(c0 c0Var2, int i14) {
                    if ((i14 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    vj.j(IntercomColorsKt.toMaterialColors(intercomColorsIntercomDarkColors), axVar, IntercomTypographyKt.toMaterialTypography(intercomTypography), content, c0Var2, 0, 0);
                }
            }, c0VarR, 54), c0VarR, n4.f36267i | 48);
        }
        final IntercomColors intercomColors2 = intercomColors;
        final IntercomTypography intercomTypography2 = intercomTypography;
        final ax axVar2 = axVar;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.theme.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomThemeKt.IntercomTheme$lambda$0(intercomColors2, intercomTypography2, axVar2, content, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTheme$lambda$0(IntercomColors intercomColors, IntercomTypography intercomTypography, ax axVar, Function2 content, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomTheme(intercomColors, intercomTypography, axVar, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ax LocalShapes$lambda$1() {
        return new ax(null, null, null, null, null, 31, null);
    }

    @NotNull
    public static final m4<ax> getLocalShapes() {
        return LocalShapes;
    }

    @o
    private static final boolean isDarkThemeInEditMode(c0 c0Var, int i10) {
        c0Var.E(-320047698);
        boolean z10 = false;
        if (t1.a(c0Var, 0) && ((View) c0Var.W(AndroidCompositionLocals_androidKt.m())).isInEditMode()) {
            z10 = true;
        }
        c0Var.A();
        return z10;
    }
}
