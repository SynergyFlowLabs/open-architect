package androidx.compose.ui.window;

import android.view.WindowManager;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f42924a = new d();

    private d() {
    }

    @androidx.annotation.u
    public final void a(@NotNull WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 3;
    }
}
