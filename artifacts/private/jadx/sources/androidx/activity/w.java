package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.w0;
import androidx.core.view.k2;
import androidx.core.view.v3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(23)
final class w extends b0 {
    @Override // androidx.activity.b0, androidx.activity.c0
    @androidx.annotation.u
    public void b(@NotNull r0 statusBarStyle, @NotNull r0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        k2.c(window, false);
        window.setStatusBarColor(statusBarStyle.g(z10));
        window.setNavigationBarColor(navigationBarStyle.d());
        new v3(window, view).i(!z10);
    }
}
