package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
class r implements p {
    @Override // androidx.compose.ui.window.p
    public void a(@NotNull WindowManager windowManager, @NotNull View view, @NotNull ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.p
    public void b(@NotNull View view, int i10, int i11) {
    }

    @Override // androidx.compose.ui.window.p
    public void c(@NotNull View view, @NotNull Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }
}
