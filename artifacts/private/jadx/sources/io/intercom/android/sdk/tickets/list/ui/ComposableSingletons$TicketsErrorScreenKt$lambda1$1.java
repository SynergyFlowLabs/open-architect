package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsErrorScreenKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$TicketsErrorScreenKt$lambda1$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$TicketsErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketsErrorScreenKt$lambda1$1();

    ComposableSingletons$TicketsErrorScreenKt$lambda1$1() {
    }

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
            int i11 = 0 >> 0;
            TicketsErrorScreenKt.TicketsErrorScreen(new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.list.ui.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, 15, null), null, c0Var, 0, 2);
        }
    }
}
