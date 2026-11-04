package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomPrimaryButtonKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1();

    ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1() {
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
            IntercomPrimaryButtonKt.IntercomPrimaryButton("Button", null, Integer.valueOf(R.drawable.intercom_send_message_icon), new Function0() { // from class: io.intercom.android.sdk.m5.components.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, c0Var, 3078, 2);
        }
    }
}
