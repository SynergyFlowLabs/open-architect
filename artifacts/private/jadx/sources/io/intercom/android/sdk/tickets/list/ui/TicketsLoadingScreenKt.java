package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketsLoadingScreenKt {
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsLoadingScreen(@Nullable final a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        c0 c0VarR = c0Var.R(2079268510);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            LoadingScreenKt.LoadingScreen(a0Var, R.drawable.intercom_inbox_loading_state, c0VarR, i12 & 14, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsLoadingScreenKt.TicketsLoadingScreen$lambda$0(a0Var, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsLoadingScreen$lambda$0(a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        TicketsLoadingScreen(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketsLoadingScreenPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-880557955);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m562getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketsLoadingScreenKt.TicketsLoadingScreenPreview$lambda$1(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsLoadingScreenPreview$lambda$1(int i10, c0 c0Var, int i11) {
        TicketsLoadingScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
