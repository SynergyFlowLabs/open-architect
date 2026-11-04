package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.g0(from = 0) long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @Nullable d0 d0Var, @NotNull Function1<? super Boolean, Unit> function1) {
        return a0Var.B2(new OnVisibilityChangedElement(j10, f10, d0Var, function1));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, long j10, float f10, d0 d0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            d0Var = null;
        }
        return a(a0Var, j11, f11, d0Var, function1);
    }
}
