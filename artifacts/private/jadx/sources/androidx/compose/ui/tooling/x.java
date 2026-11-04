package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.w0;
import androidx.compose.ui.text.font.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(26)
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f42644a = new x();

    private x() {
    }

    @NotNull
    public final Typeface a(@NotNull Context context, @NotNull l1 l1Var) {
        return context.getResources().getFont(l1Var.i());
    }
}
