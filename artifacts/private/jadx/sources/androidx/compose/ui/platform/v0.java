package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(28)
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f40908a = new v0();

    private v0() {
    }

    @oj.n
    public static final void a(@NotNull ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
