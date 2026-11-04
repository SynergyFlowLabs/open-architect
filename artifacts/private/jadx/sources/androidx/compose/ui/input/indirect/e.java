package androidx.compose.ui.input.indirect;

import androidx.compose.ui.a0;
import androidx.compose.ui.p;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    @p
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super c, Boolean> function1) {
        return a0Var.B2(new IndirectTouchInputElement(function1, null));
    }

    @p
    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull Function1<? super c, Boolean> function1) {
        return a0Var.B2(new IndirectTouchInputElement(null, function1));
    }
}
