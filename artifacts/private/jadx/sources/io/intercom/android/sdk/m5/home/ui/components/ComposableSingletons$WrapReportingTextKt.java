package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.c0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$WrapReportingTextKt {

    @NotNull
    public static final ComposableSingletons$WrapReportingTextKt INSTANCE = new ComposableSingletons$WrapReportingTextKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f213lambda1 = androidx.compose.runtime.internal.w.c(136624489, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$WrapReportingTextKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                WrapReportingTextKt.m377WrapReportingTextT042LqI(null, "Hello there", q0.f38131b.y(), IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType01(), null, c0Var, 432, 17);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m376getLambda1$intercom_sdk_base_release() {
        return f213lambda1;
    }
}
