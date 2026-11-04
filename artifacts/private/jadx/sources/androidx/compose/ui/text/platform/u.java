package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class u extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.b0 f42111a;

    public u(@NotNull androidx.compose.ui.text.b0 b0Var) {
        this.f42111a = b0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        androidx.compose.ui.text.c0 c0VarA = this.f42111a.a();
        if (c0VarA != null) {
            c0VarA.a(this.f42111a);
        }
    }
}
