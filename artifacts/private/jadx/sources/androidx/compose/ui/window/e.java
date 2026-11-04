package androidx.compose.ui.window;

import android.view.WindowManager;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(30)
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f42925a = new e();

    private e() {
    }

    @androidx.annotation.u
    public final void a(@NotNull WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsSides(i10);
    }

    @androidx.annotation.u
    public final void b(@NotNull WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsTypes(i10);
    }
}
