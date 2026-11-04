package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.d5;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$GifGridKt {

    @NotNull
    public static final ComposableSingletons$GifGridKt INSTANCE = new ComposableSingletons$GifGridKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f124lambda1 = androidx.compose.runtime.internal.w.c(885449481, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0 a0VarT = d5.t(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8), 0.0f, 2, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            q50.t(u0.i.d(R.string.intercom_search_gif, c0Var, 0), a0VarT, intercomTheme.getColors(c0Var, i11).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, 48, 0, 131064);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f125lambda2 = androidx.compose.runtime.internal.w.c(-2034998788, false, ComposableSingletons$GifGridKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f126lambda3 = androidx.compose.runtime.internal.w.c(570929079, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$GifGridKt.INSTANCE.m245getLambda2$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m244getLambda1$intercom_sdk_base_release() {
        return f124lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m245getLambda2$intercom_sdk_base_release() {
        return f125lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m246getLambda3$intercom_sdk_base_release() {
        return f126lambda3;
    }
}
