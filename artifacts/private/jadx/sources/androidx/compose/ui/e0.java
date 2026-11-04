package androidx.compose.ui;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, boolean z10) {
        return a0Var.B2(new SensitiveNodeElement(z10));
    }

    public static /* synthetic */ a0 b(a0 a0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(a0Var, z10);
    }
}
