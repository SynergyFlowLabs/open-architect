package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final boolean a(@NotNull MenuItem menuItem, @NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        return q.k(menuItem, navController);
    }
}
