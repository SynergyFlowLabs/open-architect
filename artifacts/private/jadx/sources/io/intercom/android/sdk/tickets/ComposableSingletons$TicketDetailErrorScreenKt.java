package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketDetailErrorScreenKt {

    @NotNull
    public static final ComposableSingletons$TicketDetailErrorScreenKt INSTANCE = new ComposableSingletons$TicketDetailErrorScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f305lambda1 = androidx.compose.runtime.internal.w.c(694314567, false, ComposableSingletons$TicketDetailErrorScreenKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f306lambda2 = androidx.compose.runtime.internal.w.c(1954525355, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailErrorScreenKt$lambda-2$1
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
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, c0Var, 0, 2);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m531getLambda1$intercom_sdk_base_release() {
        return f305lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m532getLambda2$intercom_sdk_base_release() {
        return f306lambda2;
    }
}
