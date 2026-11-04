package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.q50;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$UploadSizeLimitDialogKt {

    @NotNull
    public static final ComposableSingletons$UploadSizeLimitDialogKt INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f112lambda1 = androidx.compose.runtime.internal.w.c(133212014, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            String strD = u0.i.d(R.string.intercom_ok, c0Var, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            q50.t(strD, null, intercomTheme.getColors(c0Var, i11).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04SemiBold(), c0Var, 0, 0, 131066);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f113lambda2 = androidx.compose.runtime.internal.w.c(1891807555, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-2$1
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
                UploadSizeLimitDialogKt.UploadSizeLimitDialog("Couldn't send", "Can't send files over 100MB", null, c0Var, 54, 4);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m225getLambda1$intercom_sdk_base_release() {
        return f112lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m226getLambda2$intercom_sdk_base_release() {
        return f113lambda2;
    }
}
