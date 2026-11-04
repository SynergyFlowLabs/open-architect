package androidx.compose.material3.internal;

import androidx.compose.material3.c7;
import androidx.compose.material3.q50;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProvideContentColorTextStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProvideContentColorTextStyle.kt\nandroidx/compose/material3/internal/ProvideContentColorTextStyleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,47:1\n75#2:48\n*S KotlinDebug\n*F\n+ 1 ProvideContentColorTextStyle.kt\nandroidx/compose/material3/internal/ProvideContentColorTextStyleKt\n*L\n40#1:48\n*E\n"})
public final class k3 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void b(final long j10, @NotNull final androidx.compose.ui.text.y3 y3Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-684938728);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(y3Var) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-684938728, i11, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            androidx.compose.runtime.a1.f(new n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(j10)), q50.I().f(((androidx.compose.ui.text.y3) c0VarR.W(q50.I())).e0(y3Var))}, function2, c0VarR, ((i11 >> 3) & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.j3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k3.c(j10, y3Var, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(long j10, androidx.compose.ui.text.y3 y3Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        b(j10, y3Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
