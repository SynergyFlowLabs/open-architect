package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(35)
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y0 f40970a = new y0();

    private y0() {
    }

    @oj.n
    @androidx.annotation.u
    public static final void a(@NotNull View view, float f10) {
        view.setRequestedFrameRate(f10);
    }
}
