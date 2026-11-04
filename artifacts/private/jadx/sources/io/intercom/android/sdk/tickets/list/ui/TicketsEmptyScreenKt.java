package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketsEmptyScreenKt {
    @androidx.compose.runtime.o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyScreenPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1850741992);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m558getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsEmptyScreenKt.EmptyScreenPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenPreview$lambda$1(int i10, c0 c0Var, int i11) {
        EmptyScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsEmptyScreen(@NotNull final EmptyState emptyState, @Nullable final a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        c0 c0VarR = c0Var.R(1360358580);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(emptyState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0 a0Var2 = a0Var;
            EmptyStateKt.EmptyState(emptyState.getTitle(), a0Var2, emptyState.getText(), Integer.valueOf(R.drawable.intercom_ticket_detail_icon), null, c0VarR, i12 & com.planner5d.library.engine.input.f.b.B, 16);
            a0Var = a0Var2;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsEmptyScreenKt.TicketsEmptyScreen$lambda$0(emptyState, a0Var, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsEmptyScreen$lambda$0(EmptyState emptyState, a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(emptyState, "$emptyState");
        TicketsEmptyScreen(emptyState, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
