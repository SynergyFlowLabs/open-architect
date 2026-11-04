package androidx.navigation.ui;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n247#2,10:79\n247#2,10:89\n*S KotlinDebug\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n*L\n50#1:79,10\n74#1:89,10\n*E\n"})
public final class c {
    public static final void a(@NotNull androidx.appcompat.app.d dVar, @NotNull w0 navController, @Nullable DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        q.o(dVar, navController, new d.a(navController.M()).d(drawerLayout).c(new e.d(e.a.f71325a)).a());
    }

    public static final void b(@NotNull androidx.appcompat.app.d dVar, @NotNull w0 navController, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        q.o(dVar, navController, configuration);
    }

    public static /* synthetic */ void c(androidx.appcompat.app.d dVar, w0 w0Var, d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar2 = new d.a(w0Var.M()).d(null).c(new e.d(e.a.f71325a)).a();
        }
        b(dVar, w0Var, dVar2);
    }
}
