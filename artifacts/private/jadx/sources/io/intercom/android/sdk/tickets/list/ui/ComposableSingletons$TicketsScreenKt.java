package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.material3.os;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TicketsScreenKt {

    @NotNull
    public static final ComposableSingletons$TicketsScreenKt INSTANCE = new ComposableSingletons$TicketsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> f330lambda1 = w.c(-1474046781, false, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsScreenKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            a0 a0VarH = i6.h(d5.t(a0.E, 0.0f, androidx.compose.ui.unit.h.r(16), 1, null), 0.0f, 1, null);
            a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            d0 d0Var = d0.f15956a;
            os.F(null, IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, c0Var, 0, 61);
            c0Var.o();
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit> m563getLambda1$intercom_sdk_base_release() {
        return f330lambda1;
    }
}
