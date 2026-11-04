package io.intercom.android.sdk.ui.component;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    ComposableSingletons$MediaPickerButtonKt$lambda3$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
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
            MediaPickerButtonKt.MediaPickerButton(1, null, null, null, new Function1() { // from class: io.intercom.android.sdk.ui.component.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$MediaPickerButtonKt$lambda3$1.invoke$lambda$0((List) obj);
                }
            }, new MediaPickerButtonCTAStyle.TextButton("Open Picker"), null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m583getLambda2$intercom_sdk_ui_release(), c0Var, 12607494, 78);
        }
    }
}
