package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.u10;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketStatusRowKt {

    @NotNull
    public static final ComposableSingletons$TicketStatusRowKt INSTANCE = new ComposableSingletons$TicketStatusRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f168lambda1 = androidx.compose.runtime.internal.w.c(-2091038600, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TicketStatusRowKt$lambda-1$1
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
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(12));
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, androidx.compose.ui.e.f37317a.u(), c0Var, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            TicketStatusRowKt.TicketStatusRow(MetricTracker.Action.SUBMITTED, "Submitted", "Just now", null, null, null, c0Var, 438, 56);
            TicketStatusRowKt.TicketStatusRow("in_progress", "In progress", "Just now", null, null, null, c0Var, 438, 56);
            TicketStatusRowKt.TicketStatusRow("waiting_on_customer", "Waiting on you", "Just now", null, null, null, c0Var, 438, 56);
            TicketStatusRowKt.TicketStatusRow("resolved", "Resolved", "Just now", null, null, null, c0Var, 438, 56);
            TicketStatusRowKt.TicketStatusRow("resolved", "Resolved", "Just now", null, "This is custom resolved state", "This is custom state prefix", c0Var, 221622, 8);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f169lambda2 = androidx.compose.runtime.internal.w.c(-1760291981, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TicketStatusRowKt$lambda-2$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketStatusRowKt.INSTANCE.m306getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m306getLambda1$intercom_sdk_base_release() {
        return f168lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m307getLambda2$intercom_sdk_base_release() {
        return f169lambda2;
    }
}
