package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class j2 {
    @kotlin.l(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 a(@NotNull r3 r3Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @kotlin.l(message = "Use routes to build your nested NavGraph instead", replaceWith = @kotlin.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void b(@NotNull g2 g2Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var2 = new g2(g2Var.v(), i10, i11);
        builder.invoke(g2Var2);
        g2Var.u(g2Var2);
    }

    public static /* synthetic */ e2 c(r3 r3Var, int i10, int i11, Function1 builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }
}
