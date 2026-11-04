package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17569a = 2;

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull u uVar, @NotNull q qVar, boolean z10, @NotNull q3 q3Var) {
        return a0Var.B2(new LazyLayoutBeyondBoundsModifierElement(uVar, qVar, z10, q3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
