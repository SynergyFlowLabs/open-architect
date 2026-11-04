package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 {
    @NotNull
    public static final androidx.compose.ui.node.j.a a(@NotNull androidx.compose.ui.node.j jVar, long j10, long j11, @NotNull Function1<? super androidx.compose.ui.spatial.h, Unit> function1) {
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(jVar);
        return androidx.compose.ui.node.p0.c(l0VarU).getRectManager().r(l0VarU.K(), j10, j11, jVar.w(), function1);
    }
}
