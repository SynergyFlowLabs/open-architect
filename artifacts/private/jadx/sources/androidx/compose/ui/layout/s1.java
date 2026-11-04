package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, long j10, long j11, @NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        return a0Var.B2(new OnLayoutRectChangedElement(j10, j11, function1));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, long j10, long j11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 64;
        }
        return a(a0Var, j12, j11, function1);
    }

    @NotNull
    public static final androidx.compose.ui.node.j.a c(@NotNull androidx.compose.ui.node.j jVar, long j10, long j11, @NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(jVar);
        return androidx.compose.ui.node.p0.c(l0VarU).getRectManager().s(l0VarU.K(), j10, j11, jVar, function1);
    }
}
