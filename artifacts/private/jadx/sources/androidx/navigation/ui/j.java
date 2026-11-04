package androidx.navigation.ui;

import androidx.navigation.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,39:1\n247#2,10:40\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n*L\n30#1:40,10\n*E\n"})
public final class j {
    public static final boolean a(@NotNull w0 w0Var, @Nullable androidx.customview.widget.c cVar) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        return q.j(w0Var, new d.a(w0Var.M()).d(cVar).c(new e.d(e.a.f71325a)).a());
    }

    public static final boolean b(@NotNull w0 w0Var, @NotNull d appBarConfiguration) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(appBarConfiguration, "appBarConfiguration");
        return q.j(w0Var, appBarConfiguration);
    }
}
