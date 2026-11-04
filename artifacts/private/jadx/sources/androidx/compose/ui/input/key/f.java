package androidx.compose.ui.input.key;

import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function1<? super c, Boolean> function1) {
        return a0Var.B2(new KeyInputElement(function1, null));
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull Function1<? super c, Boolean> function1) {
        return a0Var.B2(new KeyInputElement(null, function1));
    }
}
