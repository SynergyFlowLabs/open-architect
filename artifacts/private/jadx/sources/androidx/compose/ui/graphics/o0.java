package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o0 f38083a = new o0();

    private o0() {
    }

    public final void a(@NotNull Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
