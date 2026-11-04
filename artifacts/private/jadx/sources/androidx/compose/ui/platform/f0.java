package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f40439a = new f0();

    private f0() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(26)
    public final void a(@NotNull View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
