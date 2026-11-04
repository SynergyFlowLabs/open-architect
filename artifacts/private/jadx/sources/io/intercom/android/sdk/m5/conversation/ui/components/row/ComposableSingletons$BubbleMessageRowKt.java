package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.q50;
import io.intercom.android.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$BubbleMessageRowKt {

    @NotNull
    public static final ComposableSingletons$BubbleMessageRowKt INSTANCE = new ComposableSingletons$BubbleMessageRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f142lambda1 = androidx.compose.runtime.internal.w.c(936282466, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                q50.t(u0.i.d(R.string.intercom_retry, c0Var, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f143lambda2 = androidx.compose.runtime.internal.w.c(608421069, false, ComposableSingletons$BubbleMessageRowKt$lambda2$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m280getLambda1$intercom_sdk_base_release() {
        return f142lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m281getLambda2$intercom_sdk_base_release() {
        return f143lambda2;
    }
}
