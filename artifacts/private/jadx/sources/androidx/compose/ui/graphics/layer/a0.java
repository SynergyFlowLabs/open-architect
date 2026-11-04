package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.e3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(31)
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f37874a = new a0();

    private a0() {
    }

    public final void a(@NotNull View view, @Nullable e3 e3Var) {
        view.setRenderEffect(e3Var != null ? e3Var.a() : null);
    }
}
