package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.ei;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-8$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$TopActionBarKt$lambda8$1 implements pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$TopActionBarKt$lambda8$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda8$1();

    ComposableSingletons$TopActionBarKt$lambda8$1() {
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(x5Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(x5 TopActionBar, androidx.compose.runtime.c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
        if ((i10 & 81) == 16 && c0Var.d()) {
            c0Var.u();
        } else {
            ei.D(new Function0() { // from class: io.intercom.android.sdk.m5.components.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, null, false, null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m167getLambda7$intercom_sdk_base_release(), c0Var, 1572870, 62);
        }
    }
}
