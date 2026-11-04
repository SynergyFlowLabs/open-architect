package io.intercom.android.sdk.ui.component;

import androidx.compose.material3.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$MediaPickerButtonKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda2$1();

    ComposableSingletons$MediaPickerButtonKt$lambda2$1() {
    }

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
            a4.g(new Function0() { // from class: io.intercom.android.sdk.ui.component.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, null, false, null, null, null, null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m582getLambda1$intercom_sdk_ui_release(), c0Var, 805306374, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
        }
    }
}
