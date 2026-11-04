package io.intercom.android.sdk.ui.component;

import io.intercom.android.sdk.ui.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$PermissionDeniedDialogKt {

    @NotNull
    public static final ComposableSingletons$PermissionDeniedDialogKt INSTANCE = new ComposableSingletons$PermissionDeniedDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f343lambda1 = androidx.compose.runtime.internal.w.c(-593234401, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PermissionDeniedDialogKt$lambda-1$1
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
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, "Audio permission is required to use voice input. Please enable it in the app settings.", "Settings", "Not now", Integer.valueOf(R.drawable.intercom_ic_microphone), null, null, c0Var, 3504, 97);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m585getLambda1$intercom_sdk_ui_release() {
        return f343lambda1;
    }
}
