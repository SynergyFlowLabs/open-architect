package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(31)
final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s4 f40883a = new s4();

    private s4() {
    }

    public final void a(@NotNull View view, @Nullable androidx.compose.ui.graphics.e3 e3Var) {
        view.setRenderEffect(e3Var != null ? e3Var.a() : null);
    }
}
