package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterLoadingScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterLoadingScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n1282#2,6:60\n*S KotlinDebug\n*F\n+ 1 HelpCenterLoadingScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterLoadingScreenKt\n*L\n24#1:60,6\n*E\n"})
public final class HelpCenterLoadingScreenKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterLoadingScreen(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(581033983);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            final long jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var, 0.0f, 1, null);
            c0VarR.E(1093772715);
            boolean zL = c0VarR.L(jM714getPrimaryText0d7_KjU);
            Object objI0 = c0VarR.i0();
            if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$2$lambda$1(jM714getPrimaryText0d7_KjU, (Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.viewinterop.e.a((Function1) objI0, a0VarF, null, c0VarR, 0, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$3(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.shimmer.e HelpCenterLoadingScreen$lambda$2$lambda$1(long j10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.shimmer.e eVarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        eVarBuildLoadingContainer.addView(LoadingComponentKt.m468buildLoadingContentbw27NRU(context, j10, R.drawable.intercom_help_center_loading_state));
        return eVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterLoadingScreen$lambda$3(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        HelpCenterLoadingScreen(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeLoadingContentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-192893266);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m337getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterLoadingScreenKt.HomeLoadingContentPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLoadingContentPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HomeLoadingContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
