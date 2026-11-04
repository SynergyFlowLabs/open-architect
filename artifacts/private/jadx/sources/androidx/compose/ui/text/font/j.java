package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final v0 a(@NotNull v0.a aVar) {
        return aVar.D();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(@NotNull v0 v0Var, int i10) {
        return b(v0Var.compareTo(a(v0.f41742b)) >= 0, q0.f(i10, q0.f41690b.a()));
    }
}
