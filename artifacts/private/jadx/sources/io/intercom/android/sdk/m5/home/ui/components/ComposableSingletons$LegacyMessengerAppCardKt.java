package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.material3.os;
import androidx.compose.runtime.c0;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$LegacyMessengerAppCardKt {

    @NotNull
    public static final ComposableSingletons$LegacyMessengerAppCardKt INSTANCE = new ComposableSingletons$LegacyMessengerAppCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f206lambda1 = androidx.compose.runtime.internal.w.c(1287468866, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-1$1
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
                os.F(null, 0L, 0.0f, 0L, 0, 0.0f, c0Var, 0, 63);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f207lambda2 = androidx.compose.runtime.internal.w.c(1051195672, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-2$1
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
                boolean z10 = true & false;
                IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m369getLambda1$intercom_sdk_base_release(), c0Var, 3072, 7);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m369getLambda1$intercom_sdk_base_release() {
        return f206lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m370getLambda2$intercom_sdk_base_release() {
        return f207lambda2;
    }
}
