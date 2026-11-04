package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.i6;
import androidx.compose.ui.graphics.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$PulsatingBoxKt {

    @NotNull
    public static final ComposableSingletons$PulsatingBoxKt INSTANCE = new ComposableSingletons$PulsatingBoxKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit> f344lambda1 = androidx.compose.runtime.internal.w.c(-188171614, false, new pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.c0 c0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
            invoke(c0Var, c0Var2, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.c0 PulsatingBox, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(PulsatingBox, "$this$PulsatingBox");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(100)), q0.f38131b.w(), null, 2, null), c0Var, 6);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f345lambda2 = androidx.compose.runtime.internal.w.c(-579145229, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-2$1
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
                PulsatingBoxKt.m612PulsatingBoxFU0evQE(null, 1.5f, 0L, null, true, ComposableSingletons$PulsatingBoxKt.INSTANCE.m586getLambda1$intercom_sdk_ui_release(), c0Var, 221232, 13);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.layout.c0, androidx.compose.runtime.c0, Integer, Unit> m586getLambda1$intercom_sdk_ui_release() {
        return f344lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m587getLambda2$intercom_sdk_ui_release() {
        return f345lambda2;
    }
}
