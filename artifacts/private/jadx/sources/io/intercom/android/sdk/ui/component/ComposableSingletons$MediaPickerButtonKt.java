package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.q50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$MediaPickerButtonKt {

    @NotNull
    public static final ComposableSingletons$MediaPickerButtonKt INSTANCE = new ComposableSingletons$MediaPickerButtonKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f340lambda1 = androidx.compose.runtime.internal.w.c(1720634073, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-1$1
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
                q50.t("Open Picker", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 6, 0, 262142);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f341lambda2 = androidx.compose.runtime.internal.w.c(-55957783, false, ComposableSingletons$MediaPickerButtonKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f342lambda3 = androidx.compose.runtime.internal.w.c(1358094075, false, ComposableSingletons$MediaPickerButtonKt$lambda3$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m582getLambda1$intercom_sdk_ui_release() {
        return f340lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m583getLambda2$intercom_sdk_ui_release() {
        return f341lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m584getLambda3$intercom_sdk_ui_release() {
        return f342lambda3;
    }
}
