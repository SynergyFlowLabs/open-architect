package androidx.compose.ui.draw;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    @NotNull
    public static final g a(@NotNull Function1<? super i, o> function1) {
        return new h(new i(), function1);
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        return a0Var.B2(new DrawBehindElement(function1));
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super i, o> function1) {
        return a0Var.B2(new DrawWithCacheElement(function1));
    }

    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        return a0Var.B2(new DrawWithContentElement(function1));
    }
}
