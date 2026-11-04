package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nLoadingComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingComponent.kt\nio/intercom/android/sdk/survey/ui/components/LoadingComponentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n1282#2,6:83\n113#3:89\n66#4:90\n*S KotlinDebug\n*F\n+ 1 LoadingComponent.kt\nio/intercom/android/sdk/survey/ui/components/LoadingComponentKt\n*L\n32#1:83,6\n63#1:89\n63#1:90\n*E\n"})
public final class LoadingComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyLoading(@NotNull final SurveyState.Loading state, @Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(913588806);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var, 0.0f, 1, null);
            c0VarR.E(1496338436);
            boolean z10 = (i12 & 14) == 4;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoadingComponentKt.SurveyLoading$lambda$2$lambda$1(state, (Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.viewinterop.e.a((Function1) objI0, a0VarF, null, c0VarR, 0, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingComponentKt.SurveyLoading$lambda$3(state, a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.shimmer.e SurveyLoading$lambda$2$lambda$1(SurveyState.Loading state, Context context) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.shimmer.e eVarBuildLoadingContainer = buildLoadingContainer(context);
        eVarBuildLoadingContainer.addView(m468buildLoadingContentbw27NRU(context, state.getSurveyUiColors().m426getOnBackground0d7_KjU(), R.drawable.intercom_survey_loading_state));
        return eVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyLoading$lambda$3(SurveyState.Loading state, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        SurveyLoading(state, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final com.facebook.shimmer.e buildLoadingContainer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    @NotNull
    /* JADX INFO: renamed from: buildLoadingContent-bw27NRU, reason: not valid java name */
    public static final View m468buildLoadingContentbw27NRU(@NotNull Context context, long j10, @androidx.annotation.v int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int iR = (int) androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(20) * context.getResources().getDisplayMetrics().density);
        layoutParams.setMarginStart(iR);
        layoutParams.setMarginEnd(iR);
        layoutParams.topMargin = iR;
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable drawableG = androidx.core.content.res.i.g(context.getResources(), i10, null);
        if (drawableG != null) {
            androidx.core.graphics.drawable.c.n(drawableG, androidx.compose.ui.graphics.s0.t(j10));
            androidx.core.graphics.drawable.c.j(drawableG, true);
            imageView.setImageDrawable(drawableG);
        }
        return imageView;
    }
}
