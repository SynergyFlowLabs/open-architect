package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavHost.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.android.kt\nandroidx/navigation/NavHostKt__NavHost_androidKt\n+ 2 NavController.android.kt\nandroidx/navigation/NavControllerKt__NavController_androidKt\n+ 3 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt\n*L\n1#1,38:1\n1202#2:39\n48#3:40\n*S KotlinDebug\n*F\n+ 1 NavHost.android.kt\nandroidx/navigation/NavHostKt__NavHost_androidKt\n*L\n37#1:39\n37#1:40\n*E\n"})
final /* synthetic */ class u2 {
    @kotlin.l(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 a(@NotNull q2 q2Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 b(q2 q2Var, int i10, int i11, Function1 builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }
}
