package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.i6;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    ComposableSingletons$RecentTicketsCardKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
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
            return;
        }
        androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
        Ticket.Status status = new Ticket.Status("Waiting on you", "waiting_on_customer", null, false, 0L, 28, null);
        Boolean bool = Boolean.FALSE;
        Ticket ticket = new Ticket("1", "1200", "This is a ticket title", null, null, null, status, null, null, 0, null, null, null, bool, 0L, 24504, null);
        Ticket.Status status2 = new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null);
        Boolean bool2 = Boolean.TRUE;
        RecentTicketsCardKt.RecentTicketsCard(a0VarH, "Recent tickets", CollectionsKt.listOf((Object[]) new Ticket[]{ticket, new Ticket("2", "1201", "Bug", null, null, null, status2, null, null, 0, null, null, null, bool2, 0L, 24504, null), new Ticket(androidx.exifinterface.media.a.f51345a5, "1202", "Feature Request", null, null, null, new Ticket.Status("In progress", "in_progress", null, false, 0L, 28, null), null, null, 0, null, null, null, bool2, 0L, 24504, null), new Ticket("4", "1204", "Unresolvable", null, null, null, new Ticket.Status("Resolved", "resolved", null, false, 0L, 28, null), null, null, 0, null, null, null, bool, 0L, 24504, null)}), new Function1() { // from class: io.intercom.android.sdk.tickets.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$RecentTicketsCardKt$lambda1$1.invoke$lambda$0((String) obj);
            }
        }, c0Var, 3638, 0);
    }
}
