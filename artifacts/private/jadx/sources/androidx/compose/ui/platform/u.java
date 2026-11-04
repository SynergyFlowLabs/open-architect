package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(23)
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f40898a = new u();

    private u() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(23)
    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
