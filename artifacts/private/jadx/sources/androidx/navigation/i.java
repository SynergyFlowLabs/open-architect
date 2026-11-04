package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    @kotlin.l(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.b1(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@NotNull g2 g2Var, @androidx.annotation.d0 int i10, @NotNull Function1<? super h, Unit> function1) {
        j.a(g2Var, i10, function1);
    }

    public static final void b(@NotNull g2 g2Var, @NotNull String str, @NotNull Function1<? super h, Unit> function1) {
        j.b(g2Var, str, function1);
    }
}
