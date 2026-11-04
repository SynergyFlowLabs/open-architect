package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.b1;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.ui.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/ComposableSingletons$IntercomButtonKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n113#2:129\n*S KotlinDebug\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/ComposableSingletons$IntercomButtonKt$lambda-3$1\n*L\n123#1:129\n*E\n"})
final class ComposableSingletons$IntercomButtonKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$IntercomButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda3$1();

    ComposableSingletons$IntercomButtonKt$lambda3$1() {
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
        int i11 = R.drawable.intercom_send;
        IntercomButton intercomButton = IntercomButton.INSTANCE;
        q0.a aVar = q0.f38131b;
        IntercomButtonKt.IntercomButton(null, intercomButton.m588outlinedStyleKlgxPg(aVar.w(), aVar.a(), b1.a(androidx.compose.ui.unit.h.r(1), aVar.i()), c0Var, 3510, 0), "Button", Integer.valueOf(i11), new Function0() { // from class: io.intercom.android.sdk.ui.component.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 24960, 1);
    }
}
