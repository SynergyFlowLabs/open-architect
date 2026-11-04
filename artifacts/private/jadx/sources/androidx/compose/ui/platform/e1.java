package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(30)
final class e1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e1 f40430b = new e1();

    private e1() {
    }

    @Override // androidx.compose.ui.platform.z0
    @NotNull
    public Rect a(@NotNull Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
