package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,79:1\n247#2,10:80\n247#2,10:90\n*S KotlinDebug\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n*L\n51#1:80,10\n75#1:90,10\n*E\n"})
public final class g {
    public static final void a(@NotNull com.google.android.material.appbar.c cVar, @NotNull Toolbar toolbar, @NotNull w0 navController, @Nullable DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        q.v(cVar, toolbar, navController, new d.a(navController.M()).d(drawerLayout).c(new e.d(e.a.f71325a)).a());
    }

    public static final void b(@NotNull com.google.android.material.appbar.c cVar, @NotNull Toolbar toolbar, @NotNull w0 navController, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        q.v(cVar, toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(com.google.android.material.appbar.c cVar, Toolbar toolbar, w0 w0Var, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = new d.a(w0Var.M()).d(null).c(new e.d(e.a.f71325a)).a();
        }
        b(cVar, toolbar, w0Var, dVar);
    }
}
