package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(35)
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f40950a = new x();

    private x() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(35)
    public final void a(@NotNull View view, boolean z10) {
        if (z10) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
