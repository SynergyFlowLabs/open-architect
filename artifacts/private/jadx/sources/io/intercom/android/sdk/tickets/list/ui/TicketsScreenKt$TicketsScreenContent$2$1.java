package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.t;
import androidx.compose.ui.a0;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketsScreen.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenKt$TicketsScreenContent$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,147:1\n1282#2,6:148\n113#3:154\n*S KotlinDebug\n*F\n+ 1 TicketsScreen.kt\nio/intercom/android/sdk/tickets/list/ui/TicketsScreenKt$TicketsScreenContent$2$1\n*L\n98#1:148,6\n101#1:154\n*E\n"})
final class TicketsScreenKt$TicketsScreenContent$2$1 implements pj.o<androidx.compose.foundation.lazy.i, Integer, c0, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    TicketsScreenKt$TicketsScreenContent$2$1(TicketsScreenUiState.Content content, Function1<? super String, Unit> function1) {
        this.$uiState = content;
        this.$onClick = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, TicketRowData data) {
        Intrinsics.checkNotNullParameter(data, "$data");
        function1.invoke(data.getId());
        return Unit.f312394a;
    }

    @Override // pj.o
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, c0 c0Var, Integer num2) {
        invoke(iVar, num.intValue(), c0Var, num2.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.foundation.lazy.i items, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0Var.K(i10) ? 32 : 16;
        }
        if ((i11 & 721) == 144 && c0Var.d()) {
            c0Var.u();
            return;
        }
        final TicketRowData ticketRowDataF = this.$uiState.getLazyPagingTickets().f(i10);
        if (ticketRowDataF == null) {
            return;
        }
        final Function1<String, Unit> function1 = this.$onClick;
        a0.a aVar = a0.E;
        c0Var.E(122186268);
        boolean zD = c0Var.D(function1) | c0Var.D(ticketRowDataF);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new Function0() { // from class: io.intercom.android.sdk.tickets.list.ui.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketsScreenKt$TicketsScreenContent$2$1.invoke$lambda$2$lambda$1$lambda$0(function1, ticketRowDataF);
                }
            };
            c0Var.Y(objI0);
        }
        c0Var.A();
        TicketRowKt.TicketRow(i1.j(aVar, false, null, null, null, (Function0) objI0, 15, null), ticketRowDataF, null, false, c0Var, 0, 12);
        IntercomDividerKt.IntercomDivider(d5.t(aVar, androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), c0Var, 6, 0);
    }
}
