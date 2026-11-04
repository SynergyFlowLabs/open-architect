package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
class b0 implements c0 {
    @Override // androidx.activity.c0
    public void a(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }

    @Override // androidx.activity.c0
    public void b(@NotNull r0 statusBarStyle, @NotNull r0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
