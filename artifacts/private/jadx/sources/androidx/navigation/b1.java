package androidx.navigation;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavControllerKt__NavController_androidKt\n+ 2 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt\n*L\n1#1,1206:1\n48#2:1207\n*S KotlinDebug\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavControllerKt__NavController_androidKt\n*L\n1202#1:1207\n*E\n"})
final /* synthetic */ class b1 {
    @NotNull
    public static final w1 a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new w1(intent.getData(), intent.getAction(), intent.getType());
    }

    @kotlin.l(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 b(@NotNull w0 w0Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 c(w0 w0Var, int i10, int i11, Function1 builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), i10, i11);
        builder.invoke(g2Var);
        return g2Var.d();
    }
}
