package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketRowKt {

    @NotNull
    public static final ComposableSingletons$TicketRowKt INSTANCE = new ComposableSingletons$TicketRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f322lambda1 = w.c(1406853974, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-1$1
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
                return;
            }
            a0.a aVar = a0.E;
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            c0Var.E(-1850249373);
            Iterator it = CollectionsKt.listOf((Object[]) new TicketRowData[]{new TicketRowData("123", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "#123 • Waiting on you", TicketStatus.WaitingOnCustomer, true), new TicketRowData("321", "Bug", "#123456789012345678901234567890 • Submitted", TicketStatus.Submitted, true), new TicketRowData("456", "Address change", "In progress", TicketStatus.InProgress, false), new TicketRowData("654", "Can’t download from dashboard request ", "Resolved", TicketStatus.Resolved, true)}).iterator();
            while (it.hasNext()) {
                int i11 = 3 & 0;
                c0 c0Var2 = c0Var;
                TicketRowKt.TicketRow(null, (TicketRowData) it.next(), null, false, c0Var2, 0, 13);
                int i12 = 1 ^ 6;
                IntercomDividerKt.IntercomDivider(d5.t(a0.E, androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), c0Var2, 6, 0);
                c0Var = c0Var2;
            }
            c0 c0Var3 = c0Var;
            c0Var3.A();
            c0Var3.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f323lambda2 = w.c(488165755, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-2$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketRowKt.INSTANCE.m555getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m555getLambda1$intercom_sdk_base_release() {
        return f322lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m556getLambda2$intercom_sdk_base_release() {
        return f323lambda2;
    }
}
