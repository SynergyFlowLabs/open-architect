package androidx.compose.ui.platform;

import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(26)
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e5 f40435a = new e5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40436b = 0;

    private e5() {
    }

    public final void a(@NotNull AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
