package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$HomeErrorContentKt {

    @NotNull
    public static final ComposableSingletons$HomeErrorContentKt INSTANCE = new ComposableSingletons$HomeErrorContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f202lambda1 = w.c(146373455, false, ComposableSingletons$HomeErrorContentKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f203lambda2 = w.c(-394516799, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeErrorContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                boolean z10 = false;
                HomeErrorContentKt.HomeErrorContent(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, c0Var, 0, 2);
            }
        }
    });

    static {
        int i10 = 6 >> 0;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m365getLambda1$intercom_sdk_base_release() {
        return f202lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m366getLambda2$intercom_sdk_base_release() {
        return f203lambda2;
    }
}
