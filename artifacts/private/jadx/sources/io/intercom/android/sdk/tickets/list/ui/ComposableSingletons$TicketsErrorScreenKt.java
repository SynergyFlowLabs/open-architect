package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketsErrorScreenKt {

    @NotNull
    public static final ComposableSingletons$TicketsErrorScreenKt INSTANCE = new ComposableSingletons$TicketsErrorScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f326lambda1 = w.c(268742023, false, ComposableSingletons$TicketsErrorScreenKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f327lambda2 = w.c(101741039, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsErrorScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                int i11 = 2 ^ 0;
                TicketsErrorScreenKt.TicketsErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, c0Var, 0, 2);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m559getLambda1$intercom_sdk_base_release() {
        return f326lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m560getLambda2$intercom_sdk_base_release() {
        return f327lambda2;
    }
}
