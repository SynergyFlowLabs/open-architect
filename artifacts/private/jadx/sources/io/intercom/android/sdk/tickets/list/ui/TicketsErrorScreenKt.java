package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketsErrorScreenKt {
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsErrorScreen(@NotNull final ErrorState state, @Nullable final a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        c0 c0VarR = c0Var.R(1763181519);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(state) ? 4 : 2) | i10;
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
            IntercomErrorScreenKt.IntercomErrorScreen(state, a0Var, c0VarR, i12 & okhttp3.internal.ws.g.f334652s, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsErrorScreenKt.TicketsErrorScreen$lambda$0(state, a0Var, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsErrorScreen$lambda$0(ErrorState state, a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        TicketsErrorScreen(state, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsErrorScreenWithCTAPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1833782159);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsErrorScreenKt.INSTANCE.m559getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsErrorScreenKt.TicketsErrorScreenWithCTAPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsErrorScreenWithCTAPreview$lambda$1(int i10, c0 c0Var, int i11) {
        TicketsErrorScreenWithCTAPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsErrorScreenWithoutCTAPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1606879941);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsErrorScreenKt.INSTANCE.m560getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsErrorScreenKt.TicketsErrorScreenWithoutCTAPreview$lambda$2(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsErrorScreenWithoutCTAPreview$lambda$2(int i10, c0 c0Var, int i11) {
        TicketsErrorScreenWithoutCTAPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
