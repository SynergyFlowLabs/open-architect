package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
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
@SourceDebugExtension({"SMAP\nLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingScreen.kt\nio/intercom/android/sdk/m5/components/LoadingScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,44:1\n1282#2,6:45\n*S KotlinDebug\n*F\n+ 1 LoadingScreen.kt\nio/intercom/android/sdk/m5/components/LoadingScreenKt\n*L\n23#1:45,6\n*E\n"})
public final class LoadingScreenKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LoadingScreen(@Nullable final androidx.compose.ui.a0 a0Var, @androidx.annotation.v final int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1767045234);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i14 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            final long jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
            boolean z10 = true;
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var, 0.0f, 1, null);
            c0VarR.E(1035114321);
            boolean zL = c0VarR.L(jM714getPrimaryText0d7_KjU);
            if ((i13 & com.planner5d.library.engine.input.f.b.B) != 32) {
                z10 = false;
            }
            boolean z11 = zL | z10;
            Object objI0 = c0VarR.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.l2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoadingScreenKt.LoadingScreen$lambda$2$lambda$1(jM714getPrimaryText0d7_KjU, i10, (Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.viewinterop.e.a((Function1) objI0, a0VarF, null, c0VarR, 0, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.m2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenKt.LoadingScreen$lambda$3(a0Var, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.shimmer.e LoadingScreen$lambda$2$lambda$1(long j10, int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.shimmer.e eVarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        eVarBuildLoadingContainer.addView(LoadingComponentKt.m468buildLoadingContentbw27NRU(context, j10, i10));
        return eVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreen$lambda$3(androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        LoadingScreen(a0Var, i10, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LoadingScreenPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1596356708);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.m147getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.k2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenKt.LoadingScreenPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreenPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        LoadingScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
