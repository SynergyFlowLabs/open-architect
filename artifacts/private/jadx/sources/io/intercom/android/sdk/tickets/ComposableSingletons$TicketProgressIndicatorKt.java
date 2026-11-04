package io.intercom.android.sdk.tickets;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketProgressIndicatorKt {

    @NotNull
    public static final ComposableSingletons$TicketProgressIndicatorKt INSTANCE = new ComposableSingletons$TicketProgressIndicatorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f310lambda1 = androidx.compose.runtime.internal.w.c(1410192629, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressIndicatorKt$lambda-1$1
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
                TicketProgressIndicatorKt.m542TicketProgressIndicator3IgeMak(TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().getProgressSections(), TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().m547getProgressColor0d7_KjU(), null, c0Var, 8, 4);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m536getLambda1$intercom_sdk_base_release() {
        return f310lambda1;
    }
}
