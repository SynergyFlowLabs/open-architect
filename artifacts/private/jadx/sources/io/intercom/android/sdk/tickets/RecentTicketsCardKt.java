package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.HomeCardScaffoldKt;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class RecentTicketsCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.RecentTicketsCardKt$RecentTicketsCard$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nRecentTicketsCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentTicketsCard.kt\nio/intercom/android/sdk/tickets/RecentTicketsCardKt$RecentTicketsCard$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n1863#2:82\n1864#2:84\n113#3:83\n*S KotlinDebug\n*F\n+ 1 RecentTicketsCard.kt\nio/intercom/android/sdk/tickets/RecentTicketsCardKt$RecentTicketsCard$2\n*L\n27#1:82\n27#1:84\n32#1:83\n*E\n"})
    static final class AnonymousClass2 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onClick;
        final /* synthetic */ List<Ticket> $tickets;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<Ticket> list, Function1<? super String, Unit> function1) {
            this.$tickets = list;
            this.$onClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Ticket it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            function1.invoke(it.getId());
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
            List<Ticket> list = this.$tickets;
            final Function1<String, Unit> function1 = this.$onClick;
            for (final Ticket ticket : list) {
                androidx.compose.ui.a0 a0VarJ = i1.j(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.tickets.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecentTicketsCardKt.AnonymousClass2.invoke$lambda$1$lambda$0(function1, ticket);
                    }
                }, 15, null);
                g5 g5VarG = d5.g(androidx.compose.ui.unit.h.r(20), androidx.compose.ui.unit.h.r(8));
                TicketRowData ticketRowDataReduceTicketRowData = TicketRowReducerKt.reduceTicketRowData(ticket);
                Boolean boolIsRead = ticket.isRead();
                TicketRowKt.TicketRow(a0VarJ, ticketRowDataReduceTicketRowData, g5VarG, (boolIsRead == null || boolIsRead.booleanValue()) ? false : true, c0Var, 0, 0);
            }
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void RecentTicketsCard(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String cardTitle, @NotNull final List<Ticket> tickets, @Nullable Function1<? super String, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1214351394);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function1<? super String, Unit> function2 = (i11 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecentTicketsCardKt.RecentTicketsCard$lambda$0((String) obj);
            }
        } : function1;
        HomeCardScaffoldKt.HomeCardScaffold(a0Var2, cardTitle, androidx.compose.runtime.internal.w.e(1499488214, true, new AnonymousClass2(tickets, function2), c0VarR, 54), c0VarR, (i10 & 14) | a5.S0 | (i10 & com.planner5d.library.engine.input.f.b.B), 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function1<? super String, Unit> function3 = function2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecentTicketsCardKt.RecentTicketsCard$lambda$1(a0Var2, cardTitle, tickets, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCard$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCard$lambda$1(androidx.compose.ui.a0 a0Var, String cardTitle, List tickets, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(cardTitle, "$cardTitle");
        Intrinsics.checkNotNullParameter(tickets, "$tickets");
        RecentTicketsCard(a0Var, cardTitle, tickets, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void RecentTicketsCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1547026625);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$RecentTicketsCardKt.INSTANCE.m526getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecentTicketsCardKt.RecentTicketsCardPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCardPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        RecentTicketsCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
