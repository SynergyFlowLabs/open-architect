package io.intercom.android.sdk.m5.helpcenter.ui.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$HelpCenterTopBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$HelpCenterTopBarKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$HelpCenterTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$HelpCenterTopBarKt$lambda1$1();

    ComposableSingletons$HelpCenterTopBarKt$lambda1$1() {
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
            return;
        }
        HelpCenterTopBarKt.HelpCenterTopBar(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, 0, null, c0Var, 54, 12);
    }
}
