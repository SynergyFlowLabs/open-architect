package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,73:1\n247#2,10:74\n247#2,10:84\n*S KotlinDebug\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n*L\n47#1:74,10\n69#1:84,10\n*E\n"})
public final class u {
    public static final void a(@NotNull Toolbar toolbar, @NotNull w0 navController, @Nullable DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        q.s(toolbar, navController, new d.a(navController.M()).d(drawerLayout).c(new e.d(e.a.f71325a)).a());
    }

    public static final void b(@NotNull Toolbar toolbar, @NotNull w0 navController, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        q.s(toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(Toolbar toolbar, w0 w0Var, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = new d.a(w0Var.M()).d(null).c(new e.d(e.a.f71325a)).a();
        }
        b(toolbar, w0Var, dVar);
    }
}
